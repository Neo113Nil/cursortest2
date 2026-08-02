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
    bj f9614a;

    /* renamed from: b, reason: collision with root package name */
    x f9615b;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.basead.g.a f9616c;

    /* renamed from: d, reason: collision with root package name */
    BaseSplashATView f9617d;

    /* renamed from: e, reason: collision with root package name */
    BaseBannerATView f9618e;

    public a(bj bjVar, x xVar) {
        this.f9614a = bjVar;
        this.f9615b = xVar;
    }

    @Override // com.anythink.basead.f.b.c
    public final boolean a() {
        bj bjVar = this.f9614a;
        if (bjVar == null) {
            return false;
        }
        if (bjVar.m() != 2 || this.f9614a.ag()) {
            return com.anythink.basead.b.c.d.a(this.f9614a, this.f9615b);
        }
        return false;
    }

    @Override // com.anythink.basead.f.b.c
    public final void b() {
        BaseSplashATView baseSplashATView = this.f9617d;
        if (baseSplashATView != null) {
            baseSplashATView.destroy();
            this.f9617d = null;
        }
        BaseBannerATView baseBannerATView = this.f9618e;
        if (baseBannerATView != null) {
            baseBannerATView.destroy();
            this.f9618e = null;
        }
    }

    @Override // com.anythink.basead.f.b.c
    public final void a(com.anythink.basead.g.a aVar) {
        this.f9616c = aVar;
    }

    @Override // com.anythink.basead.f.b.c
    public final void a(Activity activity, Map<String, Object> map, int i, final String str, String str2, String str3) {
        com.anythink.basead.g.b.a().a(str, new b.AbstractC0042b(map, str3) { // from class: com.anythink.basead.f.b.a.1
            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(j jVar) {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar != null) {
                    aVar.onAdShow(jVar);
                }
                a.this.f9614a = null;
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void b() {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar == null || !(aVar instanceof k)) {
                    return;
                }
                ((k) aVar).onVideoAdPlayEnd();
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void c() {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar == null || !(aVar instanceof k)) {
                    return;
                }
                ((k) aVar).onRewarded();
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void d() {
                super.d();
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar != null) {
                    aVar.onAdClosed();
                }
                com.anythink.basead.g.b.a().b(str);
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void b(j jVar) {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar != null) {
                    aVar.onAdClick(jVar);
                }
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(f fVar) {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar != null) {
                    aVar.onShowFailed(fVar);
                }
                a.this.f9614a = null;
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a() {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar == null || !(aVar instanceof k)) {
                    return;
                }
                ((k) aVar).onVideoAdPlayStart();
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(boolean z6) {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar != null) {
                    aVar.onDeeplinkCallback(z6);
                }
            }
        });
        com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
        cVar.f12705c = this.f9614a;
        cVar.f12706d = str;
        cVar.f12703a = 1;
        cVar.f12710h = this.f9615b;
        cVar.f12707e = i;
        cVar.f12704b = str2;
        BaseATActivity.a(activity, cVar);
    }

    @Override // com.anythink.basead.f.b.c
    public final void b(Activity activity, Map<String, Object> map, int i, final String str, String str2, String str3) {
        com.anythink.basead.g.b.a().a(str, new b.AbstractC0042b(map, str3) { // from class: com.anythink.basead.f.b.a.2
            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(j jVar) {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar != null) {
                    aVar.onAdShow(jVar);
                }
                a.this.f9614a = null;
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void b() {
                com.anythink.basead.g.a aVar = a.this.f9616c;
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
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar != null) {
                    aVar.onAdClosed();
                }
                com.anythink.basead.g.b.a().b(str);
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void b(j jVar) {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar != null) {
                    aVar.onAdClick(jVar);
                }
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(f fVar) {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar != null) {
                    aVar.onShowFailed(fVar);
                }
                a.this.f9614a = null;
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a() {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar == null || !(aVar instanceof k)) {
                    return;
                }
                ((k) aVar).onVideoAdPlayStart();
            }

            @Override // com.anythink.basead.g.b.AbstractC0042b
            public final void a(boolean z6) {
                com.anythink.basead.g.a aVar = a.this.f9616c;
                if (aVar != null) {
                    aVar.onDeeplinkCallback(z6);
                }
            }
        });
        com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
        cVar.f12705c = this.f9614a;
        cVar.f12706d = str;
        cVar.f12703a = 3;
        cVar.f12710h = this.f9615b;
        cVar.f12707e = i;
        cVar.f12704b = str2;
        BaseATActivity.a(activity, cVar);
    }

    @Override // com.anythink.basead.f.b.c
    public final void a(ViewGroup viewGroup, Map<String, Object> map, boolean z6) {
        int ao = this.f9614a.ao();
        if (ao != 2) {
            if (ao == 3) {
                if (com.anythink.basead.b.c.d.b(this.f9614a)) {
                    this.f9617d = new WTWebViewSplashATView(viewGroup.getContext(), this.f9615b, this.f9614a, this.f9616c);
                } else if (this.f9614a.r().bF() != 1) {
                    com.anythink.basead.g.a aVar = this.f9616c;
                    if (aVar != null) {
                        aVar.onShowFailed(g.a(g.f6965k, "Splash show without h5 template html!"));
                        return;
                    }
                    return;
                }
            }
            if (BaseSdkSplashATView.isSinglePicture(this.f9614a, this.f9615b.f14954o)) {
                if (this.f9615b.f14954o.bx() == 2 && this.f9615b.f14954o.C() != 2) {
                    this.f9617d = new SinglePictureBottomSlideSplashATView(viewGroup.getContext(), this.f9615b, this.f9614a, this.f9616c);
                } else {
                    this.f9617d = new SinglePictureSplashATView(viewGroup.getContext(), this.f9615b, this.f9614a, this.f9616c);
                }
            } else if (this.f9615b.f14954o.bw() == 2 && this.f9615b.f14954o.C() != 2) {
                this.f9617d = new AsseblemCardSplashATView(viewGroup.getContext(), this.f9615b, this.f9614a, this.f9616c);
            } else {
                this.f9617d = new AsseblemSplashATView(viewGroup.getContext(), this.f9615b, this.f9614a, this.f9616c);
            }
        } else {
            this.f9617d = new MraidSplashATView(viewGroup.getContext(), this.f9615b, this.f9614a, this.f9616c);
        }
        this.f9617d.setAdExtraInfoMap(map);
        this.f9617d.setDontCountDown(z6);
        viewGroup.addView(this.f9617d, -1, -1);
    }

    @Override // com.anythink.basead.f.b.c
    public final View a(Context context) {
        if (this.f9618e == null && a()) {
            if (this.f9614a.n()) {
                this.f9618e = new MraidBannerATView(context, this.f9615b, this.f9614a, this.f9616c);
            } else {
                this.f9618e = new SdkBannerATView(context, this.f9615b, this.f9614a, this.f9616c);
            }
        }
        return this.f9618e;
    }

    @Override // com.anythink.basead.f.b.c
    public final com.anythink.basead.f.b.a.d a(Context context, bj bjVar, x xVar, boolean z6) {
        if (z6) {
            return new com.anythink.basead.f.b.a.c(context, bjVar, xVar, z6);
        }
        return new com.anythink.basead.f.b.a.b(context, bjVar, xVar, z6);
    }
}
