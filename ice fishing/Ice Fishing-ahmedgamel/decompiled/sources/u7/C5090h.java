package u7;

import java.io.Serializable;

/* renamed from: u7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5090h implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final Throwable f41334n;

    public C5090h(Throwable exception) {
        kotlin.jvm.internal.h.e(exception, "exception");
        this.f41334n = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5090h) {
            return kotlin.jvm.internal.h.a(this.f41334n, ((C5090h) obj).f41334n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41334n.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f41334n + ')';
    }
}
