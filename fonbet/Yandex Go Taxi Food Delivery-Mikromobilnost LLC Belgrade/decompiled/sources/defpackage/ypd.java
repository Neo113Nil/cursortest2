package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.COMPOSITE_OFFER_STRUCTURE_TYPE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ypd implements b70 {
    public static final List a = scc.g("positionId", "structureType", "forActiveTariff", "tariffOffer", "optionOffers", "legalInfo", "invoices", "asset", "silentInvoiceAvailable");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        return new defpackage.qkd(r4, r5, r6, r7, r8, r9, r10, r11, r3.booleanValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qkd c(xdx xdxVar, c cVar) {
        Boolean bool;
        COMPOSITE_OFFER_STRUCTURE_TYPE composite_offer_structure_type;
        Object obj;
        Object obj2;
        Object obj3;
        Boolean bool2 = null;
        String str = null;
        COMPOSITE_OFFER_STRUCTURE_TYPE composite_offer_structure_type2 = null;
        kkd kkdVar = null;
        okd okdVar = null;
        ArrayList arrayList = null;
        mkd mkdVar = null;
        ArrayList arrayList2 = null;
        jkd jkdVar = null;
        while (true) {
            switch (xdxVar.h2(a)) {
                case 0:
                    foe foeVar = l80.a;
                    str = xdxVar.nextString();
                    continue;
                case 1:
                    bool = bool2;
                    String nextString = xdxVar.nextString();
                    COMPOSITE_OFFER_STRUCTURE_TYPE.Companion.getClass();
                    COMPOSITE_OFFER_STRUCTURE_TYPE[] values = COMPOSITE_OFFER_STRUCTURE_TYPE.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            composite_offer_structure_type = values[i];
                            if (!jl40.l(composite_offer_structure_type.getRawValue(), nextString)) {
                                i++;
                            }
                        } else {
                            composite_offer_structure_type = null;
                        }
                    }
                    if (composite_offer_structure_type != null) {
                        composite_offer_structure_type2 = composite_offer_structure_type;
                        break;
                    } else {
                        composite_offer_structure_type2 = COMPOSITE_OFFER_STRUCTURE_TYPE.UNKNOWN__;
                        break;
                    }
                case 2:
                    bool = bool2;
                    ep60 a2 = l80.a(zpd.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = a2.b(xdxVar, cVar);
                    }
                    kkdVar = (kkd) obj;
                    break;
                case 3:
                    bool = bool2;
                    dqd dqdVar = dqd.a;
                    foe foeVar2 = l80.a;
                    ep60 ep60Var = new ep60(dqdVar, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj2 = null;
                    } else {
                        obj2 = ep60Var.b(xdxVar, cVar);
                    }
                    okdVar = (okd) obj2;
                    break;
                case 4:
                    bool = bool2;
                    cqd cqdVar = cqd.a;
                    foe foeVar3 = l80.a;
                    ep60 ep60Var2 = new ep60(cqdVar, true);
                    xdxVar.l();
                    ArrayList arrayList3 = new ArrayList();
                    while (xdxVar.hasNext()) {
                        arrayList3.add(ep60Var2.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    arrayList = arrayList3;
                    break;
                case 5:
                    bool = bool2;
                    bqd bqdVar = bqd.a;
                    foe foeVar4 = l80.a;
                    ep60 ep60Var3 = new ep60(bqdVar, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj3 = null;
                    } else {
                        obj3 = ep60Var3.b(xdxVar, cVar);
                    }
                    mkdVar = (mkd) obj3;
                    break;
                case 6:
                    bool = bool2;
                    ep60 a3 = l80.a(aqd.a);
                    arrayList2 = oyr.z(xdxVar);
                    while (xdxVar.hasNext()) {
                        arrayList2.add(a3.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    break;
                case 7:
                    bool = bool2;
                    jkdVar = (jkd) l80.a(xpd.a).b(xdxVar, cVar);
                    break;
                case 8:
                    bool2 = (Boolean) l80.f.b(xdxVar, cVar);
                    continue;
            }
            bool2 = bool;
        }
    }

    public static void d(bfx bfxVar, c cVar, qkd qkdVar) {
        bfxVar.A1("positionId");
        foe foeVar = l80.a;
        bfxVar.r0(qkdVar.a);
        bfxVar.A1("structureType");
        bfxVar.r0(qkdVar.b.getRawValue());
        bfxVar.A1("forActiveTariff");
        ep60 a2 = l80.a(zpd.a);
        kkd kkdVar = qkdVar.c;
        if (kkdVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, kkdVar);
        }
        bfxVar.A1("tariffOffer");
        ep60 ep60Var = new ep60(dqd.a, true);
        okd okdVar = qkdVar.d;
        if (okdVar == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, okdVar);
        }
        bfxVar.A1("optionOffers");
        cqd cqdVar = cqd.a;
        ArrayList arrayList = qkdVar.e;
        bfxVar.l();
        for (Object obj : arrayList) {
            if (bfxVar instanceof ek00) {
                ek00 ek00Var = (ek00) bfxVar;
                ek00Var.u();
                cqdVar.a(bfxVar, cVar, obj);
                ek00Var.y();
            } else {
                ek00 ek00Var2 = new ek00();
                ek00Var2.u();
                cqdVar.a(ek00Var2, cVar, obj);
                ek00Var2.y();
                uga1.f(bfxVar, ek00Var2.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("legalInfo");
        ep60 ep60Var2 = new ep60(bqd.a, true);
        mkd mkdVar = qkdVar.f;
        if (mkdVar == null) {
            bfxVar.k2();
        } else {
            ep60Var2.a(bfxVar, cVar, mkdVar);
        }
        bfxVar.A1("invoices");
        ep60 a3 = l80.a(aqd.a);
        ArrayList arrayList2 = qkdVar.g;
        bfxVar.l();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a3.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        bfxVar.A1("asset");
        l80.a(xpd.a).a(bfxVar, cVar, qkdVar.h);
        bfxVar.A1("silentInvoiceAvailable");
        l80.f.a(bfxVar, cVar, Boolean.valueOf(qkdVar.i));
    }
}
