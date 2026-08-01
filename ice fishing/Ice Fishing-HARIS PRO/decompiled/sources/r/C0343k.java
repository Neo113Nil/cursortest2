package r;

import java.util.Arrays;
import s.AbstractC0346a;

/* renamed from: r.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343k implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f4323a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f4324b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f4325c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f4326d;

    public C0343k(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f4324b = new int[i5];
        this.f4325c = new Object[i5];
    }

    public final void a(int i, Object obj) {
        int i2 = this.f4326d;
        if (i2 != 0 && i <= this.f4324b[i2 - 1]) {
            d(i, obj);
            return;
        }
        if (this.f4323a && i2 >= this.f4324b.length) {
            AbstractC0341i.a(this);
        }
        int i3 = this.f4326d;
        if (i3 >= this.f4324b.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] copyOf = Arrays.copyOf(this.f4324b, i7);
            D1.i.d(copyOf, "copyOf(this, newSize)");
            this.f4324b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4325c, i7);
            D1.i.d(copyOf2, "copyOf(this, newSize)");
            this.f4325c = copyOf2;
        }
        this.f4324b[i3] = i;
        this.f4325c[i3] = obj;
        this.f4326d = i3 + 1;
    }

    public final Object b(int i) {
        Object obj;
        int a2 = AbstractC0346a.a(this.f4326d, i, this.f4324b);
        if (a2 < 0 || (obj = this.f4325c[a2]) == AbstractC0341i.f4319b) {
            return null;
        }
        return obj;
    }

    public final int c(int i) {
        if (this.f4323a) {
            AbstractC0341i.a(this);
        }
        return this.f4324b[i];
    }

    public final Object clone() {
        Object clone = super.clone();
        D1.i.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C0343k c0343k = (C0343k) clone;
        c0343k.f4324b = (int[]) this.f4324b.clone();
        c0343k.f4325c = (Object[]) this.f4325c.clone();
        return c0343k;
    }

    public final void d(int i, Object obj) {
        int a2 = AbstractC0346a.a(this.f4326d, i, this.f4324b);
        if (a2 >= 0) {
            this.f4325c[a2] = obj;
            return;
        }
        int i2 = ~a2;
        int i3 = this.f4326d;
        if (i2 < i3) {
            Object[] objArr = this.f4325c;
            if (objArr[i2] == AbstractC0341i.f4319b) {
                this.f4324b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f4323a && i3 >= this.f4324b.length) {
            AbstractC0341i.a(this);
            i2 = ~AbstractC0346a.a(this.f4326d, i, this.f4324b);
        }
        int i4 = this.f4326d;
        if (i4 >= this.f4324b.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] copyOf = Arrays.copyOf(this.f4324b, i8);
            D1.i.d(copyOf, "copyOf(this, newSize)");
            this.f4324b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4325c, i8);
            D1.i.d(copyOf2, "copyOf(this, newSize)");
            this.f4325c = copyOf2;
        }
        int i9 = this.f4326d;
        if (i9 - i2 != 0) {
            int[] iArr = this.f4324b;
            int i10 = i2 + 1;
            u1.f.E(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.f4325c;
            u1.f.F(objArr2, objArr2, i10, i2, this.f4326d);
        }
        this.f4324b[i2] = i;
        this.f4325c[i2] = obj;
        this.f4326d++;
    }

    public final int e() {
        if (this.f4323a) {
            AbstractC0341i.a(this);
        }
        return this.f4326d;
    }

    public final Object f(int i) {
        if (this.f4323a) {
            AbstractC0341i.a(this);
        }
        return this.f4325c[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4326d * 28);
        sb.append('{');
        int i = this.f4326d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object f2 = f(i2);
            if (f2 != this) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        D1.i.d(sb2, "buffer.toString()");
        return sb2;
    }
}
