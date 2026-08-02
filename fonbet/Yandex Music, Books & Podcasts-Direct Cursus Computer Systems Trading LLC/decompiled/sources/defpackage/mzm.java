package defpackage;

import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class mzm implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;
    public final String a = "HTTP";
    public final int b;
    public final int c;

    public mzm(int i, int i2) {
        bg3.O(i, "Protocol minor version");
        this.b = i;
        bg3.O(i2, "Protocol minor version");
        this.c = i2;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzm)) {
            return false;
        }
        mzm mzmVar = (mzm) obj;
        return this.a.equals(mzmVar.a) && this.b == mzmVar.b && this.c == mzmVar.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ (this.b * 100000)) ^ this.c;
    }

    public final String toString() {
        return this.a + '/' + Integer.toString(this.b) + '.' + Integer.toString(this.c);
    }
}
