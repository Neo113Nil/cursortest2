package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rqc {
    public final ArrayList a;

    public rqc(qqc... qqcVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (qqcVarArr.length > 0) {
            qqc qqcVar = qqcVarArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                xq0.o(dfi.i(ouj.u("'", str, "' must be unique. Actual [ ["), CollectionsKt.X(list, null, null, null, null, 63), ']'));
                throw null;
            }
            z75.t(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.a = arrayList2;
        if (arrayList2.size() <= 0) {
            return;
        }
        arrayList2.get(0).getClass();
        l1j.f();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rqc) {
            return Intrinsics.d(this.a, ((rqc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
