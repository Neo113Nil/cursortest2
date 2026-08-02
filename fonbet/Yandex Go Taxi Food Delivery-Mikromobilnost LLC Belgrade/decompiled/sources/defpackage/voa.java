package defpackage;

import com.yandex.go.chargers.qr.data.model.ChargersQrMode;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class voa {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersQrMode.values().length];
        try {
            iArr[ChargersQrMode.QR_SCAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersQrMode.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
