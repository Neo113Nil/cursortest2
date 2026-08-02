package defpackage;

import com.yandex.plus.bdui.flex.document.a;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class g0q extends x5 {
    public final ArrayList b;
    public final mhp c;

    public g0q(ArrayList arrayList) {
        super(1);
        this.b = arrayList;
        this.c = q5f.Companion.serializer().getDescriptor();
    }

    @Override // defpackage.x5
    public final Object g(x3f x3fVar, w4f w4fVar) {
        String str;
        e0q e0qVar;
        t5a t5aVar;
        if (!(w4fVar instanceof q5f)) {
            xq0.x("Failed requirement.");
            return null;
        }
        u5a u5aVar = (u5a) w1g.w(x3fVar).g(ern.a(u5a.class));
        if (u5aVar != null && (t5aVar = u5aVar.a) != null) {
            String str2 = t5aVar.a;
        }
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.b) {
            aVar.getClass();
            w4f w4fVar2 = (w4f) ((q5f) w4fVar).get(aVar.c);
            if (w4fVar2 == null) {
                e0qVar = null;
            } else {
                cte cteVar = new cte(26, aVar, x3fVar, w4fVar2);
                System.currentTimeMillis();
                Object invoke = cteVar.invoke();
                System.currentTimeMillis();
                e0qVar = (e0q) invoke;
            }
            if (e0qVar != null) {
                arrayList.add(e0qVar);
            }
        }
        f0q f0qVar = f0q.b;
        y0o y0oVar = (y0o) w1g.w(x3fVar).g(ern.a(y0o.class));
        return asq.y(CollectionsKt.g0(arrayList, (y0oVar == null || (str = y0oVar.a) == null) ? c5b.a : t75.c(new zzt(dfi.n("reqId", str)))));
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return this.c;
    }
}
