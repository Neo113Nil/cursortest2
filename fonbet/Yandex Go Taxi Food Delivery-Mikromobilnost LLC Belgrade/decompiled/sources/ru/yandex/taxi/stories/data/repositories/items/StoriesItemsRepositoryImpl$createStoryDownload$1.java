package ru.yandex.taxi.stories.data.repositories.items;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.stories.data.repositories.items.StoriesItemsRepositoryImpl", f = "StoriesItemsRepositoryImpl.kt", l = {MSException.ERROR_INVALID_PASSWORD, MSException.ERROR_INVALID_PARAMETER}, m = "createStoryDownload", v = 2)
/* loaded from: classes6.dex */
final class StoriesItemsRepositoryImpl$createStoryDownload$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesItemsRepositoryImpl$createStoryDownload$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(this.this$0, null, 0, null, this);
    }
}
