package yads;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a391;
import defpackage.a441;
import defpackage.auo;
import defpackage.bw81;
import defpackage.c081;
import defpackage.c381;
import defpackage.dg61;
import defpackage.dl71;
import defpackage.dv81;
import defpackage.h771;
import defpackage.hm61;
import defpackage.j18;
import defpackage.mf60;
import defpackage.ng81;
import defpackage.nn61;
import defpackage.rp81;
import defpackage.sq81;
import defpackage.ua71;
import defpackage.ug71;
import defpackage.uy61;
import defpackage.vi71;
import defpackage.wd71;
import defpackage.wp61;
import defpackage.wvb1;
import defpackage.xn71;
import defpackage.zy11;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class lv1 extends t92 {
    public static final /* synthetic */ int o = 0;
    public final nn61 k;
    public ug71 l;
    public final c081 m;
    public wp61 n;

    public lv1(Context context, rp81 rp81Var, AttributeSet attributeSet) {
        super(context, rp81Var, attributeSet, 56);
        nn61 nn61Var = new nn61();
        this.k = nn61Var;
        this.l = wd71.a;
        this.m = new c081(this, nn61Var);
        this.n = new dl71();
    }

    public final void a(String str, xn71 xn71Var) {
        if (this.l instanceof wd71) {
            this.l = new ua71(xn71Var);
            c081 c081Var = this.m;
            c081Var.e.getClass();
            boolean find = bw81.a.matcher(str).find();
            c081Var.f.getClass();
            sq81 uy61Var = find ? new uy61() : new c381();
            t92 t92Var = c081Var.a;
            dv81 dv81Var = c081Var.c;
            nn61 nn61Var = c081Var.b;
            uy61Var.a(t92Var, c081Var, dv81Var, nn61Var, nn61Var, nn61Var).g(str);
        }
    }

    @Override // yads.t92
    public final void c() {
        a441 a441Var = this.m.d;
        Map f = b.f();
        a391 a391Var = (a391) a441Var.c;
        synchronized (a391Var.a) {
            if (a391Var.b) {
                return;
            }
            a391Var.b = true;
            ((lv1) a441Var.b).setVisibility(0);
            lv1 lv1Var = (lv1) a441Var.b;
            dg61 dg61Var = lv1Var.f;
            if (dg61Var != null) {
                dg61Var.a(lv1Var, f);
            }
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        hm61 l = this.n.l(i, i2);
        super.onMeasure(l.a, l.b);
    }

    @Override // yads.t92, com.monetization.ads.base.webview.HtmlWebViewClientListener
    public final void onPageFinished() {
        super.onPageFinished();
        ug71 ug71Var = this.l;
        ua71 ua71Var = ug71Var instanceof ua71 ? (ua71) ug71Var : null;
        if (ua71Var != null) {
            xn71 xn71Var = ua71Var.a;
            if (xn71Var != null) {
                wvb1 wvb1Var = (wvb1) ((vi71) xn71Var).w;
                boolean z = wvb1Var.a;
                j18 j18Var = (j18) wvb1Var.b;
                if (z && (j18Var.t() instanceof mf60)) {
                    j18Var.resumeWith(zy11.a);
                }
            }
            this.l = h771.a;
        }
    }

    @Override // yads.t92, com.monetization.ads.base.webview.HtmlWebViewClientListener
    public final void onReceivedError(int i) {
        super.onReceivedError(i);
        ug71 ug71Var = this.l;
        ua71 ua71Var = ug71Var instanceof ua71 ? (ua71) ug71Var : null;
        if (ua71Var != null) {
            xn71 xn71Var = ua71Var.a;
            if (xn71Var != null) {
                vi71 vi71Var = (vi71) xn71Var;
                wvb1 wvb1Var = (wvb1) vi71Var.w;
                boolean z = wvb1Var.a;
                j18 j18Var = (j18) wvb1Var.b;
                if (z && (j18Var.t() instanceof mf60)) {
                    j18Var.resumeWith(zy11.a);
                }
            }
            stopLoading();
            this.l = wd71.a;
        }
    }

    public final void setAspectRatio(float f) {
        this.n = new auo(f);
    }

    public final void setClickListener(ng81 ng81Var) {
        this.m.h = ng81Var;
    }

    public final void setPreloadingState(ug71 ug71Var) {
        this.l = ug71Var;
    }

    public lv1(Context context, AttributeSet attributeSet) {
        this(context, new rp81(), attributeSet);
    }
}
