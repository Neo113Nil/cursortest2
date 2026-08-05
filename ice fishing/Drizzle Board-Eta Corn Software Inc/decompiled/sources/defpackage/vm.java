package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vm {
    public final LinkedHashMap qoPGr6Ce;

    public vm(int i) {
        switch (i) {
            case 1:
                this.qoPGr6Ce = new LinkedHashMap(0, 0.75f, true);
                break;
            case 2:
                this.qoPGr6Ce = new LinkedHashMap();
                break;
            default:
                this.qoPGr6Ce = new LinkedHashMap();
                break;
        }
    }

    public wkPeYiwH NCTxEWno() {
        Collection values = this.qoPGr6Ce.values();
        values.getClass();
        pg0[] pg0VarArr = (pg0[]) values.toArray(new pg0[0]);
        return new wkPeYiwH(2, (pg0[]) Arrays.copyOf(pg0VarArr, pg0VarArr.length));
    }

    public void qoPGr6Ce(p5 p5Var, zk zkVar) {
        LinkedHashMap linkedHashMap = this.qoPGr6Ce;
        if (!linkedHashMap.containsKey(p5Var)) {
            linkedHashMap.put(p5Var, new pg0(p5Var, zkVar));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + p5Var.NCTxEWno() + '.').toString());
    }
}
