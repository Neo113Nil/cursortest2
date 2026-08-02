package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class jul {
    public final kul a;
    public final oul b;
    public final knn c;
    public final crs d;
    public final hyp e;

    public jul(kul kulVar, oul oulVar, knn knnVar, crs crsVar, hyp hypVar) {
        this.a = kulVar;
        this.b = oulVar;
        this.c = knnVar;
        this.d = crsVar;
        this.e = hypVar;
    }

    public static final ArrayList a(jul julVar, mqs mqsVar, Set set, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            cvl cvlVar = (cvl) obj;
            mqsVar.getClass();
            if (!a4g.D(gys.MyMusic, mqsVar) || !cvlVar.d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cvl cvlVar2 = (cvl) it.next();
            arrayList2.add(new evl(cvlVar2, set.contains(Long.valueOf(cvlVar2.k))));
        }
        return arrayList2;
    }

    public final u21 b(mqs mqsVar) {
        pjc k0;
        mqsVar.getClass();
        eno c = new cus().c(mqsVar);
        oul oulVar = this.b;
        klg klgVar = oulVar.b;
        String str = oulVar.c.c().a;
        str.getClass();
        jyr jyrVar = i2q.e;
        Continuation continuation = null;
        if (lsq.v()) {
            l18 l18Var = l18.b;
            bdt I = hag.I(frt.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            ((frt) qdcVar.C(I)).c().a.getClass();
            xlg a = klgVar.a();
            String str2 = a.e.c().a;
            str2.getClass();
            k0 = zsd.k0(a.f.f(str2, new String[]{"playlist"}, new w90(a, str2, continuation, 6)), dm6.a);
        } else {
            k0 = zsd.k0(klgVar.c.d(str, null, null), dm6.a);
        }
        return new u21(10, c, k0, new gul(this, mqsVar, continuation, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cvl cvlVar, List list, ArrayList arrayList, cg6 cg6Var) {
        iul iulVar;
        int i;
        cvl cvlVar2;
        if (cg6Var instanceof iul) {
            iulVar = (iul) cg6Var;
            int i2 = iulVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iulVar.m = i2 - Integer.MIN_VALUE;
                Object obj = iulVar.k;
                nm6 nm6Var = nm6.a;
                i = iulVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    x0q x0qVar = this.a.a;
                    Object obj2 = Unit.a;
                    x0qVar.a(obj2);
                    iulVar.j = cvlVar;
                    iulVar.m = 1;
                    Object V = x97.V(dm6.a, new rfg(this.b.b, cvlVar, list, arrayList, null, 4), iulVar);
                    if (V != nm6Var) {
                        V = obj2;
                    }
                    if (V == nm6Var) {
                        obj2 = V;
                    }
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    cvlVar2 = cvlVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvlVar2 = iulVar.j;
                    qgg.h0(obj);
                }
                neg.A(dyr.e, cvlVar2.g().d());
                qxr.a();
                return Unit.a;
            }
        }
        iulVar = new iul(this, cg6Var);
        Object obj3 = iulVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iulVar.m;
        if (i != 0) {
        }
        neg.A(dyr.e, cvlVar2.g().d());
        qxr.a();
        return Unit.a;
    }
}
