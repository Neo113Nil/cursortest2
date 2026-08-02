package ru.yandex.taxi.preorder.source.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointLocationOnStartInteractor", f = "SourcePointLocationOnStartInteractor.kt", l = {110, 112}, m = "handleLocationRequirementsException", v = 2)
/* loaded from: classes6.dex */
final class SourcePointLocationOnStartInteractor$handleLocationRequirementsException$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointLocationOnStartInteractor$handleLocationRequirementsException$1(t tVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return t.e(this.this$0, null, this);
    }
}
