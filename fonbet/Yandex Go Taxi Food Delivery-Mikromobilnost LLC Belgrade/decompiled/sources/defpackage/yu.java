package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class yu {
    public final fw a;
    public final xu b;
    public final sls c;
    public final LinkedHashMap d;

    public yu(fw fwVar, xu xuVar, sls slsVar) {
        this.a = fwVar;
        this.b = xuVar;
        this.c = slsVar;
        this.d = new LinkedHashMap();
    }

    public final n530 a(txl txlVar, sls slsVar) {
        c2r0 c2r0Var = new c2r0(2, 1);
        c2r0Var.a(this.a);
        c2r0Var.b(this.d.values().toArray(new fw[0]));
        ArrayList arrayList = c2r0Var.b;
        return new n530(new rid(Arrays.asList((fw[]) arrayList.toArray(new fw[arrayList.size()]))), this.b, txlVar, slsVar, this.c);
    }

    public /* synthetic */ yu(fw fwVar, xu xuVar) {
        this(fwVar, xuVar, new ar(8));
    }
}
