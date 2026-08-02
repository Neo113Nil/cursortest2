package com.bumptech.glide.load;

import u1.AbstractC5064c;

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
    public final boolean f24202n;

    ImageHeaderParser$ImageType(boolean z6) {
        this.f24202n = z6;
    }

    public boolean hasAlpha() {
        return this.f24202n;
    }

    public boolean isWebp() {
        int i = AbstractC5064c.f41004a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
