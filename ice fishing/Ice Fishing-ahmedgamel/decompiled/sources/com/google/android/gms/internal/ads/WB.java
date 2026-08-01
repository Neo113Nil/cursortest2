package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class WB extends MB {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f28322d;

    /* renamed from: e, reason: collision with root package name */
    public int f28323e;

    @Override // com.google.android.gms.internal.ads.MB
    public final /* bridge */ /* synthetic */ MB c(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.f28322d != null) {
            int j6 = XB.j(this.f26266b);
            Object[] objArr = this.f28322d;
            if (j6 <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int n9 = AbstractC2639Kg.n(hashCode);
                while (true) {
                    int i = n9 & length;
                    Object[] objArr2 = this.f28322d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f28323e += hashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        n9 = i + 1;
                    }
                }
            }
        }
        this.f28322d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.f28322d == null) {
            b(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final XB h() {
        XB o6;
        int i = this.f26266b;
        if (i == 0) {
            return C3823rC.f33537C;
        }
        if (i == 1) {
            Object obj = this.f26265a[0];
            Objects.requireNonNull(obj);
            return new YB(obj);
        }
        if (this.f28322d == null || XB.j(i) != this.f28322d.length) {
            o6 = XB.o(this.f26265a, this.f26266b);
            this.f26266b = o6.size();
        } else {
            int i6 = this.f26266b;
            Object[] objArr = this.f26265a;
            int length = objArr.length;
            if (i6 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i6);
            }
            o6 = new C3823rC(this.f28323e, r8.length - 1, this.f26266b, objArr, this.f28322d);
        }
        this.f26267c = true;
        this.f28322d = null;
        return o6;
    }
}
