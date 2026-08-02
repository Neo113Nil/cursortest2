package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.t;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes.dex */
public final class n7b implements q3c, hbv, pm5, zgp, u97, os3, sch, e4i, sx3, p7q, ipo, nwu {
    public Object a;

    public n7b(int i) {
        switch (i) {
            case 12:
                this.a = new HashSet();
                break;
            case 16:
                this.a = new hci(500L);
                break;
            case 24:
                this.a = new ConcurrentHashMap();
                break;
            case 25:
                this.a = new ubn();
                break;
            case 27:
                this.a = 1;
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    @Override // defpackage.os3
    public void A(Call call, Throwable th) {
        call.getClass();
        zt3 zt3Var = (zt3) this.a;
        r7o r7oVar = z7o.b;
        zt3Var.resumeWith(new t7o(th));
    }

    @Override // defpackage.os3
    public void D(Call call, Response response) {
        call.getClass();
        zt3 zt3Var = (zt3) this.a;
        r7o r7oVar = z7o.b;
        zt3Var.resumeWith(response);
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
        ((yrl) this.a).e.a();
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        scv scvVar = (scv) this.a;
        int i = scvVar.g;
        byte[] bArr = new byte[i];
        om3Var.getClass();
        om3Var.e(i, bArr);
        try {
            int length = bArr.length;
            if (bArr.length >= length) {
                long j = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    j += (bArr[i2] & 255) << (((length - 1) - i2) * 8);
                }
                if (j < 0 || j > 2147483647L) {
                    throw new e8e(dfi.d(j, "Bad integer: "));
                }
                scvVar.h = (int) j;
                scvVar.b = scvVar.d ? 3 : 4;
            } else {
                xq0.x("length must be less than or equal to b.length");
            }
        } catch (e8e e) {
            pm5 pm5Var = (pm5) scvVar.u.f;
            if (pm5Var != null) {
                pm5Var.r(e);
            }
            e.printStackTrace();
        }
        scvVar.h();
    }

    @Override // defpackage.sx3
    public void a(rx3 rx3Var) {
        ((j3j) this.a).k.l(rx3Var);
    }

    @Override // defpackage.zgp
    public void b(ahp ahpVar) {
        pzd pzdVar = (pzd) this.a;
        pzdVar.q.b(pzdVar);
    }

    @Override // defpackage.ipo
    public void c(ft7 ft7Var, String str) {
        ft7Var.getClass();
        str.getClass();
        qdq.A(new jgk((ozw) this.a, ft7Var, str, 1));
    }

    @Override // defpackage.e4i
    public void e(double d, String str) {
        e4i[] e4iVarArr = (e4i[]) this.a;
        for (int i = 0; i < 2; i++) {
            e4i e4iVar = e4iVarArr[i];
            if (e4iVar != null) {
                e4iVar.e(d, str);
            }
        }
    }

    @Override // defpackage.q3c
    public Object f() {
        jac jacVar = (jac) this.a;
        return new g8b((rdc) jacVar.a, (rdc) jacVar.b, (rdc) jacVar.c, (rdc) jacVar.d, (q7b) jacVar.e, (q7b) jacVar.f, (vx6) jacVar.g);
    }

    @Override // defpackage.hbv
    public void h(Bundle bundle, c3c c3cVar) {
        t l = ((b3c) this.a).l();
        if (l != null) {
            Intent intent = l.getIntent();
            intent.getClass();
            l.setResult(c3cVar == null ? -1 : 0, xwi.e(intent, bundle, c3cVar));
            l.finish();
        }
    }

    @Override // defpackage.e4i
    public void i() {
        e4i[] e4iVarArr = (e4i[]) this.a;
        for (int i = 0; i < 2; i++) {
            e4i e4iVar = e4iVarArr[i];
            if (e4iVar != null) {
                e4iVar.i();
            }
        }
    }

    public float j(View view, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = (HashMap) this.a;
        if (hashMap2.containsKey(view) && (hashMap = (HashMap) hashMap2.get(view)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public void k() {
        pzd pzdVar = (pzd) this.a;
        int i = pzdVar.r - 1;
        pzdVar.r = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (t0e t0eVar : pzdVar.t) {
            t0eVar.p();
            i2 += t0eVar.I.a;
        }
        xvs[] xvsVarArr = new xvs[i2];
        int i3 = 0;
        for (t0e t0eVar2 : pzdVar.t) {
            t0eVar2.p();
            int i4 = t0eVar2.I.a;
            int i5 = 0;
            while (i5 < i4) {
                t0eVar2.p();
                xvsVarArr[i3] = t0eVar2.I.a(i5);
                i5++;
                i3++;
            }
        }
        pzdVar.s = new yvs(xvsVarArr);
        pzdVar.q.g(pzdVar);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        vuu vuuVar = (vuu) this.a;
        szuVar.getClass();
        e5q e5qVar = szuVar.a;
        if (gut.R(e5qVar)) {
            return null;
        }
        jzs jzsVar = szuVar.l;
        s9p i0 = hdg.i0(e5qVar);
        if ((swf.V(jzsVar.g) && wxf.l(vuuVar, i0)) || (swf.R(jzsVar.g) && wxf.m(vuuVar, i0) && szuVar.m.b.c)) {
            return jzsVar;
        }
        return null;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        return null;
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        ((jcc) this.a).b(exc);
    }

    @Override // defpackage.e4i
    public void reset() {
        e4i[] e4iVarArr = (e4i[]) this.a;
        for (int i = 0; i < 2; i++) {
            e4i e4iVar = e4iVarArr[i];
            if (e4iVar != null) {
                e4iVar.reset();
            }
        }
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return null;
    }

    @Override // defpackage.nwu
    public void d() {
    }

    public /* synthetic */ n7b(Object obj) {
        this.a = obj;
    }

    public n7b(vuu vuuVar) {
        vuuVar.getClass();
        this.a = vuuVar;
    }

    public n7b(hyd hydVar, Function0 function0) {
        Function1 g2kVar;
        if (function0 instanceof bur) {
            g2kVar = new kef(1, function0, bur.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 24);
        } else {
            g2kVar = new g2k(function0, null, 0);
        }
        this.a = new j1k(g2kVar, hydVar).e;
    }
}
