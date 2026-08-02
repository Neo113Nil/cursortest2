package ru.yandex.taxi.stories.domain;

import defpackage.cou0;
import defpackage.dou0;
import defpackage.gou0;
import defpackage.klf0;
import defpackage.lay0;
import defpackage.n9y0;
import defpackage.ny61;
import defpackage.rx2;
import defpackage.zpf0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.promotions.model.d;

/* loaded from: classes6.dex */
public final class a {
    public final ru.yandex.taxi.stories.data.caching.a a;
    public final cou0 b;
    public final klf0 c;
    public final zpf0 d;
    public final b e;
    public final gou0 f;
    public boolean g;
    public List h = EmptyList.a;
    public int i;
    public int j;
    public int k;
    public int l;
    public float m;
    public long n;
    public boolean o;

    public a(ru.yandex.taxi.stories.data.caching.a aVar, cou0 cou0Var, klf0 klf0Var, zpf0 zpf0Var, b bVar, gou0 gou0Var) {
        this.a = aVar;
        this.b = cou0Var;
        this.c = klf0Var;
        this.d = zpf0Var;
        this.e = bVar;
        this.f = gou0Var;
    }

    public final void a(StoryWidgets.ActionType actionType, String str, String str2, Map map) {
        Story d = d();
        if (d != null) {
            int i = this.j + 1;
            gou0 gou0Var = this.f;
            this.d.b(d, i, map, gou0Var.a);
            String str3 = gou0Var.a;
            String lowerCase = String.valueOf(actionType).toLowerCase(Locale.ROOT);
            int i2 = this.i;
            int size = d.i.d.size();
            int i3 = this.j;
            long j = this.n;
            PromotionBackground.Type c = c();
            ((n9y0) this.c).c(d, str3, lowerCase, str, str2, Integer.valueOf(i2), i3, size, j, c);
        }
    }

    public final void b(Story story) {
        List list;
        Story.b bVar = (Story.b) kotlin.collections.a.S(0, story.i.d);
        if (bVar == null || (list = bVar.e) == null) {
            return;
        }
        d dVar = PromotionBackground.Companion;
        PromotionBackground.Type type = PromotionBackground.Type.VIDEO;
        dVar.getClass();
        PromotionBackground d = d.d(list, type);
        if (d == null || d.a != type) {
            return;
        }
        this.a.b(d.b);
    }

