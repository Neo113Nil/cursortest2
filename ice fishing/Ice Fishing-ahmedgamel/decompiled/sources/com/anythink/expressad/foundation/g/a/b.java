package com.anythink.expressad.foundation.g.a;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class b<K, V> extends a<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f19895b = 16;

    /* renamed from: c, reason: collision with root package name */
    private static final int f19896c = 16777216;

    /* renamed from: d, reason: collision with root package name */
    private final int f19897d;

    /* renamed from: f, reason: collision with root package name */
    private final List<V> f19899f = Collections.synchronizedList(new LinkedList());

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f19898e = new AtomicInteger();

    private b(int i) {
        this.f19897d = i;
        if (i > 16777216) {
            Log.w(com.anythink.expressad.foundation.g.g.a.b.f20208O, String.format("You set too large memory cache size (more than %1$d Mb)", 16));
        }
    }

    private int e() {
        return this.f19897d;
    }

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final boolean a(K k9, V v9) {
        boolean z6;
        int c9 = c();
        int i = this.f19897d;
        int i4 = this.f19898e.get();
        if (c9 < i) {
            while (i4 + c9 > i) {
                if (this.f19899f.remove(d())) {
                    i4 = this.f19898e.addAndGet(-c());
                }
            }
            this.f19899f.add(v9);
            this.f19898e.addAndGet(c9);
            z6 = true;
        } else {
            z6 = false;
        }
        super.a(k9, v9);
        return z6;
    }

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final void b() {
        this.f19899f.clear();
        this.f19898e.set(0);
        super.b();
    }

    public abstract int c();

    public abstract V d();

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final void a(K k9) {
        V b9 = b(k9);
        if (b9 != null && this.f19899f.remove(b9)) {
            this.f19898e.addAndGet(-c());
        }
        super.a(k9);
    }
}
