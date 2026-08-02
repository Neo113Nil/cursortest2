package defpackage;

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b4x {
    public static final msg i = new msg("SessionTransController", null);
    public final k74 a;
    public jmp f;
    public vs3 g;
    public xmp h;
    public final Set b = Collections.synchronizedSet(new HashSet());
    public int e = 0;
    public final fsn c = new fsn(Looper.getMainLooper(), 3);
    public final t3x d = new t3x(this, 0);

    public b4x(k74 k74Var) {
        this.a = k74Var;
    }

    public final xun a() {
        jmp jmpVar = this.f;
        msg msgVar = i;
        if (jmpVar == null) {
            msgVar.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        y1g.B("Must be called from the main thread.");
        nkp c = jmpVar.c();
        p84 p84Var = (c == null || !(c instanceof p84)) ? null : (p84) c;
        if (p84Var == null) {
            msgVar.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        y1g.B("Must be called from the main thread.");
        return p84Var.j;
    }

    public final void b(int i2) {
        vs3 vs3Var = this.g;
        if (vs3Var != null) {
            vs3Var.d = true;
            ys3 ys3Var = vs3Var.b;
            if (ys3Var != null && ys3Var.b.cancel(true)) {
                vs3Var.a = null;
                vs3Var.b = null;
                vs3Var.c = null;
            }
        }
        i.b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.e), Integer.valueOf(i2));
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            ifx ifxVar = (ifx) it.next();
            int i3 = this.e;
            switch (ifxVar.a) {
                case 0:
                    zfx.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i3), Integer.valueOf(i2));
                    zfx zfxVar = (zfx) ifxVar.b;
                    zfxVar.c();
                    nhx b = zfxVar.c.b(zfxVar.g);
                    hhx n = ihx.n(b.d());
                    n.c();
                    ihx.y((ihx) n.b, i3);
                    n.c();
                    ihx.x((ihx) n.b, i2);
                    b.e((ihx) n.b());
                    zfxVar.a.a((ohx) b.b(), 232);
                    zfxVar.i = false;
                    break;
                default:
                    w2r w2rVar = new w2r(11);
                    w2rVar.c = Integer.valueOf(i2);
                    tao taoVar = (tao) ifxVar.b;
                    w2rVar.d = Boolean.valueOf(((s0x) taoVar.b).i == 2);
                    tao.w(taoVar, new l5x(w2rVar));
                    break;
            }
        }
        c();
    }

    public final void c() {
        fsn fsnVar = this.c;
        y1g.G(fsnVar);
        t3x t3xVar = this.d;
        y1g.G(t3xVar);
        fsnVar.removeCallbacks(t3xVar);
        this.e = 0;
        this.h = null;
    }
}
