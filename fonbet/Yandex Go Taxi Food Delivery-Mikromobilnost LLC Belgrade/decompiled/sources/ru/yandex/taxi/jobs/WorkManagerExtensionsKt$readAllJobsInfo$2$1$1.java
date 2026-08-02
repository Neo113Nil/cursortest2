package ru.yandex.taxi.jobs;

import androidx.work.WorkManager;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001j\u0004\u0018\u0001`\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Lkotlin/Pair;", "", "Lp951;", "Lru/yandex/taxi/jobs/JobsMeta;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.jobs.WorkManagerExtensionsKt$readAllJobsInfo$2$1$1", f = "WorkManagerExtensions.kt", l = {16}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class WorkManagerExtensionsKt$readAllJobsInfo$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $tag;
    final /* synthetic */ WorkManager $this_readAllJobsInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkManagerExtensionsKt$readAllJobsInfo$2$1$1(WorkManager workManager, String str, Continuation continuation) {
        super(2, continuation);
        this.$this_readAllJobsInfo = workManager;
        this.$tag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkManagerExtensionsKt$readAllJobsInfo$2$1$1(this.$this_readAllJobsInfo, this.$tag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkManagerExtensionsKt$readAllJobsInfo$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        WorkManager workManager = this.$this_readAllJobsInfo;
        String str = this.$tag;
        this.label = 1;
        Serializable a = d.a(workManager, str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
