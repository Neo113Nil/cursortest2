package defpackage;

import io.flutter.plugins.camerax.VideoQuality;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class rgg0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VideoQuality.values().length];
        a = iArr;
        try {
            iArr[VideoQuality.SD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[VideoQuality.HD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[VideoQuality.FHD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[VideoQuality.UHD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[VideoQuality.LOWEST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[VideoQuality.HIGHEST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
