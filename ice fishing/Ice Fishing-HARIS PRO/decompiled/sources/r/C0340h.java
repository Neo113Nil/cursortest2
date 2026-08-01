package r;

import java.util.Arrays;
import s.AbstractC0346a;

/* renamed from: r.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340h implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f4314a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f4315b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f4316c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f4317d;

    public C0340h() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f4315b = new long[i4];
        this.f4316c = new Object[i4];
    }

    public final void a() {
        int i = this.f4317d;
        Object[] objArr = this.f4316c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f4317d = 0;
        this.f4314a = false;
    }

    public final Object b(long j) {
        Object obj;
        int b2 = AbstractC0346a.b(this.f4315b, this.f4317d, j);
        if (b2 < 0 || (obj = this.f4316c[b2]) == AbstractC0341i.f4318a) {
            return null;
        }
        return obj;
    }

    public final long c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f4317d)) {
            throw new IllegalArgumentException(D1.h.e("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.f4314a) {
            long[] jArr = this.f4315b;
            Object[] objArr = this.f4316c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0341i.f4318a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f4314a = false;
            this.f4317d = i3;
        }
        return this.f4315b[i];
    }

    public final Object clone() {
        Object clone = super.clone();
        D1.i.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0340h c0340h = (C0340h) clone;
        c0340h.f4315b = (long[]) this.f4315b.clone();
        c0340h.f4316c = (Object[]) this.f4316c.clone();
        return c0340h;
    }

    public final void d(long j, Object obj) {
        int b2 = AbstractC0346a.b(this.f4315b, this.f4317d, j);
        if (b2 >= 0) {
            this.f4316c[b2] = obj;
            return;
        }
        int i = ~b2;
        int i2 = this.f4317d;
        Object obj2 = AbstractC0341i.f4318a;
        if (i < i2) {
            Object[] objArr = this.f4316c;
            if (objArr[i] == obj2) {
                this.f4315b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f4314a) {
            long[] jArr = this.f4315b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f4316c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f4314a = false;
                this.f4317d = i3;
                i = ~AbstractC0346a.b(this.f4315b, i3, j);
            }
        }
        int i5 = this.f4317d;
        if (i5 >= this.f4315b.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] copyOf = Arrays.copyOf(this.f4315b, i9);
            D1.i.d(copyOf, "copyOf(this, newSize)");
            this.f4315b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4316c, i9);
            D1.i.d(copyOf2, "copyOf(this, newSize)");
            this.f4316c = copyOf2;
        }
        int i10 = this.f4317d - i;
        if (i10 != 0) {
            long[] jArr2 = this.f4315b;
            int i11 = i + 1;
            D1.i.e(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.f4316c;
            u1.f.F(objArr3, objArr3, i11, i, this.f4317d);
        }
        this.f4315b[i] = j;
        this.f4316c[i] = obj;
        this.f4317d++;
    }

    public final int e() {
        if (this.f4314a) {
            int i = this.f4317d;
            long[] jArr = this.f4315b;
            Object[] objArr = this.f4316c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC0341i.f4318a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f4314a = false;
            this.f4317d = i2;
        }
        return this.f4317d;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f4317d)) {
            throw new IllegalArgumentException(D1.h.e("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.f4314a) {
            long[] jArr = this.f4315b;
            Object[] objArr = this.f4316c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0341i.f4318a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f4314a = false;
            this.f4317d = i3;
        }
        return this.f4316c[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4317d * 28);
        sb.append('{');
        int i = this.f4317d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object f2 = f(i2);
            if (f2 != sb) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        D1.i.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
