package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zpc0 implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static vpc0 c(xdx xdxVar, c cVar) {
        upc0 upc0Var;
        tpc0 tpc0Var;
        j70 j70Var = cVar.a;
        spc0 spc0Var = null;
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("TaxiATTextProperty"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            upc0Var = ypc0.c(xdxVar, cVar);
        } else {
            upc0Var = null;
        }
        if (a.a(a.b("TaxiATLinkProperty"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            tpc0Var = xpc0.c(xdxVar, cVar);
        } else {
            tpc0Var = null;
        }
        if (a.a(a.b("TaxiATImageProperty"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            spc0Var = wpc0.c(xdxVar, cVar);
        }
        return new vpc0(str, upc0Var, tpc0Var, spc0Var);
    }
}
