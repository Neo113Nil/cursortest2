package ru.yandex.taxi.stories.data.repositories.items;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yu0;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/communications/api/dto/Story;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/communications/api/dto/Story;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.data.repositories.items.StoriesItemsRepositoryImpl$getOrDownloadStory$2", f = "StoriesItemsRepositoryImpl.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoriesItemsRepositoryImpl$getOrDownloadStory$2 extends SuspendLambda implements wls {
    final /* synthetic */ RetryPolicy $retryPolicy;
    final /* synthetic */ int $screenDensityDpi;
    final /* synthetic */ String $storyId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesItemsRepositoryImpl$getOrDownloadStory$2(b bVar, String str, int i, RetryPolicy retryPolicy, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$storyId = str;
        this.$screenDensityDpi = i;
        this.$retryPolicy = retryPolicy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StoriesItemsRepositoryImpl$getOrDownloadStory$2 storiesItemsRepositoryImpl$getOrDownloadStory$2 = new StoriesItemsRepositoryImpl$getOrDownloadStory$2(this.this$0, this.$storyId, this.$screenDensityDpi, this.$retryPolicy, continuation);
        storiesItemsRepositoryImpl$getOrDownloadStory$2.L$0 = obj;
        return storiesItemsRepositoryImpl$getOrDownloadStory$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoriesItemsRepositoryImpl$getOrDownloadStory$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        ConcurrentHashMap concurrentHashMap = bVar.d;
        String str = this.$storyId;
        noh nohVar = (noh) concurrentHashMap.computeIfAbsent(str, new yu0(22, new a(bVar, tseVar, str, this.$screenDensityDpi, this.$retryPolicy)));
        this.L$0 = null;
        this.label = 1;
        Object k = nohVar.k(this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
