package com.anythink.expressad.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.b.c;
import com.anythink.basead.d.g;
import com.anythink.basead.f.c.d;
import com.anythink.basead.g.j;
import com.anythink.basead.g.k;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.n;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.out.e;
import com.anythink.expressad.out.h;
import com.anythink.expressad.out.p;
import com.anythink.expressad.reward.player.ATRewardVideoActivity;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a extends d {

    /* renamed from: a, reason: collision with root package name */
    final String f18430a = "a";

    /* renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<String, c> f18431b;

    /* renamed from: c, reason: collision with root package name */
    Context f18432c;

    /* renamed from: d, reason: collision with root package name */
    w f18433d;

    /* renamed from: e, reason: collision with root package name */
    x f18434e;

    /* renamed from: f, reason: collision with root package name */
    com.anythink.basead.f.c.c f18435f;

    /* renamed from: g, reason: collision with root package name */
    protected c f18436g;

    /* renamed from: h, reason: collision with root package name */
    public com.anythink.basead.g.a f18437h;

    /* renamed from: com.anythink.expressad.a.a$5, reason: invalid class name */
    public class AnonymousClass5 extends com.anythink.expressad.videocommon.d.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18445a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f18446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Map map, String str, String str2, boolean[] zArr) {
            super(map, str);
            this.f18445a = str2;
            this.f18446b = zArr;
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void a() {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void b() {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void c() {
            com.anythink.basead.g.a aVar = a.this.f18437h;
            if (aVar != null) {
                aVar.onAdShow(new j());
            }
            a.this.f18433d = null;
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void d() {
            com.anythink.basead.g.a aVar = a.this.f18437h;
            if (aVar == null || !(aVar instanceof k)) {
                return;
            }
            boolean[] zArr = this.f18446b;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            ((k) aVar).onVideoAdPlayEnd();
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void e() {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void f() {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void a(String str) {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void b(String str) {
            com.anythink.basead.g.a aVar = a.this.f18437h;
            if (aVar != null) {
                aVar.onShowFailed(g.a(g.f6965k, str));
            }
            a.this.f18433d = null;
        }

        @Override // com.anythink.expressad.videocommon.d.b, com.anythink.expressad.videocommon.d.a
        public final void a(boolean z6, String str, float f2) {
            super.a(z6, str, f2);
            com.anythink.basead.g.a aVar = a.this.f18437h;
            if (aVar != null) {
                aVar.onAdClosed();
            }
            a.this.j();
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void a(final com.anythink.expressad.foundation.d.d dVar) {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.expressad.a.a.5.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    a.this.a(dVar, anonymousClass5.f18445a, new Runnable() { // from class: com.anythink.expressad.a.a.5.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            y yVar;
                            try {
                                x xVar = a.this.f18434e;
                                if (xVar == null || (yVar = xVar.f14954o) == null || !yVar.aG()) {
                                    return;
                                }
                                Intent intent = new Intent();
                                intent.setAction(ATRewardVideoActivity.f21194o);
                                if (a.this.f18434e != null) {
                                    intent.setAction(ATRewardVideoActivity.f21194o + a.this.f18434e.f14944d);
                                }
                                n.a(a.this.f18432c).a(intent);
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            });
        }
    }

    public a(Context context, x xVar, w wVar, com.anythink.basead.f.c.c cVar) {
        this.f18435f = cVar;
        this.f18432c = context;
        this.f18434e = xVar;
        this.f18433d = wVar;
        c cVar2 = new c(context, xVar, wVar, null);
        this.f18436g = cVar2;
        cVar2.a(new c.a() { // from class: com.anythink.expressad.a.a.1
            @Override // com.anythink.basead.b.c.a
            public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
                return false;
            }

            @Override // com.anythink.basead.b.c.a
            public final void b() {
            }

            @Override // com.anythink.basead.b.c.a
            public final void c() {
            }

            @Override // com.anythink.basead.b.c.a
            public final void a() {
                com.anythink.basead.g.a aVar = a.this.f18437h;
                if (aVar != null) {
                    aVar.onAdClick(new j().a(1, 13));
                }
            }

            @Override // com.anythink.basead.b.c.a
            public final void a(boolean z6) {
                com.anythink.basead.g.a aVar = a.this.f18437h;
                if (aVar != null) {
                    aVar.onDeeplinkCallback(z6);
                }
            }
        });
    }

    public final synchronized void a(com.anythink.expressad.foundation.d.d dVar, String str) {
        a(dVar, str, null);
    }

    @Override // com.anythink.basead.f.c.d
    public final void b() {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar instanceof com.anythink.expressad.advanced.d.c) {
            ((com.anythink.expressad.advanced.d.c) cVar).a(new p() { // from class: com.anythink.expressad.a.a.3
                @Override // com.anythink.expressad.out.p
                public final void a() {
                }

                @Override // com.anythink.expressad.out.p
                public final void b() {
                    com.anythink.basead.g.a aVar = a.this.f18437h;
                    if (aVar != null) {
                        aVar.onAdShow(new j());
                    }
                }

                @Override // com.anythink.expressad.out.p
                public final void c() {
                }

                @Override // com.anythink.expressad.out.p
                public final void d() {
                }

                @Override // com.anythink.expressad.out.p
                public final void e() {
                }

                @Override // com.anythink.expressad.out.p
                public final void f() {
                    com.anythink.basead.g.a aVar = a.this.f18437h;
                    if (aVar != null) {
                        aVar.onAdClosed();
                    }
                }

                @Override // com.anythink.expressad.out.p
                public final void a(String str) {
                }

                @Override // com.anythink.expressad.out.p
                public final void a(com.anythink.expressad.foundation.d.d dVar) {
                    a.this.a(dVar, "");
                }
            });
        }
    }

    @Override // com.anythink.basead.f.c.d
    public final int c() {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar instanceof com.anythink.expressad.advanced.d.c) {
            return ((com.anythink.expressad.advanced.d.c) cVar).f();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.c.d
    public final View d() {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar instanceof com.anythink.expressad.advanced.d.c) {
            return ((com.anythink.expressad.advanced.d.c) cVar).c();
        }
        return null;
    }

    @Override // com.anythink.basead.f.c.d
    public final void e() {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar instanceof com.anythink.expressad.advanced.d.c) {
            ((com.anythink.expressad.advanced.d.c) cVar).d(3);
        }
    }

    @Override // com.anythink.basead.f.c.d
    public final void f() {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar instanceof com.anythink.expressad.advanced.d.c) {
            ((com.anythink.expressad.advanced.d.c) cVar).e(3);
        }
    }

    @Override // com.anythink.basead.f.c.d
    public final View g() {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar == null || !(cVar instanceof TemplateBannerView)) {
            return null;
        }
        return (TemplateBannerView) cVar;
    }

    @Override // com.anythink.basead.f.c.d
    public final void h() {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar == null || !(cVar instanceof TemplateBannerView)) {
            return;
        }
        ((TemplateBannerView) cVar).setBannerAdListener(new h() { // from class: com.anythink.expressad.a.a.4
            @Override // com.anythink.expressad.out.h
            public final void a() {
            }

            @Override // com.anythink.expressad.out.h
            public final void b() {
                com.anythink.basead.g.a aVar = a.this.f18437h;
                if (aVar != null) {
                    aVar.onAdShow(new j());
                }
            }

            @Override // com.anythink.expressad.out.h
            public final void c() {
            }

            @Override // com.anythink.expressad.out.h
            public final void d() {
            }

            @Override // com.anythink.expressad.out.h
            public final void e() {
            }

            @Override // com.anythink.expressad.out.h
            public final void f() {
                com.anythink.basead.g.a aVar = a.this.f18437h;
                if (aVar != null) {
                    aVar.onAdClosed();
                }
                a.this.j();
            }

            @Override // com.anythink.expressad.out.h
            public final void a(String str) {
            }

            @Override // com.anythink.expressad.out.h
            public final void a(final com.anythink.expressad.foundation.d.d dVar) {
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.expressad.a.a.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.a(dVar, "");
                    }
                });
            }
        });
    }

    @Override // com.anythink.basead.f.c.d
    public final void i() {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar instanceof TemplateBannerView) {
            ((TemplateBannerView) cVar).release();
            this.f18435f = null;
        }
        com.anythink.basead.f.c.c cVar2 = this.f18435f;
        if (cVar2 != null && (cVar2 instanceof com.anythink.expressad.splash.d.c)) {
            ((com.anythink.expressad.splash.d.c) cVar2).g();
        }
        com.anythink.basead.f.c.c cVar3 = this.f18435f;
        if (cVar3 != null && (cVar3 instanceof com.anythink.expressad.advanced.d.c)) {
            ((com.anythink.expressad.advanced.d.c) cVar3).e();
        }
        this.f18437h = null;
    }

    public final void j() {
        c cVar = this.f18436g;
        if (cVar != null) {
            cVar.d();
            this.f18436g = null;
        }
        ConcurrentHashMap<String, c> concurrentHashMap = this.f18431b;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        Iterator<Map.Entry<String, c>> it = this.f18431b.entrySet().iterator();
        while (it.hasNext()) {
            c value = it.next().getValue();
            if (value != null) {
                value.d();
                it.remove();
            }
        }
    }

    /* renamed from: com.anythink.expressad.a.a$7, reason: invalid class name */
    public class AnonymousClass7 implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f18458a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f18459b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f18460c;

        /* renamed from: com.anythink.expressad.a.a$7$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.anythink.expressad.foundation.d.d f18462a;

            public AnonymousClass1(com.anythink.expressad.foundation.d.d dVar) {
                this.f18462a = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                if (anonymousClass7.f18458a[0]) {
                    a.this.a(this.f18462a, "", new Runnable() { // from class: com.anythink.expressad.a.a.7.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            t.b().b(new Runnable() { // from class: com.anythink.expressad.a.a.7.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((com.anythink.expressad.splash.d.c) a.this.f18435f).h();
                                }
                            });
                        }
                    });
                } else {
                    a.this.a(this.f18462a, "");
                }
            }
        }

        public AnonymousClass7(boolean[] zArr, boolean[] zArr2, Map map) {
            this.f18458a = zArr;
            this.f18459b = zArr2;
            this.f18460c = map;
        }

        @Override // com.anythink.expressad.out.e
        public final void a() {
            com.anythink.basead.g.a aVar = a.this.f18437h;
            if (aVar != null) {
                aVar.onAdShow(new j());
            }
        }

        @Override // com.anythink.expressad.out.e
        public final void b() {
        }

        @Override // com.anythink.expressad.out.e
        public final void c() {
        }

        @Override // com.anythink.expressad.out.e
        public final void d() {
        }

        @Override // com.anythink.expressad.out.e
        public final void a(String str) {
            com.anythink.basead.g.a aVar = a.this.f18437h;
            if (aVar != null) {
                aVar.onShowFailed(g.a(g.f6965k, str));
            }
        }

        @Override // com.anythink.expressad.out.e
        public final void a(com.anythink.expressad.foundation.d.d dVar) {
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass1(dVar));
        }

        @Override // com.anythink.expressad.out.e
        public final void a(int i) {
            this.f18459b[0] = true;
            this.f18460c.put(b.C0074b.f12894a, Integer.valueOf(i));
            com.anythink.basead.g.a aVar = a.this.f18437h;
            if (aVar != null) {
                aVar.onAdClosed();
            }
            a.this.j();
        }
    }

    @Override // com.anythink.basead.f.c.d
    public final void c(int i) {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar instanceof com.anythink.expressad.advanced.d.c) {
            ((com.anythink.expressad.advanced.d.c) cVar).c(i);
        }
    }

    public final synchronized void a(com.anythink.expressad.foundation.d.d dVar, String str, final Runnable runnable) {
        try {
            if (this.f18436g == null) {
                return;
            }
            if (this.f18431b == null) {
                this.f18431b = new ConcurrentHashMap<>(2);
            }
            c cVar = this.f18431b.get(dVar.bh());
            if (cVar == null) {
                cVar = b.a(this.f18436g, dVar);
                this.f18431b.put(dVar.bh(), cVar);
            }
            if (cVar != null) {
                com.anythink.basead.d.j jVar = new com.anythink.basead.d.j(this.f18434e, str);
                com.anythink.basead.f.c.c cVar2 = this.f18435f;
                ATOutNativeAdvancedViewGroup c9 = cVar2 instanceof com.anythink.expressad.advanced.d.c ? ((com.anythink.expressad.advanced.d.c) cVar2).c() : null;
                if (c9 != null) {
                    jVar.f6999h = c9.getHeight();
                    jVar.f6998g = c9.getWidth();
                    try {
                        int[] iArr = new int[2];
                        c9.getLocationOnScreen(iArr);
                        jVar.f7004n = iArr[0];
                        jVar.f7005o = iArr[1];
                    } catch (Throwable unused) {
                    }
                    jVar.f7006p = 100;
                }
                jVar.i = new com.anythink.basead.d.a();
                cVar.a(new c.a() { // from class: com.anythink.expressad.a.a.2
                    @Override // com.anythink.basead.b.c.a
                    public final boolean a(String str2, IOfferClickHandler iOfferClickHandler) {
                        return false;
                    }

                    @Override // com.anythink.basead.b.c.a
                    public final void b() {
                    }

                    @Override // com.anythink.basead.b.c.a
                    public final void c() {
                    }

                    @Override // com.anythink.basead.b.c.a
                    public final void a() {
                        com.anythink.basead.g.a aVar = a.this.f18437h;
                        if (aVar != null) {
                            aVar.onAdClick(new j().a(1, 13));
                        }
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }

                    @Override // com.anythink.basead.b.c.a
                    public final void a(boolean z6) {
                        com.anythink.basead.g.a aVar = a.this.f18437h;
                        if (aVar != null) {
                            aVar.onDeeplinkCallback(z6);
                        }
                    }
                });
                cVar.a(jVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.basead.f.c.d
    public final void b(int i) {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar instanceof com.anythink.expressad.advanced.d.c) {
            ((com.anythink.expressad.advanced.d.c) cVar).b(i);
        }
    }

    @Override // com.anythink.basead.f.c.d
    public final boolean b(Activity activity, Map<String, Object> map, String str, final String str2) {
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (!(cVar instanceof com.anythink.expressad.reward.b.a)) {
            return false;
        }
        ((com.anythink.expressad.reward.b.a) cVar).a(new com.anythink.expressad.videocommon.d.b(map, str) { // from class: com.anythink.expressad.a.a.6

            /* renamed from: a, reason: collision with root package name */
            boolean f18451a;

            @Override // com.anythink.expressad.videocommon.d.a
            public final void a() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void b() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void c() {
                this.f18451a = false;
                com.anythink.basead.g.a aVar = a.this.f18437h;
                if (aVar != null) {
                    j jVar = new j();
                    jVar.f9770c = 9;
                    aVar.onAdShow(jVar);
                }
                com.anythink.basead.g.a aVar2 = a.this.f18437h;
                if (aVar2 != null && (aVar2 instanceof k)) {
                    boolean[] zArr3 = zArr2;
                    if (!zArr3[0]) {
                        zArr3[0] = true;
                        ((k) aVar2).onVideoAdPlayStart();
                    }
                }
                a.this.f18433d = null;
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void d() {
                com.anythink.basead.g.a aVar = a.this.f18437h;
                if (aVar == null || !(aVar instanceof k)) {
                    return;
                }
                boolean[] zArr3 = zArr;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                ((k) aVar).onVideoAdPlayEnd();
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void e() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void f() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void a(String str3) {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void b(String str3) {
                this.f18451a = true;
                com.anythink.basead.g.a aVar = a.this.f18437h;
                if (aVar != null) {
                    aVar.onShowFailed(g.a(g.f6965k, str3));
                }
                a.this.f18433d = null;
            }

            @Override // com.anythink.expressad.videocommon.d.b, com.anythink.expressad.videocommon.d.a
            public final void a(boolean z6, String str3, float f2) {
                y yVar;
                super.a(z6, str3, f2);
                a aVar = a.this;
                com.anythink.basead.g.a aVar2 = aVar.f18437h;
                if (aVar2 != null && (aVar2 instanceof k)) {
                    if (z6) {
                        ((k) aVar2).onRewarded();
                    } else if (this.f18451a && (yVar = aVar.f18434e.f14954o) != null && yVar.p() == 1) {
                        ((k) a.this.f18437h).onRewarded();
                    }
                }
                com.anythink.basead.g.a aVar3 = a.this.f18437h;
                if (aVar3 != null) {
                    aVar3.onAdClosed();
                }
                a.this.j();
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void a(final com.anythink.expressad.foundation.d.d dVar) {
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.expressad.a.a.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        a.this.a(dVar, str2);
                    }
                });
            }
        });
        ((com.anythink.expressad.reward.b.a) this.f18435f).a(activity, "", "", "", this.f18434e);
        return true;
    }

    @Override // com.anythink.basead.f.c.d
    public final void a(com.anythink.basead.g.a aVar) {
        this.f18437h = aVar;
    }

    @Override // com.anythink.basead.f.c.d
    public final boolean a() {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        return cVar != null && cVar.isReady();
    }

    @Override // com.anythink.basead.f.c.d
    public final void a(int i, int i4) {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar instanceof com.anythink.expressad.advanced.d.c) {
            ((com.anythink.expressad.advanced.d.c) cVar).a(i, i4);
        }
    }

    @Override // com.anythink.basead.f.c.d
    public final void a(int i) {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (cVar instanceof com.anythink.expressad.advanced.d.c) {
            ((com.anythink.expressad.advanced.d.c) cVar).a(i);
        }
    }

    @Override // com.anythink.basead.f.c.d
    public final boolean a(Activity activity, Map<String, Object> map, String str, String str2) {
        com.anythink.basead.f.c.c cVar = this.f18435f;
        if (!(cVar instanceof com.anythink.expressad.reward.b.a)) {
            return false;
        }
        ((com.anythink.expressad.reward.b.a) cVar).a(new AnonymousClass5(map, str, str2, new boolean[]{false}));
        ((com.anythink.expressad.reward.b.a) this.f18435f).a(activity, "", "", "", this.f18434e);
        return true;
    }

    @Override // com.anythink.basead.f.c.d
    public final boolean a(ViewGroup viewGroup, final Map<String, Object> map) {
        if (!(this.f18435f instanceof com.anythink.expressad.splash.d.c)) {
            return false;
        }
        final boolean[] zArr = {false};
        boolean[] zArr2 = {false};
        w wVar = this.f18433d;
        if (wVar != null && wVar.r() != null) {
            zArr2[0] = this.f18433d.r().aG();
        }
        ((com.anythink.expressad.splash.d.c) this.f18435f).a(new AnonymousClass7(zArr2, zArr, map));
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.anythink.expressad.a.a.8
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                if (zArr[0]) {
                    return;
                }
                try {
                    map.put(b.C0074b.f12894a, 3);
                    com.anythink.basead.g.a aVar = a.this.f18437h;
                    if (aVar != null) {
                        aVar.onAdClosed();
                    }
                    a.this.j();
                } catch (Throwable unused) {
                }
            }
        });
        ((com.anythink.expressad.splash.d.c) this.f18435f).a(viewGroup);
        return true;
    }
}
