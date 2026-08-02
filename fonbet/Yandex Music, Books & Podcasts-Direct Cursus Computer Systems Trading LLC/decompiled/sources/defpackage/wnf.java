package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wnf {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;

    public wnf(Long l, Long l2, Long l3, Long l4) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = l4;
    }

    public static wnf a(wnf wnfVar, Long l, Long l2, Long l3, Long l4, int i) {
        if ((i & 1) != 0) {
            l = wnfVar.a;
        }
        if ((i & 2) != 0) {
            l2 = wnfVar.b;
        }
        if ((i & 4) != 0) {
            l3 = wnfVar.c;
        }
        if ((i & 8) != 0) {
            l4 = wnfVar.d;
        }
        wnfVar.getClass();
        return new wnf(l, l2, l3, l4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnf)) {
            return false;
        }
        wnf wnfVar = (wnf) obj;
        return Intrinsics.d(this.a, wnfVar.a) && Intrinsics.d(this.b, wnfVar.b) && Intrinsics.d(this.c, wnfVar.c) && Intrinsics.d(this.d, wnfVar.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        return hashCode3 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        return "LaunchTrackMetrics(wantToPlayTime=" + this.a + ", trackUrlReceivedTime=" + this.b + ", firstDataReceivedTime=" + this.c + ", trackIsPlayingTime=" + this.d + ")";
    }
}
