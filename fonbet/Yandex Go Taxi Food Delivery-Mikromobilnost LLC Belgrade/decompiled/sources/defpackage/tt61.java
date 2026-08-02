package defpackage;

/* loaded from: classes4.dex */
public final class tt61 {
    public static final Object c = new Object();
    public final Object a;
    public final Object b;

    public tt61(String str) {
        this.a = str;
        SecurityManager securityManager = System.getSecurityManager();
        Object securityContext = securityManager != null ? securityManager.getSecurityContext() : null;
        this.b = securityContext == null ? c : securityContext;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tt61)) {
            return false;
        }
        tt61 tt61Var = (tt61) obj;
        return tt61Var.a.equals(this.a) && tt61Var.b.equals(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }
}
