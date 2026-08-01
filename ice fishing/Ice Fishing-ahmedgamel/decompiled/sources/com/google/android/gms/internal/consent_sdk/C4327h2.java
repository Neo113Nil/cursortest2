package com.google.android.gms.internal.consent_sdk;

import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.consent_sdk.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4327h2 implements Iterable, Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final C4327h2 f35681v = new C4327h2(AbstractC4370s2.f35745b);

    /* renamed from: n, reason: collision with root package name */
    public int f35682n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f35683u;

    static {
        int i = AbstractC4315e2.f35667a;
    }

    public C4327h2(byte[] bArr) {
        bArr.getClass();
        this.f35683u = bArr;
    }

    public static void f(int i) {
        if (((i - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(AbstractC4404f.e(i, "End index: 47 >= "));
        }
    }

    public byte a(int i) {
        return this.f35683u[i];
    }

    public byte c(int i) {
        return this.f35683u[i];
    }

    public int d() {
        return this.f35683u.length;
    }

    public final boolean e(C4327h2 c4327h2) {
        if (!(c4327h2 instanceof C4327h2)) {
            return c4327h2.e(this);
        }
        int d2 = d();
        if (d2 > c4327h2.d()) {
            throw new IllegalArgumentException("Length too large: " + d2 + d());
        }
        if (d2 > c4327h2.d()) {
            throw new IllegalArgumentException(u1.h.c(d2, c4327h2.d(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = c4327h2.f35683u;
        int i = 0;
        int i6 = 0;
        while (i < d2) {
            if (this.f35683u[i] != bArr[i6]) {
                return false;
            }
            i++;
            i6++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4327h2)) {
            return false;
        }
        C4327h2 c4327h2 = (C4327h2) obj;
        int d2 = d();
        if (d2 != c4327h2.d()) {
            return false;
        }
        if (d2 == 0) {
            return true;
        }
        int i = this.f35682n;
        int i6 = c4327h2.f35682n;
        if (i == 0 || i6 == 0 || i == i6) {
            return e(c4327h2);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f35682n;
        if (i != 0) {
            return i;
        }
        int d2 = d();
        int i6 = d2;
        for (int i9 = 0; i9 < d2; i9++) {
            i6 = (i6 * 31) + this.f35683u[i9];
        }
        if (i6 == 0) {
            i6 = 1;
        }
        this.f35682n = i6;
        return i6;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C4319f2(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d2 = d();
        if (d() <= 50) {
            concat = AbstractC4391y.b(this);
        } else {
            f(d());
            byte[] bArr = this.f35683u;
            C4323g2 c4323g2 = new C4323g2(bArr);
            f(bArr.length);
            concat = AbstractC4391y.b(c4323g2).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d2);
        sb.append(" contents=\"");
        return u1.h.g(sb, concat, "\">");
    }
}
