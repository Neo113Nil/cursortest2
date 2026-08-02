package defpackage;

import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class qb2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AndroidLocationProviderType.values().length];
        try {
            iArr[AndroidLocationProviderType.FUSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
