package defpackage;

/* loaded from: classes5.dex */
public final class thc {
    public static final thc b = new thc(new htb(8));
    public final htb a;

    public thc(htb htbVar) {
        this.a = htbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!thc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a.equals(((thc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FlexLogConfiguration(isSourceCodeInfoRequired=" + this.a + ")";
    }
}
