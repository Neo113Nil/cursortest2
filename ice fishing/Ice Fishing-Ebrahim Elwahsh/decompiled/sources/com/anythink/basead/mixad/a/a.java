package com.anythink.basead.mixad.a;

import android.content.Context;
import android.view.View;
import com.anythink.basead.ui.thirdparty.ThirdPartySplashBannerATView;
import com.anythink.basead.ui.thirdparty.a;
import com.anythink.core.api.IATBaseAdAdapter;
import com.anythink.core.common.l.b.a.b;
import com.anythink.core.common.l.b.a.c;

/* loaded from: classes.dex */
public final class a implements com.anythink.core.common.l.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f9653a;

    /* renamed from: b, reason: collision with root package name */
    private b f9654b;

    /* renamed from: c, reason: collision with root package name */
    private IATBaseAdAdapter f9655c;

    /* renamed from: d, reason: collision with root package name */
    private int f9656d;

    /* renamed from: com.anythink.basead.mixad.a.a$1, reason: invalid class name */
    public class AnonymousClass1 implements a.InterfaceC0064a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.basead.ui.thirdparty.a.InterfaceC0064a
        public final void a(int i) {
            if (a.this.f9654b != null) {
                a.this.f9654b.a(i);
                a.this.f9654b = null;
            }
            if (a.this.f9655c != null) {
                a.this.f9655c.destory();
            }
        }
    }

    public a(com.anythink.core.common.l.d.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f9653a = aVar.a();
        this.f9654b = aVar.i();
        this.f9655c = aVar.f();
        this.f9656d = aVar.a(com.anythink.expressad.f.a.b.dl);
    }

    @Override // com.anythink.core.common.l.b.a.a
    public final c a() {
        if (this.f9653a == null) {
            return null;
        }
        IATBaseAdAdapter iATBaseAdAdapter = this.f9655c;
        View mixView = iATBaseAdAdapter != null ? iATBaseAdAdapter.getMixView() : null;
        if (mixView == null) {
            return null;
        }
        ThirdPartySplashBannerATView thirdPartySplashBannerATView = new ThirdPartySplashBannerATView(this.f9653a);
        thirdPartySplashBannerATView.addBannerView(mixView);
        thirdPartySplashBannerATView.addCountDownView(this.f9656d, new AnonymousClass1());
        return thirdPartySplashBannerATView;
    }

    private c a(View view) {
        ThirdPartySplashBannerATView thirdPartySplashBannerATView = new ThirdPartySplashBannerATView(this.f9653a);
        thirdPartySplashBannerATView.addBannerView(view);
        thirdPartySplashBannerATView.addCountDownView(this.f9656d, new AnonymousClass1());
        return thirdPartySplashBannerATView;
    }
}
