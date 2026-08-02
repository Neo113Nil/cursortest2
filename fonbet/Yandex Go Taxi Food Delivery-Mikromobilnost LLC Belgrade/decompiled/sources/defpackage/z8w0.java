package defpackage;

import ru.yandex.taxi.shortcuts.dto.response.AuthType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class z8w0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AuthType.values().length];
        try {
            iArr[AuthType.OAUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthType.COOKIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
