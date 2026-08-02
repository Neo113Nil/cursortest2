package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class tnz0 extends v4j0 {
    public final String b;
    public final wnz0 c;
    public final RestMethod d;
    public final String e;
    public final String f;

    public tnz0(String str, wnz0 wnz0Var, boolean z) {
        super(new dzw0(z, 2));
        this.b = str;
        this.c = wnz0Var;
        this.d = RestMethod.POST;
        this.e = "card_tokenize";
        this.f = "/api/v2/tokenize";
    }

    @Override // defpackage.v4j0
    public final c a() {
        return qcx.m(gwk0.J(tje.a(sbx.d, new f0z0(16)), this.c, wnz0.Companion.serializer()));
    }

    @Override // defpackage.v4j0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.v4j0
    public final RestMethod c() {
        return this.d;
    }

    @Override // defpackage.v4j0
    public final String d() {
        return this.e;
    }

    @Override // defpackage.v4j0
    public final String e() {
        return this.f;
    }
}
