package ru.yandex.taxi.main_screen_custom.presentation;

import android.graphics.Rect;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.mapkit.ScreenRect;
import defpackage.a3v;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.ar30;
import defpackage.dib1;
import defpackage.dqf0;
import defpackage.e3a;
import defpackage.e3s0;
import defpackage.fb00;
import defpackage.g8e;
import defpackage.g990;
import defpackage.lei0;
import defpackage.lof0;
import defpackage.lq30;
import defpackage.mnf0;
import defpackage.mof0;
import defpackage.n7q0;
import defpackage.nof0;
import defpackage.o6a;
import defpackage.pof0;
import defpackage.pzt0;
import defpackage.qdi;
import defpackage.qv10;
import defpackage.r18;
import defpackage.s18;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uei;
import defpackage.vof0;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;

/* loaded from: classes9.dex */
public final class v extends ad5 {
    public final e3a A;
    public final qdi B;
    public final ru.yandex.taxi.main_screen_custom.presentation.analytics.a C;
    public final ru.yandex.taxi.main_screen_custom.domain.f D;
    public final lq30 E;
    public final dqf0 F;
    public final n7q0 G;
    public final fb00 H;
    public final com.yandex.go.navigation.screen.c I;
    public final e3s0 J;
    public final o6a K;
    public final uei L;
    public final pof0 M;
    public pzt0 N;
    public Optional O;
    public final ah00 x;
    public final a3v y;
    public final ar30 z;

    public v(ah00 ah00Var, a3v a3vVar, ar30 ar30Var, e3a e3aVar, qdi qdiVar, ru.yandex.taxi.main_screen_custom.presentation.analytics.a aVar, ru.yandex.taxi.main_screen_custom.domain.f fVar, lq30 lq30Var, dqf0 dqf0Var, n7q0 n7q0Var, fb00 fb00Var, com.yandex.go.navigation.screen.c cVar, e3s0 e3s0Var, o6a o6aVar, uei ueiVar, pof0 pof0Var) {
        super(vof0.class);
        this.x = ah00Var;
        this.y = a3vVar;
        this.z = ar30Var;
        this.A = e3aVar;
        this.B = qdiVar;
        this.C = aVar;
        this.D = fVar;
        this.E = lq30Var;
        this.F = dqf0Var;
        this.G = n7q0Var;
        this.H = fb00Var;
        this.I = cVar;
        this.J = e3s0Var;
        this.K = o6aVar;
        this.L = ueiVar;
        this.M = pof0Var;
    }

    public static final void Kg(v vVar, Optional optional) {
        fb00 fb00Var = vVar.H;
        dqf0 dqf0Var = vVar.F;
        ru.yandex.taxi.main_screen_custom.presentation.analytics.a aVar = vVar.C;
        if (optional != null) {
            vVar.O = optional;
        }
        Optional optional2 = vVar.O;
        if (optional2 != null) {
            LinkedHashSet linkedHashSet = aVar.e;
            LinkedHashSet linkedHashSet2 = aVar.f;
            linkedHashSet.clear();
            linkedHashSet2.clear();
            if (!optional2.isPresent()) {
                pzt0 pzt0Var = vVar.N;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                vVar.N = null;
                ((vof0) vVar.Dg()).render(mof0.a);
                return;
            }
            mnf0 mnf0Var = (mnf0) optional2.get();
            Map a = mnf0Var.a();
            if (a != null && !a.isEmpty() && !linkedHashSet2.contains(mnf0Var.e())) {
                linkedHashSet2.add(mnf0Var.e());
                ((com.yandex.go.analytics.realtime.a) aVar.b).d(new lei0(CreativeType.PromoOverMap, mnf0Var.e(), mnf0Var.a()));
            }
            if (dqf0Var.a(mnf0Var.g().getA()) < mnf0Var.g().getB()) {
                ((vof0) vVar.Dg()).render(new lof0(mnf0Var, vVar.Lg(mnf0Var), (((Integer) fb00Var.b.get(mnf0Var.e())) != null ? r7.intValue() : 0) - 1));
                ((vof0) vVar.Dg()).render(mof0.c);
                vVar.G.a.add(mnf0Var.e());
            }
            pzt0 pzt0Var2 = vVar.N;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            tpr c = dib1.c(vVar.x);
            if (!(c instanceof r18)) {
                c = new s18(c);
            }
            vVar.N = tje.N(vVar.Jg(), null, null, new PromoOverMapViewPresenter$listenToCameraState$$inlined$collectIn$1(kotlinx.coroutines.flow.e.s(new c((r18) c), new g990(23)), null, vVar), 3);
            tje.N(vVar.Jg(), null, null, new PromoOverMapViewPresenter$logIfNeeded$1(vVar, mnf0Var, null), 3);
            if (fb00Var.a.contains(mnf0Var.g().getA())) {
                return;
            }
            ((ru.yandex.taxi.analytics.j) aVar.a).s("Main.PromoObject.Shown");
            aVar.d.b(mnf0Var.f().name(), mnf0Var.b().f(), mnf0Var.e());
            String a2 = mnf0Var.g().getA();
            dqf0Var.a.p(dqf0Var.a(a2) + 1, g8e.o("show_count", a2));
            fb00Var.a.add(mnf0Var.g().getA());
        }
    }

    public static nof0 Mg(ScreenRect screenRect) {
        Rect rect = new Rect((int) screenRect.getTopLeft().getX(), (int) screenRect.getTopLeft().getY(), (int) screenRect.getBottomRight().getX(), (int) screenRect.getBottomRight().getY());
        return new nof0(rect, false, Integer.valueOf(rect.bottom), false);
    }

    public final boolean Lg(mnf0 mnf0Var) {
        if (qv10.d("click_count", mnf0Var.g().getA(), this.F.a, 0) < mnf0Var.b().e()) {
            Integer num = (Integer) this.H.b.get(mnf0Var.e());
            if ((num != null ? num.intValue() : 0) < mnf0Var.b().c()) {
                return true;
            }
        }
        return false;
    }
}
