package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.oB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3661oB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32866n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f32867u;

    /* renamed from: v, reason: collision with root package name */
    public Object f32868v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f32869w;

    public C3661oB(C3715pB c3715pB) {
        Objects.requireNonNull(c3715pB);
        this.f32869w = c3715pB;
        this.f32867u = c3715pB.f33037v.entrySet().iterator();
    }

    public void a() {
        C4200yB c4200yB = (C4200yB) this.f32869w;
        c4200yB.a();
        if (c4200yB.f35126u != ((Collection) this.f32868v)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f32866n) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f32867u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f32866n) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f32867u.next();
                this.f32868v = (Collection) entry.getValue();
                return ((C3715pB) this.f32869w).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f32867u.next();
                this.f32868v = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f32867u.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f32866n) {
            case 0:
                AbstractC2772Sd.I("no calls to next() since the last call to remove()", ((Collection) this.f32868v) != null);
                this.f32867u.remove();
                ((C3715pB) this.f32869w).f33038w.f31012x -= ((Collection) this.f32868v).size();
                ((Collection) this.f32868v).clear();
                this.f32868v = null;
                break;
            case 1:
                AbstractC2772Sd.I("no calls to next() since the last call to remove()", ((Map.Entry) this.f32868v) != null);
                Collection collection = (Collection) ((Map.Entry) this.f32868v).getValue();
                this.f32867u.remove();
                ((C3769qB) this.f32869w).f33208u.f31012x -= collection.size();
                collection.clear();
                this.f32868v = null;
                break;
            default:
                this.f32867u.remove();
                C4200yB c4200yB = (C4200yB) this.f32869w;
                C3340iC c3340iC = c4200yB.f35129x;
                c3340iC.f31012x--;
                c4200yB.c();
                break;
        }
    }

    public C3661oB(C3769qB c3769qB, Iterator it) {
        this.f32867u = it;
        this.f32869w = c3769qB;
    }

    public C3661oB(C4200yB c4200yB) {
        Iterator it;
        this.f32869w = c4200yB;
        Collection collection = c4200yB.f35126u;
        this.f32868v = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f32867u = it;
    }

    public C3661oB(C4200yB c4200yB, ListIterator listIterator) {
        this.f32869w = c4200yB;
        this.f32868v = c4200yB.f35126u;
        this.f32867u = listIterator;
    }
}
