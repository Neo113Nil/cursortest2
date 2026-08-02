package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class rco {
    public static qco a(String str, ml50 ml50Var) {
        wco wcoVar;
        nzc nzcVar;
        CharSequence charSequence;
        List list = ml50Var.d;
        Map map = ml50Var.c;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                wcoVar = null;
                break;
            }
            wcoVar = (wco) it.next();
            if (jl40.l(wcoVar.a, str)) {
                break;
            }
        }
        if (ml50Var.b && wcoVar != null) {
            String str2 = wcoVar.b;
            String str3 = wcoVar.c;
            for (String str4 : scc.g(str3, str2)) {
                if (str4 != null && !evu0.J(str4) && (charSequence = (CharSequence) map.get(str4)) != null && !evu0.J(charSequence)) {
                }
            }
            String str5 = (String) map.get(str2);
            String str6 = str5 == null ? "" : str5;
            String str7 = (String) map.get(str3);
            String str8 = str7 == null ? "" : str7;
            String str9 = (String) map.get(wcoVar.f);
            String str10 = str9 == null ? "" : str9;
            String str11 = (String) map.get(wcoVar.g);
            String str12 = str11 == null ? "" : str11;
            nzc nzcVar2 = wcoVar.d;
            if (nzcVar2 != null) {
                String str13 = nzcVar2.a;
                String str14 = (String) map.get(nzcVar2.b);
                nzcVar = new nzc(str13, str14 != null ? str14 : "");
            } else {
                nzcVar = null;
            }
            List<wk1> list2 = wcoVar.e;
            ArrayList arrayList = new ArrayList();
            for (wk1 wk1Var : list2) {
                Object obj = map.get(wk1Var.a);
                String str15 = (String) obj;
                if (str15 == null || str15.length() == 0) {
                    obj = null;
                }
                String str16 = (String) obj;
                wk1 wk1Var2 = str16 != null ? new wk1(str16, wk1Var.b) : null;
                if (wk1Var2 != null) {
                    arrayList.add(wk1Var2);
                }
            }
            return new qco(str6, str8, str10, str12, nzcVar, arrayList);
        }
        return null;
    }
}
