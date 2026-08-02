package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xba {
    public final arf a;
    public final arf b;
    public final arf c;
    public final arf d;

    public xba(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4) {
        jyrVar.getClass();
        jyrVar2.getClass();
        jyrVar3.getClass();
        jyrVar4.getClass();
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
        this.d = jyrVar4;
    }

    public final wba a(ArrayList arrayList, hca hcaVar) {
        Boolean bool;
        yca ycaVar = (yca) ((aaa) this.d.getValue()).e.getValue();
        vga vgaVar = (vga) ((cba) this.c.getValue()).e.getValue();
        if (hcaVar instanceof fca) {
            bool = Boolean.valueOf(ycaVar.a.containsKey(((fca) hcaVar).a.a));
        } else if (hcaVar instanceof gca) {
            cvl cvlVar = ((gca) hcaVar).a;
            drt drtVar = cvlVar.c;
            bool = Boolean.valueOf(vgaVar.a.containsKey(new ega(new uga(drtVar.a, drtVar.b, drtVar.c), cvlVar.a)));
        } else {
            if (hcaVar != null) {
                b6e.s();
                return null;
            }
            bool = null;
        }
        if (arrayList.isEmpty()) {
            return uba.a;
        }
        lja ljaVar = (lja) ((e6q) ((uaa) this.b.getValue())).e.getValue();
        fba fbaVar = (fba) ((kij) this.a.getValue()).c.a.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!ljaVar.a.contains(((mqs) obj).a)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((mqs) next).k == dg2.b) {
                arrayList3.add(next);
            }
        }
        jyr b = btf.b(new yg6(19, fbaVar));
        jyr b2 = btf.b(new aw5(24, arrayList, b));
        return arrayList3.isEmpty() ? !Intrinsics.d(bool, Boolean.FALSE) ? sba.a : new vba(arrayList3, (List) b2.getValue()) : ((List) b.getValue()).containsAll(arrayList3) ? new tba((List) b2.getValue()) : new vba(arrayList3, (List) b2.getValue());
    }
}
