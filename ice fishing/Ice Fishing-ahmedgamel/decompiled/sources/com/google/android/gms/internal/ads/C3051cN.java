package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.cN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3051cN extends AbstractList {

    /* renamed from: v, reason: collision with root package name */
    public static final C2944aN f30253v = C2944aN.l(C3051cN.class);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f30254n;

    /* renamed from: u, reason: collision with root package name */
    public final ZM f30255u;

    public C3051cN(ArrayList arrayList, ZM zm) {
        this.f30254n = arrayList;
        this.f30255u = zm;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f30254n;
        if (arrayList.size() > i) {
            return arrayList.get(i);
        }
        ZM zm = this.f30255u;
        if (!zm.hasNext()) {
            throw new NoSuchElementException();
        }
        arrayList.add(zm.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2998bN(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        C2944aN c2944aN = f30253v;
        c2944aN.f("potentially expensive size() call");
        c2944aN.f("blowup running");
        while (true) {
            ZM zm = this.f30255u;
            boolean hasNext = zm.hasNext();
            ArrayList arrayList = this.f30254n;
            if (!hasNext) {
                return arrayList.size();
            }
            arrayList.add(zm.next());
        }
    }
}
