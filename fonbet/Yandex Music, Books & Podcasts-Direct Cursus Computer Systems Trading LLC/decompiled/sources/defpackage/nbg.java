package defpackage;

/* loaded from: classes4.dex */
public final class nbg {
    public final acg a;

    public nbg(acg acgVar) {
        this.a = acgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbg) && this.a.equals(((nbg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ListYandexPlayerHolder(player=" + this.a + ")";
    }
}
