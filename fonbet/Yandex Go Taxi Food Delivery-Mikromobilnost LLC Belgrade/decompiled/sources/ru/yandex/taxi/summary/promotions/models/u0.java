package ru.yandex.taxi.summary.promotions.models;

import defpackage.bnv0;
import defpackage.c4v;
import defpackage.gsq0;
import defpackage.ht1;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.o8s0;
import defpackage.p7v;
import defpackage.ui70;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/u0;", "Lru/yandex/taxi/summary/promotions/models/z0;", "Companion", "ru/yandex/taxi/summary/promotions/models/s0", "ru/yandex/taxi/summary/promotions/models/t0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class u0 extends z0 {
    public static final t0 Companion = new t0();
    public static final i3y[] m;
    public final String a;
    public final ht1 b;
    public final jsq0 c;
    public final o8s0 d;
    public final SummaryPromotionsResponse.f e;
    public final ui70 f;
    public final ht1 g;
    public final ht1 h;
    public final c4v i;
    public final p7v j;
    public final List k;
    public final Map l;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new bnv0(8)), null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bnv0(9)), kotlin.a.b(lazyThreadSafetyMode, new bnv0(10))};
    }

    public u0(int i, String str, ht1 ht1Var, jsq0 jsq0Var, o8s0 o8s0Var, SummaryPromotionsResponse.f fVar, ui70 ui70Var, ht1 ht1Var2, ht1 ht1Var3, c4v c4vVar, p7v p7vVar, List list, Map map) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            ht1.Companion.getClass();
            this.b = ht1.d;
        } else {
            this.b = ht1Var;
        }
        String str2 = null;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jsq0Var;
        }
        if ((i & 8) == 0) {
            this.d = new o8s0(15);
        } else {
            this.d = o8s0Var;
        }
        if ((i & 16) == 0) {
            this.e = new SummaryPromotionsResponse.f(0);
        } else {
            this.e = fVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = ui70Var;
        }
        if ((i & 64) == 0) {
            ht1.Companion.getClass();
            this.g = ht1.d;
        } else {
            this.g = ht1Var2;
        }
        if ((i & 128) == 0) {
            ht1.Companion.getClass();
            this.h = ht1.d;
        } else {
            this.h = ht1Var3;
        }
        if ((i & 256) == 0) {
            this.i = new c4v(str2, str2, 3);
        } else {
            this.i = c4vVar;
        }
        if ((i & 512) == 0) {
            this.j = new p7v(0);
        } else {
            this.j = p7vVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = map;
        }
    }

    @Override // ru.yandex.taxi.summary.promotions.models.z0
    /* renamed from: a, reason: from getter */
    public final jsq0 getC() {
        return this.c;
    }

    @Override // ru.yandex.taxi.summary.promotions.models.z0
    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // ru.yandex.taxi.summary.promotions.models.z0
    /* renamed from: c, reason: from getter */
    public final o8s0 getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final ht1 getH() {
        return this.h;
    }

    /* renamed from: e, reason: from getter */
    public final ht1 getG() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return jl40.l(this.a, u0Var.a) && jl40.l(this.b, u0Var.b) && jl40.l(this.c, u0Var.c) && jl40.l(this.d, u0Var.d) && jl40.l(this.e, u0Var.e) && jl40.l(this.f, u0Var.f) && jl40.l(this.g, u0Var.g) && jl40.l(this.h, u0Var.h) && jl40.l(this.i, u0Var.i) && jl40.l(this.j, u0Var.j) && jl40.l(this.k, u0Var.k) && jl40.l(this.l, u0Var.l);
    }

    /* renamed from: f, reason: from getter */
    public final ht1 getB() {
        return this.b;
    }

    /* renamed from: g, reason: from getter */
    public final List getK() {
        return this.k;
    }

    /* renamed from: h, reason: from getter */
    public final Map getL() {
        return this.l;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        jsq0 jsq0Var = this.c;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (jsq0Var == null ? 0 : jsq0Var.a.hashCode())) * 31)) * 31)) * 31;
        ui70 ui70Var = this.f;
        int hashCode3 = (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((hashCode2 + (ui70Var == null ? 0 : ui70Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        List list = this.k;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.l;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final c4v getI() {
        return this.i;
    }

    /* renamed from: j, reason: from getter */
    public final p7v getJ() {
        return this.j;
    }

    /* renamed from: k, reason: from getter */
    public final ui70 getF() {
        return this.f;
    }

    /* renamed from: l, reason: from getter */
    public final SummaryPromotionsResponse.f getE() {
        return this.e;
    }

    public final String toString() {
        return "DefaultItem(id=" + this.a + ", alignedTitle=" + this.b + ", displayOnType=" + this.c + ", showPolicy=" + this.d + ", widgets=" + this.e + ", orderButton=" + this.f + ", alignedText=" + this.g + ", alignedFooter=" + this.h + ", icon=" + this.i + ", image=" + this.j + ", bullets=" + this.k + ", headerPayload=" + this.l + Extension.C_BRAKE;
    }

    public u0() {
        ht1.Companion.getClass();
        ht1 ht1Var = ht1.d;
        o8s0 o8s0Var = new o8s0(15);
        SummaryPromotionsResponse.f fVar = new SummaryPromotionsResponse.f(0);
        String str = null;
        c4v c4vVar = new c4v(str, str, 3);
        p7v p7vVar = new p7v(0);
        this.a = "";
        this.b = ht1Var;
        this.c = null;
        this.d = o8s0Var;
        this.e = fVar;
        this.f = null;
        this.g = ht1Var;
        this.h = ht1Var;
        this.i = c4vVar;
        this.j = p7vVar;
        this.k = null;
        this.l = null;
    }
}
