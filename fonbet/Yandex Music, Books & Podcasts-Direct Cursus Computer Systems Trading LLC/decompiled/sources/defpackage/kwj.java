package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kwj extends q7g {
    public final Object f;

    public kwj(Object obj) {
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwj) && Intrinsics.d(this.f, ((kwj) obj).f);
    }

    public final int hashCode() {
        Object obj = this.f;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f1d.j(new StringBuilder("Present(value="), this.f, ')');
    }
}
