package ru.yandex.taxi.startup.launch.jobs;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.startup.launch.jobs.UpdateLaunchJob", f = "UpdateLaunchJob.kt", l = {14}, m = "doWork", v = 2)
/* loaded from: classes6.dex */
final class UpdateLaunchJob$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateLaunchJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateLaunchJob$doWork$1(UpdateLaunchJob updateLaunchJob, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = updateLaunchJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
