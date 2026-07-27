package s;

/* loaded from: classes.dex */
public final class e implements Cloneable {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f40411x = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f40412n;

    /* renamed from: u, reason: collision with root package name */
    public long[] f40413u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f40414v;

    /* renamed from: w, reason: collision with root package name */
    public int f40415w;

    public e() {
        this(10);
    }

    public final Object clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f40413u = (long[]) this.f40413u.clone();
            eVar.f40414v = (Object[]) this.f40414v.clone();
            return eVar;
        } catch (CloneNotSupportedException e9) {
            throw new AssertionError(e9);
        }
    }

    public final void h() {
        int i = this.f40415w;
        Object[] objArr = this.f40414v;
        for (int i6 = 0; i6 < i; i6++) {
            objArr[i6] = null;
        }
        this.f40415w = 0;
        this.f40412n = false;
    }

    public final void i() {
        int i = this.f40415w;
        long[] jArr = this.f40413u;
        Object[] objArr = this.f40414v;
        int i6 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[i9];
            if (obj != f40411x) {
                if (i9 != i6) {
                    jArr[i6] = jArr[i9];
                    objArr[i6] = obj;
                    objArr[i9] = null;
                }
                i6++;
            }
        }
        this.f40412n = false;
        this.f40415w = i6;
    }

    public final Object j(long j6, Long l9) {
        Object obj;
        int b9 = d.b(this.f40413u, this.f40415w, j6);
        return (b9 < 0 || (obj = this.f40414v[b9]) == f40411x) ? l9 : obj;
    }

    public final void k(long j6, Object obj) {
        int b9 = d.b(this.f40413u, this.f40415w, j6);
        if (b9 >= 0) {
            this.f40414v[b9] = obj;
            return;
        }
        int i = ~b9;
        int i6 = this.f40415w;
        if (i < i6) {
            Object[] objArr = this.f40414v;
            if (objArr[i] == f40411x) {
                this.f40413u[i] = j6;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f40412n && i6 >= this.f40413u.length) {
            i();
            i = ~d.b(this.f40413u, this.f40415w, j6);
        }
        int i9 = this.f40415w;
        if (i9 >= this.f40413u.length) {
            int i10 = (i9 + 1) * 8;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 8;
            long[] jArr = new long[i13];
            Object[] objArr2 = new Object[i13];
            long[] jArr2 = this.f40413u;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f40414v;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f40413u = jArr;
            this.f40414v = objArr2;
        }
        int i14 = this.f40415w - i;
        if (i14 != 0) {
            long[] jArr3 = this.f40413u;
            int i15 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i15, i14);
            Object[] objArr4 = this.f40414v;
            System.arraycopy(objArr4, i, objArr4, i15, this.f40415w - i);
        }
        this.f40413u[i] = j6;
        this.f40414v[i] = obj;
        this.f40415w++;
    }

    public final int l() {
        if (this.f40412n) {
            i();
        }
        return this.f40415w;
    }

    public final Object m(int i) {
        if (this.f40412n) {
            i();
        }
        return this.f40414v[i];
    }

    public final String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40415w * 28);
        sb.append('{');
        for (int i = 0; i < this.f40415w; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f40412n) {
                i();
            }
            sb.append(this.f40413u[i]);
            sb.append('=');
            Object m4 = m(i);
            if (m4 != this) {
                sb.append(m4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public e(int i) {
        this.f40412n = false;
        if (i == 0) {
            this.f40413u = d.f40409b;
            this.f40414v = d.f40410c;
            return;
        }
        int i6 = i * 8;
        int i9 = 4;
        while (true) {
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (i6 <= i10) {
                i6 = i10;
                break;
            }
            i9++;
        }
        int i11 = i6 / 8;
        this.f40413u = new long[i11];
        this.f40414v = new Object[i11];
    }
}
