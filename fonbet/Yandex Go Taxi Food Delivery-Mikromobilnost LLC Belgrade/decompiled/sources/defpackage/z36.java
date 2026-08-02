package defpackage;

import android.app.Activity;
import com.yandex.go.safety.center.safetycenter_web.b;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class z36 implements upc {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ z36(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 1:
                ((uva) this.b).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.upc
    public final void b1() {
        UiWebViewConfig uiWebViewConfig;
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                a46 a46Var = (a46) h55Var;
                UiWebViewConfig a = ((gn10) ((h3y) a46Var.M).get()).a(null, true);
                if (a != null) {
                    a.setAnimateOnAppearing(false);
                    a.setAnimateOnDisappearing(false);
                    uiWebViewConfig = a;
                } else {
                    uiWebViewConfig = null;
                }
                if (uiWebViewConfig != null) {
                    ((MapNotificationsMuteRepository) a46Var.N).a();
                    a46Var.A(((gf41) a46Var.L).a().b(), new dg41(uiWebViewConfig, null, null, null, null, null, null, 254), new bb0(a46Var, 12));
                    break;
                }
                break;
            case 1:
                uva uvaVar = (uva) h55Var;
                uvaVar.r(new qu(9));
                ((sls) uvaVar.F).invoke();
                break;
            default:
                b bVar = (b) h55Var;
                ((h15) bVar.K.get()).a((Activity) bVar.J.get());
                break;
        }
    }
}
