package defpackage;

/* loaded from: classes4.dex */
public final class qgk implements sgk {
    public final lgb a;

    public qgk(lgb lgbVar) {
        this.a = lgbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qgk) && this.a.equals(((qgk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(reason=" + this.a + ")";
    }
}
