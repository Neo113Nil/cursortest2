package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3553mB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f31908n;

    /* renamed from: u, reason: collision with root package name */
    public Collection f31909u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f31910v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3340iC f31911w;

    public C3553mB(C3340iC c3340iC) {
        Objects.requireNonNull(c3340iC);
        this.f31911w = c3340iC;
        this.f31908n = c3340iC.f31011w.entrySet().iterator();
        this.f31909u = null;
        this.f31910v = EnumC3017cC.f29433n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31908n.hasNext() || this.f31910v.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f31910v.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f31908n.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f31909u = collection;
            this.f31910v = collection.iterator();
        }
        return this.f31910v.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f31910v.remove();
        Collection collection = this.f31909u;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f31908n.remove();
        }
        C3340iC c3340iC = this.f31911w;
        c3340iC.f31012x--;
    }
}
