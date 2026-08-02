package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class u78 extends aur implements pyc {
    public /* synthetic */ long j;
    public /* synthetic */ long k;

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        u78 u78Var = new u78(3, (Continuation) obj3);
        u78Var.j = longValue;
        u78Var.k = longValue2;
        return u78Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        long j = this.j;
        long j2 = this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return Boolean.valueOf(j < j2);
    }
}
