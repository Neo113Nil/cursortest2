package ru.yandex.taxi.stories.domain.provider;

import android.content.SharedPreferences;
import defpackage.cou0;
import defpackage.eja1;
import defpackage.inu0;
import defpackage.jnu0;
import defpackage.knu0;
import defpackage.lay0;
import defpackage.lei0;
import defpackage.ny61;
import defpackage.oe7;
import defpackage.sn1;
import defpackage.sul;
import defpackage.zpf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.stories.data.repositories.items.b;

/* loaded from: classes10.dex */
public final class a {
    public final cou0 a;
    public final zpf0 b;
    public final b c;
    public final sul d;

    public a(cou0 cou0Var, zpf0 zpf0Var, knu0 knu0Var, b bVar, sul sulVar) {
        this.a = cou0Var;
        this.b = zpf0Var;
        this.c = bVar;
        this.d = sulVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        StoriesProviderInteractorImpl$getStoriesForScreen$2 storiesProviderInteractorImpl$getStoriesForScreen$2;
        int i;
        Iterator it;
        if (continuationImpl instanceof StoriesProviderInteractorImpl$getStoriesForScreen$2) {
            storiesProviderInteractorImpl$getStoriesForScreen$2 = (StoriesProviderInteractorImpl$getStoriesForScreen$2) continuationImpl;
            int i2 = storiesProviderInteractorImpl$getStoriesForScreen$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesProviderInteractorImpl$getStoriesForScreen$2.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesProviderInteractorImpl$getStoriesForScreen$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesProviderInteractorImpl$getStoriesForScreen$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    storiesProviderInteractorImpl$getStoriesForScreen$2.L$0 = str;
                    storiesProviderInteractorImpl$getStoriesForScreen$2.L$1 = list;
                    storiesProviderInteractorImpl$getStoriesForScreen$2.label = 1;
                    obj = this.c.a.a.h(storiesProviderInteractorImpl$getStoriesForScreen$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) storiesProviderInteractorImpl$getStoriesForScreen$2.L$1;
                    str = (String) storiesProviderInteractorImpl$getStoriesForScreen$2.L$0;
                    kotlin.b.b(obj);
                }
                ArrayList o = eja1.o(str, (List) obj);
                d(o);
                ArrayList arrayList = new ArrayList();
                it = o.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (list.contains(((Story) next).b)) {
                        arrayList.add(next);
                    }
                }
                int i3 = 12;
                return kotlin.collections.a.x0(arrayList, new oe7(i3, new sn1(list, i3)));
            }
        }
        storiesProviderInteractorImpl$getStoriesForScreen$2 = new StoriesProviderInteractorImpl$getStoriesForScreen$2(this, continuationImpl);
        Object obj2 = storiesProviderInteractorImpl$getStoriesForScreen$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesProviderInteractorImpl$getStoriesForScreen$2.label;
        if (i != 0) {
        }
        ArrayList o2 = eja1.o(str, (List) obj2);
        d(o2);
        ArrayList arrayList2 = new ArrayList();
        it = o2.iterator();
        while (it.hasNext()) {
        }
        int i32 = 12;
        return kotlin.collections.a.x0(arrayList2, new oe7(i32, new sn1(list, i32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        StoriesProviderInteractorImpl$getStoriesForScreen$1 storiesProviderInteractorImpl$getStoriesForScreen$1;
        int i;
        if (continuationImpl instanceof StoriesProviderInteractorImpl$getStoriesForScreen$1) {
            storiesProviderInteractorImpl$getStoriesForScreen$1 = (StoriesProviderInteractorImpl$getStoriesForScreen$1) continuationImpl;
            int i2 = storiesProviderInteractorImpl$getStoriesForScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesProviderInteractorImpl$getStoriesForScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesProviderInteractorImpl$getStoriesForScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesProviderInteractorImpl$getStoriesForScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    storiesProviderInteractorImpl$getStoriesForScreen$1.L$0 = str;
                    storiesProviderInteractorImpl$getStoriesForScreen$1.label = 1;
                    obj = this.c.a.a.h(storiesProviderInteractorImpl$getStoriesForScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) storiesProviderInteractorImpl$getStoriesForScreen$1.L$0;
                    kotlin.b.b(obj);
                }
                ArrayList o = eja1.o(str, (List) obj);
                d(o);
                return kotlin.collections.a.x0(kotlin.collections.a.x0(o, new jnu0()), new inu0());
            }
        }
        storiesProviderInteractorImpl$getStoriesForScreen$1 = new StoriesProviderInteractorImpl$getStoriesForScreen$1(this, continuationImpl);
        Object obj2 = storiesProviderInteractorImpl$getStoriesForScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesProviderInteractorImpl$getStoriesForScreen$1.label;
        if (i != 0) {
        }
        ArrayList o2 = eja1.o(str, (List) obj2);
        d(o2);
        return kotlin.collections.a.x0(kotlin.collections.a.x0(o2, new jnu0()), new inu0());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, int i, RetryPolicy retryPolicy, ContinuationImpl continuationImpl) {
        StoriesProviderInteractorImpl$getStoryOrDownload$1 storiesProviderInteractorImpl$getStoryOrDownload$1;
        int i2;
        Map c;
        if (continuationImpl instanceof StoriesProviderInteractorImpl$getStoryOrDownload$1) {
            storiesProviderInteractorImpl$getStoryOrDownload$1 = (StoriesProviderInteractorImpl$getStoryOrDownload$1) continuationImpl;
            int i3 = storiesProviderInteractorImpl$getStoryOrDownload$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                storiesProviderInteractorImpl$getStoryOrDownload$1.label = i3 - Integer.MIN_VALUE;
                Object obj = storiesProviderInteractorImpl$getStoryOrDownload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = storiesProviderInteractorImpl$getStoryOrDownload$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    storiesProviderInteractorImpl$getStoryOrDownload$1.L$0 = null;
                    storiesProviderInteractorImpl$getStoryOrDownload$1.L$1 = null;
                    storiesProviderInteractorImpl$getStoryOrDownload$1.I$0 = i;
                    storiesProviderInteractorImpl$getStoryOrDownload$1.label = 1;
                    obj = this.c.c(str, i, retryPolicy, storiesProviderInteractorImpl$getStoryOrDownload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Story story = (Story) obj;
                ((lay0) this.a).a(story);
                zpf0 zpf0Var = this.b;
                zpf0Var.getClass();
                c = story.getC();
                if (c != null) {
                    ((com.yandex.go.analytics.realtime.a) zpf0Var.a).d(new lei0(zpf0.f(story), story.getB(), c));
                }
                return obj;
            }
        }
        storiesProviderInteractorImpl$getStoryOrDownload$1 = new StoriesProviderInteractorImpl$getStoryOrDownload$1(this, continuationImpl);
        Object obj2 = storiesProviderInteractorImpl$getStoryOrDownload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = storiesProviderInteractorImpl$getStoryOrDownload$1.label;
        if (i2 != 0) {
        }
        Story story2 = (Story) obj2;
        ((lay0) this.a).a(story2);
        zpf0 zpf0Var2 = this.b;
        zpf0Var2.getClass();
        c = story2.getC();
        if (c != null) {
        }
        return obj2;
    }

    public final void d(ArrayList arrayList) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.d.a.getValue();
        Set<String> set = EmptySet.a;
        Set<String> stringSet = sharedPreferences.getStringSet("viewed_ids", set);
        if (stringSet != null) {
            set = stringSet;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Story story = (Story) it.next();
            story.k = set.contains(story.b);
        }
    }
}
