package defpackage;

import com.yandex.go.taxi.order.cancel.v2.data.d;
import com.yandex.go.taxi.order.cancel.v2.navigation.c;
import com.yandex.go.taxi.order.delegates.a;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes14.dex */
public final class wk70 extends ad5 {
    public final vj70 A;
    public final vj70 B;
    public final dt20 x;
    public final at20 y;
    public final hl70 z;

    public wk70(dt20 dt20Var, at20 at20Var, hl70 hl70Var, vj70 vj70Var, vj70 vj70Var2) {
        super(vk70.class);
        this.x = dt20Var;
        this.y = at20Var;
        this.z = hl70Var;
        this.A = vj70Var;
        this.B = vj70Var2;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        vj70 vj70Var = this.B;
        tk70 tk70Var = (tk70) ((d) vj70Var.a).g.a.getValue();
        if (tk70Var != null) {
            o61 o61Var = vj70Var.b;
            String str = tk70Var.b;
            o61Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            o61Var.a.a("CancelModalCard.Closed", hashMap, 1, new HashMap());
        }
        super.Cg();
    }

    public final void Kg(qj70 qj70Var) {
        dt20 dt20Var = this.x;
        c cVar = (c) dt20Var.c;
        vj70 vj70Var = (vj70) dt20Var.x;
        tk70 tk70Var = (tk70) ((d) vj70Var.a).g.a.getValue();
        if (tk70Var != null) {
            o61 o61Var = vj70Var.b;
            String str = tk70Var.b;
            String lowerCase = uvb1.k(qj70Var).a().name().toLowerCase(Locale.ROOT);
            o61Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            hashMap.put("button", lowerCase);
            o61Var.a.a("CancelModalCard.Tapped", hashMap, 1, new HashMap());
        }
        if (qj70Var instanceof mj70) {
            cVar.q1();
            return;
        }
        if (qj70Var instanceof kj70) {
            cVar.o1();
            return;
        }
        if (qj70Var instanceof lj70) {
            cVar.p1();
            return;
        }
        if (qj70Var instanceof hj70) {
            String str2 = ((hj70) qj70Var).a;
            ((a) ((pg7) dt20Var.b)).c(((o2y0) dt20Var.w).b(), str2);
            return;
        }
        if (qj70Var instanceof ij70) {
            cVar.n1();
            return;
        }
        if (qj70Var instanceof oj70) {
            cVar.a.r(new my30(((oj70) qj70Var).a, 10));
        } else if (qj70Var instanceof jj70) {
            cVar.a.r(new my30(((jj70) qj70Var).a, 11));
        } else if (qj70Var instanceof nj70) {
            cVar.a.r(new qu(9));
        } else {
            if (qj70Var instanceof pj70) {
                return;
            }
            w511.b();
        }
    }
}
