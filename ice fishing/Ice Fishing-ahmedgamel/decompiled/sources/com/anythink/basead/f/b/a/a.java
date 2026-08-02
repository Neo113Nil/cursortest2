package com.anythink.basead.f.b.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.basead.b;
import com.anythink.basead.b.c;
import com.anythink.basead.d.j;
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
    private boolean f9623E;

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f9624a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f9625b;

    /* renamed from: c, reason: collision with root package name */
    OwnNativeATView f9626c;

    /* renamed from: d, reason: collision with root package name */
    WeakReference<View> f9627d;

    /* renamed from: e, reason: collision with root package name */
    com.anythink.basead.ui.a f9628e;

    /* renamed from: f, reason: collision with root package name */
    a.InterfaceC0056a f9629f;

    /* renamed from: g, reason: collision with root package name */
    com.anythink.basead.b.c f9630g;

    /* renamed from: h, reason: collision with root package name */
    com.anythink.basead.ui.improveclick.a f9631h;
    com.anythink.basead.ui.f.c i;

    /* renamed from: j, reason: collision with root package name */
    com.anythink.core.common.v.a.c f9632j;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.v.a.c f9633k;

    /* renamed from: l, reason: collision with root package name */
    HashMap<String, Object> f9634l;

    /* renamed from: m, reason: collision with root package name */
    com.anythink.basead.j.e f9635m;

    /* renamed from: n, reason: collision with root package name */
    View.OnClickListener f9636n;

    /* renamed from: o, reason: collision with root package name */
    View.OnClickListener f9637o;

    /* renamed from: p, reason: collision with root package name */
    private final String f9638p;

    /* renamed from: q, reason: collision with root package name */
    private IExHandlerBaseAd.DataFetchListener f9639q;

    /* renamed from: com.anythink.basead.f.b.a.a$10, reason: invalid class name */
    public class AnonymousClass10 extends com.anythink.basead.ui.improveclick.a {
        public AnonymousClass10(ViewGroup viewGroup, w wVar, x xVar, int i, c.a aVar) {
            super(viewGroup, wVar, xVar, i, aVar);
        }

        @Override // com.anythink.basead.ui.improveclick.a
        public final ViewGroup.LayoutParams a() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (a.this.f9626c != null) {
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
            WeakReference<View> weakReference = a.this.f9627d;
            if (weakReference == null || weakReference.get() == null) {
                a.this.L();
            }
            WeakReference<View> weakReference2 = a.this.f9627d;
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
        public final void a(int i, int i4) {
            a aVar = a.this;
            aVar.a(aVar.L(), i, i4);
        }
    }

    public a(Context context, bj bjVar, x xVar, boolean z6) {
        super(context, bjVar, xVar, z6);
        this.f9638p = "a";
        this.f9624a = false;
        this.f9625b = false;
        this.f9634l = new HashMap<>();
        this.f9623E = false;
        this.f9636n = new View.OnClickListener() { // from class: com.anythink.basead.f.b.a.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.a(view, false);
            }
        };
        this.f9637o = new View.OnClickListener() { // from class: com.anythink.basead.f.b.a.a.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.a(view, true);
            }
        };
        this.i = new com.anythink.basead.ui.f.c(this.f9667s);
        this.f9629f = new a.InterfaceC0056a() { // from class: com.anythink.basead.f.b.a.a.6
            @Override // com.anythink.basead.ui.component.a.InterfaceC0056a
            public final j a() {
                return a.this.M();
            }

            @Override // com.anythink.basead.ui.component.a.InterfaceC0056a
            public final com.anythink.basead.d.a b() {
                OwnNativeATView ownNativeATView = a.this.f9626c;
                if (ownNativeATView != null) {
                    return ownNativeATView.getAdClickRecord(13);
                }
                return null;
            }
        };
        this.f9635m = new com.anythink.basead.j.e(bjVar, xVar);
    }

    private void N() {
        bj bjVar;
        x xVar;
        OwnNativeATView ownNativeATView = this.f9626c;
        if (ownNativeATView == null || (bjVar = this.f9667s) == null || (xVar = this.f9668t) == null) {
            return;
        }
        this.f9631h = new AnonymousClass10(ownNativeATView, bjVar, xVar, this.f9669u ? 5 : 6, new AnonymousClass9());
        this.f9634l.put(g.a.f11954c, this.f9670v);
        this.f9631h.a(this.f9634l);
        this.f9626c.setLifeCallback(new AnonymousClass11());
        com.anythink.basead.ui.a aVar = this.f9628e;
        if (aVar != null) {
            aVar.setATImproveClickViewController(this.f9631h);
        }
        if (this.f9624a) {
            a(114);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final long C() {
        com.anythink.basead.ui.a aVar = this.f9628e;
        if (aVar != null) {
            return aVar.getVideoCurrentPosition();
        }
        return 0L;
    }

    public final OwnNativeATView G() {
        OwnNativeATView ownNativeATView = this.f9626c;
        if (ownNativeATView != null) {
            ownNativeATView.releaseAllCallback();
            com.anythink.basead.j.e eVar = this.f9635m;
            if (eVar != null) {
                eVar.b();
                this.f9635m = null;
            }
        }
        OwnNativeATView ownNativeATView2 = new OwnNativeATView(this.f9666r);
        ownNativeATView2.setClickRecordHelper(this.i);
        this.f9623E = false;
        return ownNativeATView2;
    }

    @Override // com.anythink.basead.f.b.a.d
    public View H() {
        return this.f9626c;
    }

    public void I() {
        if (this.f9624a) {
            return;
        }
        this.f9624a = true;
        bj bjVar = this.f9667s;
        if (bjVar != null && bjVar.ay()) {
            com.anythink.core.common.u.e.c(this.f9667s, this.f9668t, 3);
            this.f9625b = true;
            return;
        }
        if (this.f9667s instanceof bi) {
            com.anythink.basead.f.f.c a9 = com.anythink.basead.f.f.c.a();
            Context context = this.f9666r;
            x xVar = this.f9668t;
            a9.a(context, com.anythink.basead.f.f.c.a(xVar.f14942b, xVar.f14943c), this.f9667s, this.f9668t.f14954o);
        }
        if (H() != null) {
            com.anythink.basead.b.b.a(8, this.f9667s, M());
            com.anythink.basead.g.a aVar = this.f9670v;
            if (aVar != null) {
                com.anythink.basead.g.j jVar = new com.anythink.basead.g.j();
                jVar.f9772e = this.f9668t.f14954o.bi();
                aVar.onAdShow(jVar);
            }
        }
        a(114);
        bj bjVar2 = this.f9667s;
        if (bjVar2 == null || !bjVar2.ae()) {
            return;
        }
        this.f9639q = new AnonymousClass8(bjVar2);
        com.anythink.basead.b.a().addDataFetchListener(this.f9639q);
    }

    public List<View> J() {
        return null;
    }

    public void K() {
    }

    public abstract View L();

    public final void a(View view, boolean z6) {
        WeakReference<View> weakReference = this.f9627d;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null && view == view2) {
            a(view, 1, 1, z6);
        } else if (J() == null || !J().contains(view)) {
            a(view, 1, 2, z6);
        } else {
            a(view, 1, 3, z6);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void b(boolean z6) {
        super.b(z6);
        com.anythink.basead.ui.a aVar = this.f9628e;
        if (aVar != null) {
            aVar.setIsMuted(z6);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void q() {
        super.q();
        com.anythink.core.common.v.a.c cVar = this.f9632j;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public void r() {
        super.r();
        a(112);
        OwnNativeATView ownNativeATView = this.f9626c;
        if (ownNativeATView != null) {
            ownNativeATView.releaseAllCallback();
        }
        this.f9626c = null;
        this.f9627d = null;
        com.anythink.basead.j.e eVar = this.f9635m;
        if (eVar != null) {
            eVar.b();
        }
        com.anythink.basead.b.c cVar = this.f9630g;
        if (cVar != null) {
            cVar.d();
            this.f9630g = null;
        }
        if (this.f9639q != null) {
            com.anythink.basead.b.a().removeDataFetchListener(this.f9639q);
        }
        com.anythink.basead.ui.a aVar = this.f9628e;
        if (aVar != null) {
            aVar.destroyPlayerView(3);
        }
        com.anythink.core.common.v.a.c cVar2 = this.f9632j;
        if (cVar2 != null) {
            cVar2.b();
            this.f9632j = null;
        }
        com.anythink.core.common.v.a.c cVar3 = this.f9633k;
        if (cVar3 != null) {
            cVar3.b();
            this.f9633k = null;
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void u() {
        super.u();
        com.anythink.basead.ui.a aVar = this.f9628e;
        if (aVar != null) {
            aVar.resumeVideo();
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void v() {
        super.v();
        com.anythink.basead.ui.a aVar = this.f9628e;
        if (aVar != null) {
            aVar.pauseVideo();
        }
    }

    public final void a(View view, int i, int i4) {
        a(view, i, i4, false);
    }

    private void a(View view, final int i, final int i4, boolean z6) {
        if (this.f9626c != null) {
            I();
            if (this.f9630g == null) {
                this.f9630g = new com.anythink.basead.b.c(t.b().g(), this.f9668t, this.f9667s, this.f9626c);
            }
            if (this.f9630g.a()) {
                return;
            }
            if (this.f9667s.ae() && ((i4 == 1 || i4 == 6) && this.f9667s.aa() == 4 && this.f9668t.f14954o.aO())) {
                com.anythink.basead.b.a().pause(this.f9667s);
                return;
            }
            this.f9630g.a(new c.a() { // from class: com.anythink.basead.f.b.a.a.5
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
                    if (a.this.f9625b) {
                        return;
                    }
                    bj bjVar = a.this.f9667s;
                    if (bjVar != null && bjVar.ay()) {
                        if (a.this.f9667s.r() == null || a.this.f9667s.r().bN() != 2) {
                            a aVar = a.this;
                            com.anythink.core.common.u.e.c(aVar.f9667s, aVar.f9668t, 1);
                            return;
                        } else {
                            a aVar2 = a.this;
                            com.anythink.core.common.u.e.c(aVar2.f9667s, aVar2.f9668t, 2);
                        }
                    }
                    com.anythink.basead.g.a aVar3 = a.this.f9670v;
                    if (aVar3 != null) {
                        com.anythink.basead.g.j a9 = new com.anythink.basead.g.j().a(i, i4);
                        a9.f9772e = a.this.f9668t.f14954o.bi();
                        aVar3.onAdClick(a9);
                    }
                }

                @Override // com.anythink.basead.b.c.a
                public final void a(boolean z9) {
                    com.anythink.basead.g.a aVar;
                    if (a.this.f9625b) {
                        return;
                    }
                    bj bjVar = a.this.f9667s;
                    if ((bjVar == null || !bjVar.ay() || a.this.f9667s.r() == null || a.this.f9667s.r().bN() == 2) && (aVar = a.this.f9670v) != null) {
                        aVar.onDeeplinkCallback(z9);
                    }
                }
            });
            j M8 = M();
            if (i == 1) {
                OwnNativeATView ownNativeATView = this.f9626c;
                M8.i = ownNativeATView != null ? ownNativeATView.getAdClickRecord(i4) : null;
            } else {
                com.anythink.basead.ui.f.c cVar = this.i;
                M8.i = cVar != null ? cVar.a(view, i, i4) : null;
            }
            if (z6) {
                M8.f7003m = true;
            }
            this.f9630g.a(M8);
            if (this.f9631h != null) {
                HashMap hashMap = new HashMap();
                k.A(i, hashMap, "click_type", i4, g.a.f11958g);
                this.f9631h.a(hashMap);
            }
            a(113);
        }
    }

    @Override // com.anythink.basead.f.a
    public void a(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
        bj bjVar;
        x xVar;
        if (this.f9626c == null || this.f9623E) {
            return;
        }
        int i = 1;
        this.f9623E = true;
        com.anythink.basead.j.e eVar = this.f9635m;
        if (eVar != null && view2 != null) {
            eVar.a(view2);
        }
        if (!this.f9624a && this.f9633k == null) {
            com.anythink.core.common.v.a.a aVar = new com.anythink.core.common.v.a.a() { // from class: com.anythink.basead.f.b.a.a.7
                @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
                public final int getImpressionMinPercentageViewed() {
                    return 25;
                }

                @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
                public final void recordImpression(View view3) {
                    a aVar2 = a.this;
                    if (aVar2.f9664D == 0) {
                        aVar2.f9664D = System.currentTimeMillis();
                    }
                    a.this.a(BaseATView.a.f10590z);
                }
            };
            bj bjVar2 = this.f9667s;
            if (bjVar2 != null && bjVar2.r() != null) {
                i = this.f9667s.r().bO();
            }
            view.getContext();
            com.anythink.core.common.v.a.c cVar = new com.anythink.core.common.v.a.c(i, 0);
            this.f9633k = cVar;
            cVar.a(view, aVar);
        }
        bj bjVar3 = this.f9667s;
        if (bjVar3 != null && !bjVar3.n()) {
            a(view);
            if (list != null && list.size() > 0) {
                for (View view3 : list) {
                    if (view3 != null) {
                        view3.setOnClickListener(this.f9636n);
                    }
                }
            } else {
                a(view, this.f9636n);
            }
            if (list2 != null && list2.size() > 0) {
                for (View view4 : list2) {
                    if (view4 != null) {
                        view4.setOnClickListener(this.f9637o);
                    }
                }
            }
        }
        OwnNativeATView ownNativeATView = this.f9626c;
        if (ownNativeATView != null && (bjVar = this.f9667s) != null && (xVar = this.f9668t) != null) {
            this.f9631h = new AnonymousClass10(ownNativeATView, bjVar, xVar, this.f9669u ? 5 : 6, new AnonymousClass9());
            this.f9634l.put(g.a.f11954c, this.f9670v);
            this.f9631h.a(this.f9634l);
            this.f9626c.setLifeCallback(new AnonymousClass11());
            com.anythink.basead.ui.a aVar2 = this.f9628e;
            if (aVar2 != null) {
                aVar2.setATImproveClickViewController(this.f9631h);
            }
            if (this.f9624a) {
                a(114);
            }
        }
        L();
    }

    private void a(bj bjVar) {
        if (bjVar == null || !bjVar.ae()) {
            return;
        }
        this.f9639q = new AnonymousClass8(bjVar);
        com.anythink.basead.b.a().addDataFetchListener(this.f9639q);
    }

    public final void a(int i) {
        com.anythink.basead.ui.improveclick.a aVar = this.f9631h;
        if (aVar != null) {
            aVar.a(i);
        }
        com.anythink.basead.j.e eVar = this.f9635m;
        if (eVar != null) {
            eVar.a(i, this.f9626c);
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
        if (this.f9632j == null) {
            bj bjVar = this.f9667s;
            int bO = (bjVar == null || bjVar.r() == null) ? 1 : this.f9667s.r().bO();
            view.getContext();
            this.f9632j = new com.anythink.core.common.v.a.c(bO, this.f9668t.f14954o.ab() <= 0 ? 100 : this.f9668t.f14954o.ab());
        }
        this.f9632j.a(view, aVar);
    }

    public final void a(com.anythink.basead.ui.a aVar) {
        this.f9628e = aVar;
        aVar.initPlayerView(this.f9667s, this.f9668t, this.f9629f, this.f9635m);
        this.f9628e.setIsMuted(this.f9672x);
        this.f9628e.setAutoPlay(this.f9673y);
        this.f9628e.setVideoListener(this.f9671w);
        this.f9628e.setPlayerOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.f.b.a.a.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.f9636n.onClick(view);
            }
        });
    }
}
