package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d4a extends h4a {
    public final m4a n;

    public d4a(m4a m4aVar) {
        this.n = m4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d4a) {
            return Intrinsics.d(this.n, ((d4a) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return "RenderingStarted(document=" + this.n + ")";
    }
}
