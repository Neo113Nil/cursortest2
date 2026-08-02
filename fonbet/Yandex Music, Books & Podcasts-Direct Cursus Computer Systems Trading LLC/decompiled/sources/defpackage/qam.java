package defpackage;

/* loaded from: classes3.dex */
public final class qam implements ram {
    public final nam a;

    public qam(nam namVar) {
        this.a = namVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qam) && this.a.equals(((qam) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Show(uiData=" + this.a + ")";
    }
}
