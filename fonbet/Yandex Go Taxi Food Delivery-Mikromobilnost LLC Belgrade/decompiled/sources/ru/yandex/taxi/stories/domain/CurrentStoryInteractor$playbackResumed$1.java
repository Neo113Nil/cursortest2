package ru.yandex.taxi.stories.domain;

import defpackage.mvg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.stories.domain.CurrentStoryInteractor", f = "CurrentStoryInteractor.kt", l = {145}, m = "playbackResumed", v = 2)
/* loaded from: classes6.dex */
final class CurrentStoryInteractor$playbackResumed$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentStoryInteractor$playbackResumed$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.h(this);
        return zy11.a;
    }
}
