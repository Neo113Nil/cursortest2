package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.xB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4146xB extends C3661oB implements ListIterator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C4200yB f34963x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4146xB(C4200yB c4200yB) {
        super(c4200yB);
        this.f34963x = c4200yB;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C4200yB c4200yB = this.f34963x;
        boolean isEmpty = c4200yB.isEmpty();
        a();
        ((ListIterator) this.f32867u).add(obj);
        c4200yB.f35130y.f31012x++;
        if (isEmpty) {
            c4200yB.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f32867u).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f32867u).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f32867u).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f32867u).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f32867u).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4146xB(C4200yB c4200yB, int i) {
        super(c4200yB, ((List) c4200yB.f35126u).listIterator(i));
        this.f34963x = c4200yB;
    }
}
