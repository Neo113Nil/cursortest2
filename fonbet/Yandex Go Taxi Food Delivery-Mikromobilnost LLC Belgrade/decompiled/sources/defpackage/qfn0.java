package defpackage;

import ru.yandex.taxi.scooters.domain.ScootersDetailedOrderFocusInteractor$FocusType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class qfn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersDetailedOrderFocusInteractor$FocusType.values().length];
        try {
            iArr[ScootersDetailedOrderFocusInteractor$FocusType.FOCUS_ON_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersDetailedOrderFocusInteractor$FocusType.FOCUS_ON_ROUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
