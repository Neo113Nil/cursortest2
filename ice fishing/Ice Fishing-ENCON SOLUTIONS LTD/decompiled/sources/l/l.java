package l;

/* loaded from: classes.dex */
public final class l implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f8125d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public int[] f8126a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8127b;

    /* renamed from: c, reason: collision with root package name */
    public int f8128c;

    public final void a(int i2, Object obj) {
        int i3 = this.f8128c;
        if (i3 == 0 || i2 > this.f8126a[i3 - 1]) {
            if (i3 >= this.f8126a.length) {
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
                int[] iArr2 = this.f8126a;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f8127b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f8126a = iArr;
                this.f8127b = objArr;
            }
            this.f8126a[i3] = i2;
            this.f8127b[i3] = obj;
            this.f8128c = i3 + 1;
            return;
        }
        int a2 = d.a(this.f8128c, i2, this.f8126a);
        if (a2 >= 0) {
            this.f8127b[a2] = obj;
            return;
        }
        int i8 = ~a2;
        int i9 = this.f8128c;
        if (i8 < i9) {
            Object[] objArr3 = this.f8127b;
            if (objArr3[i8] == f8125d) {
                this.f8126a[i8] = i2;
                objArr3[i8] = obj;
                return;
            }
        }
        if (i9 >= this.f8126a.length) {
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
            int[] iArr4 = this.f8126a;
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            Object[] objArr5 = this.f8127b;
            System.arraycopy(objArr5, 0, objArr4, 0, objArr5.length);
            this.f8126a = iArr3;
            this.f8127b = objArr4;
        }
        int i14 = this.f8128c - i8;
        if (i14 != 0) {
            int[] iArr5 = this.f8126a;
            int i15 = i8 + 1;
            System.arraycopy(iArr5, i8, iArr5, i15, i14);
            Object[] objArr6 = this.f8127b;
            System.arraycopy(objArr6, i8, objArr6, i15, this.f8128c - i8);
        }
        this.f8126a[i8] = i2;
        this.f8127b[i8] = obj;
        this.f8128c++;
    }

    public final Object clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f8126a = (int[]) this.f8126a.clone();
            lVar.f8127b = (Object[]) this.f8127b.clone();
            return lVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        int i2 = this.f8128c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f8128c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f8126a[i3]);
            sb.append('=');
            Object obj = this.f8127b[i3];
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
