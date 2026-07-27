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
    protected Context f14551d;

    /* renamed from: a, reason: collision with root package name */
    final String f14548a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<T> f14549b = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f14554g = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    Runnable f14553f = new Runnable() { // from class: com.anythink.core.common.m.1
        @Override // java.lang.Runnable
        public final void run() {
            m.this.f14554g.set(false);
            m.this.a(true);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    String f14550c = com.anythink.core.common.d.t.b().p();

    /* renamed from: e, reason: collision with root package name */
    protected final Handler f14552e = com.anythink.core.common.v.b.b.a().a(9);

    public m(Context context) {
        this.f14551d = context.getApplicationContext();
    }

    public abstract void a(List<T> list);

    public final synchronized void a(T t9, boolean z8) {
        Handler handler;
        if (!com.anythink.core.common.d.t.b().a()) {
            this.f14549b.add(t9);
            return;
        }
        boolean z9 = true;
        if (z8) {
            this.f14549b.add(t9);
            a(true);
            return;
        }
        com.anythink.core.d.b b9 = com.anythink.core.d.d.a(this.f14551d).b(this.f14550c);
        if (this.f14554g.compareAndSet(false, true)) {
            if (b9.ap() > 0 && (handler = this.f14552e) != null) {
                handler.removeCallbacks(this.f14553f);
                this.f14552e.postDelayed(this.f14553f, b9.ap());
            }
            this.f14549b.add(t9);
            a(z9);
        }
        z9 = false;
        this.f14549b.add(t9);
        a(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z8) {
        Handler handler;
        try {
            if (z8) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f14549b);
                if (arrayList.size() > 0) {
                    a(arrayList);
                }
                this.f14549b.clear();
            } else {
                com.anythink.core.d.b b9 = com.anythink.core.d.d.a(this.f14551d).b(this.f14550c);
                ArrayList arrayList2 = new ArrayList();
                if (this.f14549b.size() >= b9.an()) {
                    for (int an = b9.an() - 1; an >= 0; an--) {
                        arrayList2.add(this.f14549b.get(an));
                        this.f14549b.remove(an);
                    }
                    if (arrayList2.size() > 0) {
                        a(arrayList2);
                    }
                }
            }
            if (this.f14549b.isEmpty() && (handler = this.f14552e) != null) {
                handler.removeCallbacks(this.f14553f);
                this.f14554g.set(false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
