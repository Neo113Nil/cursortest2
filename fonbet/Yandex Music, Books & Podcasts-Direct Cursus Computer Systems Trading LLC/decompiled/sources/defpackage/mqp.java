package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class mqp extends aur implements ryc {
    public /* synthetic */ long j;
    public /* synthetic */ u0j k;
    public /* synthetic */ thr l;
    public final /* synthetic */ pqp m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqp(pqp pqpVar, Continuation continuation) {
        super(4, continuation);
        this.m = pqpVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj).longValue();
        mqp mqpVar = new mqp(this.m, (Continuation) obj4);
        mqpVar.j = longValue;
        mqpVar.k = (u0j) obj2;
        mqpVar.l = (thr) obj3;
        return mqpVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        long j = this.j;
        u0j u0jVar = this.k;
        thr thrVar = this.l;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        boolean z = false;
        boolean z2 = u0jVar == u0j.a;
        n8q n8qVar = (n8q) this.m.o.getValue();
        hil hilVar = thr.a;
        n8qVar.getClass();
        String a = n8qVar.a.a(thr.d);
        if (a != null && new File(a).exists()) {
            z = true;
        }
        return new n53(z2, j, z, thrVar);
    }
}
