package defpackage;

/* loaded from: classes9.dex */
public final class qxg implements Comparable {
    public final int a;
    public final int b;

    public qxg(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i2 >= 0) {
            return;
        }
        w511.f(oyr.i(i2, "Digits must be non-negative, but was "));
        throw null;
    }

    public final int a(int i) {
        int i2 = this.a;
        int i3 = this.b;
        if (i == i3) {
            return i2;
        }
        int[] iArr = j810.a;
        return i > i3 ? i2 * iArr[i - i3] : i2 / iArr[i3 - i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qxg qxgVar = (qxg) obj;
        int max = Math.max(this.b, qxgVar.b);
        return jl40.q(a(max), qxgVar.a(max));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qxg)) {
            return false;
        }
        qxg qxgVar = (qxg) obj;
        int max = Math.max(this.b, qxgVar.b);
        return jl40.q(a(max), qxgVar.a(max)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = j810.a[this.b];
        int i2 = this.a;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(evu0.Q("1", String.valueOf((i2 % i) + i)));
        return sb.toString();
    }
}
