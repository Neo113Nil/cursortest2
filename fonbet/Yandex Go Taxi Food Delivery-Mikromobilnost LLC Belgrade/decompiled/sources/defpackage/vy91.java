package defpackage;

import android.graphics.Typeface;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.yandex.taxi.logistics.sdk.o;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.logistics.sdk.ui.theme.fonts.Style;

/* loaded from: classes5.dex */
public abstract class vy91 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1643372426);
        if (btsVar.V(i & 1, i != 0)) {
            k3r k3rVar = ljs0.c;
            byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
            a7u0 a7u0Var = gl51.a;
            ocb1.b(k3rVar, 150.0f, ((el51) btsVar.m(a7u0Var)).c(), ((el51) btsVar.m(a7u0Var)).d(), b, 1500, null, btsVar, 196662, 64);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i8r0(i, 26);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x010b, code lost:
    
        if (r3 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(fid fidVar, int i) {
        Typeface typeface;
        bts btsVar = (bts) fidVar;
        btsVar.g0(315439288);
        dmw0 dmw0Var = btsVar.a;
        int i2 = 24;
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
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
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            h5v h5vVar = new h5v(new cuj0(wzg0.ic_delivery_v2, null, null, null, 30));
            String e = ohb1.e(btsVar, rzh0.dashboard_main_header_delivery_lead_text);
            lzr lzrVar = lzr.F;
            long E = uh6.E(24);
            Style style = Style.NORMAL;
            kjz kjzVar = ngd0.z;
            if (kjzVar != null) {
                o oVar = (o) kjzVar.b;
                int i3 = jjz.a[style.ordinal()];
                if (i3 == 1) {
                    typeface = ((zmh) oVar.i).e();
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return;
                    }
                    typeface = Typeface.create(((zmh) oVar.i).e(), 2);
                }
            }
            typeface = Typeface.DEFAULT;
            rhb1.d(null, null, null, null, scc.g(h5vVar, new wsy0(e, lzrVar, 0, E, cwa1.a(typeface), null)), null, btsVar, 0, 47);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new ukr0(22);
                btsVar.o0(Q);
            }
            web1.d(null, 0.0f, 0, 16.0f, null, (tls) Q, btsVar, 199680, 23);
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i8r0(i, i2);
        }
    }

    public static uxm e(txm txmVar, w030 w030Var) {
        return new uxm(new hdi(0, w030Var), new nxm(), (i6r) txmVar.a.a.get());
    }

    public static final mo51 f(jo51 jo51Var) {
        if (jo51Var instanceof zo51) {
            zo51 zo51Var = (zo51) jo51Var;
            return new ap51(zo51Var.a, zo51Var.d, zo51Var.c);
        }
        if (!(jo51Var instanceof wo51)) {
            return null;
        }
        wo51 wo51Var = (wo51) jo51Var;
        return new xo51(wo51Var.a, wo51Var.c, wo51Var.e, wo51Var.d);
    }

    public abstract long c(int i);

    public abstract long d();
}
