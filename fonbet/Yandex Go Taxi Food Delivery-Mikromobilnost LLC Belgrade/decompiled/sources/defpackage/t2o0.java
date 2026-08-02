package defpackage;

import com.yandex.go.scooters.domain.ScootersOfferCardFocusInteractor$FocusType;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class t2o0 {
    public final r0 a = bvf0.c(ScootersOfferCardFocusInteractor$FocusType.FOCUS_ON_ROUTE);

    public final void a(ScootersOfferCardFocusInteractor$FocusType scootersOfferCardFocusInteractor$FocusType) {
        r0 r0Var = this.a;
        if (((ScootersOfferCardFocusInteractor$FocusType) r0Var.getValue()) == scootersOfferCardFocusInteractor$FocusType) {
            return;
        }
        r0Var.l(scootersOfferCardFocusInteractor$FocusType);
    }
}
