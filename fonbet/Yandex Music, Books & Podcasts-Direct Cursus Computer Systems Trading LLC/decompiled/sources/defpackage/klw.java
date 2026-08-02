package defpackage;

/* loaded from: classes4.dex */
public final class klw {
    public final Object a;

    public klw(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klw) && this.a.equals(((klw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.g("Changed(state=", ")", this.a);
    }
}
