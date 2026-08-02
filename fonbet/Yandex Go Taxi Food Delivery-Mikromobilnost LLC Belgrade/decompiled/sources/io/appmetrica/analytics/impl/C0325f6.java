package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0325f6 implements Fa {
    public final Ka a;
    public final List b;
    public final List c;
    public final AtomicBoolean d;

    public C0325f6(Ka ka, List<? extends U9> list, List<? extends U9> list2, K5 k5) {
        this.a = ka;
        this.b = list;
        this.c = list2;
        Objects.toString(k5);
        this.d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((U9) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((U9) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.d.set(false);
    }

    public final void c() {
        this.d.set(true);
    }

    public final void d() {
        if (this.d.get()) {
            List list = this.c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((U9) it.next()).b()) {
                        return;
                    }
                }
            }
            ((Gq) this.a).c();
        }
    }

    public final void e() {
        if (this.d.get() && a()) {
            ((Gq) this.a).c();
        }
    }

    public final void f() {
        if (this.d.get() && a()) {
            ((Gq) this.a).b();
        }
    }
}
