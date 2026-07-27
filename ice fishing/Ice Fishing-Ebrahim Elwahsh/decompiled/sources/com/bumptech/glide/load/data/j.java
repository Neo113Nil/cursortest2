package com.bumptech.glide.load.data;

import B1.y;
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
import t0.AbstractC5051n;
import y1.C5234i;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: n, reason: collision with root package name */
    public final C5234i f23589n;

    /* renamed from: u, reason: collision with root package name */
    public final int f23590u;

    /* renamed from: v, reason: collision with root package name */
    public HttpURLConnection f23591v;

    /* renamed from: w, reason: collision with root package name */
    public InputStream f23592w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f23593x;

    public j(C5234i c5234i, int i) {
        this.f23589n = c5234i;
        this.f23590u = i;
    }

    public static int d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e6) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e6);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f23592w;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f23591v;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f23591v = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f23593x = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, c cVar) {
        C5234i c5234i = this.f23589n;
        int i = N1.j.f1965b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                cVar.g(f(c5234i.d(), 0, null, c5234i.f41837b.b()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + N1.j.a(elapsedRealtimeNanos));
                }
            } catch (IOException e6) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e6);
                }
                cVar.d(e6);
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
            int i4 = this.f23590u;
            httpURLConnection.setConnectTimeout(i4);
            httpURLConnection.setReadTimeout(i4);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f23591v = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f23592w = this.f23591v.getInputStream();
                if (this.f23593x) {
                    return null;
                }
                int d2 = d(this.f23591v);
                int i9 = d2 / 100;
                if (i9 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f23591v;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f23592w = new N1.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f23592w = httpURLConnection2.getInputStream();
                        }
                        return this.f23592w;
                    } catch (IOException e6) {
                        throw new y(d(httpURLConnection2), e6, "Failed to obtain InputStream");
                    }
                }
                if (i9 != 3) {
                    if (d2 == -1) {
                        throw new y(d2, null, "Http request failed");
                    }
                    try {
                        throw new y(d2, null, this.f23591v.getResponseMessage());
                    } catch (IOException e9) {
                        throw new y(d2, e9, "Failed to get a response message");
                    }
                }
                String headerField = this.f23591v.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new y(d2, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e10) {
                    throw new y(d2, e10, AbstractC5051n.f("Bad redirect url: ", headerField));
                }
            } catch (IOException e11) {
                throw new y(d(this.f23591v), e11, "Failed to connect or obtain data");
            }
        } catch (IOException e12) {
            throw new y(0, e12, "URL.openConnection threw");
        }
    }
}
