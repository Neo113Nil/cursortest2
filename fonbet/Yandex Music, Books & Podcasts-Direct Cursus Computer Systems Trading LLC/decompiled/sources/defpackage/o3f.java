package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o3f {
    public final String a;

    public o3f(Iterable iterable) {
        iterable.getClass();
        this.a = CollectionsKt.X(iterable, StringUtils.COMMA, null, null, null, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3f)) {
            return false;
        }
        return Intrinsics.d(this.a, ((o3f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public o3f(Object... objArr) {
        this.a = xz0.J(objArr, StringUtils.COMMA, null, 62);
    }
}
