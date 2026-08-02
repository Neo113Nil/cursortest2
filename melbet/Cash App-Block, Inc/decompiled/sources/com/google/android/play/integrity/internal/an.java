package com.google.android.play.integrity.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.common.zzak;
import java.util.ListIterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class an extends zzak implements ListIterator {
    public final ap a;
    public final int a$1;
    public int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ap apVar, int i) {
        super(5);
        int size = apVar.size();
        if (i < 0 || i > size) {
            Path$$ExternalSyntheticBUOutline0.m(aj.d(i, size, "index"));
            throw null;
        }
        this.a$1 = size;
        this.b = i;
        this.a = apVar;
    }

    public final Object a(int i) {
        return this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a$1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // com.google.android.gms.internal.common.zzak, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
