package defpackage;

/* loaded from: classes4.dex */
public final class yze implements f0f {
    public final String a;
    public final o43 b;

    public yze(String str, o43 o43Var) {
        this.a = str;
        this.b = o43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yze)) {
            return false;
        }
        yze yzeVar = (yze) obj;
        return this.a.equals(yzeVar.a) && this.b.equals(yzeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Menu(title=" + this.a + ", viewAllAction=" + this.b + ")";
    }
}
