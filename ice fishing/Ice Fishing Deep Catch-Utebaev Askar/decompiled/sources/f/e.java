package f;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f120a;

    public e(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f120a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (Intrinsics.a(this.f120a, ((e) obj).f120a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f120a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f120a + ')';
    }
}
