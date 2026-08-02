package defpackage;

/* loaded from: classes4.dex */
public final class oni extends q7g {
    public final mqs f;

    public oni(mqs mqsVar) {
        this.f = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oni) && this.f.equals(((oni) obj).f);
    }

    public final int hashCode() {
        return this.f.a.hashCode();
    }

    public final String toString() {
        return "Recognition(track=" + this.f + ")";
    }
}
