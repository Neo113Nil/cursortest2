package defpackage;

import com.yandex.go.scooters.domain.ScootersOfferCardFocusInteractor$FocusType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class q2o0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersOfferCardFocusInteractor$FocusType.values().length];
        try {
            iArr[ScootersOfferCardFocusInteractor$FocusType.FOCUS_ON_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersOfferCardFocusInteractor$FocusType.FOCUS_ON_ROUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
