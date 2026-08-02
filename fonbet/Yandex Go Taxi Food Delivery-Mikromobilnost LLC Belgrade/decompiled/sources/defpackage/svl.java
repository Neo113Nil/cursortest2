package defpackage;

import flex.section.divkit.DivkitSnippet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class svl extends y8 {
    public final SerialDescriptor a = b.Companion.serializer().getDescriptor();

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        String str;
        Object obj;
        List list;
        Object obj2;
        ywl ywlVar;
        sbxVar.getClass();
        wvl wvlVar = (wvl) sbxVar.a(wvl.Companion.serializer(), bVar);
        n5o w = jx81.w(sbxVar, wvlVar.b, (c) bVar);
        if (w == null) {
            String str2 = wvlVar.a;
            q1m q1mVar = (q1m) bvf0.A(sbxVar).c(qoi0.a(q1m.class));
            nhf nhfVar = (nhf) bvf0.A(sbxVar).c(qoi0.a(nhf.class));
            if (nhfVar != null && (str = nhfVar.a) != null) {
                see seeVar = (q1mVar == null || (ywlVar = q1mVar.a) == null) ? null : ywlVar.a;
                dzp0 dzp0Var = seeVar instanceof dzp0 ? (dzp0) seeVar : null;
                if (dzp0Var != null) {
                    s5r s5rVar = new s5r(kotlin.sequences.b.g(new h73(1, dzp0Var.b), rvl.a));
                    while (true) {
                        if (!s5rVar.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = s5rVar.next();
                        if (jl40.l(((cvl) obj).a, str)) {
                            break;
                        }
                    }
                    cvl cvlVar = (cvl) obj;
                    if (cvlVar != null && (list = cvlVar.c) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jl40.l(((DivkitSnippet) obj2).a, str2)) {
                                break;
                            }
                        }
                        DivkitSnippet divkitSnippet = (DivkitSnippet) obj2;
                        if (divkitSnippet != null) {
                            w = divkitSnippet.b;
                        }
                    }
                }
            }
            w = null;
        }
        n5o n5oVar = w;
        String str3 = wvlVar.a;
        Map map = wvlVar.c;
        a5t0 a5t0Var = wvlVar.d;
        List list2 = wvlVar.e;
        String str4 = wvlVar.f;
        String str5 = wvlVar.g;
        String str6 = wvlVar.h;
        boolean z = wvlVar.i;
        bq90 bq90Var = wvlVar.j;
        return new DivkitSnippet(str3, n5oVar, map, a5t0Var, list2, str4, str5, str6, z, bq90Var != null ? bq90Var.a : null, wvlVar.k, wvlVar.l, wvlVar.m);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
