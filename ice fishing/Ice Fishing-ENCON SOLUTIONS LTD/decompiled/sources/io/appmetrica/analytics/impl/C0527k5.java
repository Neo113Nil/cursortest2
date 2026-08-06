package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527k5 implements InterfaceC0687q9 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0816v9 f6346a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6347b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6348c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6349d;

    public C0527k5(InterfaceC0816v9 interfaceC0816v9, List<? extends F8> list, List<? extends F8> list2, Q4 q4) {
        this.f6346a = interfaceC0816v9;
        this.f6347b = list;
        this.f6348c = list2;
        Objects.toString(q4);
        this.f6349d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.f6348c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((F8) it.next()).b()) {
                    break;
                }
            }
        }
        List list2 = this.f6347b;
        if (!list2.isEmpty() && !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((F8) it2.next()).b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        this.f6349d.set(false);
    }

    public final void c() {
        this.f6349d.set(true);
    }

    public final void d() {
        if (this.f6349d.get()) {
            List list = this.f6348c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((F8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C0571ln) this.f6346a).c();
        }
    }

    public final void e() {
        if (this.f6349d.get() && a()) {
            ((C0571ln) this.f6346a).c();
        }
    }

    public final void f() {
        if (this.f6349d.get() && a()) {
            ((C0571ln) this.f6346a).b();
        }
    }
}
