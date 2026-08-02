package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import java.util.ArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class azl {
    public static final float a = 16;

    public static final void a(yci yciVar, fvf fvfVar, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1488174285);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function1) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            weo.i(d.d(yciVar, 1.0f), fvfVar, a.a(a, 0.0f, 2), false, qx0.g(8), null, null, false, null, function1, oq5Var, (i2 & 112) | 24960 | ((i2 << 21) & 1879048192), 488);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ryl(yciVar, fvfVar, function1, i, 0);
        }
    }

    public static final void b(fvf fvfVar, odc odcVar, Function1 function1, yci yciVar, boolean z, hq5 hq5Var, int i) {
        boolean z2;
        fvf fvfVar2 = fvfVar;
        fvfVar2.getClass();
        odcVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1965332544);
        int i2 = i | (oq5Var.f(fvfVar2) ? 4 : 2) | (oq5Var.f(odcVar) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024) | 24576;
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            int L = ((jx7) oq5Var.j(es5.h)).L(a);
            if (odcVar.equals(idc.a)) {
                oq5Var.Z(228043040);
                oq5Var.p(false);
            } else if (odcVar.equals(kdc.a)) {
                oq5Var.Z(228091059);
                pm0.a(null, ild.C(-2058614984, new pyl(yciVar, fvfVar2, 1), oq5Var), oq5Var, 48, 1);
                oq5Var.p(false);
            } else {
                if (!(odcVar instanceof mdc)) {
                    throw vz1.i(oq5Var, -1101021294, false);
                }
                oq5Var.Z(228555687);
                ArrayList arrayList = ((mdc) odcVar).a;
                boolean f = oq5Var.f(arrayList);
                Object K2 = oq5Var.K();
                if (f || K2 == kjnVar) {
                    K2 = new w71(arrayList, 3);
                    oq5Var.k0(K2);
                }
                yci b = nfp.b(yciVar, false, (Function1) K2);
                boolean f2 = ((i2 & 14) == 4) | ((i2 & 896) == 256) | oq5Var.f(arrayList) | oq5Var.h(mm6Var) | oq5Var.d(L);
                Object K3 = oq5Var.K();
                if (f2 || K3 == kjnVar) {
                    i6i i6iVar = new i6i(arrayList, function1, mm6Var, fvfVar2, L);
                    fvfVar2 = fvfVar2;
                    oq5Var.k0(i6iVar);
                    K3 = i6iVar;
                }
                a(b, fvfVar2, (Function1) K3, oq5Var, (i2 << 3) & 112);
                oq5Var.p(false);
            }
            z2 = true;
        } else {
            oq5Var.S();
            z2 = z;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qr(fvfVar2, odcVar, z2, function1, yciVar, i, 11);
        }
    }
}
