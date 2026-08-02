package ru.yandex.taxi.logistics.experiments;

import defpackage.d6z;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.tpr;
import java.util.Iterator;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;

/* loaded from: classes9.dex */
public final class k implements qqo {
    public final /* synthetic */ qqo a;

    public k(rqo rqoVar) {
        DeliveryPvzExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).c(DeliveryPvzExperiment.v);
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    public final String d(String str) {
        Object obj;
        String str2;
        DeliveryPvzExperiment b = b();
        Iterator it = b.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((DeliveryPvzExperiment.c) obj).a, str)) {
                break;
            }
        }
        DeliveryPvzExperiment.c cVar = (DeliveryPvzExperiment.c) obj;
        return (cVar == null || (str2 = cVar.b) == null) ? "" : d6z.Y(b, str2);
    }

    @Override // defpackage.qqo
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final DeliveryPvzExperiment b() {
        return (DeliveryPvzExperiment) this.a.b();
    }

    public final boolean f(String str) {
        return b().b && b().d.contains(str);
    }
}
