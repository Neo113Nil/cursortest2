package defpackage;

/* loaded from: classes6.dex */
public final class mmq {
    public final int a;
    public final int b;

    public mmq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmq)) {
            return false;
        }
        mmq mmqVar = (mmq) obj;
        return this.a == mmqVar.a && this.b == mmqVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('x');
        sb.append(this.b);
        return sb.toString();
    }
}
