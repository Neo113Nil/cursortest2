package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class nk6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;

    public /* synthetic */ nk6(ArrayList arrayList, long j, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                for (Pair pair : this.b) {
                    geh gehVar = (geh) pair.a;
                    Iterator it = ((List) pair.b).iterator();
                    while (it.hasNext()) {
                        long j = this.c;
                        jsk.f(jskVar, (ksk) it.next(), xv.Q(swf.i(enj.e(j) + ((gehVar.a - 0.5f) * r3.a), enj.f(j) + ((gehVar.b - 0.5f) * r3.b))));
                    }
                }
                break;
            default:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                float f = 2;
                float c = nmq.c(jpaVar.e()) / f;
                long i = swf.i(nmq.d(jpaVar.e()) / f, nmq.b(jpaVar.e()) / f);
                float n0 = jpaVar.n0(k8a.a) * 1.2f;
                for (sdr sdrVar : this.b) {
                    jpa.D0(jpaVar, this.c, n0, swf.i((((float) Math.cos(Math.toRadians(((Number) sdrVar.getValue()).floatValue()))) * c) + enj.e(i), (((float) Math.sin(Math.toRadians(((Number) sdrVar.getValue()).floatValue()))) * c) + enj.f(i)), 0.25f, null, 0, 112);
                }
                break;
        }
        return Unit.a;
    }
}
