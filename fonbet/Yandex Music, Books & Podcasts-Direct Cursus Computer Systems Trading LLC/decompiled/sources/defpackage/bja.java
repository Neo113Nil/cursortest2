package defpackage;

/* loaded from: classes3.dex */
public final class bja implements cja {
    public final n8g a;

    public bja(n8g n8gVar) {
        this.a = n8gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bja) && this.a.equals(((bja) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(sections=" + this.a + ")";
    }
}
