package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class qs01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferStatus.values().length];
        try {
            iArr[TransferStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferStatus.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferStatus.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferStatus.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransferStatus.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
