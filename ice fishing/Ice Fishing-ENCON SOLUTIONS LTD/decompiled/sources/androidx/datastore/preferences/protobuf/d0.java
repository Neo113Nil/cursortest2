package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f2378f = new d0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f2379a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2380b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2381c;

    /* renamed from: d, reason: collision with root package name */
    public int f2382d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2383e;

    public d0(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f2379a = i2;
        this.f2380b = iArr;
        this.f2381c = objArr;
        this.f2383e = z2;
    }

    public final void a(int i2) {
        int[] iArr = this.f2380b;
        if (i2 > iArr.length) {
            int i3 = this.f2379a;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f2380b = Arrays.copyOf(iArr, i2);
            this.f2381c = Arrays.copyOf(this.f2381c, i2);
        }
    }

    public final int b() {
        int i02;
        int i2 = this.f2382d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2379a; i4++) {
            int i5 = this.f2380b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i02 = C0113m.i0(i6, ((Long) this.f2381c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.f2381c[i4]).getClass();
                i02 = C0113m.U(i6);
            } else if (i7 == 2) {
                i02 = C0113m.Q(i6, (C0107g) this.f2381c[i4]);
            } else if (i7 == 3) {
                i3 = ((d0) this.f2381c[i4]).b() + (C0113m.f0(i6) * 2) + i3;
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(A.b());
                }
                ((Integer) this.f2381c[i4]).getClass();
                i02 = C0113m.T(i6);
            }
            i3 = i02 + i3;
        }
        this.f2382d = i3;
        return i3;
    }

    public final void c(int i2, Object obj) {
        if (!this.f2383e) {
            throw new UnsupportedOperationException();
        }
        a(this.f2379a + 1);
        int[] iArr = this.f2380b;
        int i3 = this.f2379a;
        iArr[i3] = i2;
        this.f2381c[i3] = obj;
        this.f2379a = i3 + 1;
    }

    public final void d(F f2) {
        if (this.f2379a == 0) {
            return;
        }
        f2.getClass();
        for (int i2 = 0; i2 < this.f2379a; i2++) {
            int i3 = this.f2380b[i2];
            Object obj = this.f2381c[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                f2.j(i4, ((Long) obj).longValue());
            } else if (i5 == 1) {
                f2.f(i4, ((Long) obj).longValue());
            } else if (i5 == 2) {
                f2.b(i4, (C0107g) obj);
            } else if (i5 == 3) {
                C0113m c0113m = (C0113m) f2.f2315a;
                c0113m.z0(i4, 3);
                ((d0) obj).d(f2);
                c0113m.z0(i4, 4);
            } else {
                if (i5 != 5) {
                    throw new RuntimeException(A.b());
                }
                f2.e(i4, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        int i2 = this.f2379a;
        if (i2 == d0Var.f2379a) {
            int[] iArr = this.f2380b;
            int[] iArr2 = d0Var.f2380b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f2381c;
                    Object[] objArr2 = d0Var.f2381c;
                    int i4 = this.f2379a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f2379a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.f2380b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f2381c;
        int i8 = this.f2379a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}
