package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class x77 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ aur l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x77(Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        switch (i) {
            case 2:
                this.l = (aur) function1;
                super(2, continuation);
                break;
            case 3:
                this.l = (aur) function1;
                super(2, continuation);
                break;
            case 4:
                this.l = (aur) function1;
                super(2, continuation);
                break;
            case 5:
                this.l = (aur) function1;
                super(2, continuation);
                break;
            case 6:
                this.l = (aur) function1;
                super(2, continuation);
                break;
            case 7:
                this.l = (aur) function1;
                super(2, continuation);
                break;
            default:
                this.l = (aur) function1;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new x77(this.l, continuation);
            case 1:
                return new x77(this.l, continuation, 1);
            case 2:
                return new x77(this.l, continuation, 2);
            case 3:
                return new x77(this.l, continuation, 3);
            case 4:
                return new x77(this.l, continuation, 4);
            case 5:
                return new x77(this.l, continuation, 5);
            case 6:
                return new x77(this.l, continuation, 6);
            default:
                return new x77(this.l, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((x77) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r7v14, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v17, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v20, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v25, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v30, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v4, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v9, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ovn ovnVar = a87.a;
                    w77 w77Var = new w77((Function2) this.l, (Continuation) null, 0);
                    this.k = 1;
                    if (ovnVar.B(w77Var, this) == nm6Var) {
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
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object invoke = this.l.invoke(this);
                    return invoke == nm6Var2 ? nm6Var2 : invoke;
                }
                if (i2 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object invoke2 = this.l.invoke(this);
                    return invoke2 == nm6Var3 ? nm6Var3 : invoke2;
                }
                if (i3 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (this.l.invoke(this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (this.l.invoke(this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object invoke3 = this.l.invoke(this);
                    return invoke3 == nm6Var6 ? nm6Var6 : invoke3;
                }
                if (i6 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object invoke4 = this.l.invoke(this);
                    return invoke4 == nm6Var7 ? nm6Var7 : invoke4;
                }
                if (i7 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (this.l.invoke(this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x77(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.l = (aur) function2;
    }
}
