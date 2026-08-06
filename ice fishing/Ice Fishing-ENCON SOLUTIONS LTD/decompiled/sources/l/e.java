package l;

/* loaded from: classes.dex */
public final class e implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f8096e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f8097a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f8098b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8099c;

    /* renamed from: d, reason: collision with root package name */
    public int f8100d;

    public e() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f8098b = new long[i5];
        this.f8099c = new Object[i5];
    }

    public final void a() {
        int i2 = this.f8100d;
        long[] jArr = this.f8098b;
        Object[] objArr = this.f8099c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f8096e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f8097a = false;
        this.f8100d = i3;
    }

    public final void b(long j2, Object obj) {
        int b2 = d.b(this.f8098b, this.f8100d, j2);
        if (b2 >= 0) {
            this.f8099c[b2] = obj;
            return;
        }
        int i2 = ~b2;
        int i3 = this.f8100d;
        if (i2 < i3) {
            Object[] objArr = this.f8099c;
            if (objArr[i2] == f8096e) {
                this.f8098b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f8097a && i3 >= this.f8098b.length) {
            a();
            i2 = ~d.b(this.f8098b, this.f8100d, j2);
        }
        int i4 = this.f8100d;
        if (i4 >= this.f8098b.length) {
            int i5 = (i4 + 1) * 8;
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
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.f8098b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f8099c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8098b = jArr;
            this.f8099c = objArr2;
        }
        int i9 = this.f8100d - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f8098b;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f8099c;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f8100d - i2);
        }
        this.f8098b[i2] = j2;
        this.f8099c[i2] = obj;
        this.f8100d++;
    }

    public final Object clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f8098b = (long[]) this.f8098b.clone();
            eVar.f8099c = (Object[]) this.f8099c.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        if (this.f8097a) {
            a();
        }
        if (this.f8100d <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8100d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f8100d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f8097a) {
                a();
            }
            sb.append(this.f8098b[i2]);
            sb.append('=');
            if (this.f8097a) {
                a();
            }
            Object obj = this.f8099c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
