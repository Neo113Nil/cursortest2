package defpackage;

/* loaded from: classes.dex */
public final class nis {
    public final kj a = kj.c;

    static {
        yut.d(0);
        yut.d(1);
        yut.d(2);
        yut.d(3);
        yut.d(4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && nis.class.equals(obj.getClass()) && yut.a(this.a, ((nis) obj).a);
    }

    public final int hashCode() {
        int i = (int) 0;
        return this.a.hashCode() + ((((6464647 + i) * 31) + i) * 961);
    }
}
