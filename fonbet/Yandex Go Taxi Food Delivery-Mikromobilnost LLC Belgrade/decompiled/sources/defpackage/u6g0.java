package defpackage;

import com.ybsdk.feature.qr.internal.screens.container.QrContainerItem;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class u6g0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QrContainerItem.values().length];
        try {
            iArr[QrContainerItem.NFC_SCAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrContainerItem.QR_SCAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QrContainerItem.QR_GENERATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
