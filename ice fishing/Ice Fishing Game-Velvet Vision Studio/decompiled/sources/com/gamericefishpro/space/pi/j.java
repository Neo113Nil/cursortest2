package com.gamericefishpro.space.pi;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h1 {
    public final /* synthetic */ int w;
    public final h y;

    public /* synthetic */ j(h hVar, int i) {
        this.w = i;
        this.y = hVar;
    }

    @Override // com.gamericefishpro.space.pi.h1
    public final boolean k() {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return true;
            default:
                return false;
        }
    }

    @Override // com.gamericefishpro.space.pi.h1
    public final void l(Throwable th) {
        int i = this.w;
        h hVar = this.y;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Throwable thQ = hVar.q(j());
                if (hVar.x()) {
                    com.gamericefishpro.space.th.a aVar = hVar.v;
                    Intrinsics.c(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    com.gamericefishpro.space.ui.f fVar = (com.gamericefishpro.space.ui.f) aVar;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = com.gamericefishpro.space.ui.f.A;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        com.gamericefishpro.space.d6.a aVar2 = com.gamericefishpro.space.ui.a.c;
                        if (Intrinsics.a(obj, aVar2)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, aVar2, thQ)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != aVar2) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                hVar.i(thQ);
                if (!hVar.x()) {
                    hVar.n();
                }
                break;
            default:
                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                hVar.resumeWith(Unit.a);
                break;
        }
    }
}
