package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864x5 implements F8, S8 {

    /* renamed from: a, reason: collision with root package name */
    public final L6 f7185a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f7186b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f7187c;

    public C0864x5(L6 l6) {
        this.f7185a = l6;
        Set F2 = R1.d.F(Integer.valueOf(EnumC0301bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC0301bb.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC0301bb.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC0301bb.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC0301bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC0301bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC0301bb.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC0301bb.EVENT_TYPE_SEND_REVENUE_EVENT.a()));
        this.f7186b = F2;
        this.f7187c = new AtomicLong(l6.a(F2));
        l6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a() {
        this.f7187c.set(this.f7185a.a(this.f7186b));
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        return this.f7187c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void b(List<Integer> list) {
        int i2 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f7186b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i2 = i2 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f7187c.addAndGet(-i2);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a(List<Integer> list) {
        int i2 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f7186b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i2 = i2 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f7187c.addAndGet(i2);
    }
}
