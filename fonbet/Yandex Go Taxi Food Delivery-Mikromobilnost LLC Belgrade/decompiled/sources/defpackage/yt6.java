package defpackage;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.router.a;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.PopupUiControl;
import com.yandex.go.zone.dto.objects.a3;
import com.yandex.go.zone.dto.objects.e3;
import com.yandex.go.zone.dto.objects.j3;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;

/* loaded from: classes6.dex */
public final class yt6 {
    public final y50 a;
    public final a b;
    public final wiq0 c;
    public final set0 d;

    public yt6(y50 y50Var, a aVar, wiq0 wiq0Var, set0 set0Var) {
        this.a = y50Var;
        this.b = aVar;
        this.c = wiq0Var;
        this.d = set0Var;
    }

    public final void a(a3 a3Var) {
        mi31 mi31Var;
        if ((a3Var instanceof e3) || (a3Var instanceof PopupUiControl.CancelOrders)) {
            return;
        }
        if (a3Var instanceof PopupUiControl.Deeplink) {
            ((a60) this.a).c(((PopupUiControl.Deeplink) a3Var).a, v770.c);
            return;
        }
        if (!(a3Var instanceof PopupUiControl.OpenSummaryAddress)) {
            if (!(a3Var instanceof j3)) {
                w511.b();
                return;
            }
            fnx0 n = ((k) this.c).n();
            if (n == null || (mi31Var = n.a) == null) {
                return;
            }
            this.b.a(mi31Var.a, SummaryExpandReason.AUTO_DELIVERY_REDIRECT_ACTION);
            return;
        }
        int i = xt6.a[((PopupUiControl.OpenSummaryAddress) a3Var).a.ordinal()];
        set0 set0Var = this.d;
        if (i == 1) {
            set0Var.c(SourcePicker.A_FROM_SUMMARY, ModalViewOrigin.SUMMARY);
        } else if (i == 2) {
            set0Var.b(SourcePicker.B_FROM_SUMMARY, ModalViewOrigin.SUMMARY, true);
        } else {
            if (i == 3) {
                return;
            }
            w511.b();
        }
    }
}
