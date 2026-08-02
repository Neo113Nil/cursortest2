package defpackage;

import com.yandex.go.experiment.LocationSdkAndroidGoExperiment;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qcz implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public qcz(rqo rqoVar) {
        LocationSdkAndroidGoExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(LocationSdkAndroidGoExperiment.j);
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
        return (LocationSdkAndroidGoExperiment) this.a.c();
    }
}
