package ru.yandex.taxi.stories.data.data_sources.items.local;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.stories.data.data_sources.items.local.StoriesItemsDataSourceImpl", f = "StoriesItemsDataSourceImpl.kt", l = {34}, m = "loadAllStoriesIntoMemCache", v = 2)
/* loaded from: classes10.dex */
final class StoriesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
