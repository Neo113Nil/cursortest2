package defpackage;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.promotions.model.Promotion;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltg60;", "Lru/yandex/taxi/promotions/model/Promotion;", "Companion", "rg60", "sg60", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class tg60 extends Promotion {
    public static final sg60 Companion = new sg60();
    public static final i3y[] p;
    public final String b;
    public final Map c;
    public final List d;
    public final int e;
    public final Calendar f;
    public final Calendar g;
    public final String h;
    public boolean i;
    public boolean j;
    public Set k;
    public final TypedContentWidget l;
    public final TypedContentWidget m;
    public final String n;
    public final BannerWidgets o;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new i3y[]{null, a.b(lazyThreadSafetyMode, new j660(20)), a.b(lazyThreadSafetyMode, new j660(21)), null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new j660(22)), null, null, null, null};
    }

    public /* synthetic */ tg60(int i, String str, Map map, List list, int i2, Calendar calendar, Calendar calendar2, String str2, boolean z, boolean z2, Set set, TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, String str3, BannerWidgets bannerWidgets) {
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
            this.h = "";
        } else {
            this.h = str2;
        }
        if ((i & 128) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
        if ((i & 256) == 0) {
            this.j = true;
        } else {
            this.j = z2;
        }
        if ((i & 512) == 0) {
            this.k = EmptySet.a;
        } else {
            this.k = set;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = typedContentWidget;
        }
        if ((i & 2048) == 0) {
            this.m = null;
        } else {
            this.m = typedContentWidget2;
        }
        if ((i & 4096) == 0) {
            this.n = null;
        } else {
            this.n = str3;
        }
        this.o = (i & 8192) == 0 ? BannerWidgets.j : bannerWidgets;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion a() {
        Set set = this.k;
        return new tg60(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, set, this.l, this.m, this.n, this.o);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List b() {
        String str = this.n;
        return (str == null || str.length() == 0) ? EmptyList.a : Collections.singletonList(str);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List d() {
        return EmptyList.a;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: e, reason: from getter */
    public final Calendar getD() {
        return this.g;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: f, reason: from getter */
    public final boolean getE() {
        return this.i;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: g, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List h() {
        return b();
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
    public final Set getG() {
        return this.k;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: l, reason: from getter */
    public final Calendar getF() {
        return this.f;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion.Type m() {
        return Promotion.Type.NOTIFICATION;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: n, reason: from getter */
    public final List getD() {
        return this.d;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void p() {
        this.i = true;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void q(Set set) {
        this.k = set;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void r(boolean z) {
        this.j = z;
    }

    public tg60(String str, Map map, List list, int i, Calendar calendar, Calendar calendar2, String str2, boolean z, boolean z2, Set set, TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, String str3, BannerWidgets bannerWidgets) {
        this.b = str;
        this.c = map;
        this.d = list;
        this.e = i;
        this.f = calendar;
        this.g = calendar2;
        this.h = str2;
        this.i = z;
        this.j = z2;
        this.k = set;
        this.l = typedContentWidget;
        this.m = typedContentWidget2;
        this.n = str3;
        this.o = bannerWidgets;
    }

    public tg60() {
        this("", null, null, 0, null, null, "", false, true, EmptySet.a, null, null, null, BannerWidgets.j);
    }
}
