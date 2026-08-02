package ru.yandex.taxi.stories.data.data_sources.items.local;

import defpackage.ny61;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a {
    public final ru.yandex.taxi.stories.data.storage.a a;

    public a(ru.yandex.taxi.stories.data.storage.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        defpackage.xby.d.k(r4, "Error preloading stories mem cache");
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        StoriesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1 storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1;
        int i;
        if (continuationImpl instanceof StoriesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1) {
            storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1 = (StoriesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1) continuationImpl;
            int i2 = storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1.label;
                if (i != 0) {
                    b.b(obj);
                    ru.yandex.taxi.stories.data.storage.a aVar = this.a;
                    storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1.label = 1;
                    if (aVar.e(storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1 = new StoriesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1(this, continuationImpl);
        Object obj2 = storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesItemsDataSourceImpl$loadAllStoriesIntoMemCache$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
