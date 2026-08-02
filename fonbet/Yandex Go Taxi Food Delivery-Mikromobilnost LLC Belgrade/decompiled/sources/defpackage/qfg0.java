package defpackage;

import com.ybsdk.feature.qr.payments.api.QrSource;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class qfg0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QrSource.values().length];
        try {
            iArr[QrSource.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrSource.LINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QrSource.CAMERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
