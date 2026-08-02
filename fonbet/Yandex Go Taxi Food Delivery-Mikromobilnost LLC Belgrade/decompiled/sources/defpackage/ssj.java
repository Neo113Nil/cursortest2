package defpackage;

import com.yandex.div.core.expression.variables.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes12.dex */
public final class ssj implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final y2r0 c;

    public /* synthetic */ ssj(xvf0 xvf0Var, y2r0 y2r0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = y2r0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        y2r0 y2r0Var = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                smp smpVar = (smp) xvf0Var.get();
                Set set = (Set) y2r0Var.get();
                ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i231) it.next()).create());
                }
                a a = smpVar.a();
                c231[] c231VarArr = (c231[]) arrayList.toArray(new c231[0]);
                a.i((c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
                return a;
            case 1:
                return new p730((w730) xvf0Var.get(), (Set) y2r0Var.get());
            case 2:
                Set set2 = (Set) xvf0Var.get();
                Set set3 = (Set) y2r0Var.get();
                Set set4 = set2;
                ArrayList arrayList2 = new ArrayList(tcc.n(set4, 10));
                Iterator it2 = set4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((nu) it2.next()).create());
                }
                Set set5 = set3;
                ArrayList arrayList3 = new ArrayList(tcc.n(set5, 10));
                Iterator it3 = set5.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((j4q0) it3.next()).create());
                }
                return new g0p(null, arrayList3, arrayList2, null, null, null, null, null, 1013);
            case 3:
                return new v1k0((z22) xvf0Var.get(), (Set) y2r0Var.get());
            default:
                smp smpVar2 = (smp) xvf0Var.get();
                Set set6 = (Set) y2r0Var.get();
                ArrayList arrayList4 = new ArrayList(tcc.n(set6, 10));
                Iterator it4 = set6.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((i231) it4.next()).create());
                }
                a a2 = smpVar2.a();
                c231[] c231VarArr2 = (c231[]) arrayList4.toArray(new c231[0]);
                a2.i((c231[]) Arrays.copyOf(c231VarArr2, c231VarArr2.length));
                return a2;
        }
    }
}
