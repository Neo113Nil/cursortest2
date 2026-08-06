package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class lo0 extends vo0 {
    public final float Yi7zF1RB1;

    public lo0(float f) {
        super(3);
        this.Yi7zF1RB1 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo0) && Float.compare(this.Yi7zF1RB1, ((lo0) obj).Yi7zF1RB1) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1);
    }

    public final String toString() {
        return mr0.JFJ3QoxA(new StringBuilder("HorizontalTo(x="), this.Yi7zF1RB1, ')');
    }
}
