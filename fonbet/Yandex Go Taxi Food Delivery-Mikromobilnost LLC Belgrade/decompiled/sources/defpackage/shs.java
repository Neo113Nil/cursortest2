package defpackage;

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
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.promotions.model.d;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lshs;", "Lru/yandex/taxi/promotions/model/Promotion;", "Companion", "a", "ohs", "phs", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class shs extends Promotion {
    public static final phs Companion = new phs();
    public static final i3y[] n;
    public final String b;
    public final Map c;
    public final List d;
    public final int e;
    public final Calendar f;
    public final Calendar g;
    public Set h;
    public final String i;
    public boolean j;
    public boolean k;
    public final List l;
    public final n8s0 m;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new j8s(17)), kotlin.a.b(lazyThreadSafetyMode, new j8s(18)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new j8s(19)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new j8s(20)), null};
    }

    public /* synthetic */ shs(int i, String str, Map map, List list, int i2, Calendar calendar, Calendar calendar2, Set set, String str2, boolean z, boolean z2, List list2, n8s0 n8s0Var) {
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
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 8) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = calendar;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = calendar2;
        }
        if ((i & 64) == 0) {
            this.h = EmptySet.a;
        } else {
            this.h = set;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str2;
        }
        if ((i & 256) == 0) {
            this.j = false;
        } else {
            this.j = z;
        }
        if ((i & 512) == 0) {
            this.k = true;
        } else {
            this.k = z2;
        }
        if ((i & 1024) == 0) {
            this.l = EmptyList.a;
        } else {
            this.l = list2;
        }
        if ((i & 2048) == 0) {
            this.m = null;
        } else {
            this.m = n8s0Var;
        }
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List b() {
        String str;
        ListBuilder a2 = rcc.a();
        for (a aVar : this.l) {
            gr4 gr4Var = aVar.d;
            ListBuilder a3 = rcc.a();
            String str2 = aVar.c;
            if (str2 != null && str2.length() != 0) {
                a3.add(str2);
            }
            if (gr4Var != null && (str = gr4Var.a) != null && str.length() != 0) {
                a3.add(str);
            }
            d dVar = PromotionBackground.Companion;
            List list = aVar.f;
            dVar.getClass();
            a3.addAll(d.a(list, false));
            a2.addAll(a3.j());
        }
        return a2.j();
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List d() {
        String str;
        ListBuilder a2 = rcc.a();
        for (a aVar : this.l) {
            aVar.getClass();
            ListBuilder a3 = rcc.a();
            gr4 gr4Var = aVar.d;
            if (gr4Var != null && (str = gr4Var.a) != null && str.length() != 0) {
                a3.add(str);
            }
            d dVar = PromotionBackground.Companion;
            List list = aVar.f;
            PromotionBackground.Type type = PromotionBackground.Type.ANIMATION;
            dVar.getClass();
            a3.addAll(d.e(list, type));
            a2.addAll(a3.j());
        }
        return a2.j();
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: e, reason: from getter */
    public final Calendar getG() {
        return this.g;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shs)) {
            return false;
        }
        shs shsVar = (shs) obj;
        return jl40.l(this.b, shsVar.b) && jl40.l(this.c, shsVar.c) && jl40.l(this.d, shsVar.d) && this.e == shsVar.e && jl40.l(this.f, shsVar.f) && jl40.l(this.g, shsVar.g) && jl40.l(this.h, shsVar.h) && jl40.l(this.i, shsVar.i) && this.j == shsVar.j && this.k == shsVar.k && jl40.l(this.l, shsVar.l) && jl40.l(this.m, shsVar.m);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: f, reason: from getter */
    public final boolean getI() {
        return this.j;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: g, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List h() {
        ListBuilder a2 = rcc.a();
        for (a aVar : this.l) {
            aVar.getClass();
            ListBuilder a3 = rcc.a();
            String str = aVar.c;
            if (str != null && str.length() != 0) {
                a3.add(str);
            }
            d dVar = PromotionBackground.Companion;
            List list = aVar.f;
            PromotionBackground.Type type = PromotionBackground.Type.IMAGE;
            dVar.getClass();
            a3.addAll(d.e(list, type));
            a2.addAll(a3.j());
        }
        return a2.j();
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Map map = this.c;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List list = this.d;
        int b = oyr.b(this.e, (hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31);
        Calendar calendar = this.f;
        int hashCode3 = (b + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Calendar calendar2 = this.g;
        int c = unr0.c(unr0.e(unr0.e(unr0.b(g8e.e(this.h, (hashCode3 + (calendar2 == null ? 0 : calendar2.hashCode())) * 31, 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        n8s0 n8s0Var = this.m;
        return c + (n8s0Var != null ? n8s0Var.hashCode() : 0);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: i, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: j, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: k, reason: from getter */
    public final Set getK() {
        return this.h;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: l, reason: from getter */
    public final Calendar getF() {
        return this.f;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion.Type m() {
        return Promotion.Type.FULLSCREEN;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: n, reason: from getter */
    public final List getD() {
        return this.d;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final boolean o() {
        return super.o() && !this.l.isEmpty();
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void p() {
        this.j = true;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void q(Set set) {
        this.h = set;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void r(boolean z) {
        this.k = z;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final shs a() {
        Set set = this.h;
        boolean z = this.j;
        boolean z2 = this.k;
        List list = this.l;
        int i = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            TypedContentWidget typedContentWidget = aVar.a;
            TypedContentWidget typedContentWidget2 = aVar.b;
            String str = aVar.c;
            gr4 gr4Var = aVar.d;
            gr4 gr4Var2 = gr4Var != null ? new gr4(gr4Var.a, gr4Var.b) : null;
            BannerWidgets bannerWidgets = aVar.e;
            List<PromotionBackground> list2 = aVar.f;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, i));
            for (PromotionBackground promotionBackground : list2) {
                arrayList2.add(new PromotionBackground(promotionBackground.a, promotionBackground.b, promotionBackground.c, promotionBackground.d, promotionBackground.e));
                it = it;
            }
            Iterator it2 = it;
            owd0 owd0Var = aVar.g;
            arrayList.add(new a(typedContentWidget, typedContentWidget2, str, gr4Var2, bannerWidgets, arrayList2, owd0Var != null ? new owd0(owd0Var.a, owd0Var.b) : null, aVar.h));
            it = it2;
            i = 10;
        }
        return new shs(this.b, this.c, this.d, this.e, this.f, this.g, set, this.i, z, z2, arrayList, this.m);
    }

    public final String toString() {
        Set set = this.h;
        boolean z = this.j;
        boolean z2 = this.k;
        StringBuilder sb = new StringBuilder("FullScreenBanner(id=");
        sb.append(this.b);
        sb.append(", realtimeAnalyticsPayload=");
        sb.append(this.c);
        sb.append(", zones=");
        sb.append(this.d);
        sb.append(", priority=");
        sb.append(this.e);
        sb.append(", startDate=");
        sb.append(this.f);
        sb.append(", endDate=");
        sb.append(this.g);
        sb.append(", screens=");
        sb.append(set);
        sb.append(", promotion=");
        sb.append(this.i);
        sb.append(", fromList=");
        nnm.v(", shouldBeDeletedAfterShow=", ", pages=", sb, z, z2);
        sb.append(this.l);
        sb.append(", showPolicy=");
        sb.append(this.m);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lshs$a;", "", "Companion", "qhs", "rhs", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final rhs Companion = new rhs();
        public static final i3y[] i;
        public final TypedContentWidget a;
        public final TypedContentWidget b;
        public final String c;
        public final gr4 d;
        public final BannerWidgets e;
        public final List f;
        public final owd0 g;
        public final Map h;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            i = new i3y[]{null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new j8s(21)), null, kotlin.a.b(lazyThreadSafetyMode, new j8s(22))};
        }

        public /* synthetic */ a(int i2, TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, String str, gr4 gr4Var, BannerWidgets bannerWidgets, List list, owd0 owd0Var, Map map) {
            if ((i2 & 1) == 0) {
                this.a = null;
            } else {
                this.a = typedContentWidget;
            }
            if ((i2 & 2) == 0) {
                this.b = null;
            } else {
                this.b = typedContentWidget2;
            }
            if ((i2 & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i2 & 8) == 0) {
                this.d = null;
            } else {
                this.d = gr4Var;
            }
            if ((i2 & 16) == 0) {
                this.e = BannerWidgets.j;
            } else {
                this.e = bannerWidgets;
            }
            if ((i2 & 32) == 0) {
                this.f = EmptyList.a;
            } else {
                this.f = list;
            }
            if ((i2 & 64) == 0) {
                this.g = null;
            } else {
                this.g = owd0Var;
            }
            if ((i2 & 128) == 0) {
                this.h = null;
            } else {
                this.h = map;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g) && jl40.l(this.h, aVar.h);
        }

        public final int hashCode() {
            TypedContentWidget typedContentWidget = this.a;
            int hashCode = (typedContentWidget == null ? 0 : typedContentWidget.hashCode()) * 31;
            TypedContentWidget typedContentWidget2 = this.b;
            int hashCode2 = (hashCode + (typedContentWidget2 == null ? 0 : typedContentWidget2.hashCode())) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            gr4 gr4Var = this.d;
            int c = unr0.c((this.e.hashCode() + ((hashCode3 + (gr4Var == null ? 0 : gr4Var.hashCode())) * 31)) * 31, 31, this.f);
            owd0 owd0Var = this.g;
            int hashCode4 = (c + (owd0Var == null ? 0 : owd0Var.hashCode())) * 31;
            Map map = this.h;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            return "Page(title=" + this.a + ", text=" + this.b + ", image=" + this.c + ", animation=" + this.d + ", widgets=" + this.e + ", backgrounds=" + this.f + ", policy=" + this.g + ", elementPayload=" + this.h + Extension.C_BRAKE;
        }

        public a() {
            this(null, null, null, null, 255);
        }

        public a(TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, String str, gr4 gr4Var, BannerWidgets bannerWidgets, List list, owd0 owd0Var, Map map) {
            this.a = typedContentWidget;
            this.b = typedContentWidget2;
            this.c = str;
            this.d = gr4Var;
            this.e = bannerWidgets;
            this.f = list;
            this.g = owd0Var;
            this.h = map;
        }

        public /* synthetic */ a(TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, BannerWidgets bannerWidgets, List list, int i2) {
            this((i2 & 1) != 0 ? null : typedContentWidget, (i2 & 2) != 0 ? null : typedContentWidget2, null, null, (i2 & 16) != 0 ? BannerWidgets.j : bannerWidgets, (i2 & 32) != 0 ? EmptyList.a : list, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public shs() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095);
    }

    public shs(String str, Map map, List list, int i, Calendar calendar, Calendar calendar2, Set set, String str2, boolean z, boolean z2, List list2, n8s0 n8s0Var) {
        this.b = str;
        this.c = map;
        this.d = list;
        this.e = i;
        this.f = calendar;
        this.g = calendar2;
        this.h = set;
        this.i = str2;
        this.j = z;
        this.k = z2;
        this.l = list2;
        this.m = n8s0Var;
    }

    public /* synthetic */ shs(Calendar calendar, Calendar calendar2, List list, int i) {
        this((i & 1) != 0 ? "" : "create_business_account_fallback_fullscreen", null, null, (i & 8) != 0 ? 0 : 10, (i & 16) != 0 ? null : calendar, (i & 32) != 0 ? null : calendar2, EmptySet.a, "", false, true, (i & 1024) != 0 ? EmptyList.a : list, null);
    }
}
