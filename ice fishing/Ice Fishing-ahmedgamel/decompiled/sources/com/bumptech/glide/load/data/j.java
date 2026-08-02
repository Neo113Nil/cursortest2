package com.bumptech.glide.load.data;

import D1.y;
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
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: n, reason: collision with root package name */
    public final A1.m f24220n;

    /* renamed from: u, reason: collision with root package name */
    public final int f24221u;

    /* renamed from: v, reason: collision with root package name */
    public HttpURLConnection f24222v;

    /* renamed from: w, reason: collision with root package name */
    public InputStream f24223w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f24224x;

    public j(A1.m mVar, int i) {
        this.f24220n = mVar;
        this.f24221u = i;
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
        InputStream inputStream = this.f24223w;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f24222v;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f24222v = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f24224x = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, c cVar) {
        A1.m mVar = this.f24220n;
        int i = P1.j.f2365b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                cVar.f(f(mVar.d(), 0, null, mVar.f68b.b()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + P1.j.a(elapsedRealtimeNanos));
                }
            } catch (IOException e9) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e9);
                }
                cVar.c(e9);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + P1.j.a(elapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + P1.j.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i, URL url2, Map map) {
        if (i >= 5) {
            throw new y(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new y(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i4 = this.f24221u;
            httpURLConnection.setConnectTimeout(i4);
            httpURLConnection.setReadTimeout(i4);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f24222v = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f24223w = this.f24222v.getInputStream();
                if (this.f24224x) {
                    return null;
                }
                int c9 = c(this.f24222v);
                int i6 = c9 / 100;
                if (i6 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f24222v;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f24223w = new P1.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f24223w = httpURLConnection2.getInputStream();
                        }
                        return this.f24223w;
                    } catch (IOException e9) {
                        throw new y(c(httpURLConnection2), e9, "Failed to obtain InputStream");
                    }
                }
                if (i6 != 3) {
                    if (c9 == -1) {
                        throw new y(c9, null, "Http request failed");
                    }
                    try {
                        throw new y(c9, null, this.f24222v.getResponseMessage());
                    } catch (IOException e10) {
                        throw new y(c9, e10, "Failed to get a response message");
                    }
                }
                String headerField = this.f24222v.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new y(c9, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e11) {
                    throw new y(c9, e11, AbstractC5128c.f("Bad redirect url: ", headerField));
                }
            } catch (IOException e12) {
                throw new y(c(this.f24222v), e12, "Failed to connect or obtain data");
            }
        } catch (IOException e13) {
            throw new y(0, e13, "URL.openConnection threw");
        }
    }
}
