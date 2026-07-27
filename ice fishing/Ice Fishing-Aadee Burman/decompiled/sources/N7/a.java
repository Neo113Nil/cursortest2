package N7;

import java.util.Iterator;
import t8.g;

/* loaded from: classes2.dex */
public class a implements Iterable, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final int f2017n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2018u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2019v;

    public a(int i, int i6, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2017n = i;
        this.f2018u = g.p(i, i6, i9);
        this.f2019v = i9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f2017n == aVar.f2017n && this.f2018u == aVar.f2018u && this.f2019v == aVar.f2019v;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2017n * 31) + this.f2018u) * 31) + this.f2019v;
    }

    public boolean isEmpty() {
        int i = this.f2019v;
        int i6 = this.f2018u;
        int i9 = this.f2017n;
        return i > 0 ? i9 > i6 : i9 < i6;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2017n, this.f2018u, this.f2019v);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2018u;
        int i6 = this.f2017n;
        int i9 = this.f2019v;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i6);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i6);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
