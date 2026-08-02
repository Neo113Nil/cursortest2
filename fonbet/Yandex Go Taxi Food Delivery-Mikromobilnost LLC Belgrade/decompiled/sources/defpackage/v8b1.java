package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.foundation.text.selection.c;
import androidx.compose.foundation.text.selection.h;
import androidx.compose.foundation.text.selection.i;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.semantics.g;
import defpackage.kk2;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class v8b1 {
    public static final void a(f530 f530Var, ckq0 ckq0Var, tls tlsVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-917932944);
        int i3 = 2;
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ckq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(aVar) ? 2048 : 1024;
        }
        int i5 = 0;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new xiq0(1);
                btsVar.o0(Q);
            }
            zkq0 zkq0Var = (zkq0) cvw.W(objArr, zkq0.l, (sls) Q, btsVar, 384);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new i(zkq0Var);
                btsVar.o0(Q2);
            }
            i iVar = (i) Q2;
            final c3c c3cVar = (c3c) btsVar.m(j.f);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q3);
            }
            final tse tseVar = (tse) Q3;
            iVar.e = (w6u) btsVar.m(j.l);
            boolean k = btsVar.k(tseVar) | btsVar.k(c3cVar);
            Object Q4 = btsVar.Q();
            if (k || Q4 == o430Var) {
                Q4 = new tls() { // from class: androidx.compose.foundation.text.selection.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        tje.N(tse.this, null, CoroutineStart.UNDISPATCHED, new SelectionContainerKt$SelectionContainer$3$1$1(c3cVar, (kk2) obj, null), 1);
                        return zy11.a;
                    }
                };
                btsVar.o0(Q4);
            }
            iVar.f = (tls) Q4;
            iVar.d = new a5p0(10, iVar, tlsVar);
            iVar.b.setValue(ckq0Var);
            if (ckq0Var != null) {
                iVar.m();
            }
            btsVar.e0(-82280708);
            iVar.w = cwc0.b(SelectedTextType.StaticText, null, btsVar, 54);
            iVar.v = tseVar;
            btsVar.t(false);
            iVar.i();
            int i6 = g3c.a;
            int i7 = h3c.a;
            h hVar = new h(iVar, new fkq0(iVar, i3));
            f530 f530Var2 = c530.a;
            f530 c = lj91.c(exw0.a(hi91.d(ci91.f(gi91.b(eja1.y(exw0.a(f530Var2, zy11.a, hVar), new hkq0(iVar, i4)), iVar.h), new hkq0(iVar, 5)), false, null, 3), 8675309, new c(new hkq0(iVar, 6))), new j1(27, iVar));
            if (iVar.f() != null && iVar.h()) {
                ckq0 g = iVar.g();
                if (!(g == null ? true : jl40.l(g.a, g.b))) {
                    g gVar = u200.a;
                    f530Var2 = b.a(f530Var2, m.a(), new w7o0(10, iVar));
                }
            }
            zcb1.c(f530Var.k(i4a1.f(c.k(f530Var2), new e3o0(14, iVar))), wwg.S(-1799563674, true, new gkq0(iVar, zkq0Var, aVar), btsVar), btsVar, 48);
            boolean e = btsVar.e(iVar);
            Object Q5 = btsVar.Q();
            if (e || Q5 == o430Var) {
                Q5 = new hkq0(iVar, i5);
                btsVar.o0(Q5);
            }
            zpn.a(iVar, (tls) Q5, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(f530Var, ckq0Var, tlsVar, aVar, i, 9);
        }
    }

    public static final void b(f530 f530Var, a aVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1949207773);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(aVar) ? 32 : 16;
        }
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 f530Var3 = i4 != 0 ? c530.a : f530Var;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(null);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            ckq0 ckq0Var = (ckq0) oz40Var.getValue();
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ttm(22, oz40Var);
                btsVar.o0(Q2);
            }
            a(f530Var3, ckq0Var, (tls) Q2, aVar, btsVar, (i3 & 14) | 384 | ((i3 << 6) & 7168));
            f530Var2 = f530Var3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q12(i, i2, 9, f530Var2, aVar);
        }
    }

    public static final Bitmap c(Bitmap bitmap, int i) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(width, height);
        if (max <= 0.0f) {
            return bitmap;
        }
        float f = i;
        return Bitmap.createScaledBitmap(bitmap, (int) ((width / max) * f), (int) ((height / max) * f), true);
    }
}
