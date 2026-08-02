package defpackage;

import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferStatusDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class v910 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferStatusDto.values().length];
        try {
            iArr[TransferStatusDto.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferStatusDto.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferStatusDto.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferStatusDto.ACCEPTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransferStatusDto.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TransferStatusDto.AWAITING_APPROVAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
