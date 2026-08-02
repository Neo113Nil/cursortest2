package defpackage;

/* loaded from: classes4.dex */
public final class bys implements dys {
    public final bzs a;

    public bys(bzs bzsVar) {
        this.a = bzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bys) && this.a.equals(((bys) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Custom(trackParameters=" + this.a + ")";
    }
}
