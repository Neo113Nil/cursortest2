package defpackage;

/* loaded from: classes4.dex */
public final class mps extends nps {
    public final String a;
    public final yhm b;

    public mps(String str, yhm yhmVar) {
        this.a = str;
        this.b = yhmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mps)) {
            return false;
        }
        mps mpsVar = (mps) obj;
        return this.a.equals(mpsVar.a) && this.b.equals(mpsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Image(imageUrl=" + this.a + ", rectangle=" + this.b + ")";
    }
}
