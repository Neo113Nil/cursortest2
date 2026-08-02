package defpackage;

import android.view.View;
import com.yandex.go.something_wrong_screen.experiment.SomethingWrongScreenExperiment;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.i;

/* loaded from: classes6.dex */
public final /* synthetic */ class xw70 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ xw70(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        i iVar = this.b;
        switch (i) {
            case 0:
                DriveState driveState = (DriveState) obj;
                if (driveState == DriveState.TRANSPORTING) {
                    s8t0 s8t0Var = iVar.g0;
                    l8t0 l8t0Var = s8t0Var.b;
                    if (((SomethingWrongScreenExperiment) l8t0Var.a.a.a().b()).b && ((SomethingWrongScreenExperiment) l8t0Var.a.a.a().b()).f.a && !s8t0Var.a.d.g("OnboardingState", false)) {
                        ((ww70) iVar.Dg()).Ma();
                    }
                }
                OrderScreen b = iVar.M.b();
                View findViewById = ((ww70) iVar.Dg()).findViewById(p8h0.ride_card_modal_view);
                if (b == OrderScreen.ORDER_TRACKING || (findViewById != null && b == OrderScreen.ORDER_DETAILS)) {
                    iVar.Vg(driveState);
                    break;
                }
                break;
            default:
                o2y0 o2y0Var = (o2y0) obj;
                if (o2y0Var != null && o2y0Var == iVar.y0) {
                    iVar.Tg(o2y0Var);
                    iVar.Ug();
                    break;
                } else {
                    iVar.Sg(o2y0Var);
                    break;
                }
        }
        return zy11Var;
    }
}
