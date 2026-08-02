package yads;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.auo;
import defpackage.bn61;
import defpackage.dl71;
import defpackage.ek71;
import defpackage.fi81;
import defpackage.hm61;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.s371;
import defpackage.tp71;
import defpackage.wp61;

/* loaded from: classes7.dex */
public final class c33 extends FrameLayout {
    public final SurfaceView a;
    public float b;
    public wp61 c;
    public tp71 d;
    public fi81 e;

    public c33(Context context) {
        super(context);
        SurfaceView surfaceView = new SurfaceView(context);
        this.a = surfaceView;
        this.b = 1.0f;
        this.c = new dl71();
        setBackgroundColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        addView(surfaceView, new FrameLayout.LayoutParams(-1, -2, 17));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        hm61 l = this.c.l(i, i2);
        super.onMeasure(l.a, l.b);
        tp71 tp71Var = this.d;
        if (tp71Var != null) {
            hm61 hm61Var = tp71Var.b;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = measuredWidth;
            float f2 = measuredHeight;
            float f3 = tp71Var.a;
            if ((f3 / (f / f2)) - 1.0f > 0.0f) {
                measuredHeight = (int) (f / f3);
            } else {
                measuredWidth = (int) (f2 * f3);
            }
            hm61Var.a = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            hm61Var.b = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            this.a.measure(hm61Var.a, hm61Var.b);
        }
    }

    public final void setAspectRatio(float f) {
        if (f <= 0.0f || f == this.b) {
            return;
        }
        this.b = f;
        this.d = new tp71(f);
        this.c = new auo(f);
        requestLayout();
    }

    public final void setPlayer(fi81 fi81Var) {
        if (jl40.l(this.e, fi81Var)) {
            return;
        }
        fi81 fi81Var2 = this.e;
        if (fi81Var2 != null) {
            SurfaceView surfaceView = this.a;
            ek71 ek71Var = (ek71) fi81Var2;
            ek71Var.v();
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            ek71Var.v();
            if (holder != null && holder == ek71Var.M) {
                ek71Var.v();
                ek71Var.t();
                ek71Var.f(null);
                ek71Var.c(0, 0);
            }
        }
        this.e = fi81Var;
        if (fi81Var != null) {
            ek71 ek71Var2 = (ek71) ((bn61) fi81Var);
            ek71Var2.v();
            if (ek71Var2.H.a.a.get(27)) {
                SurfaceView surfaceView2 = this.a;
                ek71 ek71Var3 = (ek71) fi81Var;
                gn0 gn0Var = ek71Var3.t;
                ek71Var3.v();
                if (!(surfaceView2 instanceof l03)) {
                    SurfaceHolder holder2 = surfaceView2 == null ? null : surfaceView2.getHolder();
                    ek71Var3.v();
                    if (holder2 == null) {
                        ek71Var3.v();
                        ek71Var3.t();
                        ek71Var3.f(null);
                        ek71Var3.c(0, 0);
                        return;
                    }
                    ek71Var3.t();
                    ek71Var3.O = true;
                    ek71Var3.M = holder2;
                    holder2.addCallback(gn0Var);
                    Surface surface = holder2.getSurface();
                    if (surface == null || !surface.isValid()) {
                        ek71Var3.f(null);
                        ek71Var3.c(0, 0);
                        return;
                    } else {
                        ek71Var3.f(surface);
                        Rect surfaceFrame = holder2.getSurfaceFrame();
                        ek71Var3.c(surfaceFrame.width(), surfaceFrame.height());
                        return;
                    }
                }
                ek71Var3.t();
                ek71Var3.N = (l03) surfaceView2;
                s371 b = ek71Var3.b(ek71Var3.u);
                boolean z = b.g;
                if (z) {
                    ny61.k();
                    return;
                }
                b.d = 10000;
                l03 l03Var = ek71Var3.N;
                if (z) {
                    ny61.k();
                    return;
                }
                b.e = l03Var;
                b.a();
                ek71Var3.N.a.add(gn0Var);
                ek71Var3.f(ek71Var3.N.h);
                SurfaceHolder holder3 = surfaceView2.getHolder();
                ek71Var3.O = false;
                ek71Var3.M = holder3;
                holder3.addCallback(gn0Var);
                Surface surface2 = ek71Var3.M.getSurface();
                if (surface2 == null || !surface2.isValid()) {
                    ek71Var3.c(0, 0);
                } else {
                    Rect surfaceFrame2 = ek71Var3.M.getSurfaceFrame();
                    ek71Var3.c(surfaceFrame2.width(), surfaceFrame2.height());
                }
            }
        }
    }
}
