package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class tx2 extends aur implements pyc {
    public /* synthetic */ boolean j;
    public /* synthetic */ float k;

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        float floatValue = ((Number) obj2).floatValue();
        tx2 tx2Var = new tx2(3, (Continuation) obj3);
        tx2Var.j = booleanValue;
        tx2Var.k = floatValue;
        return tx2Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z = this.j;
        float f = this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return new sx2(z, f);
    }
}
