package defpackage;

import com.yandex.payment.divkit.BankNameForMethod;
import com.yandex.payment.divkit.StringMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class qtf implements ryj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kol0 c;
    public final /* synthetic */ dtf w;

    public /* synthetic */ qtf(List list, kol0 kol0Var, dtf dtfVar, int i) {
        this.a = i;
        this.b = list;
        this.c = kol0Var;
        this.w = dtfVar;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        int i = this.a;
        dtf dtfVar = this.w;
        kol0 kol0Var = this.c;
        switch (i) {
            case 0:
                kol0Var.resumeWith(dtfVar);
                break;
            case 1:
                kol0Var.resumeWith(dtfVar);
                break;
            default:
                kol0Var.resumeWith(dtfVar);
                break;
        }
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        Object obj2;
        String uri;
        Object obj3;
        String uri2;
        Object obj4;
        String uri3;
        int i = this.a;
        dtf dtfVar = this.w;
        kol0 kol0Var = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                List list2 = (List) obj;
                List<ctf> list3 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                for (ctf ctfVar : list3) {
                    String str = ctfVar.a;
                    String str2 = ctfVar.g;
                    if (jl40.l(str, StringMethod.SBP_TOKEN.getValue()) && str2 != null && evu0.y(ctfVar.e, BankNameForMethod.UNKNOWN.getValue(), false)) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (evu0.y(((lp4) obj2).b, str2, false)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        lp4 lp4Var = (lp4) obj2;
                        if (lp4Var != null && (uri = lp4Var.g.toString()) != null) {
                            ctfVar = ctf.a(ctfVar, uri);
                        }
                    }
                    arrayList.add(ctfVar);
                }
                kol0Var.resumeWith(dtf.a(dtfVar, arrayList, null, 254));
                break;
            case 1:
                List list4 = (List) obj;
                List<ctf> list5 = list;
                ArrayList arrayList2 = new ArrayList(tcc.n(list5, 10));
                for (ctf ctfVar2 : list5) {
                    String str3 = ctfVar2.a;
                    String str4 = ctfVar2.g;
                    if (jl40.l(str3, StringMethod.SBP_TOKEN.getValue()) && str4 != null && evu0.y(ctfVar2.e, BankNameForMethod.UNKNOWN.getValue(), false)) {
                        Iterator it2 = list4.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (evu0.y(((lp4) obj3).b, str4, false)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        lp4 lp4Var2 = (lp4) obj3;
                        if (lp4Var2 != null && (uri2 = lp4Var2.g.toString()) != null) {
                            ctfVar2 = ctf.a(ctfVar2, uri2);
                        }
                    }
                    arrayList2.add(ctfVar2);
                }
                kol0Var.resumeWith(dtf.a(dtfVar, arrayList2, null, 254));
                break;
            default:
                List list6 = (List) obj;
                List<ctf> list7 = list;
                ArrayList arrayList3 = new ArrayList(tcc.n(list7, 10));
                for (ctf ctfVar3 : list7) {
                    String str5 = ctfVar3.a;
                    String str6 = ctfVar3.g;
                    if (jl40.l(str5, StringMethod.SBP_TOKEN.getValue()) && str6 != null && evu0.y(ctfVar3.e, BankNameForMethod.UNKNOWN.getValue(), false)) {
                        Iterator it3 = list6.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj4 = it3.next();
                                if (evu0.y(((lp4) obj4).b, str6, false)) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        lp4 lp4Var3 = (lp4) obj4;
                        if (lp4Var3 != null && (uri3 = lp4Var3.g.toString()) != null) {
                            ctfVar3 = ctf.a(ctfVar3, uri3);
                        }
                    }
                    arrayList3.add(ctfVar3);
                }
                kol0Var.resumeWith(dtf.a(dtfVar, arrayList3, null, 254));
                break;
        }
    }
}
