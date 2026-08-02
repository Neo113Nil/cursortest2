package ru.yandex.taxi.preorder.summary.selector.appearance;

import android.content.Context;
import android.graphics.Rect;
import com.yandex.go.taxi.ui.selector.model.WideTariffAppearanceExperiment;
import defpackage.bbx0;
import defpackage.bdc;
import defpackage.cbx0;
import defpackage.dbx0;
import defpackage.f051;
import defpackage.i5s0;
import defpackage.jbh;
import defpackage.jv21;
import defpackage.mqv0;
import defpackage.mrg0;
import defpackage.qsg0;
import defpackage.rqo;
import defpackage.tje;
import defpackage.v7t0;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yvf0;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final mqv0 b;
    public final rqo c;
    public final yvf0 d;
    public final yvf0 e;
    public final bdc f = new bdc(xng0.textMain);
    public final bdc g = new bdc(xng0.textMinor);

    public a(Context context, mqv0 mqv0Var, rqo rqoVar, jv21 jv21Var, i5s0 i5s0Var) {
        this.a = context;
        this.b = mqv0Var;
        this.c = rqoVar;
        this.d = jv21Var;
        this.e = i5s0Var;
    }

    public final bbx0 a(SummaryUiDelegate$TariffCardStyle summaryUiDelegate$TariffCardStyle, float f, dbx0 dbx0Var, int i, int i2, int i3) {
        return new bbx0(summaryUiDelegate$TariffCardStyle, f, this.f, this.g, new TariffAppearanceConfigFactory$config$1(0, dbx0Var, dbx0.class, "getBackgroundDrawable", "getBackgroundDrawable()Landroid/graphics/drawable/Drawable;", 0), new TariffAppearanceConfigFactory$config$2(0, dbx0Var, dbx0.class, "getAlternativeOuterBackground", "getAlternativeOuterBackground()Landroid/graphics/drawable/Drawable;", 0), new TariffAppearanceConfigFactory$config$3(0, dbx0Var, dbx0.class, "getAlternativeOptionBackground", "getAlternativeOptionBackground()Landroid/graphics/drawable/Drawable;", 0), new TariffAppearanceConfigFactory$config$4(0, dbx0Var, dbx0.class, "priceLine", "priceLine()Landroid/graphics/drawable/Drawable;", 0), dbx0Var.e(), i, i2, i3);
    }

    public final bbx0 b() {
        SummaryUiDelegate$TariffCardStyle c = this.b.c();
        int i = cbx0.a[c.ordinal()];
        Context context = this.a;
        if (i != 1) {
            if (i == 2) {
                return a(c, 0.4f, (v7t0) this.e.get(), tje.r(qsg0.high_tariff_card_min_width, context), tje.u(4, context), tje.u(2, context));
            }
            w511.b();
            return null;
        }
        WideTariffAppearanceExperiment wideTariffAppearanceExperiment = (WideTariffAppearanceExperiment) ((jbh) this.c).c(WideTariffAppearanceExperiment.f).b();
        f051 f051Var = (f051) this.d.get();
        int r = tje.r(mrg0.go_design_m_space, context);
        int v = xw31.v();
        Rect rect = f051Var.c;
        return a(c, (wideTariffAppearanceExperiment.b && wideTariffAppearanceExperiment.e) ? 0.6f : 1.0f, f051Var, (((v - (r * 2)) - rect.left) / 2) - rect.right, tje.u(4, context), 0);
    }
}
