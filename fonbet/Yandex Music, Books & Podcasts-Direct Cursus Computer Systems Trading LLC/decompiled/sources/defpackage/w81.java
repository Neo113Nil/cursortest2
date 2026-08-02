package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class w81 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x81 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w81(x81 x81Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = x81Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                w81 w81Var = new w81(this.l, continuation, 0);
                w81Var.k = obj;
                return w81Var;
            default:
                w81 w81Var2 = new w81(this.l, continuation, 1);
                w81Var2.k = obj;
                return w81Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((w81) create((q81) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((w81) create((o81) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        x81 x81Var = this.l;
        switch (i) {
            case 0:
                q81 q81Var = (q81) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (q81Var instanceof p81) {
                    xdr xdrVar = x81Var.o;
                    b91 b91Var = new b91(true);
                    xdrVar.getClass();
                    xdrVar.m(null, b91Var);
                } else if (!(q81Var instanceof o81)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            default:
                o81 o81Var = (o81) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                xdr xdrVar2 = x81Var.o;
                d91 d91Var = o81Var.b;
                xdrVar2.getClass();
                xdrVar2.m(null, d91Var);
                x81Var.b(o81Var.a.h);
                return Unit.a;
        }
    }
}
