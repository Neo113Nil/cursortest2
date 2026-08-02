package defpackage;

import android.os.Bundle;
import com.yandex.music.shared.media.session.common.state.a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lgh {
    public static final lgh u;
    public final int a;
    public final a b;
    public final a c;
    public final hoh d;
    public final d8l e;
    public final blp f;
    public final List g;
    public final Bundle h;
    public final int i;
    public final int j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final h4q o;
    public final n4q p;
    public final int q;
    public final boolean r;
    public final y08 s;
    public final String t;

    static {
        a aVar = a.f;
        hoh hohVar = hoh.K;
        hohVar.getClass();
        d8l d8lVar = gal.b;
        blp blpVar = blp.b;
        blpVar.getClass();
        c5b c5bVar = c5b.a;
        Bundle bundle = Bundle.EMPTY;
        bundle.getClass();
        u = new lgh(-1, aVar, aVar, hohVar, d8lVar, blpVar, c5bVar, bundle, 1, 0, false, 1, false, false, h4q.b, n4q.b, 0, false, y08.e, null);
    }

    public lgh(int i, a aVar, a aVar2, hoh hohVar, d8l d8lVar, blp blpVar, List list, Bundle bundle, int i2, int i3, boolean z, int i4, boolean z2, boolean z3, h4q h4qVar, n4q n4qVar, int i5, boolean z4, y08 y08Var, String str) {
        hohVar.getClass();
        d8lVar.getClass();
        blpVar.getClass();
        list.getClass();
        bundle.getClass();
        h4qVar.getClass();
        n4qVar.getClass();
        y08Var.getClass();
        this.a = i;
        this.b = aVar;
        this.c = aVar2;
        this.d = hohVar;
        this.e = d8lVar;
        this.f = blpVar;
        this.g = list;
        this.h = bundle;
        this.i = i2;
        this.j = i3;
        this.k = z;
        this.l = i4;
        this.m = z2;
        this.n = z3;
        this.o = h4qVar;
        this.p = n4qVar;
        this.q = i5;
        this.r = z4;
        this.s = y08Var;
        this.t = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgh)) {
            return false;
        }
        lgh lghVar = (lgh) obj;
        return this.a == lghVar.a && this.b.equals(lghVar.b) && this.c.equals(lghVar.c) && Intrinsics.d(this.d, lghVar.d) && Intrinsics.d(this.e, lghVar.e) && Intrinsics.d(this.f, lghVar.f) && Intrinsics.d(this.g, lghVar.g) && Intrinsics.d(this.h, lghVar.h) && this.i == lghVar.i && this.j == lghVar.j && this.k == lghVar.k && this.l == lghVar.l && this.m == lghVar.m && this.n == lghVar.n && Intrinsics.d(this.o, lghVar.o) && Intrinsics.d(this.p, lghVar.p) && this.q == lghVar.q && this.r == lghVar.r && Intrinsics.d(this.s, lghVar.s) && Intrinsics.d(this.t, lghVar.t);
    }

    public final int hashCode() {
        int hashCode = (this.s.hashCode() + k5r.e(f1d.a(this.q, eta.a(eta.a(k5r.e(k5r.e(f1d.a(this.l, k5r.e(f1d.a(this.j, f1d.a(this.i, (this.h.hashCode() + k5r.d((this.f.hashCode() + ((this.e.a.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g)) * 31, 31), 31), 31, this.k), 31), 31, this.m), 31, this.n), this.o.a, 31), this.p.a, 31), 31), 31, this.r)) * 31;
        String str = this.t;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Media3State(position=");
        sb.append(this.a);
        sb.append(", internalTimeline=");
        sb.append(this.b);
        sb.append(", externalTimeline=");
        sb.append(this.c);
        sb.append(", playlistMetadata=");
        sb.append(this.d);
        sb.append(", availablePlayerCommands=");
        sb.append(this.e);
        sb.append(", customSessionCommands=");
        sb.append(this.f);
        sb.append(", commandButtons=");
        sb.append(this.g);
        sb.append(", sessionExtras=");
        sb.append(this.h);
        sb.append(", playerState=");
        hrg.w(this.i, this.j, ", playbackSuppressionReason=", ", playWhenReady=", sb);
        sb.append(this.k);
        sb.append(", playWhenReadyChangedReason=");
        sb.append(this.l);
        sb.append(", isPlaying=");
        dfi.t(sb, this.m, ", isLoading=", this.n, ", playbackSpeed=");
        sb.append(this.o);
        sb.append(", volume=");
        sb.append(this.p);
        sb.append(", repeatMode=");
        sb.append(this.q);
        sb.append(", shuffle=");
        sb.append(this.r);
        sb.append(", deviceInfoWithVolume=");
        sb.append(this.s);
        sb.append(", errorMessage=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }
}
