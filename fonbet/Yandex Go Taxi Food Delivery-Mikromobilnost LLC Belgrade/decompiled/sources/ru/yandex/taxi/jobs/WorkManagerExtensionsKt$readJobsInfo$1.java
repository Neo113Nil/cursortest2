package ru.yandex.taxi.jobs;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.jobs.WorkManagerExtensionsKt", f = "WorkManagerExtensions.kt", l = {26}, m = "readJobsInfo", v = 2)
/* loaded from: classes9.dex */
final class WorkManagerExtensionsKt$readJobsInfo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.a(null, null, this);
    }
}
