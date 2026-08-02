package defpackage;

import com.yandex.messaging.internal.storage.folders.d;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class tzi0 extends wx4 {
    public final long b;
    public final ArrayList c;
    public final d d;

    public tzi0(long j, ArrayList arrayList, d dVar, el21 el21Var) {
        super(el21Var);
        this.b = j;
        this.c = arrayList;
        this.d = dVar;
    }

    @Override // defpackage.gr
    public final boolean a(gr grVar) {
        return (grVar instanceof tzi0) && ((tzi0) grVar).b == this.b;
    }

    @Override // defpackage.wx4
    public final Object b(cl21 cl21Var, Continuation continuation) {
        d dVar = this.d;
        dVar.getClass();
        return dVar.e(this.b, new nk2(this.c, 4), continuation);
    }
}
