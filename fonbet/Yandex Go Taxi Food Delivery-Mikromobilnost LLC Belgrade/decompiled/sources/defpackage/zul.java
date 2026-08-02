package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.div.core.view2.Div2View;
import core.divkit.view.DivViewLayout;
import core.flex.ui.contentaware.ContentAwareFrameLayout;
import flex.feature.divkit.scaffold.DivKitScaffoldPadding;
import flex.feature.divkit.scaffold.ScaffoldAnimations;
import flex.section.divkit.DivkitSnippet;

/* loaded from: classes9.dex */
public final class zul extends pjm0 {
    public final l3k A;
    public aq0 B;
    public g0d C;
    public g0d D;
    public g0d E;
    public nfh F;
    public nfh G;
    public nfh H;
    public final w0j a;
    public final b3k b;
    public final exy0 c;
    public final n530 w;
    public final pi2 x;
    public final vol y;
    public final ovl z;

    public zul(w0j w0jVar, b3k b3kVar, exy0 exy0Var, cyl cylVar, n530 n530Var, pi2 pi2Var, vol volVar, int i) {
        volVar = (i & 128) != 0 ? vol.a : volVar;
        a851 a851Var = new a851(new s7s0(23));
        this.a = w0jVar;
        this.b = b3kVar;
        this.c = exy0Var;
        this.w = n530Var;
        this.x = pi2Var;
        this.y = volVar;
        new pvl();
        this.z = new ovl();
        this.A = new l3k(cylVar, a851Var);
    }

