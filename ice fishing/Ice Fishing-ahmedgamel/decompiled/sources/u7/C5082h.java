package u7;

import java.io.Serializable;

/* renamed from: u7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5082h implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final Throwable f41054n;

    public C5082h(Throwable exception) {
        kotlin.jvm.internal.h.e(exception, "exception");
        this.f41054n = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5082h) {
            return kotlin.jvm.internal.h.a(this.f41054n, ((C5082h) obj).f41054n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41054n.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f41054n + ')';
    }
}
