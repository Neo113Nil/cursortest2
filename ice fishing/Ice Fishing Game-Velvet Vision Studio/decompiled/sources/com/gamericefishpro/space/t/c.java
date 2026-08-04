package com.gamericefishpro.space.t;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {
    public int d;
    public int e = -1;
    public boolean i;
    public final /* synthetic */ e v;

    public c(e eVar) {
        this.v = eVar;
        this.d = eVar.i - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.e;
        e eVar = this.v;
        return Intrinsics.a(key, eVar.f(i)) && Intrinsics.a(entry.getValue(), eVar.i(this.e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.i) {
            return this.v.f(this.e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.i) {
            return this.v.i(this.e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.e;
        e eVar = this.v;
        Object objF = eVar.f(i);
        Object objI = eVar.i(this.e);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.e++;
        this.i = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException();
        }
        this.v.g(this.e);
        this.e--;
        this.d--;
        this.i = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.i) {
            return this.v.h(this.e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
