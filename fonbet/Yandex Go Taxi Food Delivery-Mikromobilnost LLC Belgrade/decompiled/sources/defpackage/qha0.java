package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class qha0 implements b70 {
    public static final List a = scc.g("benefitTitle", "additionalTitle", "iconImage", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "paymentMethodId");

    public static hha0 c(xdx xdxVar, c cVar) {
        Object obj;
        Object obj2;
        bha0 bha0Var = null;
        zga0 zga0Var = null;
        eha0 eha0Var = null;
        aha0 aha0Var = null;
        String str = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                kha0 kha0Var = kha0.a;
                foe foeVar = l80.a;
                bha0Var = (bha0) new ep60(kha0Var, true).b(xdxVar, cVar);
            } else if (h2 == 1) {
                iha0 iha0Var = iha0.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var = new ep60(iha0Var, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj2 = null;
                } else {
                    obj2 = ep60Var.b(xdxVar, cVar);
                }
                zga0Var = (zga0) obj2;
            } else if (h2 == 2) {
                ep60 a2 = l80.a(nha0.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj = null;
                } else {
                    obj = a2.b(xdxVar, cVar);
                }
                eha0Var = (eha0) obj;
            } else if (h2 == 3) {
                aha0Var = (aha0) l80.a(jha0.a).b(xdxVar, cVar);
            } else {
                if (h2 != 4) {
                    return new hha0(bha0Var, zga0Var, eha0Var, aha0Var, str);
                }
                str = (String) l80.i.b(xdxVar, cVar);
            }
        }
    }
}
