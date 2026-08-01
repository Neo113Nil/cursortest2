package com.bumptech.glide.load;

import s1.AbstractC4968c;

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
    public final boolean f23415n;

    ImageHeaderParser$ImageType(boolean z3) {
        this.f23415n = z3;
    }

    public boolean hasAlpha() {
        return this.f23415n;
    }

    public boolean isWebp() {
        int i = AbstractC4968c.f40450a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
