package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.go.flex.common.facade.routers.views.EmbeddedFlexView;
import com.yandex.go.wallet.flex.a;
import defpackage.hbp0;
import defpackage.kr;
import defpackage.v841;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final class v841 {
    public final Context a;
    public final psn b;
    public final a c;
    public final ihr d;
    public final c941 e;
    public final wgr f;
    public final xyz g;
    public final nbs0 h = new nbs0();
    public final hbp0 i = new hbp0(new czo0(14), "WalletPagerFlexContent", null);
    public final FrameLayout j;
    public EmbeddedFlexView k;
    public l131 l;
    public boolean m;

    public v841(Context context, psn psnVar, a aVar, ihr ihrVar, c941 c941Var, wgr wgrVar, xyz xyzVar) {
        this.a = context;
        this.b = psnVar;
        this.c = aVar;
        this.d = ihrVar;
        this.e = c941Var;
        this.f = wgrVar;
        this.g = xyzVar;
        this.j = new FrameLayout(context);
    }

    public final void a() {
        l131 l131Var;
        EmbeddedFlexView embeddedFlexView = this.k;
        boolean z = embeddedFlexView != null && embeddedFlexView.isFlexDocumentAlive();
        EmbeddedFlexView embeddedFlexView2 = this.k;
        nbs0 nbs0Var = this.h;
        if (embeddedFlexView2 == null) {
            this.e.a = true;
            this.i.a();
            tls tlsVar = new tls() { // from class: com.yandex.go.wallet.flex.b
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    v841 v841Var = v841.this;
                    hbp0.e(v841Var.i, null, null, new WalletPagerFlexContent$ensureEmbeddedContent$fullscreenConfig$1$1(v841Var, (kr) obj, null), 3);
                    return zy11.a;
                }
            };
            ihr ihrVar = this.d;
            xyz xyzVar = this.g;
            k841 a = this.c.a(new l841(xyzVar, tlsVar, ihrVar), nbs0Var);
            this.l = a.b;
            u841 u841Var = new u841(xyzVar);
            nhr nhrVar = a.a;
            psn psnVar = this.b;
            psnVar.getClass();
            EmbeddedFlexView embeddedFlexView3 = new EmbeddedFlexView(this.a, nhrVar, psnVar.a, u841Var, "WalletEmbeddedFlexView");
            this.k = embeddedFlexView3;
            this.j.addView(embeddedFlexView3.getView(), new FrameLayout.LayoutParams(-1, -1));
            embeddedFlexView2 = embeddedFlexView3;
        }
        embeddedFlexView2.onPageResumed();
        nbs0Var.a.g(new y741("resumed"));
        if (this.m && z && (l131Var = this.l) != null) {
            Boolean bool = Boolean.FALSE;
            l131Var.invoke(bool, bool);
        }
        this.m = false;
    }

    public final void b() {
        this.e.a = false;
        EmbeddedFlexView embeddedFlexView = this.k;
        if (embeddedFlexView != null) {
            embeddedFlexView.destroyCompletely();
            this.j.removeView(embeddedFlexView.getView());
        }
        this.k = null;
        this.l = null;
        this.m = false;
        this.i.b();
    }
}
