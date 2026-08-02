package defpackage;

import ru.yandex.taxi.superapp.address.OrderAddressViewModel$State;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class t980 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderAddressViewModel$State.values().length];
        try {
            iArr[OrderAddressViewModel$State.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderAddressViewModel$State.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
