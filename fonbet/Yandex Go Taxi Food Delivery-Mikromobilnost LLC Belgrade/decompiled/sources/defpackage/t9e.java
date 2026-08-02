package defpackage;

import com.yandex.messaging.core.net.entities.ContactCheckHashStatus;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class t9e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ContactCheckHashStatus.values().length];
        try {
            iArr[ContactCheckHashStatus.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContactCheckHashStatus.FailedVersion.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContactCheckHashStatus.FailedHash.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
