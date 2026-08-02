package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class WB extends MB {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f29120d;

    /* renamed from: e, reason: collision with root package name */
    public int f29121e;

    @Override // com.google.android.gms.internal.ads.MB
    public final /* bridge */ /* synthetic */ MB c(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.f29120d != null) {
            int j6 = XB.j(this.f27057b);
            Object[] objArr = this.f29120d;
            if (j6 <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int n9 = AbstractC2659Kg.n(hashCode);
                while (true) {
                    int i = n9 & length;
                    Object[] objArr2 = this.f29120d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f29121e += hashCode;
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
        this.f29120d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.f29120d == null) {
            b(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final XB h() {
        XB o4;
        int i = this.f27057b;
        if (i == 0) {
            return C3846rC.f34305C;
        }
        if (i == 1) {
            Object obj = this.f27056a[0];
            Objects.requireNonNull(obj);
            return new YB(obj);
        }
        if (this.f29120d == null || XB.j(i) != this.f29120d.length) {
            o4 = XB.o(this.f27056a, this.f27057b);
            this.f27057b = o4.size();
        } else {
            int i4 = this.f27057b;
            Object[] objArr = this.f27056a;
            int length = objArr.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            o4 = new C3846rC(this.f29121e, r8.length - 1, this.f27057b, objArr, this.f29120d);
        }
        this.f27058c = true;
        this.f29120d = null;
        return o4;
    }
}
