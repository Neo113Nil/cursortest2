package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class z40 extends bb0 implements el {
    public final /* synthetic */ int P7K7Inc8;
    public /* synthetic */ Object Qr9iLBAD;
    public /* synthetic */ Object b2ZJblxo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z40(int i, g9 g9Var, int i2) {
        super(i, g9Var);
        this.P7K7Inc8 = i2;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        switch (this.P7K7Inc8) {
            case 0:
                List list = (List) this.b2ZJblxo;
                xx xxVar = (xx) this.Qr9iLBAD;
                fn.SgZGMMPL(obj);
                if (xxVar == null) {
                    return wf.NCTxEWno;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    xx xxVar2 = (xx) obj2;
                    if (xxVar2.qoPGr6Ce != xxVar.qoPGr6Ce && (fn.qoPGr6Ce(xxVar2.P7K7Inc8, xxVar.P7K7Inc8) || fn.qoPGr6Ce(xxVar2.eVhOlqcC, xxVar.eVhOlqcC))) {
                        arrayList.add(obj2);
                    }
                }
                List N2kLh4D5 = x5.N2kLh4D5(x5.XrPeKzBk(arrayList, new sc(7)), 3);
                ArrayList arrayList2 = new ArrayList(z5.bvfAo0eO(N2kLh4D5, 10));
                Iterator it = N2kLh4D5.iterator();
                while (it.hasNext()) {
                    arrayList2.add(g50.OnDfzHZD((xx) it.next()));
                }
                return arrayList2;
            default:
                i90 i90Var = (i90) this.b2ZJblxo;
                w80 w80Var = (w80) this.Qr9iLBAD;
                fn.SgZGMMPL(obj);
                return new w70(i90Var, w80Var);
        }
    }

    @Override // defpackage.el
    public final Object b2ZJblxo(Object obj, Object obj2, Object obj3) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        int i2 = 3;
        switch (i) {
            case 0:
                z40 z40Var = new z40(i2, (g9) obj3, 0);
                z40Var.b2ZJblxo = (List) obj;
                z40Var.Qr9iLBAD = (xx) obj2;
                return z40Var.OxcuoDLp(xe0Var);
            default:
                z40 z40Var2 = new z40(i2, (g9) obj3, 1);
                z40Var2.b2ZJblxo = (i90) obj;
                z40Var2.Qr9iLBAD = (w80) obj2;
                return z40Var2.OxcuoDLp(xe0Var);
        }
    }
}
