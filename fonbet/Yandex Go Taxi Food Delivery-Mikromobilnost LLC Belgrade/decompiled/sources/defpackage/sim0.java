package defpackage;

import com.yandex.go.payments.sbp.domain.ErrorType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class sim0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ErrorType.values().length];
        try {
            iArr[ErrorType.DEFAULT_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorType.REDIRECTION_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
