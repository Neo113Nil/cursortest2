package defpackage;

/* loaded from: classes14.dex */
public final class yew {
    public final String a;
    public final String b;
    public final xy40 c;

    static {
        Object[] objArr = np60.a;
    }

    public yew(String str, String str2, xy40 xy40Var) {
        this.a = str;
        this.b = str2;
        this.c = xy40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yew)) {
            return false;
        }
        yew yewVar = (yew) obj;
        return this.a.equals(yewVar.a) && this.b.equals(yewVar.b) && this.c.equals(yewVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }
}
