package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes3.dex */
public final class r90 {
    public final k1x0 a;
    public final ria0 b;
    public final AppAnalyticsReporter c;
    public final n0 d = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
    public m50 e;

    public r90(k1x0 k1x0Var, ria0 ria0Var, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = k1x0Var;
        this.b = ria0Var;
        this.c = appAnalyticsReporter;
    }
}
