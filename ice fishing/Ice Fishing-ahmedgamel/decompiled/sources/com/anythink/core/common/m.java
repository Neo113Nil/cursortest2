package com.anythink.core.common;

import android.content.Context;
import android.os.Handler;
import com.anythink.core.common.h.av;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class m<T extends av> {

    /* renamed from: d, reason: collision with root package name */
    protected Context f14394d;

    /* renamed from: a, reason: collision with root package name */
    final String f14391a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<T> f14392b = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f14397g = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    Runnable f14396f = new Runnable() { // from class: com.anythink.core.common.m.1
        @Override // java.lang.Runnable
        public final void run() {
            m.this.f14397g.set(false);
            m.this.a(true);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    String f14393c = com.anythink.core.common.d.t.b().p();

    /* renamed from: e, reason: collision with root package name */
    protected final Handler f14395e = com.anythink.core.common.v.b.b.a().a(9);

    public m(Context context) {
        this.f14394d = context.getApplicationContext();
    }

    public abstract void a(List<T> list);

    public final synchronized void a(T t6, boolean z3) {
        Handler handler;
        if (!com.anythink.core.common.d.t.b().a()) {
            this.f14392b.add(t6);
            return;
        }
        boolean z6 = true;
        if (z3) {
            this.f14392b.add(t6);
            a(true);
            return;
        }
        com.anythink.core.d.b b9 = com.anythink.core.d.d.a(this.f14394d).b(this.f14393c);
        if (this.f14397g.compareAndSet(false, true)) {
            if (b9.ap() > 0 && (handler = this.f14395e) != null) {
                handler.removeCallbacks(this.f14396f);
                this.f14395e.postDelayed(this.f14396f, b9.ap());
            }
            this.f14392b.add(t6);
            a(z6);
        }
        z6 = false;
        this.f14392b.add(t6);
        a(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z3) {
        Handler handler;
        try {
            if (z3) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f14392b);
                if (arrayList.size() > 0) {
                    a(arrayList);
                }
                this.f14392b.clear();
            } else {
                com.anythink.core.d.b b9 = com.anythink.core.d.d.a(this.f14394d).b(this.f14393c);
                ArrayList arrayList2 = new ArrayList();
                if (this.f14392b.size() >= b9.an()) {
                    for (int an = b9.an() - 1; an >= 0; an--) {
                        arrayList2.add(this.f14392b.get(an));
                        this.f14392b.remove(an);
                    }
                    if (arrayList2.size() > 0) {
                        a(arrayList2);
                    }
                }
            }
            if (this.f14392b.isEmpty() && (handler = this.f14395e) != null) {
                handler.removeCallbacks(this.f14396f);
                this.f14397g.set(false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
