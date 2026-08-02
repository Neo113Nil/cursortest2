package defpackage;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.promotions.model.Promotion;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lzi20;", "Lru/yandex/taxi/promotions/model/Promotion;", "Companion", "xi20", "yi20", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class zi20 extends Promotion {
    public static final yi20 Companion = new yi20();
    public static final i3y[] g;
    public final String b;
    public final Map c;
    public Set d;
    public boolean e;
    public boolean f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, a.b(lazyThreadSafetyMode, new g110(20)), a.b(lazyThreadSafetyMode, new g110(21)), null, null};
    }

    public /* synthetic */ zi20(int i, String str, Map map, Set set, boolean z, boolean z2) {
        this.b = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = EmptySet.a;
        } else {
            this.d = set;
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
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion a() {
        return new zi20(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List b() {
        return EmptyList.a;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List d() {
        return EmptyList.a;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: e */
    public final Calendar getD() {
        return null;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: f, reason: from getter */
    public final boolean getE() {
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
        return 0;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: j, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: k, reason: from getter */
    public final Set getG() {
        return this.d;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: l */
    public final Calendar getF() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(0L);
        return calendar;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion.Type m() {
        return Promotion.Type.MISSED_SEEN;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: n */
    public final List getD() {
        return null;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void p() {
        this.e = true;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void q(Set set) {
        this.d = set;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void r(boolean z) {
        this.f = z;
    }

    public zi20(String str, Map map, Set set, boolean z, boolean z2) {
        this.b = str;
        this.c = map;
        this.d = set;
        this.e = z;
        this.f = z2;
    }

    public zi20() {
        this("", null, EmptySet.a, false, true);
    }
}
