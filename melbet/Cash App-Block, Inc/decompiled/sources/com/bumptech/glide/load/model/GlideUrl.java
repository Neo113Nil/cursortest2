package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class GlideUrl implements Key {
    public volatile byte[] cacheKeyBytes;
    public int hashCode;
    public final Headers headers;
    public String safeStringUrl;
    public URL safeUrl;
    public final String stringUrl;
    public final URL url;

    public GlideUrl(String str) {
        LazyHeaders lazyHeaders = Headers.DEFAULT;
        this.url = null;
        if (TextUtils.isEmpty(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Must not be null or empty");
            throw null;
        }
        this.stringUrl = str;
        Util.checkNotNull(lazyHeaders, "Argument must not be null");
        this.headers = lazyHeaders;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof GlideUrl) {
            GlideUrl glideUrl = (GlideUrl) obj;
            if (getCacheKey().equals(glideUrl.getCacheKey()) && this.headers.equals(glideUrl.headers)) {
                return true;
            }
        }
        return false;
    }

    public final String getCacheKey() {
        String str = this.stringUrl;
        if (str != null) {
            return str;
        }
        URL url = this.url;
        Util.checkNotNull(url, "Argument must not be null");
        return url.toString();
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        if (this.hashCode == 0) {
            int hashCode = getCacheKey().hashCode();
            this.hashCode = hashCode;
            this.hashCode = this.headers.hashCode() + (hashCode * 31);
        }
        return this.hashCode;
    }

    public final String toString() {
        return getCacheKey();
    }

    public final URL toURL() {
        if (this.safeUrl == null) {
            if (TextUtils.isEmpty(this.safeStringUrl)) {
                String str = this.stringUrl;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.url;
                    Util.checkNotNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.safeStringUrl = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.safeUrl = new URL(this.safeStringUrl);
        }
        return this.safeUrl;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        if (this.cacheKeyBytes == null) {
            this.cacheKeyBytes = getCacheKey().getBytes(Key.CHARSET);
        }
        messageDigest.update(this.cacheKeyBytes);
    }

    public GlideUrl(URL url) {
        LazyHeaders lazyHeaders = Headers.DEFAULT;
        Util.checkNotNull(url, "Argument must not be null");
        this.url = url;
        this.stringUrl = null;
        Util.checkNotNull(lazyHeaders, "Argument must not be null");
        this.headers = lazyHeaders;
    }
}
