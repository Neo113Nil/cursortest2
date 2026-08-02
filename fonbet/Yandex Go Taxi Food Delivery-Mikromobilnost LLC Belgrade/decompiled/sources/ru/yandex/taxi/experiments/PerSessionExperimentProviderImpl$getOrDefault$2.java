package ru.yandex.taxi.experiments;

import defpackage.mvg;
import defpackage.vn11;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.experiments.PerSessionExperimentProviderImpl", f = "PerSessionExperimentProviderImpl.kt", l = {28}, m = "getOrDefault", v = 2)
/* loaded from: classes5.dex */
final class PerSessionExperimentProviderImpl$getOrDefault$2<T extends vn11> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerSessionExperimentProviderImpl$getOrDefault$2(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