    @Override // defpackage.pjm0
    public final ViewGroup a(View view) {
        ContentAwareFrameLayout contentAwareFrameLayout = (ContentAwareFrameLayout) d().e;
        if (contentAwareFrameLayout != null) {
            return contentAwareFrameLayout;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final void b(DivViewLayout divViewLayout, mds0 mds0Var, mw5 mw5Var) {
        if (mds0Var == null) {
            return;
        }
        dee a = this.y.a(divViewLayout);
        a.c = mw5Var;
        xvl xvlVar = mds0Var.a;
        a.b(xvlVar.b.a, xvlVar.c, new d8(18, mds0Var));
    }

    public final ContentAwareFrameLayout c() {
        aq0 aq0Var = this.B;
        if (aq0Var != null) {
            ContentAwareFrameLayout contentAwareFrameLayout = (ContentAwareFrameLayout) aq0Var.e;
            if (contentAwareFrameLayout != null) {
                return contentAwareFrameLayout;
            }
            ny61.g("Required value was null.");
        }
        return null;
    }

    public final aq0 d() {
        aq0 aq0Var = this.B;
        if (aq0Var != null) {
            return aq0Var;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.B = new aq0(context, this.b.a(context, this.a), this.A);
        DivViewLayout h = d().h();
        ContentAwareFrameLayout c = c();
        final int i = 0;
        final int i2 = 1;
        this.C = new g0d(h, c != null ? Integer.valueOf(c.getPaddingTop()) : null, 1, new tls(this) { // from class: xul
            public final /* synthetic */ zul b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                zul zulVar = this.b;
                pkj pkjVar = (pkj) obj;
                switch (i3) {
                    case 0:
                        ContentAwareFrameLayout c2 = zulVar.c();
                        if (c2 != null) {
                            sb2.M(c2, pkjVar.w, 0, 13);
                        }
                        return zy11Var;
                    case 1:
                        ContentAwareFrameLayout c3 = zulVar.c();
                        if (c3 != null) {
                            sb2.M(c3, 0, pkjVar.w, 7);
                        }
                        return zy11Var;
                    default:
                        int i4 = pkjVar.w;
                        aq0 aq0Var = zulVar.B;
                        if (aq0Var == null) {
                            return zy11Var;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        if (i4 > 0) {
                            aq0Var.e().setVisibility(0);
                            aq0Var.g().setVisibility(0);
                        } else {
                            aq0Var.e().setVisibility(8);
                            aq0Var.g().setVisibility(8);
                        }
                        DivViewLayout e = aq0Var.e();
                        ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
                        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            layoutParams2.width = i4;
                            e.setLayoutParams(layoutParams2);
                        }
                        DivViewLayout g = aq0Var.g();
                        ViewGroup.LayoutParams layoutParams3 = g.getLayoutParams();
                        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                        if (layoutParams4 != null) {
                            layoutParams4.width = i4;
                            g.setLayoutParams(layoutParams4);
                        }
                        DivViewLayout c4 = aq0Var.c();
                        ContentAwareFrameLayout contentAwareFrameLayout = (ContentAwareFrameLayout) aq0Var.e;
                        if (contentAwareFrameLayout == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        for (ViewGroup viewGroup2 : scc.g(c4, contentAwareFrameLayout, aq0Var.h(), aq0Var.d(), aq0Var.f())) {
                            ViewGroup.LayoutParams layoutParams5 = viewGroup2.getLayoutParams();
                            FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
                            if (layoutParams6 != null) {
                                layoutParams6.leftMargin = i4;
                                layoutParams6.rightMargin = i4;
                                viewGroup2.setLayoutParams(layoutParams6);
                            }
                        }
                        return zy11Var;
                }
            }
        });
        DivViewLayout d = d().d();
        ContentAwareFrameLayout c2 = c();
        this.D = new g0d(d, c2 != null ? Integer.valueOf(c2.getPaddingBottom()) : null, 1, new tls(this) { // from class: xul
            public final /* synthetic */ zul b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                zul zulVar = this.b;
                pkj pkjVar = (pkj) obj;
                switch (i3) {
                    case 0:
                        ContentAwareFrameLayout c22 = zulVar.c();
                        if (c22 != null) {
                            sb2.M(c22, pkjVar.w, 0, 13);
                        }
                        return zy11Var;
                    case 1:
                        ContentAwareFrameLayout c3 = zulVar.c();
                        if (c3 != null) {
                            sb2.M(c3, 0, pkjVar.w, 7);
                        }
                        return zy11Var;
                    default:
                        int i4 = pkjVar.w;
                        aq0 aq0Var = zulVar.B;
                        if (aq0Var == null) {
                            return zy11Var;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        if (i4 > 0) {
                            aq0Var.e().setVisibility(0);
                            aq0Var.g().setVisibility(0);
                        } else {
                            aq0Var.e().setVisibility(8);
                            aq0Var.g().setVisibility(8);
                        }
                        DivViewLayout e = aq0Var.e();
                        ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
                        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            layoutParams2.width = i4;
                            e.setLayoutParams(layoutParams2);
                        }
                        DivViewLayout g = aq0Var.g();
                        ViewGroup.LayoutParams layoutParams3 = g.getLayoutParams();
                        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                        if (layoutParams4 != null) {
                            layoutParams4.width = i4;
                            g.setLayoutParams(layoutParams4);
                        }
                        DivViewLayout c4 = aq0Var.c();
                        ContentAwareFrameLayout contentAwareFrameLayout = (ContentAwareFrameLayout) aq0Var.e;
                        if (contentAwareFrameLayout == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        for (ViewGroup viewGroup2 : scc.g(c4, contentAwareFrameLayout, aq0Var.h(), aq0Var.d(), aq0Var.f())) {
                            ViewGroup.LayoutParams layoutParams5 = viewGroup2.getLayoutParams();
                            FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
                            if (layoutParams6 != null) {
                                layoutParams6.leftMargin = i4;
                                layoutParams6.rightMargin = i4;
                                viewGroup2.setLayoutParams(layoutParams6);
                            }
                        }
                        return zy11Var;
                }
            }
        });
        ViewGroup viewGroup2 = (ViewGroup) d().d;
        if (viewGroup2 == null) {
            ny61.g("Required value was null.");
            return null;
        }
        final int i3 = 2;
        this.E = new g0d(viewGroup2, null, 0, new tls(this) { // from class: xul
            public final /* synthetic */ zul b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i32 = i3;
                zy11 zy11Var = zy11.a;
                zul zulVar = this.b;
                pkj pkjVar = (pkj) obj;
                switch (i32) {
                    case 0:
                        ContentAwareFrameLayout c22 = zulVar.c();
                        if (c22 != null) {
                            sb2.M(c22, pkjVar.w, 0, 13);
                        }
                        return zy11Var;
                    case 1:
                        ContentAwareFrameLayout c3 = zulVar.c();
                        if (c3 != null) {
                            sb2.M(c3, 0, pkjVar.w, 7);
                        }
                        return zy11Var;
                    default:
                        int i4 = pkjVar.w;
                        aq0 aq0Var = zulVar.B;
                        if (aq0Var == null) {
                            return zy11Var;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        if (i4 > 0) {
                            aq0Var.e().setVisibility(0);
                            aq0Var.g().setVisibility(0);
                        } else {
                            aq0Var.e().setVisibility(8);
                            aq0Var.g().setVisibility(8);
                        }
                        DivViewLayout e = aq0Var.e();
                        ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
                        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            layoutParams2.width = i4;
                            e.setLayoutParams(layoutParams2);
                        }
                        DivViewLayout g = aq0Var.g();
                        ViewGroup.LayoutParams layoutParams3 = g.getLayoutParams();
                        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                        if (layoutParams4 != null) {
                            layoutParams4.width = i4;
                            g.setLayoutParams(layoutParams4);
                        }
                        DivViewLayout c4 = aq0Var.c();
                        ContentAwareFrameLayout contentAwareFrameLayout = (ContentAwareFrameLayout) aq0Var.e;
                        if (contentAwareFrameLayout == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        for (ViewGroup viewGroup22 : scc.g(c4, contentAwareFrameLayout, aq0Var.h(), aq0Var.d(), aq0Var.f())) {
                            ViewGroup.LayoutParams layoutParams5 = viewGroup22.getLayoutParams();
                            FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
                            if (layoutParams6 != null) {
                                layoutParams6.leftMargin = i4;
                                layoutParams6.rightMargin = i4;
                                viewGroup22.setLayoutParams(layoutParams6);
                            }
                        }
                        return zy11Var;
                }
            }
        });
        ViewGroup viewGroup3 = (ViewGroup) d().d;
        if (viewGroup3 == null) {
            ny61.g("Required value was null.");
            return null;
        }
        exy0 exy0Var = this.c;
        this.F = new nfh(exy0Var, viewGroup3);
        this.G = new nfh(exy0Var, d().e());
        this.H = new nfh(exy0Var, d().g());
        d().e().setVisibility(8);
        d().g().setVisibility(8);
        ViewGroup viewGroup4 = (ViewGroup) d().d;
        if (viewGroup4 != null) {
            return viewGroup4;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        Div2View divView;
        Div2View divView2;
        Div2View divView3;
        Div2View divView4;
        Div2View divView5;
        Div2View divView6;
        g0d g0dVar = this.C;
        if (g0dVar != null) {
            g0dVar.d();
            Integer num = (Integer) g0dVar.d;
            if (num != null) {
                int intValue = num.intValue();
                ContentAwareFrameLayout c = c();
                if (c != null) {
                    sb2.M(c, intValue, 0, 13);
                }
            }
        }
        g0d g0dVar2 = this.D;
        if (g0dVar2 != null) {
            g0dVar2.d();
            Integer num2 = (Integer) g0dVar2.d;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                ContentAwareFrameLayout c2 = c();
                if (c2 != null) {
                    sb2.M(c2, 0, intValue2, 7);
                }
            }
        }
        g0d g0dVar3 = this.E;
        if (g0dVar3 != null) {
            g0dVar3.b(null);
        }
        nfh nfhVar = this.G;
        if (nfhVar != null) {
            nfhVar.j();
        }
        nfh nfhVar2 = this.H;
        if (nfhVar2 != null) {
            nfhVar2.j();
        }
        this.C = null;
        this.D = null;
        this.E = null;
        nfh nfhVar3 = this.F;
        if (nfhVar3 != null) {
            nfhVar3.j();
        }
        this.F = null;
        nfh nfhVar4 = this.G;
        if (nfhVar4 != null) {
            nfhVar4.j();
        }
        this.G = null;
        nfh nfhVar5 = this.H;
        if (nfhVar5 != null) {
            nfhVar5.j();
        }
        this.H = null;
        aq0 d = d();
        DivViewLayout divViewLayout = (DivViewLayout) d.i;
        if (divViewLayout != null && (divView6 = divViewLayout.getDivView()) != null) {
            divView6.cleanup();
            divView6.setActionHandler(null);
        }
        DivViewLayout divViewLayout2 = (DivViewLayout) d.f;
        if (divViewLayout2 != null && (divView5 = divViewLayout2.getDivView()) != null) {
            divView5.cleanup();
            divView5.setActionHandler(null);
        }
        DivViewLayout divViewLayout3 = (DivViewLayout) d.g;
        if (divViewLayout3 != null && (divView4 = divViewLayout3.getDivView()) != null) {
            divView4.cleanup();
            divView4.setActionHandler(null);
        }
        DivViewLayout divViewLayout4 = (DivViewLayout) d.h;
        if (divViewLayout4 != null && (divView3 = divViewLayout4.getDivView()) != null) {
            divView3.cleanup();
            divView3.setActionHandler(null);
        }
        DivViewLayout divViewLayout5 = (DivViewLayout) d.j;
        if (divViewLayout5 != null && (divView2 = divViewLayout5.getDivView()) != null) {
            divView2.cleanup();
            divView2.setActionHandler(null);
        }
        DivViewLayout divViewLayout6 = (DivViewLayout) d.k;
        if (divViewLayout6 != null && (divView = divViewLayout6.getDivView()) != null) {
            divView.cleanup();
            divView.setActionHandler(null);
        }
        d.i = null;
        d.f = null;
        d.g = null;
        d.e = null;
        d.h = null;
        d.j = null;
        d.k = null;
        d.d = null;
        this.B = null;
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        aq0 aq0Var;
        DivKitScaffoldPadding divKitScaffoldPadding;
        vj2 vj2Var;
        tg2 a;
        vj2 vj2Var2;
        tg2 a2;
        vj2 vj2Var3;
        tg2 a3;
        vj2 vj2Var4;
        tg2 a4;
        ew2 ew2Var = (ew2) obj;
        mjm0 mjm0Var = (mjm0) ew2Var.b;
        wul wulVar = mjm0Var instanceof wul ? (wul) mjm0Var : null;
        if (wulVar == null) {
            return;
        }
        pxl pxlVar = new pxl((cnr0) ew2Var.c);
        ScaffoldAnimations scaffoldAnimations = wulVar.g;
        if (scaffoldAnimations == null || ew2Var.a) {
            scaffoldAnimations = null;
        }
        DivkitSnippet divkitSnippet = wulVar.a;
        pi2 pi2Var = this.x;
        n530 n530Var = this.w;
        ovl ovlVar = this.z;
        if (divkitSnippet != null) {
            d().h().setVisibility(0);
            b(d().h(), ovlVar.c(divkitSnippet, pxlVar, n530Var), divkitSnippet.m);
            if (scaffoldAnimations != null && (vj2Var4 = scaffoldAnimations.a) != null && (a4 = vj2Var4.getA()) != null) {
                pi2Var.p(a4, bi91.h(d().h()));
            }
        } else {
            d().h().setVisibility(8);
        }
        DivkitSnippet divkitSnippet2 = wulVar.c;
        if (divkitSnippet2 != null) {
            d().d().setVisibility(0);
            b(d().d(), ovlVar.c(divkitSnippet2, pxlVar, n530Var), divkitSnippet2.m);
            if (scaffoldAnimations != null && (vj2Var3 = scaffoldAnimations.b) != null && (a3 = vj2Var3.getA()) != null) {
                pi2Var.p(a3, bi91.h(d().d()));
            }
        } else {
            d().d().setVisibility(8);
        }
        DivkitSnippet divkitSnippet3 = wulVar.e;
        if (divkitSnippet3 != null) {
            d().f().setVisibility(0);
            b(d().f(), ovlVar.c(divkitSnippet3, pxlVar, n530Var), divkitSnippet3.m);
            if (scaffoldAnimations != null && (vj2Var2 = scaffoldAnimations.c) != null && (a2 = vj2Var2.getA()) != null) {
                pi2Var.p(a2, bi91.h(d().f()));
            }
        } else {
            d().f().setVisibility(8);
        }
        DivkitSnippet divkitSnippet4 = wulVar.h;
        if (divkitSnippet4 != null) {
            d().c().setVisibility(0);
            b(d().c(), ovlVar.c(divkitSnippet4, pxlVar, n530Var), divkitSnippet4.m);
            if (scaffoldAnimations != null && (vj2Var = scaffoldAnimations.d) != null && (a = vj2Var.getA()) != null) {
                pi2Var.p(a, bi91.h(d().c()));
            }
        } else {
            d().c().setVisibility(8);
        }
        g0d g0dVar = this.C;
        if (g0dVar != null) {
            DivKitScaffoldPadding divKitScaffoldPadding2 = wulVar.b;
            g0dVar.b(divKitScaffoldPadding2 != null ? divKitScaffoldPadding2.a : null);
        }
        g0d g0dVar2 = this.D;
        if (g0dVar2 != null) {
            DivKitScaffoldPadding divKitScaffoldPadding3 = wulVar.d;
            g0dVar2.b(divKitScaffoldPadding3 != null ? divKitScaffoldPadding3.a : null);
        }
        nfh nfhVar = this.F;
        if (nfhVar != null) {
            nfhVar.c(wulVar.f);
        }
        hrx hrxVar = wulVar.i;
        h690 h690Var = (hrxVar == null || (divKitScaffoldPadding = hrxVar.a) == null) ? null : divKitScaffoldPadding.a;
        if (h690Var != null && (aq0Var = this.B) != null) {
            ViewGroup viewGroup = (ViewGroup) aq0Var.d;
            if (viewGroup == null) {
                ny61.g("Required value was null.");
                return;
            }
            Context context = viewGroup.getContext();
            if (context != null) {
                Configuration configuration = context.getResources().getConfiguration();
                if (configuration.smallestScreenWidthDp >= 600 && configuration.orientation == 2) {
                    g0d g0dVar3 = this.E;
                    if (g0dVar3 != null) {
                        g0dVar3.b(h690Var);
                    }
                    nfh nfhVar2 = this.G;
                    if (nfhVar2 != null) {
                        nfhVar2.c(hrxVar.b);
                    }
                    nfh nfhVar3 = this.H;
                    if (nfhVar3 != null) {
                        nfhVar3.c(hrxVar.b);
                        return;
                    }
                    return;
                }
            }
        }
        g0d g0dVar4 = this.E;
        if (g0dVar4 != null) {
            g0dVar4.b(null);
        }
        nfh nfhVar4 = this.G;
        if (nfhVar4 != null) {
            nfhVar4.j();
        }
        nfh nfhVar5 = this.H;
        if (nfhVar5 != null) {
            nfhVar5.j();
        }
    }
}
