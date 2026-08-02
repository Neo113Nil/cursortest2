package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HttpUrlFetcher implements DataFetcher {
    public final GlideUrl glideUrl;
    public volatile boolean isCancelled;
    public InputStream stream;
    public final int timeout;
    public HttpURLConnection urlConnection;

    public HttpUrlFetcher(GlideUrl glideUrl, int i) {
        this.glideUrl = glideUrl;
        this.timeout = i;
    }

    public static int getHttpStatusCodeOrInvalid(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        this.isCancelled = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        InputStream inputStream = this.stream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.urlConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.urlConnection = null;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final int getDataSource() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
        GlideUrl glideUrl = this.glideUrl;
        int i = LogTime.$r8$clinit;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dataCallback.onDataReady(loadDataWithRedirects(glideUrl.toURL(), 0, null, glideUrl.headers.getHeaders()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(elapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                dataCallback.onLoadFailed(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(elapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream loadDataWithRedirects(URL url, int i, URL url2, Map map) {
        if (i >= 5) {
            throw new HttpException(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.timeout;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.urlConnection = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.stream = this.urlConnection.getInputStream();
                if (this.isCancelled) {
                    return null;
                }
                int httpStatusCodeOrInvalid = getHttpStatusCodeOrInvalid(this.urlConnection);
                int i3 = httpStatusCodeOrInvalid / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.urlConnection;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.stream = new ContentLengthInputStream(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.stream = httpURLConnection2.getInputStream();
                        }
                        return this.stream;
                    } catch (IOException e) {
                        throw new HttpException(getHttpStatusCodeOrInvalid(httpURLConnection2), e, "Failed to obtain InputStream");
                    }
                }
                if (i3 != 3) {
                    if (httpStatusCodeOrInvalid == -1) {
                        throw new HttpException(httpStatusCodeOrInvalid, null, "Http request failed");
                    }
                    try {
                        throw new HttpException(httpStatusCodeOrInvalid, null, this.urlConnection.getResponseMessage());
                    } catch (IOException e2) {
                        throw new HttpException(httpStatusCodeOrInvalid, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.urlConnection.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(httpStatusCodeOrInvalid, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    cleanup();
                    return loadDataWithRedirects(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(httpStatusCodeOrInvalid, e3, Recorder$$ExternalSyntheticOutline2.m("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                throw new HttpException(getHttpStatusCodeOrInvalid(this.urlConnection), e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new HttpException(0, e5, "URL.openConnection threw");
        }
    }
}
