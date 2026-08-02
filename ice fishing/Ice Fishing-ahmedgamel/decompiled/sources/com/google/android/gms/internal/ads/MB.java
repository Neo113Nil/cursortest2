package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class MB {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f27056a;

    /* renamed from: b, reason: collision with root package name */
    public int f27057b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27058c;

    public MB(int i) {
        MA.q(i, "initialCapacity");
        this.f27056a = new Object[i];
        this.f27057b = 0;
    }

    public static int d(int i, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i4 <= i) {
            return i;
        }
        int i6 = i + (i >> 1) + 1;
        if (i6 < i4) {
            int highestOneBit = Integer.highestOneBit(i4 - 1);
            i6 = highestOneBit + highestOneBit;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f27056a;
        int i = this.f27057b;
        this.f27057b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof NB) {
                this.f27057b = ((NB) collection).h(this.f27056a, this.f27057b);
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
        int length = this.f27056a.length;
        int d9 = d(length, this.f27057b + i);
        if (d9 > length || this.f27058c) {
            this.f27056a = Arrays.copyOf(this.f27056a, d9);
            this.f27058c = false;
        }
    }
}
