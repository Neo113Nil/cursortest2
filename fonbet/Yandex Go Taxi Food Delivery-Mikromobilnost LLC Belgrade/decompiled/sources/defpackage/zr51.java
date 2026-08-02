package defpackage;

import com.ybsdk.feature.transfer.version2.api.TransferDirection;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class zr51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferDirection.values().length];
        try {
            iArr[TransferDirection.TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferDirection.TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
