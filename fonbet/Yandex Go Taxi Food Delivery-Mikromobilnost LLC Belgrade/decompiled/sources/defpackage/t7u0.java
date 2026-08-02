package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class t7u0 {
    public final ycs0 a = new ycs0();
    public final ycs0 b = new ycs0();

    public final void a(olu oluVar) {
        ycs0 ycs0Var = this.a;
        d6w n = y6i0.n(0, ycs0Var.c);
        ArrayList arrayList = new ArrayList(tcc.n(n, 10));
        c6w it = n.iterator();
        while (it.c) {
            arrayList.add((vku) ycs0Var.j(it.nextInt()));
        }
        Object[] array = arrayList.toArray(new vku[0]);
        if (array == null) {
            ny61.t("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return;
        }
        vku[] vkuVarArr = (vku[]) array;
        Arrays.sort(vkuVarArr, gp50.w);
        for (vku vkuVar : vkuVarArr) {
            nlu g = vkuVar.g();
            rnz rnzVar = oluVar.b;
            AtomicBoolean atomicBoolean = oluVar.c;
            try {
                if (atomicBoolean.getAndSet(true)) {
                    throw new IllegalStateException("Concurrent access detected. It is not supported");
                }
                int d = vkuVar.d(g);
                if ((d & 2) != 0) {
                    throw new IllegalStateException("Bucket order corruption detected");
                }
                if ((d & 1) != 0) {
                    throw new IllegalStateException("Bucket corruption detected via checksum");
                }
                if (d != 0) {
                    Integer num = (Integer) rnzVar.c(vkuVar.f());
                    int intValue = num == null ? 0 : num.intValue();
                    int i = d | intValue;
                    if (i != intValue) {
                        rnzVar.h(vkuVar.f(), Integer.valueOf(i));
                    }
                } else if (g.c() > 0) {
                    oluVar.a.a.invoke(vkuVar, g);
                }
                atomicBoolean.set(false);
            } catch (Throwable th) {
                atomicBoolean.set(false);
                throw th;
            }
        }
    }
}
