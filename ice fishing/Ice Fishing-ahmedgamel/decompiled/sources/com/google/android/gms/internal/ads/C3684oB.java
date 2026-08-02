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
public class C3684oB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33653n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f33654u;

    /* renamed from: v, reason: collision with root package name */
    public Object f33655v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f33656w;

    public C3684oB(C3738pB c3738pB) {
        Objects.requireNonNull(c3738pB);
        this.f33656w = c3738pB;
        this.f33654u = c3738pB.f33827v.entrySet().iterator();
    }

    public void a() {
        C4223yB c4223yB = (C4223yB) this.f33656w;
        c4223yB.a();
        if (c4223yB.f35912u != ((Collection) this.f33655v)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f33653n) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f33654u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f33653n) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f33654u.next();
                this.f33655v = (Collection) entry.getValue();
                return ((C3738pB) this.f33656w).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f33654u.next();
                this.f33655v = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f33654u.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f33653n) {
            case 0:
                AbstractC2792Sd.I("no calls to next() since the last call to remove()", ((Collection) this.f33655v) != null);
                this.f33654u.remove();
                ((C3738pB) this.f33656w).f33828w.f31785x -= ((Collection) this.f33655v).size();
                ((Collection) this.f33655v).clear();
                this.f33655v = null;
                break;
            case 1:
                AbstractC2792Sd.I("no calls to next() since the last call to remove()", ((Map.Entry) this.f33655v) != null);
                Collection collection = (Collection) ((Map.Entry) this.f33655v).getValue();
                this.f33654u.remove();
                ((C3792qB) this.f33656w).f33992u.f31785x -= collection.size();
                collection.clear();
                this.f33655v = null;
                break;
            default:
                this.f33654u.remove();
                C4223yB c4223yB = (C4223yB) this.f33656w;
                C3363iC c3363iC = c4223yB.f35915x;
                c3363iC.f31785x--;
                c4223yB.c();
                break;
        }
    }

    public C3684oB(C3792qB c3792qB, Iterator it) {
        this.f33654u = it;
        this.f33656w = c3792qB;
    }

    public C3684oB(C4223yB c4223yB) {
        Iterator it;
        this.f33656w = c4223yB;
        Collection collection = c4223yB.f35912u;
        this.f33655v = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f33654u = it;
    }

    public C3684oB(C4223yB c4223yB, ListIterator listIterator) {
        this.f33656w = c4223yB;
        this.f33655v = c4223yB.f35912u;
        this.f33654u = listIterator;
    }
}
