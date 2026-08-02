package defpackage;

/* loaded from: classes5.dex */
public final class r2a {
    public static final r2a c = new r2a(true, true);
    public static final r2a d = new r2a(false, false);
    public final boolean a;
    public final boolean b;

    public r2a(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r2a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        r2a r2aVar = (r2a) obj;
        return this.a == r2aVar.a && this.b == r2aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("DocumentActionsCallbacksConfig(onFinishEnabled=", this.a, ", onAwakeEnabled=", this.b, ")");
    }
}
