package io.flutter.plugins.imagepicker;

import io.flutter.plugins.imagepicker.Messages;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Messages.SourceType.values().length];
        b = iArr;
        try {
            iArr[Messages.SourceType.GALLERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[Messages.SourceType.CAMERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[Messages.SourceCamera.values().length];
        a = iArr2;
        try {
            iArr2[Messages.SourceCamera.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[Messages.SourceCamera.REAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
