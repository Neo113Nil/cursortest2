package defpackage;

/* loaded from: classes3.dex */
public final class vsi implements xsi {
    public final mqs a;

    public vsi(mqs mqsVar) {
        this.a = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsi) && this.a.equals(((vsi) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Episode(track=" + this.a + ")";
    }
}
