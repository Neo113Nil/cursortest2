package com.gamericefishpro.space.u8;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements g0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ s0(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // com.gamericefishpro.space.u8.g0
    public final void a(Bundle bundle) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i iVar = this.b;
                iVar.l.lock();
                try {
                    Bundle bundle2 = iVar.h;
                    if (bundle2 == null) {
                        iVar.h = bundle;
                    } else if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    iVar.i = com.gamericefishpro.space.s8.b.y;
                    i.h(iVar);
                    return;
                } finally {
                    iVar.l.unlock();
                }
            default:
                i iVar2 = this.b;
                iVar2.l.lock();
                try {
                    iVar2.j = com.gamericefishpro.space.s8.b.y;
                    i.h(iVar2);
                    return;
                } finally {
                    iVar2.l.unlock();
                }
        }
    }

    @Override // com.gamericefishpro.space.u8.g0
    public final void b(com.gamericefishpro.space.s8.b bVar) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i iVar = this.b;
                iVar.l.lock();
                try {
                    iVar.i = bVar;
                    i.h(iVar);
                    return;
                } finally {
                    iVar.l.unlock();
                }
            default:
                i iVar2 = this.b;
                iVar2.l.lock();
                try {
                    iVar2.j = bVar;
                    i.h(iVar2);
                    return;
                } finally {
                    iVar2.l.unlock();
                }
        }
    }

    @Override // com.gamericefishpro.space.u8.g0
    public final void c(int i) {
        com.gamericefishpro.space.s8.b bVar;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i iVar = this.b;
                Lock lock = iVar.l;
                lock.lock();
                try {
                    if (iVar.k || (bVar = iVar.j) == null || !bVar.c()) {
                        iVar.k = false;
                        i.g(iVar, i);
                    } else {
                        iVar.k = true;
                        iVar.f.onConnectionSuspended(i);
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                i iVar2 = this.b;
                Lock lock2 = iVar2.l;
                lock2.lock();
                try {
                    if (iVar2.k) {
                        iVar2.k = false;
                        i.g(iVar2, i);
                    } else {
                        iVar2.k = true;
                        iVar2.e.onConnectionSuspended(i);
                    }
                    return;
                } finally {
                    lock2.unlock();
                }
        }
    }
}
