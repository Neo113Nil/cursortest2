package ru.yandex.taxi.stories.presentation.story;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.a60;
import defpackage.aqf0;
import defpackage.avj0;
import defpackage.b7z0;
import defpackage.beh;
import defpackage.cou0;
import defpackage.db7;
import defpackage.dou0;
import defpackage.e3n;
import defpackage.et4;
import defpackage.evu0;
import defpackage.fe10;
import defpackage.gnu0;
import defpackage.gou0;
import defpackage.gpu0;
import defpackage.gqu0;
import defpackage.hz4;
import defpackage.ike;
import defpackage.jhu0;
import defpackage.jl40;
import defpackage.kay0;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.lay0;
import defpackage.lbh;
import defpackage.n9y0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.opu0;
import defpackage.ot4;
import defpackage.ppu0;
import defpackage.pzt0;
import defpackage.qke;
import defpackage.qu;
import defpackage.rah;
import defpackage.ru4;
import defpackage.ruc;
import defpackage.rx2;
import defpackage.scc;
import defpackage.sqx;
import defpackage.st4;
import defpackage.t61;
import defpackage.td10;
import defpackage.tje;
import defpackage.tkf0;
import defpackage.ut4;
import defpackage.v770;
import defpackage.vfc0;
import defpackage.vt4;
import defpackage.w511;
import defpackage.x5s0;
import defpackage.xby;
import defpackage.xou0;
import defpackage.ykn0;
import defpackage.zq4;
import defpackage.zuj0;
import defpackage.zxs0;
import defpackage.zy11;
import io.appmetrica.analytics.impl.C0553n3;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.banners.PromoBannerActivationStatus;
import ru.yandex.taxi.communications.TaxiStatusMessageSource$addStatusMessageListener$$inlined$flatMapLatest$1;
import ru.yandex.taxi.communications.TaxiStatusMessageSource$addStatusMessageListener$$inlined$safeCollectIn$1;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.communications.api.dto.q0;
import ru.yandex.taxi.communications.n;
import ru.yandex.taxi.communications.p;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes6.dex */
public final class g extends hz4 {
    public StoryWidgets.a A;
    public PromoBannerActivationStatus B;
    public long C;
    public boolean D;
    public pzt0 E;
    public pzt0 F;
    public final Context e;
    public final gou0 f;
    public final ru.yandex.taxi.stories.data.caching.a g;
    public final ru.yandex.taxi.stories.domain.a h;
    public final b7z0 i;
    public final gnu0 j;
    public final ru.yandex.taxi.stories.domain.b k;
    public final ru.yandex.taxi.widget.d l;
    public final kay0 m;
    public final ruc n;
    public final zuj0 o;
    public final ykn0 p;
    public final jhu0 q;
    public final aqf0 r;
    public final com.yandex.go.benefits_center.activation.data.b s;
    public final zq4 t;
    public final et4 u;
    public final ru4 v;
    public final sqx w;
    public final h x;
    public final x5s0 y;
    public xou0 z;

