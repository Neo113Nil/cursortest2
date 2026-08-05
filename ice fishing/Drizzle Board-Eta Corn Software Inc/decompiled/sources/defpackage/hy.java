package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hy extends bb0 implements gl {
    public /* synthetic */ xx P7K7Inc8;
    public /* synthetic */ boolean Qr9iLBAD;
    public /* synthetic */ List b2ZJblxo;
    public /* synthetic */ r6 jb9XjC4I;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [wf] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        xx xxVar = this.P7K7Inc8;
        List list = this.b2ZJblxo;
        boolean z = this.Qr9iLBAD;
        r6 r6Var = this.jb9XjC4I;
        fn.SgZGMMPL(obj);
        ArrayList arrayList = xxVar != null ? xxVar.ygLcUYwZ : null;
        List list2 = wf.NCTxEWno;
        if (arrayList == null) {
            arrayList = list2;
        }
        ArrayList arrayList2 = new ArrayList(z5.bvfAo0eO(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                y5.ZyZthT5G();
                throw null;
            }
            kh khVar = (kh) obj2;
            arrayList2.add(new ah(khVar.qoPGr6Ce, khVar.NCTxEWno, xxVar != null && i == xxVar.ygLcUYwZ.size() + (-1)));
            i = i2;
        }
        if (xxVar != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                xx xxVar2 = (xx) obj3;
                if (xxVar2.qoPGr6Ce != xxVar.qoPGr6Ce && (fn.qoPGr6Ce(xxVar2.P7K7Inc8, xxVar.P7K7Inc8) || fn.qoPGr6Ce(xxVar2.eVhOlqcC, xxVar.eVhOlqcC))) {
                    arrayList3.add(obj3);
                }
            }
            List N2kLh4D5 = x5.N2kLh4D5(x5.XrPeKzBk(arrayList3, new sc(5)), 6);
            list2 = new ArrayList(z5.bvfAo0eO(N2kLh4D5, 10));
            Iterator it = N2kLh4D5.iterator();
            while (it.hasNext()) {
                list2.add(g50.OnDfzHZD((xx) it.next()));
            }
        }
        return new fy(xxVar, arrayList2, list2, z, r6Var);
    }

    @Override // defpackage.gl
    public final Object eVhOlqcC(Object obj, Object obj2, Object obj3, Object obj4, eh ehVar) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        hy hyVar = new hy(5, ehVar);
        hyVar.P7K7Inc8 = (xx) obj;
        hyVar.b2ZJblxo = (List) obj2;
        hyVar.Qr9iLBAD = booleanValue;
        hyVar.jb9XjC4I = (r6) obj4;
        return hyVar.OxcuoDLp(xe0.qoPGr6Ce);
    }
}
