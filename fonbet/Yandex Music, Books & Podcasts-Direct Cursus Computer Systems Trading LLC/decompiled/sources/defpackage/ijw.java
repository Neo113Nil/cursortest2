package defpackage;

/* loaded from: classes4.dex */
public final class ijw implements jjw {
    public final sqw a;

    public ijw(sqw sqwVar) {
        this.a = sqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijw) && this.a.equals(((ijw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Processed(state=" + this.a + ")";
    }
}
