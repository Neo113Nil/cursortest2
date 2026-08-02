package defpackage;

import com.yandex.go.address.models.FavoriteAddressDatumType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class xcp {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FavoriteAddressDatumType.values().length];
        try {
            iArr[FavoriteAddressDatumType.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FavoriteAddressDatumType.GEO_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
