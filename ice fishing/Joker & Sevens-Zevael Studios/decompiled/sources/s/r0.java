package s;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r0 implements Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int[] f6330g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object[] f6331h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f6332i;

    public r0(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f6330g = new int[i14];
        this.f6331h = new Object[i14];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f6332i;
        if (i11 != 0 && i10 <= this.f6330g[i11 - 1]) {
            e(i10, obj);
            return;
        }
        if (i11 >= this.f6330g.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] copyOf = Arrays.copyOf(this.f6330g, i15);
            pc.j.d(copyOf, "copyOf(...)");
            this.f6330g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6331h, i15);
            pc.j.d(copyOf2, "copyOf(...)");
            this.f6331h = copyOf2;
        }
        this.f6330g[i11] = i10;
        this.f6331h[i11] = obj;
        this.f6332i = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r0 clone() {
        Object clone = super.clone();
        pc.j.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        r0 r0Var = (r0) clone;
        r0Var.f6330g = (int[]) this.f6330g.clone();
        r0Var.f6331h = (Object[]) this.f6331h.clone();
        return r0Var;
    }

    public final boolean c(int i10) {
        return t.a.a(this.f6332i, i10, this.f6330g) >= 0;
    }

    public final Object d(int i10) {
        Object obj;
        int a6 = t.a.a(this.f6332i, i10, this.f6330g);
        if (a6 < 0 || (obj = this.f6331h[a6]) == p.f6315c) {
            return null;
        }
        return obj;
    }

    public final void e(int i10, Object obj) {
        int a6 = t.a.a(this.f6332i, i10, this.f6330g);
        if (a6 >= 0) {
            this.f6331h[a6] = obj;
            return;
        }
        int i11 = ~a6;
        int i12 = this.f6332i;
        if (i11 < i12) {
            Object[] objArr = this.f6331h;
            if (objArr[i11] == p.f6315c) {
                this.f6330g[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f6330g.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] copyOf = Arrays.copyOf(this.f6330g, i16);
            pc.j.d(copyOf, "copyOf(...)");
            this.f6330g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6331h, i16);
            pc.j.d(copyOf2, "copyOf(...)");
            this.f6331h = copyOf2;
        }
        int i17 = this.f6332i;
        if (i17 - i11 != 0) {
            int[] iArr = this.f6330g;
            int i18 = i11 + 1;
            bc.l.P(i18, i11, i17, iArr, iArr);
            Object[] objArr2 = this.f6331h;
            bc.l.R(objArr2, objArr2, i18, i11, this.f6332i);
        }
        this.f6330g[i11] = i10;
        this.f6331h[i11] = obj;
        this.f6332i++;
    }

    public final Object f(int i10) {
        Object[] objArr = this.f6331h;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i10 = this.f6332i;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        int i11 = this.f6332i;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            sb.append(this.f6330g[i12]);
            sb.append('=');
            Object f10 = f(i12);
            if (f10 != this) {
                sb.append(f10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }
}
