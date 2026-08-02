package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.FutureTask;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class yop extends s8 {
    public final FutureTask g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yop(ig3 ig3Var, pyc pycVar) {
        super(ig3Var);
        ig3Var.getClass();
        FutureTask futureTask = new FutureTask(new fb7(pycVar, this));
        this.g = futureTask;
        ig3Var.execute(futureTask);
    }

    public final void d(r7w r7wVar) {
        r7wVar.getClass();
        this.d.i(new cwm(r7wVar));
        this.g.cancel(true);
        if (this.e) {
            return;
        }
        Iterator it = CollectionsKt.A0((LinkedHashSet) mif.b.b).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(r7wVar);
        }
    }
}
