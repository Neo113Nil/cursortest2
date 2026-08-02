package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class g47 extends bfu {
    public qds A;
    public qc9 B;
    public dxl C;
    public rar D;
    public final x3n k;
    public final vx6 l;
    public final String m;
    public final aro n;
    public final SharedPreferences o;
    public final String p;
    public final k1o q;
    public final g0c r;
    public final hpo s;
    public String x;
    public z37 y;
    public boolean z;
    public final voi t = new voi();
    public List u = c5b.a;
    public final Object v = btf.a(bwf.c, bs5.G);
    public boolean w = true;
    public boolean E = true;

    public g47(vx6 vx6Var, g0c g0cVar, x3n x3nVar, k1o k1oVar, hpo hpoVar, aro aroVar, SharedPreferences sharedPreferences, String str, String str2) {
        this.k = x3nVar;
        this.l = vx6Var;
        this.m = str;
        this.n = aroVar;
        this.o = sharedPreferences;
        this.p = str2;
        this.q = k1oVar;
        this.r = g0cVar;
        this.s = hpoVar;
    }

    public static final void G(g47 g47Var) {
        bfk bfkVar = new bfk(zek.v, afk.d, null, null, "Bank applications not found", null);
        g47Var.q.getClass();
        g47Var.K(new x37(bfkVar));
    }

    public static final void a(g47 g47Var, w7o w7oVar, zl2 zl2Var) {
        k1o k1oVar = g47Var.q;
        if (w7oVar instanceof s7o) {
            bfk bfkVar = ((s7o) w7oVar).a;
            k1oVar.getClass();
            g47Var.K(new x37(bfkVar));
        } else if (w7oVar instanceof u7o) {
            g47Var.J((en) ((u7o) w7oVar).a, zl2Var);
        }
    }

    public final void H(String str) {
        Continuation continuation;
        Object obj;
        this.w = false;
        Iterator it = this.u.iterator();
        while (true) {
            continuation = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((zl2) obj).c.equals(str)) {
                    break;
                }
            }
        }
        zl2 zl2Var = (zl2) obj;
        if (zl2Var == null) {
            return;
        }
        if (this.C != null) {
            String str2 = zl2Var.a;
            str2.getClass();
            cfk.g.a(str2);
        }
        this.q.getClass();
        K(new y37(R.string.paymentsdk_sbp_open_bank_title, 6));
        M();
        this.D = x97.y(ot0.F(this), null, null, new rc4(this, new sld(24, this), zl2Var, continuation, 26), 3);
    }

    public final void J(en enVar, zl2 zl2Var) {
        int i;
        String str = zl2Var.c;
        if (!(enVar instanceof zm)) {
            if (enVar instanceof dn) {
                String str2 = zl2Var.f;
                this.x = str;
                dn dnVar = (dn) enVar;
                z37 z37Var = new z37(new Intent("android.intent.action.VIEW", dag.I(str2, dnVar.b, dnVar.a.getQuery())), str2, str);
                this.y = z37Var;
                K(z37Var);
                return;
            }
            return;
        }
        if (zl2Var.e) {
            this.o.edit().putString("com.yandex.payment.LAST_USED_BANK_SCHEME", str).apply();
        }
        if (!(this.n instanceof xqo)) {
            this.q.getClass();
            i = R.string.paymentsdk_sbp_paid_success;
        } else {
            if (this.A == null) {
                Intrinsics.j("textProvider");
                throw null;
            }
            i = R.string.paymentsdk_bind_sbp_token;
        }
        K(new c47(i));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [arf, java.lang.Object] */
    public final void K(d47 d47Var) {
        if (!(d47Var instanceof z37)) {
            ((fjs) this.v.getValue()).b();
        }
        this.t.m(d47Var);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
    public final void L() {
        int i;
        boolean z = this.n instanceof xqo;
        k1o k1oVar = this.q;
        if (z) {
            k1oVar.getClass();
            i = R.string.paymentsdk_sbp_binding_waiting_title;
        } else {
            k1oVar.getClass();
            i = R.string.paymentsdk_sbp_payment_waiting_title;
        }
        ((fjs) this.v.getValue()).c(5L, new f47(this, i, 0));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
    public final void M() {
        int i;
        boolean z = this.n instanceof xqo;
        k1o k1oVar = this.q;
        if (z) {
            k1oVar.getClass();
            i = R.string.paymentsdk_sbp_binding_waiting_title;
        } else {
            k1oVar.getClass();
            i = R.string.paymentsdk_sbp_payment_waiting_title;
        }
        ((fjs) this.v.getValue()).c(3L, new f47(this, i, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.bfu
    public final void onCleared() {
        ((fjs) this.v.getValue()).a();
        super.onCleared();
    }
}
