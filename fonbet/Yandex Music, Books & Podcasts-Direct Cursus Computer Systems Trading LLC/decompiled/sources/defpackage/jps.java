package defpackage;

/* loaded from: classes4.dex */
public final class jps extends kps {
    public final String b;
    public final yhm c;

    public jps(String str, yhm yhmVar) {
        super(yhmVar);
        this.b = str;
        this.c = yhmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jps)) {
            return false;
        }
        jps jpsVar = (jps) obj;
        return this.b.equals(jpsVar.b) && this.c.equals(jpsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Image(imageUrl=" + this.b + ", imageRectangle=" + this.c + ")";
    }
}
