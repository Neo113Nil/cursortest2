package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class aa2 {
    public final rjq a;
    public final um6 b;
    public final AtomicBoolean c;
    public final mvt d;
    public final oq7 e;
    public final ocn f;
    public final umg g;
    public final jmg h;
    public final jyr i;
    public final jyr j;

    public aa2(oq7 oq7Var, ocn ocnVar, umg umgVar, jmg jmgVar) {
        mvt mvtVar = mvt.k;
        dq7 dq7Var = dm6.c;
        dq7Var.getClass();
        rjq rjqVar = new rjq(false);
        this.a = rjqVar;
        this.b = hld.s(rjqVar, dq7Var);
        this.c = new AtomicBoolean(false);
        this.d = mvtVar;
        this.e = oq7Var;
        this.f = ocnVar;
        this.g = umgVar;
        this.h = jmgVar;
        final int i = 0;
        this.i = btf.b(new Function0(this) { // from class: t92
            public final /* synthetic */ aa2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                aa2 aa2Var = this.b;
                switch (i2) {
                    case 0:
                        oq7 oq7Var2 = aa2Var.e;
                        ArrayList j = u75.j(new wan(oq7Var2), new oan(oq7Var2, 0), new oan(oq7Var2, 1), new oan(oq7Var2, 4), new oan(oq7Var2, 5), new oan(oq7Var2, 3), new oan(oq7Var2, 2));
                        aa2Var.g.a.a().getClass();
                        return j;
                    default:
                        List list = (List) aa2Var.i.getValue();
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ba2) it.next()).a());
                        }
                        pjc[] pjcVarArr = (pjc[]) arrayList.toArray(new pjc[0]);
                        return zsd.C(ox6.L(new cz(zsd.u0((pjc[]) Arrays.copyOf(pjcVarArr, pjcVarArr.length)), aa2Var, 9), 1000L), -1);
                }
            }
        });
        final int i2 = 1;
        this.j = btf.b(new Function0(this) { // from class: t92
            public final /* synthetic */ aa2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                aa2 aa2Var = this.b;
                switch (i22) {
                    case 0:
                        oq7 oq7Var2 = aa2Var.e;
                        ArrayList j = u75.j(new wan(oq7Var2), new oan(oq7Var2, 0), new oan(oq7Var2, 1), new oan(oq7Var2, 4), new oan(oq7Var2, 5), new oan(oq7Var2, 3), new oan(oq7Var2, 2));
                        aa2Var.g.a.a().getClass();
                        return j;
                    default:
                        List list = (List) aa2Var.i.getValue();
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ba2) it.next()).a());
                        }
                        pjc[] pjcVarArr = (pjc[]) arrayList.toArray(new pjc[0]);
                        return zsd.C(ox6.L(new cz(zsd.u0((pjc[]) Arrays.copyOf(pjcVarArr, pjcVarArr.length)), aa2Var, 9), 1000L), -1);
                }
            }
        });
    }
}
