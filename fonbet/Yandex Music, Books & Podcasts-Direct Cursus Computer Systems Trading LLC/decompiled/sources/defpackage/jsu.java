package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jsu implements l5v {
    public final int a;
    public final GLSurfaceView b;
    public nsu c;
    public boolean d;

    public jsu(Context context, int i, boolean z, long j) {
        context.getClass();
        this.a = i;
        GLSurfaceView gLSurfaceView = new GLSurfaceView(context);
        this.b = gLSurfaceView;
        this.c = new nsu(gLSurfaceView, new p4r(gLSurfaceView, z, j), i);
        ssg.a(3, "WaveGlShaderSwappableViewWrapper", "init", null);
    }

    @Override // defpackage.l5v
    public final void a() {
        ssg.a(3, "WaveGlShaderSwappableViewWrapper", "onPause", null);
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.a();
        }
        nsu nsuVar2 = this.c;
        if (nsuVar2 != null) {
            nsuVar2.d(false);
        }
    }

    @Override // defpackage.l5v
    public final void b(yy1 yy1Var) {
        yy1Var.getClass();
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.b(yy1Var);
        }
    }

    @Override // defpackage.l5v
    public final void c(float f) {
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.c(f);
        }
    }

    @Override // defpackage.l5v
    public final void d(boolean z) {
        this.d = z;
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.d(z);
        }
    }

    @Override // defpackage.l5v
    public final void destroy() {
        ssg.a(3, "WaveGlShaderSwappableViewWrapper", "destroy", null);
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.destroy();
        }
        this.c = null;
    }

    @Override // defpackage.l5v
    public final void e() {
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.e();
        }
    }

    @Override // defpackage.l5v
    public final void f() {
        ssg.a(3, "WaveGlShaderSwappableViewWrapper", "showLikeReaction", null);
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.f();
        }
    }

    @Override // defpackage.l5v
    public final void g(MotionEvent motionEvent) {
        motionEvent.getClass();
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.g(motionEvent);
        }
    }

    @Override // defpackage.l5v
    public final void h(long j, boolean z) {
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.h(j, z);
        }
    }

    @Override // defpackage.l5v
    public final void i(float f) {
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.i(f);
        }
    }

    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1842863462);
        if ((((oq5Var2.h(this) ? 4 : 2) | i) & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean h = oq5Var2.h(this);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new wfs(23, this);
                oq5Var2.k0(K);
            }
            wyf.c(null, null, null, (Function0) K, null, oq5Var2, 0, 47);
            kfh d = ug3.d(b2c.b, false);
            int i2 = oq5Var2.P;
            a l = oq5Var2.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var2, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var2, i2, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            boolean h2 = oq5Var2.h(this);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                K2 = new r3s(27, this);
                oq5Var2.k0(K2);
            }
            androidx.compose.ui.viewinterop.a.a(48, 4, oq5Var2, d.c(vciVar, 1.0f), (Function1) K2, null);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new isu(this, i);
        }
    }

    @Override // defpackage.l5v
    public final void onResume() {
        ssg.a(3, "WaveGlShaderSwappableViewWrapper", "onResume", null);
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.onResume();
        }
        nsu nsuVar2 = this.c;
        if (nsuVar2 != null) {
            nsuVar2.d(this.d);
        }
    }

    @Override // defpackage.l5v
    public final void setFpsInfoCallback(jhs jhsVar) {
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.c.c = jhsVar;
        }
    }

    @Override // defpackage.l5v
    public final void setGradientHorizontal(boolean z) {
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.setGradientHorizontal(z);
        }
    }

    @Override // defpackage.l5v
    public final void setPlaying(boolean z) {
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.setPlaying(z);
        }
    }

    @Override // defpackage.l5v
    public final void setTrackMoodSpecs(dys dysVar) {
        dysVar.getClass();
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.setTrackMoodSpecs(dysVar);
        }
    }

    @Override // defpackage.l5v
    public final void setWaveScreenBackground(r3v r3vVar) {
        r3vVar.getClass();
        nsu nsuVar = this.c;
        if (nsuVar != null) {
            nsuVar.setWaveScreenBackground(r3vVar);
        }
    }
}
