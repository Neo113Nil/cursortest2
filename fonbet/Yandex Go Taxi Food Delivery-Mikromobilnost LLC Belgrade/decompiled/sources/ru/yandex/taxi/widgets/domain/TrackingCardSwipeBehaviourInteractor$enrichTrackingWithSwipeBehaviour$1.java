package ru.yandex.taxi.widgets.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.widgets.domain.TrackingCardSwipeBehaviourInteractor", f = "TrackingCardSwipeBehaviourInteractor.kt", l = {29}, m = "enrichTrackingWithSwipeBehaviour$impl", v = 2)
/* loaded from: classes6.dex */
final class TrackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, this);
    }
}
