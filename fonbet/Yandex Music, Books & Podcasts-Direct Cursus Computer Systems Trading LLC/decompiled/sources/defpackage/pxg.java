package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pxg extends aur implements Function1 {
    public final /* synthetic */ qxg j;
    public final /* synthetic */ ayg k;
    public final /* synthetic */ float l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxg(qxg qxgVar, ayg aygVar, float f, boolean z, Continuation continuation) {
        super(1, continuation);
        this.j = qxgVar;
        this.k = aygVar;
        this.l = f;
        this.m = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new pxg(this.j, this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((pxg) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        ayg aygVar = this.k;
        qxg qxgVar = this.j;
        qxgVar.i.setValue(aygVar);
        qxgVar.i(this.l);
        qxgVar.h(1);
        qxgVar.a.setValue(Boolean.FALSE);
        if (this.m) {
            qxgVar.l.setValue(Long.MIN_VALUE);
        }
        return Unit.a;
    }
}
