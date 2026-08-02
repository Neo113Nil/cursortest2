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
    public final String f11454a;

    /* renamed from: b, reason: collision with root package name */
    Context f11455b;

    /* renamed from: c, reason: collision with root package name */
    x f11456c;

    /* renamed from: d, reason: collision with root package name */
    w f11457d;

    /* renamed from: e, reason: collision with root package name */
    int f11458e;

    /* renamed from: f, reason: collision with root package name */
    boolean f11459f;

    /* renamed from: g, reason: collision with root package name */
    com.anythink.basead.ui.improveclick.a f11460g;

    /* renamed from: h, reason: collision with root package name */
    BasePlayerView f11461h;
    BasePlayerView.a i;

    /* renamed from: j, reason: collision with root package name */
    InterfaceC0056a f11462j;

    /* renamed from: k, reason: collision with root package name */
    long f11463k;

    /* renamed from: l, reason: collision with root package name */
    long f11464l;

    /* renamed from: m, reason: collision with root package name */
    BasePlayerView.a f11465m;

    /* renamed from: n, reason: collision with root package name */
    ConcurrentHashMap<Integer, Boolean> f11466n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.basead.a.a f11467o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11468p;

    /* renamed from: q, reason: collision with root package name */
    private View f11469q;

    /* renamed from: r, reason: collision with root package name */
    private WTWebContainerView f11470r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f11471s;

    /* renamed from: com.anythink.basead.ui.component.a$a, reason: collision with other inner class name */
    public interface InterfaceC0056a {
        j a();

        com.anythink.basead.d.a b();
    }

    public a(View view, x xVar, w wVar) {
        this(view, xVar, wVar, m.f(view.getContext()));
    }

    private void q() {
        InterfaceC0056a interfaceC0056a = this.f11462j;
        if (interfaceC0056a != null) {
            com.anythink.basead.b.b.a(1, this.f11457d, interfaceC0056a.a());
        }
    }

    private void r() {
        InterfaceC0056a interfaceC0056a = this.f11462j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            com.anythink.basead.b.b.a(5, this.f11457d, a9);
            com.anythink.basead.b.b.a(31, this.f11457d, a9);
        }
    }

    private void s() {
        InterfaceC0056a interfaceC0056a = this.f11462j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.f7000j = d(false);
            com.anythink.basead.b.b.a(17, this.f11457d, a9);
        }
    }

    private void t() {
        InterfaceC0056a interfaceC0056a = this.f11462j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.i = this.f11462j.b();
            com.anythink.basead.b.b.a(14, this.f11457d, a9);
        }
    }

    private void u() {
        InterfaceC0056a interfaceC0056a = this.f11462j;
        if (interfaceC0056a != null) {
            com.anythink.basead.b.b.a(35, this.f11457d, interfaceC0056a.a());
        }
    }

    private void v() {
        InterfaceC0056a interfaceC0056a = this.f11462j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.i = this.f11462j.b();
            com.anythink.basead.b.b.a(16, this.f11457d, a9);
        }
    }

    private void w() {
        if (this.f11462j != null) {
            this.f11463k = System.currentTimeMillis();
            long currentPosition = this.f11461h.getCurrentPosition();
            this.f11464l = currentPosition;
            if (currentPosition != 0) {
                com.anythink.basead.b.b.a(15, this.f11457d, this.f11462j.a());
            }
        }
    }

    private void x() {
        InterfaceC0056a interfaceC0056a = this.f11462j;
        if (interfaceC0056a != null) {
            com.anythink.basead.b.b.a(11, this.f11457d, interfaceC0056a.a());
        }
    }

    private void y() {
        if (this.f11468p) {
            if (this.f11467o == null) {
                com.anythink.basead.a.a aVar = new com.anythink.basead.a.a();
                this.f11467o = aVar;
                aVar.a(this.f11455b);
            }
            this.f11467o.a();
        }
    }

    private void z() {
        com.anythink.basead.a.a aVar = this.f11467o;
        if (aVar != null) {
            aVar.b();
            this.f11467o = null;
        }
    }

    public final void a(int i) {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            basePlayerView.setViewType(i);
        }
    }

    public final void b(int i) {
        com.anythink.basead.ui.improveclick.a aVar = this.f11460g;
        if (aVar != null) {
            aVar.a(i);
        }
        if (this.f11470r != null) {
            com.anythink.basead.ui.improveclick.a aVar2 = this.f11460g;
            this.f11470r.notifyInnerAdEvent(i, aVar2 != null ? aVar2.b() : null);
        }
    }

    public final void c(int i) {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            basePlayerView.setVisibility(i);
        }
    }

    public final void d() {
        BasePlayerView basePlayerView;
        if (this.f11471s && (basePlayerView = this.f11461h) != null && basePlayerView.hasVideo()) {
            if (!this.f11461h.isPlaying()) {
                w();
            }
            this.f11461h.start();
            if (this.f11459f) {
                return;
            }
            y();
        }
    }

    public final void e() {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            if (basePlayerView.isPlaying()) {
                x();
            }
            this.f11461h.pause();
        }
    }

    public final boolean f() {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            return basePlayerView.isMute();
        }
        return false;
    }

    public final boolean g() {
        BasePlayerView basePlayerView = this.f11461h;
        return basePlayerView != null && (basePlayerView instanceof WebLandpagePlayerView);
    }

    public final long h() {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            return basePlayerView.getVideoLength();
        }
        return 0L;
    }

    public final long i() {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            return basePlayerView.getCurrentPosition();
        }
        return 0L;
    }

    public final boolean j() {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            return basePlayerView.isPlaying();
        }
        return false;
    }

    public final boolean k() {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            return basePlayerView.isPlayCompletion();
        }
        return false;
    }

    public final BasePlayerView l() {
        return this.f11461h;
    }

    public final View m() {
        return this.f11469q;
    }

    public final void n() {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            this.f11462j = null;
            this.f11460g = null;
            basePlayerView.setListener(this.f11465m);
            this.f11461h.rePlayVideo();
        }
    }

    public final void o() {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            basePlayerView.setNeedInterruptRelease(true);
        }
    }

    public final void p() {
        com.anythink.basead.a.a aVar = this.f11467o;
        if (aVar != null) {
            aVar.b();
            this.f11467o = null;
        }
    }

    public a(View view, x xVar, w wVar, int i) {
        boolean z6;
        View findViewById;
        this.f11454a = "a";
        this.f11471s = true;
        Context context = view.getContext();
        this.f11455b = context;
        this.f11456c = xVar;
        this.f11457d = wVar;
        this.f11458e = i;
        this.f11461h = (BasePlayerView) view.findViewById(q.a(context, "myoffer_player_view_id", "id"));
        w wVar2 = this.f11457d;
        x xVar2 = this.f11456c;
        if (xVar2 != null && wVar2 != null) {
            String valueOf = String.valueOf(xVar2.f14949j);
            valueOf.getClass();
            if (valueOf.equals("1")) {
                if (!TextUtils.isEmpty(wVar2.E())) {
                    z6 = true;
                }
            } else if (valueOf.equals("3")) {
                z6 = e.a(wVar2, xVar2);
            }
            this.f11468p = z6;
            findViewById = view.findViewById(q.a(this.f11455b, "myoffer_player_view_container_id", "id"));
            this.f11469q = findViewById;
            if (findViewById != null && (findViewById instanceof RoundCornerRelativeLayout)) {
                ((RoundCornerRelativeLayout) findViewById).setRadius(0);
            }
            this.f11471s = true;
        }
        z6 = false;
        this.f11468p = z6;
        findViewById = view.findViewById(q.a(this.f11455b, "myoffer_player_view_container_id", "id"));
        this.f11469q = findViewById;
        if (findViewById != null) {
            ((RoundCornerRelativeLayout) findViewById).setRadius(0);
        }
        this.f11471s = true;
    }

    private void g(int i) {
        InterfaceC0056a interfaceC0056a = this.f11462j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            if (i == 25) {
                com.anythink.basead.b.b.a(2, this.f11457d, a9);
            } else if (i == 50) {
                com.anythink.basead.b.b.a(3, this.f11457d, a9);
            } else {
                if (i != 75) {
                    return;
                }
                com.anythink.basead.b.b.a(4, this.f11457d, a9);
            }
        }
    }

    public final void a(BasePlayerView.a aVar) {
        this.i = aVar;
    }

    public final void c() {
        b(124);
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView == null || !basePlayerView.isPlaying()) {
            return;
        }
        this.f11461h.stop();
        this.f11461h.removeAllViews();
        InterfaceC0056a interfaceC0056a = this.f11462j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.i = this.f11462j.b();
            com.anythink.basead.b.b.a(16, this.f11457d, a9);
        }
    }

    public final void f(int i) {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            basePlayerView.release(i);
        }
    }

    public final void a(InterfaceC0056a interfaceC0056a) {
        this.f11462j = interfaceC0056a;
    }

    public final void a(com.anythink.basead.ui.improveclick.a aVar) {
        this.f11460g = aVar;
    }

    public final void e(int i) {
        BasePlayerView emptyAnimPlayer;
        if (this.f11461h != null) {
            Context context = this.f11455b;
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
            ViewGroup viewGroup = (ViewGroup) this.f11461h.getParent();
            viewGroup.addView(emptyAnimPlayer, viewGroup.indexOfChild(this.f11461h), this.f11461h.getLayoutParams());
            viewGroup.removeView(this.f11461h);
            this.f11461h = emptyAnimPlayer;
        }
    }

    public final void a(WTWebContainerView wTWebContainerView) {
        this.f11470r = wTWebContainerView;
    }

    public final BasePlayerView a(boolean z6, List<Bitmap> list, com.anythink.basead.j.e eVar) {
        this.f11459f = z6;
        if (this.f11461h != null) {
            BasePlayerView.a aVar = new BasePlayerView.a() { // from class: com.anythink.basead.ui.component.a.1
                @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
                public final void a() {
                    a.this.b(101);
                    a aVar2 = a.this;
                    com.anythink.basead.ui.improveclick.a aVar3 = aVar2.f11460g;
                    if (aVar3 != null) {
                        aVar3.a(aVar2.f11461h.getVideoLength());
                    }
                    a.this.f11463k = System.currentTimeMillis();
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
                    c.a().c(a.this.f11457d.E());
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
                    if (a.this.f11460g != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("video_length", Long.valueOf(j6));
                        a.this.f11460g.a(hashMap);
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
                    if (a.this.f11460g != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(g.a.f11961k, Long.valueOf(j6));
                        a.this.f11460g.a(hashMap);
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
                    if (a.this.f11460g != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(g.a.i, fVar.c());
                        a.this.f11460g.a(hashMap);
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
            this.f11465m = aVar;
            this.f11461h.setListener(aVar);
            this.f11461h.init(this.f11457d, this.f11456c, this.f11459f, list, eVar);
        }
        return this.f11461h;
    }

    public final void b() {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView == null || basePlayerView.getParent() == null) {
            return;
        }
        ((ViewGroup) this.f11461h.getParent()).removeView(this.f11461h);
        this.f11461h = null;
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
                    long i4 = a.this.i();
                    long h3 = a.this.h();
                    if (a.this.f11457d == null || (a9 = o.a().a(a.this.f11457d.E())) == null) {
                        j9 = 0;
                        j10 = 0;
                    } else {
                        long e9 = a9.e();
                        j10 = a9.d();
                        j9 = e9;
                    }
                    a aVar = a.this;
                    com.anythink.core.common.u.e.a(aVar.f11456c, aVar.f11457d, i, i4, j9, h3, j10);
                }
            }, 8);
        }
    }

    public final void b(boolean z6) {
        this.f11471s = z6;
        e();
    }

    public final void c(boolean z6) {
        if (!z6) {
            y();
        }
        this.f11459f = z6;
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null) {
            basePlayerView.setMute(z6);
        }
    }

    public static /* synthetic */ void b(a aVar) {
        InterfaceC0056a interfaceC0056a = aVar.f11462j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            com.anythink.basead.b.b.a(5, aVar.f11457d, a9);
            com.anythink.basead.b.b.a(31, aVar.f11457d, a9);
        }
    }

    public final k d(boolean z6) {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView != null && !basePlayerView.hasVideo()) {
            return null;
        }
        k kVar = new k();
        kVar.f7025l = this.f11458e == 2 ? 4 : 1;
        kVar.f7027r = 1;
        BasePlayerView basePlayerView2 = this.f11461h;
        kVar.f7017a = basePlayerView2 != null ? basePlayerView2.getVideoLength() / 1000 : 0L;
        kVar.f7018b = this.f11464l / 1000;
        BasePlayerView basePlayerView3 = this.f11461h;
        kVar.f7019c = basePlayerView3 != null ? basePlayerView3.getCurrentPosition() / 1000 : 0L;
        long j6 = this.f11464l;
        kVar.f7020d = j6 == 0 ? 1 : 0;
        kVar.f7026o = j6 == 0 ? 1 : 2;
        BasePlayerView basePlayerView4 = this.f11461h;
        kVar.f7021e = (basePlayerView4 == null || basePlayerView4.getCurrentPosition() != this.f11461h.getVideoLength()) ? 0 : 1;
        kVar.f7028u = z6 ? 0 : 2;
        kVar.f7022f = this.f11463k;
        kVar.f7023g = System.currentTimeMillis();
        BasePlayerView basePlayerView5 = this.f11461h;
        kVar.f7024h = basePlayerView5 != null ? basePlayerView5.getCurrentPosition() : 0L;
        kVar.toString();
        return kVar;
    }

    public final boolean a() {
        BasePlayerView basePlayerView = this.f11461h;
        return (basePlayerView == null || basePlayerView.getParent() == null || !(this.f11461h.getParent() instanceof ViewGroup)) ? false : true;
    }

    public final void a(boolean z6) {
        if (z6) {
            this.f11471s = z6;
        }
        d();
    }

    public static /* synthetic */ void c(a aVar) {
        InterfaceC0056a interfaceC0056a = aVar.f11462j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.f7000j = aVar.d(false);
            com.anythink.basead.b.b.a(17, aVar.f11457d, a9);
        }
    }

    public final void a(int i, int i4, Intent intent) {
        if (g()) {
            ((WebLandpagePlayerView) this.f11461h).onActivityResult(i, i4, intent);
        }
    }

    public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        BasePlayerView basePlayerView = this.f11461h;
        if (basePlayerView == null || !(basePlayerView instanceof WebLandpagePlayerView)) {
            return false;
        }
        return ((WebLandpagePlayerView) basePlayerView).openInternalWebView(str, iOfferClickHandler);
    }

    private void a(long j6) {
        bl aH;
        Map<Integer, String[]> z6;
        w wVar = this.f11457d;
        if (!(wVar instanceof bj) || (aH = ((bj) wVar).aH()) == null || (z6 = aH.z()) == null || z6.size() <= 0) {
            return;
        }
        if (this.f11466n == null) {
            this.f11466n = new ConcurrentHashMap<>();
        }
        long j9 = j6 / 1000;
        for (Integer num : z6.keySet()) {
            if (this.f11466n.get(num) == null || !this.f11466n.get(num).booleanValue()) {
                if (j9 >= num.intValue() && this.f11462j != null) {
                    this.f11466n.put(num, Boolean.TRUE);
                    j a9 = this.f11462j.a();
                    a9.f7000j.i = num.intValue();
                    com.anythink.basead.b.b.a(32, this.f11457d, a9);
                }
            }
        }
    }

    private void e(boolean z6) {
        InterfaceC0056a interfaceC0056a = this.f11462j;
        if (interfaceC0056a != null) {
            if (z6) {
                j a9 = interfaceC0056a.a();
                a9.i = this.f11462j.b();
                com.anythink.basead.b.b.a(12, this.f11457d, a9);
            } else {
                j a10 = interfaceC0056a.a();
                a10.i = this.f11462j.b();
                com.anythink.basead.b.b.a(13, this.f11457d, a10);
            }
        }
    }

    public static /* synthetic */ void d(a aVar) {
        InterfaceC0056a interfaceC0056a = aVar.f11462j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            a9.i = aVar.f11462j.b();
            com.anythink.basead.b.b.a(14, aVar.f11457d, a9);
        }
    }

    public static /* synthetic */ void e(a aVar) {
        InterfaceC0056a interfaceC0056a = aVar.f11462j;
        if (interfaceC0056a != null) {
            com.anythink.basead.b.b.a(35, aVar.f11457d, interfaceC0056a.a());
        }
    }

    public static /* synthetic */ void a(a aVar) {
        InterfaceC0056a interfaceC0056a = aVar.f11462j;
        if (interfaceC0056a != null) {
            com.anythink.basead.b.b.a(1, aVar.f11457d, interfaceC0056a.a());
        }
    }

    public static /* synthetic */ void a(a aVar, long j6) {
        bl aH;
        Map<Integer, String[]> z6;
        w wVar = aVar.f11457d;
        if (!(wVar instanceof bj) || (aH = ((bj) wVar).aH()) == null || (z6 = aH.z()) == null || z6.size() <= 0) {
            return;
        }
        if (aVar.f11466n == null) {
            aVar.f11466n = new ConcurrentHashMap<>();
        }
        long j9 = j6 / 1000;
        for (Integer num : z6.keySet()) {
            if (aVar.f11466n.get(num) == null || !aVar.f11466n.get(num).booleanValue()) {
                if (j9 >= num.intValue() && aVar.f11462j != null) {
                    aVar.f11466n.put(num, Boolean.TRUE);
                    j a9 = aVar.f11462j.a();
                    a9.f7000j.i = num.intValue();
                    com.anythink.basead.b.b.a(32, aVar.f11457d, a9);
                }
            }
        }
    }

    public static /* synthetic */ void a(a aVar, int i) {
        InterfaceC0056a interfaceC0056a = aVar.f11462j;
        if (interfaceC0056a != null) {
            j a9 = interfaceC0056a.a();
            if (i == 25) {
                com.anythink.basead.b.b.a(2, aVar.f11457d, a9);
            } else if (i == 50) {
                com.anythink.basead.b.b.a(3, aVar.f11457d, a9);
            } else {
                if (i != 75) {
                    return;
                }
                com.anythink.basead.b.b.a(4, aVar.f11457d, a9);
            }
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z6) {
        InterfaceC0056a interfaceC0056a = aVar.f11462j;
        if (interfaceC0056a != null) {
            if (z6) {
                j a9 = interfaceC0056a.a();
                a9.i = aVar.f11462j.b();
                com.anythink.basead.b.b.a(12, aVar.f11457d, a9);
            } else {
                j a10 = interfaceC0056a.a();
                a10.i = aVar.f11462j.b();
                com.anythink.basead.b.b.a(13, aVar.f11457d, a10);
            }
        }
    }
}
