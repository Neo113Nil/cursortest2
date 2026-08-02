package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class vlc0 implements b70 {
    public static final List a = scc.g("widgets", "widgetGroups", "widgetsLevels", "plaques", "prefetchPlaqueList", "defaultPlaqueList", "fallbackPlaqueList");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        return new defpackage.klc0(r2, r3, r4, r5, r6, r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static klc0 c(xdx xdxVar, c cVar) {
        Object obj;
        ArrayList arrayList = null;
        List list = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (true) {
            switch (xdxVar.h2(a)) {
                case 0:
                    xlc0 xlc0Var = xlc0.a;
                    foe foeVar = l80.a;
                    ep60 ep60Var = new ep60(xlc0Var, true);
                    xdxVar.l();
                    ArrayList arrayList7 = new ArrayList();
                    while (xdxVar.hasNext()) {
                        arrayList7.add(ep60Var.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    arrayList = arrayList7;
                    break;
                case 1:
                    ylc0 ylc0Var = ylc0.a;
                    foe foeVar2 = l80.a;
                    lqy lqyVar = new lqy(new ep60(ylc0Var, true));
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = lqyVar.b(xdxVar, cVar);
                    }
                    list = (List) obj;
                    break;
                case 2:
                    zlc0 zlc0Var = zlc0.a;
                    foe foeVar3 = l80.a;
                    ep60 ep60Var2 = new ep60(zlc0Var, true);
                    xdxVar.l();
                    ArrayList arrayList8 = new ArrayList();
                    while (xdxVar.hasNext()) {
                        arrayList8.add(ep60Var2.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    arrayList2 = arrayList8;
                    break;
                case 3:
                    ulc0 ulc0Var = ulc0.a;
                    foe foeVar4 = l80.a;
                    ep60 ep60Var3 = new ep60(ulc0Var, true);
                    xdxVar.l();
                    ArrayList arrayList9 = new ArrayList();
                    while (xdxVar.hasNext()) {
                        arrayList9.add(ep60Var3.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    arrayList3 = arrayList9;
                    break;
                case 4:
                    wlc0 wlc0Var = wlc0.a;
                    foe foeVar5 = l80.a;
                    ep60 ep60Var4 = new ep60(wlc0Var, true);
                    xdxVar.l();
                    ArrayList arrayList10 = new ArrayList();
                    while (xdxVar.hasNext()) {
                        arrayList10.add(ep60Var4.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    arrayList4 = arrayList10;
                    break;
                case 5:
                    slc0 slc0Var = slc0.a;
                    foe foeVar6 = l80.a;
                    ep60 ep60Var5 = new ep60(slc0Var, true);
                    xdxVar.l();
                    ArrayList arrayList11 = new ArrayList();
                    while (xdxVar.hasNext()) {
                        arrayList11.add(ep60Var5.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    arrayList5 = arrayList11;
                    break;
                case 6:
                    tlc0 tlc0Var = tlc0.a;
                    foe foeVar7 = l80.a;
                    ep60 ep60Var6 = new ep60(tlc0Var, true);
                    xdxVar.l();
                    ArrayList arrayList12 = new ArrayList();
                    while (xdxVar.hasNext()) {
                        arrayList12.add(ep60Var6.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    arrayList6 = arrayList12;
                    break;
            }
        }
    }
}
