package N7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements Iterable, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final int f2105n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2106u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2107v;

    public a(int i, int i4, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2105n = i;
        this.f2106u = d6.c.e(i, i4, i6);
        this.f2107v = i6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f2105n == aVar.f2105n && this.f2106u == aVar.f2106u && this.f2107v == aVar.f2107v;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2105n * 31) + this.f2106u) * 31) + this.f2107v;
    }

    public boolean isEmpty() {
        int i = this.f2107v;
        int i4 = this.f2106u;
        int i6 = this.f2105n;
        return i > 0 ? i6 > i4 : i6 < i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2105n, this.f2106u, this.f2107v);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2106u;
        int i4 = this.f2105n;
        int i6 = this.f2107v;
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i6);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i6);
        }
        return sb.toString();
    }
}
