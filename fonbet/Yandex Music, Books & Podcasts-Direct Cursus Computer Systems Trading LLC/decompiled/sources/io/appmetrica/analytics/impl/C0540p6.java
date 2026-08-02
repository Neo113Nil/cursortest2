package io.appmetrica.analytics.impl;

import defpackage.u75;
import defpackage.xz0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.p6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0540p6 implements N9, InterfaceC0111aa {
    public final E7 a;
    public final Set b;
    public final AtomicLong c;

    public C0540p6(@NotNull E7 e7) {
        this.a = e7;
        Set Y = xz0.Y(new Integer[]{Integer.valueOf(EnumC0603rc.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC0603rc.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC0603rc.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC0603rc.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC0603rc.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC0603rc.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC0603rc.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC0603rc.EVENT_TYPE_SEND_REVENUE_EVENT.a())});
        this.b = Y;
        this.c = new AtomicLong(e7.a(Y));
        e7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0111aa
    public final void a(@NotNull List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    u75.m();
                    throw null;
                }
            }
        }
        this.c.addAndGet(i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0111aa
    public final void b(@NotNull List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    u75.m();
                    throw null;
                }
            }
        }
        this.c.addAndGet(-i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0111aa
    public final void a() {
        this.c.set(this.a.a(this.b));
    }

    @Override // io.appmetrica.analytics.impl.N9
    public final boolean b() {
        return this.c.get() > 0;
    }
}
