package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class xsa1 {
    public final /* synthetic */ int a = 4;

    public static final void a(r2l0 r2l0Var, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(922674499);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(r2l0Var) : btsVar.e(r2l0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(233081459, true, new s2l0(slsVar, r2l0Var, i3), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(r2l0Var, slsVar, i, 20);
        }
    }

    public static final LinkedHashMap b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((fdn) entry.getKey()).getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final lzr e(lzr lzrVar, lzr lzrVar2, float f) {
        return new lzr(y6i0.d(cjb1.e(lzrVar.a, lzrVar2.a, f), 1, 1000));
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return ((tq91) this).b.toString();
            default:
                return super.toString();
        }
    }
}
