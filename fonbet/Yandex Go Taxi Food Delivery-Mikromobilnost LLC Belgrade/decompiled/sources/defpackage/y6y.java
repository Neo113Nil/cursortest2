package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.compose.foundation.pager.d;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class y6y implements iip0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iip0 b;
    public final /* synthetic */ wkp0 c;

    public /* synthetic */ y6y(iip0 iip0Var, wkp0 wkp0Var, int i) {
        this.a = i;
        this.c = wkp0Var;
        this.b = iip0Var;
    }

    @Override // defpackage.iip0
    public final float a(float f) {
        switch (this.a) {
        }
        return this.b.a(f);
    }

    public final int b(int i) {
        Object obj;
        int i2 = this.a;
        wkp0 wkp0Var = this.c;
        switch (i2) {
            case 0:
                b bVar = (b) wkp0Var;
                s6y j = bVar.j();
                if (j.k.isEmpty()) {
                    return 0;
                }
                int h = bVar.h();
                if (i > e() || h > i) {
                    return ((i - bVar.h()) * ndb1.e(j)) - bVar.i();
                }
                List list = j.k;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj = list.get(i3);
                        if (((t6y) ((n6y) obj)).a != i) {
                            i3++;
                        }
                    } else {
                        obj = null;
                    }
                }
                n6y n6yVar = (n6y) obj;
                if (n6yVar != null) {
                    return ((t6y) n6yVar).o;
                }
                return 0;
            default:
                d dVar = (d) wkp0Var;
                return (int) (y6i0.f(hg21.b(dVar) + m810.b(((dVar.q() * (i - dVar.k())) - (dVar.l() * dVar.q())) + 0.0f), dVar.h, dVar.g) - hg21.b(dVar));
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                return ((b) this.c).h();
            default:
                return ((d) this.c).e;
        }
    }

    public final int d() {
        switch (this.a) {
            case 0:
                return ((b) this.c).i();
            default:
                return ((d) this.c).f;
        }
    }

    public final int e() {
        int i = this.a;
        wkp0 wkp0Var = this.c;
        switch (i) {
            case 0:
                n6y n6yVar = (n6y) a.b0(((b) wkp0Var).j().k);
                if (n6yVar != null) {
                    return ((t6y) n6yVar).a;
                }
                return 0;
            default:
                return ((da10) ((c790) a.Z(((d) wkp0Var).n().a))).a;
        }
    }

    public final void f(int i, int i2) {
        int i3 = this.a;
        wkp0 wkp0Var = this.c;
        switch (i3) {
            case 0:
                ((b) wkp0Var).m(i, i2);
                break;
            default:
                d dVar = (d) wkp0Var;
                float q = dVar.q();
                dVar.v(i, q != 0.0f ? i2 / q : 0.0f, true);
                break;
        }
    }
}
