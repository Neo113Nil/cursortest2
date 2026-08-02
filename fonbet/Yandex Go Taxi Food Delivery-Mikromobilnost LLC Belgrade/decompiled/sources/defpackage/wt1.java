package defpackage;

import com.yandex.go.taxi.order.map.route.a;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import java.util.List;

/* loaded from: classes14.dex */
public final class wt1 implements ggi0 {
    public final nz2 a;
    public final cr00 b;

    public wt1(nz2 nz2Var, cr00 cr00Var) {
        this.a = nz2Var;
        this.b = cr00Var;
    }

    @Override // defpackage.ggi0
    public final void f(fi6 fi6Var, List list) {
        nzr nzrVar;
        int a = this.b.a();
        nz2 nz2Var = this.a;
        nz2Var.d(fi6Var);
        nz2Var.a(fi6Var);
        nz2Var.b(fi6Var);
        dgi0 dgi0Var = nz2Var.a;
        yz70 yz70Var = dgi0Var.a;
        if (yz70Var.n) {
            fi6Var.f(yz70Var.m);
        }
        if (yz70Var.g) {
            fi6Var.f(yz70Var.f);
        }
        if (yz70Var.j) {
            fi6Var.f(yz70Var.i);
        }
        nz2Var.e(fi6Var, false);
        a aVar = nz2Var.c;
        if (aVar.A) {
            h8l0 h8l0Var = aVar.q;
            if (h8l0Var == null) {
                nzrVar = null;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - aVar.u > 4000) {
                    aVar.t = h8l0Var.a();
                    aVar.u = currentTimeMillis;
                }
                nzrVar = aVar.t;
            }
            if (nzrVar != null) {
                fi6Var.b(ru.yandex.taxi.map.utils.a.e(nzrVar.a, nzrVar.b));
            }
        }
        nz2Var.f(fi6Var, list);
        yz70 yz70Var2 = dgi0Var.a;
        zzs zzsVar = yz70Var2.r;
        if (zzsVar != null) {
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            fi6Var.c(new Point(zzsVar.a, zzsVar.b));
        }
        fi6Var.f(yz70Var2.s);
        nz2.c(fi6Var, a);
    }
}
