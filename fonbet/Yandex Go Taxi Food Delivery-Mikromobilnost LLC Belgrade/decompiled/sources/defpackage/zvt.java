package defpackage;

import com.yandex.payment.sdk.core.data.GooglePayAllowedCardNetworks;
import com.yandex.payment.sdk.core.data.GooglePayData;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.xplat.payment.sdk.ExternalConvertibleError;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zvt {
    public static final ArrayList f;
    public static final ArrayList g;
    public final BaseActivity a;
    public final GooglePayData b;
    public final GooglePayAllowedCardNetworks c;
    public final rma0 d;
    public pac e;

    static {
        scc.g("VISA", "MASTERCARD");
        f = scc.c(1, 2);
        scc.c(1000, 5, 4);
        g = scc.c(1, 3, 9);
    }

    public zvt(BaseActivity baseActivity, GooglePayData googlePayData, pcy pcyVar, GooglePayAllowedCardNetworks googlePayAllowedCardNetworks) {
        this.a = baseActivity;
        this.b = googlePayData;
        this.c = googlePayAllowedCardNetworks;
        v741 v741Var = new v741();
        v741Var.a(pcyVar.b() ? 3 : 1);
        this.d = new rma0(baseActivity, baseActivity, x741.a, new w741(v741Var), sst.c);
    }

    public final void a(ExternalConvertibleError externalConvertibleError) {
        pac pacVar = this.e;
        if (pacVar != null) {
            pacVar.i(externalConvertibleError);
        }
        this.e = null;
    }
}
