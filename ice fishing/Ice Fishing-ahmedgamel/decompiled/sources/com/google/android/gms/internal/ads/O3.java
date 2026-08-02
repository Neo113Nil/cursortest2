package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class O3 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3945t3[] f27368a;

    public O3(InterfaceC3945t3... interfaceC3945t3Arr) {
        this.f27368a = interfaceC3945t3Arr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r11.a(r5) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3523lC a(Class cls, XA xa) {
        InterfaceC3945t3 interfaceC3945t3;
        PB pb = RB.f27933u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        for (InterfaceC3945t3 interfaceC3945t32 : this.f27368a) {
            if (cls.isAssignableFrom(interfaceC3945t32.getClass())) {
                interfaceC3945t3 = (InterfaceC3945t3) cls.cast(interfaceC3945t32);
            }
            interfaceC3945t3 = null;
            if (interfaceC3945t3 != null) {
                int length = objArr.length;
                int i4 = i + 1;
                int d9 = MB.d(length, i4);
                if (d9 > length) {
                    objArr = Arrays.copyOf(objArr, d9);
                }
                objArr[i] = interfaceC3945t3;
                i = i4;
            }
        }
        return RB.p(objArr, i);
    }

    public final O3 b(O3 o32) {
        return o32 == null ? this : c(o32.f27368a);
    }

    public final O3 c(InterfaceC3945t3... interfaceC3945t3Arr) {
        int length = interfaceC3945t3Arr.length;
        if (length == 0) {
            return this;
        }
        String str = AbstractC3182eu.f30782a;
        InterfaceC3945t3[] interfaceC3945t3Arr2 = this.f27368a;
        int length2 = interfaceC3945t3Arr2.length;
        Object[] copyOf = Arrays.copyOf(interfaceC3945t3Arr2, length2 + length);
        System.arraycopy(interfaceC3945t3Arr, 0, copyOf, length2, length);
        return new O3((InterfaceC3945t3[]) copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && O3.class == obj.getClass() && Arrays.equals(this.f27368a, ((O3) obj).f27368a);
    }

    public final int hashCode() {
        return Long.hashCode(com.anythink.basead.exoplayer.b.f7168b) + (Arrays.hashCode(this.f27368a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f27368a);
        return D.x.p(new StringBuilder(String.valueOf(arrays).length() + 8), "entries=", arrays, "");
    }

    public O3(List list) {
        this.f27368a = (InterfaceC3945t3[]) list.toArray(new InterfaceC3945t3[0]);
    }
}
