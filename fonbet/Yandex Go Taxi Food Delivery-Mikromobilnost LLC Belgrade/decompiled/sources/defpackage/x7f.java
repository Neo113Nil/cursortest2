package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import java.util.Map;

/* loaded from: classes12.dex */
public final class x7f extends v4j0 {
    public final String b;
    public final RestMethod c;
    public final String d;
    public final String e;

    public x7f(String str) {
        super(new a5f(1));
        this.b = str;
        this.c = RestMethod.POST;
        this.d = "create_redirect_id";
        this.e = "api/v1/orders/by-payment-url/redirect";
    }

    @Override // defpackage.v4j0
    public final RestMethod c() {
        return this.c;
    }

    @Override // defpackage.v4j0
    public final String d() {
        return this.d;
    }

    @Override // defpackage.v4j0
    public final String e() {
        return this.e;
    }

    @Override // defpackage.v4j0
    public final Map g() {
        return g8e.z("payment_url", this.b);
    }
}
