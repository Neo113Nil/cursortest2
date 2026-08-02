package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.eC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3147eC extends AbstractC4170xC implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30687u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractList f30688v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3147eC(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f30687u = i;
        this.f30688v = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4170xC
    public final Object a(Object obj) {
        switch (this.f30687u) {
            case 0:
                return ((C3201fC) this.f30688v).f31024u.apply(obj);
            default:
                return ((C3255gC) this.f30688v).f31314u.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f35745n).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f35745n).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f35745n).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f35745n).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
