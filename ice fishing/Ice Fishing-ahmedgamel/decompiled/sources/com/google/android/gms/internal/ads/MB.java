package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class MB {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f26265a;

    /* renamed from: b, reason: collision with root package name */
    public int f26266b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26267c;

    public MB(int i) {
        MA.q(i, "initialCapacity");
        this.f26265a = new Object[i];
        this.f26266b = 0;
    }

    public static int d(int i, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i6 <= i) {
            return i;
        }
        int i9 = i + (i >> 1) + 1;
        if (i9 < i6) {
            int highestOneBit = Integer.highestOneBit(i6 - 1);
            i9 = highestOneBit + highestOneBit;
        }
        if (i9 < 0) {
            return Integer.MAX_VALUE;
        }
        return i9;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f26265a;
        int i = this.f26266b;
        this.f26266b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof NB) {
                this.f26266b = ((NB) collection).h(this.f26265a, this.f26266b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public abstract MB c(Object obj);

    public final void e(int i) {
        int length = this.f26265a.length;
        int d2 = d(length, this.f26266b + i);
        if (d2 > length || this.f26267c) {
            this.f26265a = Arrays.copyOf(this.f26265a, d2);
            this.f26267c = false;
        }
    }
}
