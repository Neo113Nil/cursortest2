package defpackage;

/* loaded from: classes4.dex */
public final class m6l implements n6l {
    public final u5j a;

    public m6l(u5j u5jVar) {
        this.a = u5jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6l) && this.a.equals(((m6l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ready(newState=" + this.a + ")";
    }
}
