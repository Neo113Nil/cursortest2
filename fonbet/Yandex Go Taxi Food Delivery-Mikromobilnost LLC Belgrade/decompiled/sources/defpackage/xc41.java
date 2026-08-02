package defpackage;

import android.content.Context;
import com.yandex.quark.utils.Disposable;
import com.yandex.quark.webchat.feature.dependencies.BufferingProfile;
import com.yandex.quark.webchat.feature.dependencies.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.flow.r0;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class xc41 implements ld41, ugz, apc, ib20, rl, fya0, pza0, g38, f38, uqw, olw0, yt1, thg0, esu, klu, x9z, wdf0, hs1, wf3, xj21, xy11 {
    public final a A;
    public final jd41 B;
    public final kd41 C;
    public final zc41 a;
    public final zq6 b;
    public final zwf0 c;
    public final yq6 w;
    public final wc41 x;
    public final y9z y;
    public final onh z;

    public xc41(Context context, tse tseVar, wly0 wly0Var, bst bstVar, zc41 zc41Var, zq6 zq6Var, zwf0 zwf0Var) {
        this.a = zc41Var;
        this.b = zq6Var;
        this.c = zwf0Var;
        ike g = kp50.g(tseVar, uyj.a);
        yq6 yq6Var = new yq6();
        this.w = yq6Var;
        wc41 wc41Var = new wc41();
        this.x = wc41Var;
        y9z y9zVar = new y9z();
        this.y = y9zVar;
        OkHttpClient.a aVar = new OkHttpClient.a();
        onh onhVar = new onh();
        this.z = onhVar;
        a aVar2 = new a();
        this.A = aVar2;
        lb7 lb7Var = new lb7(context, 10);
        jd41 jd41Var = new jd41(g, zwf0Var, onhVar, aVar2);
        this.B = jd41Var;
        this.C = new kd41(context, g, wly0Var, wc41Var, zq6Var, zwf0Var, yq6Var, y9zVar, aVar, jd41Var, bstVar, jd41Var.F, lb7Var);
    }

    @Override // defpackage.xy11
    public final void a(wy11 wy11Var) {
        Object obj;
        br6 br6Var = this.B.J;
        synchronized (br6Var) {
            try {
                br6Var.a = wy11Var;
                Set set = br6Var.c;
                if (set == null) {
                    return;
                }
                syj0 a = wy11Var.a(set);
                lyj0 lyj0Var = a instanceof lyj0 ? (lyj0) a : null;
                if (lyj0Var != null && (obj = lyj0Var.a) != null) {
                    br6Var.b = (Disposable) obj;
                }
                jyj0 jyj0Var = a instanceof jyj0 ? (jyj0) a : null;
                if (jyj0Var != null && jyj0Var.a != null) {
                    throw new ClassCastException();
                }
            } finally {
            }
        }
    }

    @Override // defpackage.hs1
    public final void b(gs1 gs1Var) {
        this.B.E.b(gs1Var);
    }

    @Override // defpackage.f38
    public final void c(e38 e38Var) {
        this.B.w.c(e38Var);
    }

    @Override // defpackage.ugz
    public final void d(qgz qgzVar) {
        this.c.a = qgzVar;
    }

    @Override // defpackage.rl
    public final void e() {
        this.z.e();
    }

    @Override // defpackage.thg0
    public final void f(com.yandex.quark.lite.js.a aVar) {
        this.B.C.f(aVar);
    }

    @Override // defpackage.uqw
    public final void g(dsw dswVar) {
        r0 r0Var = this.B.c.a;
        axi axiVar = new axi(dswVar);
        r0Var.getClass();
        r0Var.m(null, axiVar);
    }

    @Override // defpackage.rl
    public final void h(jl jlVar) {
        this.z.h(jlVar);
    }

    @Override // defpackage.x9z
    public final void i(y9z y9zVar) {
        y9z y9zVar2 = this.y;
        y9zVar2.a = y9zVar;
        CopyOnWriteArrayList copyOnWriteArrayList = y9zVar2.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y9zVar.e((vd41) it.next());
        }
        copyOnWriteArrayList.clear();
    }

    @Override // defpackage.olw0
    public final tpr j() {
        return this.B.D.B;
    }

    @Override // defpackage.yt1
    public final void k(Set set) {
        this.B.C.k(set);
    }

    @Override // defpackage.pza0
    public final void l(oza0 oza0Var) {
        this.B.z.c = oza0Var;
    }

    @Override // defpackage.esu
    public final void m(dsu dsuVar) {
        r0 r0Var = this.B.x;
        r0Var.getClass();
        r0Var.m(null, dsuVar);
    }

    @Override // defpackage.g38
    public final void n(e8h e8hVar) {
        tc41 tc41Var = this.B.w;
        synchronized (tc41Var) {
            try {
                tc41Var.a = e8hVar;
                for (vra0 vra0Var : tc41Var.b) {
                    Disposable disposable = (Disposable) q5z.C(vra0Var.b().z(e8hVar, vra0Var.a()));
                    if (disposable == null) {
                        return;
                    } else {
                        vra0Var.c().a(disposable);
                    }
                }
                tc41Var.b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(xa20 xa20Var) {
        List J0;
        List J02;
        zq6 zq6Var = this.b;
        zq6Var.c = xa20Var;
        synchronized (zq6Var.b) {
            J0 = kotlin.collections.a.J0(zq6Var.d);
            zq6Var.d.clear();
            J02 = kotlin.collections.a.J0(zq6Var.e);
            zq6Var.e.clear();
        }
        Iterator it = J0.iterator();
        while (it.hasNext()) {
            xa20Var.b((leo) it.next());
        }
        if (J02.isEmpty()) {
            return;
        }
        xa20Var.d(J02);
    }

    @Override // defpackage.wdf0
    public final void v(BufferingProfile bufferingProfile) {
        Object value;
        BufferingProfile bufferingProfile2 = this.B.A;
        synchronized (bufferingProfile2) {
            try {
                r0 r0Var = bufferingProfile2.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, bufferingProfile));
                for (Map.Entry entry : bufferingProfile2.b.entrySet()) {
                    ((xwf0) entry.getValue()).a(bufferingProfile.a((rs1) entry.getKey()));
                }
                bufferingProfile2.b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
