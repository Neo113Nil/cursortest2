package defpackage;

/* loaded from: classes.dex */
public final class zmk {
    public static final zmk b = new zmk("");
    public final String a;

    public zmk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zmk.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((zmk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
