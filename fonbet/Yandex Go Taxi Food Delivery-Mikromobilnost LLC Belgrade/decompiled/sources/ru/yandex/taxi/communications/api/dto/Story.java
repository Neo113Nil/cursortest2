package ru.yandex.taxi.communications.api.dto;

import defpackage.bmu0;
import defpackage.c3u0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.owd0;
import defpackage.rcc;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.promotions.model.PromotionBackground;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/communications/api/dto/Story;", "Lru/yandex/taxi/promotions/model/Promotion;", "Companion", "a", "d", "e", "b", "c", "PageMediaType", "g", "StoryLayoutType", "f", "ru/yandex/taxi/communications/api/dto/x", "ru/yandex/taxi/communications/api/dto/w", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Story extends Promotion {
    public static final x Companion = new x();
    public static final i3y[] l;
    public static final a m;
    public static final d n;
    public static final g o;
    public final String b;
    public final Map c;
    public final String d;
    public boolean e;
    public boolean f;
    public Set g;
    public final a h;
    public final d i;
    public int j;
    public boolean k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/api/dto/Story$PageMediaType;", "", "Companion", "ru/yandex/taxi/communications/api/dto/e0", "IMAGE", "ANIMATION", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final class PageMediaType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PageMediaType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final PageMediaType ANIMATION;
        public static final e0 Companion;
        public static final PageMediaType IMAGE;

        static {
            PageMediaType pageMediaType = new PageMediaType("IMAGE", 0);
            IMAGE = pageMediaType;
            PageMediaType pageMediaType2 = new PageMediaType("ANIMATION", 1);
            ANIMATION = pageMediaType2;
            PageMediaType[] pageMediaTypeArr = {pageMediaType, pageMediaType2};
            $VALUES = pageMediaTypeArr;
            $ENTRIES = kotlin.enums.a.a(pageMediaTypeArr);
            Companion = new e0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bmu0(5));
        }

        public static PageMediaType valueOf(String str) {
            return (PageMediaType) Enum.valueOf(PageMediaType.class, str);
        }

        public static PageMediaType[] values() {
            return (PageMediaType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/communications/api/dto/Story$StoryLayoutType;", "", "Companion", "ru/yandex/taxi/communications/api/dto/n0", "MAIN", "MAIN_WITH_TOP_INSET", "BOTTOM", "NEW_YEAR_LAYOUT", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class StoryLayoutType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StoryLayoutType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final StoryLayoutType BOTTOM;
        public static final n0 Companion;
        public static final StoryLayoutType MAIN;
        public static final StoryLayoutType MAIN_WITH_TOP_INSET;
        public static final StoryLayoutType NEW_YEAR_LAYOUT;

        static {
            StoryLayoutType storyLayoutType = new StoryLayoutType("MAIN", 0);
            MAIN = storyLayoutType;
            StoryLayoutType storyLayoutType2 = new StoryLayoutType("MAIN_WITH_TOP_INSET", 1);
            MAIN_WITH_TOP_INSET = storyLayoutType2;
            StoryLayoutType storyLayoutType3 = new StoryLayoutType("BOTTOM", 2);
            BOTTOM = storyLayoutType3;
            StoryLayoutType storyLayoutType4 = new StoryLayoutType("NEW_YEAR_LAYOUT", 3);
            NEW_YEAR_LAYOUT = storyLayoutType4;
            StoryLayoutType[] storyLayoutTypeArr = {storyLayoutType, storyLayoutType2, storyLayoutType3, storyLayoutType4};
            $VALUES = storyLayoutTypeArr;
            $ENTRIES = kotlin.enums.a.a(storyLayoutTypeArr);
            Companion = new n0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(20));
        }

        public static StoryLayoutType valueOf(String str) {
            return (StoryLayoutType) Enum.valueOf(StoryLayoutType.class, str);
        }

        public static StoryLayoutType[] values() {
            return (StoryLayoutType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new c3u0(15)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new c3u0(16)), null, null, null};
        m = new a(0);
        n = new d(0);
        o = new g(0);
    }

    public /* synthetic */ Story(int i, String str, Map map, String str2, boolean z, boolean z2, Set set, a aVar, d dVar, int i2) {
        if ((i & 1) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 16) == 0) {
            this.f = true;
        } else {
            this.f = z2;
        }
        if ((i & 32) == 0) {
            this.g = EmptySet.a;
        } else {
            this.g = set;
        }
        if ((i & 64) == 0) {
            this.h = m;
        } else {
            this.h = aVar;
        }
        if ((i & 128) == 0) {
            this.i = n;
        } else {
            this.i = dVar;
        }
        if ((i & 256) == 0) {
            this.j = 0;
        } else {
            this.j = i2;
        }
        this.k = false;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion a() {
        Set set = this.g;
        return new Story(this.b, this.c, this.d, this.e, this.f, set, this.h, this.i, 256);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List b() {
        return EmptyList.a;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final String c() {
        return "media-story";
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List d() {
        return EmptyList.a;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: e */
    public final Calendar getD() {
        return this.h.d;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: f, reason: from getter */
    public final boolean getF() {
        return this.e;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: g, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List h() {
        return EmptyList.a;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: i */
    public final int getE() {
        return this.h.a;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: j, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: k, reason: from getter */
    public final Set getH() {
        return this.g;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: l */
    public final Calendar getF() {
        return this.h.c;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion.Type m() {
        return Promotion.Type.STORY;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: n */
    public final List getD() {
        return this.h.b;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void p() {
        this.e = true;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void q(Set set) {
        this.g = set;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void r(boolean z) {
        this.f = z;
    }

    public final ArrayList s(PromotionBackground.Type type) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.i.d) {
            ru.yandex.taxi.promotions.model.d dVar = PromotionBackground.Companion;
            List e2 = bVar.getE();
            dVar.getClass();
            String b2 = ru.yandex.taxi.promotions.model.d.b(e2, type);
            if (b2 != null && b2.length() != 0) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    public final ListBuilder t(PageMediaType pageMediaType) {
        String b2;
        ListBuilder a2 = rcc.a();
        Iterator it = this.i.d.iterator();
        while (it.hasNext()) {
            c f2 = ((b) it.next()).getF();
            if (f2 != null && f2.getA() == pageMediaType && (b2 = f2.getB()) != null && b2.length() != 0) {
                a2.add(f2.getB());
            }
        }
        return a2.j();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/Story$g;", "", "Companion", "ru/yandex/taxi/communications/api/dto/l0", "ru/yandex/taxi/communications/api/dto/m0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class g {
        public static final m0 Companion = new m0();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(19))};
        public final StoryLayoutType a;

        public /* synthetic */ g(int i, StoryLayoutType storyLayoutType) {
            if ((i & 1) == 0) {
                this.a = StoryLayoutType.MAIN;
            } else {
                this.a = storyLayoutType;
            }
        }

        public g() {
            this(0);
        }

        public g(int i) {
            this.a = StoryLayoutType.MAIN;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/Story$e;", "", "Companion", "ru/yandex/taxi/communications/api/dto/h0", "ru/yandex/taxi/communications/api/dto/i0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class e {
        public static final i0 Companion = new i0();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bmu0(6)), null, null};
        public final List a;
        public final f b;
        public final f c;

        public /* synthetic */ e(int i, List list, f fVar, f fVar2) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = fVar;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = fVar2;
            }
        }

        public e() {
            this.a = EmptyList.a;
            this.b = null;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/Story$c;", "", "Companion", "ru/yandex/taxi/communications/api/dto/c0", "ru/yandex/taxi/communications/api/dto/d0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class c {
        public static final d0 Companion = new d0();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bmu0(4)), null, null};
        public final PageMediaType a;
        public final String b;
        public final boolean c;

        public /* synthetic */ c(int i, PageMediaType pageMediaType, String str, boolean z) {
            this.a = (i & 1) == 0 ? null : pageMediaType;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final PageMediaType getA() {
            return this.a;
        }

        public c() {
            this.a = null;
            this.b = "";
            this.c = false;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/Story$f;", "", "Companion", "ru/yandex/taxi/communications/api/dto/j0", "ru/yandex/taxi/communications/api/dto/k0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class f {
        public static final k0 Companion = new k0();
        public final String a;
        public final String b;
        public final FormattedText c;

        public /* synthetic */ f(int i, String str, String str2, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText;
            }
        }

        public f() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/Story$a;", "", "Companion", "ru/yandex/taxi/communications/api/dto/z", "ru/yandex/taxi/communications/api/dto/y", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final z Companion = new z();
        public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(17)), null, null};
        public final int a;
        public final List b;
        public final Calendar c;
        public final Calendar d;

        public /* synthetic */ a(int i, int i2, List list, Calendar calendar, Calendar calendar2) {
            this.a = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = calendar;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = calendar2;
            }
        }

        public a(int i) {
            this.a = 0;
            this.b = EmptyList.a;
            this.c = null;
            this.d = null;
        }

        public a() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/Story$d;", "", "Companion", "ru/yandex/taxi/communications/api/dto/f0", "ru/yandex/taxi/communications/api/dto/g0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final g0 Companion = new g0();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(18))};
        public final boolean a;
        public final boolean b;
        public final e c;
        public final List d;

        public /* synthetic */ d(int i, boolean z, boolean z2, e eVar, List list) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = eVar;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
        }

        public d(int i) {
            this.a = false;
            this.b = false;
            this.c = null;
            this.d = EmptyList.a;
        }

        public d() {
            this(0);
        }
    }

    public Story() {
        this(null, null, null, false, false, null, null, null, 511);
    }

    public Story(String str, Map map, String str2, boolean z, boolean z2, Set set, a aVar, d dVar, int i) {
        str = (i & 1) != 0 ? "" : str;
        map = (i & 2) != 0 ? null : map;
        str2 = (i & 4) != 0 ? "" : str2;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? true : z2;
        set = (i & 32) != 0 ? EmptySet.a : set;
        aVar = (i & 64) != 0 ? m : aVar;
        dVar = (i & 128) != 0 ? n : dVar;
        this.b = str;
        this.c = map;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = set;
        this.h = aVar;
        this.i = dVar;
        this.j = 0;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/Story$b;", "", "Companion", "ru/yandex/taxi/communications/api/dto/a0", "ru/yandex/taxi/communications/api/dto/b0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class b {
        public static final b0 Companion = new b0();
        public static final i3y[] k;
        public final int a;
        public final boolean b;
        public final TypedContentWidget c;
        public final TypedContentWidget d;
        public final List e;
        public final c f;
        public final StoryWidgets g;
        public final Map h;
        public final g i;
        public final owd0 j;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            k = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bmu0(2)), null, null, kotlin.a.b(lazyThreadSafetyMode, new bmu0(3)), null, null};
        }

        public b(int i, int i2, boolean z, TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, List list, c cVar, StoryWidgets storyWidgets, Map map, g gVar, owd0 owd0Var) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = typedContentWidget;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = typedContentWidget2;
            }
            if ((i & 16) == 0) {
                this.e = EmptyList.a;
            } else {
                this.e = list;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = cVar;
            }
            if ((i & 64) == 0) {
                this.g = StoryWidgets.g;
            } else {
                this.g = storyWidgets;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = map;
            }
            if ((i & 256) == 0) {
                Story.Companion.getClass();
                this.i = Story.o;
            } else {
                this.i = gVar;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = owd0Var;
            }
        }

        /* renamed from: a, reason: from getter */
        public final List getE() {
            return this.e;
        }

        /* renamed from: b, reason: from getter */
        public final c getF() {
            return this.f;
        }

        public b() {
            StoryWidgets storyWidgets = StoryWidgets.g;
            Story.Companion.getClass();
            g gVar = Story.o;
            this.a = 0;
            this.b = false;
            this.c = null;
            this.d = null;
            this.e = EmptyList.a;
            this.f = null;
            this.g = storyWidgets;
            this.h = null;
            this.i = gVar;
            this.j = null;
        }
    }
}
