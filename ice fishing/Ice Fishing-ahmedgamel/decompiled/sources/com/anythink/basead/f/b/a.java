package com.anythink.basead.f.b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.d.f;
import com.anythink.basead.d.g;
import com.anythink.basead.g.b;
import com.anythink.basead.g.j;
import com.anythink.basead.g.k;
import com.anythink.basead.ui.AsseblemCardSplashATView;
import com.anythink.basead.ui.AsseblemSplashATView;
import com.anythink.basead.ui.BaseATActivity;
import com.anythink.basead.ui.BaseBannerATView;
import com.anythink.basead.ui.BaseSdkSplashATView;
import com.anythink.basead.ui.BaseSplashATView;
import com.anythink.basead.ui.MraidBannerATView;
import com.anythink.basead.ui.MraidSplashATView;
import com.anythink.basead.ui.SdkBannerATView;
import com.anythink.basead.ui.SinglePictureBottomSlideSplashATView;
import com.anythink.basead.ui.SinglePictureSplashATView;
import com.anythink.basead.ui.h5template.WTWebViewSplashATView;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    bj f8828a;

    /* renamed from: b, reason: collision with root package name */
    x f8829b;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.basead.g.a f8830c;

    /* renamed from: d, reason: collision with root package name */
    BaseSplashATView f8831d;

    /* renamed from: e, reason: collision with root package name */
    BaseBannerATView f8832e;

    public a(bj bjVar, x xVar) {
        this.f8828a = bjVar;
        this.f8829b = xVar;
    }

    @Override // com.anythink.basead.f.b.c
    public final boolean a() {
        bj bjVar = this.f8828a;
        if (bjVar == null) {
            return false;
        }
        if (bjVar.m() != 2 || this.f8828a.ag()) {
            return com.anythink.basead.b.c.d.a(this.f8828a, this.f8829b);
        }
        return false;
    }

    @Override // com.anythink.basead.f.b.c
    public final void b() {
        BaseSplashATView baseSplashATView = this.f8831d;
        if (baseSplashATView != null) {
            baseSplashATView.destroy();
            this.f8831d = null;
        }
        BaseBannerATView baseBannerATView = this.f8832e;
        if (baseBannerATView != null) {
            baseBannerATView.destroy();
            this.f8832e = null;
        }
    }

    @Override // com.anythink.basead.f.b.c
    public final void a(com.anythink.basead.g.a aVar) {
        this.f8830c = aVar;
    }

    @Override // com.anythink.basead.f.b.c
    public final void a(Activity activity, Map<String, Object> map, int i, final String str, String str2, String str3) {
        com.anythink.basead.g.b.a().a(str, new b.AbstractC0042b(map, str3) { // from class: com.anythink.basead.f.b.a.1
            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(j jVar) {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar != null) {
                    aVar.onAdShow(jVar);
                }
                a.this.f8828a = null;
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void b() {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar == null || !(aVar instanceof k)) {
                    return;
                }
                ((k) aVar).onVideoAdPlayEnd();
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void c() {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar == null || !(aVar instanceof k)) {
                    return;
                }
                ((k) aVar).onRewarded();
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void d() {
                super.d();
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar != null) {
                    aVar.onAdClosed();
                }
                com.anythink.basead.g.b.a().b(str);
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void b(j jVar) {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar != null) {
                    aVar.onAdClick(jVar);
                }
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(f fVar) {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar != null) {
                    aVar.onShowFailed(fVar);
                }
                a.this.f8828a = null;
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a() {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar == null || !(aVar instanceof k)) {
                    return;
                }
                ((k) aVar).onVideoAdPlayStart();
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(boolean z3) {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar != null) {
                    aVar.onDeeplinkCallback(z3);
                }
            }
        });
        com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
        cVar.f11919c = this.f8828a;
        cVar.f11920d = str;
        cVar.f11917a = 1;
        cVar.f11924h = this.f8829b;
        cVar.f11921e = i;
        cVar.f11918b = str2;
        BaseATActivity.a(activity, cVar);
    }

    @Override // com.anythink.basead.f.b.c
    public final void b(Activity activity, Map<String, Object> map, int i, final String str, String str2, String str3) {
        com.anythink.basead.g.b.a().a(str, new b.AbstractC0042b(map, str3) { // from class: com.anythink.basead.f.b.a.2
            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(j jVar) {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar != null) {
                    aVar.onAdShow(jVar);
                }
                a.this.f8828a = null;
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void b() {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar == null || !(aVar instanceof k)) {
                    return;
                }
                ((k) aVar).onVideoAdPlayEnd();
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void c() {
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void d() {
                super.d();
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar != null) {
                    aVar.onAdClosed();
                }
                com.anythink.basead.g.b.a().b(str);
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void b(j jVar) {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar != null) {
                    aVar.onAdClick(jVar);
                }
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(f fVar) {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar != null) {
                    aVar.onShowFailed(fVar);
                }
                a.this.f8828a = null;
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a() {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar == null || !(aVar instanceof k)) {
                    return;
                }
                ((k) aVar).onVideoAdPlayStart();
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(boolean z3) {
                com.anythink.basead.g.a aVar = a.this.f8830c;
                if (aVar != null) {
                    aVar.onDeeplinkCallback(z3);
                }
            }
        });
        com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
        cVar.f11919c = this.f8828a;
        cVar.f11920d = str;
        cVar.f11917a = 3;
        cVar.f11924h = this.f8829b;
        cVar.f11921e = i;
        cVar.f11918b = str2;
        BaseATActivity.a(activity, cVar);
    }

    @Override // com.anythink.basead.f.b.c
    public final void a(ViewGroup viewGroup, Map<String, Object> map, boolean z3) {
        int ao = this.f8828a.ao();
        if (ao != 2) {
            if (ao == 3) {
                if (com.anythink.basead.b.c.d.b(this.f8828a)) {
                    this.f8831d = new WTWebViewSplashATView(viewGroup.getContext(), this.f8829b, this.f8828a, this.f8830c);
                } else if (this.f8828a.r().bF() != 1) {
                    com.anythink.basead.g.a aVar = this.f8830c;
                    if (aVar != null) {
                        aVar.onShowFailed(g.a(g.f6179k, "Splash show without h5 template html!"));
                        return;
                    }
                    return;
                }
            }
            if (BaseSdkSplashATView.isSinglePicture(this.f8828a, this.f8829b.f14168o)) {
                if (this.f8829b.f14168o.bx() == 2 && this.f8829b.f14168o.C() != 2) {
                    this.f8831d = new SinglePictureBottomSlideSplashATView(viewGroup.getContext(), this.f8829b, this.f8828a, this.f8830c);
                } else {
                    this.f8831d = new SinglePictureSplashATView(viewGroup.getContext(), this.f8829b, this.f8828a, this.f8830c);
                }
            } else if (this.f8829b.f14168o.bw() == 2 && this.f8829b.f14168o.C() != 2) {
                this.f8831d = new AsseblemCardSplashATView(viewGroup.getContext(), this.f8829b, this.f8828a, this.f8830c);
            } else {
                this.f8831d = new AsseblemSplashATView(viewGroup.getContext(), this.f8829b, this.f8828a, this.f8830c);
            }
        } else {
            this.f8831d = new MraidSplashATView(viewGroup.getContext(), this.f8829b, this.f8828a, this.f8830c);
        }
        this.f8831d.setAdExtraInfoMap(map);
        this.f8831d.setDontCountDown(z3);
        viewGroup.addView(this.f8831d, -1, -1);
    }

    @Override // com.anythink.basead.f.b.c
    public final View a(Context context) {
        if (this.f8832e == null && a()) {
            if (this.f8828a.n()) {
                this.f8832e = new MraidBannerATView(context, this.f8829b, this.f8828a, this.f8830c);
            } else {
                this.f8832e = new SdkBannerATView(context, this.f8829b, this.f8828a, this.f8830c);
            }
        }
        return this.f8832e;
    }

    @Override // com.anythink.basead.f.b.c
    public final com.anythink.basead.f.b.a.d a(Context context, bj bjVar, x xVar, boolean z3) {
        if (z3) {
            return new com.anythink.basead.f.b.a.c(context, bjVar, xVar, z3);
        }
        return new com.anythink.basead.f.b.a.b(context, bjVar, xVar, z3);
    }
}
