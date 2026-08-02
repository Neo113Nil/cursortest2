package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class f9u extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ i9u l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9u(i9u i9uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = i9uVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new f9u(this.l, continuation, 0);
            default:
                return new f9u(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((f9u) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    i9u i9uVar = this.l;
                    p6u p6uVar = i9uVar.o.e;
                    yc4 M0 = zsd.M0(p6uVar.a.b.f, new cle((Continuation) null, p6uVar, 28));
                    e9u e9uVar = new e9u(i9uVar, 7);
                    this.k = 1;
                    Object collect = M0.collect(new zzs(e9uVar, 25), this);
                    if (collect != nm6Var) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                i9u i9uVar2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(3000L, this) == nm6Var2) {
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    xdr xdrVar = i9uVar2.E;
                    Boolean bool = Boolean.FALSE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    break;
                }
                xdr xdrVar2 = i9uVar2.D;
                Boolean bool2 = Boolean.FALSE;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                this.k = 2;
                if (y2x.o(5000L, this) == nm6Var2) {
                }
                xdr xdrVar3 = i9uVar2.E;
                Boolean bool3 = Boolean.FALSE;
                xdrVar3.getClass();
                xdrVar3.m(null, bool3);
                break;
        }
        return Unit.a;
    }
}
