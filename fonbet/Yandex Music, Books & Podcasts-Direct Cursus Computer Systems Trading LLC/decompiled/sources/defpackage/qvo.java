package defpackage;

/* loaded from: classes4.dex */
public final class qvo implements tvo {
    public final Exception a;

    public qvo(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvo) && this.a.equals(((qvo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + ")";
    }
}
