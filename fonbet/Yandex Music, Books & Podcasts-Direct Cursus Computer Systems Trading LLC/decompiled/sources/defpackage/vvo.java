package defpackage;

import android.content.Context;
import androidx.compose.ui.draw.a;
import com.yandex.music.shared.screenshot.ui.impl.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vvo {
    public final Context a;
    public final zzp b;

    public vvo(Context context, zzp zzpVar) {
        context.getClass();
        zzpVar.getClass();
        this.a = context;
        this.b = zzpVar;
    }

    public final void a(wn5 wn5Var, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        yvo[] yvoVarArr = yvo.a;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(330955970);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i3 = apd.b;
            uod uodVar = (uod) oq5Var.j(es5.g);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new vod(uodVar);
                oq5Var.k0(K);
            }
            xod xodVar = ((vod) K).b;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = hld.j();
                oq5Var.k0(K2);
            }
            gm5 gm5Var = (gm5) K2;
            boolean h = oq5Var.h(xodVar) | oq5Var.h(gm5Var);
            Object K3 = oq5Var.K();
            if (h || K3 == kjnVar) {
                K3 = new xum(9, xodVar, gm5Var);
                oq5Var.k0(K3);
            }
            yci c = a.c(vci.a, (Function1) K3);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l(i2 & 14, wn5Var, oq5Var, true);
            Unit unit = Unit.a;
            boolean h2 = ((i2 & 896) == 256) | oq5Var.h(gm5Var) | oq5Var.h(xodVar) | ((i2 & 112) == 32) | oq5Var.h(this);
            Object K4 = oq5Var.K();
            if (h2 || K4 == kjnVar) {
                b bVar = new b(function1, gm5Var, xodVar, this, null);
                oq5Var.k0(bVar);
                K4 = bVar;
            }
            gld.w(oq5Var, unit, (Function2) K4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(this, wn5Var, function1, i);
        }
    }
}
