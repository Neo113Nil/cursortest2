package s;

/* loaded from: classes.dex */
public final class e implements Cloneable {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f40250x = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f40251n;

    /* renamed from: u, reason: collision with root package name */
    public long[] f40252u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f40253v;

    /* renamed from: w, reason: collision with root package name */
    public int f40254w;

    public e() {
        this(10);
    }

    public final Object clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f40252u = (long[]) this.f40252u.clone();
            eVar.f40253v = (Object[]) this.f40253v.clone();
            return eVar;
        } catch (CloneNotSupportedException e9) {
            throw new AssertionError(e9);
        }
    }

    public final void h() {
        int i = this.f40254w;
        Object[] objArr = this.f40253v;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        this.f40254w = 0;
        this.f40251n = false;
    }

    public final void i() {
        int i = this.f40254w;
        long[] jArr = this.f40252u;
        Object[] objArr = this.f40253v;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (obj != f40250x) {
                if (i6 != i4) {
                    jArr[i4] = jArr[i6];
                    objArr[i4] = obj;
                    objArr[i6] = null;
                }
                i4++;
            }
        }
        this.f40251n = false;
        this.f40254w = i4;
    }

    public final Object j(long j6, Long l9) {
        Object obj;
        int b9 = d.b(this.f40252u, this.f40254w, j6);
        return (b9 < 0 || (obj = this.f40253v[b9]) == f40250x) ? l9 : obj;
    }

    public final void k(long j6, Object obj) {
        int b9 = d.b(this.f40252u, this.f40254w, j6);
        if (b9 >= 0) {
            this.f40253v[b9] = obj;
            return;
        }
        int i = ~b9;
        int i4 = this.f40254w;
        if (i < i4) {
            Object[] objArr = this.f40253v;
            if (objArr[i] == f40250x) {
                this.f40252u[i] = j6;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f40251n && i4 >= this.f40252u.length) {
            i();
            i = ~d.b(this.f40252u, this.f40254w, j6);
        }
        int i6 = this.f40254w;
        if (i6 >= this.f40252u.length) {
            int i9 = (i6 + 1) * 8;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 8;
            long[] jArr = new long[i12];
            Object[] objArr2 = new Object[i12];
            long[] jArr2 = this.f40252u;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f40253v;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f40252u = jArr;
            this.f40253v = objArr2;
        }
        int i13 = this.f40254w - i;
        if (i13 != 0) {
            long[] jArr3 = this.f40252u;
            int i14 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i14, i13);
            Object[] objArr4 = this.f40253v;
            System.arraycopy(objArr4, i, objArr4, i14, this.f40254w - i);
        }
        this.f40252u[i] = j6;
        this.f40253v[i] = obj;
        this.f40254w++;
    }

    public final int l() {
        if (this.f40251n) {
            i();
        }
        return this.f40254w;
    }

    public final Object m(int i) {
        if (this.f40251n) {
            i();
        }
        return this.f40253v[i];
    }

    public final String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40254w * 28);
        sb.append('{');
        for (int i = 0; i < this.f40254w; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f40251n) {
                i();
            }
            sb.append(this.f40252u[i]);
            sb.append('=');
            Object m9 = m(i);
            if (m9 != this) {
                sb.append(m9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public e(int i) {
        this.f40251n = false;
        if (i == 0) {
            this.f40252u = d.f40248b;
            this.f40253v = d.f40249c;
            return;
        }
        int i4 = i * 8;
        int i6 = 4;
        while (true) {
            if (i6 >= 32) {
                break;
            }
            int i9 = (1 << i6) - 12;
            if (i4 <= i9) {
                i4 = i9;
                break;
            }
            i6++;
        }
        int i10 = i4 / 8;
        this.f40252u = new long[i10];
        this.f40253v = new Object[i10];
    }
}
