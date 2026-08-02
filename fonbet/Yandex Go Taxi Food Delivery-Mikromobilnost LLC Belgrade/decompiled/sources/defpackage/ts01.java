package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import com.ybsdk.core.transfer.utils.domain.entities.TransferType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class ts01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

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
        int[] iArr2 = new int[TransferType.values().length];
        try {
            iArr2[TransferType.C2C.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TransferType.ME2ME.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
