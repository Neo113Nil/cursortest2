package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ne3 implements pyc {
    public final /* synthetic */ fvf a;
    public final /* synthetic */ o0k b;

    public ne3(fvf fvfVar, o0k o0kVar) {
        float f = edo.a;
        this.a = fvfVar;
        this.b = o0kVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mfh mfhVar = (mfh) obj;
        ffh ffhVar = (ffh) obj2;
        long j = ((ga6) obj3).a;
        mfhVar.getClass();
        ffhVar.getClass();
        bvf j2 = this.a.j();
        List list = j2.k;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list) {
            cvf cvfVar = (cvf) obj4;
            if (cvfVar.a != 0 && !cvfVar.l.equals("bottom_empty_space")) {
                arrayList.add(obj4);
            }
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((cvf) it.next()).q;
        }
        int g = ((((((int) (j2.g() & 4294967295L)) - (-j2.l)) - j2.q) - i) - mfhVar.L(edo.a)) - mfhVar.L(this.b.d());
        if (g < 0) {
            g = 0;
        }
        if (g < 0) {
            ume.a("height must be >= 0");
        }
        ksk M = ffhVar.M(ia6.e(j, ia6.h(0, Integer.MAX_VALUE, g, g)));
        return mfh.m0(mfhVar, M.a, M.b, new me3(M, 0));
    }
}
