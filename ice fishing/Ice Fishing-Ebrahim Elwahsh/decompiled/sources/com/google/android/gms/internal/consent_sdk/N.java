package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class N extends K {

    /* renamed from: A, reason: collision with root package name */
    public static final Object[] f35734A;

    /* renamed from: B, reason: collision with root package name */
    public static final N f35735B;

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f35736v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f35737w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f35738x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f35739y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f35740z;

    static {
        Object[] objArr = new Object[0];
        f35734A = objArr;
        f35735B = new N(0, 0, 0, objArr, objArr);
    }

    public N(int i, int i4, int i9, Object[] objArr, Object[] objArr2) {
        this.f35736v = objArr;
        this.f35737w = i;
        this.f35738x = objArr2;
        this.f35739y = i4;
        this.f35740z = i9;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f35736v;
        int i = this.f35740z;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int c() {
        return this.f35740z;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f35738x;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = rotateLeft & this.f35739y;
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
        return this.f35736v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.K, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f35737w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        J j9 = this.f35718u;
        if (j9 == null) {
            H h9 = J.f35695u;
            int i = this.f35740z;
            j9 = i == 0 ? M.f35731x : new M(this.f35736v, i);
            this.f35718u = j9;
        }
        return j9.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f35740z;
    }
}
