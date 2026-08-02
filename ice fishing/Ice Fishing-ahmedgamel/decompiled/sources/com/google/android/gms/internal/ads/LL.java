package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class LL {

    /* renamed from: f, reason: collision with root package name */
    public static final LL f26906f = new LL(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f26907a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f26908b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f26909c;

    /* renamed from: d, reason: collision with root package name */
    public int f26910d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26911e;

    public LL(int i, int[] iArr, Object[] objArr, boolean z6) {
        this.f26907a = i;
        this.f26908b = iArr;
        this.f26909c = objArr;
        this.f26911e = z6;
    }

    public static LL a() {
        return new LL(0, new int[8], new Object[8], true);
    }

    public final void b(C4201xq c4201xq) {
        if (this.f26907a != 0) {
            for (int i = 0; i < this.f26907a; i++) {
                int i4 = this.f26908b[i];
                Object obj = this.f26909c[i];
                int i6 = i4 >>> 3;
                int i9 = i4 & 7;
                if (i9 == 0) {
                    ((OK) c4201xq.f35841u).q1(i6, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    ((OK) c4201xq.f35841u).t1(i6, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    ((OK) c4201xq.f35841u).y1(i6, (JK) obj);
                } else if (i9 == 3) {
                    ((OK) c4201xq.f35841u).Y(i6, 3);
                    ((LL) obj).b(c4201xq);
                    ((OK) c4201xq.f35841u).Y(i6, 4);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(new C3264gL());
                    }
                    ((OK) c4201xq.f35841u).p1(i6, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int S8;
        int T8;
        int S9;
        int i = this.f26910d;
        if (i != -1) {
            return i;
        }
        int i4 = 0;
        for (int i6 = 0; i6 < this.f26907a; i6++) {
            int i9 = this.f26908b[i6];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 != 0) {
                if (i11 == 1) {
                    ((Long) this.f26909c[i6]).getClass();
                    S9 = OK.S(i10 << 3) + 8;
                } else if (i11 == 2) {
                    int i12 = i10 << 3;
                    JK jk = (JK) this.f26909c[i6];
                    int S10 = OK.S(i12);
                    int f2 = jk.f();
                    i4 = Wv.d(f2, f2, S10, i4);
                } else if (i11 == 3) {
                    int S11 = OK.S(i10 << 3);
                    S8 = S11 + S11;
                    T8 = ((LL) this.f26909c[i6]).c();
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(new C3264gL());
                    }
                    ((Integer) this.f26909c[i6]).getClass();
                    S9 = OK.S(i10 << 3) + 4;
                }
                i4 = S9 + i4;
            } else {
                int i13 = i10 << 3;
                long longValue = ((Long) this.f26909c[i6]).longValue();
                S8 = OK.S(i13);
                T8 = OK.T(longValue);
            }
            i4 = T8 + S8 + i4;
        }
        this.f26910d = i4;
        return i4;
    }

    public final void d(int i, Object obj) {
        if (!this.f26911e) {
            throw new UnsupportedOperationException();
        }
        e(this.f26907a + 1);
        int[] iArr = this.f26908b;
        int i4 = this.f26907a;
        iArr[i4] = i;
        this.f26909c[i4] = obj;
        this.f26907a = i4 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.f26908b;
        if (i > iArr.length) {
            int i4 = this.f26907a;
            int i6 = (i4 / 2) + i4;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.f26908b = Arrays.copyOf(iArr, i);
            this.f26909c = Arrays.copyOf(this.f26909c, i);
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
        int i = this.f26907a;
        if (i == ll.f26907a) {
            int[] iArr = this.f26908b;
            int[] iArr2 = ll.f26908b;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.f26909c;
                    Object[] objArr2 = ll.f26909c;
                    int i6 = this.f26907a;
                    for (int i9 = 0; i9 < i6; i9++) {
                        if (objArr[i9].equals(objArr2[i9])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f26907a;
        int i4 = i + 527;
        int[] iArr = this.f26908b;
        int i6 = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = ((i4 * 31) + i9) * 31;
        Object[] objArr = this.f26909c;
        int i12 = this.f26907a;
        for (int i13 = 0; i13 < i12; i13++) {
            i6 = (i6 * 31) + objArr[i13].hashCode();
        }
        return i11 + i6;
    }
}
