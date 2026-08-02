package defpackage;

import ru.yandex.taxi.masstransit.geopayment.domain.ResponseLoadingState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class wj40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ResponseLoadingState.values().length];
        try {
            iArr[ResponseLoadingState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResponseLoadingState.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResponseLoadingState.LOADED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
