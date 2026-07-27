package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class TB extends AbstractC4255zC {

    /* renamed from: u, reason: collision with root package name */
    public final PB f27701u;

    /* renamed from: v, reason: collision with root package name */
    public Object f27702v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC4255zC f27703w;

    public TB(ZB zb) {
        super(0);
        Objects.requireNonNull(zb);
        this.f27701u = zb.f28848w.entrySet().f().listIterator(0);
        this.f27702v = null;
        this.f27703w = C2964bC.f29243x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27703w.hasNext() || this.f27701u.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4255zC, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f27703w.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f27701u.next();
            this.f27702v = entry.getKey();
            this.f27703w = ((NB) entry.getValue()).a();
        }
        Object obj = this.f27702v;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f27703w.next());
    }
}
