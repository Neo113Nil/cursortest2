package ru.yandex.taxi.interceptors;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClientErrorsInterceptor$Error.values().length];
        try {
            iArr[ClientErrorsInterceptor$Error.UNAUTHORIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClientErrorsInterceptor$Error.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
