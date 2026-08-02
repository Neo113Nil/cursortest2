package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c4a extends h4a {
    public final m4a n;

    public c4a(m4a m4aVar) {
        this.n = m4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c4a) {
            return Intrinsics.d(this.n, ((c4a) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return "RenderingFinished(document=" + this.n + ")";
    }
}
