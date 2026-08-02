package ru.yandex.taxi.orderpopup;

import com.yandex.go.zone.dto.objects.e3;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cu6;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zk7;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orderpopup.BulletsOrderPopupRouter$showModalViewIfNeeded$1", f = "BulletsOrderPopupRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BulletsOrderPopupRouter$showModalViewIfNeeded$1 extends SuspendLambda implements wls {
    final /* synthetic */ zk7 $callback;
    final /* synthetic */ cu6 $model;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletsOrderPopupRouter$showModalViewIfNeeded$1(a aVar, cu6 cu6Var, zk7 zk7Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$model = cu6Var;
        this.$callback = zk7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BulletsOrderPopupRouter$showModalViewIfNeeded$1(this.this$0, this.$model, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BulletsOrderPopupRouter$showModalViewIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zk7 zk7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar = this.this$0;
                cu6 cu6Var = this.$model;
                zk7 zk7Var2 = this.$callback;
                try {
                    this.L$0 = zk7Var2;
                    this.label = 1;
                    if (aVar.c(cu6Var, zk7Var2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th) {
                    th = th;
                    zk7Var = zk7Var2;
                    jst.e.j(th);
                    zk7Var.b(e3.INSTANCE);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zk7Var = (zk7) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.j(th);
                    zk7Var.b(e3.INSTANCE);
                    return zy11.a;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
