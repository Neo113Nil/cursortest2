package ru.yandex.taxi.styling;

import defpackage.avj0;
import defpackage.jl40;
import defpackage.mqg0;
import defpackage.p0c0;
import defpackage.pwy0;
import defpackage.s0c0;
import defpackage.t0c0;
import defpackage.tpr;
import defpackage.u0c0;
import defpackage.w511;
import defpackage.xqg0;
import defpackage.zuj0;
import java.util.Arrays;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class f implements s0c0 {
    public final zuj0 a;
    public final pwy0 b;
    public final c c;
    public final g d;

    public f(zuj0 zuj0Var, pwy0 pwy0Var, c cVar, g gVar) {
        this.a = zuj0Var;
        this.b = pwy0Var;
        this.c = cVar;
        this.d = gVar;
    }

    public static String f(int i) {
        return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public final p0c0 a(String str) {
        if (!str.equals("ultima")) {
            return p0c0.e;
        }
        int i = t0c0.a[this.b.getThemeType().ordinal()];
        zuj0 zuj0Var = this.a;
        if (i == 1) {
            avj0 avj0Var = (avj0) zuj0Var;
            return new p0c0(f(avj0Var.a(xqg0.component_control_minor_ultima_light)), f(avj0Var.a(mqg0.component_cold_yellow_pastel_550)), f(avj0Var.a(mqg0.component_gray_450)), f(avj0Var.a(mqg0.component_cold_yellow_pastel_550)));
        }
        if (i == 2) {
            avj0 avj0Var2 = (avj0) zuj0Var;
            return new p0c0(f(avj0Var2.a(xqg0.component_control_minor_ultima_dark)), f(avj0Var2.a(mqg0.component_cold_yellow_pastel_550)), f(avj0Var2.a(mqg0.component_gray_450)), f(avj0Var2.a(mqg0.component_gray_100_cold)));
        }
        w511.b();
        return null;
    }

    public final p0c0 b(boolean z) {
        u0c0 c = c(this.d.a().c);
        return z ? c.a : c.b;
    }

    public final u0c0 c(String str) {
        return new u0c0(e(str), a(str), a(str));
    }

    public final tpr d(tpr tprVar) {
        if (tprVar == null) {
            return new m0(this.d.c(), this.b.a(), new PinStyleProviderImpl$styleScreenFlow$1(this, null));
        }
        c cVar = this.c;
        return new e(cVar.a(cVar.a.a(tprVar)), this);
    }

    public final p0c0 e(String str) {
        if (!jl40.l(str, "ultima")) {
            return p0c0.e;
        }
        int i = t0c0.a[this.b.getThemeType().ordinal()];
        zuj0 zuj0Var = this.a;
        if (i == 1) {
            avj0 avj0Var = (avj0) zuj0Var;
            return new p0c0(f(avj0Var.a(mqg0.component_cold_yellow_pastel_500)), f(avj0Var.a(mqg0.component_cold_yellow_pastel_550)), f(avj0Var.a(mqg0.component_gray_450)), f(avj0Var.a(mqg0.white)));
        }
        if (i == 2) {
            avj0 avj0Var2 = (avj0) zuj0Var;
            return new p0c0(f(avj0Var2.a(mqg0.component_cold_yellow_pastel_125)), f(avj0Var2.a(mqg0.component_gray_100_cold)), f(avj0Var2.a(mqg0.component_gray_450)), f(avj0Var2.a(mqg0.component_gray_600_cold)));
        }
        w511.b();
        return null;
    }
}
