package com.anythink.expressad.foundation.g.h;

import android.content.Context;
import com.anythink.expressad.foundation.g.h.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f20358a;

    /* renamed from: b, reason: collision with root package name */
    HashMap<Long, a> f20359b;

    /* renamed from: c, reason: collision with root package name */
    WeakReference<Context> f20360c;

    public c(Context context, int i) {
        if (i == 0) {
            this.f20358a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        } else {
            this.f20358a = new ThreadPoolExecutor(i, (i * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.f20358a.allowCoreThreadTimeOut(true);
        this.f20359b = new HashMap<>();
        this.f20360c = new WeakReference<>(context);
    }

    private synchronized void b(a aVar) {
        if (aVar != null) {
            try {
                if (this.f20359b.containsKey(Long.valueOf(a.e()))) {
                    a aVar2 = this.f20359b.get(Long.valueOf(a.e()));
                    if (aVar2 != null) {
                        aVar2.f();
                    }
                    this.f20359b.remove(Long.valueOf(a.e()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void a() {
        try {
            Iterator<Map.Entry<Long, a>> it = this.f20359b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().f();
            }
            this.f20359b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    public c(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f20358a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20359b = new HashMap<>();
        this.f20360c = new WeakReference<>(context);
    }

    private synchronized void b(final a aVar, final a.InterfaceC0124a interfaceC0124a) {
        this.f20359b.put(Long.valueOf(a.e()), aVar);
        aVar.f20347f = new a.InterfaceC0124a() { // from class: com.anythink.expressad.foundation.g.h.c.1
            @Override // com.anythink.expressad.foundation.g.h.a.InterfaceC0124a
            public final void a(a.b bVar) {
                if (bVar == a.b.CANCEL) {
                    c.this.f20359b.remove(Long.valueOf(a.e()));
                } else if (bVar == a.b.FINISH) {
                    c.this.f20359b.remove(Long.valueOf(a.e()));
                } else if (bVar == a.b.RUNNING && c.this.f20360c.get() == null) {
                    c.this.a();
                }
                a.InterfaceC0124a interfaceC0124a2 = interfaceC0124a;
                if (interfaceC0124a2 != null) {
                    interfaceC0124a2.a(bVar);
                }
            }
        };
    }

    public final void a(a aVar) {
        b(aVar, null);
        this.f20358a.execute(aVar);
    }

    public final void a(a aVar, a.InterfaceC0124a interfaceC0124a) {
        b(aVar, interfaceC0124a);
        this.f20358a.execute(aVar);
    }

    private void b() {
        Iterator<Map.Entry<Long, a>> it = this.f20359b.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            a.b bVar = value.f20346e;
            if (bVar == a.b.PAUSE) {
                value.g();
            } else if (bVar == a.b.READY) {
                this.f20358a.execute(value);
            }
        }
    }

    private c(Context context, byte b9) {
        int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f20358a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20359b = new HashMap<>();
        this.f20360c = new WeakReference<>(context);
    }
}
