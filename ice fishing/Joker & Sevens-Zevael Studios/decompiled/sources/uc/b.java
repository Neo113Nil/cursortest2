package uc;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class b implements Iterable, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f6735g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6736h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6737i;

    public b(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6735g = i10;
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                int i14 = i10 % i12;
                int i15 = ((i13 < 0 ? i13 + i12 : i13) - (i14 < 0 ? i14 + i12 : i14)) % i12;
                i11 -= i15 < 0 ? i15 + i12 : i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                int i18 = i11 % i16;
                int i19 = ((i17 < 0 ? i17 + i16 : i17) - (i18 < 0 ? i18 + i16 : i18)) % i16;
                i11 += i19 < 0 ? i19 + i16 : i19;
            }
        }
        this.f6736h = i11;
        this.f6737i = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f6735g == bVar.f6735g && this.f6736h == bVar.f6736h && this.f6737i == bVar.f6737i;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6735g * 31) + this.f6736h) * 31) + this.f6737i;
    }

    public boolean isEmpty() {
        int i10 = this.f6737i;
        int i11 = this.f6736h;
        int i12 = this.f6735g;
        return i10 > 0 ? i12 > i11 : i12 < i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f6735g, this.f6736h, this.f6737i);
    }

    public String toString() {
        StringBuilder sb;
        int i10 = this.f6736h;
        int i11 = this.f6735g;
        int i12 = this.f6737i;
        if (i12 > 0) {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append("..");
            sb.append(i10);
            sb.append(" step ");
            sb.append(i12);
        } else {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append(" downTo ");
            sb.append(i10);
            sb.append(" step ");
            sb.append(-i12);
        }
        return sb.toString();
    }
}
