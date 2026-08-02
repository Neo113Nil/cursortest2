package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class w4a extends aur implements Function1 {
    public int j;
    public final /* synthetic */ b5a k;
    public final /* synthetic */ t5a l;
    public final /* synthetic */ q2a m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4a(b5a b5aVar, t5a t5aVar, q2a q2aVar, boolean z, boolean z2, Continuation continuation) {
        super(1, continuation);
        this.k = b5aVar;
        this.l = t5aVar;
        this.m = q2aVar;
        this.n = z;
        this.o = z2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new w4a(this.k, this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((w4a) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        b5a b5aVar = this.k;
        t4a t4aVar = (t4a) ywf.L(b5aVar, b5aVar.b);
        apo apoVar = b5aVar.c;
        this.j = 1;
        Object c = t4aVar.c(this.l, this.m, this.n, this.o, false, apoVar, this);
        return c == nm6Var ? nm6Var : c;
    }
}
