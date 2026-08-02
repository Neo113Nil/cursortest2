package ru.yandex.taxi.stories.data.repositories.items;

import defpackage.bvf0;
import defpackage.fmu0;
import defpackage.gmu0;
import defpackage.hjt;
import defpackage.ny61;
import defpackage.tje;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes10.dex */
public final class b {
    public final ru.yandex.taxi.stories.data.data_sources.items.local.a a;
    public final ru.yandex.taxi.stories.data.data_sources.items.remote.single.a b;
    public final ru.yandex.taxi.stories.data.data_sources.items.remote.diff.a c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final LinkedHashMap e = new LinkedHashMap();

    public b(ru.yandex.taxi.stories.data.data_sources.items.local.a aVar, ru.yandex.taxi.stories.data.data_sources.items.remote.single.a aVar2, ru.yandex.taxi.stories.data.data_sources.items.remote.diff.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, int i, RetryPolicy retryPolicy, ContinuationImpl continuationImpl) {
        StoriesItemsRepositoryImpl$createStoryDownload$1 storiesItemsRepositoryImpl$createStoryDownload$1;
        int i2;
        bVar.getClass();
        if (continuationImpl instanceof StoriesItemsRepositoryImpl$createStoryDownload$1) {
            storiesItemsRepositoryImpl$createStoryDownload$1 = (StoriesItemsRepositoryImpl$createStoryDownload$1) continuationImpl;
            int i3 = storiesItemsRepositoryImpl$createStoryDownload$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                storiesItemsRepositoryImpl$createStoryDownload$1.label = i3 - Integer.MIN_VALUE;
                Object obj = storiesItemsRepositoryImpl$createStoryDownload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = storiesItemsRepositoryImpl$createStoryDownload$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.stories.data.data_sources.items.remote.single.a aVar = bVar.b;
                    storiesItemsRepositoryImpl$createStoryDownload$1.L$0 = null;
                    storiesItemsRepositoryImpl$createStoryDownload$1.L$1 = null;
                    storiesItemsRepositoryImpl$createStoryDownload$1.I$0 = i;
                    storiesItemsRepositoryImpl$createStoryDownload$1.label = 1;
                    obj = aVar.b(str, i, retryPolicy, storiesItemsRepositoryImpl$createStoryDownload$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = storiesItemsRepositoryImpl$createStoryDownload$1.L$2;
                        kotlin.b.b(obj);
                        return obj2;
                    }
                    i = storiesItemsRepositoryImpl$createStoryDownload$1.I$0;
                    kotlin.b.b(obj);
                }
                storiesItemsRepositoryImpl$createStoryDownload$1.L$0 = null;
                storiesItemsRepositoryImpl$createStoryDownload$1.L$1 = null;
                storiesItemsRepositoryImpl$createStoryDownload$1.L$2 = obj;
                storiesItemsRepositoryImpl$createStoryDownload$1.L$3 = null;
                storiesItemsRepositoryImpl$createStoryDownload$1.I$0 = i;
                storiesItemsRepositoryImpl$createStoryDownload$1.label = 2;
                return bVar.a.a.a((Story) obj, storiesItemsRepositoryImpl$createStoryDownload$1) != coroutineSingletons ? coroutineSingletons : obj;
            }
        }
        storiesItemsRepositoryImpl$createStoryDownload$1 = new StoriesItemsRepositoryImpl$createStoryDownload$1(bVar, continuationImpl);
        Object obj3 = storiesItemsRepositoryImpl$createStoryDownload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = storiesItemsRepositoryImpl$createStoryDownload$1.label;
        if (i2 != 0) {
        }
        storiesItemsRepositoryImpl$createStoryDownload$1.L$0 = null;
        storiesItemsRepositoryImpl$createStoryDownload$1.L$1 = null;
        storiesItemsRepositoryImpl$createStoryDownload$1.L$2 = obj3;
        storiesItemsRepositoryImpl$createStoryDownload$1.L$3 = null;
        storiesItemsRepositoryImpl$createStoryDownload$1.I$0 = i;
        storiesItemsRepositoryImpl$createStoryDownload$1.label = 2;
        if (bVar.a.a.a((Story) obj3, storiesItemsRepositoryImpl$createStoryDownload$1) != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r10 != r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r10 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(gmu0 gmu0Var, ContinuationImpl continuationImpl) {
        StoriesItemsRepositoryImpl$downloadStories$1 storiesItemsRepositoryImpl$downloadStories$1;
        int i;
        ru.yandex.taxi.stories.data.data_sources.items.remote.diff.a aVar;
        ru.yandex.taxi.stories.data.storage.a aVar2 = this.a.a;
        if (continuationImpl instanceof StoriesItemsRepositoryImpl$downloadStories$1) {
            storiesItemsRepositoryImpl$downloadStories$1 = (StoriesItemsRepositoryImpl$downloadStories$1) continuationImpl;
            int i2 = storiesItemsRepositoryImpl$downloadStories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesItemsRepositoryImpl$downloadStories$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesItemsRepositoryImpl$downloadStories$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesItemsRepositoryImpl$downloadStories$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    storiesItemsRepositoryImpl$downloadStories$1.L$0 = null;
                    aVar = this.c;
                    storiesItemsRepositoryImpl$downloadStories$1.L$1 = aVar;
                    storiesItemsRepositoryImpl$downloadStories$1.L$2 = gmu0Var;
                    storiesItemsRepositoryImpl$downloadStories$1.label = 1;
                    obj = aVar2.h(storiesItemsRepositoryImpl$downloadStories$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fmu0 fmu0Var = (fmu0) storiesItemsRepositoryImpl$downloadStories$1.L$1;
                            kotlin.b.b(obj);
                            return fmu0Var;
                        }
                        kotlin.b.b(obj);
                        Pair pair = (Pair) obj;
                        fmu0 fmu0Var2 = (fmu0) pair.getFirst();
                        List list = (List) pair.getSecond();
                        storiesItemsRepositoryImpl$downloadStories$1.L$0 = null;
                        storiesItemsRepositoryImpl$downloadStories$1.L$1 = fmu0Var2;
                        storiesItemsRepositoryImpl$downloadStories$1.L$2 = null;
                        storiesItemsRepositoryImpl$downloadStories$1.label = 3;
                        return aVar2.d(list, storiesItemsRepositoryImpl$downloadStories$1) == coroutineSingletons ? coroutineSingletons : fmu0Var2;
                    }
                    gmu0Var = (gmu0) storiesItemsRepositoryImpl$downloadStories$1.L$2;
                    aVar = (ru.yandex.taxi.stories.data.data_sources.items.remote.diff.a) storiesItemsRepositoryImpl$downloadStories$1.L$1;
                    kotlin.b.b(obj);
                }
                storiesItemsRepositoryImpl$downloadStories$1.L$0 = null;
                storiesItemsRepositoryImpl$downloadStories$1.L$1 = null;
                storiesItemsRepositoryImpl$downloadStories$1.L$2 = null;
                storiesItemsRepositoryImpl$downloadStories$1.label = 2;
                obj = aVar.a(gmu0Var, (List) obj, storiesItemsRepositoryImpl$downloadStories$1);
            }
        }
        storiesItemsRepositoryImpl$downloadStories$1 = new StoriesItemsRepositoryImpl$downloadStories$1(this, continuationImpl);
        Object obj2 = storiesItemsRepositoryImpl$downloadStories$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesItemsRepositoryImpl$downloadStories$1.label;
        if (i != 0) {
        }
        storiesItemsRepositoryImpl$downloadStories$1.L$0 = null;
        storiesItemsRepositoryImpl$downloadStories$1.L$1 = null;
        storiesItemsRepositoryImpl$downloadStories$1.L$2 = null;
        storiesItemsRepositoryImpl$downloadStories$1.label = 2;
        obj2 = aVar.a(gmu0Var, (List) obj2, storiesItemsRepositoryImpl$downloadStories$1);
    }

    public final Object c(String str, int i, RetryPolicy retryPolicy, Continuation continuation) {
        return bvf0.n(new StoriesItemsRepositoryImpl$getOrDownloadStory$2(this, str, i, retryPolicy, null), continuation);
    }

    public final void d() {
        tje.N(hjt.a, null, null, new StoriesItemsRepositoryImpl$loadAllStoriesIntoMemCache$1(this, null), 3);
    }
}
