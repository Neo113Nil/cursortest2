package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/* loaded from: classes4.dex */
public final class nsu implements l5v {
    public final GLSurfaceView a;
    public final p4r b;
    public final k5v c;
    public float d = 0.25f;
    public boolean e = true;
    public volatile boolean f = true;
    public boolean g;

    public nsu(GLSurfaceView gLSurfaceView, p4r p4rVar, int i) {
        this.a = gLSurfaceView;
        this.b = p4rVar;
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        gLSurfaceView.getHolder().setFormat(1);
        k5v k5vVar = new k5v(p4rVar);
        this.c = k5vVar;
        gLSurfaceView.setRenderer(k5vVar);
        gLSurfaceView.setRenderMode(1);
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        gLSurfaceView.queueEvent(new no0(this, i, 5));
        gLSurfaceView.setVisibility(0);
        gLSurfaceView.addOnLayoutChangeListener(new c34(4, this));
    }

    @Override // defpackage.l5v
    public final void a() {
        ssg.a(3, "WaveGlShaderViewWrapper", "onPause", null);
        GLSurfaceView gLSurfaceView = this.a;
        gLSurfaceView.setRenderMode(0);
        gLSurfaceView.onPause();
        this.b.c(new xnq(26));
    }

    @Override // defpackage.l5v
    public final void b(yy1 yy1Var) {
        yy1Var.getClass();
        p4r p4rVar = this.b;
        p4rVar.a.queueEvent(new zvh(26, p4rVar, yy1Var));
    }

    @Override // defpackage.l5v
    public final void c(float f) {
        p4r p4rVar = this.b;
        p4rVar.a.queueEvent(new k4r(p4rVar, f, 3));
    }

    @Override // defpackage.l5v
    public final void d(boolean z) {
        this.c.b = z;
        this.f = false;
    }

    @Override // defpackage.l5v
    public final void destroy() {
        ssg.a(3, "WaveGlShaderViewWrapper", "destroy", null);
        this.c.c = null;
        p4r p4rVar = this.b;
        p4rVar.c(new xnq(25));
        rar rarVar = p4rVar.e0;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.a.setVisibility(8);
    }

    @Override // defpackage.l5v
    public final void e() {
        ssg.a(3, "WaveGlShaderViewWrapper", "switchToOptimizedShaderFallback", null);
        this.d = 0.1f;
        this.a.getHolder().setFixedSize((int) (r0.getMeasuredWidth() * this.d), (int) (r0.getMeasuredHeight() * this.d));
        p4r p4rVar = this.b;
        p4rVar.a.queueEvent(new n4r(p4rVar, 0));
    }

    @Override // defpackage.l5v
    public final void f() {
        p4r p4rVar = this.b;
        AnimatorSet animatorSet = p4rVar.X;
        if (animatorSet == null || !animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(p4rVar.b(0L, new m4r(p4rVar, 2)), p4rVar.b(100L, new m4r(p4rVar, 3)), p4rVar.b(150L, new m4r(p4rVar, 4)));
            animatorSet2.start();
            p4rVar.X = animatorSet2;
        }
    }

