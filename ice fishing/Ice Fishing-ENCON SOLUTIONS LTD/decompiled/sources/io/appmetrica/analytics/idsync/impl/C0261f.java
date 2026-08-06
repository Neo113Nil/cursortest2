package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.idsync.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261f extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f4012a;

    public C0261f(h hVar) {
        this.f4012a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f4012a.f4019f && (idSyncConfig = this.f4012a.f4018e) != null) {
            this.f4012a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f4012a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f4017d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f4012a;
                IHandlerExecutor iHandlerExecutor = hVar2.f4016c;
                C0261f c0261f = hVar2.f4020g;
                if (c0261f != null) {
                    iHandlerExecutor.executeDelayed(c0261f, hVar2.f4015b);
                } else {
                    kotlin.jvm.internal.i.i("syncRunnable");
                    throw null;
                }
            }
        }
    }
}
