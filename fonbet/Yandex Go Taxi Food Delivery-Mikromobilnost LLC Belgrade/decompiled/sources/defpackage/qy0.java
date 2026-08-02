package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.ads.prefetch.impl.d;
import com.yandex.go.antirobot.experiment.b;
import ru.yandex.taxi.altpins.order.f;
import ru.yandex.taxi.banners.model.g;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.credentials.e;
import ru.yandex.taxi.design.utils.a;

/* loaded from: classes10.dex */
public final class qy0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ qy0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ddf(10, (ny0) xvf0Var.get());
            case 1:
                return new rz0((rqo) xvf0Var.get(), 0);
            case 2:
                return new e41((wnt) xvf0Var.get(), 0);
            case 3:
                return new t61((pho) xvf0Var.get());
            case 4:
                return new oa1((lx4) xvf0Var.get());
            case 5:
                return new mb1((e) xvf0Var.get());
            case 6:
                return new d((cvx) xvf0Var.get());
            case 7:
                return new uj1((Activity) xvf0Var.get());
            case 8:
                return new gp50(2, (uj1) xvf0Var.get());
            case 9:
                return new sm1((x22) xvf0Var.get());
            case 10:
                return new uq1((Activity) xvf0Var.get());
            case 11:
                return new cu1((rqo) xvf0Var.get(), 0);
            case 12:
                return new bv1((pho) xvf0Var.get());
            case 13:
                return new fy1((ck31) xvf0Var.get());
            case 14:
                return new t61((pho) xvf0Var.get());
            case 15:
                return new f((on2) xvf0Var.get());
            case 16:
                return new a02((pwy0) xvf0Var.get(), 0);
            case 17:
                return new o22((qoy) xvf0Var.get());
            case 18:
                return new a32((zz2) xvf0Var.get());
            case 19:
                return new gp50(3, (rqo) xvf0Var.get());
            case 20:
                return new pj((pho) xvf0Var.get());
            case 21:
                return new hl2((pho) xvf0Var.get());
            case 22:
                return new b((rqo) xvf0Var.get());
            case 23:
                return new fkh(((Context) xvf0Var.get()).getSharedPreferences("antirobot_prefs", 0));
            case 24:
                return new ryh(19, (b220) xvf0Var.get());
            case 25:
                return new dp2((a) xvf0Var.get());
            case 26:
                g gVar = (g) ((iu4) xvf0Var.get()).H.getValue();
                q5z.i(gVar);
                return gVar;
            case 27:
                return new ru.yandex.taxi.widget.d(new gp50(4, (ru.yandex.taxi.communications.common.repository.a) xvf0Var.get()));
            case 28:
                h b = ((iu4) xvf0Var.get()).b();
                q5z.i(b);
                return b;
            default:
                return new lq2((bg5) xvf0Var.get());
        }
    }
}
