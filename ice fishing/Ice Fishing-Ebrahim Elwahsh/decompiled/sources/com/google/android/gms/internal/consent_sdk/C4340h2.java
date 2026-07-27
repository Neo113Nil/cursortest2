package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.CL;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.consent_sdk.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4340h2 implements Iterable, Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final C4340h2 f35844v = new C4340h2(AbstractC4383s2.f35908b);

    /* renamed from: n, reason: collision with root package name */
    public int f35845n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f35846u;

    static {
        int i = AbstractC4328e2.f35830a;
    }

    public C4340h2(byte[] bArr) {
        bArr.getClass();
        this.f35846u = bArr;
    }

    public static void f(int i) {
        if (((i - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(CL.i(i, "End index: 47 >= "));
        }
    }

    public byte a(int i) {
        return this.f35846u[i];
    }

    public byte c(int i) {
        return this.f35846u[i];
    }

    public int d() {
        return this.f35846u.length;
    }

    public final boolean e(C4340h2 c4340h2) {
        if (!(c4340h2 instanceof C4340h2)) {
            return c4340h2.e(this);
        }
        int d2 = d();
        if (d2 > c4340h2.d()) {
            throw new IllegalArgumentException("Length too large: " + d2 + d());
        }
        if (d2 > c4340h2.d()) {
            throw new IllegalArgumentException(AbstractC5051n.c(d2, c4340h2.d(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = c4340h2.f35846u;
        int i = 0;
        int i4 = 0;
        while (i < d2) {
            if (this.f35846u[i] != bArr[i4]) {
                return false;
            }
            i++;
            i4++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4340h2)) {
            return false;
        }
        C4340h2 c4340h2 = (C4340h2) obj;
        int d2 = d();
        if (d2 != c4340h2.d()) {
            return false;
        }
        if (d2 == 0) {
            return true;
        }
        int i = this.f35845n;
        int i4 = c4340h2.f35845n;
        if (i == 0 || i4 == 0 || i == i4) {
            return e(c4340h2);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f35845n;
        if (i != 0) {
            return i;
        }
        int d2 = d();
        int i4 = d2;
        for (int i9 = 0; i9 < d2; i9++) {
            i4 = (i4 * 31) + this.f35846u[i9];
        }
        if (i4 == 0) {
            i4 = 1;
        }
        this.f35845n = i4;
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C4332f2(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d2 = d();
        if (d() <= 50) {
            concat = AbstractC4404y.b(this);
        } else {
            f(d());
            byte[] bArr = this.f35846u;
            C4336g2 c4336g2 = new C4336g2(bArr);
            f(bArr.length);
            concat = AbstractC4404y.b(c4336g2).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d2);
        sb.append(" contents=\"");
        return AbstractC5051n.g(sb, concat, "\">");
    }
}
