package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.ybsdk.core.utils.poller.PollerTimeoutException;
import java.util.WeakHashMap;
import kotlin.Result;
import kotlin.random.Random;
import kotlin.time.DurationUnit;

/* loaded from: classes11.dex */
public abstract class xz91 {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (defpackage.jl40.l(r10.Q(), java.lang.Integer.valueOf(r14)) == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(g400 g400Var, CharSequence charSequence, String str, tls tlsVar, fid fidVar, int i) {
        String str2;
        boolean z;
        String e;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1307583808);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(g400Var) ? 4 : 2) | (btsVar.e(charSequence) ? 32 : 16) | (btsVar.k(str) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            String e2 = ohb1.e(btsVar, qxh0.cargoform_smart_camera_tap_on_screen_title);
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new c0(tlsVar, oz40Var, 10);
                btsVar.o0(Q2);
            }
            sls slsVar = (sls) Q2;
            k3r k3rVar = ljs0.c;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S) {
                str2 = e2;
            } else {
                str2 = e2;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            v33 v33Var = new v33(str);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new xvq(29);
                btsVar.o0(Q3);
            }
            String str3 = str2;
            com.yandex.smartcamera.arscene.ui.f.a(g400Var, v33Var, (tls) Q3, slsVar, btsVar, 392 | (i2 & 14));
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            c530 c530Var = c530.a;
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            WeakHashMap weakHashMap = a.w;
            oeb1.c(btsVar, o9a1.f(vuz.o(btsVar).f));
            f530 e3 = ljs0.e(ljs0.c(c530Var, 1.0f), 59.0f);
            z910 d4 = pi6.d(x4c.y, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = b.d(btsVar, e3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar, hashCode3, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d5);
            Boolean bool = (Boolean) oz40Var.getValue();
            bool.getClass();
            int i4 = 14;
            androidx.compose.animation.a.d(bool, null, null, "Title transition", wwg.S(2123366047, true, new ays0(0, charSequence, str3), btsVar), btsVar, 27648, 6);
            int i5 = ((Boolean) oz40Var.getValue()).booleanValue() ? wzg0.ic_left : wzg0.ic_delivery_smartcam_cross;
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                btsVar.e0(245628988);
                e = ohb1.e(btsVar, rzh0.logistics_back_button);
                z = false;
                btsVar.t(false);
            } else {
                z = false;
                btsVar.e0(245769573);
                e = ohb1.e(btsVar, rzh0.common_close);
                btsVar.t(false);
            }
            cuj0 cuj0Var = new cuj0(i5, e, null, new zez0(ldc.f), 20);
            f530 q = ljs0.q(c530Var, 42.0f);
            boolean z3 = i3 == 2048 ? true : z;
            Object Q4 = btsVar.Q();
            if (z3 || Q4 == o430Var) {
                Q4 = new lao0(i4, tlsVar);
                btsVar.o0(Q4);
            }
            s3b1.f(cuj0Var, cj6.a.a(q791.d(q, false, null, null, (sls) Q4, 15), x4c.x), null, btsVar, 0, 4);
            btsVar = btsVar;
            tse0.t(btsVar, true, true, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(g400Var, charSequence, str, tlsVar, i);
        }
    }

    public static boolean b(qr51 qr51Var, String str) {
        if (jl40.l(qr51Var.getCustomType().getType(), str)) {
            return true;
        }
        x4c.g("Unexpected type of DivKitCustomView", null, "Expected \"" + qr51Var.getCustomType() + "\" but given \"" + str + "\"", null, 10);
        return false;
    }

    public static final long c(evc evcVar) {
        o430 o430Var = e3n.b;
        return kp50.V(y6i0.k(new imz(e3n.e(((e3n) evcVar.a).a), e3n.e(((e3n) evcVar.b).a), false), Random.a), DurationUnit.MILLISECONDS);
    }

    public static final Result d(s2e0 s2e0Var) {
        if (s2e0Var instanceof q2e0) {
            return new Result(((q2e0) s2e0Var).a);
        }
        if (s2e0Var instanceof n2e0) {
            return new Result(new Result.Failure(((n2e0) s2e0Var).a));
        }
        if (s2e0Var.equals(r2e0.a)) {
            return new Result(new Result.Failure(new PollerTimeoutException()));
        }
        return null;
    }
}