    @Override // defpackage.l5v
    public final void g(MotionEvent motionEvent) {
        motionEvent.getClass();
        final p4r p4rVar = this.b;
        if (motionEvent.getAction() == 1) {
            if (p4rVar.x > 0.0f) {
                ValueAnimator valueAnimator = p4rVar.Y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                p4rVar.Y = v3g.u(new float[]{p4rVar.x, 0.0f}, 400L, p4rVar.a, true, new m4r(p4rVar, 5));
                return;
            }
            return;
        }
        int measuredWidth = p4rVar.a.getMeasuredWidth();
        Integer valueOf = Integer.valueOf(measuredWidth);
        if (measuredWidth <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            int measuredHeight = p4rVar.a.getMeasuredHeight();
            Integer valueOf2 = measuredHeight > 0 ? Integer.valueOf(measuredHeight) : null;
            if (valueOf2 != null) {
                int intValue2 = valueOf2.intValue();
                float f = 2;
                float x = (motionEvent.getX() * f) / intValue;
                float f2 = 1;
                final float f3 = x - f2;
                final float y = f2 - ((motionEvent.getY() * f) / intValue2);
                p4rVar.a.queueEvent(new Runnable() { // from class: o4r
                    @Override // java.lang.Runnable
                    public final void run() {
                        GLES20.glUniform2f(p4r.this.R, f3, y);
                    }
                });
                ValueAnimator valueAnimator2 = p4rVar.Y;
                if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && p4rVar.x < 1.0f) {
                    p4rVar.Y = v3g.u(new float[]{p4rVar.x, 1.0f}, 400L, p4rVar.a, true, new m4r(p4rVar, 6));
                }
            }
        }
    }

    @Override // defpackage.l5v
    public final void h(long j, boolean z) {
        p4r p4rVar = this.b;
        if (!p4rVar.b) {
            dfi.r("Unexpected behaviour, set blobs visibility on non-wave screen", "SparkShader");
        }
        ValueAnimator valueAnimator = p4rVar.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = z ? 0.8f : 0.01f;
        if (j > 0) {
            p4rVar.V = v3g.u(new float[]{p4rVar.q, f}, j, p4rVar.a, true, new m4r(p4rVar, 1));
        } else {
            p4rVar.a.queueEvent(new k4r(p4rVar, f, 2));
        }
    }

    @Override // defpackage.l5v
    public final void i(float f) {
        p4r p4rVar = this.b;
        p4rVar.a.queueEvent(new k4r(p4rVar, f, 1));
    }

    @Override // defpackage.l5v
    public final void onResume() {
        ssg.a(3, "WaveGlShaderViewWrapper", "onResume", null);
        GLSurfaceView gLSurfaceView = this.a;
        gLSurfaceView.setBackgroundColor(0);
        gLSurfaceView.setRenderMode(1);
        gLSurfaceView.onResume();
        this.b.c(new xnq(27));
    }

    @Override // defpackage.l5v
    public final void setFpsInfoCallback(jhs jhsVar) {
        this.c.c = jhsVar;
    }

    @Override // defpackage.l5v
    public final void setGradientHorizontal(boolean z) {
        p4r p4rVar = this.b;
        float f = z ? 1.0f : 0.0f;
        p4rVar.Z = f;
        p4rVar.a.queueEvent(new k4r(p4rVar, f, 0));
    }

    @Override // defpackage.l5v
    public final void setPlaying(boolean z) {
        p4r p4rVar = this.b;
        GLSurfaceView gLSurfaceView = p4rVar.a;
        boolean z2 = this.e;
        if (z) {
            if (z2) {
                this.e = false;
                gLSurfaceView.queueEvent(new k4r(p4rVar, p4rVar.f, 4));
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.e = true;
        gLSurfaceView.queueEvent(new k4r(p4rVar, 0.2f, 4));
        b(yy1.e);
    }

    @Override // defpackage.l5v
    public final void setTrackMoodSpecs(dys dysVar) {
        float f;
        dysVar.getClass();
        p4r p4rVar = this.b;
        boolean z = this.e;
        if (dysVar instanceof bys) {
            f = ((bys) dysVar).a.d;
        } else {
            if (!(dysVar instanceof cys)) {
                b6e.s();
                return;
            }
            f = 0.5f;
        }
        float f2 = (f + 1.0f) * 0.5f;
        p4rVar.f = f2;
        if (z) {
            f2 = 0.2f;
        }
        p4rVar.a.queueEvent(new k4r(p4rVar, f2, 4));
        ValueAnimator valueAnimator = p4rVar.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        osu osuVar = new osu(p4rVar.r, p4rVar.s, p4rVar.t, p4rVar.u, p4rVar.v, p4rVar.w);
        osu f3 = p4r.f(dysVar);
        if (p4rVar.a0) {
            p4rVar.a0 = false;
            p4rVar.a.queueEvent(new l4r(p4rVar, f3, 1));
        } else {
            p4rVar.W = v3g.u(new float[]{0.0f, 1.0f}, p4rVar.c, p4rVar.a, true, new zzq(2, p4rVar, osuVar, f3));
        }
        b(yy1.e);
        if (!this.g) {
            this.b.d();
            this.g = true;
        }
        if (this.f) {
            d(true);
        }
    }

    @Override // defpackage.l5v
    public final void setWaveScreenBackground(r3v r3vVar) {
        r3vVar.getClass();
        this.b.j(r3vVar);
        if (!this.g) {
            this.b.d();
            this.g = true;
        }
        b(yy1.e);
        if (this.f) {
            d(true);
        }
    }
}
