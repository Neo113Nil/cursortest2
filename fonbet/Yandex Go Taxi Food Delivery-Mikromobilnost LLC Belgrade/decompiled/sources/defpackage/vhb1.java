package defpackage;

import android.content.Context;
import androidx.compose.animation.core.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.chargers.error.api.ChargersErrorCode;
import com.yandex.go.navigator.main_screen.h;

/* loaded from: classes11.dex */
public abstract class vhb1 {
    public static final void a(final x700 x700Var, final float f, final tls tlsVar, final h hVar, final boolean z, final boolean z2, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-788866000);
        int i2 = i | (btsVar.e(x700Var) ? 4 : 2) | (btsVar.b(f) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(hVar) ? 2048 : 1024) | (btsVar.a(z) ? 16384 : 8192) | (btsVar.a(z2) ? 131072 : 65536);
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            m3u0 b = b.b(z ? 0.0f : 1.0f, null, null, null, btsVar, 0, 30);
            m3u0 b2 = b.b(z2 ? 1.0f : 0.0f, null, null, null, btsVar, 0, 30);
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.e(ljs0.c(c530Var, 1.0f), f), 0.0f, 60.0f, 0.0f, 0.0f, 13);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            f530 b3 = tra1.b(c530Var, ((Number) b.getValue()).floatValue());
            uo5 uo5Var = x4c.x;
            cj6 cj6Var = cj6.a;
            f530 d3 = u3a1.d(an91.o(cj6Var.a(b3, uo5Var), 8.0f, 8.0f, 0.0f, 8.0f, 4), "road_events_btn");
            int i3 = i2 & 896;
            boolean z3 = i3 == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z3 || Q == o430Var) {
                Q = new kiu(9, tlsVar);
                btsVar.o0(Q);
            }
            bqa1.c(d3, null, (sls) Q, btsVar, 0);
            if (x700Var.h == null) {
                btsVar.e0(1427269306);
                f530 d4 = u3a1.d(an91.o(cj6Var.a(tra1.b(c530Var, ((Number) b2.getValue()).floatValue()), x4c.A), 8.0f, 8.0f, 0.0f, 8.0f, 4), "back_btn");
                boolean z4 = i3 == 256;
                Object Q2 = btsVar.Q();
                if (z4 || Q2 == o430Var) {
                    Q2 = new kiu(10, tlsVar);
                    btsVar.o0(Q2);
                }
                snb1.a(d4, null, (sls) Q2, btsVar, 0, 2);
                btsVar = btsVar;
                ssa1.a(cj6Var.a(tra1.b(c530Var, ((Number) b.getValue()).floatValue()), x4c.C), x700Var.a.c, hVar, btsVar, (i2 >> 3) & 896);
                btsVar.t(false);
            } else {
                btsVar.e0(1427809388);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f, tlsVar, hVar, z, z2, i) { // from class: fa00
                public final /* synthetic */ float b;
                public final /* synthetic */ tls c;
                public final /* synthetic */ h w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ boolean y;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(9);
                    vhb1.a(x700.this, this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final String b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.m(AndroidCompositionLocals_androidKt.a);
        return ((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
    }

    public static final by9 c(py9 py9Var, ChargersErrorCode chargersErrorCode, tls tlsVar) {
        by9 by9Var = new by9(chargersErrorCode.getStringValue(), tlsVar);
        py9Var.a = by9Var;
        return by9Var;
    }
}