    public final PromotionBackground.Type c() {
        List list;
        PromotionBackground promotionBackground;
        PromotionBackground.Type type;
        Story d = d();
        if (d == null) {
            return PromotionBackground.Type.COLOR;
        }
        Story.b bVar = (Story.b) kotlin.collections.a.S(this.j, d.i.d);
        if (bVar == null || (list = bVar.e) == null) {
            return PromotionBackground.Type.COLOR;
        }
        PromotionBackground.Companion.getClass();
        Iterator it = PromotionBackground.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                promotionBackground = null;
                break;
            }
            promotionBackground = d.d(list, (PromotionBackground.Type) it.next());
            if (promotionBackground != null) {
                break;
            }
        }
        return (promotionBackground == null || (type = promotionBackground.a) == null) ? PromotionBackground.Type.COLOR : type;
    }

    public final Story d() {
        return (Story) kotlin.collections.a.S(this.i, this.h);
    }

    public final dou0 e(Story story, int i, int i2) {
        return new dou0(this.f.a, i, story.b, story.i.d.size(), i2);
    }

    public final boolean f() {
        Story d = d();
        return d != null && this.j < d.i.d.size() - 1;
    }

    public final Story g() {
        return (Story) kotlin.collections.a.S(this.i + 1, this.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r9.g == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        CurrentStoryInteractor$playbackResumed$1 currentStoryInteractor$playbackResumed$1;
        int i;
        Story d;
        String str;
        String str2;
        if (continuationImpl instanceof CurrentStoryInteractor$playbackResumed$1) {
            currentStoryInteractor$playbackResumed$1 = (CurrentStoryInteractor$playbackResumed$1) continuationImpl;
            int i2 = currentStoryInteractor$playbackResumed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentStoryInteractor$playbackResumed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentStoryInteractor$playbackResumed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentStoryInteractor$playbackResumed$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d = d();
                    if (d == null) {
                        return zy11Var;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d = (Story) currentStoryInteractor$playbackResumed$1.L$0;
                    kotlin.b.b(obj);
                }
                dou0 e = e(d, this.i, this.j);
                rx2 rx2Var = ((lay0) this.b).a;
                str = e.a;
                str2 = e.b;
                int i3 = e.c + 1;
                int i4 = e.d;
                Integer valueOf = Integer.valueOf(e.e + 1);
                Integer valueOf2 = Integer.valueOf(i4);
                Integer valueOf3 = Integer.valueOf(i3);
                rx2Var.getClass();
                HashMap hashMap = new HashMap();
                if (str2 != null) {
                    hashMap.put("banner_id", str2);
                }
                if (str != null) {
                    hashMap.put("open_reason", str);
                }
                hashMap.put("page_number", valueOf);
                hashMap.put("page_number_total_count", valueOf2);
                hashMap.put("story_position", valueOf3);
                rx2Var.a.a("PromoStories.PlayStarted", hashMap, 1, new HashMap());
                this.g = true;
                return zy11Var;
            }
        }
        currentStoryInteractor$playbackResumed$1 = new CurrentStoryInteractor$playbackResumed$1(this, continuationImpl);
        Object obj2 = currentStoryInteractor$playbackResumed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentStoryInteractor$playbackResumed$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        dou0 e2 = e(d, this.i, this.j);
        rx2 rx2Var2 = ((lay0) this.b).a;
        str = e2.a;
        str2 = e2.b;
        int i32 = e2.c + 1;
        int i42 = e2.d;
        Integer valueOf4 = Integer.valueOf(e2.e + 1);
        Integer valueOf22 = Integer.valueOf(i42);
        Integer valueOf32 = Integer.valueOf(i32);
        rx2Var2.getClass();
        HashMap hashMap2 = new HashMap();
        if (str2 != null) {
        }
        if (str != null) {
        }
        hashMap2.put("page_number", valueOf4);
        hashMap2.put("page_number_total_count", valueOf22);
        hashMap2.put("story_position", valueOf32);
        rx2Var2.a.a("PromoStories.PlayStarted", hashMap2, 1, new HashMap());
        this.g = true;
        return zy11Var2;
    }

    public final void i() {
        Story story = (Story) kotlin.collections.a.S(this.k, this.h);
        if (story != null) {
            dou0 e = e(story, this.k, this.l);
            long j = this.n;
            float f = this.m;
            rx2 rx2Var = ((lay0) this.b).a;
            String str = e.a;
            String str2 = e.b;
            int i = e.c + 1;
            int i2 = e.d;
            double d = ((int) (f * 100.0f)) / 100.0d;
            Integer valueOf = Integer.valueOf(e.e + 1);
            Integer valueOf2 = Integer.valueOf(i2);
            Double valueOf3 = Double.valueOf(d);
            Double valueOf4 = Double.valueOf(j / 1000.0d);
            Integer valueOf5 = Integer.valueOf(i);
            rx2Var.getClass();
            HashMap hashMap = new HashMap();
            if (str2 != null) {
                hashMap.put("banner_id", str2);
            }
            if (str != null) {
                hashMap.put("open_reason", str);
            }
            hashMap.put("page_number", valueOf);
            hashMap.put("page_number_total_count", valueOf2);
            hashMap.put("played_progress", valueOf3);
            hashMap.put("played_time", valueOf4);
            hashMap.put("story_position", valueOf5);
            rx2Var.a.a("PromoStories.PlayFinished", hashMap, 1, new HashMap());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        CurrentStoryInteractor$reportShownPartialRtm$1 currentStoryInteractor$reportShownPartialRtm$1;
        int i;
        Story d;
        if (continuationImpl instanceof CurrentStoryInteractor$reportShownPartialRtm$1) {
            currentStoryInteractor$reportShownPartialRtm$1 = (CurrentStoryInteractor$reportShownPartialRtm$1) continuationImpl;
            int i2 = currentStoryInteractor$reportShownPartialRtm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentStoryInteractor$reportShownPartialRtm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentStoryInteractor$reportShownPartialRtm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentStoryInteractor$reportShownPartialRtm$1.label;
                zpf0 zpf0Var = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long a = zpf0Var.a();
                    currentStoryInteractor$reportShownPartialRtm$1.label = 1;
                    if (kotlinx.coroutines.a.j(a, currentStoryInteractor$reportShownPartialRtm$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                d = d();
                if (d != null) {
                    int i3 = this.j;
                    int i4 = i3 + 1;
                    Story.b bVar = (Story.b) kotlin.collections.a.S(i3, d.i.d);
                    zpf0Var.e(d, i4, bVar != null ? bVar.h : null, this.f.a);
                }
                return zy11.a;
            }
        }
        currentStoryInteractor$reportShownPartialRtm$1 = new CurrentStoryInteractor$reportShownPartialRtm$1(this, continuationImpl);
        Object obj2 = currentStoryInteractor$reportShownPartialRtm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentStoryInteractor$reportShownPartialRtm$1.label;
        zpf0 zpf0Var2 = this.d;
        if (i != 0) {
        }
        d = d();
        if (d != null) {
        }
        return zy11.a;
    }
}
