package defpackage;

/* loaded from: classes4.dex */
public final class kne extends lne {
    public final fbs a;

    public kne(fbs fbsVar) {
        this.a = fbsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kne) && this.a == ((kne) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TextChange(input=" + this.a + ")";
    }
}
