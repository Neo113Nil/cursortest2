package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class oyc {
    public abstract Object a(g06 g06Var, jhb jhbVar, List list);

    public abstract List b();

    public abstract String c();

    public abstract mhb d();

    public final Object e(g06 g06Var, jhb jhbVar, List list) {
        mhb mhbVar;
        list.getClass();
        Object a = a(g06Var, jhbVar, list);
        boolean z = a instanceof Long;
        mhb mhbVar2 = mhb.ARRAY;
        mhb mhbVar3 = mhb.DICT;
        mhb mhbVar4 = mhb.URL;
        mhb mhbVar5 = mhb.COLOR;
        mhb mhbVar6 = mhb.DATETIME;
        mhb mhbVar7 = mhb.STRING;
        mhb mhbVar8 = mhb.BOOLEAN;
        mhb mhbVar9 = mhb.NUMBER;
        mhb mhbVar10 = mhb.INTEGER;
        if (z) {
            mhbVar = mhbVar10;
        } else if (a instanceof Double) {
            mhbVar = mhbVar9;
        } else if (a instanceof Boolean) {
            mhbVar = mhbVar8;
        } else if (a instanceof String) {
            mhbVar = mhbVar7;
        } else if (a instanceof vc7) {
            mhbVar = mhbVar6;
        } else if (a instanceof c85) {
            mhbVar = mhbVar5;
        } else if (a instanceof lpt) {
            mhbVar = mhbVar4;
        } else if (a instanceof JSONObject) {
            mhbVar = mhbVar3;
        } else {
            if (!(a instanceof JSONArray)) {
                if (a == null) {
                    kac.h("Unable to find type for null", null);
                    return null;
                }
                kac.h("Unable to find type for ".concat(a.getClass().getName()), null);
                return null;
            }
            mhbVar = mhbVar2;
        }
        if (mhbVar == d()) {
            return a;
        }
        StringBuilder sb = new StringBuilder("Function ");
        sb.append(this);
        sb.append(" returned ");
        if (z) {
            mhbVar2 = mhbVar10;
        } else if (a instanceof Double) {
            mhbVar2 = mhbVar9;
        } else if (a instanceof Boolean) {
            mhbVar2 = mhbVar8;
        } else if (a instanceof String) {
            mhbVar2 = mhbVar7;
        } else if (a instanceof vc7) {
            mhbVar2 = mhbVar6;
        } else if (a instanceof c85) {
            mhbVar2 = mhbVar5;
        } else if (a instanceof lpt) {
            mhbVar2 = mhbVar4;
        } else if (a instanceof JSONObject) {
            mhbVar2 = mhbVar3;
        } else if (!(a instanceof JSONArray)) {
            if (a == null) {
                kac.h("Unable to find type for null", null);
                return null;
            }
            kac.h("Unable to find type for ".concat(a.getClass().getName()), null);
            return null;
        }
        sb.append(mhbVar2);
        sb.append(", but ");
        sb.append(d());
        sb.append(" was expected.");
        throw new khb(sb.toString(), (Throwable) null);
    }

    public abstract boolean f();

    public final qwp g(ArrayList arrayList, Function2 function2) {
        int size = b().size();
        azc azcVar = (azc) CollectionsKt.Z(b());
        int size2 = azcVar != null ? azcVar.b : false ? Integer.MAX_VALUE : b().size();
        if (arrayList.size() < size || arrayList.size() > size2) {
            return new gyc(size);
        }
        int size3 = arrayList.size();
        for (int i = 0; i < size3; i++) {
            List b = b();
            int g = u75.g(b());
            if (i <= g) {
                g = i;
            }
            mhb mhbVar = ((azc) b.get(g)).a;
            if (!((Boolean) function2.invoke(arrayList.get(i), mhbVar)).booleanValue()) {
                return new hyc(mhbVar, (mhb) arrayList.get(i));
            }
        }
        return iyc.g;
    }

    public final qwp h(ArrayList arrayList) {
        return g(arrayList, kb5.Z);
    }

    public final qwp i(ArrayList arrayList) {
        return g(arrayList, new ucs(this));
    }

    public final String toString() {
        return CollectionsKt.X(b(), null, c() + '(', ")", lhb.G, 25);
    }
}
