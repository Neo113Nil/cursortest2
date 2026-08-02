package yads;

import defpackage.oaa1;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes7.dex */
public final class s31 extends t31 {
    public final transient int c;
    public final /* synthetic */ t31 f;
    public final transient int w;

    public s31(t31 t31Var, int i, int i2) {
        this.f = t31Var;
        this.c = i;
        this.w = i2;
    }

    @Override // yads.n31
    public final Object[] f() {
        return this.f.f();
    }

    @Override // yads.n31
    public final int g() {
        return this.f.h() + this.c + this.w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oaa1.f(i, this.w);
        return this.f.get(i + this.c);
    }

    @Override // yads.n31
    public final int h() {
        return this.f.h() + this.c;
    }

    @Override // yads.n31
    public final boolean i() {
        return true;
    }

    @Override // yads.t31, yads.n31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // yads.t31, java.util.List
    /* renamed from: l */
    public final t31 subList(int i, int i2) {
        oaa1.g(i, i2, this.w);
        t31 t31Var = this.f;
        int i3 = this.c;
        return t31Var.subList(i + i3, i2 + i3);
    }

    @Override // yads.t31, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }

    @Override // yads.t31, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
