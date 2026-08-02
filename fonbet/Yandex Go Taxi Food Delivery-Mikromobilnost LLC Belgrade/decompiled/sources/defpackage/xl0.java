package defpackage;

/* loaded from: classes2.dex */
public final class xl0 {
    public final String a;

    public xl0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xl0) && this.a.equals(((xl0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Benefit(text="), this.a, ')');
    }
}
