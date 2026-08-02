package defpackage;

import com.google.android.gms.cast.MediaInfo;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m64 {
    public final tf6 a;
    public final dk4 b;
    public final bnd c;
    public p84 d;
    public xun e;
    public j64 f;
    public long h;
    public boolean g = true;
    public float i = 1.0f;

    public m64(tf6 tf6Var, dk4 dk4Var, bnd bndVar) {
        this.a = tf6Var;
        this.b = dk4Var;
        this.c = bndVar;
        x97.y(tf6Var, ca8.b, null, new hl(this, null, 29), 2);
    }

    public static final void a(m64 m64Var, tnl tnlVar) {
        h84 h84Var = (h84) m64Var.c.b;
        h84Var.B(tnlVar, h84Var.h);
    }

    public final void b(j64 j64Var) {
        this.h = j64Var.b;
        xun xunVar = this.e;
        if (xunVar == null) {
            this.f = j64Var;
            p84 p84Var = this.d;
            if (p84Var != null) {
                y1g.B("Must be called from the main thread.");
                xun xunVar2 = p84Var.j;
                if (xunVar2 != null) {
                    c(xunVar2);
                    return;
                }
                return;
            }
            return;
        }
        this.f = null;
        MediaInfo mediaInfo = j64Var.c;
        double d = this.i;
        if (Double.compare(d, 2.0d) > 0 || Double.compare(d, 0.5d) < 0) {
            xq0.x("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            return;
        }
        boolean z = j64Var.a;
        long j = j64Var.b;
        Boolean valueOf = Boolean.valueOf(z);
        if (Double.compare(d, 2.0d) > 0 || Double.compare(d, 0.5d) < 0) {
            xq0.x("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            return;
        }
        coh cohVar = new coh(mediaInfo, null, valueOf, j, d, null, null, null, null, null, null, 0L);
        y1g.B("Must be called from the main thread.");
        if (xunVar.y()) {
            xun.z(new r1x(xunVar, cohVar, 1));
        } else {
            xun.t();
        }
    }

    public final void c(xun xunVar) {
        if (Intrinsics.d(this.e, xunVar)) {
            return;
        }
        this.e = xunVar;
        if (xunVar == null) {
            return;
        }
        j64 j64Var = this.f;
        if (j64Var != null) {
            b(j64Var);
        }
        xun xunVar2 = this.e;
        if (xunVar2 != null) {
            xunVar2.p(new l64(this, xunVar));
        }
        xun xunVar3 = this.e;
        if (xunVar3 != null) {
            h64 h64Var = new h64(this);
            ConcurrentHashMap concurrentHashMap = xunVar3.k;
            ConcurrentHashMap concurrentHashMap2 = xunVar3.j;
            y1g.B("Must be called from the main thread.");
            if (concurrentHashMap2.containsKey(h64Var)) {
                return;
            }
            v3x v3xVar = (v3x) concurrentHashMap.get(100L);
            if (v3xVar == null) {
                v3xVar = new v3x(xunVar3);
                concurrentHashMap.put(100L, v3xVar);
            }
            v3xVar.a.add(h64Var);
            concurrentHashMap2.put(h64Var, v3xVar);
            if (xunVar3.h()) {
                xun xunVar4 = v3xVar.e;
                fsn fsnVar = xunVar4.b;
                fbr fbrVar = v3xVar.c;
                fsnVar.removeCallbacks(fbrVar);
                v3xVar.d = true;
                xunVar4.b.postDelayed(fbrVar, v3xVar.b);
            }
        }
    }
}
