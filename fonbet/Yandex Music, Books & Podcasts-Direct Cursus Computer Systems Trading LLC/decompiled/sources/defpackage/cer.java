package defpackage;

/* loaded from: classes3.dex */
public final class cer extends u7g {
    public final orw c;

    public cer(orw orwVar) {
        this.c = orwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cer) && this.c.equals(((cer) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Optimistic(state=" + this.c + ")";
    }
}
