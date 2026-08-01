package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.eC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3124eC extends AbstractC4147xC implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29895u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractList f29896v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3124eC(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f29895u = i;
        this.f29896v = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4147xC
    public final Object a(Object obj) {
        switch (this.f29895u) {
            case 0:
                return ((C3178fC) this.f29896v).f30237u.apply(obj);
            default:
                return ((C3232gC) this.f29896v).f30548u.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f34964n).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f34964n).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f34964n).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f34964n).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
