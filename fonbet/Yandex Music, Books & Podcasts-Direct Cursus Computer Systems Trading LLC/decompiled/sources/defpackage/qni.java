package defpackage;

/* loaded from: classes4.dex */
public final class qni extends uni {
    public final jue a;

    public qni(jue jueVar) {
        this.a = jueVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qni) && this.a.equals(((qni) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(internalError=" + this.a + ")";
    }
}
