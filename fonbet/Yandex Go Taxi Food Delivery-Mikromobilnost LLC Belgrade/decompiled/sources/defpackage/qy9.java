package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.chargers.error.ChargersErrorModalView;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes12.dex */
public final class qy9 extends m230 {
    public final w030 E;
    public final fva0 F;
    public final gy9 G;
    public final oy9 H;

    public qy9(w030 w030Var, fva0 fva0Var, gy9 gy9Var, oy9 oy9Var) {
        super(null);
        this.E = w030Var;
        this.F = fva0Var;
        this.G = gy9Var;
        this.H = oy9Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.chargers.error.ChargersErrorRouterImpl$provideModalView-G_nDuRk$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        cy9 cy9Var = ((ly9) obj).a;
        final String key = ChargersPerfEvent.ERROR.getKey();
        fva0.f(this.F, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
        hh5 hh5Var = new hh5(25, this);
        c06 c06Var = this.H.a;
        ny9 ny9Var = new ny9((em9) ((xvf0) c06Var.a).get(), (sk7) ((kj7) c06Var.b).get(), cy9Var, hh5Var);
        zz7 zz7Var = this.G.a;
        final ChargersErrorModalView chargersErrorModalView = new ChargersErrorModalView((Context) zz7Var.a.get(), ny9Var, (pya) zz7Var.b.get());
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r8 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.chargers.error.ChargersErrorRouterImpl$provideModalView-G_nDuRk$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = chargersErrorModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(key);
                }
                View view = chargersErrorModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r8;
        chargersErrorModalView.addOnAttachStateChangeListener(r8);
        return chargersErrorModalView;
    }
}
