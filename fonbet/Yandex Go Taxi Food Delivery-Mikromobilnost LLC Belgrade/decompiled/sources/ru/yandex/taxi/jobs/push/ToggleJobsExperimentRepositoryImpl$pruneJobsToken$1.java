package ru.yandex.taxi.jobs.push;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.jobs.push.ToggleJobsExperimentRepositoryImpl", f = "ToggleJobsExperimentRepositoryImpl.kt", l = {26}, m = "pruneJobsToken$impl", v = 2)
/* loaded from: classes9.dex */
final class ToggleJobsExperimentRepositoryImpl$pruneJobsToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleJobsExperimentRepositoryImpl$pruneJobsToken$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(this);
    }
}
