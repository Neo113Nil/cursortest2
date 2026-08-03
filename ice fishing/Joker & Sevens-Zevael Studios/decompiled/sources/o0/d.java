package o0;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements ListIterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final Object f5132g;

    /* renamed from: h, reason: collision with root package name */
    public int f5133h;

    public d(int i10, List list) {
        this.f5132g = list;
        this.f5133h = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f5132g.add(this.f5133h, obj);
        this.f5133h++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5133h < this.f5132g.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5133h > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f5133h;
        this.f5133h = i10 + 1;
        return this.f5132g.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5133h;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f5133h - 1;
        this.f5133h = i10;
        return this.f5132g.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5133h - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f5133h - 1;
        this.f5133h = i10;
        this.f5132g.remove(i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f5132g.set(this.f5133h, obj);
    }
}
