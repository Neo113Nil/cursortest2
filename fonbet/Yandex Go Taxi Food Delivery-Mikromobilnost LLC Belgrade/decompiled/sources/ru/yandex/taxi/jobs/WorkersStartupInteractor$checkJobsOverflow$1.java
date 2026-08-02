package ru.yandex.taxi.jobs;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.jobs.WorkersStartupInteractor", f = "WorkersStartupInteractor.kt", l = {28, 29, 34, 37}, m = "checkJobsOverflow", v = 2)
/* loaded from: classes9.dex */
final class WorkersStartupInteractor$checkJobsOverflow$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkersStartupInteractor$checkJobsOverflow$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.d(this.this$0, this);
    }
}