    public g(Context context, gou0 gou0Var, ru.yandex.taxi.stories.data.caching.a aVar, ru.yandex.taxi.stories.domain.a aVar2, b7z0 b7z0Var, gnu0 gnu0Var, ru.yandex.taxi.stories.domain.b bVar, ru.yandex.taxi.widget.d dVar, kay0 kay0Var, ruc rucVar, zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar, ykn0 ykn0Var, jhu0 jhu0Var, aqf0 aqf0Var, com.yandex.go.benefits_center.activation.data.b bVar2, zq4 zq4Var, et4 et4Var, ru4 ru4Var) {
        super(new opu0());
        this.e = context;
        this.f = gou0Var;
        this.g = aVar;
        this.h = aVar2;
        this.i = b7z0Var;
        this.j = gnu0Var;
        this.k = bVar;
        this.l = dVar;
        this.m = kay0Var;
        this.n = rucVar;
        this.o = zuj0Var;
        this.p = ykn0Var;
        this.q = jhu0Var;
        this.r = aqf0Var;
        this.s = bVar2;
        this.t = zq4Var;
        this.u = et4Var;
        this.v = ru4Var;
        this.w = new sqx(context);
        this.x = new h(cVar);
        this.y = new x5s0(8, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(g gVar, ContinuationImpl continuationImpl) {
        StoryPresenter$loadSingleStory$1 storyPresenter$loadSingleStory$1;
        int i;
        Story story;
        gVar.getClass();
        if (continuationImpl instanceof StoryPresenter$loadSingleStory$1) {
            storyPresenter$loadSingleStory$1 = (StoryPresenter$loadSingleStory$1) continuationImpl;
            int i2 = storyPresenter$loadSingleStory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storyPresenter$loadSingleStory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storyPresenter$loadSingleStory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storyPresenter$loadSingleStory$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gou0 gou0Var = gVar.f;
                    Story story2 = gou0Var.f;
                    if (story2 != null) {
                        gVar.t(story2.b, Collections.singletonList(story2));
                        return zy11Var;
                    }
                    ru.yandex.taxi.stories.domain.b bVar = gVar.k;
                    String str = (String) gou0Var.c.get(0);
                    storyPresenter$loadSingleStory$1.L$0 = null;
                    storyPresenter$loadSingleStory$1.label = 1;
                    obj = bVar.d.c.a.a.g(str, storyPresenter$loadSingleStory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                story = (Story) obj;
                if (story == null) {
                    gVar.t(story.b, Collections.singletonList(story));
                    return zy11Var;
                }
                ((gpu0) gVar.a).showStoryLoading();
                tje.N(gVar.e(), null, null, new StoryPresenter$loadSingleStory$2(gVar, null), 3);
                return zy11Var;
            }
        }
        storyPresenter$loadSingleStory$1 = new StoryPresenter$loadSingleStory$1(gVar, continuationImpl);
        Object obj2 = storyPresenter$loadSingleStory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storyPresenter$loadSingleStory$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        story = (Story) obj2;
        if (story == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(g gVar, ContinuationImpl continuationImpl) {
        StoryPresenter$loadStoriesForScreen$1 storyPresenter$loadStoriesForScreen$1;
        int i;
        String str;
        List list;
        gou0 gou0Var = gVar.f;
        if (continuationImpl instanceof StoryPresenter$loadStoriesForScreen$1) {
            storyPresenter$loadStoriesForScreen$1 = (StoryPresenter$loadStoriesForScreen$1) continuationImpl;
            int i2 = storyPresenter$loadStoriesForScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storyPresenter$loadStoriesForScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storyPresenter$loadStoriesForScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storyPresenter$loadStoriesForScreen$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = gou0Var.a;
                    if (evu0.J(str2)) {
                        return zy11Var;
                    }
                    ru.yandex.taxi.stories.domain.b bVar = gVar.k;
                    List list2 = gou0Var.c;
                    storyPresenter$loadStoriesForScreen$1.L$0 = str2;
                    storyPresenter$loadStoriesForScreen$1.label = 1;
                    Object a = bVar.d.a(str2, list2, storyPresenter$loadStoriesForScreen$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) storyPresenter$loadStoriesForScreen$1.L$0;
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                if (list.isEmpty()) {
                    gVar.t(gou0Var.e, list);
                    return zy11Var;
                }
                ((gpu0) gVar.a).showStoryLoading();
                tje.N(gVar.e(), null, null, new StoryPresenter$loadStoriesForScreen$2(gVar, str, null), 3);
                return zy11Var;
            }
        }
        storyPresenter$loadStoriesForScreen$1 = new StoryPresenter$loadStoriesForScreen$1(gVar, continuationImpl);
        Object obj2 = storyPresenter$loadStoriesForScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storyPresenter$loadStoriesForScreen$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list.isEmpty()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|16|17))|29|6|7|(0)(0)|12|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        defpackage.xby.d.k(r7, java.lang.String.format("Error loading story %s", java.util.Arrays.copyOf(new java.lang.Object[]{r6}, 1)));
        r5.j();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: all -> 0x002e, CancellationException -> 0x007c, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x007c, all -> 0x002e, blocks: (B:11:0x002a, B:12:0x004f, B:14:0x005e, B:22:0x003a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(g gVar, String str, ContinuationImpl continuationImpl) {
        StoryPresenter$loadStoryById$1 storyPresenter$loadStoryById$1;
        int i;
        gVar.getClass();
        if (continuationImpl instanceof StoryPresenter$loadStoryById$1) {
            storyPresenter$loadStoryById$1 = (StoryPresenter$loadStoryById$1) continuationImpl;
            int i2 = storyPresenter$loadStoryById$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storyPresenter$loadStoryById$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storyPresenter$loadStoryById$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storyPresenter$loadStoryById$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.stories.domain.b bVar = gVar.k;
                    RetryPolicy retryPolicy = gVar.f.h;
                    storyPresenter$loadStoryById$1.L$0 = str;
                    storyPresenter$loadStoryById$1.label = 1;
                    obj = bVar.d.c(str, bVar.a, retryPolicy, storyPresenter$loadStoryById$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) storyPresenter$loadStoryById$1.L$0;
                    kotlin.b.b(obj);
                }
                Story story = (Story) obj;
                gVar.t(story.b, Collections.singletonList(story));
                if (gVar.D) {
                    gVar.r(false);
                }
                return zy11.a;
            }
        }
        storyPresenter$loadStoryById$1 = new StoryPresenter$loadStoryById$1(gVar, continuationImpl);
        Object obj2 = storyPresenter$loadStoryById$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storyPresenter$loadStoryById$1.label;
        if (i != 0) {
        }
        Story story2 = (Story) obj2;
        gVar.t(story2.b, Collections.singletonList(story2));
        if (gVar.D) {
        }
        return zy11.a;
    }

    public static StoryMediaInfo$PagerMode l(Story story) {
        Object obj;
        Story.d dVar = story.i;
        Iterator it = dVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Story.b) obj).b) {
                break;
            }
        }
        return obj != null ? StoryMediaInfo$PagerMode.DASHES : dVar.d.size() <= 1 ? StoryMediaInfo$PagerMode.NONE : StoryMediaInfo$PagerMode.DOTS;
    }

    @Override // defpackage.p35
    public final void a() {
        pzt0 pzt0Var;
        kay0 kay0Var = this.m;
        CopyOnWriteArrayList copyOnWriteArrayList = kay0Var.d;
        copyOnWriteArrayList.remove(this.y);
        if (!copyOnWriteArrayList.isEmpty() || (pzt0Var = kay0Var.e) == null) {
            return;
        }
        pzt0Var.a(null);
    }

    @Override // defpackage.p35
    public final void b() {
        kay0 kay0Var = this.m;
        CopyOnWriteArrayList copyOnWriteArrayList = kay0Var.d;
        x5s0 x5s0Var = this.y;
        copyOnWriteArrayList.add(x5s0Var);
        x5s0Var.accept(kay0Var.a());
        pzt0 pzt0Var = kay0Var.e;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            kay0Var.e = tje.N(kay0Var.a.a, null, null, new TaxiStatusMessageSource$addStatusMessageListener$$inlined$safeCollectIn$1(new p(kotlinx.coroutines.flow.e.X(((e0) kay0Var.b).n(), new TaxiStatusMessageSource$addStatusMessageListener$$inlined$flatMapLatest$1(3, null)), kay0Var), null, kay0Var), 3);
        }
    }

    @Override // defpackage.hz4
    public final void d() {
        Story.b bVar;
        super.d();
        ru.yandex.taxi.stories.domain.a aVar = this.h;
        ru.yandex.taxi.stories.data.caching.a aVar2 = aVar.a;
        aVar2.i();
        synchronized (aVar2.j) {
            aVar2.j.clear();
        }
        Story d = aVar.d();
        if (d != null && (bVar = (Story.b) kotlin.collections.a.S(0, d.i.d)) != null) {
            ru.yandex.taxi.promotions.model.d dVar = PromotionBackground.Companion;
            List list = bVar.e;
            PromotionBackground.Type type = PromotionBackground.Type.VIDEO;
            dVar.getClass();
            PromotionBackground d2 = ru.yandex.taxi.promotions.model.d.d(list, type);
            if (d2 != null) {
                aVar.a.c(d2.b);
            }
        }
        aVar.a.k();
        Story d3 = this.h.d();
        String str = d3 != null ? d3.b : null;
        if (str != null) {
            this.j.a(str);
        }
        q(false, false);
    }

    public final void i() {
        ru.yandex.taxi.stories.domain.a aVar = this.h;
        ru.yandex.taxi.stories.domain.b bVar = aVar.e;
        ru.yandex.taxi.stories.data.caching.a aVar2 = aVar.a;
        Story d = aVar.d();
        if (d == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : d.i.d) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ru.yandex.taxi.promotions.model.d dVar = PromotionBackground.Companion;
            List list = ((Story.b) obj).e;
            PromotionBackground.Type type = PromotionBackground.Type.VIDEO;
            dVar.getClass();
            PromotionBackground d2 = ru.yandex.taxi.promotions.model.d.d(list, type);
            if (d2 != null && i != aVar.j) {
                arrayList.add(d2.b);
            }
            i = i2;
        }
        aVar2.i();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar2.b((String) it.next());
        }
        bVar.b.b(d, false);
        bVar.b.a(d);
    }

    public final void j() {
        ((ru.yandex.taxi.communications.stories.domain.a) this.q.a).r(new qu(9));
    }

    public final xou0 k(Story story, int i, boolean z) {
        String str;
        PromotionBackground promotionBackground;
        boolean z2;
        String str2;
        Story.d dVar = story.i;
        Story.b bVar = (Story.b) dVar.d.get(i);
        ru.yandex.taxi.promotions.model.d dVar2 = PromotionBackground.Companion;
        List list = bVar.e;
        int i2 = bVar.a;
        dVar2.getClass();
        Iterator it = PromotionBackground.g.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                promotionBackground = null;
                break;
            }
            promotionBackground = ru.yandex.taxi.promotions.model.d.d(list, (PromotionBackground.Type) it.next());
            if (promotionBackground != null) {
                break;
            }
        }
        PromotionBackground d = ru.yandex.taxi.promotions.model.d.d(bVar.e, PromotionBackground.Type.COLOR);
        if (promotionBackground != null) {
            String str3 = promotionBackground.e;
            String str4 = promotionBackground.b;
            boolean contains = this.h.a.f.contains(str4);
            int i3 = ppu0.a[promotionBackground.a.ordinal()];
            if (i3 != 1) {
                if (i3 == 3) {
                    str = str4;
                }
            } else if (str3 == null || str3.length() == 0) {
                File d2 = this.g.d(str4);
                if (d2.exists()) {
                    str = d2.getAbsolutePath();
                }
            } else {
                str = str3;
            }
            z2 = contains;
        } else {
            z2 = true;
        }
        ike e = e();
        TypedContentWidget typedContentWidget = bVar.c;
        h hVar = this.x;
        zxs0 a = hVar.a(e, typedContentWidget);
        zxs0 a2 = hVar.a(e(), bVar.d);
        StoryWidgets storyWidgets = bVar.g;
        int size = dVar.d.size();
        PromotionBackground promotionBackground2 = promotionBackground;
        Story.c cVar = bVar.f;
        StoryMediaInfo$PagerMode l = l(story);
        Story.g gVar = bVar.i;
        boolean z3 = !this.f.g;
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long e2 = e3n.e(kp50.U(i2, durationUnit)) > 0 ? e3n.e(kp50.U(i2, durationUnit)) : 10000L;
        int i4 = ModalContentViewContainer.BASE_SHADOW_COLOR;
        if (d != null && (str2 = d.b) != null && !evu0.J(str2) && !str2.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    i4 = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                i4 = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e3) {
                xby.d.k(e3, "Parsing color error, color = ".concat(upperCase));
            }
        }
        return new xou0(a, a2, storyWidgets, i4, str, str == null && i == 0, size, i, e2, cVar, l, z, z2, gVar, z3, promotionBackground2, bVar.j);
    }

    public final void m(boolean z, boolean z2, boolean z3) {
        Story d;
        ru.yandex.taxi.stories.domain.a aVar = this.h;
        if (aVar.f()) {
            aVar.j++;
            if (!z2 && (d = aVar.d()) != null) {
                ((n9y0) aVar.c).d(d, null, aVar.c(), aVar.j, null);
            }
            u();
            r(z3);
            return;
        }
        Story g = aVar.g();
        if (g != null) {
            if (z) {
                return;
            }
            ((gpu0) this.a).animateToNext(k(g, 0, false));
        } else {
            if (z3) {
                return;
            }
            j();
        }
    }

    public final void n() {
        ru.yandex.taxi.stories.domain.a aVar = this.h;
        aVar.i = Math.min(aVar.i + 1, aVar.h.size() - 1);
        aVar.j = 0;
        Story d = aVar.d();
        if (d != null) {
            this.j.b(d.b);
        }
        i();
        r(false);
    }

    public final void o(boolean z, boolean z2) {
        ru.yandex.taxi.stories.domain.a aVar = this.h;
        int i = aVar.j;
        if (i <= 0) {
            Story story = (Story) kotlin.collections.a.S(aVar.i - 1, aVar.h);
            if (story == null || z) {
                return;
            }
            ((gpu0) this.a).animateToPrevious(k(story, story.i.d.size() - 1, false));
            return;
        }
        aVar.j = i - 1;
        Story d = aVar.d();
        if (d != null) {
            ((n9y0) aVar.c).e(d, null, aVar.c(), aVar.j, null);
        }
        u();
        r(z2);
    }

    public final void p(q0 q0Var, String str, boolean z, gqu0 gqu0Var) {
        q0 q0Var2;
        StoryWidgets.a aVar;
        q0 q0Var3;
        StoryWidgets.a aVar2;
        Map map = gqu0Var != null ? gqu0Var.e : null;
        ru.yandex.taxi.stories.domain.a aVar3 = this.h;
        if (q0Var == null) {
            aVar3.a(null, null, str, map);
            j();
            return;
        }
        StoryWidgets.a aVar4 = q0Var.b;
        StoryWidgets.ActionType actionType = q0Var.a;
        if (aVar4 != null) {
            String str2 = aVar4.a;
            if (actionType != null) {
                aVar3.a(actionType, str2, str, map);
                int i = ppu0.b[actionType.ordinal()];
                Context context = this.e;
                switch (i) {
                    case 1:
                        if (z) {
                            if (gqu0Var != null) {
                                for (vt4 vt4Var : gqu0Var.f) {
                                    if (vt4Var instanceof ot4) {
                                        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("PromoCode", ((ot4) vt4Var).a));
                                    } else if (!(vt4Var instanceof st4) && !jl40.l(vt4Var, ut4.INSTANCE)) {
                                        w511.b();
                                        break;
                                    }
                                }
                            }
                            this.A = aVar4;
                            j();
                            break;
                        } else if (str2 != null && str2.length() != 0) {
                            ((a60) ((ru.yandex.taxi.communications.stories.domain.a) this.p.b).I).c(str2, v770.h);
                            break;
                        }
                        break;
                    case 2:
                        if (str2 != null && str2.length() != 0) {
                            ((n) this.n).b(str2, aVar4.b);
                            break;
                        }
                        break;
                    case 3:
                        if (str2 != null && str2.length() != 0) {
                            ((gpu0) this.a).shareText(str2);
                            break;
                        }
                        break;
                    case 4:
                        Story d = aVar3.d();
                        if (d != null) {
                            cou0 cou0Var = aVar3.b;
                            int i2 = aVar3.j;
                            PromotionBackground.Type c = aVar3.c();
                            t61 t61Var = ((lay0) cou0Var).c;
                            String str3 = d.b;
                            String lowerCase = c.name().toLowerCase(Locale.ROOT);
                            t61Var.getClass();
                            HashMap hashMap = new HashMap();
                            hashMap.put("banner_id", str3);
                            hashMap.put("type", "media-story");
                            hashMap.put("page_number", Integer.valueOf(i2 + 1));
                            hashMap.put(C0553n3.g, lowerCase);
                            t61Var.a.a("Promotion.Widgets.ScreenShareAction", hashMap, 1, new HashMap());
                        }
                        ((gpu0) this.a).shareScreen(str2);
                        break;
                    case 5:
                        int i3 = aVar4.c - 1;
                        Story d2 = aVar3.d();
                        if (d2 != null && i3 >= 0 && i3 < d2.i.d.size()) {
                            if (l(d2) != StoryMediaInfo$PagerMode.DOTS) {
                                aVar3.j = i3;
                                r(true);
                                break;
                            } else {
                                int i4 = aVar3.j;
                                Object obj = this.a;
                                if (i3 < i4) {
                                    ((gpu0) obj).animateToPageBackward(k(d2, i3, false));
                                    break;
                                } else {
                                    ((gpu0) obj).animateToPageForward(k(d2, i3, false));
                                    break;
                                }
                            }
                        }
                        break;
                    case 6:
                        if (gqu0Var != null && gqu0Var.g && (q0Var2 = gqu0Var.d) != null && (aVar = q0Var2.b) != null) {
                            qke.E(context, HapticController$Effect.BZZ, false, 12);
                            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("PROMOCODE", aVar.f));
                            gqu0 gqu0Var2 = new gqu0(aVar.g, gqu0Var.b, gqu0Var.c, gqu0Var.d, false, false, 176);
                            xou0 xou0Var = this.z;
                            if (xou0Var != null) {
                                StoryWidgets storyWidgets = xou0Var.c;
                                ArrayList arrayList = new ArrayList(storyWidgets.a);
                                int indexOf = arrayList.indexOf(gqu0Var);
                                arrayList.remove(indexOf);
                                arrayList.add(indexOf, gqu0Var2);
                                storyWidgets.a = arrayList;
                                ((gpu0) this.a).updateStoryMediaInfo(xou0Var);
                                break;
                            }
                        }
                        break;
                    case 7:
                        if (gqu0Var != null && gqu0Var.g && (q0Var3 = gqu0Var.d) != null && (aVar2 = q0Var3.b) != null) {
                            String str4 = aVar2.h;
                            if (str4.length() != 0) {
                                gqu0 gqu0Var3 = new gqu0((String) null, gqu0Var.b, gqu0Var.c, new q0(StoryWidgets.ActionType.SAVE_BENEFIT, new StoryWidgets.a(null, ((avj0) this.u.a).h(kyh0.promocodes_scooters_use_button_loading), null, str4, 119, aVar2.i)), false, true, 48);
                                v(gqu0Var, gqu0Var3);
                                tje.N(e(), null, null, new StoryPresenter$handleSaveBenefit$1(this, str4, aVar2, gqu0Var, gqu0Var3, null), 3);
                                break;
                            }
                        }
                        break;
                    default:
                        w511.b();
                        break;
                }
                return;
            }
        }
        aVar3.a(actionType, null, str, map);
        j();
    }

    public final void q(boolean z, boolean z2) {
        ru.yandex.taxi.stories.domain.a aVar = this.h;
        cou0 cou0Var = aVar.b;
        boolean z3 = aVar.o;
        aVar.o = z;
        if (z && !z3) {
            Story d = aVar.d();
            if (d != null) {
                dou0 e = aVar.e(d, aVar.i, aVar.j);
                rx2 rx2Var = ((lay0) cou0Var).a;
                String str = e.a;
                String str2 = e.b;
                int i = e.c + 1;
                int i2 = e.d;
                Integer valueOf = Integer.valueOf(e.e + 1);
                Integer valueOf2 = Integer.valueOf(i2);
                Integer valueOf3 = Integer.valueOf(i);
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
                rx2Var.a.a("PromoStories.LoadingIndicatorAppeared", hashMap, 1, new HashMap());
                return;
            }
            return;
        }
        if (z || !z3) {
            return;
        }
        Story story = (Story) kotlin.collections.a.S(aVar.k, aVar.h);
        if (story != null) {
            dou0 e2 = aVar.e(story, aVar.k, aVar.l);
            rx2 rx2Var2 = ((lay0) cou0Var).a;
            String str3 = e2.a;
            String str4 = e2.b;
            int i3 = e2.c + 1;
            int i4 = e2.d;
            Integer valueOf4 = Integer.valueOf(e2.e + 1);
            Integer valueOf5 = Integer.valueOf(i4);
            Integer valueOf6 = Integer.valueOf(i3);
            Boolean valueOf7 = Boolean.valueOf(z2);
            rx2Var2.getClass();
            HashMap hashMap2 = new HashMap();
            if (str4 != null) {
                hashMap2.put("banner_id", str4);
            }
            if (str3 != null) {
                hashMap2.put("open_reason", str3);
            }
            hashMap2.put("page_number", valueOf4);
            hashMap2.put("page_number_total_count", valueOf5);
            hashMap2.put("story_position", valueOf6);
            hashMap2.put("success", valueOf7);
            rx2Var2.a.a("PromoStories.LoadingIndicatorDisappeared", hashMap2, 1, new HashMap());
        }
    }

    public final void r(boolean z) {
        Story d;
        ru.yandex.taxi.stories.domain.a aVar = this.h;
        Story d2 = aVar.d();
        if (d2 == null) {
            return;
        }
        q(false, false);
        if (aVar.g) {
            aVar.i();
        }
        if (aVar.j != 0 && (d = aVar.d()) != null) {
            aVar.b(d);
        }
        Story g = aVar.g();
        if (!aVar.f() && g != null) {
            aVar.b(g);
        }
        aVar.k = aVar.i;
        aVar.l = aVar.j;
        aVar.g = false;
        Story d3 = aVar.d();
        if (d3 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(Integer.valueOf(aVar.j));
            int i = aVar.j;
            if (i > 0) {
                linkedHashSet.add(Integer.valueOf(i - 1));
            }
            if (aVar.f()) {
                linkedHashSet.add(Integer.valueOf(aVar.j + 1));
            }
            aVar.e.c(d3, linkedHashSet);
        }
        this.C = this.i.uptimeMillis();
        xou0 k = k(d2, aVar.j, z);
        Iterator it = k.c.a.iterator();
        while (it.hasNext()) {
            ((gqu0) it.next()).g = true;
        }
        this.z = k;
        PromotionBackground promotionBackground = k.p;
        if (promotionBackground == null) {
            ((gpu0) this.a).playColor(k);
            return;
        }
        String str = promotionBackground.b;
        int i2 = ppu0.a[promotionBackground.a.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                ((gpu0) this.a).playAnimation(promotionBackground, k);
                this.E = tje.N(e(), null, null, new StoryPresenter$prepareAnimationContent$1(this, str, null), 3);
                return;
            } else {
                if (i2 != 3) {
                    return;
                }
                ((gpu0) this.a).playImage(promotionBackground, k);
                return;
            }
        }
        db7 db7Var = this.g.l;
        vfc0 vfc0Var = new vfc0(8, new lbh());
        rah rahVar = new rah();
        beh behVar = new beh();
        td10 td10Var = new td10();
        td10Var.b = Uri.parse(str);
        fe10 a = td10Var.a();
        a.b.getClass();
        ((gpu0) this.a).playVideo(new tkf0(a, db7Var, vfc0Var, rahVar.a(a), behVar, 1048576, null), k);
    }

    public final void s(float f, long j, boolean z) {
        ru.yandex.taxi.stories.domain.a aVar = this.h;
        if (aVar.g) {
            aVar.m = f;
            aVar.n = j;
            Story d = aVar.d();
            if (d != null && ((Story.b) d.i.d.get(aVar.j)).b) {
                m(z, true, false);
            }
        }
    }

    public final void t(String str, List list) {
        ru.yandex.taxi.stories.domain.a aVar = this.h;
        aVar.h = list;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (jl40.l(((Story) it.next()).b, str)) {
                break;
            } else {
                i++;
            }
        }
        aVar.i = i >= 0 ? i : 0;
        ru.yandex.taxi.stories.data.caching.a aVar2 = aVar.a;
        aVar2.getClass();
        aVar2.g = new ArrayList(list);
        aVar2.l();
        Story d = aVar.d();
        String str2 = aVar.f.a;
        Story d2 = aVar.d();
        if (d2 != null) {
            ((n9y0) aVar.c).g(d2, str2, null);
            aVar.d.d(d2, str2);
        }
        u();
        if (d != null) {
            i();
        }
        ((gpu0) this.a).hideStoryLoading();
    }

    public final void u() {
        pzt0 pzt0Var = this.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.F = null;
        this.F = tje.N(e(), null, null, new StoryPresenter$tryReportShownPartial$1(this, null), 3);
    }

    public final void v(gqu0 gqu0Var, gqu0 gqu0Var2) {
        xou0 xou0Var = this.z;
        if (xou0Var != null) {
            StoryWidgets storyWidgets = xou0Var.c;
            ArrayList arrayList = new ArrayList(storyWidgets.a);
            int indexOf = arrayList.indexOf(gqu0Var);
            if (indexOf >= 0) {
                arrayList.set(indexOf, gqu0Var2);
                storyWidgets.a = arrayList;
            }
            ((gpu0) this.a).updateStoryMediaInfo(xou0Var);
        }
    }
}
