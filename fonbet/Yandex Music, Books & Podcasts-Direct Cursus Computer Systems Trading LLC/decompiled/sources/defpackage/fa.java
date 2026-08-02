package defpackage;

/* loaded from: classes3.dex */
public final class fa implements ha {
    public final RuntimeException a;

    public fa(RuntimeException runtimeException) {
        this.a = runtimeException;
    }

    @Override // defpackage.ha
    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa) && this.a.equals(((fa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Common(throwable=" + this.a + ")";
    }
}
