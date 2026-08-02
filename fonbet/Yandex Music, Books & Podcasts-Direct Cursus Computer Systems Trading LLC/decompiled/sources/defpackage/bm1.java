package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class bm1 implements p7q {
    public final a2t a;

    public bm1(a2t a2tVar, int i) {
        switch (i) {
            case 1:
                this.a = a2tVar;
                break;
            default:
                a2tVar.getClass();
                this.a = a2tVar;
                break;
        }
    }

    public ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            s9n s9nVar = null;
            if (i < 0) {
                u75.n();
                throw null;
            }
            mwk mwkVar = (mwk) obj;
            mqs a = mwkVar.a();
            s9n s9nVar2 = a == null ? null : new s9n(this.a.a(a), mwkVar.b() + "." + System.identityHashCode(mwkVar), i, a, mwkVar);
            if (s9nVar2 == null) {
                dfi.r("Playable " + mwkVar + " cannot convert to ui model", "PlayerScreen");
            } else {
                s9nVar = s9nVar2;
            }
            if (s9nVar != null) {
                arrayList.add(s9nVar);
            }
            i = i2;
        }
        return arrayList;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return hdn.a;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return new gdn(szuVar.i(), a(szuVar.k()), true);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return hdn.a;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            return new gdn(((jbq) maqVar).i, a(y7g.B(maqVar)), true);
        }
        if ((maqVar instanceof eaq) || (maqVar instanceof raq) || (maqVar instanceof vaq)) {
            return hdn.a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return hdn.a;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return hdn.a;
    }
}
