package ru.yandex.taxi.stories.domain.provider;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.stories.domain.provider.StoriesProviderInteractorImpl", f = "StoriesProviderInteractorImpl.kt", l = {36}, m = "getStoryOrDownload", v = 2)
/* loaded from: classes6.dex */
final class StoriesProviderInteractorImpl$getStoryOrDownload$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesProviderInteractorImpl$getStoryOrDownload$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, 0, null, this);
    }
}
