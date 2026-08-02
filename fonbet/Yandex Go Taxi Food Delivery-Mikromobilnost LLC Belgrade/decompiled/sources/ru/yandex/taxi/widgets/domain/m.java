package ru.yandex.taxi.widgets.domain;

import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import defpackage.bsv0;
import defpackage.c151;
import defpackage.d4s0;
import defpackage.f4s0;
import defpackage.g92;
import defpackage.gci0;
import defpackage.j551;
import defpackage.j73;
import defpackage.n4s0;
import defpackage.o400;
import defpackage.qc20;
import defpackage.r551;
import defpackage.rfw0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yaf0;
import java.util.Arrays;
import java.util.Set;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;

/* loaded from: classes10.dex */
public final class m implements r551 {
    public static boolean j;
    public static final Set k;
    public static final Set l;
    public final j551 a;
    public final rfw0 b;
    public final n4s0 c;
    public final tt2 d;
    public final c151 e;
    public final f4s0 f;
    public final com.yandex.go.superapp.tracking.data.e g;
    public final bsv0 h;
    public final qc20 i;

    static {
        ProductsScreenType$Type productsScreenType$Type = ProductsScreenType$Type.MAIN;
        ProductsScreenType$Type productsScreenType$Type2 = ProductsScreenType$Type.SUPERAPP_MAIN;
        ProductsScreenType$Type productsScreenType$Type3 = ProductsScreenType$Type.ON_MULTI_ORDER;
        ProductsScreenType$Type productsScreenType$Type4 = ProductsScreenType$Type.TRACKING_LIST;
        k = j73.f0(new ProductsScreenType$Type[]{productsScreenType$Type, productsScreenType$Type2, productsScreenType$Type3, productsScreenType$Type4});
        l = j73.f0(new ProductsScreenType$Type[]{productsScreenType$Type2, productsScreenType$Type4});
    }

    public m(j551 j551Var, rfw0 rfw0Var, n4s0 n4s0Var, tt2 tt2Var, c151 c151Var, f4s0 f4s0Var, com.yandex.go.superapp.tracking.data.e eVar, bsv0 bsv0Var, qc20 qc20Var) {
        this.a = j551Var;
        this.b = rfw0Var;
        this.c = n4s0Var;
        this.d = tt2Var;
        this.e = c151Var;
        this.f = f4s0Var;
        this.g = eVar;
        this.h = bsv0Var;
        this.i = qc20Var;
    }

    @Override // defpackage.n4s0
    public final tpr b(yaf0 yaf0Var) {
        int i = 2;
        if (!kotlin.collections.a.G(k, yaf0Var.a())) {
            return new g92(i, d4s0.m);
        }
        com.yandex.go.superapp.tracking.data.e eVar = this.g;
        eVar.b();
        j = true;
        gci0 gci0Var = eVar.v;
        j551 j551Var = this.a;
        j551Var.getClass();
        m0 m0Var = new m0(yaf0Var.equals(yaf0.c) ? (tpr) j551Var.b.a.getValue() : j551Var.c.c(yaf0Var), gci0Var, new WidgetsInteractorImpl$requestWidgets$1(j551Var, yaf0Var, null));
        j551Var.a.getClass();
        o oVar = new o(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{ru.yandex.taxi.utils.a.a(new h(kotlinx.coroutines.flow.e.F(m0Var, uyj.a)), 2000L), new n(new l(kotlinx.coroutines.flow.e.t(new m0(new ru.yandex.taxi.widgets.data.repository.widget_models.b(j551Var.d.c, yaf0Var), this.h.a, new WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$1(yaf0Var, null, this))), this, yaf0Var), new WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$3(yaf0Var, null, this))}, 2)), new WidgetsShortcutsViewSource$startScreenType$1(yaf0Var, null, this));
        this.d.getClass();
        return new j(kotlinx.coroutines.flow.e.F(oVar, o400.a));
    }

    @Override // defpackage.n4s0
    public final void stop() {
        this.g.c();
    }
}
