package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class om0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Function0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om0(Function0 function0, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = function0;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new om0(this.k, continuation, 0);
            case 1:
                return new om0(this.k, continuation, 1);
            case 2:
                return new om0(this.k, continuation, 2);
            case 3:
                return new om0(this.k, continuation, 3);
            case 4:
                return new om0(this.k, continuation, 4);
            case 5:
                return new om0(this.k, continuation, 5);
            default:
                return new om0(this.k, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((om0) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Function0 function0 = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (function0 == null) {
                    su4.s(2, null, "Developer error. Lambda is not provided. Call ProvideShimmerColor before ShimmerBox", null);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                function0.invoke();
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                function0.invoke();
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                function0.invoke();
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                function0.invoke();
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                function0.invoke();
                break;
            default:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                function0.invoke();
                break;
        }
        return Unit.a;
    }
}
