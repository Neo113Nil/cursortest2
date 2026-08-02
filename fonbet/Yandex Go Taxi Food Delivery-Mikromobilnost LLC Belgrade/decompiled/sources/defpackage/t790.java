package defpackage;

/* loaded from: classes10.dex */
public final class t790 implements u790 {
    public final float a;

    public t790(float f) {
        this.a = f;
    }

    @Override // defpackage.u790
    public final int a(t5y t5yVar, int i) {
        return t5yVar.b.f0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t790)) {
            return false;
        }
        return y7m.b(this.a, ((t790) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
