package s;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int[] f6341a;

    /* renamed from: b, reason: collision with root package name */
    public int f6342b;

    public t(int i10) {
        this.f6341a = i10 == 0 ? m.f6304a : new int[i10];
    }

    public final void a(int i10) {
        b(this.f6342b + 1);
        int[] iArr = this.f6341a;
        int i11 = this.f6342b;
        iArr[i11] = i10;
        this.f6342b = i11 + 1;
    }

    public final void b(int i10) {
        int[] iArr = this.f6341a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            pc.j.d(copyOf, "copyOf(...)");
            this.f6341a = copyOf;
        }
    }

    public final int c(int i10) {
        if (i10 >= 0 && i10 < this.f6342b) {
            return this.f6341a[i10];
        }
        t.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void d(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f6342b)) {
            t.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f6341a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            bc.l.P(i10, i10 + 1, i11, iArr, iArr);
        }
        this.f6342b--;
    }

    public final void e(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f6342b) {
            t.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f6341a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            int i10 = tVar.f6342b;
            int i11 = this.f6342b;
            if (i10 == i11) {
                int[] iArr = this.f6341a;
                int[] iArr2 = tVar.f6341a;
                uc.d q10 = uc.e.q(0, i11);
                int i12 = q10.f6735g;
                int i13 = q10.f6736h;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f6341a;
        int i10 = this.f6342b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += Integer.hashCode(iArr[i12]) * 31;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f6341a;
        int i10 = this.f6342b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb.append((CharSequence) "]");
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i12);
            i11++;
        }
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ t() {
        this(16);
    }
}
