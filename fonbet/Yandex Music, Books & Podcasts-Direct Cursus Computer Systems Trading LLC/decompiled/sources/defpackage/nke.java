package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class nke {
    public final gle a;
    public final jyr b;

    public nke(gle gleVar) {
        this.a = gleVar;
        ogp.h = btf.b(new v1e(4, this));
        this.b = btf.b(new sxd(9));
    }

    public static dle b(qyf qyfVar, fle fleVar, Function1 function1, Function1 function12, hq5 hq5Var, int i, int i2) {
        vdr vdrVar;
        gle gleVar;
        dle dleVar;
        fleVar.getClass();
        function1.getClass();
        int i3 = i2 & 8;
        Object obj = gq5.a;
        if (i3 != 0) {
            oq5 oq5Var = (oq5) hq5Var;
            Object K = oq5Var.K();
            if (K == obj) {
                K = new mke(0);
                oq5Var.k0(K);
            }
            function12 = (Function1) K;
        }
        Object obj2 = function12;
        oq5 oq5Var2 = (oq5) hq5Var;
        Object obj3 = (jx7) oq5Var2.j(es5.h);
        Object K2 = oq5Var2.K();
        if (K2 == obj) {
            K2 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
        }
        mm6 mm6Var = ((fs5) K2).a;
        oq5Var2.Z(17385964);
        if (((Boolean) oq5Var2.j(koe.a)).booleanValue()) {
            vdrVar = ydr.a(null);
            oq5Var2.p(false);
        } else {
            jyr jyrVar = ogp.h;
            if (((jyrVar == null || (gleVar = (gle) jyrVar.getValue()) == null) ? null : (rke) gleVar.a.getValue()) == null) {
                vdrVar = ydr.a(null);
                oq5Var2.p(false);
            } else {
                Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
                boolean f = oq5Var2.f(context) | oq5Var2.f(mm6Var);
                Object K3 = oq5Var2.K();
                if (f || K3 == obj) {
                    K3 = rke.a(context).d(mm6Var);
                    oq5Var2.k0(K3);
                }
                vdrVar = (vdr) K3;
                oq5Var2.p(false);
            }
        }
        boolean f2 = oq5Var2.f(mm6Var) | oq5Var2.f(obj3) | oq5Var2.f(fleVar) | oq5Var2.f(vdrVar);
        Object K4 = oq5Var2.K();
        if (f2 || K4 == obj) {
            K4 = new dle(mm6Var, fleVar, vdrVar);
            oq5Var2.k0(K4);
        }
        dle dleVar2 = (dle) K4;
        boolean h = oq5Var2.h(dleVar2) | oq5Var2.h(qyfVar) | oq5Var2.f(obj3) | ((((i & 7168) ^ 3072) > 2048 && oq5Var2.f(obj2)) || (i & 3072) == 2048) | ((((i & 896) ^ 384) > 256 && oq5Var2.f(function1)) || (i & 384) == 256);
        Object K5 = oq5Var2.K();
        if (h || K5 == obj) {
            dleVar = dleVar2;
            Object ovVar = new ov(dleVar, qyfVar, obj3, obj2, function1, (Continuation) null, 27);
            oq5Var2.k0(ovVar);
            K5 = ovVar;
        } else {
            dleVar = dleVar2;
        }
        gld.w(oq5Var2, dleVar, (Function2) K5);
        return dleVar;
    }

    public final hke a() {
        return (hke) this.b.getValue();
    }
}
