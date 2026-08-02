package defpackage;

/* loaded from: classes6.dex */
public final class aqt implements cqt {
    public final wjb a;

    public aqt(wjb wjbVar) {
        wjbVar.getClass();
        this.a = wjbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqt) && this.a == ((aqt) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Screen(pageId=" + this.a + ")";
    }
}
