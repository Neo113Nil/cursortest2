package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class N extends K {

    /* renamed from: A, reason: collision with root package name */
    public static final Object[] f36340A;

    /* renamed from: B, reason: collision with root package name */
    public static final N f36341B;

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f36342v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f36343w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f36344x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f36345y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f36346z;

    static {
        Object[] objArr = new Object[0];
        f36340A = objArr;
        f36341B = new N(0, 0, 0, objArr, objArr);
    }

    public N(int i, int i4, int i6, Object[] objArr, Object[] objArr2) {
        this.f36342v = objArr;
        this.f36343w = i;
        this.f36344x = objArr2;
        this.f36345y = i4;
        this.f36346z = i6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f36342v;
        int i = this.f36346z;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int c() {
        return this.f36346z;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f36344x;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = rotateLeft & this.f36345y;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i + 1;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final Object[] e() {
        return this.f36342v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.K, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f36343w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        J j6 = this.f36324u;
        if (j6 == null) {
            H h3 = J.f36301u;
            int i = this.f36346z;
            j6 = i == 0 ? M.f36337x : new M(this.f36342v, i);
            this.f36324u = j6;
        }
        return j6.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f36346z;
    }
}
