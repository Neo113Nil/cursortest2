package defpackage;

import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class qdw0 implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public qdw0(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(SuperappSearchbarExperiment.k);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (SuperappSearchbarExperiment) this.a.c();
    }
}
