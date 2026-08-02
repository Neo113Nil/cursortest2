package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.f5;
import yads.hm2;
import yads.j5;
import yads.oy1;

/* loaded from: classes7.dex */
public final class ry61 implements kg61 {
    public static final /* synthetic */ kgx[] A = {qha1.a(ry61.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;"), qha1.a(ry61.class, "adQualityVerifierController", "getAdQualityVerifierController()Lcom/monetization/ads/base/quality/AdQualityVerifierController;")};
    public final bq71 a;
    public final fe81 b;
    public final ph71 c;
    public final mj31 w;
    public final nr41 x;
    public final r581 y;
    public final r581 z;

    public ry61(v981 v981Var, du71 du71Var, bq71 bq71Var, fe81 fe81Var) {
        ph71 ph71Var = new ph71(v981Var);
        mj31 mj31Var = new mj31(bq71Var.b, bq71Var.c);
        nr41 nr41Var = new nr41(12, fe81Var);
        this.a = bq71Var;
        this.b = fe81Var;
        this.c = ph71Var;
        this.w = mj31Var;
        this.x = nr41Var;
        this.y = new r581(du71Var);
        this.z = new r581(bq71Var.d);
    }

    @Override // defpackage.kg61
    public final void a(Context context, d881 d881Var) {
        kgx[] kgxVarArr = A;
        kgx kgxVar = kgxVarArr[0];
        du71 du71Var = (du71) this.y.a.get();
        kgx kgxVar2 = kgxVarArr[1];
        j181 j181Var = (j181) this.z.a.get();
        if (du71Var == null || j181Var == null) {
            return;
        }
        this.a.a.b(f5.c, null);
        qb71 qb71Var = (qb71) d881Var.q;
        ai71 ai71Var = new ai71();
        nr41 nr41Var = this.x;
        mj31 mj31Var = this.w;
        mj31Var.q(context, d881Var, nr41Var);
        Map f = b.f();
        if (!ym11.h(f)) {
            f = null;
        }
        if (f == null) {
            new LinkedHashMap();
        }
        hn71 d = ai71Var.d(this.b, d881Var, qb71Var);
        d.r("success", ACSPConstants.STATUS);
        mj31Var.s(context, d881Var, hm2.g, d);
        uj61 uj61Var = new uj61();
        v981 v981Var = this.c.a;
        ck61 ck61Var = new ck61(new ji41(19, d881Var), new l171(v981Var), uj61Var, new uio0(v981Var, d881Var), new ba81());
        if (du71Var.J == j5.b) {
            return;
        }
        qb71 qb71Var2 = (qb71) d881Var.q;
        w381 w381Var = du71Var.U;
        tje.N(w381Var.d, null, null, new oy1(w381Var, d881Var, qb71Var2, ck61Var, du71Var.V, null), 3);
    }
}
