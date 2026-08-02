package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z5a implements ohb {
    public final boolean a;
    public final List b;

    public z5a(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5a)) {
            return false;
        }
        z5a z5aVar = (z5a) obj;
        return this.a == z5aVar.a && Intrinsics.d(this.b, z5aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DocumentReloadRequestedEvent(retryAfterError=" + this.a + ", patchParams=" + this.b + ")";
    }
}
