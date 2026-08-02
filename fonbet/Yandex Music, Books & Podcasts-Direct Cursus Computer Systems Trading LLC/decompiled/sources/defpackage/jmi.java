package defpackage;

/* loaded from: classes3.dex */
public final class jmi implements lmi, jji {
    public final mqs a;

    public jmi(mqs mqsVar) {
        this.a = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmi) && this.a.equals(((jmi) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Full(track=" + this.a + ")";
    }
}
