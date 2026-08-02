package defpackage;

import ru.yandex.taxi.plaque.api.dependencies.PlaqueEnvironment;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class u8o {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlaqueEnvironment.values().length];
        try {
            iArr[PlaqueEnvironment.TESTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaqueEnvironment.PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
