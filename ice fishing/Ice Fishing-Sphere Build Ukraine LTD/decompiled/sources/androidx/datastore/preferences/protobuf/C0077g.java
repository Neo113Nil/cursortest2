package androidx.datastore.preferences.protobuf;

import a.AbstractC0069a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0077g implements Iterable, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final C0077g f1435g = new C0077g(AbstractC0094y.f1511b);

    /* renamed from: h, reason: collision with root package name */
    public static final C0075e f1436h;

    /* renamed from: e, reason: collision with root package name */
    public int f1437e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f1438f;

    static {
        f1436h = AbstractC0073c.a() ? new C0075e(1) : new C0075e(0);
    }

    public C0077g(byte[] bArr) {
        bArr.getClass();
        this.f1438f = bArr;
    }

    public static int b(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static C0077g c(byte[] bArr, int i2, int i3) {
        byte[] copyOfRange;
        b(i2, i2 + i3, bArr.length);
        switch (f1436h.f1432a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i2, i3 + i2);
                break;
            default:
                copyOfRange = new byte[i3];
                System.arraycopy(bArr, i2, copyOfRange, 0, i3);
                break;
        }
        return new C0077g(copyOfRange);
    }

    public byte a(int i2) {
        return this.f1438f[i2];
    }

    public void d(byte[] bArr, int i2) {
        System.arraycopy(this.f1438f, 0, bArr, 0, i2);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0077g) || size() != ((C0077g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0077g)) {
            return obj.equals(this);
        }
        C0077g c0077g = (C0077g) obj;
        int i2 = this.f1437e;
        int i3 = c0077g.f1437e;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int size = size();
        if (size > c0077g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0077g.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0077g.size());
        }
        int e2 = e() + size;
        int e3 = e();
        int e4 = c0077g.e();
        while (e3 < e2) {
            if (this.f1438f[e3] != c0077g.f1438f[e4]) {
                return false;
            }
            e3++;
            e4++;
        }
        return true;
    }

    public byte f(int i2) {
        return this.f1438f[i2];
    }

    public final int hashCode() {
        int i2 = this.f1437e;
        if (i2 == 0) {
            int size = size();
            int e2 = e();
            int i3 = size;
            for (int i4 = e2; i4 < e2 + size; i4++) {
                i3 = (i3 * 31) + this.f1438f[i4];
            }
            i2 = i3 == 0 ? 1 : i3;
            this.f1437e = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0074d(this);
    }

    public int size() {
        return this.f1438f.length;
    }

    public final String toString() {
        C0077g c0076f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = AbstractC0069a.n(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int b2 = b(0, 47, size());
            if (b2 == 0) {
                c0076f = f1435g;
            } else {
                c0076f = new C0076f(this.f1438f, e(), b2);
            }
            sb2.append(AbstractC0069a.n(c0076f));
            sb2.append("...");
            sb = sb2.toString();
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + sb + "\">";
    }
}
