package ru.yandex.taxi.stories.data.data_sources.items.remote.diff;

import defpackage.fmu0;
import defpackage.fuc;
import defpackage.gmu0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vby;
import defpackage.xby;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes10.dex */
public final class a {
    public final fuc a;

    public a(fuc fucVar) {
        this.a = fucVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123 A[LOOP:3: B:36:0x011d->B:38:0x0123, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(gmu0 gmu0Var, List list, ContinuationImpl continuationImpl) {
        StoriesItemsDiffRemoteDataSourceImpl$loadStories$1 storiesItemsDiffRemoteDataSourceImpl$loadStories$1;
        int i;
        Iterator it;
        Iterator it2;
        if (continuationImpl instanceof StoriesItemsDiffRemoteDataSourceImpl$loadStories$1) {
            storiesItemsDiffRemoteDataSourceImpl$loadStories$1 = (StoriesItemsDiffRemoteDataSourceImpl$loadStories$1) continuationImpl;
            int i2 = storiesItemsDiffRemoteDataSourceImpl$loadStories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesItemsDiffRemoteDataSourceImpl$loadStories$1.label = i2 - Integer.MIN_VALUE;
                StoriesItemsDiffRemoteDataSourceImpl$loadStories$1 storiesItemsDiffRemoteDataSourceImpl$loadStories$12 = storiesItemsDiffRemoteDataSourceImpl$loadStories$1;
                Object obj = storiesItemsDiffRemoteDataSourceImpl$loadStories$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesItemsDiffRemoteDataSourceImpl$loadStories$12.label;
                Integer num = null;
                if (i != 0) {
                    b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((Story) it3.next()).b);
                    }
                    String d = gmu0Var.d();
                    Double b = gmu0Var.b();
                    Double c = gmu0Var.c();
                    Integer a = gmu0Var.a();
                    storiesItemsDiffRemoteDataSourceImpl$loadStories$12.L$0 = null;
                    storiesItemsDiffRemoteDataSourceImpl$loadStories$12.L$1 = list;
                    storiesItemsDiffRemoteDataSourceImpl$loadStories$12.label = 1;
                    obj = ((ru.yandex.taxi.communications.common.repository.a) this.a).d(arrayList, d, b, c, a, null, storiesItemsDiffRemoteDataSourceImpl$loadStories$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) storiesItemsDiffRemoteDataSourceImpl$loadStories$12.L$1;
                    b.b(obj);
                }
                fmu0 fmu0Var = (fmu0) obj;
                vby vbyVar = xby.d;
                String.format("load stories done, new: %d, to_remove: %d", Arrays.copyOf(new Object[]{new Integer(fmu0Var.b().size()), new Integer(fmu0Var.a().size())}, 2));
                vbyVar.getClass();
                List list3 = list;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    if (!fmu0Var.a().contains(((Story) obj2).b)) {
                        arrayList2.add(obj2);
                    }
                }
                List b2 = fmu0Var.b();
                it = list3.iterator();
                if (it.hasNext()) {
                    Integer valueOf = Integer.valueOf(((Story) it.next()).j);
                    loop1: while (true) {
                        num = valueOf;
                        while (it.hasNext()) {
                            valueOf = Integer.valueOf(((Story) it.next()).j);
                            if (num.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                int intValue = num == null ? num.intValue() : 0;
                List list4 = b2;
                it2 = list4.iterator();
                while (it2.hasNext()) {
                    intValue++;
                    ((Story) it2.next()).j = intValue;
                }
                return new Pair(fmu0Var, kotlin.collections.a.m0(list4, arrayList2));
            }
        }
        storiesItemsDiffRemoteDataSourceImpl$loadStories$1 = new StoriesItemsDiffRemoteDataSourceImpl$loadStories$1(this, continuationImpl);
        StoriesItemsDiffRemoteDataSourceImpl$loadStories$1 storiesItemsDiffRemoteDataSourceImpl$loadStories$122 = storiesItemsDiffRemoteDataSourceImpl$loadStories$1;
        Object obj3 = storiesItemsDiffRemoteDataSourceImpl$loadStories$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesItemsDiffRemoteDataSourceImpl$loadStories$122.label;
        Integer num2 = null;
        if (i != 0) {
        }
        fmu0 fmu0Var2 = (fmu0) obj3;
        vby vbyVar2 = xby.d;
        String.format("load stories done, new: %d, to_remove: %d", Arrays.copyOf(new Object[]{new Integer(fmu0Var2.b().size()), new Integer(fmu0Var2.a().size())}, 2));
        vbyVar2.getClass();
        List list32 = list;
        ArrayList arrayList22 = new ArrayList();
        while (r12.hasNext()) {
        }
        List b22 = fmu0Var2.b();
        it = list32.iterator();
        if (it.hasNext()) {
        }
        if (num2 == null) {
        }
        List list42 = b22;
        it2 = list42.iterator();
        while (it2.hasNext()) {
        }
        return new Pair(fmu0Var2, kotlin.collections.a.m0(list42, arrayList22));
    }
}
