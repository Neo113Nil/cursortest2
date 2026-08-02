package defpackage;

import android.content.Context;
import android.webkit.DownloadListener;
import com.yandex.go.inapp_calls.repository.defaultoutgoingcall.g;
import com.yandex.go.inapp_calls.ui.defaultoutgoingcall.DefaultCallTypeModalView;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.scooters.domain.x;
import com.yandex.go.scooters.domain.z;
import com.yandex.go.scooters.preselection.loading.v2.ScootersPreselectionLoadingV2ModalView;
import com.yandex.go.superapp.web.modal.WebModalView;
import com.yandex.go.superapp.web.modal.WebModalViewContent;
import com.yandex.go.superapp.web.view.SuperAppWebView;
import com.yandex.go.taxi.intercity.dashboard.impl.feedback.presentation.modal.IntercityDashboardFeedbackModalView;
import com.yandex.go.tips.ui.tips_set.TipsSetModalView;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.scooters.domain.c;

/* loaded from: classes13.dex */
public final class ra9 extends a {
    public final /* synthetic */ int F;
    public final w030 G;
    public final Object H;
    public final Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra9(i6r i6rVar, com.yandex.go.superapp.web.view.a aVar, w030 w030Var) {
        super(null);
        this.F = 3;
        this.H = i6rVar;
        this.I = aVar;
        this.G = w030Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        switch (this.F) {
        }
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        int i = this.F;
        Object obj2 = this.I;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                e48 e48Var = new e48(15, this);
                mc mcVar = ((z7h) obj2).a;
                return new DefaultCallTypeModalView((Context) obj3, new y7h((g) mcVar.a.get(), e48Var, (njv) mcVar.b.get()));
            case 1:
                h2t h2tVar = new h2t(this);
                pcw pcwVar = ((ucw) obj).a;
                hzk hzkVar = ((wcw) obj2).a;
                vcw vcwVar = new vcw(h2tVar, pcwVar, (com.yandex.go.taxi.intercity.dashboard.impl.feedback.interactor.a) ((mwq) hzkVar.a).get(), (u8w) ((ziv) hzkVar.b).get());
                zqj zqjVar = ((tcw) obj3).a;
                return new IntercityDashboardFeedbackModalView((pav) zqjVar.a.get(), (k7x0) zqjVar.b.get(), (Context) zqjVar.c.get(), vcwVar);
            case 2:
                emo0 emo0Var = (emo0) obj;
                iin0 iin0Var = new iin0(20, this);
                wlo0 wlo0Var = emo0Var.a;
                String str = emo0Var.b;
                y040 y040Var = ((dmo0) obj3).a;
                ylo0 ylo0Var = new ylo0((zuj0) y040Var.a.get(), (c) y040Var.b.get(), (o5o0) y040Var.c.get(), (x) y040Var.d.get(), (z) y040Var.e.get(), (ljn0) y040Var.f.get(), str, wlo0Var);
                gus gusVar = ((bmo0) obj2).a;
                return new ScootersPreselectionLoadingV2ModalView((Context) gusVar.a.get(), (g8n0) gusVar.b.get(), iin0Var, ylo0Var, false);
            case 3:
                k7w0 k7w0Var = (k7w0) obj;
                i6r i6rVar = (i6r) obj3;
                SuperAppWebView a = com.yandex.go.superapp.web.view.a.a((com.yandex.go.superapp.web.view.a) obj2, k7w0Var.r, k7w0Var.p, k7w0Var.t, null, 24);
                DownloadListener downloadListener = k7w0Var.n;
                if (downloadListener != null) {
                    a.setDownloadListener(downloadListener);
                }
                WebModalViewContent webModalViewContent = new WebModalViewContent(((c0g) i6rVar).w, a);
                uh41 uh41Var = new uh41(webModalViewContent, k7w0Var.a, k7w0Var.b, k7w0Var.c, k7w0Var.d, k7w0Var.h, k7w0Var.i, k7w0Var.j, k7w0Var.o, k7w0Var.l, k7w0Var.m, k7w0Var.q, k7w0Var.s);
                i7w0 i7w0Var = k7w0Var.e;
                ma41 ma41Var = k7w0Var.f;
                i6rVar.getClass();
                i7w0Var.getClass();
                ma41Var.getClass();
                WebModalView B = new apf(i6rVar, uh41Var, i7w0Var, ma41Var).B();
                if (k7w0Var.g) {
                    webModalViewContent.showToolbar(new l7w0(B, 0));
                    if (k7w0Var.k) {
                        webModalViewContent.showCloseButton(new l7w0(B, 1));
                    }
                }
                return B;
            default:
                c1x0 c1x0Var = new c1x0(this);
                yuf0 yuf0Var = ((dhz0) obj2).a;
                return new TipsSetModalView(new chz0(c1x0Var, (tgz0) ((dqx0) yuf0Var.a).get(), (rgz0) ((xvf0) yuf0Var.b).get(), (com.yandex.go.taxi.order.tipssuggest.domain.a) ((xvf0) yuf0Var.c).get(), (nfz0) ((w7y0) yuf0Var.d).get(), (to31) ((xvf0) yuf0Var.e).get(), (a850) ((xvf0) yuf0Var.f).get()), (Context) ((ahz0) obj3).a.a.get());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra9(Object obj, w030 w030Var, Object obj2, int i) {
        super(null);
        this.F = i;
        this.G = w030Var;
        this.H = obj;
        this.I = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra9(Context context, w030 w030Var, z7h z7hVar) {
        super(null);
        this.F = 0;
        this.H = context;
        this.G = w030Var;
        this.I = z7hVar;
    }
}
