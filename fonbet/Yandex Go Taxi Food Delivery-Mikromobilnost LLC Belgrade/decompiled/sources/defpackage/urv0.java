package defpackage;

import com.yandex.go.taxi.summary.map.focus.data.SummaryZoomZonesExperiment;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class urv0 {
    public final qqo a;
    public String b;
    public boolean c;

    public urv0(rqo rqoVar) {
        this.a = ((jbh) rqoVar).c(SummaryZoomZonesExperiment.f);
    }

    public final synchronized boolean a() {
        boolean z;
        if (this.c && ((SummaryZoomZonesExperiment) this.a.b()).b) {
            z = a.G(((SummaryZoomZonesExperiment) this.a.b()).c, this.b);
        }
        return z;
    }
}
