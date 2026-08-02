package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ggr extends u8n {
    public final jzs a;

    public ggr(jzs jzsVar) {
        this.a = jzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggr) && Intrinsics.d(this.a, ((ggr) obj).a);
    }

    public final int hashCode() {
        jzs jzsVar = this.a;
        if (jzsVar == null) {
            return 0;
        }
        return jzsVar.hashCode();
    }

    public final String toString() {
        return "StationQueueData(startTrackPlayable=" + this.a + ")";
    }
}
