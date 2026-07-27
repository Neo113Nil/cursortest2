package k;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f2662i = new Object();

    /* renamed from: f, reason: collision with root package name */
    public int[] f2663f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f2664g;

    /* renamed from: h, reason: collision with root package name */
    public int f2665h;

    public final void a(int i2, Object obj) {
        int i3 = this.f2665h;
        if (i3 == 0 || i2 > this.f2663f[i3 - 1]) {
            if (i3 >= this.f2663f.length) {
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
                int[] iArr = new int[i7];
                Object[] objArr = new Object[i7];
                int[] iArr2 = this.f2663f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f2664g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2663f = iArr;
                this.f2664g = objArr;
            }
            this.f2663f[i3] = i2;
            this.f2664g[i3] = obj;
            this.f2665h = i3 + 1;
            return;
        }
        int a2 = b.a(this.f2665h, i2, this.f2663f);
        if (a2 >= 0) {
            this.f2664g[a2] = obj;
            return;
        }
        int i8 = ~a2;
        int i9 = this.f2665h;
        if (i8 < i9) {
            Object[] objArr3 = this.f2664g;
            if (objArr3[i8] == f2662i) {
                this.f2663f[i8] = i2;
                objArr3[i8] = obj;
                return;
            }
        }
        if (i9 >= this.f2663f.length) {
            int i10 = (i9 + 1) * 4;
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
            int i13 = i10 / 4;
            int[] iArr3 = new int[i13];
            Object[] objArr4 = new Object[i13];
            int[] iArr4 = this.f2663f;
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            Object[] objArr5 = this.f2664g;
            System.arraycopy(objArr5, 0, objArr4, 0, objArr5.length);
            this.f2663f = iArr3;
            this.f2664g = objArr4;
        }
        int i14 = this.f2665h - i8;
        if (i14 != 0) {
            int[] iArr5 = this.f2663f;
            int i15 = i8 + 1;
            System.arraycopy(iArr5, i8, iArr5, i15, i14);
            Object[] objArr6 = this.f2664g;
            System.arraycopy(objArr6, i8, objArr6, i15, this.f2665h - i8);
        }
        this.f2663f[i8] = i2;
        this.f2664g[i8] = obj;
        this.f2665h++;
    }

    public final Object clone() {
        try {
            j jVar = (j) super.clone();
            jVar.f2663f = (int[]) this.f2663f.clone();
            jVar.f2664g = (Object[]) this.f2664g.clone();
            return jVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        int i2 = this.f2665h;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f2665h; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2663f[i3]);
            sb.append('=');
            Object obj = this.f2664g[i3];
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
