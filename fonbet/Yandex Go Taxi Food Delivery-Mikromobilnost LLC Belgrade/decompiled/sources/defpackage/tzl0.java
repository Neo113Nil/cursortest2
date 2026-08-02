package defpackage;

import ru.yandex.taxi.favorites.rides.save_modal.dto.ResponseState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class tzl0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ResponseState.values().length];
        try {
            iArr[ResponseState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResponseState.LOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResponseState.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
