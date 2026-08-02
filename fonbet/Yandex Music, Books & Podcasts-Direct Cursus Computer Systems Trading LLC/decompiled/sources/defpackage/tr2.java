package defpackage;

/* loaded from: classes3.dex */
public final class tr2 extends ur2 {
    public final char a;

    public tr2(char c) {
        this.a = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tr2) && this.a == ((tr2) obj).a;
    }

    public final int hashCode() {
        return Character.hashCode(this.a);
    }

    public final String toString() {
        return "Static(char=" + this.a + ')';
    }
}
