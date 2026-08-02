package ru.yandex.taxi.stories.data.data_sources.items.remote.single;

import defpackage.fuc;
import defpackage.g8e;
import defpackage.iuc;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.ssf0;
import java.util.Collections;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.d;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes10.dex */
public final class a {
    public final fuc a;
    public final d b;

    public a(fuc fucVar, d dVar) {
        this.a = fucVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, ContinuationImpl continuationImpl) {
        StoriesItemsSingleRemoteDataSourceImpl$createPromotionParam$1 storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1;
        int i2;
        List list;
        List list2;
        jsq0 jsq0Var;
        String str2;
        int i3;
        if (continuationImpl instanceof StoriesItemsSingleRemoteDataSourceImpl$createPromotionParam$1) {
            storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1 = (StoriesItemsSingleRemoteDataSourceImpl$createPromotionParam$1) continuationImpl;
            int i4 = storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.label = i4 - Integer.MIN_VALUE;
                Object obj = storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    List g = scc.g("close_button", "link", "action_button");
                    k4o b = PromotionBackground.Type.b();
                    jsq0 jsq0Var2 = ksq0.a;
                    jsq0 jsq0Var3 = new jsq0(b);
                    List singletonList = Collections.singletonList("animation");
                    storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.L$0 = str;
                    storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.L$1 = g;
                    storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.L$2 = jsq0Var3;
                    storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.L$3 = singletonList;
                    storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.I$0 = i;
                    storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.label = 1;
                    Object a = this.b.a(storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = g;
                    list2 = singletonList;
                    jsq0Var = jsq0Var3;
                    str2 = str;
                    i3 = i;
                    obj = a;
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.I$0;
                    List list3 = (List) storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.L$3;
                    jsq0 jsq0Var4 = (jsq0) storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.L$2;
                    List list4 = (List) storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.L$1;
                    String str3 = (String) storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.L$0;
                    b.b(obj);
                    i3 = i5;
                    str2 = str3;
                    list2 = list3;
                    jsq0Var = jsq0Var4;
                    list = list4;
                }
                return new ssf0(null, str2, i3, list, jsq0Var, list2, null, null, (iuc) obj, null, null, null, 7561);
            }
        }
        storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1 = new StoriesItemsSingleRemoteDataSourceImpl$createPromotionParam$1(this, continuationImpl);
        Object obj2 = storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = storiesItemsSingleRemoteDataSourceImpl$createPromotionParam$1.label;
        if (i2 != 0) {
        }
        return new ssf0(null, str2, i3, list, jsq0Var, list2, null, null, (iuc) obj2, null, null, null, 7561);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, int i, RetryPolicy retryPolicy, ContinuationImpl continuationImpl) {
        StoriesItemsSingleRemoteDataSourceImpl$createStoryDownload$1 storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1;
        Object obj;
        Object obj2;
        int i2;
        fuc fucVar;
        String str2;
        Promotion promotion;
        if (continuationImpl instanceof StoriesItemsSingleRemoteDataSourceImpl$createStoryDownload$1) {
            storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1 = (StoriesItemsSingleRemoteDataSourceImpl$createStoryDownload$1) continuationImpl;
            int i3 = storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.label = i3 - Integer.MIN_VALUE;
                obj = storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$0 = str;
                    storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$1 = retryPolicy;
                    fuc fucVar2 = this.a;
                    storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$2 = fucVar2;
                    storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.I$0 = i;
                    storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.label = 1;
                    Object a = a(i, str, storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1);
                    if (a != obj2) {
                        obj = a;
                        fucVar = fucVar2;
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$0;
                    b.b(obj);
                    promotion = (Promotion) obj;
                    if (!(promotion instanceof Story)) {
                        return promotion;
                    }
                    ny61.g(g8e.o("wrong response type for promotion with id=", str2));
                    return null;
                }
                i = storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.I$0;
                fucVar = (fuc) storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$2;
                retryPolicy = (RetryPolicy) storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$1;
                str = (String) storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$0;
                b.b(obj);
                storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$0 = str;
                storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$1 = null;
                storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$2 = null;
                storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.I$0 = i;
                storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.label = 2;
                obj = ((ru.yandex.taxi.communications.common.repository.a) fucVar).b((ssf0) obj, retryPolicy, storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1);
                if (obj != obj2) {
                    str2 = str;
                    promotion = (Promotion) obj;
                    if (!(promotion instanceof Story)) {
                    }
                }
                return obj2;
            }
        }
        storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1 = new StoriesItemsSingleRemoteDataSourceImpl$createStoryDownload$1(this, continuationImpl);
        obj = storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.label;
        if (i2 != 0) {
        }
        storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$0 = str;
        storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$1 = null;
        storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.L$2 = null;
        storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.I$0 = i;
        storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1.label = 2;
        obj = ((ru.yandex.taxi.communications.common.repository.a) fucVar).b((ssf0) obj, retryPolicy, storiesItemsSingleRemoteDataSourceImpl$createStoryDownload$1);
        if (obj != obj2) {
        }
        return obj2;
    }
}
