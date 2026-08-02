package defpackage;

import com.yandex.go.diagnostic_qr.experiment.QrDiagnosticExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.c;

/* loaded from: classes6.dex */
public final class x6g0 implements t1b0 {
    public final /* synthetic */ c a;

    public x6g0(rqo rqoVar) {
        this.a = uga1.b(rqoVar, QrDiagnosticExperiment.c);
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
        return (QrDiagnosticExperiment) this.a.c();
    }
}
