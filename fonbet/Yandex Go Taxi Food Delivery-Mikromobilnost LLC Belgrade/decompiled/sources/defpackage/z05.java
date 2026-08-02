package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentToken;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes12.dex */
public final class z05 implements x05 {
    public final v2a0 a;
    public final xzd b;
    public final DefaultEnvironment c;
    public final Merchant d;
    public final Payer e;
    public final Scenario f;
    public final s3a0 g;
    public final String h;
    public final String i = String.valueOf(System.currentTimeMillis());

    public z05(Context context, v2a0 v2a0Var, xzd xzdVar, DefaultEnvironment defaultEnvironment, Merchant merchant, Payer payer, Scenario scenario, s3a0 s3a0Var) {
        this.a = v2a0Var;
        this.b = xzdVar;
        this.c = defaultEnvironment;
        this.d = merchant;
        this.e = payer;
        this.f = scenario;
        this.g = s3a0Var;
        this.h = context.getApplicationInfo().packageName;
    }

    @Override // defpackage.x05
    public final MapBuilder getParams() {
        String str;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("api_instance_id", this.a.a);
        int[] iArr = y05.a;
        DefaultEnvironment defaultEnvironment = this.c;
        int i = iArr[defaultEnvironment.ordinal()];
        boolean z = true;
        if (i == 1) {
            str = "testing";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str = "prod";
        }
        mapBuilder.put(WebViewActivity.KEY_ENVIRONMENT, str);
        PaymentKitConfig a = this.b.a();
        String expBoxes = a != null ? a.getExpBoxes() : null;
        if (expBoxes != null) {
            mapBuilder.put("exp_boxes", expBoxes);
        }
        mapBuilder.put("initialization_id", this.i);
        int i2 = iArr[defaultEnvironment.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            z = false;
        }
        mapBuilder.put("is_debug", String.valueOf(z));
        mapBuilder.put("is_debug_build", "false");
        mapBuilder.put("sdk_version", "1.16.9");
        mapBuilder.put("source_sdk", "fintech-sdk");
        mapBuilder.put("payment_src", this.h);
        Scenario scenario = this.f;
        boolean z2 = scenario instanceof Scenario.Payment;
        Scenario.Payment payment = z2 ? (Scenario.Payment) scenario : null;
        PaymentToken token = payment != null ? payment.getToken() : null;
        String token2 = token != null ? token.getToken() : null;
        if (token2 != null) {
            mapBuilder.put("payment_token", token2);
        }
        Scenario.Payment payment2 = z2 ? (Scenario.Payment) scenario : null;
        Boolean valueOf = payment2 != null ? Boolean.valueOf(payment2.isAnonym()) : null;
        String bool = valueOf != null ? valueOf.toString() : null;
        if (bool != null) {
            mapBuilder.put("is_anonymous", bool);
        }
        mapBuilder.put("service_token", this.d.getServiceToken());
        mapBuilder.put("session_id", this.g.a);
        mapBuilder.put(ClidProvider.TIMESTAMP, String.valueOf(System.currentTimeMillis()));
        String uid = this.e.getUid();
        if (uid != null) {
            mapBuilder.put("uid", uid);
        }
        return mapBuilder.j();
    }
}
