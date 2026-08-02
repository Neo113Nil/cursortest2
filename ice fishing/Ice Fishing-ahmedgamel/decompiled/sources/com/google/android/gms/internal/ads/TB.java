package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class TB extends AbstractC4278zC {

    /* renamed from: u, reason: collision with root package name */
    public final PB f28484u;

    /* renamed from: v, reason: collision with root package name */
    public Object f28485v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC4278zC f28486w;

    public TB(ZB zb) {
        super(0);
        Objects.requireNonNull(zb);
        this.f28484u = zb.f29628w.entrySet().f().listIterator(0);
        this.f28485v = null;
        this.f28486w = C2987bC.f30031x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28486w.hasNext() || this.f28484u.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4278zC, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f28486w.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f28484u.next();
            this.f28485v = entry.getKey();
            this.f28486w = ((NB) entry.getValue()).a();
        }
        Object obj = this.f28485v;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f28486w.next());
    }
}
