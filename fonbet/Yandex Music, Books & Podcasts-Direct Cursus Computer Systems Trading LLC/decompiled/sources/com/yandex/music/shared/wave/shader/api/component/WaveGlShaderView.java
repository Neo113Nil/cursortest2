package com.yandex.music.shared.wave.shader.api.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.dys;
import defpackage.f5r;
import defpackage.hq5;
import defpackage.jhs;
import defpackage.l5v;
import defpackage.msu;
import defpackage.oq5;
import defpackage.r3v;
import defpackage.szf;
import defpackage.x6k;
import defpackage.xmn;
import defpackage.yy1;
import defpackage.z5;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class WaveGlShaderView extends z5 implements l5v {
    public static final /* synthetic */ int m = 0;
    public final x6k i;
    public l5v j;
    public boolean k;
    public msu l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveGlShaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.i = szf.g0(null);
    }

    @Override // defpackage.l5v
    public final void a() {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.a();
        }
    }

    @Override // defpackage.l5v
    public final void b(yy1 yy1Var) {
        yy1Var.getClass();
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.b(yy1Var);
        }
    }

    @Override // defpackage.l5v
    public final void c(float f) {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.c(f);
        }
    }

    @Override // defpackage.l5v
    public final void d(boolean z) {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.d(z);
        }
    }

    @Override // defpackage.l5v
    public final void destroy() {
        this.l = null;
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.destroy();
        }
    }

    @Override // defpackage.l5v
    public final void e() {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.e();
        }
    }

    @Override // defpackage.l5v
    public final void f() {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.f();
        }
    }

    @Override // defpackage.l5v
    public final void g(MotionEvent motionEvent) {
        motionEvent.getClass();
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.g(motionEvent);
        }
    }

    @Override // defpackage.z5
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.k;
    }

    public final msu getViewState() {
        return this.l;
    }

    @Override // defpackage.l5v
    public final void h(long j, boolean z) {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.h(j, z);
        }
    }

    @Override // defpackage.l5v
    public final void i(float f) {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.i(f);
        }
    }

    @Override // defpackage.z5
    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(141887516);
        if ((((oq5Var.h(this) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Function2 function2 = (Function2) this.i.getValue();
            if (function2 == null) {
                oq5Var.Z(723208829);
            } else {
                oq5Var.Z(-1085049340);
                function2.invoke(oq5Var, 0);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f5r(this, i, 18);
        }
    }

    @Override // defpackage.l5v
    public final void onResume() {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.onResume();
        }
    }

    @Override // defpackage.l5v
    public void setFpsInfoCallback(jhs jhsVar) {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.setFpsInfoCallback(jhsVar);
        }
    }

    @Override // defpackage.l5v
    public void setGradientHorizontal(boolean z) {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.setGradientHorizontal(z);
        }
    }

    @Override // defpackage.l5v
    public void setPlaying(boolean z) {
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.setPlaying(z);
        }
    }

    @Override // defpackage.l5v
    public void setTrackMoodSpecs(@NotNull dys dysVar) {
        dysVar.getClass();
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.setTrackMoodSpecs(dysVar);
        }
    }

    @Override // defpackage.l5v
    public void setWaveScreenBackground(@NotNull r3v r3vVar) {
        r3vVar.getClass();
        l5v l5vVar = this.j;
        if (l5vVar != null) {
            l5vVar.setWaveScreenBackground(r3vVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WaveGlShaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WaveGlShaderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ WaveGlShaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
