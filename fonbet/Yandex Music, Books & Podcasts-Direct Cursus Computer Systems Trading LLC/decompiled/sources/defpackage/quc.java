package defpackage;

import android.view.Choreographer;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviTimestamp;

/* loaded from: classes3.dex */
public final class quc implements uyf {
    public final /* synthetic */ suc a;

    public quc(suc sucVar) {
        this.a = sucVar;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        MviEventsReporter mviEventsReporter;
        suc sucVar = this.a;
        g3a g3aVar = sucVar.c;
        int i = puc.a[kyfVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            MviEventsReporter mviEventsReporter2 = hdg.b;
            if (mviEventsReporter2 != null) {
                mviEventsReporter2.onStart(g3aVar, MviTimestamp.now());
            }
            Choreographer.getInstance().postFrameCallback(new yj4(1, sucVar));
            return;
        }
        sucVar.d.d();
        sucVar.e.d();
        sucVar.f.d();
        if (!sucVar.b.b || (mviEventsReporter = hdg.b) == null) {
            return;
        }
        mviEventsReporter.onCreate(g3aVar, null, MviTimestamp.now(), sqi.b ? MviMetricsReporter.StartupType.COLD : MviMetricsReporter.StartupType.WARM);
    }
}
