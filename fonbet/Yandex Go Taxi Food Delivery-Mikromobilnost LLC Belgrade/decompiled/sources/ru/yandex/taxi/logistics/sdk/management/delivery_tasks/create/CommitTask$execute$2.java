package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create;

import defpackage.l7;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.r4f;
import defpackage.tje;
import defpackage.tse;
import defpackage.tzh;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lr4f;", "<anonymous>", "(Ltse;)Lr4f;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.CommitTask$execute$2", f = "CommitTask.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CommitTask$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ tzh $commitRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommitTask$execute$2(b bVar, tzh tzhVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$commitRequest = tzhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CommitTask$execute$2 commitTask$execute$2 = new CommitTask$execute$2(this.this$0, this.$commitRequest, continuation);
        commitTask$execute$2.L$0 = obj;
        return commitTask$execute$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CommitTask$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l8x l8xVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pzt0 N = tje.N(tseVar, null, null, new CommitTask$execute$2$commitJob$1(this.this$0, this.$commitRequest, null), 3);
            b bVar = this.this$0;
            tzh tzhVar = this.$commitRequest;
            List list = tzhVar.a;
            Integer num = new Integer(tzhVar.b);
            this.L$0 = null;
            this.L$1 = N;
            this.label = 1;
            Object y = kotlinx.coroutines.flow.e.y(new l7(4, bVar.b.a(), list, num), this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = y;
            l8xVar = N;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l8xVar = (l8x) this.L$1;
            kotlin.b.b(obj);
        }
        r4f r4fVar = (r4f) obj;
        l8xVar.a(null);
        return r4fVar;
    }
}
