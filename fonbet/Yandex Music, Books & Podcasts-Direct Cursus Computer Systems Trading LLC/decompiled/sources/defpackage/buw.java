package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class buw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fuw l;
    public final /* synthetic */ float m;
    public final /* synthetic */ b9r n;
    public final /* synthetic */ ynn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ buw(fuw fuwVar, float f, b9r b9rVar, ynn ynnVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fuwVar;
        this.m = f;
        this.n = b9rVar;
        this.o = ynnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new buw(this.l, this.m, this.n, this.o, continuation, 0);
            default:
                return new buw(this.l, this.m, this.n, this.o, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((buw) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        buw buwVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                fuw fuwVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    fuwVar.e.h(null, null);
                    fk0 fk0Var = fuwVar.e;
                    Float f = new Float(this.m);
                    this.k = 1;
                    if (fk0.c(fk0Var, f, this.n, null, this, 12) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                fk0 fk0Var2 = fuwVar.e;
                ynn ynnVar = this.o;
                fk0Var2.h(new Float(ynnVar.a), new Float(ynnVar.c));
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                fuw fuwVar2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    fuwVar2.f.h(null, null);
                    fk0 fk0Var3 = fuwVar2.f;
                    Float f2 = new Float(this.m);
                    this.k = 1;
                    buwVar = this;
                    if (fk0.c(fk0Var3, f2, this.n, null, buwVar, 12) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    buwVar = this;
                }
                fk0 fk0Var4 = fuwVar2.f;
                ynn ynnVar2 = buwVar.o;
                fk0Var4.h(new Float(ynnVar2.b), new Float(ynnVar2.d));
                break;
        }
        return Unit.a;
    }
}
