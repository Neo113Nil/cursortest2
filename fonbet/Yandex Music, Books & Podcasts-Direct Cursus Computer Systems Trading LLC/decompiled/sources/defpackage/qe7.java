package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

/* loaded from: classes6.dex */
public final class qe7 {
    public final String a;
    public final wb6 b;
    public final vcu c;
    public final sy1 d;
    public final zpr e;
    public final mmq f;
    public final jg7 g;
    public final jg7 h;
    public final DrmMode i;
    public final int j;
    public final String k;
    public final tk2 l;
    public final cgg m;
    public final rn3 n;
    public final pi3 o;
    public final Long p;
    public final zmf q;
    public final String r;
    public final String s;
    public final SessionColor t;
    public final List u;
    public final List v;
    public final List w;
    public final long x;
    public final yg0 y;
    public final boolean z;

    public qe7(String str, wb6 wb6Var, vcu vcuVar, sy1 sy1Var, zpr zprVar, mmq mmqVar, jg7 jg7Var, jg7 jg7Var2, DrmMode drmMode, int i, String str2, tk2 tk2Var, cgg cggVar, rn3 rn3Var, pi3 pi3Var, Long l, zmf zmfVar, String str3, String str4, SessionColor sessionColor, List list, List list2, List list3, long j, yg0 yg0Var, boolean z) {
        sessionColor.getClass();
        this.a = str;
        this.b = wb6Var;
        this.c = vcuVar;
        this.d = sy1Var;
        this.e = zprVar;
        this.f = mmqVar;
        this.g = jg7Var;
        this.h = jg7Var2;
        this.i = drmMode;
        this.j = i;
        this.k = str2;
        this.l = tk2Var;
        this.m = cggVar;
        this.n = rn3Var;
        this.o = pi3Var;
        this.p = l;
        this.q = zmfVar;
        this.r = str3;
        this.s = str4;
        this.t = sessionColor;
        this.u = list;
        this.v = list2;
        this.w = list3;
        this.x = j;
        this.y = yg0Var;
        this.z = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe7)) {
            return false;
        }
        qe7 qe7Var = (qe7) obj;
        return Intrinsics.d(this.a, qe7Var.a) && Intrinsics.d(this.b, qe7Var.b) && Intrinsics.d(this.c, qe7Var.c) && Intrinsics.d(this.d, qe7Var.d) && Intrinsics.d(this.e, qe7Var.e) && Intrinsics.d(this.f, qe7Var.f) && Intrinsics.d(this.g, qe7Var.g) && Intrinsics.d(this.h, qe7Var.h) && this.i == qe7Var.i && this.j == qe7Var.j && Intrinsics.d(this.k, qe7Var.k) && Intrinsics.d(this.l, qe7Var.l) && Intrinsics.d(this.m, qe7Var.m) && Intrinsics.d(this.n, qe7Var.n) && Intrinsics.d(this.o, qe7Var.o) && Intrinsics.d(this.p, qe7Var.p) && Intrinsics.d(this.q, qe7Var.q) && Intrinsics.d(this.r, qe7Var.r) && Intrinsics.d(this.s, qe7Var.s) && this.t == qe7Var.t && Intrinsics.d(this.u, qe7Var.u) && Intrinsics.d(this.v, qe7Var.v) && Intrinsics.d(this.w, qe7Var.w) && this.x == qe7Var.x && Intrinsics.d(this.y, qe7Var.y) && this.z == qe7Var.z;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        wb6 wb6Var = this.b;
        int hashCode2 = (hashCode + (wb6Var == null ? 0 : wb6Var.hashCode())) * 31;
        vcu vcuVar = this.c;
        int hashCode3 = (hashCode2 + (vcuVar == null ? 0 : vcuVar.hashCode())) * 31;
        sy1 sy1Var = this.d;
        int hashCode4 = (hashCode3 + (sy1Var == null ? 0 : sy1Var.hashCode())) * 31;
        zpr zprVar = this.e;
        int hashCode5 = (hashCode4 + (zprVar == null ? 0 : zprVar.hashCode())) * 31;
        mmq mmqVar = this.f;
        int hashCode6 = (hashCode5 + (mmqVar == null ? 0 : mmqVar.hashCode())) * 31;
        jg7 jg7Var = this.g;
        int hashCode7 = (hashCode6 + (jg7Var == null ? 0 : jg7Var.hashCode())) * 31;
        jg7 jg7Var2 = this.h;
        int hashCode8 = (hashCode7 + (jg7Var2 == null ? 0 : jg7Var2.hashCode())) * 31;
        DrmMode drmMode = this.i;
        int a = f1d.a(this.j, (hashCode8 + (drmMode == null ? 0 : drmMode.hashCode())) * 31, 31);
        String str2 = this.k;
        int hashCode9 = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        tk2 tk2Var = this.l;
        int hashCode10 = (hashCode9 + (tk2Var == null ? 0 : tk2Var.hashCode())) * 31;
        cgg cggVar = this.m;
        int hashCode11 = (hashCode10 + (cggVar == null ? 0 : cggVar.hashCode())) * 31;
        rn3 rn3Var = this.n;
        int hashCode12 = (hashCode11 + (rn3Var == null ? 0 : rn3Var.hashCode())) * 31;
        pi3 pi3Var = this.o;
        int hashCode13 = (hashCode12 + (pi3Var == null ? 0 : pi3Var.hashCode())) * 31;
        Long l = this.p;
        int hashCode14 = (hashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        zmf zmfVar = this.q;
        int hashCode15 = (hashCode14 + (zmfVar == null ? 0 : zmfVar.hashCode())) * 31;
        String str3 = this.r;
        int hashCode16 = (hashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.s;
        int hashCode17 = (this.t.hashCode() + ((hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List list = this.u;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.v;
        int hashCode19 = (hashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.w;
        int c = tlm.c(this.x, (hashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31, 31);
        yg0 yg0Var = this.y;
        return Boolean.hashCode(this.z) + ((c + (yg0Var != null ? yg0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugData(vsid=");
        sb.append(this.a);
        sb.append(", contentData=");
        sb.append(this.b);
        sb.append(", videoTrackData=");
        sb.append(this.c);
        sb.append(", audioTrackData=");
        sb.append(this.d);
        sb.append(", subtitlesTrackData=");
        sb.append(this.e);
        sb.append(", viewPortSize=");
        sb.append(this.f);
        sb.append(", videoDecoderData=");
        sb.append(this.g);
        sb.append(", audioDecoderData=");
        sb.append(this.h);
        sb.append(", drmMode=");
        sb.append(this.i);
        sb.append(", droppedFrames=");
        sb.append(this.j);
        sb.append(", networkTypeName=");
        sb.append(this.k);
        sb.append(", lastBandwidthEstimation=");
        sb.append(this.l);
        sb.append(", lastLoadedChunk=");
        sb.append(this.m);
        sb.append(", bytesLoaded=");
        sb.append(this.n);
        sb.append(", currentBufferSize=");
        sb.append(this.o);
        sb.append(", targetBufferSize=");
        sb.append(this.p);
        sb.append(", latencyData=");
        sb.append(this.q);
        sb.append(", lastError=");
        sb.append(this.r);
        sb.append(", dateTime=");
        sb.append(this.s);
        sb.append(", sessionColor=");
        sb.append(this.t);
        sb.append(", bandwidthEstimationsHistory=");
        sb.append(this.u);
        sb.append(", loadedChunksHistory=");
        sb.append(this.v);
        sb.append(", bufferSizeHistory=");
        sb.append(this.w);
        sb.append(", ts=");
        sb.append(this.x);
        sb.append(", vsidBitmap=");
        sb.append(this.y);
        sb.append(", isCompact=");
        return dfi.j(sb, this.z, ')');
    }

    public /* synthetic */ qe7() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, SessionColor.NONE, null, null, null, System.currentTimeMillis(), null, false);
    }
}
