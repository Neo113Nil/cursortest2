package ru.CryptoPro.ssl;

/* loaded from: classes4.dex */
class cl_98 {
    public static final Object c = new Object();
    public final Object a;
    public final Object b;

    public cl_98(String str) {
        this.a = str;
        SecurityManager securityManager = System.getSecurityManager();
        Object securityContext = securityManager != null ? securityManager.getSecurityContext() : null;
        this.b = securityContext == null ? c : securityContext;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cl_98)) {
            return false;
        }
        cl_98 cl_98Var = (cl_98) obj;
        return cl_98Var.a.equals(this.a) && cl_98Var.b.equals(this.b);
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }
}
