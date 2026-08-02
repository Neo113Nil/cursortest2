package ru.yandex.taxi.hiredriver;

import com.yandex.go.hiredriver.api.HireDriverOpenReason;
import defpackage.eku;
import defpackage.gku;
import defpackage.h55;
import defpackage.hku;
import defpackage.iku;
import defpackage.jku;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lg21;
import defpackage.m950;
import defpackage.mg21;
import defpackage.o7r0;
import defpackage.oku;
import defpackage.qu;
import defpackage.tje;
import defpackage.w511;
import defpackage.wui;
import defpackage.x4;
import defpackage.xju;
import defpackage.yju;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class d extends h55 {
    public final o7r0 D;
    public final gku E;
    public final xju F;
    public final lg21 G;
    public final x4 H;

    public d(o7r0 o7r0Var, gku gkuVar, xju xjuVar, lg21 lg21Var, x4 x4Var) {
        super(null);
        this.D = o7r0Var;
        this.E = gkuVar;
        this.F = xjuVar;
        this.G = lg21Var;
        this.H = x4Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        jku jkuVar = (jku) obj;
        if (!jl40.l(jkuVar, iku.a)) {
            if (!(jkuVar instanceof hku)) {
                w511.b();
                return;
            } else {
                jst.e.n("hire driver deeplink received");
                tje.N(o(), null, null, new HireDriverRouterImpl$onLaunch$1(this, jkuVar, null), 3);
                return;
            }
        }
        o7r0 o7r0Var = this.D;
        o7r0Var.getClass();
        o7r0Var.a.a("SettingsDidSelectHireDriver", new HashMap(), 1, new HashMap());
        P(gku.a((eku) this.E.a.a.c()), HireDriverOpenReason.MENU, kotlin.collections.b.f());
    }

    public final void P(yju yjuVar, HireDriverOpenReason hireDriverOpenReason, Map map) {
        yjuVar.getClass();
        if (yjuVar == yju.n) {
            jst.e.j(new IllegalStateException("no hire driver data"));
            r(new qu(9));
        } else {
            if (this.F.a.g() && yjuVar.a) {
                A((m950) this.H.get(), new oku(yjuVar, hireDriverOpenReason, map), new wui(this, 9));
                return;
            }
            ((mg21) this.G).c(yjuVar.b);
            r(new qu(9));
        }
    }
}
