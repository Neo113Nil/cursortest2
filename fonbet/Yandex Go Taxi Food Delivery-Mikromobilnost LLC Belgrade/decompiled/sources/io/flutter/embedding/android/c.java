package io.flutter.embedding.android;

import io.flutter.embedding.android.FlutterImageView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FlutterImageView.SurfaceKind.values().length];
        a = iArr;
        try {
            iArr[FlutterImageView.SurfaceKind.background.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[FlutterImageView.SurfaceKind.overlay.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
