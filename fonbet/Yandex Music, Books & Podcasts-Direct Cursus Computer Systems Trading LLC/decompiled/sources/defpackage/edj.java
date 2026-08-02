package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class edj extends aur implements pyc {
    public /* synthetic */ boolean j;

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        edj edjVar = new edj(3, (Continuation) obj3);
        edjVar.j = booleanValue;
        return edjVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z = this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return Boolean.valueOf(z);
    }
}
