package com.anythink.expressad.foundation.g.a;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class b<K, V> extends a<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f19108b = 16;

    /* renamed from: c, reason: collision with root package name */
    private static final int f19109c = 16777216;

    /* renamed from: d, reason: collision with root package name */
    private final int f19110d;

    /* renamed from: f, reason: collision with root package name */
    private final List<V> f19112f = Collections.synchronizedList(new LinkedList());

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f19111e = new AtomicInteger();

    private b(int i) {
        this.f19110d = i;
        if (i > 16777216) {
            Log.w(com.anythink.expressad.foundation.g.g.a.b.f19421O, String.format("You set too large memory cache size (more than %1$d Mb)", 16));
        }
    }

    private int e() {
        return this.f19110d;
    }

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final boolean a(K k9, V v9) {
        boolean z3;
        int c9 = c();
        int i = this.f19110d;
        int i6 = this.f19111e.get();
        if (c9 < i) {
            while (i6 + c9 > i) {
                if (this.f19112f.remove(d())) {
                    i6 = this.f19111e.addAndGet(-c());
                }
            }
            this.f19112f.add(v9);
            this.f19111e.addAndGet(c9);
            z3 = true;
        } else {
            z3 = false;
        }
        super.a(k9, v9);
        return z3;
    }

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final void b() {
        this.f19112f.clear();
        this.f19111e.set(0);
        super.b();
    }

    public abstract int c();

    public abstract V d();

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final void a(K k9) {
        V b9 = b(k9);
        if (b9 != null && this.f19112f.remove(b9)) {
            this.f19111e.addAndGet(-c());
        }
        super.a(k9);
    }
}
