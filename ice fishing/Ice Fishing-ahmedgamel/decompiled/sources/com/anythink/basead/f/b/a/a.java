package com.anythink.basead.f.b.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.basead.b;
import com.anythink.basead.b.c;
import com.anythink.basead.d.j;
import com.anythink.basead.exoplayer.f.f;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.OwnNativeATView;
import com.anythink.basead.ui.component.a;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.basead.ui.improveclick.i;
import com.anythink.core.api.IExHandlerBaseAd;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bi;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a extends d {

    /* renamed from: E, reason: collision with root package name */
    private boolean f8837E;

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f8838a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f8839b;

    /* renamed from: c, reason: collision with root package name */
    OwnNativeATView f8840c;

    /* renamed from: d, reason: collision with root package name */
    WeakReference<View> f8841d;

    /* renamed from: e, reason: collision with root package name */
    com.anythink.basead.ui.a f8842e;

    /* renamed from: f, reason: collision with root package name */
    a.InterfaceC0056a f8843f;

    /* renamed from: g, reason: collision with root package name */
    com.anythink.basead.b.c f8844g;

    /* renamed from: h, reason: collision with root package name */
    com.anythink.basead.ui.improveclick.a f8845h;
    com.anythink.basead.ui.f.c i;

    /* renamed from: j, reason: collision with root package name */
    com.anythink.core.common.v.a.c f8846j;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.v.a.c f8847k;

    /* renamed from: l, reason: collision with root package name */
    HashMap<String, Object> f8848l;

    /* renamed from: m, reason: collision with root package name */
    com.anythink.basead.j.e f8849m;

    /* renamed from: n, reason: collision with root package name */
    View.OnClickListener f8850n;

    /* renamed from: o, reason: collision with root package name */
    View.OnClickListener f8851o;

    /* renamed from: p, reason: collision with root package name */
    private final String f8852p;

    /* renamed from: q, reason: collision with root package name */
    private IExHandlerBaseAd.DataFetchListener f8853q;

    /* renamed from: com.anythink.basead.f.b.a.a$10, reason: invalid class name */
    public class AnonymousClass10 extends com.anythink.basead.ui.improveclick.a {
        public AnonymousClass10(ViewGroup viewGroup, w wVar, x xVar, int i, c.a aVar) {
            super(viewGroup, wVar, xVar, i, aVar);
        }

        @Override // com.anythink.basead.ui.improveclick.a
        public final ViewGroup.LayoutParams a() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (a.this.f8840c != null) {
                layoutParams.gravity = 81;
                layoutParams.setMargins(0, 0, 0, 0);
            }
            return layoutParams;
        }
    }

    /* renamed from: com.anythink.basead.f.b.a.a$11, reason: invalid class name */
    public class AnonymousClass11 implements OwnNativeATView.a {
        public AnonymousClass11() {
        }

        @Override // com.anythink.basead.ui.OwnNativeATView.a
        public final void a() {
            a.this.a(110);
        }

        @Override // com.anythink.basead.ui.OwnNativeATView.a
        public final void b() {
            a.this.a(111);
        }
    }

    /* renamed from: com.anythink.basead.f.b.a.a$8, reason: invalid class name */
    public class AnonymousClass8 extends b.a {
        public AnonymousClass8(w wVar) {
            super(wVar);
        }

        @Override // com.anythink.core.api.IExHandlerBaseAd.DataFetchListener
        public final void onStatusChanged(String str) {
            WeakReference<View> weakReference = a.this.f8841d;
            if (weakReference == null || weakReference.get() == null) {
                a.this.L();
            }
            WeakReference<View> weakReference2 = a.this.f8841d;
            View view = weakReference2 != null ? weakReference2.get() : null;
            if (view == null || !(view instanceof TextView)) {
                return;
            }
            ((TextView) view).setText(str);
        }
    }

    /* renamed from: com.anythink.basead.f.b.a.a$9, reason: invalid class name */
    public class AnonymousClass9 implements c.a {
        public AnonymousClass9() {
        }

        @Override // com.anythink.basead.ui.improveclick.c.a
        public final void a(int i, int i6) {
            a aVar = a.this;
            aVar.a(aVar.L(), i, i6);
        }
    }

    public a(Context context, bj bjVar, x xVar, boolean z3) {
        super(context, bjVar, xVar, z3);
        this.f8852p = "a";
        this.f8838a = false;
        this.f8839b = false;
        this.f8848l = new HashMap<>();
        this.f8837E = false;
        this.f8850n = new View.OnClickListener() { // from class: com.anythink.basead.f.b.a.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.a(view, false);
            }
        };
        this.f8851o = new View.OnClickListener() { // from class: com.anythink.basead.f.b.a.a.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.a(view, true);
            }
        };
        this.i = new com.anythink.basead.ui.f.c(this.f8881s);
        this.f8843f = new a.InterfaceC0056a() { // from class: com.anythink.basead.f.b.a.a.6
            @Override // com.anythink.basead.ui.component.a.InterfaceC0056a
            public final j a() {
                return a.this.M();
            }

            @Override // com.anythink.basead.ui.component.a.InterfaceC0056a
            public final com.anythink.basead.d.a b() {
                OwnNativeATView ownNativeATView = a.this.f8840c;
                if (ownNativeATView != null) {
                    return ownNativeATView.getAdClickRecord(13);
                }
                return null;
            }
        };
        this.f8849m = new com.anythink.basead.j.e(bjVar, xVar);
    }

    private void N() {
        bj bjVar;
        x xVar;
        OwnNativeATView ownNativeATView = this.f8840c;
        if (ownNativeATView == null || (bjVar = this.f8881s) == null || (xVar = this.f8882t) == null) {
            return;
        }
        this.f8845h = new AnonymousClass10(ownNativeATView, bjVar, xVar, this.f8883u ? 5 : 6, new AnonymousClass9());
        this.f8848l.put(g.a.f11168c, this.f8884v);
        this.f8845h.a(this.f8848l);
        this.f8840c.setLifeCallback(new AnonymousClass11());
        com.anythink.basead.ui.a aVar = this.f8842e;
        if (aVar != null) {
            aVar.setATImproveClickViewController(this.f8845h);
        }
        if (this.f8838a) {
            a(114);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final long C() {
        com.anythink.basead.ui.a aVar = this.f8842e;
        if (aVar != null) {
            return aVar.getVideoCurrentPosition();
        }
        return 0L;
    }

    public final OwnNativeATView G() {
        OwnNativeATView ownNativeATView = this.f8840c;
        if (ownNativeATView != null) {
            ownNativeATView.releaseAllCallback();
            com.anythink.basead.j.e eVar = this.f8849m;
            if (eVar != null) {
                eVar.b();
                this.f8849m = null;
            }
        }
        OwnNativeATView ownNativeATView2 = new OwnNativeATView(this.f8880r);
        ownNativeATView2.setClickRecordHelper(this.i);
        this.f8837E = false;
        return ownNativeATView2;
    }

    @Override // com.anythink.basead.f.b.a.d
    public View H() {
        return this.f8840c;
    }

    public void I() {
        if (this.f8838a) {
            return;
        }
        this.f8838a = true;
        bj bjVar = this.f8881s;
        if (bjVar != null && bjVar.ay()) {
            com.anythink.core.common.u.e.c(this.f8881s, this.f8882t, 3);
            this.f8839b = true;
            return;
        }
        if (this.f8881s instanceof bi) {
            com.anythink.basead.f.f.c a9 = com.anythink.basead.f.f.c.a();
            Context context = this.f8880r;
            x xVar = this.f8882t;
            a9.a(context, com.anythink.basead.f.f.c.a(xVar.f14156b, xVar.f14157c), this.f8881s, this.f8882t.f14168o);
        }
        if (H() != null) {
            com.anythink.basead.b.b.a(8, this.f8881s, M());
            com.anythink.basead.g.a aVar = this.f8884v;
            if (aVar != null) {
                com.anythink.basead.g.j jVar = new com.anythink.basead.g.j();
                jVar.f8986e = this.f8882t.f14168o.bi();
                aVar.onAdShow(jVar);
            }
        }
        a(114);
        bj bjVar2 = this.f8881s;
        if (bjVar2 == null || !bjVar2.ae()) {
            return;
        }
        this.f8853q = new AnonymousClass8(bjVar2);
        com.anythink.basead.b.a().addDataFetchListener(this.f8853q);
    }

    public List<View> J() {
        return null;
    }

    public void K() {
    }

    public abstract View L();

    public final void a(View view, boolean z3) {
        WeakReference<View> weakReference = this.f8841d;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null && view == view2) {
            a(view, 1, 1, z3);
        } else if (J() == null || !J().contains(view)) {
            a(view, 1, 2, z3);
        } else {
            a(view, 1, 3, z3);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void b(boolean z3) {
        super.b(z3);
        com.anythink.basead.ui.a aVar = this.f8842e;
        if (aVar != null) {
            aVar.setIsMuted(z3);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void q() {
        super.q();
        com.anythink.core.common.v.a.c cVar = this.f8846j;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public void r() {
        super.r();
        a(112);
        OwnNativeATView ownNativeATView = this.f8840c;
        if (ownNativeATView != null) {
            ownNativeATView.releaseAllCallback();
        }
        this.f8840c = null;
        this.f8841d = null;
        com.anythink.basead.j.e eVar = this.f8849m;
        if (eVar != null) {
            eVar.b();
        }
        com.anythink.basead.b.c cVar = this.f8844g;
        if (cVar != null) {
            cVar.d();
            this.f8844g = null;
        }
        if (this.f8853q != null) {
            com.anythink.basead.b.a().removeDataFetchListener(this.f8853q);
        }
        com.anythink.basead.ui.a aVar = this.f8842e;
        if (aVar != null) {
            aVar.destroyPlayerView(3);
        }
        com.anythink.core.common.v.a.c cVar2 = this.f8846j;
        if (cVar2 != null) {
            cVar2.b();
            this.f8846j = null;
        }
        com.anythink.core.common.v.a.c cVar3 = this.f8847k;
        if (cVar3 != null) {
            cVar3.b();
            this.f8847k = null;
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void u() {
        super.u();
        com.anythink.basead.ui.a aVar = this.f8842e;
        if (aVar != null) {
            aVar.resumeVideo();
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void v() {
        super.v();
        com.anythink.basead.ui.a aVar = this.f8842e;
        if (aVar != null) {
            aVar.pauseVideo();
        }
    }

    public final void a(View view, int i, int i6) {
        a(view, i, i6, false);
    }

    private void a(View view, final int i, final int i6, boolean z3) {
        if (this.f8840c != null) {
            I();
            if (this.f8844g == null) {
                this.f8844g = new com.anythink.basead.b.c(t.b().g(), this.f8882t, this.f8881s, this.f8840c);
            }
            if (this.f8844g.a()) {
                return;
            }
            if (this.f8881s.ae() && ((i6 == 1 || i6 == 6) && this.f8881s.aa() == 4 && this.f8882t.f14168o.aO())) {
                com.anythink.basead.b.a().pause(this.f8881s);
                return;
            }
            this.f8844g.a(new c.a() { // from class: com.anythink.basead.f.b.a.a.5
                @Override // com.anythink.basead.b.c.a
                public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
                    return false;
                }

                @Override // com.anythink.basead.b.c.a
                public final void b() {
                    a.this.K();
                }

                @Override // com.anythink.basead.b.c.a
                public final void c() {
                    i.a().b();
                }

                @Override // com.anythink.basead.b.c.a
                public final void a() {
                    if (a.this.f8839b) {
                        return;
                    }
                    bj bjVar = a.this.f8881s;
                    if (bjVar != null && bjVar.ay()) {
                        if (a.this.f8881s.r() == null || a.this.f8881s.r().bN() != 2) {
                            a aVar = a.this;
                            com.anythink.core.common.u.e.c(aVar.f8881s, aVar.f8882t, 1);
                            return;
                        } else {
                            a aVar2 = a.this;
                            com.anythink.core.common.u.e.c(aVar2.f8881s, aVar2.f8882t, 2);
                        }
                    }
                    com.anythink.basead.g.a aVar3 = a.this.f8884v;
                    if (aVar3 != null) {
                        com.anythink.basead.g.j a9 = new com.anythink.basead.g.j().a(i, i6);
                        a9.f8986e = a.this.f8882t.f14168o.bi();
                        aVar3.onAdClick(a9);
                    }
                }

                @Override // com.anythink.basead.b.c.a
                public final void a(boolean z6) {
                    com.anythink.basead.g.a aVar;
                    if (a.this.f8839b) {
                        return;
                    }
                    bj bjVar = a.this.f8881s;
                    if ((bjVar == null || !bjVar.ay() || a.this.f8881s.r() == null || a.this.f8881s.r().bN() == 2) && (aVar = a.this.f8884v) != null) {
                        aVar.onDeeplinkCallback(z6);
                    }
                }
            });
            j M8 = M();
            if (i == 1) {
                OwnNativeATView ownNativeATView = this.f8840c;
                M8.i = ownNativeATView != null ? ownNativeATView.getAdClickRecord(i6) : null;
            } else {
                com.anythink.basead.ui.f.c cVar = this.i;
                M8.i = cVar != null ? cVar.a(view, i, i6) : null;
            }
            if (z3) {
                M8.f6217m = true;
            }
            this.f8844g.a(M8);
            if (this.f8845h != null) {
                HashMap hashMap = new HashMap();
                f.y(i, hashMap, "click_type", i6, g.a.f11172g);
                this.f8845h.a(hashMap);
            }
            a(113);
        }
    }

    @Override // com.anythink.basead.f.a
    public void a(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
        bj bjVar;
        x xVar;
        if (this.f8840c == null || this.f8837E) {
            return;
        }
        int i = 1;
        this.f8837E = true;
        com.anythink.basead.j.e eVar = this.f8849m;
        if (eVar != null && view2 != null) {
            eVar.a(view2);
        }
        if (!this.f8838a && this.f8847k == null) {
            com.anythink.core.common.v.a.a aVar = new com.anythink.core.common.v.a.a() { // from class: com.anythink.basead.f.b.a.a.7
                @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
                public final int getImpressionMinPercentageViewed() {
                    return 25;
                }

                @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
                public final void recordImpression(View view3) {
                    a aVar2 = a.this;
                    if (aVar2.f8878D == 0) {
                        aVar2.f8878D = System.currentTimeMillis();
                    }
                    a.this.a(BaseATView.a.f9804z);
                }
            };
            bj bjVar2 = this.f8881s;
            if (bjVar2 != null && bjVar2.r() != null) {
                i = this.f8881s.r().bO();
            }
            view.getContext();
            com.anythink.core.common.v.a.c cVar = new com.anythink.core.common.v.a.c(i, 0);
            this.f8847k = cVar;
            cVar.a(view, aVar);
        }
        bj bjVar3 = this.f8881s;
        if (bjVar3 != null && !bjVar3.n()) {
            a(view);
            if (list != null && list.size() > 0) {
                for (View view3 : list) {
                    if (view3 != null) {
                        view3.setOnClickListener(this.f8850n);
                    }
                }
            } else {
                a(view, this.f8850n);
            }
            if (list2 != null && list2.size() > 0) {
                for (View view4 : list2) {
                    if (view4 != null) {
                        view4.setOnClickListener(this.f8851o);
                    }
                }
            }
        }
        OwnNativeATView ownNativeATView = this.f8840c;
        if (ownNativeATView != null && (bjVar = this.f8881s) != null && (xVar = this.f8882t) != null) {
            this.f8845h = new AnonymousClass10(ownNativeATView, bjVar, xVar, this.f8883u ? 5 : 6, new AnonymousClass9());
            this.f8848l.put(g.a.f11168c, this.f8884v);
            this.f8845h.a(this.f8848l);
            this.f8840c.setLifeCallback(new AnonymousClass11());
            com.anythink.basead.ui.a aVar2 = this.f8842e;
            if (aVar2 != null) {
                aVar2.setATImproveClickViewController(this.f8845h);
            }
            if (this.f8838a) {
                a(114);
            }
        }
        L();
    }

    private void a(bj bjVar) {
        if (bjVar == null || !bjVar.ae()) {
            return;
        }
        this.f8853q = new AnonymousClass8(bjVar);
        com.anythink.basead.b.a().addDataFetchListener(this.f8853q);
    }

    public final void a(int i) {
        com.anythink.basead.ui.improveclick.a aVar = this.f8845h;
        if (aVar != null) {
            aVar.a(i);
        }
        com.anythink.basead.j.e eVar = this.f8849m;
        if (eVar != null) {
            eVar.a(i, this.f8840c);
        }
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), onClickListener);
            }
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public final void a(View view) {
        com.anythink.core.common.v.a.a aVar = new com.anythink.core.common.v.a.a() { // from class: com.anythink.basead.f.b.a.a.2
            @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
            public final void recordImpression(View view2) {
                a.this.I();
            }
        };
        if (this.f8846j == null) {
            bj bjVar = this.f8881s;
            int bO = (bjVar == null || bjVar.r() == null) ? 1 : this.f8881s.r().bO();
            view.getContext();
            this.f8846j = new com.anythink.core.common.v.a.c(bO, this.f8882t.f14168o.ab() <= 0 ? 100 : this.f8882t.f14168o.ab());
        }
        this.f8846j.a(view, aVar);
    }

    public final void a(com.anythink.basead.ui.a aVar) {
        this.f8842e = aVar;
        aVar.initPlayerView(this.f8881s, this.f8882t, this.f8843f, this.f8849m);
        this.f8842e.setIsMuted(this.f8886x);
        this.f8842e.setAutoPlay(this.f8887y);
        this.f8842e.setVideoListener(this.f8885w);
        this.f8842e.setPlayerOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.f.b.a.a.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.f8850n.onClick(view);
            }
        });
    }
}
