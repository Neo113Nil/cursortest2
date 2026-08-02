package defpackage;

import ru.yandex.taxi.am.AuthType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class zn3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AuthType.values().length];
        try {
            iArr[AuthType.COOKIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthType.OAUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
