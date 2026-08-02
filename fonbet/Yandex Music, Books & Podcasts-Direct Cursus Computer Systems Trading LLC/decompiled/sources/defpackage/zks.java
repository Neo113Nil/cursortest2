package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class zks implements w2q, p7q {
    public final boolean a;
    public final jkl b;

    public zks(boolean z, jkl jklVar, int i) {
        jklVar.getClass();
        switch (i) {
            case 1:
                this.a = z;
                this.b = jklVar;
                break;
            default:
                this.a = z;
                this.b = jklVar;
                break;
        }
    }

    public static xxk a(e5d e5dVar) {
        String str = e5dVar.f;
        vxk vxkVar = str != null ? new vxk(new jbu(str), false, true, false) : null;
        String str2 = e5dVar.c;
        String str3 = e5dVar.d;
        String str4 = e5dVar.e;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        str4.getClass();
        webPath$Storage.getClass();
        return new xxk(vxkVar, str2, str3, false, etn.B(str4, webPath$Storage).getPathForSize(wct.s()), null, qo6.a, false, false, null, false, false, qxk.a, false, false, null);
    }

    public static xxk d(x1u x1uVar) {
        return new xxk(null, x1uVar.b, v5g.B(x1uVar), true, x1uVar.o.a.getPathForSize(720), null, qo6.j, true, true, x1uVar.n, true, true, qxk.a, true, true, null);
    }

    public static xxk e(String str, String str2, String str3) {
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        webPath$Storage.getClass();
        return new xxk(null, str, str2, false, etn.B(str3, webPath$Storage).getPathForSize(frv.b()), null, qo6.m, false, false, null, false, false, qxk.a, false, true, null);
    }

    public xxk b(mqs mqsVar) {
        int i;
        mqsVar.getClass();
        List list = mqsVar.u;
        if (list != null) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                List list2 = ((c01) it.next()).h;
                i2 += list2 != null ? list2.size() : 0;
            }
            i = list.size() + i2;
        } else {
            i = 0;
        }
        List u = zwf.u(mqsVar);
        boolean z = (i == 1 && u.isEmpty()) || (i >= 2 && u.size() < 2);
        String str = mqsVar.y;
        vxk vxkVar = this.a ? str != null ? str.equals("TEST_MOCK_VIDEO") ? new vxk(new jbu("file:///android_asset/video_cover.mp4"), true, false, true) : new vxk(new ibu(str), true, false, true) : null : null;
        String obj = StringsKt.t0(mqsVar.j()).toString();
        String W = fxf.W(mqsVar);
        String pathForSize = mqsVar.x0.a.getPathForSize(frv.b());
        Integer R = pd.R(mqsVar.f().a);
        d85 d85Var = R != null ? new d85(c3x.f(R.intValue())) : null;
        qo6 qo6Var = qo6.a;
        jzb i3 = mqsVar.i();
        boolean z2 = !mqsVar.C();
        this.b.getClass();
        gys gysVar = gys.NonMusicHolder;
        return new xxk(vxkVar, obj, W, true, pathForSize, d85Var, qo6Var, true, true, i3, z2, true, a4g.D(gysVar, mqsVar) ? qxk.c : mqsVar.p() ? qxk.b : qxk.a, false, true, (z || a4g.D(gysVar, mqsVar)) ? null : u);
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        throw null;
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        if (faqVar instanceof naq) {
            return b(((naq) faqVar).e);
        }
        if (faqVar instanceof daq) {
            return a(((daq) faqVar).e);
        }
        if (faqVar instanceof saq) {
            return d(((saq) faqVar).e);
        }
        if (faqVar instanceof qaq) {
            uow uowVar = ((qaq) faqVar).c;
            return e(uowVar.d, null, uowVar.f);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return b(jzsVar.a);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            return b(((c2q) m1qVar).d);
        }
        if (m1qVar instanceof j1q) {
            return a(((j1q) m1qVar).d);
        }
        if (m1qVar instanceof e2q) {
            ckd ckdVar = ((e2q) m1qVar).c;
            return e(ckdVar.d, ckdVar.e, ckdVar.f);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return d(i5uVar.a);
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return a(k4dVar.a);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return new qan(null, ezf.Z(null, this.a, this.b), null);
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        tyu tyuVar = szuVar.b;
        eu7 eu7Var = (eu7) tyuVar.h.getValue();
        jzs jzsVar = eu7Var != null ? (jzs) eu7Var.b() : null;
        jkl jklVar = this.b;
        boolean z = this.a;
        xxk Z = jzsVar != null ? ezf.Z(jzsVar, z, jklVar) : null;
        xxk Z2 = ezf.Z(szuVar.l, z, jklVar);
        eu7 eu7Var2 = (eu7) tyuVar.g.getValue();
        jzs jzsVar2 = eu7Var2 != null ? (jzs) eu7Var2.b() : null;
        return new qan(Z, Z2, jzsVar2 != null ? ezf.Z(jzsVar2, z, jklVar) : null);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return new qan(null, ezf.Z(y4dVar.b, this.a, this.b), null);
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [arf, java.lang.Object] */
    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        mwk mwkVar;
        mwk mwkVar2;
        maqVar.getClass();
        boolean z = maqVar instanceof jbq;
        if (z) {
            mwkVar = (naq) ((jbq) maqVar).n.getValue();
        } else if (maqVar instanceof vaq) {
            mwkVar = ((vaq) maqVar).p();
        } else {
            if (!(maqVar instanceof eaq) && !(maqVar instanceof raq)) {
                b6e.s();
                return null;
            }
            mwkVar = null;
        }
        jkl jklVar = this.b;
        boolean z2 = this.a;
        xxk Z = mwkVar != null ? ezf.Z(mwkVar, z2, jklVar) : null;
        xxk Z2 = ezf.Z(maqVar.b(), z2, jklVar);
        if (z) {
            mwkVar2 = (naq) ((jbq) maqVar).m.getValue();
        } else if (maqVar instanceof vaq) {
            mwkVar2 = ((vaq) maqVar).o();
        } else {
            if (!(maqVar instanceof eaq) && !(maqVar instanceof raq)) {
                b6e.s();
                return null;
            }
            mwkVar2 = null;
        }
        return new qan(Z, Z2, mwkVar2 != null ? ezf.Z(mwkVar2, z2, jklVar) : null);
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        m1q m1qVar = t1qVar.b;
        jkl jklVar = this.b;
        boolean z = this.a;
        xxk Z = m1qVar != null ? ezf.Z(m1qVar, z, jklVar) : null;
        xxk Z2 = ezf.Z(t1qVar.c, z, jklVar);
        m1q m1qVar2 = t1qVar.d;
        return new qan(Z, Z2, m1qVar2 != null ? ezf.Z(m1qVar2, z, jklVar) : null);
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        i5u i5uVar = u7uVar.b;
        jkl jklVar = this.b;
        boolean z = this.a;
        xxk Z = i5uVar != null ? ezf.Z(i5uVar, z, jklVar) : null;
        xxk Z2 = ezf.Z(u7uVar.c, z, jklVar);
        i5u i5uVar2 = u7uVar.d;
        return new qan(Z, Z2, i5uVar2 != null ? ezf.Z(i5uVar2, z, jklVar) : null);
    }
}
