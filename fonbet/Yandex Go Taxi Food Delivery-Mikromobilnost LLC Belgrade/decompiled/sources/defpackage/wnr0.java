package defpackage;

import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.shared.SharedPaymentExperiment;
import com.yandex.go.payments.shared.business.c;
import com.yandex.go.payments.shared.q;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class wnr0 {
    public final qmp a;
    public final i0 b;
    public final c c;

    public wnr0(qmp qmpVar, i0 i0Var, c cVar) {
        this.a = qmpVar;
        this.b = i0Var;
        this.c = cVar;
    }

    public final SharedPaymentExperiment a(Zone zone) {
        SharedPaymentExperiment sharedPaymentExperiment;
        if (zone != null && (sharedPaymentExperiment = (SharedPaymentExperiment) zone.b(SharedPaymentExperiment.class)) != null) {
            this.c.getClass();
            ArrayList arrayList = new ArrayList(sharedPaymentExperiment.c);
            ycc.w(arrayList, new qu(12), true);
            return new SharedPaymentExperiment(sharedPaymentExperiment.b, arrayList, sharedPaymentExperiment.d);
        }
        return SharedPaymentExperiment.f;
    }

    public final SharedPaymentExperiment b() {
        ((ul51) this.a).getClass();
        return a(this.b.a());
    }

    public final tpr c() {
        ((ul51) this.a).getClass();
        return new q(new mth(this.b.b(), 6), this);
    }
}
