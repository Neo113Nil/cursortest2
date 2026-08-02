package defpackage;

import android.graphics.Color;
import androidx.compose.animation.g;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.layers.api.model.AutoScaleType;
import com.yandex.go.layers.api.model.params.AutoScale;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class w1b1 {
    public static final void a(boolean z, tls tlsVar, f530 f530Var, a aVar, a aVar2, fid fidVar, int i) {
        a aVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1718173364);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 c = ljs0.c(c530.a, 1.0f);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new nih(tlsVar, z, 3);
                btsVar.o0(Q);
            }
            f530 d2 = q791.d(c, false, null, null, (sls) Q, 15);
            z910 d3 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = b.d(btsVar, d2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d4);
            aVar3 = aVar;
            aVar3.invoke(cj6.a, btsVar, 54);
            btsVar.t(true);
            g.b(uic.a, z, null, null, null, null, aVar2, btsVar, ((i2 << 3) & 112) | 1572870, 30);
            btsVar.t(true);
        } else {
            aVar3 = aVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(z, tlsVar, f530Var, aVar3, aVar2, i);
        }
    }

    public static final pt3 b(AutoScale autoScale) {
        if ((jl40.l(autoScale.a, "linear") ? AutoScaleType.LINEAR : null) == null) {
            AutoScaleType autoScaleType = AutoScaleType.LINEAR;
        }
        Float f = autoScale.b;
        float floatValue = f != null ? f.floatValue() : 10.0f;
        Float f2 = autoScale.c;
        float floatValue2 = f2 != null ? f2.floatValue() : 1.0f;
        Float f3 = autoScale.d;
        float floatValue3 = f3 != null ? f3.floatValue() : 20.0f;
        Float f4 = autoScale.e;
        return new pt3(floatValue, floatValue2, floatValue3, f4 != null ? f4.floatValue() : 1.0f, 0);
    }

    public static String c(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d)};
        int i2 = tw21.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }
}
