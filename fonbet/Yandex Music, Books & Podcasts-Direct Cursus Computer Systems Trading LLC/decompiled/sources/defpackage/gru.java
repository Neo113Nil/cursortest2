package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gru implements iru {
    public final gsu a;

    public gru(gsu gsuVar) {
        gsuVar.getClass();
        this.a = gsuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gru) && Intrinsics.d(this.a, ((gru) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenRenameWaveBottomSheet(wave=" + this.a + ")";
    }
}
