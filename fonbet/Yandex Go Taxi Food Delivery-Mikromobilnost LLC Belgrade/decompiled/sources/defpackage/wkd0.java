package defpackage;

import ru.yandex.taxi.plus.sdk.Environment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class wkd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Environment.values().length];
        try {
            iArr[Environment.TESTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Environment.PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
