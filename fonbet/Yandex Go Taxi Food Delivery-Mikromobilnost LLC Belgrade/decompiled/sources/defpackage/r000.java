package defpackage;

import ru.yandex.taxi.maas.api.deeplink.MaasMode;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class r000 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MaasMode.values().length];
        try {
            iArr[MaasMode.ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MaasMode.TO_METRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MaasMode.FROM_METRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MaasMode.ROUTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
