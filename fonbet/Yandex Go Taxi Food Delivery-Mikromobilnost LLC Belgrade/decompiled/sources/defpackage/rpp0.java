package defpackage;

import com.ybsdk.common.domain.b;
import com.ybsdk.common.repositiories.user.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class rpp0 {
    public final a1b0 a;
    public final a b;
    public final com.ybsdk.common.repositiories.agreements.a c;
    public final b d;
    public final r6a0 e;
    public final AppAnalyticsReporter f;
    public final y1r0 g;
    public final n0 h = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);

    public rpp0(a1b0 a1b0Var, a aVar, com.ybsdk.common.repositiories.agreements.a aVar2, b bVar, r6a0 r6a0Var, AppAnalyticsReporter appAnalyticsReporter, y1r0 y1r0Var) {
        this.a = a1b0Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = bVar;
        this.e = r6a0Var;
        this.f = appAnalyticsReporter;
        this.g = y1r0Var;
    }
}
