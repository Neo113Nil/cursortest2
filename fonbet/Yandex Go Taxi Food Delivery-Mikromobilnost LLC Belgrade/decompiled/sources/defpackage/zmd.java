package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zmd implements b70 {
    public static final zmd a = new zmd();
    public static final List b = scc.g("eventSessionId", "offers", "passedUpsaleSteps", "title", "offerSwitchToggle");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        emd emdVar = (emd) obj;
        bfxVar.A1("eventSessionId");
        foe foeVar = l80.a;
        bfxVar.r0(emdVar.a);
        bfxVar.A1("offers");
        end endVar = end.a;
        ArrayList arrayList = emdVar.b;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (bfxVar instanceof ek00) {
                ek00 ek00Var = (ek00) bfxVar;
                ek00Var.u();
                endVar.a(bfxVar, cVar, obj2);
                ek00Var.y();
            } else {
                ek00 ek00Var2 = new ek00();
                ek00Var2.u();
                endVar.a(ek00Var2, cVar, obj2);
                ek00Var2.y();
                uga1.f(bfxVar, ek00Var2.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("passedUpsaleSteps");
        lqy lqyVar = new lqy(g97.w);
        List list = emdVar.c;
        if (list == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, list);
        }
        bfxVar.A1("title");
        bfxVar.r0(emdVar.d);
        bfxVar.A1("offerSwitchToggle");
        ep60 a2 = l80.a(fnd.a);
        kmd kmdVar = emdVar.e;
        if (kmdVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, kmdVar);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object obj;
        Object obj2;
        String str = null;
        ArrayList arrayList = null;
        List list = null;
        String str2 = null;
        kmd kmdVar = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                end endVar = end.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var = new ep60(endVar, true);
                xdxVar.l();
                ArrayList arrayList2 = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList2.add(ep60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
                arrayList = arrayList2;
            } else if (h2 == 2) {
                g97 g97Var = g97.w;
                foe foeVar3 = l80.a;
                lqy lqyVar = new lqy(g97Var);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj2 = null;
                } else {
                    obj2 = lqyVar.b(xdxVar, cVar);
                }
                list = (List) obj2;
            } else if (h2 == 3) {
                foe foeVar4 = l80.a;
                str2 = xdxVar.nextString();
            } else {
                if (h2 != 4) {
                    return new emd(str, arrayList, list, str2, kmdVar);
                }
                ep60 a2 = l80.a(fnd.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj = null;
                } else {
                    obj = a2.b(xdxVar, cVar);
                }
                kmdVar = (kmd) obj;
            }
        }
    }
}
