package h1;

import java.io.Serializable;

/* renamed from: h1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3388a;

    public C0235e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f3388a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0235e) {
            if (kotlin.jvm.internal.i.a(this.f3388a, ((C0235e) obj).f3388a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3388a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3388a + ')';
    }
}
