package defpackage;

import android.content.Context;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.ui.TariffPopupModalView;
import com.yandex.go.zone.dto.objects.Notification;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.f;

/* loaded from: classes6.dex */
public final class r7t0 implements hnx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r7t0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(pex0 pex0Var) {
    }

    @Override // defpackage.hnx0
    public final void u0(sgx0 sgx0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((SolidSummaryView) obj).tryExpandToPager(SummaryExpandReason.SELECTOR_TAP);
                break;
            default:
                ((f) obj).m0.i(sgx0Var.a);
                break;
        }
    }

    @Override // defpackage.hnx0
    public final void v0(pex0 pex0Var) {
        boolean isOpened;
        p7t0 p7t0Var;
        i130 i130Var;
        i130 i130Var2;
        orx0 orx0Var;
        switch (this.a) {
            case 0:
                SolidSummaryView solidSummaryView = (SolidSummaryView) this.b;
                if (solidSummaryView.isEnabled()) {
                    isOpened = solidSummaryView.isOpened();
                    if (isOpened) {
                        p7t0Var = solidSummaryView.innerMvpView;
                        SolidSummaryView solidSummaryView2 = p7t0Var.a;
                        i130Var = solidSummaryView2.modalViewCoordinatorProvider;
                        if (((TariffPopupModalView) i130Var.a().i(TariffPopupModalView.class)) == null) {
                            blx0 blx0Var = TariffPopupModalView.Companion;
                            Context context = solidSummaryView2.getContext();
                            Notification notification = (Notification) pex0Var.p0.get("antisurge_clarification");
                            blx0Var.getClass();
                            TariffPopupModalView a = blx0.a(context, notification, "antisurge_clarification");
                            if (a != null) {
                                i130Var2 = solidSummaryView2.modalViewCoordinatorProvider;
                                i130Var2.a().s(a, true);
                                orx0Var = solidSummaryView2.promoManager;
                                ((xqe) orx0Var).a.b(xqe.a(pex0Var.b, "antisurge_clarification"));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
