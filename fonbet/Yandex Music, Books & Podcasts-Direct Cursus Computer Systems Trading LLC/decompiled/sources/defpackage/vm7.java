package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class vm7 implements myf, w2q {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public boolean a;
    public boolean b;
    public Object c;

    public vm7() {
        this.c = Collections.newSetFromMap(new WeakHashMap());
    }

    public static void a(ArrayList arrayList, int i) {
        if (zc4.F(d, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    @Override // defpackage.myf
    public void b(zyf zyfVar) {
        ((Set) this.c).add(zyfVar);
        if (this.b) {
            zyfVar.onDestroy();
        } else if (this.a) {
            zyfVar.b();
        } else {
            zyfVar.onStop();
        }
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        focVar.b();
        throw null;
    }

    public dsc d(dsc dscVar) {
        if (!this.a || !((mvt) this.c).d(dscVar)) {
            return dscVar;
        }
        bsc a = dscVar.a();
        String str = dscVar.k;
        a.m = l5i.p("application/x-media3-cues");
        a.I = ((mvt) this.c).l(dscVar);
        StringBuilder sb = new StringBuilder();
        sb.append(dscVar.n);
        sb.append(str != null ? StringUtil.SPACE.concat(str) : "");
        a.j = sb.toString();
        a.r = Long.MAX_VALUE;
        return new dsc(a);
    }

    public void e() {
        this.b = true;
        Iterator it = xut.e((Set) this.c).iterator();
        while (it.hasNext()) {
            ((zyf) it.next()).onDestroy();
        }
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        long j = -1;
        if (!(faqVar instanceof daq)) {
            if (faqVar instanceof saq) {
                j = ((saq) faqVar).e.f;
            } else if (faqVar instanceof naq) {
                j = ((naq) faqVar).e.e;
            } else if (!(faqVar instanceof qaq)) {
                b6e.s();
                return null;
            }
        }
        String b = faqVar.b();
        if (j < 100000) {
            j = 100000;
        }
        return new t2q(b, j);
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        boolean z = this.b;
        jzsVar.getClass();
        izs izsVar = jzsVar.g;
        boolean z2 = jzsVar.h;
        gy1 gy1Var = this.a ? gy1.d : z2 ? gy1.e : gy1.c;
        boolean a = gy1Var.a();
        boolean z3 = true;
        boolean z4 = z && swf.Q(izsVar);
        mqs mqsVar = jzsVar.a;
        be6 q = ghh.q(a, z4, wyf.O(mqsVar));
        boolean z5 = false;
        String str = jzsVar.i;
        String str2 = mqsVar.a;
        qvs qvsVar = mqsVar.D;
        zvs zvsVar = new zvs(str2);
        if (!z2) {
            if (mqsVar.e > 31000 && mqsVar.I() == lqs.c && !mqsVar.A) {
                z5 = true;
            }
            z3 = z5;
        }
        if (((Boolean) ((Function0) this.c).invoke()).booleanValue() && z) {
            if (swf.Q(izsVar)) {
                qvs qvsVar2 = mqsVar.E;
                if (qvsVar2 != null) {
                    qvsVar = qvsVar2;
                }
            } else {
                qvsVar = null;
            }
        }
        qvs qvsVar3 = qvsVar;
        nxs nxsVar = mqsVar.B;
        return new u2q(str, zvsVar, gy1Var, z3, qvsVar3, nxsVar != null ? new pxs(nxsVar.a, nxsVar.b) : null, q);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        long j;
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            j = ((c2q) m1qVar).d.e;
        } else if (m1qVar instanceof j1q) {
            j = 0;
        } else {
            if (!(m1qVar instanceof e2q)) {
                b6e.s();
                return null;
            }
            j = ((e2q) m1qVar).c.g;
        }
        String b = m1qVar.b();
        if (j < 100000) {
            j = 100000;
        }
        return new t2q(b, j);
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        long j = i5uVar.a.f;
        String str = i5uVar.d;
        if (j < 100000) {
            j = 100000;
        }
        return new t2q(str, j);
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return new s2q(k4dVar.a.b, k4dVar.b());
    }

    @Override // defpackage.myf
    public void l(zyf zyfVar) {
        ((Set) this.c).remove(zyfVar);
    }

    public /* synthetic */ vm7(Object obj, boolean z, boolean z2) {
        this.c = obj;
        this.a = z;
        this.b = z2;
    }

    public vm7(boolean z, boolean z2, Function0 function0) {
        this.a = z;
        this.b = z2;
        this.c = function0;
    }

    public vm7(boolean z) {
        this.b = z;
        this.c = new mvt(20);
    }
}
