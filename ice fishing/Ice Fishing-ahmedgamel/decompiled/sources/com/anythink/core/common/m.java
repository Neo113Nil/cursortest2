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
    protected Context f15180d;

    /* renamed from: a, reason: collision with root package name */
    final String f15177a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<T> f15178b = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f15183g = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    Runnable f15182f = new Runnable() { // from class: com.anythink.core.common.m.1
        @Override // java.lang.Runnable
        public final void run() {
            m.this.f15183g.set(false);
            m.this.a(true);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    String f15179c = com.anythink.core.common.d.t.b().p();

    /* renamed from: e, reason: collision with root package name */
    protected final Handler f15181e = com.anythink.core.common.v.b.b.a().a(9);

    public m(Context context) {
        this.f15180d = context.getApplicationContext();
    }

    public abstract void a(List<T> list);

    public final synchronized void a(T t6, boolean z6) {
        Handler handler;
        if (!com.anythink.core.common.d.t.b().a()) {
            this.f15178b.add(t6);
            return;
        }
        boolean z9 = true;
        if (z6) {
            this.f15178b.add(t6);
            a(true);
            return;
        }
        com.anythink.core.d.b b9 = com.anythink.core.d.d.a(this.f15180d).b(this.f15179c);
        if (this.f15183g.compareAndSet(false, true)) {
            if (b9.ap() > 0 && (handler = this.f15181e) != null) {
                handler.removeCallbacks(this.f15182f);
                this.f15181e.postDelayed(this.f15182f, b9.ap());
            }
            this.f15178b.add(t6);
            a(z9);
        }
        z9 = false;
        this.f15178b.add(t6);
        a(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z6) {
        Handler handler;
        try {
            if (z6) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f15178b);
                if (arrayList.size() > 0) {
                    a(arrayList);
                }
                this.f15178b.clear();
            } else {
                com.anythink.core.d.b b9 = com.anythink.core.d.d.a(this.f15180d).b(this.f15179c);
                ArrayList arrayList2 = new ArrayList();
                if (this.f15178b.size() >= b9.an()) {
                    for (int an = b9.an() - 1; an >= 0; an--) {
                        arrayList2.add(this.f15178b.get(an));
                        this.f15178b.remove(an);
                    }
                    if (arrayList2.size() > 0) {
                        a(arrayList2);
                    }
                }
            }
            if (this.f15178b.isEmpty() && (handler = this.f15181e) != null) {
                handler.removeCallbacks(this.f15182f);
                this.f15183g.set(false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
