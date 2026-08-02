package defpackage;

import com.yandex.go.scooters.qr.api.ScootersQrNumberResultSource;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class uko0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersQrNumberResultSource.values().length];
        try {
            iArr[ScootersQrNumberResultSource.QR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersQrNumberResultSource.MANUAL_ENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersQrNumberResultSource.UNAVAILABLE_SCOOTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
