package com.bumptech.glide;

import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24231a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f24232b;

    static {
        int[] iArr = new int[j.values().length];
        f24232b = iArr;
        try {
            iArr[3] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f24232b[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f24232b[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f24232b[0] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        f24231a = iArr2;
        try {
            iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f24231a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f24231a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f24231a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f24231a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f24231a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f24231a[ImageView.ScaleType.CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f24231a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
