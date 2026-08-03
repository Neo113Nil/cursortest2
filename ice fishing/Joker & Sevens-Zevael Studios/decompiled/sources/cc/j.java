package cc;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends bc.h implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final j f1332h;

    /* renamed from: g, reason: collision with root package name */
    public final g f1333g;

    static {
        g gVar = g.f1314t;
        f1332h = new j(g.f1314t);
    }

    public j(g gVar) {
        pc.j.e(gVar, "backing");
        this.f1333g = gVar;
    }

    @Override // bc.h
    public final int a() {
        return this.f1333g.f1323o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f1333g.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        pc.j.e(collection, "elements");
        this.f1333g.d();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f1333g.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f1333g.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1333g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g gVar = this.f1333g;
        gVar.getClass();
        return new d(gVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g gVar = this.f1333g;
        gVar.d();
        int i10 = gVar.i(obj);
        if (i10 < 0) {
            return false;
        }
        gVar.m(i10);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        pc.j.e(collection, "elements");
        this.f1333g.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        pc.j.e(collection, "elements");
        this.f1333g.d();
        return super.retainAll(collection);
    }

    public j() {
        this(new g());
    }
}
