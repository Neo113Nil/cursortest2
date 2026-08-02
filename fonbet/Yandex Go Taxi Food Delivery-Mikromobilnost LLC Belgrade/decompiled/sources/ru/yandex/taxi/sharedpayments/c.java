package ru.yandex.taxi.sharedpayments;

import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yandex.go.account.api.family.SharedPaymentContext;
import defpackage.aap;
import defpackage.mbp;
import defpackage.pav;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.sc;
import defpackage.sjy;
import defpackage.teh0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uch0;
import defpackage.vnr0;
import defpackage.xbp;
import defpackage.y50;
import defpackage.yes0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;
import ru.yandex.taxi.zalogin.j;

/* loaded from: classes6.dex */
public final class c implements DefaultLifecycleObserver {
    public final pav A;
    public final aap B;
    public final xbp C;
    public SimpleSpinnerModalView D;
    public pzt0 E;
    public pzt0 F;
    public pzt0 G;
    public final b H = new b(this);
    public final tse a;
    public final j b;
    public final ComponentActivity c;
    public final g w;
    public final y50 x;
    public final sjy y;
    public final com.yandex.go.payments.shared.c z;

    public c(tse tseVar, j jVar, ComponentActivity componentActivity, g gVar, y50 y50Var, sjy sjyVar, com.yandex.go.payments.shared.c cVar, pav pavVar, aap aapVar, xbp xbpVar) {
        this.a = tseVar;
        this.b = jVar;
        this.c = componentActivity;
        this.w = gVar;
        this.x = y50Var;
        this.y = sjyVar;
        this.z = cVar;
        this.A = pavVar;
        this.B = aapVar;
        this.C = xbpVar;
        componentActivity.getLifecycle().a(this);
    }

    public static final void a(c cVar) {
        SimpleSpinnerModalView simpleSpinnerModalView = cVar.D;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
        }
        cVar.D = null;
    }

    public final void b(String str, SharedPaymentContext sharedPaymentContext) {
        yes0 yes0Var = SimpleSpinnerModalView.Companion;
        ViewGroup viewGroup = (ViewGroup) this.c.requireViewById(teh0.top_fullscreen_modal_views_container);
        yes0Var.getClass();
        this.D = yes0.c(viewGroup, false, false);
        this.E = tje.N(this.a, null, null, new CoreFamilyAccountLinker$notifyAccountLinked$1(this, str, sharedPaymentContext, null), 3);
    }

    public final void c(final SharedPaymentContext sharedPaymentContext, mbp mbpVar, final Runnable runnable) {
        ViewGroup viewGroup = (ViewGroup) this.c.requireViewById(uch0.splash_view_overlay);
        AccountLinkingInfoFullscreenModalView accountLinkingInfoFullscreenModalView = new AccountLinkingInfoFullscreenModalView(this.A, this.B, this.c, mbpVar, new Runnable() { // from class: ru.yandex.taxi.sharedpayments.a
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                tse tseVar = cVar.a;
                pzt0 pzt0Var = cVar.G;
                if (pzt0Var == null || !pzt0Var.isActive()) {
                    cVar.G = tje.N(tseVar, null, null, new CoreFamilyAccountLinker$onLoginClicked$$inlined$safeCollectIn$1(cVar.w.a(HProv.PP_CACHE_SIZE), null, cVar, sharedPaymentContext), 3);
                }
                cVar.F = com.yandex.go.coroutines.b.g(tseVar, null, null, new CoreFamilyAccountLinker$openLoginAndLink$1(cVar, runnable, null), 3);
            }
        }, sharedPaymentContext);
        vnr0 vnr0Var = (vnr0) this.B;
        vnr0Var.w(sharedPaymentContext);
        accountLinkingInfoFullscreenModalView.setOnAppearingListener(new sc(4, this));
        accountLinkingInfoFullscreenModalView.show(viewGroup, 0.0f);
        vnr0Var.w(sharedPaymentContext);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        pzt0 pzt0Var = this.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.E;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.y.c();
        pzt0 pzt0Var3 = this.G;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
    }
}
