package com.anythink.basead.ui;

import D.y;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.b.f;
import com.anythink.basead.d.j;
import com.anythink.basead.e;
import com.anythink.basead.g.i;
import com.anythink.basead.ui.BaseEndCardView;
import com.anythink.basead.ui.MraidEndCardView;
import com.anythink.basead.ui.PanelView;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.basead.ui.component.CTAButtonLayout;
import com.anythink.basead.ui.component.a;
import com.anythink.basead.ui.improveclick.d;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.basead.ui.web.WebProgressBarView;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;
import com.anythink.core.d.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class BaseScreenATView extends BaseATView {
    public static final int FORMAT_INTERSTITIAL = 3;
    public static final int FORMAT_REWARD_VIDEO = 1;
    public static final String TAG = "BaseScreenATView";

    /* renamed from: A, reason: collision with root package name */
    protected int f9840A;

    /* renamed from: B, reason: collision with root package name */
    protected int f9841B;

    /* renamed from: C, reason: collision with root package name */
    protected int f9842C;

    /* renamed from: D, reason: collision with root package name */
    protected boolean f9843D;

    /* renamed from: E, reason: collision with root package name */
    protected int f9844E;

    /* renamed from: F, reason: collision with root package name */
    protected int f9845F;

    /* renamed from: G, reason: collision with root package name */
    protected long f9846G;

    /* renamed from: H, reason: collision with root package name */
    protected long f9847H;

    /* renamed from: I, reason: collision with root package name */
    protected boolean f9848I;
    protected boolean J;

    /* renamed from: K, reason: collision with root package name */
    protected boolean f9849K;

    /* renamed from: L, reason: collision with root package name */
    protected float f9850L;

    /* renamed from: M, reason: collision with root package name */
    protected RelativeLayout f9851M;

    /* renamed from: N, reason: collision with root package name */
    protected PanelView f9852N;

    /* renamed from: O, reason: collision with root package name */
    protected BaseEndCardView f9853O;

    /* renamed from: P, reason: collision with root package name */
    protected c f9854P;

    /* renamed from: Q, reason: collision with root package name */
    protected CloseImageView f9855Q;

    /* renamed from: R, reason: collision with root package name */
    protected ViewGroup f9856R;

    /* renamed from: S, reason: collision with root package name */
    protected MuteImageView f9857S;

    /* renamed from: T, reason: collision with root package name */
    protected View f9858T;

    /* renamed from: U, reason: collision with root package name */
    com.anythink.basead.ui.f.a f9859U;

    /* renamed from: V, reason: collision with root package name */
    protected com.anythink.basead.ui.component.b f9860V;

    /* renamed from: W, reason: collision with root package name */
    protected i f9861W;

    /* renamed from: a, reason: collision with root package name */
    protected int f9862a;
    protected boolean aa;
    protected boolean ab;
    Runnable ac;
    protected int ad;
    protected int ae;
    protected int af;
    protected int ag;
    private long ah;
    private long ai;
    private long aj;
    private long ak;
    private long al;
    private long am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private e ar;
    private CountDownView as;
    private ValueAnimator at;
    private WebProgressBarView au;

    /* renamed from: b, reason: collision with root package name */
    protected int f9863b;

    /* renamed from: c, reason: collision with root package name */
    protected int f9864c;

    /* renamed from: d, reason: collision with root package name */
    protected int f9865d;

    /* renamed from: com.anythink.basead.ui.BaseScreenATView$12, reason: invalid class name */
    public class AnonymousClass12 implements a {
        public AnonymousClass12() {
        }

        @Override // com.anythink.basead.ui.BaseScreenATView.a
        public final void a(List<Bitmap> list) {
            com.anythink.basead.ui.component.a aVar;
            if (BaseScreenATView.this.f9845F == 5 && (list == null || list.size() == 0)) {
                BaseScreenATView.this.f9845F = 1;
            }
            if (BaseScreenATView.this.f9845F == 2 && !g.a().b(b.d.i)) {
                BaseScreenATView.this.f9845F = 1;
            }
            BaseScreenATView.this.a(list);
            if (!BaseScreenATView.this.an || (aVar = BaseScreenATView.this.f9746r) == null || aVar.j()) {
                return;
            }
            BaseScreenATView.this.B();
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseScreenATView$15, reason: invalid class name */
    public class AnonymousClass15 implements BaseEndCardView.a {
        public AnonymousClass15() {
        }

        @Override // com.anythink.basead.ui.BaseEndCardView.a
        public final void a() {
        }

        @Override // com.anythink.basead.ui.BaseEndCardView.a
        public final void a(int i) {
            String str = BaseScreenATView.TAG;
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            baseScreenATView.a(1, baseScreenATView.f9744p ? 7 : 3);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseScreenATView$7, reason: invalid class name */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f9879a;

        public AnonymousClass7(a aVar) {
            this.f9879a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.d.b g4 = y.g(d.a(BaseScreenATView.this.getContext()));
            List<String> arrayList = new ArrayList<>();
            final ArrayList arrayList2 = new ArrayList();
            int i = BaseScreenATView.this.f9845F;
            int i6 = 0;
            if (i == 2) {
                arrayList = g4.o();
            } else if (i == 3) {
                arrayList = g4.q();
            } else if (i == 5) {
                arrayList = g4.p();
                boolean z3 = arrayList.size() >= 4;
                if (z3) {
                    for (int i9 = 0; i9 < 4; i9++) {
                        String str = arrayList.get(i9);
                        if (TextUtils.isEmpty(str) || !com.anythink.basead.b.c.d.b(str, 3)) {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (!z3) {
                    arrayList.clear();
                }
            }
            if (arrayList.size() == 0) {
                t.b().b(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.7.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar = AnonymousClass7.this.f9879a;
                        if (aVar != null) {
                            aVar.a(arrayList2);
                        }
                    }
                });
                return;
            }
            if (arrayList.size() > 0) {
                try {
                    i6 = Math.min(BaseScreenATView.this.getResources().getDisplayMetrics().widthPixels, BaseScreenATView.this.getResources().getDisplayMetrics().heightPixels) / 2;
                } catch (Throwable unused) {
                }
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    Bitmap b9 = com.anythink.core.common.res.b.a(BaseScreenATView.this.getContext()).b(new com.anythink.core.common.res.e(3, it.next()), i6, i6);
                    if (b9 != null) {
                        arrayList2.add(b9);
                    }
                }
                if (arrayList2.size() != arrayList.size()) {
                    arrayList2.clear();
                }
            }
            t.b().b(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.7.2
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = AnonymousClass7.this.f9879a;
                    if (aVar != null) {
                        aVar.a(arrayList2);
                    }
                }
            });
        }
    }

    public interface a {
        void a(List<Bitmap> list);
    }

    public BaseScreenATView(Context context) {
        super(context);
        this.f9845F = 100;
        this.an = false;
        this.ac = new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.10
            @Override // java.lang.Runnable
            public final void run() {
                BaseScreenATView.this.j();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void af() {
        long aF;
        this.ah = this.f9735f.f14168o.H() > 0 ? this.f9735f.f14168o.H() * 1000 : this.f9735f.f14168o.H();
        long I8 = this.f9735f.f14168o.I() > 0 ? this.f9735f.f14168o.I() * 1000 : this.f9735f.f14168o.I();
        this.ai = I8;
        if (I8 > 0) {
            long j6 = this.ah;
            if (j6 >= 0) {
                this.aj = j6 + I8;
                this.ak = this.f9735f.f14168o.aE();
                aF = this.f9735f.f14168o.aF();
                this.al = aF;
                if (aF > 0) {
                    this.am = this.ak + aF;
                }
                this.f9842C = this.f9735f.f14168o.L() * 1000;
                this.f9849K = this.f9735f.f14168o.K() != 0;
                if (1 != this.f9862a) {
                    if (this.f9736g.L()) {
                        this.f9845F = 100;
                    } else if (this.f9735f.f14168o.ap() == 1) {
                        this.f9845F = 101;
                    } else if (this.f9735f.f14168o.aq() > 0) {
                        this.f9845F = this.f9735f.f14168o.aq();
                    }
                    this.f9847H = this.f9735f.f14168o.o();
                    return;
                }
                return;
            }
        }
        this.aj = I8;
        this.ak = this.f9735f.f14168o.aE();
        aF = this.f9735f.f14168o.aF();
        this.al = aF;
        if (aF > 0) {
        }
        this.f9842C = this.f9735f.f14168o.L() * 1000;
        this.f9849K = this.f9735f.f14168o.K() != 0;
        if (1 != this.f9862a) {
        }
    }

    private void ag() {
        if (o() && !com.anythink.basead.b.c.d.a(this.f9735f, this.f9736g) && this.f9853O == null) {
            this.f9853O = b(true);
        }
    }

    private void ah() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        this.f9864c = i;
        int i6 = displayMetrics.heightPixels;
        this.f9865d = i6;
        this.ad = i;
        this.ae = i6;
    }

    private void ai() {
        if (this.f9845F == 100) {
            a((List<Bitmap>) null);
        } else {
            com.anythink.core.common.v.b.b.a().b(new AnonymousClass7(new AnonymousClass12()), 2);
        }
    }

    private void aj() {
        if (this.f9853O == null) {
            this.f9853O = b(false);
        }
        U();
        V();
    }

    private void ak() {
        this.f9844E = y();
        EndCardView endCardView = new EndCardView(getContext(), this.f9736g, this.f9735f);
        endCardView.setSize(this.f9864c, this.f9865d);
        endCardView.init(false, false, new AnonymousClass15());
        this.f9853O = endCardView;
        U();
        endCardView.load();
        if (b(this.f9844E)) {
            Q();
            PanelView aa = aa();
            if (aa != null && aa.getVisibility() == 0) {
                if (aa.getCTAButton() == null || aa.getCTAButton().getVisibility() != 0) {
                    this.f9743o = aa;
                } else {
                    this.f9743o = aa.getCTAButton();
                }
            }
        }
        V();
    }

    private void al() {
        if (this.f9854P == null) {
            this.f9854P = new c(this.f9851M);
        }
        this.f9854P.b();
    }

    private void am() {
        c cVar = this.f9854P;
        if (cVar != null) {
            cVar.c();
        }
    }

    private void an() {
        i iVar = this.f9861W;
        if (iVar != null) {
            iVar.a();
        }
    }

    private void ao() {
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar != null) {
            aVar.e();
        }
    }

    private void ap() {
        e(4);
    }

    private void aq() {
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar == null || !aVar.a()) {
            return;
        }
        if (!p() || this.f9744p) {
            ab();
        }
    }

    private void ar() {
        View view = this.f9858T;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.f9858T.setVisibility(8);
    }

    public final void A() {
        this.an = true;
        try {
            e eVar = this.ar;
            if (eVar == null || !eVar.a()) {
                a(110);
                B();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void B() {
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void C() {
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar != null) {
            aVar.a(true);
        }
    }

    public final void D() {
        a(111);
        this.an = false;
        ao();
    }

    public final void E() {
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar != null) {
            aVar.b(false);
        }
    }

    public void F() {
        destroy();
        t.b().d(this.ac);
        ValueAnimator valueAnimator = this.at;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void G() {
        String B9 = this.f9736g.B();
        if (TextUtils.isEmpty(B9)) {
            return;
        }
        if (this.f9736g.ab() > 0 || this.f9736g.ac() > 0) {
            this.af = this.f9736g.ab();
            int ac = this.f9736g.ac();
            this.ag = ac;
            this.ad = this.af;
            this.ae = ac;
            return;
        }
        f.a();
        int[] a9 = h.a(f.a(1, B9));
        if (a9 != null) {
            int i = a9[0];
            this.af = i;
            int i6 = a9[1];
            this.ag = i6;
            this.ad = i;
            this.ae = i6;
        }
    }

    public void H() {
        PanelView panelView = this.f9852N;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.f9852N.init(this.f9736g, this.f9735f, this.f9863b, n(), new PanelView.a() { // from class: com.anythink.basead.ui.BaseScreenATView.3
                @Override // com.anythink.basead.ui.PanelView.a
                public final void a(int i, int i6) {
                    BaseScreenATView.this.a(i, i6);
                }

                @Override // com.anythink.basead.ui.PanelView.a
                public final boolean a() {
                    if (!BaseScreenATView.this.J()) {
                        return false;
                    }
                    BaseScreenATView.this.a(4, 5);
                    return true;
                }
            });
        }
    }

    public void I() {
    }

    public final boolean J() {
        if (!com.anythink.basead.ui.f.b.a(this.f9751w, this.f9735f)) {
            return false;
        }
        e eVar = this.ar;
        return (eVar == null || !eVar.a()) && this.an && !this.aa;
    }

    public void K() {
        MuteImageView muteImageView = this.f9857S;
        if (muteImageView == null) {
            return;
        }
        if (this.f9849K) {
            muteImageView.setMute(true);
        } else {
            muteImageView.setMute(false);
        }
        d(4);
        this.f9857S.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseScreenATView.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                com.anythink.basead.ui.component.a aVar = baseScreenATView.f9746r;
                if (aVar == null || baseScreenATView.f9857S == null) {
                    return;
                }
                if (aVar.f()) {
                    BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
                    baseScreenATView2.f9849K = false;
                    baseScreenATView2.f9857S.setMute(false);
                    BaseScreenATView.this.f9746r.c(false);
                    return;
                }
                BaseScreenATView baseScreenATView3 = BaseScreenATView.this;
                baseScreenATView3.f9849K = true;
                baseScreenATView3.f9857S.setMute(true);
                BaseScreenATView.this.f9746r.c(true);
            }
        });
    }

    public void L() {
        if (X() != null) {
            this.f9850L = a((b) X(), false);
            X().setVisibility(8);
            X().setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseScreenATView.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseScreenATView.this.M();
                }
            });
        }
    }

    public abstract void M();

    public final void N() {
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void O() {
        if (Z() != null) {
            Z().setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseScreenATView.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseScreenATView.this.z();
                }
            });
        }
    }

    public void P() {
        e(0);
        d(0);
    }

    public void Q() {
        PanelView aa = aa();
        if (aa != null) {
            if (aa.getVisibility() != 0) {
                a(104);
                aa.setVisibility(0);
            }
            if (aa.getCTAButton() == null || aa.getCTAButton().getVisibility() != 0) {
                return;
            }
            View view = this.f9745q;
            if (view == null || !view.equals(aa.getCTAButton())) {
                if (this.f9745q != null && (aa.getCTAButton() instanceof CTAButtonLayout)) {
                    View view2 = this.f9745q;
                    if (view2 instanceof CTAButtonLayout) {
                        String majorCTAText = ((CTAButtonLayout) view2).getMajorCTAText();
                        if (!TextUtils.isEmpty(majorCTAText)) {
                            ((CTAButtonLayout) aa.getCTAButton()).setMajorCTAText(majorCTAText);
                        }
                    }
                }
                this.f9745q = aa.getCTAButton();
            }
        }
    }

    public void R() {
        if (aa() == null || aa().getVisibility() == 8) {
            return;
        }
        aa().setVisibility(8);
    }

    public final void S() {
        if (Z() == null || Z().getVisibility() == 0) {
            return;
        }
        Z().setVisibility(0);
    }

    public void T() {
        com.anythink.core.common.h.y yVar;
        S();
        this.ap = true;
        View view = this.f9745q;
        if (view != null && (view instanceof CTAButtonLayout) && ((CTAButtonLayout) view).needInterceptCloseViewShow()) {
            ((CTAButtonLayout) this.f9745q).activateSubCloseButton();
            boolean z3 = this.f9848I;
            if (!z3) {
                return;
            }
            if (z3 && aa() != null && aa().getVisibility() == 0) {
                return;
            }
        }
        if (X() == null || X().getVisibility() == 0) {
            return;
        }
        X().setVisibility(0);
        x xVar = this.f9735f;
        com.anythink.basead.ui.f.b.a(X(), this.f9850L, this.f9740l ? 1.0d : (xVar == null || (yVar = xVar.f14168o) == null) ? 1.0d : yVar.bz());
    }

    public abstract void U();

    public void V() {
        com.anythink.core.common.h.y yVar;
        a(103);
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar != null && aVar.a() && (!p() || this.f9744p)) {
            ab();
        }
        e(8);
        if (X() != null) {
            x xVar = this.f9735f;
            com.anythink.basead.ui.f.b.a(X(), this.f9850L, this.f9740l ? 1.0d : (xVar == null || (yVar = xVar.f14168o) == null) ? 1.0d : yVar.bz());
        }
        d(8);
        ar();
    }

    public final void W() {
        com.anythink.basead.ui.component.b bVar = this.f9860V;
        if (bVar != null) {
            bVar.a();
        }
    }

    public CloseImageView X() {
        return this.f9855Q;
    }

    public final boolean Y() {
        com.anythink.basead.ui.component.a aVar;
        return this.f9862a == 1 && this.f9845F == 101 && (aVar = this.f9746r) != null && aVar.g();
    }

    public ViewGroup Z() {
        return this.f9856R;
    }

    public PanelView aa() {
        return this.f9852N;
    }

    public void ab() {
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void ac() {
        View view = this.f9858T;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        ValueAnimator valueAnimator = this.at;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.2f, 1.0f);
        this.at = ofFloat;
        ofFloat.setDuration(500L);
        this.at.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.BaseScreenATView.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                View view2 = BaseScreenATView.this.f9858T;
                if (view2 != null) {
                    view2.setAlpha(floatValue);
                }
            }
        });
        this.at.start();
        this.f9858T.setAlpha(0.2f);
        this.f9858T.setVisibility(0);
    }

    public void ad() {
        i iVar;
        if (1 == this.f9862a) {
            T();
            if (this.J) {
                return;
            }
            this.J = true;
            if (this.f9739k || (iVar = this.f9861W) == null) {
                return;
            }
            iVar.c();
        }
    }

    public final void ae() {
        j();
    }

    public void b() {
        this.f9851M = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_rl_root", "id"));
        this.f9855Q = (CloseImageView) findViewById(q.a(getContext(), "myoffer_btn_close_id", "id"));
        this.f9852N = (PanelView) findViewById(q.a(getContext(), "myoffer_banner_view_id", "id"));
        this.as = (CountDownView) findViewById(q.a(getContext(), "myoffer_count_down_view_id", "id"));
        this.f9857S = (MuteImageView) findViewById(q.a(getContext(), "myoffer_btn_mute_id", "id"));
        this.f9856R = (ViewGroup) findViewById(q.a(getContext(), "myoffer_feedback_ll_id", "id"));
        com.anythink.basead.ui.component.a aVar = new com.anythink.basead.ui.component.a(this, this.f9735f, this.f9736g, this.f9863b);
        this.f9746r = aVar;
        aVar.a(r());
        com.anythink.basead.ui.improveclick.a aVar2 = this.f9747s;
        if (aVar2 != null) {
            this.f9746r.a(aVar2);
            HashMap hashMap = new HashMap();
            hashMap.put(g.a.f11170e, Integer.valueOf(this.ad > this.ae ? 2 : 1));
            this.f9747s.a(hashMap);
        }
        this.f9746r.a(new a.InterfaceC0056a() { // from class: com.anythink.basead.ui.BaseScreenATView.1
            @Override // com.anythink.basead.ui.component.a.InterfaceC0056a
            public final j a() {
                return BaseScreenATView.this.l();
            }

            @Override // com.anythink.basead.ui.component.a.InterfaceC0056a
            public final com.anythink.basead.d.a b() {
                return BaseScreenATView.this.m();
            }
        });
        WebProgressBarView webProgressBarView = (WebProgressBarView) findViewById(q.a(getContext(), "myoffer_player_view_progress_bar_id", "id"));
        this.au = webProgressBarView;
        this.f9860V = new com.anythink.basead.ui.component.b(this.f9735f.f14168o, this.as, webProgressBarView);
        c();
        e(4);
        K();
        L();
        O();
        H();
        I();
        this.f9843D = b(this.f9844E);
    }

    public abstract boolean b(int i);

    public void d() {
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        this.f9861W = null;
        BaseEndCardView baseEndCardView = this.f9853O;
        if (baseEndCardView != null) {
            baseEndCardView.a();
        }
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar != null) {
            aVar.p();
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void f() {
        int i;
        if (this.f9861W != null) {
            int i6 = this.f9845F;
            if (i6 != 1) {
                i = 3;
                if (i6 != 2) {
                    if (i6 != 3) {
                        i = 5;
                        if (i6 != 4) {
                            i = i6 != 5 ? i6 != 101 ? 1 : 7 : 6;
                        }
                    } else {
                        i = 4;
                    }
                }
            } else {
                i = this.f9735f.f14168o.aq() == 1 ? 2 : 8;
            }
            com.anythink.basead.g.j jVar = new com.anythink.basead.g.j();
            jVar.f8984c = i;
            if ((this instanceof LetterFullScreenATView) || (this instanceof LetterHalfScreenATView)) {
                jVar.f8985d = 1;
            } else {
                jVar.f8985d = 2;
            }
            if (this instanceof FullScreenATView) {
                jVar.f8987f = false;
            } else {
                jVar.f8987f = true;
            }
            jVar.f8988g = this.f9735f.f14168o.bl();
            this.f9861W.a(jVar);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void g() {
        this.ao = true;
        if (this.f9854P == null) {
            this.f9854P = new c(this.f9851M);
        }
        this.f9854P.b();
    }

    public float getCloseButtonScaleFactor() {
        return this.f9850L;
    }

    public long getHideBannerTime() {
        return this.aj;
    }

    public int getPlayerViewType() {
        return this.f9845F;
    }

    public long getShowBannerTime() {
        return this.ah;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void h() {
        x xVar;
        com.anythink.core.common.h.y yVar;
        this.ao = false;
        t.b().b(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.2
            @Override // java.lang.Runnable
            public final void run() {
                BaseScreenATView.d(BaseScreenATView.this);
            }
        });
        if (this.aq && this.f9862a == 3 && (xVar = this.f9735f) != null && (yVar = xVar.f14168o) != null && yVar.aG()) {
            com.anythink.basead.ui.component.a aVar = this.f9746r;
            if (aVar != null) {
                aVar.c();
            }
            c(6);
        }
    }

    public void handleFullScreenClick() {
    }

    public boolean hasReward() {
        return this.J;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void i() {
        super.i();
        com.anythink.basead.ui.improveclick.a aVar = this.f9747s;
        if (aVar != null) {
            aVar.a(new d.a() { // from class: com.anythink.basead.ui.BaseScreenATView.9
                @Override // com.anythink.basead.ui.improveclick.d.a
                public final View a() {
                    return BaseScreenATView.this.X();
                }

                @Override // com.anythink.basead.ui.improveclick.d.a
                public final void b() {
                    BaseScreenATView.this.M();
                }

                @Override // com.anythink.basead.ui.improveclick.d.a
                public final View c() {
                    View view = BaseScreenATView.this.f9745q;
                    if (view == null || !(view instanceof CTAButtonLayout)) {
                        return null;
                    }
                    return ((CTAButtonLayout) view).getSubCloseView();
                }

                @Override // com.anythink.basead.ui.improveclick.d.a
                public final void d() {
                    Context context = BaseScreenATView.this.getContext();
                    if (!(context instanceof Activity) || context.getResources().getConfiguration().orientation == 1) {
                        return;
                    }
                    ((Activity) context).setRequestedOrientation(1);
                    BaseScreenATView baseScreenATView = BaseScreenATView.this;
                    int i = baseScreenATView.f9864c;
                    int i6 = baseScreenATView.f9865d;
                    if (i > i6) {
                        int i9 = i + i6;
                        baseScreenATView.f9864c = i9;
                        int i10 = i9 - i6;
                        baseScreenATView.f9865d = i10;
                        baseScreenATView.f9864c = i9 - i10;
                    }
                }

                @Override // com.anythink.basead.ui.improveclick.d.a
                public final void a(boolean z3) {
                    BaseScreenATView baseScreenATView = BaseScreenATView.this;
                    baseScreenATView.aa = z3;
                    if (z3) {
                        baseScreenATView.a(119);
                    }
                }
            });
        }
        com.anythink.basead.ui.component.a aVar2 = this.f9746r;
        if (aVar2 != null) {
            aVar2.a(this.f9747s);
        }
    }

    public void init() {
        b();
        if (this.f9848I) {
            x();
            return;
        }
        int i = this.f9862a;
        if (1 == i) {
            if (this.f9845F == 100) {
                a((List<Bitmap>) null);
            } else {
                com.anythink.core.common.v.b.b.a().b(new AnonymousClass7(new AnonymousClass12()), 2);
            }
            ag();
            return;
        }
        if (3 == i) {
            if (com.anythink.basead.b.e.a(this.f9736g, this.f9735f)) {
                w();
                ag();
            } else {
                x();
                if (o()) {
                    return;
                }
                j();
            }
        }
    }

    public boolean isShowEndCard() {
        return this.f9848I;
    }

    public boolean isVideoMute() {
        return this.f9849K;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final j l() {
        j jVar = new j(this.f9735f, this.f9741m);
        jVar.f6212g = getWidth();
        jVar.f6213h = getHeight();
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar != null) {
            jVar.f6214j = aVar.d(true);
        }
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            jVar.f6218n = iArr[0];
            jVar.f6219o = iArr[1];
        } catch (Throwable unused) {
        }
        jVar.f6220p = 100;
        com.anythink.basead.ui.component.a aVar2 = this.f9746r;
        if (aVar2 != null) {
            jVar.f6214j = aVar2.d(true);
        }
        jVar.f6221q = this.f9750v;
        return jVar;
    }

    public void onActivityResult(int i, int i6, Intent intent) {
        com.anythink.basead.ui.component.a aVar;
        if (!Y() || (aVar = this.f9746r) == null) {
            return;
        }
        aVar.a(i, i6, intent);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final boolean p() {
        return com.anythink.basead.b.e.a(this.f9736g, this.f9735f);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public RelativeLayout.LayoutParams q() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f9863b == 2) {
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, 0, q.a(getContext(), 154.0f));
            return layoutParams;
        }
        int measuredHeight = (getMeasuredHeight() * 2) / 3;
        layoutParams.addRule(11);
        layoutParams.setMargins(0, measuredHeight, 0, 0);
        return layoutParams;
    }

    public void setCloseButtonScaleFactor(float f3) {
        this.f9850L = f3;
        if (X() != null) {
            X().setClickAreaScaleFactor(this.f9850L);
        }
    }

    public void setHasReward(boolean z3) {
        this.J = z3;
    }

    public void setHideBannerTime(long j6) {
        this.aj = j6;
    }

    public void setIsShowEndCard(boolean z3) {
        this.f9848I = z3;
    }

    public void setListener(i iVar) {
        this.f9861W = iVar;
    }

    public void setShowBannerTime(long j6) {
        this.ah = j6;
    }

    public void setVideoMute(boolean z3) {
        this.f9849K = z3;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void u() {
        super.u();
        a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6179k, com.anythink.basead.d.g.ag));
        if (p()) {
            if (this.f9747s != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(g.a.i, com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6179k, com.anythink.basead.d.g.ag).c());
                this.f9747s.a(hashMap);
            }
            a(108);
            this.f9744p = true;
            if (!this.f9848I) {
                x();
            }
            ao();
            ab();
        }
    }

    public void w() {
        a(new ArrayList());
    }

    public void x() {
        a(102);
        this.f9848I = true;
        if (o()) {
            if (this.f9853O == null) {
                this.f9853O = b(false);
            }
            U();
        } else {
            this.f9844E = y();
            EndCardView endCardView = new EndCardView(getContext(), this.f9736g, this.f9735f);
            endCardView.setSize(this.f9864c, this.f9865d);
            endCardView.init(false, false, new AnonymousClass15());
            this.f9853O = endCardView;
            U();
            endCardView.load();
            if (b(this.f9844E)) {
                Q();
                PanelView aa = aa();
                if (aa != null && aa.getVisibility() == 0) {
                    if (aa.getCTAButton() == null || aa.getCTAButton().getVisibility() != 0) {
                        this.f9743o = aa;
                    } else {
                        this.f9743o = aa.getCTAButton();
                    }
                }
            }
        }
        V();
        BaseEndCardView baseEndCardView = this.f9853O;
        if (baseEndCardView != null) {
            baseEndCardView.postDelayed(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.13
                @Override // java.lang.Runnable
                public final void run() {
                    BaseScreenATView.this.T();
                }
            }, a(this.f9735f.f14168o));
        }
        com.anythink.basead.b.b.a(6, this.f9736g, l());
    }

    public abstract int y();

    public final void z() {
        D();
        if (this.ar == null) {
            this.ar = new e();
        }
        this.ar.a(getContext(), this.f9736g, this.f9735f, new e.a() { // from class: com.anythink.basead.ui.BaseScreenATView.16
            @Override // com.anythink.basead.e.a
            public final void a() {
            }

            @Override // com.anythink.basead.e.a
            public final void b() {
                BaseScreenATView.this.a(122);
                BaseScreenATView.this.A();
            }
        });
    }

    private void d(long j6) {
        if (this.f9843D && this.ah == -1) {
            long j9 = this.ai;
            if (j9 != 0) {
                this.ah = j6;
                if (j9 > 0) {
                    this.aj = j6 + j9;
                }
                Q();
            }
        }
    }

    public void a(List<Bitmap> list) {
        d();
        a(0L);
        if (this.f9842C == 0) {
            T();
        }
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar == null) {
            return;
        }
        aVar.a(new BasePlayerView.a() { // from class: com.anythink.basead.ui.BaseScreenATView.11
            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void a(int i) {
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void b() {
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void c() {
                BaseScreenATView baseScreenATView;
                com.anythink.basead.ui.f.c cVar;
                i iVar = BaseScreenATView.this.f9861W;
                if (iVar != null) {
                    iVar.b();
                }
                if (BaseScreenATView.this.r() != 100) {
                    BaseScreenATView.this.ad();
                }
                if (BaseScreenATView.this.f9735f.f14168o.T() != 1) {
                    if (BaseScreenATView.this.X() != null && (cVar = (baseScreenATView = BaseScreenATView.this).f9749u) != null) {
                        cVar.a(baseScreenATView.X());
                    }
                    BaseScreenATView.this.c(2);
                    return;
                }
                BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
                baseScreenATView2.f9744p = true;
                if (baseScreenATView2.f9848I) {
                    baseScreenATView2.ab();
                } else {
                    baseScreenATView2.x();
                }
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void d() {
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void e() {
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void f() {
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void a() {
                if (BaseScreenATView.this.f9747s != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("video_length", Long.valueOf(BaseScreenATView.this.f9746r.h()));
                    BaseScreenATView.this.f9747s.a(hashMap);
                }
                BaseScreenATView.this.P();
                BaseScreenATView.this.j();
                BaseScreenATView.b(BaseScreenATView.this);
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void b(int i) {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                com.anythink.basead.ui.component.a aVar2 = baseScreenATView.f9746r;
                if (aVar2 != null) {
                    BaseScreenATView.a(baseScreenATView, aVar2.i());
                }
                com.anythink.core.common.h.y yVar = BaseScreenATView.this.f9735f.f14168o;
                if ((yVar == null || yVar.G() != 1) && !BaseScreenATView.this.Y()) {
                    return;
                }
                BaseScreenATView.this.a(i, 3);
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void b(long j6) {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                baseScreenATView.f9846G = j6;
                i iVar = baseScreenATView.f9861W;
                if (iVar != null) {
                    iVar.g();
                }
                BaseScreenATView.this.c(j6);
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void a(long j6) {
                if (BaseScreenATView.this.f9739k) {
                    return;
                }
                BaseScreenATView.this.a(j6);
                BaseScreenATView.this.b(j6);
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                if (!baseScreenATView.ab) {
                    baseScreenATView.e(0);
                    BaseScreenATView.this.d(0);
                    BaseScreenATView.this.ab = true;
                }
                BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
                int i = baseScreenATView2.f9842C;
                if (i >= 0 && j6 >= i) {
                    baseScreenATView2.T();
                }
                if (BaseScreenATView.this.r() != 100) {
                    BaseScreenATView baseScreenATView3 = BaseScreenATView.this;
                    if (j6 >= baseScreenATView3.f9847H) {
                        baseScreenATView3.ad();
                    }
                }
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void a(com.anythink.basead.d.f fVar) {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                baseScreenATView.f9744p = true;
                i iVar = baseScreenATView.f9861W;
                if (iVar != null) {
                    iVar.h();
                }
                BaseScreenATView.this.a(fVar);
                if (BaseScreenATView.this.r() != 100 && BaseScreenATView.this.f9735f.f14168o.p() == 1) {
                    BaseScreenATView.this.ad();
                }
                BaseScreenATView.this.W();
                BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
                if (!baseScreenATView2.f9848I) {
                    baseScreenATView2.x();
                } else {
                    baseScreenATView2.ab();
                }
            }
        });
        this.f9861W.f();
        if (t()) {
            this.f9746r.a(this.f9849K, list, this.f9754z);
        }
        if (this.f9845F == 1) {
            x();
        } else {
            this.f9746r.c(0);
        }
    }

    public void c() {
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f9736g, this.f9735f);
        this.f9859U = aVar;
        aVar.b(this);
    }

    public void e(int i) {
        com.anythink.basead.ui.component.b bVar = this.f9860V;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    public void c(int i) {
        j l9 = l();
        l9.i = m();
        com.anythink.basead.b.b.a(7, this.f9736g, l9);
        if (this.f9861W != null) {
            com.anythink.core.common.u.e.a(this.f9736g, this.f9735f, this.f9753y, this.f9752x);
            this.f9861W.a(i);
            this.f9861W.d();
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void e() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        this.f9864c = i;
        int i6 = displayMetrics.heightPixels;
        this.f9865d = i6;
        this.ad = i;
        this.ae = i6;
        G();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseScreenATView(Context context, x xVar, w wVar, String str, int i, int i6) {
        super(context, xVar, wVar, str);
        long aF;
        this.f9845F = 100;
        this.an = false;
        this.ac = new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.10
            @Override // java.lang.Runnable
            public final void run() {
                BaseScreenATView.this.j();
            }
        };
        this.f9862a = i;
        this.f9863b = i6;
        this.aa = false;
        this.ap = false;
        this.ab = false;
        this.ah = this.f9735f.f14168o.H() > 0 ? this.f9735f.f14168o.H() * 1000 : this.f9735f.f14168o.H();
        long I8 = this.f9735f.f14168o.I() > 0 ? this.f9735f.f14168o.I() * 1000 : this.f9735f.f14168o.I();
        this.ai = I8;
        if (I8 > 0) {
            long j6 = this.ah;
            if (j6 >= 0) {
                this.aj = j6 + I8;
                this.ak = this.f9735f.f14168o.aE();
                aF = this.f9735f.f14168o.aF();
                this.al = aF;
                if (aF > 0) {
                    this.am = this.ak + aF;
                }
                this.f9842C = this.f9735f.f14168o.L() * 1000;
                this.f9849K = this.f9735f.f14168o.K() == 0;
                if (1 != this.f9862a) {
                    if (this.f9736g.L()) {
                        this.f9845F = 100;
                    } else if (this.f9735f.f14168o.ap() == 1) {
                        this.f9845F = 101;
                    } else if (this.f9735f.f14168o.aq() > 0) {
                        this.f9845F = this.f9735f.f14168o.aq();
                    }
                    this.f9847H = this.f9735f.f14168o.o();
                    return;
                }
                return;
            }
        }
        this.aj = I8;
        this.ak = this.f9735f.f14168o.aE();
        aF = this.f9735f.f14168o.aF();
        this.al = aF;
        if (aF > 0) {
        }
        this.f9842C = this.f9735f.f14168o.L() * 1000;
        this.f9849K = this.f9735f.f14168o.K() == 0;
        if (1 != this.f9862a) {
        }
    }

    public final void d(int i) {
        MuteImageView muteImageView = this.f9857S;
        if (muteImageView == null || muteImageView.getVisibility() == i) {
            return;
        }
        this.f9857S.setVisibility(i);
    }

    public static /* synthetic */ void d(BaseScreenATView baseScreenATView) {
        c cVar = baseScreenATView.f9854P;
        if (cVar != null) {
            cVar.c();
        }
    }

    public void c(long j6) {
        com.anythink.basead.ui.component.b bVar = this.f9860V;
        if (bVar != null) {
            bVar.a(j6);
        }
    }

    private int a(com.anythink.core.common.h.y yVar) {
        int N8;
        if (this.ap || yVar == null || (N8 = (int) (yVar.N() / 100.0f)) == 0) {
            return 0;
        }
        Random random = new Random();
        if (random.nextInt(100) > N8) {
            return 0;
        }
        int O8 = yVar.O();
        int P8 = yVar.P();
        if (P8 <= 0) {
            return 0;
        }
        if (O8 == P8) {
            return O8;
        }
        try {
            return random.nextInt(P8 - O8) + O8;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(int i, int i6) {
        this.f9850L = a((b) X(), true);
        if (this.ao || this.f9736g == null) {
            return;
        }
        if (i == -100) {
            M();
        } else {
            super.a(i, i6);
        }
    }

    private BaseEndCardView b(boolean z3) {
        MraidEndCardView mraidEndCardView = new MraidEndCardView(getContext(), this.f9736g, this.f9735f, this.f9754z);
        mraidEndCardView.setEndCardListener(new MraidEndCardView.a() { // from class: com.anythink.basead.ui.BaseScreenATView.14
            @Override // com.anythink.basead.ui.MraidEndCardView.a
            public final void a(String str) {
                String str2 = BaseScreenATView.TAG;
                BaseScreenATView.this.f9736g.w(str);
                BaseScreenATView.this.a(1, 13);
            }

            @Override // com.anythink.basead.ui.MraidEndCardView.a
            public final void b() {
            }

            @Override // com.anythink.basead.ui.MraidEndCardView.a
            public final void c() {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                if (3 == baseScreenATView.f9862a) {
                    if (baseScreenATView.f9736g.J() == 1 && BaseScreenATView.this.f9736g.L()) {
                        return;
                    }
                    BaseScreenATView.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6179k, com.anythink.basead.d.g.f6166V));
                    BaseScreenATView.this.c(5);
                }
            }

            @Override // com.anythink.basead.ui.MraidEndCardView.a
            public final void a() {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                if (3 != baseScreenATView.f9862a || com.anythink.basead.b.e.a(baseScreenATView.f9736g, baseScreenATView.f9735f)) {
                    return;
                }
                BaseScreenATView.this.ae();
            }
        });
        a(this.f9851M);
        mraidEndCardView.init(z3);
        return mraidEndCardView;
    }

    public final void a(com.anythink.basead.d.f fVar) {
        i iVar = this.f9861W;
        if (iVar != null) {
            iVar.a(fVar);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(com.anythink.basead.g.j jVar) {
        this.aq = true;
        i iVar = this.f9861W;
        if (iVar != null) {
            iVar.b(jVar);
        }
    }

    public void b(long j6) {
        com.anythink.basead.ui.component.b bVar = this.f9860V;
        if (bVar != null) {
            bVar.b(j6);
        }
    }

    public static /* synthetic */ void b(BaseScreenATView baseScreenATView) {
        i iVar = baseScreenATView.f9861W;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(boolean z3) {
        i iVar = this.f9861W;
        if (iVar != null) {
            iVar.a(z3);
        }
    }

    public void a(long j6) {
        long j9 = this.aj;
        if (j9 >= 0 && j6 > j9) {
            R();
        } else if (this.f9843D) {
            long j10 = this.ah;
            if (j10 >= 0 && j6 >= j10) {
                Q();
            }
        }
        if (j6 > this.am) {
            ar();
        } else if (j6 >= this.ak) {
            ac();
        }
    }

    private void a(a aVar) {
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass7(aVar), 2);
    }

    public static /* synthetic */ void a(BaseScreenATView baseScreenATView, long j6) {
        if (baseScreenATView.f9843D && baseScreenATView.ah == -1) {
            long j9 = baseScreenATView.ai;
            if (j9 != 0) {
                baseScreenATView.ah = j6;
                if (j9 > 0) {
                    baseScreenATView.aj = j6 + j9;
                }
                baseScreenATView.Q();
            }
        }
    }
}
