package s;

/* loaded from: classes.dex */
public final class l implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f40277w = new Object();

    /* renamed from: n, reason: collision with root package name */
    public int[] f40278n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f40279u;

    /* renamed from: v, reason: collision with root package name */
    public int f40280v;

    public l() {
        int i;
        int i4 = 4;
        while (true) {
            i = 40;
            if (i4 >= 32) {
                break;
            }
            int i6 = (1 << i4) - 12;
            if (40 <= i6) {
                i = i6;
                break;
            }
            i4++;
        }
        int i9 = i / 4;
        this.f40278n = new int[i9];
        this.f40279u = new Object[i9];
    }

    public final void a(int i, Object obj) {
        int i4 = this.f40280v;
        if (i4 != 0 && i <= this.f40278n[i4 - 1]) {
            c(i, obj);
            return;
        }
        if (i4 >= this.f40278n.length) {
            int i6 = (i4 + 1) * 4;
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
            int i11 = i6 / 4;
            int[] iArr = new int[i11];
            Object[] objArr = new Object[i11];
            int[] iArr2 = this.f40278n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f40279u;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f40278n = iArr;
            this.f40279u = objArr;
        }
        this.f40278n[i4] = i;
        this.f40279u[i4] = obj;
        this.f40280v = i4 + 1;
    }

    public final Object b(int i, Integer num) {
        Object obj;
        int a9 = d.a(this.f40280v, i, this.f40278n);
        return (a9 < 0 || (obj = this.f40279u[a9]) == f40277w) ? num : obj;
    }

    public final void c(int i, Object obj) {
        int a9 = d.a(this.f40280v, i, this.f40278n);
        if (a9 >= 0) {
            this.f40279u[a9] = obj;
            return;
        }
        int i4 = ~a9;
        int i6 = this.f40280v;
        if (i4 < i6) {
            Object[] objArr = this.f40279u;
            if (objArr[i4] == f40277w) {
                this.f40278n[i4] = i;
                objArr[i4] = obj;
                return;
            }
        }
        if (i6 >= this.f40278n.length) {
            int i9 = (i6 + 1) * 4;
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
            int i12 = i9 / 4;
            int[] iArr = new int[i12];
            Object[] objArr2 = new Object[i12];
            int[] iArr2 = this.f40278n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f40279u;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f40278n = iArr;
            this.f40279u = objArr2;
        }
        int i13 = this.f40280v - i4;
        if (i13 != 0) {
            int[] iArr3 = this.f40278n;
            int i14 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i14, i13);
            Object[] objArr4 = this.f40279u;
            System.arraycopy(objArr4, i4, objArr4, i14, this.f40280v - i4);
        }
        this.f40278n[i4] = i;
        this.f40279u[i4] = obj;
        this.f40280v++;
    }

    public final Object clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f40278n = (int[]) this.f40278n.clone();
            lVar.f40279u = (Object[]) this.f40279u.clone();
            return lVar;
        } catch (CloneNotSupportedException e9) {
            throw new AssertionError(e9);
        }
    }

    public final String toString() {
        int i = this.f40280v;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f40280v; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f40278n[i4]);
            sb.append('=');
            Object obj = this.f40279u[i4];
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
