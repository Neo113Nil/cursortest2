package defpackage;

/* loaded from: classes6.dex */
public final class n9l {
    public final m9l a;
    public final m9l b;

    public n9l(m9l m9lVar, m9l m9lVar2) {
        this.a = m9lVar;
        this.b = m9lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9l)) {
            return false;
        }
        n9l n9lVar = (n9l) obj;
        return this.a.equals(n9lVar.a) && this.b.equals(n9lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LogConfigs(initial=" + this.a + ", afterFirstFlush=" + this.b + ')';
    }
}
