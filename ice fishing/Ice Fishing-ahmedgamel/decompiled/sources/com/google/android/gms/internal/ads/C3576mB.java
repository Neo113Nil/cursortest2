package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3576mB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f32688n;

    /* renamed from: u, reason: collision with root package name */
    public Collection f32689u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f32690v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3363iC f32691w;

    public C3576mB(C3363iC c3363iC) {
        Objects.requireNonNull(c3363iC);
        this.f32691w = c3363iC;
        this.f32688n = c3363iC.f31784w.entrySet().iterator();
        this.f32689u = null;
        this.f32690v = EnumC3040cC.f30216n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32688n.hasNext() || this.f32690v.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f32690v.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f32688n.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f32689u = collection;
            this.f32690v = collection.iterator();
        }
        return this.f32690v.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f32690v.remove();
        Collection collection = this.f32689u;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f32688n.remove();
        }
        C3363iC c3363iC = this.f32691w;
        c3363iC.f31785x--;
    }
}
