package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.xB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4169xB extends C3684oB implements ListIterator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C4223yB f35744x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4169xB(C4223yB c4223yB) {
        super(c4223yB);
        this.f35744x = c4223yB;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C4223yB c4223yB = this.f35744x;
        boolean isEmpty = c4223yB.isEmpty();
        a();
        ((ListIterator) this.f33654u).add(obj);
        c4223yB.f35916y.f31785x++;
        if (isEmpty) {
            c4223yB.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f33654u).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f33654u).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f33654u).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f33654u).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f33654u).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4169xB(C4223yB c4223yB, int i) {
        super(c4223yB, ((List) c4223yB.f35912u).listIterator(i));
        this.f35744x = c4223yB;
    }
}
