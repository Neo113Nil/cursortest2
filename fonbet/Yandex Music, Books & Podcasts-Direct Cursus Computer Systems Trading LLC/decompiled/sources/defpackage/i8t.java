package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class i8t {
    public static final /* synthetic */ int a = 0;

    static {
        btf.a(bwf.c, wjp.X);
    }

    public static final void a(d8t d8tVar, z7t z7tVar, Object obj, Object obj2, wdc wdcVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(867041821);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(d8tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(z7tVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(obj) : oq5Var.h(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? oq5Var.f(obj2) : oq5Var.h(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? oq5Var.f(wdcVar) : oq5Var.h(wdcVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (!oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            oq5Var.S();
        } else if (d8tVar.g()) {
            z7tVar.g(obj, obj2, wdcVar);
        } else {
            z7tVar.h(obj2, wdcVar);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl0(d8tVar, z7tVar, obj, obj2, wdcVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.functions.Function1, uif] */
    public static final t7t b(d8t d8tVar, oct octVar, String str, hq5 hq5Var, int i, int i2) {
        s7t s7tVar;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && ((oq5) hq5Var).f(d8tVar)) || (i & 6) == 4;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (z2 || K == kjnVar) {
            K = new t7t(d8tVar, octVar, str);
            oq5Var.k0(K);
        }
        t7t t7tVar = (t7t) K;
        if ((i3 <= 4 || !oq5Var.f(d8tVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean h = oq5Var.h(t7tVar) | z;
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            K2 = new gcp(19, d8tVar, t7tVar);
            oq5Var.k0(K2);
        }
        gld.k(t7tVar, (Function1) K2, oq5Var);
        if (d8tVar.g() && (s7tVar = (s7t) t7tVar.b.getValue()) != null) {
            d8t d8tVar2 = t7tVar.c;
            s7tVar.a.g(s7tVar.c.invoke(d8tVar2.f().b()), s7tVar.c.invoke(d8tVar2.f().a()), (wdc) s7tVar.b.invoke(d8tVar2.f()));
        }
        return t7tVar;
    }

    public static final z7t c(d8t d8tVar, Object obj, Object obj2, wdc wdcVar, oct octVar, hq5 hq5Var, int i) {
        boolean f = ((oq5) hq5Var).f(d8tVar);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        Object obj3 = gq5.a;
        if (f || K == obj3) {
            cn0 cn0Var = (cn0) octVar.a.invoke(obj2);
            cn0Var.d();
            K = new z7t(d8tVar, obj, cn0Var, octVar);
            oq5Var.k0(K);
        }
        z7t z7tVar = (z7t) K;
        a(d8tVar, z7tVar, obj, obj2, wdcVar, oq5Var, 0);
        boolean f2 = oq5Var.f(d8tVar) | oq5Var.f(z7tVar);
        Object K2 = oq5Var.K();
        if (f2 || K2 == obj3) {
            K2 = new gcp(20, d8tVar, z7tVar);
            oq5Var.k0(K2);
        }
        gld.k(z7tVar, (Function1) K2, oq5Var);
        return z7tVar;
    }

    public static final d8t d(cqi cqiVar, hq5 hq5Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((oq5) hq5Var).f(cqiVar)) || (i & 6) == 4;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (z || K == obj) {
            K = new d8t(cqiVar, null, "AnimatedVisibility");
            oq5Var.k0(K);
        }
        d8t d8tVar = (d8t) K;
        oq5Var.Z(1031290843);
        d8tVar.a(0, oq5Var, cqiVar.c.getValue());
        oq5Var.p(false);
        boolean f = oq5Var.f(d8tVar);
        Object K2 = oq5Var.K();
        if (f || K2 == obj) {
            K2 = new ou6(d8tVar, 1);
            oq5Var.k0(K2);
        }
        gld.k(d8tVar, (Function1) K2, oq5Var);
        return d8tVar;
    }

    public static final d8t e(Object obj, String str, hq5 hq5Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = new d8t(new cqi(obj), null, str);
            oq5Var.k0(K);
        }
        d8t d8tVar = (d8t) K;
        d8tVar.a((i & 8) | 48 | (i & 14), oq5Var, obj);
        Object K2 = oq5Var.K();
        if (K2 == kjnVar) {
            K2 = new ou6(d8tVar, 2);
            oq5Var.k0(K2);
        }
        gld.k(d8tVar, (Function1) K2, oq5Var);
        return d8tVar;
    }
}
