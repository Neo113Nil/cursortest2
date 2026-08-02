package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class vns extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ wns k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vns(wns wnsVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.k = wnsVar;
        this.l = str;
        this.m = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        vns vnsVar = new vns(this.k, this.l, this.m, continuation);
        vnsVar.j = obj;
        return vnsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vns) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        wns wnsVar = this.k;
        lpiVar.g(wnsVar.c, this.l);
        lpiVar.g(wnsVar.d, this.m);
        return Unit.a;
    }
}
