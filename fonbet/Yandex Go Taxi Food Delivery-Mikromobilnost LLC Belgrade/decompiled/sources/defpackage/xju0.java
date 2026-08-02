package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.GOOGLE_OFFER_REPLACE_STRATEGY;
import java.util.List;

/* loaded from: classes2.dex */
public final class xju0 implements b70 {
    public static final xju0 a = new xju0();
    public static final List b = scc.g("purchaseToken", "strategy");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        vju0 vju0Var = (vju0) obj;
        bfxVar.A1("purchaseToken");
        foe foeVar = l80.a;
        bfxVar.r0(vju0Var.a);
        bfxVar.A1("strategy");
        bfxVar.r0(vju0Var.b.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        GOOGLE_OFFER_REPLACE_STRATEGY google_offer_replace_strategy;
        String str = null;
        GOOGLE_OFFER_REPLACE_STRATEGY google_offer_replace_strategy2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new vju0(str, google_offer_replace_strategy2);
                }
                String nextString = xdxVar.nextString();
                GOOGLE_OFFER_REPLACE_STRATEGY.Companion.getClass();
                GOOGLE_OFFER_REPLACE_STRATEGY[] values = GOOGLE_OFFER_REPLACE_STRATEGY.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        google_offer_replace_strategy = null;
                        break;
                    }
                    google_offer_replace_strategy = values[i];
                    if (jl40.l(google_offer_replace_strategy.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                google_offer_replace_strategy2 = google_offer_replace_strategy == null ? GOOGLE_OFFER_REPLACE_STRATEGY.UNKNOWN__ : google_offer_replace_strategy;
            }
        }
    }
}
