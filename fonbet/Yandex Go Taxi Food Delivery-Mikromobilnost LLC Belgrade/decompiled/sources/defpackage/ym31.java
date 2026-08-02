package defpackage;

import io.flutter.plugins.videoplayer.PlatformVideoFormat;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ym31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlatformVideoFormat.values().length];
        a = iArr;
        try {
            iArr[PlatformVideoFormat.SS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[PlatformVideoFormat.DASH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[PlatformVideoFormat.HLS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
