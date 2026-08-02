package ru.yandex.taxi.stories.data.repositories.items;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.communications.api.dto.Story;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/communications/api/dto/Story;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/communications/api/dto/Story;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.data.repositories.items.StoriesItemsRepositoryImpl$getStoryDownload$1", f = "StoriesItemsRepositoryImpl.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoriesItemsRepositoryImpl$getStoryDownload$1 extends SuspendLambda implements wls {
    final /* synthetic */ RetryPolicy $retryPolicy;
    final /* synthetic */ int $screenDensityDpi;
    final /* synthetic */ String $storyId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesItemsRepositoryImpl$getStoryDownload$1(b bVar, String str, int i, RetryPolicy retryPolicy, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$storyId = str;
        this.$screenDensityDpi = i;
        this.$retryPolicy = retryPolicy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoriesItemsRepositoryImpl$getStoryDownload$1(this.this$0, this.$storyId, this.$screenDensityDpi, this.$retryPolicy, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoriesItemsRepositoryImpl$getStoryDownload$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Story story;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                String str = this.$storyId;
                this.label = 1;
                obj = bVar.a.a.g(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    story = (Story) obj;
                    return story;
                }
                kotlin.b.b(obj);
            }
            story = (Story) obj;
            if (story == null) {
                b bVar2 = this.this$0;
                String str2 = this.$storyId;
                int i2 = this.$screenDensityDpi;
                RetryPolicy retryPolicy = this.$retryPolicy;
                this.label = 2;
                obj = b.a(bVar2, str2, i2, retryPolicy, this);
            }
            return story;
        } finally {
            this.this$0.d.remove(this.$storyId);
        }
    }
}
