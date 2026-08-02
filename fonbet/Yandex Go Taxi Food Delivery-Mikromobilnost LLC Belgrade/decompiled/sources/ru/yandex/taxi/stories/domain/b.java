package ru.yandex.taxi.stories.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.anu0;
import defpackage.cou0;
import defpackage.fmu0;
import defpackage.gmu0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.sul;
import defpackage.tje;
import defpackage.tse;
import defpackage.zmu0;
import defpackage.zy11;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.promotions.model.d;

/* loaded from: classes10.dex */
public final class b {
    public final int a;
    public final anu0 b;
    public final ru.yandex.taxi.stories.data.repositories.items.b c;
    public final ru.yandex.taxi.stories.domain.provider.a d;
    public final ru.yandex.taxi.stories.domain.notifications.a e;
    public final cou0 f;
    public final AtomicBoolean g = new AtomicBoolean(true);

    public b(int i, anu0 anu0Var, ru.yandex.taxi.stories.data.repositories.items.b bVar, sul sulVar, ru.yandex.taxi.stories.domain.provider.a aVar, ru.yandex.taxi.stories.domain.notifications.a aVar2, cou0 cou0Var) {
        this.a = i;
        this.b = anu0Var;
        this.c = bVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = cou0Var;
    }

    public final void a(Lifecycle lifecycle, tse tseVar) {
        tje.N(tseVar, null, null, new StoriesInteractorImpl$init$1(this, lifecycle, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (defpackage.bvf0.n(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Double d, Double d2, Integer num, String str, ContinuationImpl continuationImpl) {
        StoriesInteractorImpl$loadStories$1 storiesInteractorImpl$loadStories$1;
        int i;
        if (continuationImpl instanceof StoriesInteractorImpl$loadStories$1) {
            storiesInteractorImpl$loadStories$1 = (StoriesInteractorImpl$loadStories$1) continuationImpl;
            int i2 = storiesInteractorImpl$loadStories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesInteractorImpl$loadStories$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesInteractorImpl$loadStories$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesInteractorImpl$loadStories$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gmu0 gmu0Var = new gmu0(d, d2, num, str);
                    storiesInteractorImpl$loadStories$1.L$0 = null;
                    storiesInteractorImpl$loadStories$1.L$1 = null;
                    storiesInteractorImpl$loadStories$1.L$2 = null;
                    storiesInteractorImpl$loadStories$1.L$3 = null;
                    storiesInteractorImpl$loadStories$1.L$4 = null;
                    storiesInteractorImpl$loadStories$1.L$5 = null;
                    storiesInteractorImpl$loadStories$1.label = 1;
                    obj = this.c.b(gmu0Var, storiesInteractorImpl$loadStories$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                StoriesInteractorImpl$loadStories$2 storiesInteractorImpl$loadStories$2 = new StoriesInteractorImpl$loadStories$2(this, (fmu0) obj, null);
                storiesInteractorImpl$loadStories$1.L$0 = null;
                storiesInteractorImpl$loadStories$1.L$1 = null;
                storiesInteractorImpl$loadStories$1.L$2 = null;
                storiesInteractorImpl$loadStories$1.L$3 = null;
                storiesInteractorImpl$loadStories$1.L$4 = null;
                storiesInteractorImpl$loadStories$1.L$5 = null;
                storiesInteractorImpl$loadStories$1.L$6 = null;
                storiesInteractorImpl$loadStories$1.label = 2;
            }
        }
        storiesInteractorImpl$loadStories$1 = new StoriesInteractorImpl$loadStories$1(this, continuationImpl);
        Object obj2 = storiesInteractorImpl$loadStories$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesInteractorImpl$loadStories$1.label;
        if (i != 0) {
        }
        StoriesInteractorImpl$loadStories$2 storiesInteractorImpl$loadStories$22 = new StoriesInteractorImpl$loadStories$2(this, (fmu0) obj2, null);
        storiesInteractorImpl$loadStories$1.L$0 = null;
        storiesInteractorImpl$loadStories$1.L$1 = null;
        storiesInteractorImpl$loadStories$1.L$2 = null;
        storiesInteractorImpl$loadStories$1.L$3 = null;
        storiesInteractorImpl$loadStories$1.L$4 = null;
        storiesInteractorImpl$loadStories$1.L$5 = null;
        storiesInteractorImpl$loadStories$1.L$6 = null;
        storiesInteractorImpl$loadStories$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        if (r8.length() != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Story story, AbstractCollection abstractCollection) {
        String str;
        anu0 anu0Var = this.b;
        zmu0 zmu0Var = new zmu0(anu0Var, story, 1);
        List list = story.i.d;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (abstractCollection.contains(Integer.valueOf(i))) {
                arrayList.add(obj);
            }
            i = i2;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Story.b bVar = (Story.b) it.next();
            d dVar = PromotionBackground.Companion;
            List e = bVar.getE();
            PromotionBackground.Type type = PromotionBackground.Type.IMAGE;
            dVar.getClass();
            String b = d.b(e, type);
            if (b == null || b.length() == 0) {
                b = null;
            }
            if (b != null) {
                zmu0Var.invoke(b);
            }
            Story.c f = bVar.getF();
            String b2 = (f == null || f.getA() != Story.PageMediaType.IMAGE || f.getB().length() <= 0) ? null : f.getB();
            if (b2 != null) {
                zmu0Var.invoke(b2);
            }
            String b3 = d.b(bVar.getE(), PromotionBackground.Type.VIDEO);
            if (b3 != null && b3.length() > 0) {
                File d = anu0Var.c.d(b3);
                str = d.exists() ? d.getAbsolutePath() : null;
                if (str != null) {
                }
            }
            str = null;
            if (str != null) {
                zmu0Var.invoke(str);
            }
        }
    }
}
