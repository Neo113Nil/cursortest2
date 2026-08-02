package defpackage;

import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersView;
import kotlin.collections.builders.SetBuilder;
import ru.yandex.taxi.am.e0;
import ru.yandex.taxi.experiments.addressttl.a;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.map_common.c;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.i;
import ru.yandex.taxi.map_common.map.process.b;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes9.dex */
public final class y500 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ y500(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = 0;
        switch (this.a) {
            case 0:
                return msb1.j((u500) this.b.get());
            case 1:
                return new b600((rqo) this.b.get());
            case 2:
                return new a((rqo) this.b.get());
            case 3:
                return new m800((ra00) this.b.get());
            case 4:
                es20 es20Var = (es20) this.b.get();
                es20Var.getClass();
                SetBuilder setBuilder = new SetBuilder();
                plk plkVar = !es20Var.a.c.b ? null : (plk) es20Var.b.get();
                if (plkVar != null) {
                    setBuilder.add(plkVar);
                }
                SetBuilder b = setBuilder.b();
                q5z.i(b);
                return b;
            case 5:
                final o4w0 o4w0Var = (o4w0) this.b.get();
                o4w0Var.getClass();
                return new t2w0() { // from class: j4w0
                    @Override // defpackage.t2w0
                    public final SuperAppMainScreenOrdersView create() {
                        mag magVar = o4w0.this.h0;
                        if (magVar != null) {
                            return magVar.a();
                        }
                        ny61.g("Required value was null.");
                        return null;
                    }
                };
            case 6:
                return new r900((i6r) this.b.get());
            case 7:
                flex.engine.a engine = ((FeedSdkComponent) this.b.get()).getEngine();
                q5z.i(engine);
                return engine;
            case 8:
                return ((w800) this.b.get()).w;
            case 9:
                return new cot(26, (atx) this.b.get());
            case 10:
                return new na00(i, (mb7) this.b.get());
            case 11:
                return new pa00((jc00) this.b.get());
            case 12:
                return new eb00((atx) this.b.get());
            case 13:
                return new kc00((qmp) this.b.get());
            case 14:
                return new gp50(25, (MainScreenBehavior) this.b.get());
            case 15:
                return new vc00(this.b);
            case 16:
                return new e0((MainUiAvailabilityMonitor) this.b.get());
            case 17:
                return new kf00((pho) this.b.get());
            case 18:
                return new mf00((i6r) this.b.get());
            case 19:
                return new bg00((rs2) this.b.get());
            case 20:
                return new ru.yandex.taxi.map_common.map.intersection.a((b) this.b.get());
            case 21:
                final h3y a = i5m.a(this.b);
                return new rwx0() { // from class: cg00
                    @Override // defpackage.rwx0
                    public final void a(TaxiMapView taxiMapView) {
                        ((c) h3y.this.get()).a(taxiMapView);
                    }
                };
            case 22:
                return new b((tt2) this.b.get());
            case 23:
                return new ru.yandex.taxi.map_common.map.experiment.a((rqo) this.b.get());
            case 24:
                return new vit((rqo) this.b.get());
            case 25:
                return new i(i5m.a(this.b));
            case 26:
                return new ont((rqo) this.b.get(), 1);
            case 27:
                return new cl00(i, i5m.a(this.b));
            case 28:
                return new rl00((ml00) this.b.get());
            default:
                return new yl00((kf00) this.b.get());
        }
    }
}
