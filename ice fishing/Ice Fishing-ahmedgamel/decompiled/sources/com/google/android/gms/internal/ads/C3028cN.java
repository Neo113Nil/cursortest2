package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.cN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3028cN extends AbstractList {

    /* renamed from: v, reason: collision with root package name */
    public static final C2921aN f29470v = C2921aN.l(C3028cN.class);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f29471n;

    /* renamed from: u, reason: collision with root package name */
    public final ZM f29472u;

    public C3028cN(ArrayList arrayList, ZM zm) {
        this.f29471n = arrayList;
        this.f29472u = zm;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f29471n;
        if (arrayList.size() > i) {
            return arrayList.get(i);
        }
        ZM zm = this.f29472u;
        if (!zm.hasNext()) {
            throw new NoSuchElementException();
        }
        arrayList.add(zm.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2975bN(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        C2921aN c2921aN = f29470v;
        c2921aN.f("potentially expensive size() call");
        c2921aN.f("blowup running");
        while (true) {
            ZM zm = this.f29472u;
            boolean hasNext = zm.hasNext();
            ArrayList arrayList = this.f29471n;
            if (!hasNext) {
                return arrayList.size();
            }
            arrayList.add(zm.next());
        }
    }
}
