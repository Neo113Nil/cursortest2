package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class LL {

    /* renamed from: f, reason: collision with root package name */
    public static final LL f26106f = new LL(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f26107a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f26108b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f26109c;

    /* renamed from: d, reason: collision with root package name */
    public int f26110d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26111e;

    public LL(int i, int[] iArr, Object[] objArr, boolean z3) {
        this.f26107a = i;
        this.f26108b = iArr;
        this.f26109c = objArr;
        this.f26111e = z3;
    }

    public static LL a() {
        return new LL(0, new int[8], new Object[8], true);
    }

    public final void b(C4178xq c4178xq) {
        if (this.f26107a != 0) {
            for (int i = 0; i < this.f26107a; i++) {
                int i6 = this.f26108b[i];
                Object obj = this.f26109c[i];
                int i9 = i6 >>> 3;
                int i10 = i6 & 7;
                if (i10 == 0) {
                    ((OK) c4178xq.f35055u).q1(i9, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    ((OK) c4178xq.f35055u).s1(i9, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    ((OK) c4178xq.f35055u).y1(i9, (JK) obj);
                } else if (i10 == 3) {
                    ((OK) c4178xq.f35055u).Y(i9, 3);
                    ((LL) obj).b(c4178xq);
                    ((OK) c4178xq.f35055u).Y(i9, 4);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(new C3241gL());
                    }
                    ((OK) c4178xq.f35055u).p1(i9, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int S8;
        int T8;
        int S9;
        int i = this.f26110d;
        if (i != -1) {
            return i;
        }
        int i6 = 0;
        for (int i9 = 0; i9 < this.f26107a; i9++) {
            int i10 = this.f26108b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.f26109c[i9]).getClass();
                    S9 = OK.S(i11 << 3) + 8;
                } else if (i12 == 2) {
                    int i13 = i11 << 3;
                    JK jk = (JK) this.f26109c[i9];
                    int S10 = OK.S(i13);
                    int f3 = jk.f();
                    i6 = com.anythink.basead.exoplayer.f.f.x(f3, f3, S10, i6);
                } else if (i12 == 3) {
                    int S11 = OK.S(i11 << 3);
                    S8 = S11 + S11;
                    T8 = ((LL) this.f26109c[i9]).c();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(new C3241gL());
                    }
                    ((Integer) this.f26109c[i9]).getClass();
                    S9 = OK.S(i11 << 3) + 4;
                }
                i6 = S9 + i6;
            } else {
                int i14 = i11 << 3;
                long longValue = ((Long) this.f26109c[i9]).longValue();
                S8 = OK.S(i14);
                T8 = OK.T(longValue);
            }
            i6 = T8 + S8 + i6;
        }
        this.f26110d = i6;
        return i6;
    }

    public final void d(int i, Object obj) {
        if (!this.f26111e) {
            throw new UnsupportedOperationException();
        }
        e(this.f26107a + 1);
        int[] iArr = this.f26108b;
        int i6 = this.f26107a;
        iArr[i6] = i;
        this.f26109c[i6] = obj;
        this.f26107a = i6 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.f26108b;
        if (i > iArr.length) {
            int i6 = this.f26107a;
            int i9 = (i6 / 2) + i6;
            if (i9 >= i) {
                i = i9;
            }
            if (i < 8) {
                i = 8;
            }
            this.f26108b = Arrays.copyOf(iArr, i);
            this.f26109c = Arrays.copyOf(this.f26109c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LL)) {
            return false;
        }
        LL ll = (LL) obj;
        int i = this.f26107a;
        if (i == ll.f26107a) {
            int[] iArr = this.f26108b;
            int[] iArr2 = ll.f26108b;
            int i6 = 0;
            while (true) {
                if (i6 >= i) {
                    Object[] objArr = this.f26109c;
                    Object[] objArr2 = ll.f26109c;
                    int i9 = this.f26107a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i6] != iArr2[i6]) {
                    break;
                }
                i6++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f26107a;
        int i6 = i + 527;
        int[] iArr = this.f26108b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i6 * 31) + i10) * 31;
        Object[] objArr = this.f26109c;
        int i13 = this.f26107a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
