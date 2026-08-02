package defpackage;

import com.yandex.go.address.models.PlaceType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class y0m0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlaceType.values().length];
        try {
            iArr[PlaceType.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaceType.WORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlaceType.OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
