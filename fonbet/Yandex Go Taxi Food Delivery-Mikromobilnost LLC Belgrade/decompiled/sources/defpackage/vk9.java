package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardOpenReason;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.chargers.data.a;
import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.domain.b;
import com.yandex.go.chargers.order.active.ChargersActiveOrderModalView;
import com.yandex.go.chargers.order.active.q;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes12.dex */
public final class vk9 extends m230 {
    public final w030 E;
    public final y50 F;
    public final fva0 G;
    public final yvf0 H;
    public final vn9 I;
    public final xma J;
    public final yvf0 K;
    public final ol9 L;
    public final yvf0 M;
    public final yvf0 N;
    public final yvf0 O;
    public final tk9 P;
    public final ok9 Q;
    public final yvf0 R;
    public final yvf0 S;
    public final a T;
    public final yc U;

    public vk9(w030 w030Var, y50 y50Var, fva0 fva0Var, yvf0 yvf0Var, vn9 vn9Var, xma xmaVar, yvf0 yvf0Var2, ol9 ol9Var, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, tk9 tk9Var, ok9 ok9Var, yvf0 yvf0Var6, yvf0 yvf0Var7, a aVar, yc ycVar) {
        super(null);
        this.E = w030Var;
        this.F = y50Var;
        this.G = fva0Var;
        this.H = yvf0Var;
        this.I = vn9Var;
        this.J = xmaVar;
        this.K = yvf0Var2;
        this.L = ol9Var;
        this.M = yvf0Var3;
        this.N = yvf0Var4;
        this.O = yvf0Var5;
        this.P = tk9Var;
        this.Q = ok9Var;
        this.R = yvf0Var6;
        this.S = yvf0Var7;
        this.T = aVar;
        this.U = ycVar;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void G(Object obj) {
        Object value;
        qk9 qk9Var = (qk9) obj;
        super.G(qk9Var);
        vn9 vn9Var = this.I;
        vn9Var.b();
        r0 r0Var = vn9Var.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, wn9.a((wn9) value, false, false, false, false, false, 27)));
        String str = qk9Var.a;
        r0 r0Var2 = this.L.a;
        r0Var2.getClass();
        r0Var2.m(null, str);
    }

    @Override // defpackage.m230, defpackage.h55
    public final void H(Object obj) {
        super.H((qk9) obj);
        this.L.a.l(null);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.I.c();
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
    /* JADX WARN: Type inference failed for: r2v2, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.chargers.order.active.ChargersActiveOrderRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        qk9 qk9Var = (qk9) obj;
        final String key = ChargersPerfEvent.ACTIVE_ORDERS_CARD.getKey();
        fva0.f(this.G, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
        String str = qk9Var.a;
        ChargersAnalytics$ChargersActiveOrderCardOpenReason chargersAnalytics$ChargersActiveOrderCardOpenReason = qk9Var.b;
        md6 md6Var = new md6((Object) this, (Object) qk9Var, false, 21);
        w3i w3iVar = this.P.a;
        q qVar = new q((em9) ((xvf0) w3iVar.b).get(), (nna) ((xvf0) w3iVar.c).get(), (b) ((xvf0) w3iVar.w).get(), (ol9) ((xvf0) w3iVar.x).get(), (cyx) ((xvf0) w3iVar.y).get(), (e) ((xvf0) w3iVar.z).get(), (xvf0) w3iVar.A, (il9) ((nt0) w3iVar.B).get(), str, chargersAnalytics$ChargersActiveOrderCardOpenReason, md6Var);
        w3i w3iVar2 = this.Q.a;
        final ChargersActiveOrderModalView chargersActiveOrderModalView = new ChargersActiveOrderModalView((Context) ((xvf0) w3iVar2.b).get(), (ytz) ((pxf) w3iVar2.c).get(), (gei0) ((qxf) w3iVar2.w).get(), (pav) ((xvf0) w3iVar2.x).get(), (ah00) ((xvf0) w3iVar2.y).get(), (a3v) ((xvf0) w3iVar2.z).get(), (nna) ((xvf0) w3iVar2.A).get(), (xx9) ((xvf0) w3iVar2.B).get(), qVar);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.chargers.order.active.ChargersActiveOrderRouter$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = chargersActiveOrderModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(key);
                }
                View view = chargersActiveOrderModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r2;
        chargersActiveOrderModalView.addOnAttachStateChangeListener(r2);
        return chargersActiveOrderModalView;
    }
}
