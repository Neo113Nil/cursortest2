package io.flutter.plugins.videoplayer;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VideoAsset$StreamingFormat.values().length];
        a = iArr;
        try {
            iArr[VideoAsset$StreamingFormat.SMOOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[VideoAsset$StreamingFormat.DYNAMIC_ADAPTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[VideoAsset$StreamingFormat.HTTP_LIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
