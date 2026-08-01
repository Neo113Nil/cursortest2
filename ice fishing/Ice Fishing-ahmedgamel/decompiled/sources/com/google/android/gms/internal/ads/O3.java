package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class O3 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3922t3[] f26586a;

    public O3(InterfaceC3922t3... interfaceC3922t3Arr) {
        this.f26586a = interfaceC3922t3Arr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r11.a(r5) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3500lC a(Class cls, XA xa) {
        InterfaceC3922t3 interfaceC3922t3;
        PB pb = RB.f27177u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        for (InterfaceC3922t3 interfaceC3922t32 : this.f26586a) {
            if (cls.isAssignableFrom(interfaceC3922t32.getClass())) {
                interfaceC3922t3 = (InterfaceC3922t3) cls.cast(interfaceC3922t32);
            }
            interfaceC3922t3 = null;
            if (interfaceC3922t3 != null) {
                int length = objArr.length;
                int i6 = i + 1;
                int d2 = MB.d(length, i6);
                if (d2 > length) {
                    objArr = Arrays.copyOf(objArr, d2);
                }
                objArr[i] = interfaceC3922t3;
                i = i6;
            }
        }
        return RB.p(objArr, i);
    }

    public final O3 b(O3 o32) {
        return o32 == null ? this : c(o32.f26586a);
    }

    public final O3 c(InterfaceC3922t3... interfaceC3922t3Arr) {
        int length = interfaceC3922t3Arr.length;
        if (length == 0) {
            return this;
        }
        String str = AbstractC3159eu.f29993a;
        InterfaceC3922t3[] interfaceC3922t3Arr2 = this.f26586a;
        int length2 = interfaceC3922t3Arr2.length;
        Object[] copyOf = Arrays.copyOf(interfaceC3922t3Arr2, length2 + length);
        System.arraycopy(interfaceC3922t3Arr, 0, copyOf, length2, length);
        return new O3((InterfaceC3922t3[]) copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && O3.class == obj.getClass() && Arrays.equals(this.f26586a, ((O3) obj).f26586a);
    }

    public final int hashCode() {
        return Long.hashCode(com.anythink.basead.exoplayer.b.f6382b) + (Arrays.hashCode(this.f26586a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f26586a);
        return D.y.s(new StringBuilder(String.valueOf(arrays).length() + 8), "entries=", arrays, "");
    }

    public O3(List list) {
        this.f26586a = (InterfaceC3922t3[]) list.toArray(new InterfaceC3922t3[0]);
    }
}
