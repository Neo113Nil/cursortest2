package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.rC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3846rC extends XB {

    /* renamed from: B, reason: collision with root package name */
    public static final Object[] f34304B;

    /* renamed from: C, reason: collision with root package name */
    public static final C3846rC f34305C;

    /* renamed from: A, reason: collision with root package name */
    public final transient int f34306A;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f34307w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f34308x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f34309y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f34310z;

    static {
        Object[] objArr = new Object[0];
        f34304B = objArr;
        f34305C = new C3846rC(0, 0, 0, objArr, objArr);
    }

    public C3846rC(int i, int i4, int i6, Object[] objArr, Object[] objArr2) {
        this.f34307w = objArr;
        this.f34308x = i;
        this.f34309y = objArr2;
        this.f34310z = i4;
        this.f34306A = i6;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final AbstractC4278zC a() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final Object[] c() {
        return this.f34307w;
    }

    @Override // com.google.android.gms.internal.ads.NB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f34309y;
            if (objArr.length != 0) {
                int o4 = AbstractC2659Kg.o(obj);
                while (true) {
                    int i = o4 & this.f34310z;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    o4 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int e() {
        return this.f34306A;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int h(Object[] objArr, int i) {
        Object[] objArr2 = this.f34307w;
        int i4 = this.f34306A;
        System.arraycopy(objArr2, 0, objArr, i, i4);
        return i + i4;
    }

    @Override // com.google.android.gms.internal.ads.XB, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f34308x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.XB
    public final RB m() {
        return RB.p(this.f34307w, this.f34306A);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34306A;
    }
}
