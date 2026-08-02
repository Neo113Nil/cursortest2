package defpackage;

import ru.yandex.taxi.AutoLoginState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class yan {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoLoginState.values().length];
        try {
            iArr[AutoLoginState.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoLoginState.FAILED_WITHOUT_PASSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
