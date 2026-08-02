package defpackage;

import com.yandex.go.captcha.api.AuthChallengeResult;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ri3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AuthChallengeResult.values().length];
        try {
            iArr[AuthChallengeResult.Success.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthChallengeResult.Failure.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AuthChallengeResult.AlreadyDone.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
