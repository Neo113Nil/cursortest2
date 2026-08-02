package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.Wv;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.consent_sdk.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4350h2 implements Iterable, Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final C4350h2 f36450v = new C4350h2(AbstractC4393s2.f36514b);

    /* renamed from: n, reason: collision with root package name */
    public int f36451n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f36452u;

    static {
        int i = AbstractC4338e2.f36436a;
    }

    public C4350h2(byte[] bArr) {
        bArr.getClass();
        this.f36452u = bArr;
    }

    public static void f(int i) {
        if (((i - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(Wv.f(i, "End index: 47 >= "));
        }
    }

    public byte a(int i) {
        return this.f36452u[i];
    }

    public byte c(int i) {
        return this.f36452u[i];
    }

    public int d() {
        return this.f36452u.length;
    }

    public final boolean e(C4350h2 c4350h2) {
        if (!(c4350h2 instanceof C4350h2)) {
            return c4350h2.e(this);
        }
        int d9 = d();
        if (d9 > c4350h2.d()) {
            throw new IllegalArgumentException("Length too large: " + d9 + d());
        }
        if (d9 > c4350h2.d()) {
            throw new IllegalArgumentException(AbstractC5128c.c(d9, c4350h2.d(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = c4350h2.f36452u;
        int i = 0;
        int i4 = 0;
        while (i < d9) {
            if (this.f36452u[i] != bArr[i4]) {
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
        if (!(obj instanceof C4350h2)) {
            return false;
        }
        C4350h2 c4350h2 = (C4350h2) obj;
        int d9 = d();
        if (d9 != c4350h2.d()) {
            return false;
        }
        if (d9 == 0) {
            return true;
        }
        int i = this.f36451n;
        int i4 = c4350h2.f36451n;
        if (i == 0 || i4 == 0 || i == i4) {
            return e(c4350h2);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f36451n;
        if (i != 0) {
            return i;
        }
        int d9 = d();
        int i4 = d9;
        for (int i6 = 0; i6 < d9; i6++) {
            i4 = (i4 * 31) + this.f36452u[i6];
        }
        if (i4 == 0) {
            i4 = 1;
        }
        this.f36451n = i4;
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C4342f2(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d9 = d();
        if (d() <= 50) {
            concat = AbstractC4414y.b(this);
        } else {
            f(d());
            byte[] bArr = this.f36452u;
            C4346g2 c4346g2 = new C4346g2(bArr);
            f(bArr.length);
            concat = AbstractC4414y.b(c4346g2).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d9);
        sb.append(" contents=\"");
        return Wv.i(sb, concat, "\">");
    }
}
