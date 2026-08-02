package defpackage;

import com.yandex.go.dto.response.FlexScreenType;
import com.yandex.go.dto.response.UnavailabilityAction$Deeplink;
import com.yandex.go.dto.response.UnavailabilityAction$OpenFlexScreenAction;
import com.yandex.go.dto.response.UnavailabilityAction$OpenOrderPopupAction;
import com.yandex.go.dto.response.UnavailabilityAction$OpenSummaryAddress;
import com.yandex.go.dto.response.UnavailabilityActionType;
import com.yandex.go.dto.response.d2;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.router.a;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import com.yandex.go.zone.dto.objects.u2;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class wox0 extends v96 {
    public final a a;
    public final wiq0 b;
    public final xcv0 c;
    public final h3y d;
    public final ru.yandex.taxi.summary.deeplink.a e;
    public final set0 f;
    public final hdu g;

    public wox0(a aVar, wiq0 wiq0Var, xcv0 xcv0Var, h3y h3yVar, ru.yandex.taxi.summary.deeplink.a aVar2, set0 set0Var, hdu hduVar) {
        this.a = aVar;
        this.b = wiq0Var;
        this.c = xcv0Var;
        this.d = h3yVar;
        this.e = aVar2;
        this.f = set0Var;
        this.g = hduVar;
    }

    @Override // defpackage.v96
    public final boolean b() {
        pex0 m = ((k) this.b).m();
        if (m != null) {
            d2 d2Var = m.H;
            if (m.u && d2Var != null) {
                String str = m.D;
                String str2 = m.E;
                String str3 = m.G;
                String str4 = m.b;
                UnavailabilityActionType a = d2Var.a();
                UnavailabilityActionType unavailabilityActionType = UnavailabilityActionType.OPEN_FLEX_SCREEN;
                UnavailabilityAction$OpenFlexScreenAction unavailabilityAction$OpenFlexScreenAction = (a == unavailabilityActionType && (d2Var instanceof UnavailabilityAction$OpenFlexScreenAction)) ? (UnavailabilityAction$OpenFlexScreenAction) d2Var : null;
                this.c.j("tariff_unavailable", str4, str, str2, str3, unavailabilityAction$OpenFlexScreenAction != null ? unavailabilityAction$OpenFlexScreenAction.a : null);
                if (d2Var.a() == UnavailabilityActionType.DEEPLINK) {
                    this.e.a(((UnavailabilityAction$Deeplink) d2Var).a, v770.v, SelectionOrigin.DEEPLINK);
                    return true;
                }
                if (d2Var.a() == UnavailabilityActionType.OPEN_SUMMARY_ADDRESS) {
                    int i = vox0.a[((UnavailabilityAction$OpenSummaryAddress) d2Var).a.ordinal()];
                    set0 set0Var = this.f;
                    if (i == 1) {
                        set0Var.c(SourcePicker.A_FROM_SUMMARY, ModalViewOrigin.SUMMARY);
                        return true;
                    }
                    if (i == 2) {
                        set0Var.b(SourcePicker.B_FROM_SUMMARY, ModalViewOrigin.SUMMARY, true);
                        return true;
                    }
                    if (i != 3) {
                        w511.b();
                        return false;
                    }
                } else {
                    if (d2Var.a() == UnavailabilityActionType.OPEN_ORDER_POPUP) {
                        u2 u2Var = ((UnavailabilityAction$OpenOrderPopupAction) d2Var).a;
                        if (u2Var instanceof BulletsOrderPopup) {
                            ((ru.yandex.taxi.orderpopup.a) this.d.get()).b((BulletsOrderPopup) u2Var);
                            return true;
                        }
                    }
                    if (d2Var.a() == UnavailabilityActionType.OPEN_TARIFF_CARD) {
                        this.a.a(m, SummaryExpandReason.AUTO_UNAVAILABLE_TARIFF_ON_ORDER);
                        return true;
                    }
                    UnavailabilityAction$OpenFlexScreenAction unavailabilityAction$OpenFlexScreenAction2 = (d2Var.a() == unavailabilityActionType && (d2Var instanceof UnavailabilityAction$OpenFlexScreenAction)) ? (UnavailabilityAction$OpenFlexScreenAction) d2Var : null;
                    if (unavailabilityAction$OpenFlexScreenAction2 != null && unavailabilityAction$OpenFlexScreenAction2.b == FlexScreenType.INTERCITY) {
                        String str5 = ((UnavailabilityAction$OpenFlexScreenAction) d2Var).a;
                        hdu hduVar = this.g;
                        hduVar.getClass();
                        ((pep0) ((oep0) hduVar.b)).f((m950) ((yvf0) hduVar.a).get(), new vdw(str5, null), hxx.a);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
