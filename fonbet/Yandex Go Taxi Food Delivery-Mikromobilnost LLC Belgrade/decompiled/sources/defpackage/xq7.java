package defpackage;

import com.ybsdk.feature.kyc.internal.screens.photo.helpers.CameraLens;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class xq7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CameraLens.values().length];
        try {
            iArr[CameraLens.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CameraLens.FRONT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
