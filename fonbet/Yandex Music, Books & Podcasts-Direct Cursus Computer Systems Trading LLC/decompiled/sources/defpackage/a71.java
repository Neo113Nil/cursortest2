package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a71 extends aur implements pyc {
    public /* synthetic */ int j;
    public /* synthetic */ int k;

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        a71 a71Var = new a71(3, (Continuation) obj3);
        a71Var.j = intValue;
        a71Var.k = intValue2;
        return a71Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        int i2 = this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return new y81(i, i2);
    }
}
