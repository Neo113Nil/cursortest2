package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class in4 extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ uoi l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ xqn o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ fk0 q;
    public final /* synthetic */ float r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in4(uoi uoiVar, Function0 function0, Function0 function02, xqn xqnVar, Function0 function03, fk0 fk0Var, float f, Continuation continuation) {
        super(2, continuation);
        this.l = uoiVar;
        this.m = function0;
        this.n = function02;
        this.o = xqnVar;
        this.p = function03;
        this.q = fk0Var;
        this.r = f;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        in4 in4Var = new in4(this.l, this.m, this.n, this.o, this.p, this.q, this.r, continuation);
        in4Var.k = obj;
        return in4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((in4) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        mm6 mm6Var = (mm6) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            pjc C = zsd.C(ox6.C(this.l.a, 30L, new sm4(4)), -1);
            hn4 hn4Var = new hn4(this.m, this.n, this.o, mm6Var, this.p, this.q, this.r);
            this.k = null;
            this.j = 1;
            if (C.collect(hn4Var, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
