package w1;

import a.AbstractC0083a;
import java.util.Iterator;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1060a implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final int f8516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8517b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8518c;

    public C1060a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8516a = i2;
        this.f8517b = AbstractC0083a.k(i2, i3, i4);
        this.f8518c = i4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1060a) {
            if (!isEmpty() || !((C1060a) obj).isEmpty()) {
                C1060a c1060a = (C1060a) obj;
                if (this.f8516a != c1060a.f8516a || this.f8517b != c1060a.f8517b || this.f8518c != c1060a.f8518c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f8516a * 31) + this.f8517b) * 31) + this.f8518c;
    }

    public boolean isEmpty() {
        int i2 = this.f8518c;
        int i3 = this.f8517b;
        int i4 = this.f8516a;
        if (i2 > 0) {
            if (i4 <= i3) {
                return false;
            }
        } else if (i4 >= i3) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1061b(this.f8516a, this.f8517b, this.f8518c);
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.f8517b;
        int i3 = this.f8516a;
        int i4 = this.f8518c;
        if (i4 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i4);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i4);
        }
        return sb.toString();
    }
}
