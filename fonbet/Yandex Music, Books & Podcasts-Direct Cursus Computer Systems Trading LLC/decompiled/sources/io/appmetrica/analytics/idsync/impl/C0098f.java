package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.idsync.impl.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0098f extends SafeRunnable {
    public final /* synthetic */ h a;

    public C0098f(h hVar) {
        this.a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.a.f && (idSyncConfig = this.a.e) != null) {
            this.a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.d.a((RequestConfig) it.next());
                }
                h hVar2 = this.a;
                IHandlerExecutor iHandlerExecutor = hVar2.c;
                C0098f c0098f = hVar2.g;
                if (c0098f != null) {
                    iHandlerExecutor.executeDelayed(c0098f, hVar2.b);
                } else {
                    Intrinsics.j("syncRunnable");
                    throw null;
                }
            }
        }
    }
}
