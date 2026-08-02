package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class vbw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ ccw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vbw(ccw ccwVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = ccwVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new vbw(this.k, continuation, 0);
            default:
                return new vbw(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((vbw) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((vbw) create((orw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        ccw ccwVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ssg.a(4, ccw.l, "start events (timestamp=" + ccw.b(ccwVar) + ")", null);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                xdr xdrVar = ccwVar.i;
                Boolean bool = Boolean.TRUE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
        }
        return Unit.a;
    }
}
