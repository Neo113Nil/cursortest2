package defpackage;

/* loaded from: classes11.dex */
public final class v25 extends w25 {
    public final char a;

    public v25(char c) {
        this.a = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v25) && this.a == ((v25) obj).a;
    }

    public final int hashCode() {
        return Character.hashCode(this.a);
    }

    public final String toString() {
        return "Static(char=" + this.a + ')';
    }
}
