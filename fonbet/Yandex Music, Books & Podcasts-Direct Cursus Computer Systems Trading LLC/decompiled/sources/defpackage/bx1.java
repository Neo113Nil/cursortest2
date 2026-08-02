package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class bx1 extends aur implements Function2 {
    public final /* synthetic */ cx1 j;
    public final /* synthetic */ xqn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx1(cx1 cx1Var, xqn xqnVar, Continuation continuation) {
        super(2, continuation);
        this.j = cx1Var;
        this.k = xqnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new bx1(this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bx1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return new Integer(this.j.c().requestAudioFocus(xq0.e(this.k.a)));
    }
}
