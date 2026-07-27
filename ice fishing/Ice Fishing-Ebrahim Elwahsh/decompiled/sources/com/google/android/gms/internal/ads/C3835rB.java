package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3835rB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33982n = 2;

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f33983u;

    /* renamed from: v, reason: collision with root package name */
    public Object f33984v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f33985w;

    public C3835rB(C3889sB c3889sB) {
        Objects.requireNonNull(c3889sB);
        this.f33985w = c3889sB;
        this.f33983u = c3889sB.f34209v.entrySet().iterator();
    }

    public void a() {
        BB bb = (BB) this.f33985w;
        bb.a();
        if (bb.f24003u != ((Collection) this.f33984v)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f33982n) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f33983u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f33982n) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f33983u.next();
                this.f33984v = (Collection) entry.getValue();
                return ((C3889sB) this.f33985w).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f33983u.next();
                this.f33984v = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f33983u.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f33982n) {
            case 0:
                PA.U("no calls to next() since the last call to remove()", ((Collection) this.f33984v) != null);
                this.f33983u.remove();
                ((C3889sB) this.f33985w).f34210w.f32552x -= ((Collection) this.f33984v).size();
                ((Collection) this.f33984v).clear();
                this.f33984v = null;
                break;
            case 1:
                PA.U("no calls to next() since the last call to remove()", ((Map.Entry) this.f33984v) != null);
                Collection collection = (Collection) ((Map.Entry) this.f33984v).getValue();
                this.f33983u.remove();
                ((C3943tB) this.f33985w).f34376u.f32552x -= collection.size();
                collection.clear();
                this.f33984v = null;
                break;
            default:
                this.f33983u.remove();
                BB bb = (BB) this.f33985w;
                C3513lC c3513lC = bb.f24006x;
                c3513lC.f32552x--;
                bb.c();
                break;
        }
    }

    public C3835rB(C3943tB c3943tB, Iterator it) {
        this.f33983u = it;
        this.f33985w = c3943tB;
    }

    public C3835rB(BB bb) {
        Iterator it;
        this.f33985w = bb;
        Collection collection = bb.f24003u;
        this.f33984v = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f33983u = it;
    }

    public C3835rB(BB bb, ListIterator listIterator) {
        this.f33985w = bb;
        this.f33984v = bb.f24003u;
        this.f33983u = listIterator;
    }
}
