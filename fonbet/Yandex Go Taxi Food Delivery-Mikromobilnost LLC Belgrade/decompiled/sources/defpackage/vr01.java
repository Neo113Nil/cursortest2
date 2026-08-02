package defpackage;

import com.ybsdk.feature.transfer.internal.network.dto.transfer.TransferResult;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.TransferResultWithId;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class vr01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransferResult.Status.values().length];
        try {
            iArr[TransferResult.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferResult.Status.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferResult.Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[TransferResultWithId.Status.values().length];
        try {
            iArr2[TransferResultWithId.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TransferResultWithId.Status.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TransferResultWithId.Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
