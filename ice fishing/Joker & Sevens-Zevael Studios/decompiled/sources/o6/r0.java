package o6;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f5325b;

    public /* synthetic */ r0(j jVar, int i10) {
        this.f5324a = i10;
        this.f5325b = jVar;
    }

    @Override // o6.g0
    public final void a(Bundle bundle) {
        j jVar;
        switch (this.f5324a) {
            case 0:
                jVar = this.f5325b;
                jVar.f5287l.lock();
                try {
                    Bundle bundle2 = jVar.f5283h;
                    if (bundle2 == null) {
                        jVar.f5283h = bundle;
                    } else if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    jVar.f5284i = m6.b.f4901k;
                    j.h(jVar);
                    return;
                } finally {
                }
            default:
                jVar = this.f5325b;
                jVar.f5287l.lock();
                try {
                    jVar.f5285j = m6.b.f4901k;
                    j.h(jVar);
                    return;
                } finally {
                }
        }
    }

    @Override // o6.g0
    public final void b(m6.b bVar) {
        j jVar;
        switch (this.f5324a) {
            case 0:
                jVar = this.f5325b;
                jVar.f5287l.lock();
                try {
                    jVar.f5284i = bVar;
                    j.h(jVar);
                    return;
                } finally {
                }
            default:
                jVar = this.f5325b;
                jVar.f5287l.lock();
                try {
                    jVar.f5285j = bVar;
                    j.h(jVar);
                    return;
                } finally {
                }
        }
    }

    @Override // o6.g0
    public final void c(int i10) {
        Lock lock;
        m6.b bVar;
        switch (this.f5324a) {
            case 0:
                j jVar = this.f5325b;
                lock = jVar.f5287l;
                lock.lock();
                try {
                    if (!jVar.f5286k && (bVar = jVar.f5285j) != null && bVar.b()) {
                        jVar.f5286k = true;
                        jVar.f5281f.onConnectionSuspended(i10);
                        return;
                    }
                    jVar.f5286k = false;
                    j.g(jVar, i10);
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                j jVar2 = this.f5325b;
                lock = jVar2.f5287l;
                lock.lock();
                try {
                    if (jVar2.f5286k) {
                        jVar2.f5286k = false;
                        j.g(jVar2, i10);
                    } else {
                        jVar2.f5286k = true;
                        jVar2.f5280e.onConnectionSuspended(i10);
                    }
                    return;
                } finally {
                    lock.unlock();
                }
        }
    }
}
