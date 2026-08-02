package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.sync.a;

/* loaded from: classes9.dex */
public final class to90 {
    public final tt2 a;
    public final im51 b;
    public final cne0 c;
    public final AtomicReference d = new AtomicReference(null);
    public final AtomicReference e = new AtomicReference(null);
    public final a f = gtq0.a();

    public to90(tt2 tt2Var, im51 im51Var, dne0 dne0Var) {
        this.a = tt2Var;
        this.b = im51Var;
        this.c = dne0Var.a("PassportPartitionsRepository");
    }

    public final List a() {
        List list;
        AtomicReference atomicReference = this.d;
        List list2 = (List) atomicReference.get();
        if (list2 != null) {
            return list2;
        }
        cne0 cne0Var = this.c;
        if (cne0Var.c("partitions")) {
            list = cne0Var.m("partitions", ";");
        } else {
            this.b.getClass();
            list = EmptyList.a;
        }
        while (!atomicReference.compareAndSet(null, list) && atomicReference.get() == null) {
        }
        List list3 = (List) atomicReference.get();
        return list3 == null ? list : list3;
    }
}
