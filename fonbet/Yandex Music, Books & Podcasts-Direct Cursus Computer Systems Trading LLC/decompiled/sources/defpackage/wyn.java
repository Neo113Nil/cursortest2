package defpackage;

/* loaded from: classes.dex */
public final class wyn implements ob5 {
    public final fmq a;

    public wyn(fmq fmqVar) {
        this.a = fmqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyn) && this.a.equals(((wyn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Replace(screen=" + this.a + ')';
    }
}
