package defpackage;

/* loaded from: classes10.dex */
public final class v64 extends l6v {
    public final Object a;

    public v64(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.l6v
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l6v) {
            return this.a.equals(((l6v) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return x4e.h(new StringBuilder("Identifier{value="), this.a, "}");
    }
}
