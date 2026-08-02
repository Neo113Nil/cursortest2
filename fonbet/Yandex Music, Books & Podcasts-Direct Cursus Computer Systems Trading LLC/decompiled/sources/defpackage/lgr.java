package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class lgr {
    public final ciq a = new ciq(0);
    public final ciq b = new ciq(0);

    /* JADX WARN: Type inference failed for: r6v3, types: [ezc, kotlin.jvm.functions.Function2] */
    public final void a(xyd xydVar) {
        xydVar.getClass();
        ciq ciqVar = this.a;
        IntRange m = yhn.m(0, ciqVar.c);
        ArrayList arrayList = new ArrayList(v75.o(m, 10));
        ype it = m.iterator();
        while (it.c) {
            arrayList.add((lyd) ciqVar.j(it.nextInt()));
        }
        Object[] array = arrayList.toArray(new lyd[0]);
        if (array == null) {
            jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return;
        }
        lyd[] lydVarArr = (lyd[]) array;
        Arrays.sort(lydVarArr, efo.g);
        for (lyd lydVar : lydVarArr) {
            lydVar.getClass();
            wyd g = lydVar.g();
            ovg ovgVar = xydVar.b;
            AtomicBoolean atomicBoolean = xydVar.c;
            try {
                if (atomicBoolean.getAndSet(true)) {
                    throw new IllegalStateException("Concurrent access detected. It is not supported");
                }
                int d = lydVar.d(g);
                if ((d & 2) != 0) {
                    throw new IllegalStateException("Bucket order corruption detected");
                }
                if ((d & 1) != 0) {
                    throw new IllegalStateException("Bucket corruption detected via checksum");
                }
                if (d != 0) {
                    Integer num = (Integer) ovgVar.c(lydVar.f());
                    int intValue = num == null ? 0 : num.intValue();
                    int i = d | intValue;
                    if (i != intValue) {
                        ovgVar.f(lydVar.f(), Integer.valueOf(i));
                    }
                } else if (g.c() > 0) {
                    xydVar.a.a.invoke(lydVar, g);
                }
                atomicBoolean.set(false);
            } catch (Throwable th) {
                atomicBoolean.set(false);
                throw th;
            }
        }
    }
}
