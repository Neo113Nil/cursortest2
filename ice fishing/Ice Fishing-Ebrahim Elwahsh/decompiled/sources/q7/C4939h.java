package q7;

import java.io.Serializable;

/* renamed from: q7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4939h implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final Throwable f40164n;

    public C4939h(Throwable exception) {
        kotlin.jvm.internal.h.e(exception, "exception");
        this.f40164n = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4939h) {
            return kotlin.jvm.internal.h.a(this.f40164n, ((C4939h) obj).f40164n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40164n.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f40164n + ')';
    }
}
