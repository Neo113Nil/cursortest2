package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.xC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4147xC implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f34964n;

    public AbstractC4147xC(Iterator it) {
        it.getClass();
        this.f34964n = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34964n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f34964n.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f34964n.remove();
    }
}
