package io.appmetrica.analytics.networkquality.impl;

import defpackage.jl40;
import defpackage.scc;
import defpackage.tls;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networkquality.impl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.random.Random;

/* loaded from: classes9.dex */
public final class r {
    public final ServiceContext a;
    public final q b;

    public r(ServiceContext serviceContext, q qVar) {
        this.a = serviceContext;
        this.b = qVar;
    }

    public static final void a(final r rVar, t tVar, final ConcurrentHashMap concurrentHashMap, AtomicInteger atomicInteger, IHandlerExecutor iHandlerExecutor, final long j, final tls tlsVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        q qVar = rVar.b;
        qVar.getClass();
        String str = tVar.d;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = tVar.e;
        if (i4 > 0) {
            try {
                qVar.b.invoke(Long.valueOf(i4));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        int i5 = tVar.f;
        int i6 = i5 + 1;
        int i7 = 0;
        boolean z2 = false;
        while (true) {
            z = true;
            if (i7 >= i6) {
                break;
            }
            a a = qVar.a.a(tVar);
            arrayList.add(a);
            z2 = jl40.l(a.c, "success");
            if (i7 == i5 || (z2 && !tVar.k)) {
                break;
            }
            int i8 = tVar.h;
            if (i8 > 0) {
                Random.a.getClass();
                i2 = Random.b.c(i8);
            } else {
                i2 = 0;
            }
            int i9 = (tVar.g * (1 << i7)) + i2;
            if (i9 > 0) {
                try {
                    i3 = i7;
                    qVar.b.invoke(Long.valueOf(i9));
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            } else {
                i3 = i7;
            }
            i7 = i3 + 1;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (jl40.l(((a) it.next()).c, "success") && (i10 = i10 + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
            i = i10;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((a) it2.next()).d != 0) {
                    break;
                }
            }
        }
        z = false;
        concurrentHashMap.put(tVar.d, new u(currentTimeMillis, currentTimeMillis2, tVar.a, z2, z, arrayList.size(), i, arrayList));
        if (atomicInteger.decrementAndGet() == 0) {
            iHandlerExecutor.execute(new Runnable() { // from class: b781
                @Override // java.lang.Runnable
                public final void run() {
                    r.a(j, rVar, concurrentHashMap, tlsVar);
                }
            });
        }
    }

    public final void a(f fVar, final IHandlerExecutor iHandlerExecutor, final m mVar) {
        List<t> list = fVar.d;
        if (list.isEmpty()) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        final AtomicInteger atomicInteger = new AtomicInteger(list.size());
        for (final t tVar : list) {
            final r rVar = this;
            this.a.getExecutorProvider().getInterruptionThread("network-quality", tVar.d, new Runnable() { // from class: c781
                @Override // java.lang.Runnable
                public final void run() {
                    r.a(r.this, tVar, concurrentHashMap, atomicInteger, iHandlerExecutor, currentTimeMillis, mVar);
                }
            }).start();
            this = rVar;
        }
    }

    public static final void a(long j, r rVar, ConcurrentHashMap concurrentHashMap, tls tlsVar) {
        tlsVar.invoke(new v(j, rVar.a.getActiveNetworkTypeProvider().getNetworkType(rVar.a.getContext()).name().toLowerCase(Locale.ROOT), concurrentHashMap));
    }
}
