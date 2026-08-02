package defpackage;

import com.adjust.sdk.Constants;
import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class vsu0 implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static psu0 c(xdx xdxVar, c cVar) {
        lsu0 lsu0Var;
        nsu0 nsu0Var;
        msu0 msu0Var;
        j70 j70Var = cVar.a;
        ksu0 ksu0Var = null;
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("DeeplinkCrossAction"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            List list = rsu0.a;
            String str2 = null;
            while (xdxVar.h2(rsu0.a) == 0) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            }
            lsu0Var = new lsu0(str2);
        } else {
            lsu0Var = null;
        }
        if (a.a(a.b("ServiceSpecificCrossAction"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            nsu0Var = tsu0.c(xdxVar, cVar);
        } else {
            nsu0Var = null;
        }
        if (a.a(a.b("JustInteractCrossAction"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            List list2 = ssu0.a;
            String str3 = null;
            while (xdxVar.h2(ssu0.a) == 0) {
                foe foeVar3 = l80.a;
                str3 = xdxVar.nextString();
            }
            msu0Var = new msu0(str3);
        } else {
            msu0Var = null;
        }
        if (a.a(a.b("ActionPerformCrossAction"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            ksu0Var = qsu0.c(xdxVar, cVar);
        }
        return new psu0(str, lsu0Var, nsu0Var, msu0Var, ksu0Var);
    }

    public static void d(bfx bfxVar, c cVar, psu0 psu0Var) {
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(psu0Var.a);
        lsu0 lsu0Var = psu0Var.b;
        if (lsu0Var != null) {
            List list = rsu0.a;
            bfxVar.A1(Constants.DEEPLINK);
            bfxVar.r0(lsu0Var.a);
        }
        nsu0 nsu0Var = psu0Var.c;
        if (nsu0Var != null) {
            tsu0.d(bfxVar, cVar, nsu0Var);
        }
        msu0 msu0Var = psu0Var.d;
        if (msu0Var != null) {
            List list2 = ssu0.a;
            bfxVar.A1("__typename");
            bfxVar.r0(msu0Var.a);
        }
        ksu0 ksu0Var = psu0Var.e;
        if (ksu0Var != null) {
            qsu0.d(bfxVar, cVar, ksu0Var);
        }
    }
}
