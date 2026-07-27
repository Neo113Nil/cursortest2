package com.bumptech.glide.load;

import s1.AbstractC4990c;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* renamed from: n, reason: collision with root package name */
    public final boolean f23571n;

    ImageHeaderParser$ImageType(boolean z8) {
        this.f23571n = z8;
    }

    public boolean hasAlpha() {
        return this.f23571n;
    }

    public boolean isWebp() {
        int i = AbstractC4990c.f40419a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
