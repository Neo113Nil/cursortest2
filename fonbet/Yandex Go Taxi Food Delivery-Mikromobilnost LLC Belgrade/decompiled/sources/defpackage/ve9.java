package defpackage;

import com.ybsdk.common.entities.ChangePhoneApplicationStatusEntity$Status;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ve9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangePhoneApplicationStatusEntity$Status.values().length];
        try {
            iArr[ChangePhoneApplicationStatusEntity$Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangePhoneApplicationStatusEntity$Status.READY_FOR_CONFIRMATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChangePhoneApplicationStatusEntity$Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChangePhoneApplicationStatusEntity$Status.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChangePhoneApplicationStatusEntity$Status.PROCESSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChangePhoneApplicationStatusEntity$Status.SMS_VERIFIED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
