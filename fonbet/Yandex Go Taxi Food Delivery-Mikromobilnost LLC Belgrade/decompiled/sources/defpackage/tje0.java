package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class tje0 implements hle0 {
    public static final sje0 Companion = new sje0();
    public final boolean a;

    public /* synthetic */ tje0(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            qje.Z(i, 1, rje0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tje0) && this.a == ((tje0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("BooleanLiteral(value="), this.a, ')');
    }

    public tje0(boolean z) {
        this.a = z;
    }
}
