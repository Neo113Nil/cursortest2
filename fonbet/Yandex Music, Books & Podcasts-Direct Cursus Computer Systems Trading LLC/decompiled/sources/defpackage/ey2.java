package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class ey2 {
    public final String a;
    public final bjk b;
    public final y60 c;

    public ey2(String str, bjk bjkVar) {
        this.a = str;
        this.b = bjkVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(y60.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.c = (y60) qdcVar.C(I);
    }

    public final void a() {
        ot0.A(this.c, "DivPayWallScreen.Default", uah.g(new Pair("screen_id", this.a), new Pair("paywall_type", this.b.name())));
    }

    public final void b(String str) {
        ot0.A(this.c, "DivPayWallScreen.Failure", uah.g(new Pair("screen_id", this.a), new Pair("paywall_type", this.b.name()), new Pair(Constants.KEY_MESSAGE, str)));
    }

    public final void c() {
        ot0.A(this.c, "DivPayWallScreen.Loading", uah.g(new Pair("screen_id", this.a), new Pair("paywall_type", this.b.name())));
    }

    public final void d() {
        ot0.A(this.c, "DivPayWallScreen.Success", uah.g(new Pair("screen_id", this.a), new Pair("paywall_type", this.b.name())));
    }
}
