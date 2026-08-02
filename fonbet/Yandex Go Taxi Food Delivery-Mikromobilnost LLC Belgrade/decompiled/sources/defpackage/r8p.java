package defpackage;

import androidx.window.core.VerificationMode;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class r8p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VerificationMode.values().length];
        try {
            iArr[VerificationMode.STRICT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerificationMode.LOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VerificationMode.QUIET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
