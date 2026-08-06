package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class df1 implements AutoCloseable {
    public final v5 EljAMC1QTz;
    public final String OOA6hdeuvCS;

    public df1(String str, v5 v5Var) {
        this.OOA6hdeuvCS = str;
        this.EljAMC1QTz = v5Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        rx0 rx0Var = (rx0) this.EljAMC1QTz.X1lG3V04pd;
        rx0Var.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) rx0Var.AvO7iQsrTN;
        px0 px0Var = (px0) concurrentHashMap.get(this.OOA6hdeuvCS);
        if (px0Var != null) {
            f4 f4Var = (f4) ((v5) rx0Var.OOA6hdeuvCS).xqGvceK5x;
            f4Var.getClass();
            o20[] o20VarArr = (o20[]) ((ConcurrentHashMap) f4Var.X1lG3V04pd).values().toArray(new o20[0]);
            ArrayList arrayList = new ArrayList();
            for (o20 o20Var : o20VarArr) {
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                concurrentHashMap.remove(px0Var.Yi7zF1RB1);
            } else {
                it.next().getClass();
                o4.YmKjaVtbfp5Z();
            }
        }
    }
}
