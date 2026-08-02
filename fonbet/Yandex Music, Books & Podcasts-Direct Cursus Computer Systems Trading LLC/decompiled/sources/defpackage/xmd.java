package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xmd {
    public static final xmd b = new xmd(null);
    public final v8n a;

    public xmd(v8n v8nVar) {
        this.a = v8nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmd) && Intrinsics.d(this.a, ((xmd) obj).a);
    }

    public final int hashCode() {
        v8n v8nVar = this.a;
        if (v8nVar == null) {
            return 0;
        }
        return v8nVar.hashCode();
    }

    public final String toString() {
        return "SearchResult(queueDescriptor=" + this.a + ")";
    }
}
