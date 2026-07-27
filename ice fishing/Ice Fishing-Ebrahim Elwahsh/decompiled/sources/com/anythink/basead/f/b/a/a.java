package com.anythink.basead.f.b.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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
    private boolean f8994E;

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f8995a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f8996b;

    /* renamed from: c, reason: collision with root package name */
    OwnNativeATView f8997c;

    /* renamed from: d, reason: collision with root package name */
    WeakReference<View> f8998d;

    /* renamed from: e, reason: collision with root package name */
    com.anythink.basead.ui.a f8999e;

    /* renamed from: f, reason: collision with root package name */
    a.InterfaceC0055a f9000f;

    /* renamed from: g, reason: collision with root package name */
    com.anythink.basead.b.c f9001g;

    /* renamed from: h, reason: collision with root package name */
    com.anythink.basead.ui.improveclick.a f9002h;
    com.anythink.basead.ui.f.c i;

    /* renamed from: j, reason: collision with root package name */
    com.anythink.core.common.v.a.c f9003j;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.v.a.c f9004k;

    /* renamed from: l, reason: collision with root package name */
    HashMap<String, Object> f9005l;

    /* renamed from: m, reason: collision with root package name */
    com.anythink.basead.j.e f9006m;

    /* renamed from: n, reason: collision with root package name */
    View.OnClickListener f9007n;

    /* renamed from: o, reason: collision with root package name */
    View.OnClickListener f9008o;

    /* renamed from: p, reason: collision with root package name */
    private final String f9009p;

    /* renamed from: q, reason: collision with root package name */
    private IExHandlerBaseAd.DataFetchListener f9010q;

    /* renamed from: com.anythink.basead.f.b.a.a$10, reason: invalid class name */
    public class AnonymousClass10 extends com.anythink.basead.ui.improveclick.a {
        public AnonymousClass10(ViewGroup viewGroup, w wVar, x xVar, int i, c.a aVar) {
            super(viewGroup, wVar, xVar, i, aVar);
        }

        @Override // com.anythink.basead.ui.improveclick.a
        public final ViewGroup.LayoutParams a() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (a.this.f8997c != null) {
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
            WeakReference<View> weakReference = a.this.f8998d;
            if (weakReference == null || weakReference.get() == null) {
                a.this.L();
            }
            WeakReference<View> weakReference2 = a.this.f8998d;
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

    public a(Context context, bj bjVar, x xVar, boolean z8) {
        super(context, bjVar, xVar, z8);
        this.f9009p = "a";
        this.f8995a = false;
        this.f8996b = false;
        this.f9005l = new HashMap<>();
        this.f8994E = false;
        this.f9007n = new View.OnClickListener() { // from class: com.anythink.basead.f.b.a.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.a(view, false);
            }
        };
        this.f9008o = new View.OnClickListener() { // from class: com.anythink.basead.f.b.a.a.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.a(view, true);
            }
        };
        this.i = new com.anythink.basead.ui.f.c(this.f9038s);
        this.f9000f = new a.InterfaceC0055a() { // from class: com.anythink.basead.f.b.a.a.6
            @Override // com.anythink.basead.ui.component.a.InterfaceC0055a
            public final j a() {
                return a.this.M();
            }

            @Override // com.anythink.basead.ui.component.a.InterfaceC0055a
            public final com.anythink.basead.d.a b() {
                OwnNativeATView ownNativeATView = a.this.f8997c;
                if (ownNativeATView != null) {
                    return ownNativeATView.getAdClickRecord(13);
                }
                return null;
            }
        };
        this.f9006m = new com.anythink.basead.j.e(bjVar, xVar);
    }

    private void N() {
        bj bjVar;
        x xVar;
        OwnNativeATView ownNativeATView = this.f8997c;
        if (ownNativeATView == null || (bjVar = this.f9038s) == null || (xVar = this.f9039t) == null) {
            return;
        }
        this.f9002h = new AnonymousClass10(ownNativeATView, bjVar, xVar, this.f9040u ? 5 : 6, new AnonymousClass9());
        this.f9005l.put(g.a.f11325c, this.f9041v);
        this.f9002h.a(this.f9005l);
        this.f8997c.setLifeCallback(new AnonymousClass11());
        com.anythink.basead.ui.a aVar = this.f8999e;
        if (aVar != null) {
            aVar.setATImproveClickViewController(this.f9002h);
        }
        if (this.f8995a) {
            a(114);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final long C() {
        com.anythink.basead.ui.a aVar = this.f8999e;
        if (aVar != null) {
            return aVar.getVideoCurrentPosition();
        }
        return 0L;
    }

    public final OwnNativeATView G() {
        OwnNativeATView ownNativeATView = this.f8997c;
        if (ownNativeATView != null) {
            ownNativeATView.releaseAllCallback();
            com.anythink.basead.j.e eVar = this.f9006m;
            if (eVar != null) {
                eVar.b();
                this.f9006m = null;
            }
        }
        OwnNativeATView ownNativeATView2 = new OwnNativeATView(this.f9037r);
        ownNativeATView2.setClickRecordHelper(this.i);
        this.f8994E = false;
        return ownNativeATView2;
    }

    @Override // com.anythink.basead.f.b.a.d
    public View H() {
        return this.f8997c;
    }

    public void I() {
        if (this.f8995a) {
            return;
        }
        this.f8995a = true;
        bj bjVar = this.f9038s;
        if (bjVar != null && bjVar.ay()) {
            com.anythink.core.common.u.e.c(this.f9038s, this.f9039t, 3);
            this.f8996b = true;
            return;
        }
        if (this.f9038s instanceof bi) {
            com.anythink.basead.f.f.c a9 = com.anythink.basead.f.f.c.a();
            Context context = this.f9037r;
            x xVar = this.f9039t;
            a9.a(context, com.anythink.basead.f.f.c.a(xVar.f14313b, xVar.f14314c), this.f9038s, this.f9039t.f14325o);
        }
        if (H() != null) {
            com.anythink.basead.b.b.a(8, this.f9038s, M());
            com.anythink.basead.g.a aVar = this.f9041v;
            if (aVar != null) {
                com.anythink.basead.g.j jVar = new com.anythink.basead.g.j();
                jVar.f9143e = this.f9039t.f14325o.bi();
                aVar.onAdShow(jVar);
            }
        }
        a(114);
        bj bjVar2 = this.f9038s;
        if (bjVar2 == null || !bjVar2.ae()) {
            return;
        }
        this.f9010q = new AnonymousClass8(bjVar2);
        com.anythink.basead.b.a().addDataFetchListener(this.f9010q);
    }

    public List<View> J() {
        return null;
    }

    public void K() {
    }

    public abstract View L();

    public final void a(View view, boolean z8) {
        WeakReference<View> weakReference = this.f8998d;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null && view == view2) {
            a(view, 1, 1, z8);
        } else if (J() == null || !J().contains(view)) {
            a(view, 1, 2, z8);
        } else {
            a(view, 1, 3, z8);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void b(boolean z8) {
        super.b(z8);
        com.anythink.basead.ui.a aVar = this.f8999e;
        if (aVar != null) {
            aVar.setIsMuted(z8);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void q() {
        super.q();
        com.anythink.core.common.v.a.c cVar = this.f9003j;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public void r() {
        super.r();
        a(112);
        OwnNativeATView ownNativeATView = this.f8997c;
        if (ownNativeATView != null) {
            ownNativeATView.releaseAllCallback();
        }
        this.f8997c = null;
        this.f8998d = null;
        com.anythink.basead.j.e eVar = this.f9006m;
        if (eVar != null) {
            eVar.b();
        }
        com.anythink.basead.b.c cVar = this.f9001g;
        if (cVar != null) {
            cVar.d();
            this.f9001g = null;
        }
        if (this.f9010q != null) {
            com.anythink.basead.b.a().removeDataFetchListener(this.f9010q);
        }
        com.anythink.basead.ui.a aVar = this.f8999e;
        if (aVar != null) {
            aVar.destroyPlayerView(3);
        }
        com.anythink.core.common.v.a.c cVar2 = this.f9003j;
        if (cVar2 != null) {
            cVar2.b();
            this.f9003j = null;
        }
        com.anythink.core.common.v.a.c cVar3 = this.f9004k;
        if (cVar3 != null) {
            cVar3.b();
            this.f9004k = null;
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void u() {
        super.u();
        com.anythink.basead.ui.a aVar = this.f8999e;
        if (aVar != null) {
            aVar.resumeVideo();
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void v() {
        super.v();
        com.anythink.basead.ui.a aVar = this.f8999e;
        if (aVar != null) {
            aVar.pauseVideo();
        }
    }

    public final void a(View view, int i, int i4) {
        a(view, i, i4, false);
    }

    private void a(View view, final int i, final int i4, boolean z8) {
        if (this.f8997c != null) {
            I();
            if (this.f9001g == null) {
                this.f9001g = new com.anythink.basead.b.c(t.b().g(), this.f9039t, this.f9038s, this.f8997c);
            }
            if (this.f9001g.a()) {
                return;
            }
            if (this.f9038s.ae() && ((i4 == 1 || i4 == 6) && this.f9038s.aa() == 4 && this.f9039t.f14325o.aO())) {
                com.anythink.basead.b.a().pause(this.f9038s);
                return;
            }
            this.f9001g.a(new c.a() { // from class: com.anythink.basead.f.b.a.a.5
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
                    if (a.this.f8996b) {
                        return;
                    }
                    bj bjVar = a.this.f9038s;
                    if (bjVar != null && bjVar.ay()) {
                        if (a.this.f9038s.r() == null || a.this.f9038s.r().bN() != 2) {
                            a aVar = a.this;
                            com.anythink.core.common.u.e.c(aVar.f9038s, aVar.f9039t, 1);
                            return;
                        } else {
                            a aVar2 = a.this;
                            com.anythink.core.common.u.e.c(aVar2.f9038s, aVar2.f9039t, 2);
                        }
                    }
                    com.anythink.basead.g.a aVar3 = a.this.f9041v;
                    if (aVar3 != null) {
                        com.anythink.basead.g.j a9 = new com.anythink.basead.g.j().a(i, i4);
                        a9.f9143e = a.this.f9039t.f14325o.bi();
                        aVar3.onAdClick(a9);
                    }
                }

                @Override // com.anythink.basead.b.c.a
                public final void a(boolean z9) {
                    com.anythink.basead.g.a aVar;
                    if (a.this.f8996b) {
                        return;
                    }
                    bj bjVar = a.this.f9038s;
                    if ((bjVar == null || !bjVar.ay() || a.this.f9038s.r() == null || a.this.f9038s.r().bN() == 2) && (aVar = a.this.f9041v) != null) {
                        aVar.onDeeplinkCallback(z9);
                    }
                }
            });
            j M8 = M();
            if (i == 1) {
                OwnNativeATView ownNativeATView = this.f8997c;
                M8.i = ownNativeATView != null ? ownNativeATView.getAdClickRecord(i4) : null;
            } else {
                com.anythink.basead.ui.f.c cVar = this.i;
                M8.i = cVar != null ? cVar.a(view, i, i4) : null;
            }
            if (z8) {
                M8.f6374m = true;
            }
            this.f9001g.a(M8);
            if (this.f9002h != null) {
                HashMap hashMap = new HashMap();
                com.anythink.basead.b.c.i.y(i, hashMap, "click_type", i4, g.a.f11329g);
                this.f9002h.a(hashMap);
            }
            a(113);
        }
    }

    @Override // com.anythink.basead.f.a
    public void a(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
        bj bjVar;
        x xVar;
        if (this.f8997c == null || this.f8994E) {
            return;
        }
        int i = 1;
        this.f8994E = true;
        com.anythink.basead.j.e eVar = this.f9006m;
        if (eVar != null && view2 != null) {
            eVar.a(view2);
        }
        if (!this.f8995a && this.f9004k == null) {
            com.anythink.core.common.v.a.a aVar = new com.anythink.core.common.v.a.a() { // from class: com.anythink.basead.f.b.a.a.7
                @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
                public final int getImpressionMinPercentageViewed() {
                    return 25;
                }

                @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
                public final void recordImpression(View view3) {
                    a aVar2 = a.this;
                    if (aVar2.f9035D == 0) {
                        aVar2.f9035D = System.currentTimeMillis();
                    }
                    a.this.a(BaseATView.a.f9961z);
                }
            };
            bj bjVar2 = this.f9038s;
            if (bjVar2 != null && bjVar2.r() != null) {
                i = this.f9038s.r().bO();
            }
            view.getContext();
            com.anythink.core.common.v.a.c cVar = new com.anythink.core.common.v.a.c(i, 0);
            this.f9004k = cVar;
            cVar.a(view, aVar);
        }
        bj bjVar3 = this.f9038s;
        if (bjVar3 != null && !bjVar3.n()) {
            a(view);
            if (list != null && list.size() > 0) {
                for (View view3 : list) {
                    if (view3 != null) {
                        view3.setOnClickListener(this.f9007n);
                    }
                }
            } else {
                a(view, this.f9007n);
            }
            if (list2 != null && list2.size() > 0) {
                for (View view4 : list2) {
                    if (view4 != null) {
                        view4.setOnClickListener(this.f9008o);
                    }
                }
            }
        }
        OwnNativeATView ownNativeATView = this.f8997c;
        if (ownNativeATView != null && (bjVar = this.f9038s) != null && (xVar = this.f9039t) != null) {
            this.f9002h = new AnonymousClass10(ownNativeATView, bjVar, xVar, this.f9040u ? 5 : 6, new AnonymousClass9());
            this.f9005l.put(g.a.f11325c, this.f9041v);
            this.f9002h.a(this.f9005l);
            this.f8997c.setLifeCallback(new AnonymousClass11());
            com.anythink.basead.ui.a aVar2 = this.f8999e;
            if (aVar2 != null) {
                aVar2.setATImproveClickViewController(this.f9002h);
            }
            if (this.f8995a) {
                a(114);
            }
        }
        L();
    }

    private void a(bj bjVar) {
        if (bjVar == null || !bjVar.ae()) {
            return;
        }
        this.f9010q = new AnonymousClass8(bjVar);
        com.anythink.basead.b.a().addDataFetchListener(this.f9010q);
    }

    public final void a(int i) {
        com.anythink.basead.ui.improveclick.a aVar = this.f9002h;
        if (aVar != null) {
            aVar.a(i);
        }
        com.anythink.basead.j.e eVar = this.f9006m;
        if (eVar != null) {
            eVar.a(i, this.f8997c);
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
        if (this.f9003j == null) {
            bj bjVar = this.f9038s;
            int bO = (bjVar == null || bjVar.r() == null) ? 1 : this.f9038s.r().bO();
            view.getContext();
            this.f9003j = new com.anythink.core.common.v.a.c(bO, this.f9039t.f14325o.ab() <= 0 ? 100 : this.f9039t.f14325o.ab());
        }
        this.f9003j.a(view, aVar);
    }

    public final void a(com.anythink.basead.ui.a aVar) {
        this.f8999e = aVar;
        aVar.initPlayerView(this.f9038s, this.f9039t, this.f9000f, this.f9006m);
        this.f8999e.setIsMuted(this.f9043x);
        this.f8999e.setAutoPlay(this.f9044y);
        this.f8999e.setVideoListener(this.f9042w);
        this.f8999e.setPlayerOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.f.b.a.a.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.f9007n.onClick(view);
            }
        });
    }
}
