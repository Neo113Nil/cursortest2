package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class sld implements b70 {
    public static final List a = scc.g("tariffOffer", "optionOffers", "legalInfo", "paymentText", "successScreen", "invoices", "silentInvoiceAvailable");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        return new defpackage.pld(r2, r3, r4, r5, r6, r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pld c(xdx xdxVar, c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object b;
        mld mldVar = null;
        List list = null;
        zkd zkdVar = null;
        ild ildVar = null;
        jld jldVar = null;
        ArrayList arrayList = null;
        Boolean bool = null;
        while (true) {
            switch (xdxVar.h2(a)) {
                case 0:
                    zld zldVar = zld.a;
                    foe foeVar = l80.a;
                    ep60 ep60Var = new ep60(zldVar, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = ep60Var.b(xdxVar, cVar);
                    }
                    mldVar = (mld) obj;
                    break;
                case 1:
                    wld wldVar = wld.a;
                    foe foeVar2 = l80.a;
                    lqy lqyVar = new lqy(new om60(new ep60(wldVar, true)));
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj2 = null;
                    } else {
                        obj2 = lqyVar.b(xdxVar, cVar);
                    }
                    list = (List) obj2;
                    break;
                case 2:
                    uld uldVar = uld.a;
                    foe foeVar3 = l80.a;
                    ep60 ep60Var2 = new ep60(uldVar, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj3 = null;
                    } else {
                        obj3 = ep60Var2.b(xdxVar, cVar);
                    }
                    zkdVar = (zkd) obj3;
                    break;
                case 3:
                    ildVar = (ild) l80.a(xld.a).b(xdxVar, cVar);
                    break;
                case 4:
                    jldVar = (jld) l80.a(yld.a).b(xdxVar, cVar);
                    break;
                case 5:
                    ep60 a2 = l80.a(tld.a);
                    arrayList = oyr.z(xdxVar);
                    while (xdxVar.hasNext()) {
                        if (xdxVar.peek() == JsonReader$Token.NULL) {
                            xdxVar.skipValue();
                            b = null;
                        } else {
                            b = a2.b(xdxVar, cVar);
                        }
                        arrayList.add(b);
                    }
                    xdxVar.j();
                    break;
                case 6:
                    bool = (Boolean) l80.l.b(xdxVar, cVar);
                    break;
            }
        }
    }
}
