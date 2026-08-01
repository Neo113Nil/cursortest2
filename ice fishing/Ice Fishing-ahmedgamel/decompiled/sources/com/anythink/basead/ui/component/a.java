package com.anythink.basead.ui.component;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.b.e;
import com.anythink.basead.d.f;
import com.anythink.basead.d.j;
import com.anythink.basead.d.k;
import com.anythink.basead.ui.RoundCornerRelativeLayout;
import com.anythink.basead.ui.animplayerview.AlbumScaleAnimPlayerView;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.basead.ui.animplayerview.EmptyAnimPlayer;
import com.anythink.basead.ui.animplayerview.GuideToClickAnimPlayerView;
import com.anythink.basead.ui.animplayerview.RedPacketAnimPlayerView;
import com.anythink.basead.ui.animplayerview.ViewPagerAnimPlayerView;
import com.anythink.basead.ui.animplayerview.WebLandpagePlayerView;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.basead.webtemplet.WTWebContainerView;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.a.n;
import com.anythink.core.common.a.o;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.bl;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b.c;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10668a;

    /* renamed from: b, reason: collision with root package name */
    Context f10669b;

    /* renamed from: c, reason: collision with root package name */
    x f10670c;

    /* renamed from: d, reason: collision with root package name */
    w f10671d;

    /* renamed from: e, reason: collision with root package name */
    int f10672e;

    /* renamed from: f, reason: collision with root package name */
    boolean f10673f;

    /* renamed from: g, reason: collision with root package name */
    com.anythink.basead.ui.improveclick.a f10674g;

    /* renamed from: h, reason: collision with root package name */
    BasePlayerView f10675h;
    BasePlayerView.a i;

    /* renamed from: j, reason: collision with root package name */
    InterfaceC0056a f10676j;

    /* renamed from: k, reason: collision with root package name */
    long f10677k;

    /* renamed from: l, reason: collision with root package name */
    long f10678l;

    /* renamed from: m, reason: collision with root package name */
    BasePlayerView.a f10679m;

    /* renamed from: n, reason: collision with root package name */
    ConcurrentHashMap<Integer, Boolean> f10680n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.basead.a.a f10681o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10682p;

    /* renamed from: q, reason: collision with root package name */
    private View f10683q;

    /* renamed from: r, reason: collision with root package name */
    private WTWebContainerView f10684r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f10685s;

    /* renamed from: com.anythink.basead.ui.component.a$a, reason: collision with other inner class name */
    public interface InterfaceC0056a {
        j a();

        com.anythink.basead.d.a b();
    }

    public a(View view, x xVar, w wVar) {
        this(view, xVar, wVar, m.f(view.getContext()));
    }

    private void q() {
        InterfaceC0056a interfaceC0056a = this.f10676j;
        if (interfaceC0056a != null) {
            com.anythink.basead.b.b.a(1, this.f10671d, interfaceC0056a.a());
        }
    }

    private void r() {
        InterfaceC0056a interfaceC0056a = this.f10676j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            com.anythink.basead.b.b.a(5, this.f10671d, a9);
            com.anythink.basead.b.b.a(31, this.f10671d, a9);
        }
    }

    private void s() {
        InterfaceC0056a interfaceC0056a = this.f10676j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.f6214j = d(false);
            com.anythink.basead.b.b.a(17, this.f10671d, a9);
        }
    }

    private void t() {
        InterfaceC0056a interfaceC0056a = this.f10676j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.i = this.f10676j.b();
            com.anythink.basead.b.b.a(14, this.f10671d, a9);
        }
    }

    private void u() {
        InterfaceC0056a interfaceC0056a = this.f10676j;
        if (interfaceC0056a != null) {
            com.anythink.basead.b.b.a(35, this.f10671d, interfaceC0056a.a());
        }
    }

    private void v() {
        InterfaceC0056a interfaceC0056a = this.f10676j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.i = this.f10676j.b();
            com.anythink.basead.b.b.a(16, this.f10671d, a9);
        }
    }

    private void w() {
        if (this.f10676j != null) {
            this.f10677k = System.currentTimeMillis();
            long currentPosition = this.f10675h.getCurrentPosition();
            this.f10678l = currentPosition;
            if (currentPosition != 0) {
                com.anythink.basead.b.b.a(15, this.f10671d, this.f10676j.a());
            }
        }
    }

    private void x() {
        InterfaceC0056a interfaceC0056a = this.f10676j;
        if (interfaceC0056a != null) {
            com.anythink.basead.b.b.a(11, this.f10671d, interfaceC0056a.a());
        }
    }

    private void y() {
        if (this.f10682p) {
            if (this.f10681o == null) {
                com.anythink.basead.a.a aVar = new com.anythink.basead.a.a();
                this.f10681o = aVar;
                aVar.a(this.f10669b);
            }
            this.f10681o.a();
        }
    }

    private void z() {
        com.anythink.basead.a.a aVar = this.f10681o;
        if (aVar != null) {
            aVar.b();
            this.f10681o = null;
        }
    }

    public final void a(int i) {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            basePlayerView.setViewType(i);
        }
    }

    public final void b(int i) {
        com.anythink.basead.ui.improveclick.a aVar = this.f10674g;
        if (aVar != null) {
            aVar.a(i);
        }
        if (this.f10684r != null) {
            com.anythink.basead.ui.improveclick.a aVar2 = this.f10674g;
            this.f10684r.notifyInnerAdEvent(i, aVar2 != null ? aVar2.b() : null);
        }
    }

    public final void c(int i) {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            basePlayerView.setVisibility(i);
        }
    }

    public final void d() {
        BasePlayerView basePlayerView;
        if (this.f10685s && (basePlayerView = this.f10675h) != null && basePlayerView.hasVideo()) {
            if (!this.f10675h.isPlaying()) {
                w();
            }
            this.f10675h.start();
            if (this.f10673f) {
                return;
            }
            y();
        }
    }

    public final void e() {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            if (basePlayerView.isPlaying()) {
                x();
            }
            this.f10675h.pause();
        }
    }

    public final boolean f() {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            return basePlayerView.isMute();
        }
        return false;
    }

    public final boolean g() {
        BasePlayerView basePlayerView = this.f10675h;
        return basePlayerView != null && (basePlayerView instanceof WebLandpagePlayerView);
    }

    public final long h() {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            return basePlayerView.getVideoLength();
        }
        return 0L;
    }

    public final long i() {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            return basePlayerView.getCurrentPosition();
        }
        return 0L;
    }

    public final boolean j() {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            return basePlayerView.isPlaying();
        }
        return false;
    }

    public final boolean k() {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            return basePlayerView.isPlayCompletion();
        }
        return false;
    }

    public final BasePlayerView l() {
        return this.f10675h;
    }

    public final View m() {
        return this.f10683q;
    }

    public final void n() {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            this.f10676j = null;
            this.f10674g = null;
            basePlayerView.setListener(this.f10679m);
            this.f10675h.rePlayVideo();
        }
    }

    public final void o() {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            basePlayerView.setNeedInterruptRelease(true);
        }
    }

    public final void p() {
        com.anythink.basead.a.a aVar = this.f10681o;
        if (aVar != null) {
            aVar.b();
            this.f10681o = null;
        }
    }

    public a(View view, x xVar, w wVar, int i) {
        boolean z3;
        View findViewById;
        this.f10668a = "a";
        this.f10685s = true;
        Context context = view.getContext();
        this.f10669b = context;
        this.f10670c = xVar;
        this.f10671d = wVar;
        this.f10672e = i;
        this.f10675h = (BasePlayerView) view.findViewById(q.a(context, "myoffer_player_view_id", "id"));
        w wVar2 = this.f10671d;
        x xVar2 = this.f10670c;
        if (xVar2 != null && wVar2 != null) {
            String valueOf = String.valueOf(xVar2.f14163j);
            valueOf.getClass();
            if (valueOf.equals("1")) {
                if (!TextUtils.isEmpty(wVar2.E())) {
                    z3 = true;
                }
            } else if (valueOf.equals("3")) {
                z3 = e.a(wVar2, xVar2);
            }
            this.f10682p = z3;
            findViewById = view.findViewById(q.a(this.f10669b, "myoffer_player_view_container_id", "id"));
            this.f10683q = findViewById;
            if (findViewById != null && (findViewById instanceof RoundCornerRelativeLayout)) {
                ((RoundCornerRelativeLayout) findViewById).setRadius(0);
            }
            this.f10685s = true;
        }
        z3 = false;
        this.f10682p = z3;
        findViewById = view.findViewById(q.a(this.f10669b, "myoffer_player_view_container_id", "id"));
        this.f10683q = findViewById;
        if (findViewById != null) {
            ((RoundCornerRelativeLayout) findViewById).setRadius(0);
        }
        this.f10685s = true;
    }

    private void g(int i) {
        InterfaceC0056a interfaceC0056a = this.f10676j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            if (i == 25) {
                com.anythink.basead.b.b.a(2, this.f10671d, a9);
            } else if (i == 50) {
                com.anythink.basead.b.b.a(3, this.f10671d, a9);
            } else {
                if (i != 75) {
                    return;
                }
                com.anythink.basead.b.b.a(4, this.f10671d, a9);
            }
        }
    }

    public final void a(BasePlayerView.a aVar) {
        this.i = aVar;
    }

    public final void c() {
        b(124);
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView == null || !basePlayerView.isPlaying()) {
            return;
        }
        this.f10675h.stop();
        this.f10675h.removeAllViews();
        InterfaceC0056a interfaceC0056a = this.f10676j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.i = this.f10676j.b();
            com.anythink.basead.b.b.a(16, this.f10671d, a9);
        }
    }

    public final void f(int i) {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            basePlayerView.release(i);
        }
    }

    public final void a(InterfaceC0056a interfaceC0056a) {
        this.f10676j = interfaceC0056a;
    }

    public final void a(com.anythink.basead.ui.improveclick.a aVar) {
        this.f10674g = aVar;
    }

    public final void e(int i) {
        BasePlayerView emptyAnimPlayer;
        if (this.f10675h != null) {
            Context context = this.f10669b;
            if (i == 1) {
                emptyAnimPlayer = new EmptyAnimPlayer(context);
            } else if (i == 2) {
                emptyAnimPlayer = new GuideToClickAnimPlayerView(context);
            } else if (i == 3) {
                emptyAnimPlayer = new RedPacketAnimPlayerView(context);
            } else if (i == 4) {
                emptyAnimPlayer = new ViewPagerAnimPlayerView(context);
            } else if (i == 5) {
                emptyAnimPlayer = new AlbumScaleAnimPlayerView(context);
            } else if (i != 101) {
                emptyAnimPlayer = new EmptyAnimPlayer(context);
            } else {
                emptyAnimPlayer = new WebLandpagePlayerView(context);
            }
            emptyAnimPlayer.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f10675h.getParent();
            viewGroup.addView(emptyAnimPlayer, viewGroup.indexOfChild(this.f10675h), this.f10675h.getLayoutParams());
            viewGroup.removeView(this.f10675h);
            this.f10675h = emptyAnimPlayer;
        }
    }

    public final void a(WTWebContainerView wTWebContainerView) {
        this.f10684r = wTWebContainerView;
    }

    public final BasePlayerView a(boolean z3, List<Bitmap> list, com.anythink.basead.j.e eVar) {
        this.f10673f = z3;
        if (this.f10675h != null) {
            BasePlayerView.a aVar = new BasePlayerView.a() { // from class: com.anythink.basead.ui.component.a.1
                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void a() {
                    a.this.b(101);
                    a aVar2 = a.this;
                    com.anythink.basead.ui.improveclick.a aVar3 = aVar2.f10674g;
                    if (aVar3 != null) {
                        aVar3.a(aVar2.f10675h.getVideoLength());
                    }
                    a.this.f10677k = System.currentTimeMillis();
                    a.a(a.this);
                    BasePlayerView.a aVar4 = a.this.i;
                    if (aVar4 != null) {
                        aVar4.a();
                        a.this.i.a(0L);
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void b() {
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void c() {
                    a.this.b(107);
                    a.b(a.this);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.c();
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void d() {
                    a.a(a.this, true);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.d();
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void e() {
                    a.a(a.this, false);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.e();
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void f() {
                    c.a().c(a.this.f10671d.E());
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.f();
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void b(int i) {
                    a.d(a.this);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.b(i);
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void b(long j6) {
                    if (a.this.f10674g != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("video_length", Long.valueOf(j6));
                        a.this.f10674g.a(hashMap);
                    }
                    a.this.b(123);
                    a.e(a.this);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.b(j6);
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void a(long j6) {
                    if (a.this.f10674g != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(g.a.f11175k, Long.valueOf(j6));
                        a.this.f10674g.a(hashMap);
                    }
                    a.this.b(125);
                    a.a(a.this, j6);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.a(j6);
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void a(f fVar) {
                    fVar.c();
                    if (a.this.f10674g != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(g.a.i, fVar.c());
                        a.this.f10674g.a(hashMap);
                    }
                    a.this.b(108);
                    a.c(a.this);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.a(fVar);
                    }
                }

                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void a(int i) {
                    a.a(a.this, i);
                    BasePlayerView.a aVar2 = a.this.i;
                    if (aVar2 != null) {
                        aVar2.a(i);
                    }
                }
            };
            this.f10679m = aVar;
            this.f10675h.setListener(aVar);
            this.f10675h.init(this.f10671d, this.f10670c, this.f10673f, list, eVar);
        }
        return this.f10675h;
    }

    public final void b() {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView == null || basePlayerView.getParent() == null) {
            return;
        }
        ((ViewGroup) this.f10675h.getParent()).removeView(this.f10675h);
        this.f10675h = null;
    }

    public final void d(final int i) {
        boolean j6 = j();
        e();
        if (j6) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.ui.component.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    long j9;
                    long j10;
                    n a9;
                    long i6 = a.this.i();
                    long h9 = a.this.h();
                    if (a.this.f10671d == null || (a9 = o.a().a(a.this.f10671d.E())) == null) {
                        j9 = 0;
                        j10 = 0;
                    } else {
                        long e9 = a9.e();
                        j10 = a9.d();
                        j9 = e9;
                    }
                    a aVar = a.this;
                    com.anythink.core.common.u.e.a(aVar.f10670c, aVar.f10671d, i, i6, j9, h9, j10);
                }
            }, 8);
        }
    }

    public final void b(boolean z3) {
        this.f10685s = z3;
        e();
    }

    public final void c(boolean z3) {
        if (!z3) {
            y();
        }
        this.f10673f = z3;
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null) {
            basePlayerView.setMute(z3);
        }
    }

    public static /* synthetic */ void b(a aVar) {
        InterfaceC0056a interfaceC0056a = aVar.f10676j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            com.anythink.basead.b.b.a(5, aVar.f10671d, a9);
            com.anythink.basead.b.b.a(31, aVar.f10671d, a9);
        }
    }

    public final k d(boolean z3) {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView != null && !basePlayerView.hasVideo()) {
            return null;
        }
        k kVar = new k();
        kVar.f6239l = this.f10672e == 2 ? 4 : 1;
        kVar.f6241r = 1;
        BasePlayerView basePlayerView2 = this.f10675h;
        kVar.f6231a = basePlayerView2 != null ? basePlayerView2.getVideoLength() / 1000 : 0L;
        kVar.f6232b = this.f10678l / 1000;
        BasePlayerView basePlayerView3 = this.f10675h;
        kVar.f6233c = basePlayerView3 != null ? basePlayerView3.getCurrentPosition() / 1000 : 0L;
        long j6 = this.f10678l;
        kVar.f6234d = j6 == 0 ? 1 : 0;
        kVar.f6240o = j6 == 0 ? 1 : 2;
        BasePlayerView basePlayerView4 = this.f10675h;
        kVar.f6235e = (basePlayerView4 == null || basePlayerView4.getCurrentPosition() != this.f10675h.getVideoLength()) ? 0 : 1;
        kVar.f6242u = z3 ? 0 : 2;
        kVar.f6236f = this.f10677k;
        kVar.f6237g = System.currentTimeMillis();
        BasePlayerView basePlayerView5 = this.f10675h;
        kVar.f6238h = basePlayerView5 != null ? basePlayerView5.getCurrentPosition() : 0L;
        kVar.toString();
        return kVar;
    }

    public final boolean a() {
        BasePlayerView basePlayerView = this.f10675h;
        return (basePlayerView == null || basePlayerView.getParent() == null || !(this.f10675h.getParent() instanceof ViewGroup)) ? false : true;
    }

    public final void a(boolean z3) {
        if (z3) {
            this.f10685s = z3;
        }
        d();
    }

    public static /* synthetic */ void c(a aVar) {
        InterfaceC0056a interfaceC0056a = aVar.f10676j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.f6214j = aVar.d(false);
            com.anythink.basead.b.b.a(17, aVar.f10671d, a9);
        }
    }

    public final void a(int i, int i6, Intent intent) {
        if (g()) {
            ((WebLandpagePlayerView) this.f10675h).onActivityResult(i, i6, intent);
        }
    }

    public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        BasePlayerView basePlayerView = this.f10675h;
        if (basePlayerView == null || !(basePlayerView instanceof WebLandpagePlayerView)) {
            return false;
        }
        return ((WebLandpagePlayerView) basePlayerView).openInternalWebView(str, iOfferClickHandler);
    }

    private void a(long j6) {
        bl aH;
        Map<Integer, String[]> z3;
        w wVar = this.f10671d;
        if (!(wVar instanceof bj) || (aH = ((bj) wVar).aH()) == null || (z3 = aH.z()) == null || z3.size() <= 0) {
            return;
        }
        if (this.f10680n == null) {
            this.f10680n = new ConcurrentHashMap<>();
        }
        long j9 = j6 / 1000;
        for (Integer num : z3.keySet()) {
            if (this.f10680n.get(num) == null || !this.f10680n.get(num).booleanValue()) {
                if (j9 >= num.intValue() && this.f10676j != null) {
                    this.f10680n.put(num, Boolean.TRUE);
                    j a9 = this.f10676j.a();
                    a9.f6214j.i = num.intValue();
                    com.anythink.basead.b.b.a(32, this.f10671d, a9);
                }
            }
        }
    }

    private void e(boolean z3) {
        InterfaceC0056a interfaceC0056a = this.f10676j;
        if (interfaceC0056a != null) {
            if (z3) {
                j a9 = interfaceC0056a.a();
                a9.i = this.f10676j.b();
                com.anythink.basead.b.b.a(12, this.f10671d, a9);
            } else {
                j a10 = interfaceC0056a.a();
                a10.i = this.f10676j.b();
                com.anythink.basead.b.b.a(13, this.f10671d, a10);
            }
        }
    }

    public static /* synthetic */ void d(a aVar) {
        InterfaceC0056a interfaceC0056a = aVar.f10676j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.i = aVar.f10676j.b();
            com.anythink.basead.b.b.a(14, aVar.f10671d, a9);
        }
    }

    public static /* synthetic */ void e(a aVar) {
        InterfaceC0056a interfaceC0056a = aVar.f10676j;
        if (interfaceC0056a != null) {
            com.anythink.basead.b.b.a(35, aVar.f10671d, interfaceC0056a.a());
        }
    }

    public static /* synthetic */ void a(a aVar) {
        InterfaceC0056a interfaceC0056a = aVar.f10676j;
        if (interfaceC0056a != null) {
            com.anythink.basead.b.b.a(1, aVar.f10671d, interfaceC0056a.a());
        }
    }

    public static /* synthetic */ void a(a aVar, long j6) {
        bl aH;
        Map<Integer, String[]> z3;
        w wVar = aVar.f10671d;
        if (!(wVar instanceof bj) || (aH = ((bj) wVar).aH()) == null || (z3 = aH.z()) == null || z3.size() <= 0) {
            return;
        }
        if (aVar.f10680n == null) {
            aVar.f10680n = new ConcurrentHashMap<>();
        }
        long j9 = j6 / 1000;
        for (Integer num : z3.keySet()) {
            if (aVar.f10680n.get(num) == null || !aVar.f10680n.get(num).booleanValue()) {
                if (j9 >= num.intValue() && aVar.f10676j != null) {
                    aVar.f10680n.put(num, Boolean.TRUE);
                    j a9 = aVar.f10676j.a();
                    a9.f6214j.i = num.intValue();
                    com.anythink.basead.b.b.a(32, aVar.f10671d, a9);
                }
            }
        }
    }

    public static /* synthetic */ void a(a aVar, int i) {
        InterfaceC0056a interfaceC0056a = aVar.f10676j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            if (i == 25) {
                com.anythink.basead.b.b.a(2, aVar.f10671d, a9);
            } else if (i == 50) {
                com.anythink.basead.b.b.a(3, aVar.f10671d, a9);
            } else {
                if (i != 75) {
                    return;
                }
                com.anythink.basead.b.b.a(4, aVar.f10671d, a9);
            }
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z3) {
        InterfaceC0056a interfaceC0056a = aVar.f10676j;
        if (interfaceC0056a != null) {
            if (z3) {
                j a9 = interfaceC0056a.a();
                a9.i = aVar.f10676j.b();
                com.anythink.basead.b.b.a(12, aVar.f10671d, a9);
            } else {
                j a10 = interfaceC0056a.a();
                a10.i = aVar.f10676j.b();
                com.anythink.basead.b.b.a(13, aVar.f10671d, a10);
            }
        }
    }
}
