package defpackage;

import android.view.View;
import com.yandex.go.payments.cards.data.model.Verification;
import com.yandex.go.payments.cards.domain.model.PaymentMethodVerificationSession;
import com.yandex.go.payments.cards.ui.Card3dsViewImpl;
import com.yandex.go.payments.cards.ui.Card3dsViewImpl.WebView3DSClient;
import com.yandex.go.payments.cards.ui.b;
import com.yandex.go.payments.cards.verification.d3s.Card3dsModalView;

/* loaded from: classes13.dex */
public final class z88 {
    public final b a;
    public final View b;
    public final View c;
    public final u88 d;
    public final o88 e;
    public final u32 f;
    public final View g;
    public String h;
    public int i;
    public nm7 j;

    public z88(b bVar, View view, View view2, u88 u88Var, o88 o88Var, u32 u32Var) {
        Card3dsViewImpl card3dsViewImpl = bVar.a;
        this.a = bVar;
        this.b = view;
        this.c = view2;
        this.d = u88Var;
        this.e = o88Var;
        this.f = u32Var;
        this.g = view2.findViewById(e6h0.reload_button);
        this.i = -1;
        Verification verification = ((tu5) ((v920) u88Var).a).b.b;
        String str = verification.e;
        String str2 = verification.g;
        if (str == null || str.length() == 0) {
            ny61.r("Missing required 3ds url");
            throw null;
        }
        if (str2 == null || str2.length() == 0) {
            ny61.r("Missing required 3ds finishing url");
            throw null;
        }
        card3dsViewImpl.webView.getSettings().setJavaScriptEnabled(true);
        card3dsViewImpl.webView.setWebViewClient(card3dsViewImpl.new WebView3DSClient(bVar, new sk7(3, (Object) this, (Object) u32Var, str2)));
        this.j = new nm7(15, this, str);
    }

    public final void a() {
        v920 v920Var = (v920) this.d;
        tu5 tu5Var = (tu5) v920Var.b;
        p731 p731Var = tu5Var.b;
        m831 m831Var = p731Var.a;
        Verification verification = p731Var.b;
        j831 j831Var = new j831(m831Var, verification.a, "standard2_3ds", p731Var.c, true, verification.c, verification.i, null, null, null, tu5Var.f, null, 12160);
        m2v m2vVar = (m2v) v920Var.c;
        xqw xqwVar = (xqw) v920Var.w;
        y931 y931Var = (y931) v920Var.x;
        PaymentMethodVerificationSession paymentMethodVerificationSession = (PaymentMethodVerificationSession) v920Var.y;
        m2vVar.getClass();
        Card3dsModalView.onAttachedToWindow$lambda$0((Card3dsModalView) ((e48) this.e).b, new b90(m2vVar, paymentMethodVerificationSession, null, null, j831Var, y931Var, xqwVar));
    }
}
