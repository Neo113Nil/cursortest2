package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class iiq extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ jp0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iiq(jp0 jp0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = jp0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new iiq(this.l, continuation, 0);
            case 1:
                return new iiq(this.l, continuation, 1);
            default:
                return new iiq(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((iiq) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                jp0 jp0Var = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    bci bciVar = (bci) jp0Var.c;
                    this.k = 1;
                    if (bciVar.d(this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Function0 function0 = (Function0) jp0Var.b;
                if (function0 != null) {
                    function0.invoke();
                }
                jp0Var.h();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    jp0 jp0Var2 = this.l;
                    if (!jp0Var2.a) {
                        bci bciVar2 = (bci) jp0Var2.c;
                        this.k = 1;
                        if (bciVar2.f(this) == nm6Var2) {
                        }
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                jp0 jp0Var3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (jp0.a(jp0Var3, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Function0 function02 = (Function0) jp0Var3.b;
                if (function02 != null) {
                    function02.invoke();
                }
                jp0Var3.h();
                osh oshVar = (osh) jp0Var3.g;
                if (oshVar != null) {
                    oshVar.Z();
                }
                break;
        }
        return Unit.a;
    }
}
