package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class afa {
    public final Object a;
    public final long b;

    public afa(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afa)) {
            return false;
        }
        afa afaVar = (afa) obj;
        return Intrinsics.d(this.a, afaVar.a) && this.b == afaVar.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Long.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "DownloadedEntity(id=" + this.a + ", timestampMills=" + this.b + ")";
    }
}
