package defpackage;

import androidx.compose.material3.p;
import androidx.compose.material3.w;
import androidx.compose.runtime.f;
import defpackage.a7b;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes5.dex */
public final class rpb {
    public final r9s0 a;

    public rpb(r9s0 r9s0Var) {
        this.a = r9s0Var;
    }

    public final void a(fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-148922855);
        char c = 2;
        int i2 = (btsVar2.e(this) ? 4 : 2) | i;
        int i3 = 0;
        boolean z = true;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar2);
                btsVar2.o0(Q);
            }
            final tse tseVar = (tse) Q;
            for (final xni xniVar : (List) f.b(this.a.b, btsVar2).getValue()) {
                int i4 = 3;
                final w f = p.f(i3, 3, btsVar2, null);
                boolean e = btsVar2.e(tseVar) | btsVar2.k(f) | btsVar2.e(this) | btsVar2.e(xniVar);
                Object Q2 = btsVar2.Q();
                if (e || Q2 == o430Var) {
                    Q2 = new sls() { // from class: ru.yandex.taxi.logistics.childrouter.impl.a
                        @Override // defpackage.sls
                        public final Object invoke() {
                            tje.N(tse.this, null, null, new ChildScreensImpl$Content$1$1$1$1(f, null), 3).w(new a7b(15, this, xniVar));
                            return zy11.a;
                        }
                    };
                    btsVar2.o0(Q2);
                }
                s5d.a.getClass();
                bts btsVar3 = btsVar2;
                p.a((sls) Q2, null, f, 0.0f, false, null, 0L, 0L, 0L, s5d.b, new qha(18), null, wwg.S(1449267932, z, new ota(i4, xniVar), btsVar2), btsVar3, 0, 5114);
                btsVar2 = btsVar3;
                i3 = i3;
                o430Var = o430Var;
                z = z;
                tseVar = tseVar;
                c = 2;
            }
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tbb(this, i, 2);
        }
    }
}
