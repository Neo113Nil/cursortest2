package ru.yandex.taxi.am.internal;

import defpackage.g050;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.to90;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.internal.PassportPartitionsRepositoryImpl$updatePartitions$2", f = "PassportPartitionsRepositoryImpl.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PassportPartitionsRepositoryImpl$updatePartitions$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $partitions;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ to90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportPartitionsRepositoryImpl$updatePartitions$2(to90 to90Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = to90Var;
        this.$partitions = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportPartitionsRepositoryImpl$updatePartitions$2(this.this$0, this.$partitions, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportPartitionsRepositoryImpl$updatePartitions$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        to90 to90Var;
        g050 g050Var;
        List<String> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            to90Var = this.this$0;
            kotlinx.coroutines.sync.a aVar = to90Var.f;
            List<String> list2 = this.$partitions;
            this.L$0 = aVar;
            this.L$1 = to90Var;
            this.L$2 = list2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar;
            list = list2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.L$2;
            to90Var = (to90) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            hst hstVar = jst.e;
            to90Var.c.s("partitions", ";", list);
            to90Var.d.set(list);
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
