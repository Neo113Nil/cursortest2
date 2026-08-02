package defpackage;

/* loaded from: classes4.dex */
public final class he {
    public final String a;
    public final o43 b;
    public final u9b c;
    public final String d;
    public final String e;

    public he(String str, o43 o43Var, u9b u9bVar, String str2, String str3) {
        this.a = str;
        this.b = o43Var;
        this.c = u9bVar;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he)) {
            return false;
        }
        he heVar = (he) obj;
        return this.a.equals(heVar.a) && this.b.equals(heVar.b) && this.c.equals(heVar.c) && this.d.equals(heVar.d) && this.e.equals(heVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionBarButton(title=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", cover=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", anchorId=");
        return su4.o(sb, this.e, ")");
    }
}
