package defpackage;

import com.ybsdk.core.utils.dto.RequestStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class tk11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequestStatus.values().length];
        try {
            iArr[RequestStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequestStatus.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequestStatus.AUTHENTICATION_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RequestStatus.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
