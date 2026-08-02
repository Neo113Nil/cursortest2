package defpackage;

/* loaded from: classes3.dex */
public final class dw8 {
    public static final dw8 b = new dw8("");
    public final String a;

    public dw8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dw8.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dw8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
