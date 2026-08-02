package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.builders.SetBuilder;

/* loaded from: classes8.dex */
public final class tsn0 {
    public final qwo0 a;

    public tsn0(qwo0 qwo0Var) {
        this.a = qwo0Var;
    }

    public final SetBuilder a() {
        List W;
        SetBuilder setBuilder = new SetBuilder();
        qwo0 qwo0Var = this.a;
        Iterator it = ((Set) qwo0Var.o.getValue(qwo0Var, qwo0.B[13])).iterator();
        while (it.hasNext()) {
            W = evu0.W((String) it.next(), new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
            setBuilder.addAll(W);
        }
        setBuilder.addAll((Set) qwo0Var.p.getValue(qwo0Var, qwo0.B[14]));
        return setBuilder.b();
    }

    public final boolean b(String str, String str2) {
        Object obj;
        List W;
        qwo0 qwo0Var = this.a;
        sme0 sme0Var = qwo0Var.o;
        sme0 sme0Var2 = qwo0Var.p;
        Set set = (Set) sme0Var.getValue(qwo0Var, qwo0.B[13]);
        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            W = evu0.W((String) it.next(), new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
            arrayList.add(W);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((List) obj).contains(str2)) {
                break;
            }
        }
        List list = (List) obj;
        EmptySet emptySet = EmptySet.a;
        if (list == null) {
            sme0Var2.setValue(qwo0Var, qwo0.B[14], emptySet);
            return false;
        }
        try {
            String A0 = gvu0.A0(12, str);
            String str3 = gvu0.A0(8, A0) + "-" + gvu0.B0(4, A0);
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(str3.concat(gvu0.r0(13, (String) it3.next())));
            }
            sme0Var2.setValue(qwo0Var, qwo0.B[14], a.N0(arrayList2));
            return true;
        } catch (Exception unused) {
            jst.e.getClass();
            sme0Var2.setValue(qwo0Var, qwo0.B[14], emptySet);
            return false;
        }
    }
}
