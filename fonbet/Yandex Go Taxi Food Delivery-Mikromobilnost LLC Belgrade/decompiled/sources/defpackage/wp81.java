package defpackage;

import android.content.Context;
import android.util.Range;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes5.dex */
public abstract class wp81 {
    public static hn71 a;
    public static m2v b;

    public static final void a(sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1415694339);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = i | (btsVar.e(slsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            String e = ohb1.e(btsVar, qxh0.cargoform_smart_camera_ai_camera_video_denied_title);
            String e2 = ohb1.e(btsVar, qxh0.cargoform_smart_camera_ai_camera_video_denied_message);
            String e3 = ohb1.e(btsVar, qxh0.cargoform_smart_camera_ai_camera_video_denied_settings);
            f530 b2 = m4m0.b(ljs0.c, dl51.n, qke.q);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b2);
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
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 32.0f, 0.0f, 2);
            sic a2 = qic.a(lr20.e, x4c.H, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            lzr lzrVar = lzr.G;
            long j = dl51.g;
            ymb1.j(e, null, j, null, lzrVar, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 64490);
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            ymb1.f(e2, null, j, null, null, null, 0L, uh6.E(15), 0L, new sjy0(3), 0, false, Integer.MAX_VALUE, null, null, btsVar, 12582912, HProv.ALG_TYPE_SECURECHANNEL, 56186);
            btsVar = btsVar;
            oeb1.c(btsVar, ljs0.e(c530Var, 24.0f));
            f530 e4 = ljs0.e(c530Var, 40.0f);
            int i3 = 14;
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new jc0(11, slsVar);
                btsVar.o0(Q);
            }
            a.a((sls) Q, e4, null, 0L, 0L, null, false, null, null, null, wwg.S(-2060672138, true, new le(e3, i3), btsVar), btsVar, 0, 4092);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yr7(slsVar, i, 0);
        }
    }

    public static final synchronized hn71 b(Context context) {
        hn71 hn71Var;
        synchronized (wp81.class) {
            hn71Var = a;
            if (hn71Var == null) {
                hn71Var = new hn71(context, 23);
                a = hn71Var;
            }
        }
        return hn71Var;
    }

    public static db90 c() {
        return (db90) db90.e.getValue();
    }

    public static final void d(ar7 ar7Var, pbj pbjVar, ddf ddfVar) {
        m2v m2vVar = b;
        if (m2vVar == null) {
            ny61.r("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        br7 b2 = ((us7) m2vVar.a).b(ar7Var.c());
        g70 g70Var = new g70(b2.f(), np7.a);
        jud judVar = jud.c;
        qt7 qt7Var = new qt7(b2, null, g70Var, null, judVar, judVar, (jm7) m2vVar.b, (hhs0) m2vVar.w, (zi21) m2vVar.c);
        xt31 xt31Var = (xt31) pbjVar.c;
        synchronized (qt7Var.E) {
            qt7Var.A = xt31Var;
        }
        List list = (List) pbjVar.w;
        synchronized (qt7Var.E) {
            qt7Var.B = list;
        }
        synchronized (qt7Var.E) {
        }
        Range range = (Range) pbjVar.x;
        synchronized (qt7Var.E) {
            qt7Var.C = range;
        }
        List list2 = (List) pbjVar.A;
        Objects.toString(list2);
        Objects.toString(ddfVar);
        sgb1.g(3, "CameraUseCaseAdapter");
        synchronized (qt7Var.E) {
            h70 h70Var = qt7Var.a;
            jp7 jp7Var = qt7Var.D;
            h70Var.d(jp7Var);
            h70 h70Var2 = qt7Var.b;
            if (h70Var2 != null) {
                h70Var2.d(jp7Var);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(qt7Var.x);
            linkedHashSet.addAll(list2);
            HashMap p = qt7.p(linkedHashSet, ddfVar);
            try {
                try {
                    qt7Var.s(linkedHashSet, qt7Var.b != null);
                    qt7.E(p);
                } catch (IllegalArgumentException e) {
                    throw new CameraUseCaseAdapter$CameraException(e);
                }
            } catch (Throwable th) {
                qt7.E(p);
                throw th;
            }
        }
    }
}
