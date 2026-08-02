package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class yju0 implements b70 {
    public static final List a = Collections.singletonList("googleOfferReplaceParams");

    public static wju0 c(xdx xdxVar, c cVar) {
        Object b;
        vju0 vju0Var = null;
        while (xdxVar.h2(a) == 0) {
            ep60 a2 = l80.a(xju0.a);
            if (xdxVar.peek() == JsonReader$Token.NULL) {
                xdxVar.skipValue();
                b = null;
            } else {
                b = a2.b(xdxVar, cVar);
            }
            vju0Var = (vju0) b;
        }
        return new wju0(vju0Var);
    }

    public static void d(bfx bfxVar, c cVar, wju0 wju0Var) {
        bfxVar.A1("googleOfferReplaceParams");
        ep60 a2 = l80.a(xju0.a);
        vju0 vju0Var = wju0Var.a;
        if (vju0Var == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, vju0Var);
        }
    }
}
