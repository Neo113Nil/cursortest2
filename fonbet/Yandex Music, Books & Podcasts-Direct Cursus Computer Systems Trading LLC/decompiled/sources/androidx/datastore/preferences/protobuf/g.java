package androidx.datastore.preferences.protobuf;

import defpackage.dfi;
import defpackage.e7o;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.tiu;
import defpackage.wvs;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g implements Iterable<Byte>, Serializable {
    public static final g b = new e(u.b);
    public static final c c;
    public int a;

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            byte b;
            androidx.datastore.preferences.protobuf.f fVar = (androidx.datastore.preferences.protobuf.f) this;
            int i = fVar.a;
            if (i < fVar.b) {
                fVar.a = i + 1;
                b = fVar.c.n(i);
            } else {
                wvs.n();
                b = 0;
            }
            return Byte.valueOf(b);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements c {
        @Override // androidx.datastore.preferences.protobuf.g.c
        public final byte[] b(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public interface c {
        byte[] b(byte[] bArr, int i, int i2);
    }

    public static abstract class d extends g {
        @Override // java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new androidx.datastore.preferences.protobuf.f(this);
        }
    }

    public static class e extends d {
        private static final long serialVersionUID = 1;
        public final byte[] d;

        public e(byte[] bArr) {
            this.a = 0;
            bArr.getClass();
            this.d = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte a(int i) {
            return this.d[i];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof e)) {
                return obj.equals(this);
            }
            e eVar = (e) obj;
            int i = this.a;
            int i2 = eVar.a;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > eVar.size()) {
                tiu.e(size, size());
                return false;
            }
            if (size > eVar.size()) {
                androidx.core.app.q.j(eVar.size(), k5r.q(size, "Ran off end of other: 0, ", ", "));
                return false;
            }
            byte[] bArr = eVar.d;
            int o = o() + size;
            int o2 = o();
            int o3 = eVar.o();
            while (o2 < o) {
                if (this.d[o2] != bArr[o3]) {
                    return false;
                }
                o2++;
                o3++;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte n(int i) {
            return this.d[i];
        }

        public int o() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.d.length;
        }
    }

    public static final class f implements c {
        @Override // androidx.datastore.preferences.protobuf.g.c
        public final byte[] b(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        c = androidx.datastore.preferences.protobuf.d.a() ? new f() : new b();
    }

    public static g g(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) < 0) {
            if (i < 0) {
                e7o.o(dfi.c(i, "Beginning index: ", " < 0"));
            } else if (i3 < i) {
                e7o.o(f1d.e(i, i3, "Beginning index larger than ending index: ", ", "));
            } else {
                e7o.o(f1d.e(i3, length, "End index: ", " >= "));
            }
        }
        return new e(c.b(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        e eVar = (e) this;
        int o = eVar.o();
        int i2 = size;
        for (int i3 = o; i3 < o + size; i3++) {
            i2 = (i2 * 31) + eVar.d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    public abstract byte n(int i);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
