package com.bumptech.glide.load.data;

import B1.z;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import y1.C5213h;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: n, reason: collision with root package name */
    public final C5213h f23433n;

    /* renamed from: u, reason: collision with root package name */
    public final int f23434u;

    /* renamed from: v, reason: collision with root package name */
    public HttpURLConnection f23435v;

    /* renamed from: w, reason: collision with root package name */
    public InputStream f23436w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f23437x;

    public j(C5213h c5213h, int i) {
        this.f23433n = c5213h;
        this.f23434u = i;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e9) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e9);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f23436w;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f23435v;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f23435v = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f23437x = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, c cVar) {
        C5213h c5213h = this.f23433n;
        int i = N1.j.f1921b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                cVar.f(f(c5213h.d(), 0, null, c5213h.f41797b.b()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + N1.j.a(elapsedRealtimeNanos));
                }
            } catch (IOException e9) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e9);
                }
                cVar.c(e9);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + N1.j.a(elapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + N1.j.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i, URL url2, Map map) {
        if (i >= 5) {
            throw new z(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new z(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i6 = this.f23434u;
            httpURLConnection.setConnectTimeout(i6);
            httpURLConnection.setReadTimeout(i6);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f23435v = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f23436w = this.f23435v.getInputStream();
                if (this.f23437x) {
                    return null;
                }
                int c9 = c(this.f23435v);
                int i9 = c9 / 100;
                if (i9 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f23435v;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f23436w = new N1.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f23436w = httpURLConnection2.getInputStream();
                        }
                        return this.f23436w;
                    } catch (IOException e9) {
                        throw new z(c(httpURLConnection2), e9, "Failed to obtain InputStream");
                    }
                }
                if (i9 != 3) {
                    if (c9 == -1) {
                        throw new z(c9, null, "Http request failed");
                    }
                    try {
                        throw new z(c9, null, this.f23435v.getResponseMessage());
                    } catch (IOException e10) {
                        throw new z(c9, e10, "Failed to get a response message");
                    }
                }
                String headerField = this.f23435v.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new z(c9, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e11) {
                    throw new z(c9, e11, u1.h.f("Bad redirect url: ", headerField));
                }
            } catch (IOException e12) {
                throw new z(c(this.f23435v), e12, "Failed to connect or obtain data");
            }
        } catch (IOException e13) {
            throw new z(0, e13, "URL.openConnection threw");
        }
    }
}
