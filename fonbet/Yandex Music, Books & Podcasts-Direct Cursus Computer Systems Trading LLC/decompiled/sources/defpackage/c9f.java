package defpackage;

import io.appmetrica.analytics.locationinternal.impl.K1;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes5.dex */
public final /* synthetic */ class c9f implements NetworkTask.ShouldTryNextHostCondition {
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkTask.ShouldTryNextHostCondition
    public final boolean shouldTryNextHost(int i) {
        return K1.a(i);
    }
}
