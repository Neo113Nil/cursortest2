package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class vnq0 implements dw {
    public final mu1 a;
    public final j32 b;
    public final c42 c;
    public final LinkedHashMap w;

    public vnq0(ArrayList arrayList, mu1 mu1Var, j32 j32Var, c42 c42Var) {
        this.a = mu1Var;
        this.b = j32Var;
        this.c = c42Var;
        int d = gw00.d(tcc.n(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f52 f52Var = (f52) it.next();
            Pair pair = new Pair(f52Var.a, f52Var.b);
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.w = linkedHashMap;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        c52 c52Var;
        boolean z;
        for (r32 r32Var : ((unq0) krVar).a) {
            yvf0 yvf0Var = (yvf0) this.w.get(r32Var.a);
            if (yvf0Var != null) {
                String str = r32Var.d;
                if (str != null && !evu0.J(str)) {
                    mu1 mu1Var = this.a;
                    String str2 = r32Var.d;
                    synchronized (mu1Var.a) {
                        try {
                            if (mu1Var.b.contains(str2)) {
                                z = false;
                            } else {
                                if (mu1Var.b.size() >= 1000) {
                                    mu1Var.b.remove((String) mu1Var.b.iterator().next());
                                }
                                z = mu1Var.b.add(str2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!z) {
                        continue;
                    }
                }
                e52 e52Var = (e52) yvf0Var.get();
                c42 c42Var = this.c;
                synchronized (c42Var) {
                    c52Var = c42Var.a;
                }
                if (c52Var == null) {
                    c52Var = c52.b;
                }
                ((Handler) this.b.a.getValue()).post(new b7(4, new in2(this, r32Var, c52Var, e52Var)));
            }
        }
    }
}
