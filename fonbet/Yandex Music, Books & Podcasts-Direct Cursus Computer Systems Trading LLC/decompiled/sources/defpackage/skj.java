package defpackage;

/* loaded from: classes4.dex */
public final class skj implements ukj {
    public final lgb a;

    public skj(lgb lgbVar) {
        this.a = lgbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skj) && this.a.equals(((skj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(reason=" + this.a + ")";
    }
}
