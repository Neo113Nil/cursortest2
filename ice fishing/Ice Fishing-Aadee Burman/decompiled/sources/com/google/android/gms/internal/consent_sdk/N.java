package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class N extends K {

    /* renamed from: A, reason: collision with root package name */
    public static final Object[] f35571A;

    /* renamed from: B, reason: collision with root package name */
    public static final N f35572B;

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f35573v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f35574w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f35575x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f35576y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f35577z;

    static {
        Object[] objArr = new Object[0];
        f35571A = objArr;
        f35572B = new N(0, 0, 0, objArr, objArr);
    }

    public N(int i, int i6, int i9, Object[] objArr, Object[] objArr2) {
        this.f35573v = objArr;
        this.f35574w = i;
        this.f35575x = objArr2;
        this.f35576y = i6;
        this.f35577z = i9;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f35573v;
        int i = this.f35577z;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int c() {
        return this.f35577z;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f35575x;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = rotateLeft & this.f35576y;
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
        return this.f35573v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.K, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f35574w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        J j6 = this.f35555u;
        if (j6 == null) {
            H h9 = J.f35532u;
            int i = this.f35577z;
            j6 = i == 0 ? M.f35568x : new M(this.f35573v, i);
            this.f35555u = j6;
        }
        return j6.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f35577z;
    }
}
