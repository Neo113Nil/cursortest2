package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class re5 extends u8n {
    public final sfm a;
    public final int b;
    public final mqs c;
    public final boolean d;
    public final long e;

    public re5(sfm sfmVar, int i, mqs mqsVar, boolean z, long j) {
        sfmVar.getClass();
        this.a = sfmVar;
        this.b = i;
        this.c = mqsVar;
        this.d = z;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re5)) {
            return false;
        }
        re5 re5Var = (re5) obj;
        return Intrinsics.d(this.a, re5Var.a) && this.b == re5Var.b && Intrinsics.d(this.c, re5Var.c) && this.d == re5Var.d && this.e == re5Var.e;
    }

    public final int hashCode() {
        int a = f1d.a(this.b, this.a.hashCode() * 31, 31);
        mqs mqsVar = this.c;
        return Long.hashCode(this.e) + k5r.e((a + (mqsVar == null ? 0 : mqsVar.a.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonQueueData(tracks=");
        sb.append(this.a);
        sb.append(", startFromTrackPosition=");
        sb.append(this.b);
        sb.append(", startFromTrack=");
        sb.append(this.c);
        sb.append(", shuffle=");
        sb.append(this.d);
        sb.append(", startFromTrackProgressOffsetMillis=");
        return hrg.m(this.e, ")", sb);
    }
}
