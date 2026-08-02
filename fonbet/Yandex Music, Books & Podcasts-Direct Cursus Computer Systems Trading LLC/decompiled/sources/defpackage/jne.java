package defpackage;

/* loaded from: classes4.dex */
public final class jne extends lne {
    public final boolean a;
    public final fbs b;

    public jne(boolean z, fbs fbsVar) {
        this.a = z;
        this.b = fbsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jne)) {
            return false;
        }
        jne jneVar = (jne) obj;
        return this.a == jneVar.a && this.b == jneVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FocusChange(focus=" + this.a + ", input=" + this.b + ")";
    }
}
