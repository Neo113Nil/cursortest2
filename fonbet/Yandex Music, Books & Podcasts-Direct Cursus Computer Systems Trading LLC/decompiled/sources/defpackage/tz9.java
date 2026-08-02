package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tz9 extends p9 {
    public final pct b;
    public final qg8 c;
    public final m0a d;
    public final ExecutorService e;
    public final we9 f;

    public tz9(gp8 gp8Var, pct pctVar, qg8 qg8Var, m0a m0aVar, ExecutorService executorService, we9 we9Var) {
        super(gp8Var);
        this.b = pctVar;
        this.c = qg8Var;
        this.d = m0aVar;
        this.e = executorService;
        this.f = we9Var;
    }

    public static final void G(tz9 tz9Var, pz9 pz9Var, xzb xzbVar, lj0 lj0Var) {
        szb szbVar = pz9Var.B;
        String str = szbVar != null ? (String) szbVar.a(xzbVar) : null;
        if (str == null) {
            lj0Var.invoke(null);
        } else {
            tz9Var.e.submit(new cj3(str, false, lj0Var));
        }
    }

    public static final xe9 H(tz9 tz9Var, pz9 pz9Var, xzb xzbVar) {
        boolean booleanValue = ((Boolean) pz9Var.g.a(xzbVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) pz9Var.w.a(xzbVar)).booleanValue();
        boolean booleanValue3 = ((Boolean) pz9Var.C.a(xzbVar)).booleanValue();
        szb szbVar = pz9Var.z;
        return new xe9(booleanValue, booleanValue2, booleanValue3, szbVar != null ? (JSONObject) szbVar.a(xzbVar) : null);
    }

    public static final void I(tz9 tz9Var, gc8 gc8Var, pz9 pz9Var) {
        gc8Var.I(new Throwable(dfi.i(new StringBuilder("Neither 'video_source' nor 'player_settings_payload' are specified for video with id '"), pz9Var.t, '\'')));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [ia8] */
    /* JADX WARN: Type inference failed for: r4v3, types: [ja8] */
    /* JADX WARN: Type inference failed for: r4v6, types: [vq5] */
    /* JADX WARN: Type inference failed for: r4v7, types: [vq5] */
    /* JADX WARN: Type inference failed for: r8v0, types: [l0a] */
    public static final void J(tz9 tz9Var, l0a l0aVar, pz9 pz9Var, xzb xzbVar, se9 se9Var, gc8 gc8Var) {
        yaw yawVar = new yaw(1, new ii(pz9Var, tz9Var, gc8Var, se9Var, xzbVar, 22), pz9Var, xzbVar);
        List list = pz9Var.R;
        ?? r4 = ja8.b0;
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                r4 = L((c0a) CollectionsKt.Q(list), xzbVar, yawVar);
            } else {
                r4 = new vq5();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r4.a(L((c0a) it.next(), xzbVar, yawVar));
                }
            }
        }
        l0aVar.f(r4);
        szb szbVar = pz9Var.z;
        if (szbVar != null) {
            l0aVar.f(szbVar.c(xzbVar, new ak0(se9Var, pz9Var, xzbVar, tz9Var, 14)));
        }
    }

    public static vq5 L(c0a c0aVar, xzb xzbVar, yaw yawVar) {
        vq5 vq5Var = new vq5();
        szb szbVar = c0aVar.a;
        if (szbVar != null) {
            vq5Var.a(szbVar.c(xzbVar, yawVar));
        }
        vq5Var.a(c0aVar.b.c(xzbVar, yawVar));
        b0a b0aVar = c0aVar.c;
        if (b0aVar != null) {
            vq5Var.a(b0aVar.a.c(xzbVar, yawVar));
            vq5Var.a(b0aVar.b.c(xzbVar, yawVar));
        }
        vq5Var.a(c0aVar.d.c(xzbVar, yawVar));
        return vq5Var;
    }

    public final void K(l0a l0aVar, e23 e23Var, pz9 pz9Var, pm9 pm9Var) {
        grm grmVar;
        af9 af9Var;
        gc8 gc8Var = e23Var.a;
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (!qht.a.a()) {
            g23 d = gc8Var.getViewComponent$div_release().d();
            f23 a = d.a();
            try {
                d51Var.p(new ec8(d, a, e23Var, pz9Var, this, l0aVar, pm9Var));
                return;
            } catch (Throwable th) {
                g23.b(a);
                throw th;
            }
        }
        xzb xzbVar = e23Var.b;
        List N = lg3.N(pz9Var, xzbVar);
        xe9 H = H(this, pz9Var, xzbVar);
        if (N.isEmpty() && pz9Var.z == null) {
            I(this, e23Var.a, pz9Var);
        }
        af9 playerView = l0aVar.getPlayerView();
        int childCount = l0aVar.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                grmVar = null;
                break;
            }
            View childAt = l0aVar.getChildAt(i);
            if (childAt instanceof grm) {
                grmVar = (grm) childAt;
                break;
            }
            i++;
        }
        grm grmVar2 = grmVar;
        if (playerView == null) {
            af9 a2 = this.f.a(l0aVar.getContext());
            a2.setVisibility(4);
            af9Var = a2;
        } else {
            af9Var = playerView;
        }
        grm grmVar3 = grmVar2 == null ? new grm(l0aVar.getContext()) : grmVar2;
        G(this, pz9Var, xzbVar, new lj0(28, af9Var, grmVar3, e23Var));
        se9 c = this.f.c(N, H);
        grm grmVar4 = grmVar3;
        c.f(new rz9(this, e23Var.a, e23Var.b, pz9Var, grmVar3));
        af9Var.a(c);
        String str = pz9Var.m;
        if (str != null) {
            l0aVar.f(this.b.l(e23Var, str, new bnd(25, c)));
        }
        l0aVar.f(pz9Var.w.d(xzbVar, new az6(28, c)));
        l0aVar.f(pz9Var.G.d(xzbVar, new sv4(27, af9Var, grmVar4)));
        J(this, l0aVar, pz9Var, xzbVar, c, e23Var.a);
        if (grmVar2 == null && playerView == null) {
            l0aVar.removeAllViews();
            l0aVar.addView(af9Var);
            l0aVar.addView(grmVar4);
        }
        this.d.a.put(l0aVar, pz9Var);
    }

    @Override // defpackage.p9
    public final void k(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2, pm9 pm9Var) {
        l0a l0aVar = (l0a) view;
        pz9 pz9Var = (pz9) dp8Var;
        pz9 pz9Var2 = (pz9) dp8Var2;
        l0aVar.setPath(pm9Var);
        K(l0aVar, e23Var, pz9Var, pm9Var);
        bg3.p(l0aVar, pz9Var.f, pz9Var2 != null ? pz9Var2.f : null, e23Var.b);
    }
}
