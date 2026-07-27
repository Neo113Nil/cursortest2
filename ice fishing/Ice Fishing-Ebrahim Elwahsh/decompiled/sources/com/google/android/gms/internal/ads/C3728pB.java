package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3728pB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f33342n;

    /* renamed from: u, reason: collision with root package name */
    public Collection f33343u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f33344v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3513lC f33345w;

    public C3728pB(C3513lC c3513lC) {
        Objects.requireNonNull(c3513lC);
        this.f33345w = c3513lC;
        this.f33342n = c3513lC.f32551w.entrySet().iterator();
        this.f33343u = null;
        this.f33344v = EnumC3190fC.f30631n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33342n.hasNext() || this.f33344v.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f33344v.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f33342n.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f33343u = collection;
            this.f33344v = collection.iterator();
        }
        return this.f33344v.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f33344v.remove();
        Collection collection = this.f33343u;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f33342n.remove();
        }
        C3513lC c3513lC = this.f33345w;
        c3513lC.f32552x--;
    }
}
