package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0107g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0107g f2387c = new C0107g(AbstractC0124y.f2463b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0105e f2388d;

    /* renamed from: a, reason: collision with root package name */
    public int f2389a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2390b;

    static {
        f2388d = AbstractC0103c.a() ? new C0105e(1) : new C0105e(0);
    }

    public C0107g(byte[] bArr) {
        bArr.getClass();
        this.f2390b = bArr;
    }

    public static int b(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C1.a.g(i2, "Beginning index: ", " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(C1.a.h("Beginning index larger than ending index: ", i2, i3, ", "));
        }
        throw new IndexOutOfBoundsException(C1.a.h("End index: ", i3, i4, " >= "));
    }

    public static C0107g c(byte[] bArr, int i2, int i3) {
        byte[] copyOfRange;
        b(i2, i2 + i3, bArr.length);
        switch (f2388d.f2384a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i2, i3 + i2);
                break;
            default:
                copyOfRange = new byte[i3];
                System.arraycopy(bArr, i2, copyOfRange, 0, i3);
                break;
        }
        return new C0107g(copyOfRange);
    }

    public byte a(int i2) {
        return this.f2390b[i2];
    }

    public void d(int i2, byte[] bArr) {
        System.arraycopy(this.f2390b, 0, bArr, 0, i2);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0107g) || size() != ((C0107g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0107g)) {
            return obj.equals(this);
        }
        C0107g c0107g = (C0107g) obj;
        int i2 = this.f2389a;
        int i3 = c0107g.f2389a;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int size = size();
        if (size > c0107g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0107g.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0107g.size());
        }
        int e2 = e() + size;
        int e3 = e();
        int e4 = c0107g.e();
        while (e3 < e2) {
            if (this.f2390b[e3] != c0107g.f2390b[e4]) {
                return false;
            }
            e3++;
            e4++;
        }
        return true;
    }

    public byte f(int i2) {
        return this.f2390b[i2];
    }

    public final int hashCode() {
        int i2 = this.f2389a;
        if (i2 == 0) {
            int size = size();
            int e2 = e();
            int i3 = size;
            for (int i4 = e2; i4 < e2 + size; i4++) {
                i3 = (i3 * 31) + this.f2390b[i4];
            }
            i2 = i3 == 0 ? 1 : i3;
            this.f2389a = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0104d(this);
    }

    public int size() {
        return this.f2390b.length;
    }

    public final String toString() {
        C0107g c0106f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = R1.l.n(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int b2 = b(0, 47, size());
            if (b2 == 0) {
                c0106f = f2387c;
            } else {
                c0106f = new C0106f(this.f2390b, e(), b2);
            }
            sb2.append(R1.l.n(c0106f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return C1.a.k(sb3, sb, "\">");
    }
}
