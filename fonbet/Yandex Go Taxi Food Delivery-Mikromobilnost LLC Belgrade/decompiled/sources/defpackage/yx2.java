package defpackage;

import ru.yandex.taxi.perf.AppStartupInfoType;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class yx2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AppStartupInfoType.values().length];
        try {
            iArr[AppStartupInfoType.Cold.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppStartupInfoType.Abandoned.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AppStartupInfoType.Warm.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AppStartupInfoType.Hot.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
