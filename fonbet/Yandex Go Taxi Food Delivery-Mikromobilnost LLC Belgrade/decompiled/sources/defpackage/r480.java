package defpackage;

import com.yandex.go.taxi.order.promotions.model.TaxiOrderPopupModalBehaviourType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class r480 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiOrderPopupModalBehaviourType.values().length];
        try {
            iArr[TaxiOrderPopupModalBehaviourType.TAXI_SEARCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiOrderPopupModalBehaviourType.RIDE_AUTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
