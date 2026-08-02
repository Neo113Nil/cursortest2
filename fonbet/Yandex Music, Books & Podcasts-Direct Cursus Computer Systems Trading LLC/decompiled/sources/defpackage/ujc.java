package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ujc {
    public final lql a;
    public final boolean b;
    public final j1g c;
    public final p5n d;
    public final qpl e;
    public final h4q f;
    public final uz7 g;
    public final o3h h;
    public final boolean i;

    public ujc(lql lqlVar, boolean z, j1g j1gVar, p5n p5nVar, qpl qplVar, h4q h4qVar, uz7 uz7Var, o3h o3hVar, boolean z2) {
        lqlVar.getClass();
        j1gVar.getClass();
        p5nVar.getClass();
        qplVar.getClass();
        h4qVar.getClass();
        uz7Var.getClass();
        this.a = lqlVar;
        this.b = z;
        this.c = j1gVar;
        this.d = p5nVar;
        this.e = qplVar;
        this.f = h4qVar;
        this.g = uz7Var;
        this.h = o3hVar;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujc)) {
            return false;
        }
        ujc ujcVar = (ujc) obj;
        return Intrinsics.d(this.a, ujcVar.a) && this.b == ujcVar.b && this.c == ujcVar.c && this.d == ujcVar.d && Intrinsics.d(this.e, ujcVar.e) && Intrinsics.d(this.f, ujcVar.f) && Intrinsics.d(this.g, ujcVar.g) && Intrinsics.d(this.h, ujcVar.h) && this.i == ujcVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + eta.a((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, this.f.a, 31)) * 31;
        o3h o3hVar = this.h;
        return Boolean.hashCode(this.i) + ((hashCode + (o3hVar == null ? 0 : o3hVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowDataCollector(composedPlaybackQueueState=");
        sb.append(this.a);
        sb.append(", videoEnabled=");
        sb.append(this.b);
        sb.append(", likeState=");
        sb.append(this.c);
        sb.append(", quality=");
        sb.append(this.d);
        sb.append(", timerState=");
        sb.append(this.e);
        sb.append(", speed=");
        sb.append(this.f);
        sb.append(", device=");
        sb.append(this.g);
        sb.append(", lyrics=");
        sb.append(this.h);
        sb.append(", lyricsOn=");
        return ouj.r(sb, this.i, ")");
    }
}
