package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hgr extends u8n {
    public final xsu a;

    public hgr(xsu xsuVar) {
        xsuVar.getClass();
        this.a = xsuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgr) && Intrinsics.d(this.a, ((hgr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StationQueueDataOld(waveInitialPlayablesInfo=" + this.a + ")";
    }
}
