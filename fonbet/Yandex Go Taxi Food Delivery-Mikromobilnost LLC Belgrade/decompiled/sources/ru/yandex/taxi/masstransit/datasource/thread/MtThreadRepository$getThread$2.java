package ru.yandex.taxi.masstransit.datasource.thread;

import com.yandex.mapkit.transport.masstransit.ThreadInfo;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/transport/masstransit/ThreadInfo;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/transport/masstransit/ThreadInfo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.datasource.thread.MtThreadRepository$getThread$2", f = "MtThreadRepository.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtThreadRepository$getThread$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $threadId;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtThreadRepository$getThread$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$threadId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtThreadRepository$getThread$2(this.this$0, this.$threadId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtThreadRepository$getThread$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar = this.this$0;
                String str2 = this.$threadId;
                try {
                    this.L$0 = str2;
                    this.label = 1;
                    obj = a.a(aVar, str2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str2;
                } catch (Throwable th) {
                    th = th;
                    str = str2;
                    jst.e.k(th, "Error during getting thread with id " + str);
                    return null;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, "Error during getting thread with id " + str);
                    return null;
                }
            }
            return (ThreadInfo) obj;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
