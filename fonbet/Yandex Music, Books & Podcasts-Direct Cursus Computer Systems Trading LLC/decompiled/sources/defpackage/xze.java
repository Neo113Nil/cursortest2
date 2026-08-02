package defpackage;

/* loaded from: classes4.dex */
public final class xze implements f0f {
    public final zo4 a;
    public final z9u b;
    public final x1u c;

    public xze(zo4 zo4Var, z9u z9uVar, x1u x1uVar) {
        this.a = zo4Var;
        this.b = z9uVar;
        this.c = x1uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xze)) {
            return false;
        }
        xze xzeVar = (xze) obj;
        return this.a.equals(xzeVar.a) && this.b.equals(xzeVar.b) && this.c.equals(xzeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Clip(clip=" + this.a + ", uiClip=" + this.b + ", videoClip=" + this.c + ")";
    }
}
