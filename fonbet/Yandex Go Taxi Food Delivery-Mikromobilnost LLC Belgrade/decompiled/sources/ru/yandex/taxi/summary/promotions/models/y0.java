package ru.yandex.taxi.summary.promotions.models;

import defpackage.bnv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ly3;
import defpackage.o8s0;
import defpackage.ui70;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/y0;", "Lru/yandex/taxi/summary/promotions/models/z0;", "Companion", "ru/yandex/taxi/summary/promotions/models/w0", "ru/yandex/taxi/summary/promotions/models/x0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class y0 extends z0 {
    public static final x0 Companion = new x0();
    public static final i3y[] h;
    public final String a;
    public final FormattedText b;
    public final jsq0 c;
    public final o8s0 d;
    public final SummaryPromotionsResponse.f e;
    public final ui70 f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new bnv0(11)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bnv0(12))};
    }

    public y0(int i, String str, FormattedText formattedText, jsq0 jsq0Var, o8s0 o8s0Var, SummaryPromotionsResponse.f fVar, ui70 ui70Var, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
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
            this.g = null;
        } else {
            this.g = list;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return jl40.l(this.a, y0Var.a) && jl40.l(this.b, y0Var.b) && jl40.l(this.c, y0Var.c) && jl40.l(this.d, y0Var.d) && jl40.l(this.e, y0Var.e) && jl40.l(this.f, y0Var.f) && jl40.l(this.g, y0Var.g);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        jsq0 jsq0Var = this.c;
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((c + (jsq0Var == null ? 0 : jsq0Var.a.hashCode())) * 31)) * 31)) * 31;
        ui70 ui70Var = this.f;
        int hashCode2 = (hashCode + (ui70Var == null ? 0 : ui70Var.hashCode())) * 31;
        List list = this.g;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("StepsInstructionsItem(id=", this.a, ", title=", ", displayOnType=", this.b);
        q.append(this.c);
        q.append(", showPolicy=");
        q.append(this.d);
        q.append(", widgets=");
        q.append(this.e);
        q.append(", orderButton=");
        q.append(this.f);
        q.append(", steps=");
        return ly3.s(q, this.g, Extension.C_BRAKE);
    }

    public y0() {
        FormattedText formattedText = FormattedText.c;
        o8s0 o8s0Var = new o8s0(15);
        SummaryPromotionsResponse.f fVar = new SummaryPromotionsResponse.f(0);
        this.a = "";
        this.b = formattedText;
        this.c = null;
        this.d = o8s0Var;
        this.e = fVar;
        this.f = null;
        this.g = null;
    }
}
