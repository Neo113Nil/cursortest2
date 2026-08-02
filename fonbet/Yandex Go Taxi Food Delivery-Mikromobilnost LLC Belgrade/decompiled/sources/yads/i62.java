package yads;

import defpackage.il81;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qr71;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yx61;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class i62 extends SuspendLambda implements wls {
    public il81 b;
    public int c;
    public final /* synthetic */ il81 d;
    public final /* synthetic */ qr71 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i62(il81 il81Var, qr71 qr71Var, Continuation continuation) {
        super(2, continuation);
        this.d = il81Var;
        this.e = qr71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i62(this.d, this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new i62(this.d, this.e, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        il81 il81Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            b.b(obj);
            il81 il81Var2 = this.d;
            if (il81Var2 != null) {
                qr71 qr71Var = this.e;
                List list = il81Var2.a;
                this.b = il81Var2;
                this.c = 1;
                qr71Var.getClass();
                sjh sjhVar = uyj.a;
                Object k0 = tje.k0(mdh.b, new l62(list, qr71Var, null), this);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = k0;
                il81Var = il81Var2;
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        il81Var = this.b;
        b.b(obj);
        List list2 = (List) obj;
        if (!list2.isEmpty()) {
            return new il81(list2, il81Var.b, il81Var.c);
        }
        yx61.e("Invalid VAST in response");
        return null;
    }
}
