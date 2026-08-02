package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;

/* loaded from: classes12.dex */
public final class tat extends v4j0 {
    public final RestMethod b;
    public final String c;
    public final String d;

    public tat(boolean z) {
        super(new yce(z, 6));
        this.b = RestMethod.GET;
        this.c = "get_payment_kit_config";
        this.d = "/v2/feature_flags";
    }

    @Override // defpackage.v4j0
    public final RestMethod c() {
        return this.b;
    }

    @Override // defpackage.v4j0
    public final String d() {
        return this.c;
    }

    @Override // defpackage.v4j0
    public final String e() {
        return this.d;
    }

    public tat() {
        this(false);
    }
}
