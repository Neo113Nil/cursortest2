package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class rjo extends v4j0 {
    public final ujo b;
    public final RestMethod c;
    public final String d;
    public final String e;

    public rjo(ujo ujoVar) {
        super(new l0o(7));
        this.b = ujoVar;
        this.c = RestMethod.POST;
        this.d = "exchange-user-token";
        this.e = "api/v1/exchange-user-token";
    }

    @Override // defpackage.v4j0
    public final c a() {
        rbx rbxVar = sbx.d;
        rbxVar.getClass();
        return qcx.m(gwk0.J(rbxVar, this.b, ujo.Companion.serializer()));
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
}
