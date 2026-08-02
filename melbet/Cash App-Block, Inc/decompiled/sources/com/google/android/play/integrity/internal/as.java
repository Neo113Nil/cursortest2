package com.google.android.play.integrity.internal;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class as extends aq {
    public static final as a;
    public static final Object[] d;
    public final transient Object[] b;
    public final transient Object[] c;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        a = new as(objArr, objArr);
    }

    public as(Object[] objArr, Object[] objArr2) {
        this.b = objArr;
        this.c = objArr2;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int a(Object[] objArr) {
        System.arraycopy(this.b, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int b() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.c.length;
        return false;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final Object[] e() {
        return this.b;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ar arVar = this.a;
        if (arVar == null) {
            an anVar = ap.a;
            arVar = ar.a;
            this.a = arVar;
        }
        return arVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
