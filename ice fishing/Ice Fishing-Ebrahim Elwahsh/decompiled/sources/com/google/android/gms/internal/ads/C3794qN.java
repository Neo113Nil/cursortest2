package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.qN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3794qN extends AbstractList {

    /* renamed from: v, reason: collision with root package name */
    public static final C3686oN f33710v = C3686oN.j(C3794qN.class);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f33711n;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC3632nN f33712u;

    public C3794qN(ArrayList arrayList, AbstractC3632nN abstractC3632nN) {
        this.f33711n = arrayList;
        this.f33712u = abstractC3632nN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f33711n;
        if (arrayList.size() > i) {
            return arrayList.get(i);
        }
        AbstractC3632nN abstractC3632nN = this.f33712u;
        if (!abstractC3632nN.hasNext()) {
            throw new NoSuchElementException();
        }
        arrayList.add(abstractC3632nN.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C3740pN(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        C3686oN c3686oN = f33710v;
        c3686oN.d("potentially expensive size() call");
        c3686oN.d("blowup running");
        while (true) {
            AbstractC3632nN abstractC3632nN = this.f33712u;
            boolean hasNext = abstractC3632nN.hasNext();
            ArrayList arrayList = this.f33711n;
            if (!hasNext) {
                return arrayList.size();
            }
            arrayList.add(abstractC3632nN.next());
        }
    }
}
