package ru.yandex.taxi.styling;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.bvf0;
import defpackage.cxu0;
import defpackage.e430;
import defpackage.exu0;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.nrt;
import defpackage.oxu0;
import defpackage.pwy0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.zonemodes.j;

/* loaded from: classes10.dex */
public final class g implements oxu0 {
    public final c a;
    public final tt2 b;
    public final pwy0 c;
    public final exu0 d;
    public final com.yandex.go.navigation.screen.c e;
    public final r0 f = bvf0.c(e430.d);

    public g(c cVar, tt2 tt2Var, pwy0 pwy0Var, exu0 exu0Var, com.yandex.go.navigation.screen.c cVar2) {
        this.a = cVar;
        this.b = tt2Var;
        this.c = pwy0Var;
        this.d = exu0Var;
        this.e = cVar2;
    }

    public final e430 a() {
        return (e430) this.f.getValue();
    }

    public final cxu0 b() {
        e430 a = a();
        return ((nrt) this.d).b(this.c.getThemeType(), a.c);
    }

    public final tpr c() {
        c cVar = this.a;
        tpr b = c.b(cVar);
        j jVar = cVar.a;
        jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(b, cVar.a(jVar.a(kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.zonemodes.d(((k) jVar.d).f())))), this.e.c(), new StyleScreenRepositoryImpl$modeStyleFlow$1(4, this, g.class, "transformModeStyle", "transformModeStyle(Lru/yandex/taxi/styling/ModeStyle;Lru/yandex/taxi/styling/ModeStyle;Lcom/yandex/go/navigation/screen/api/Screen;)Lru/yandex/taxi/styling/ModeStyle;", 4))), new StyleScreenRepositoryImpl$modeStyleFlow$2(this, null), 3);
        this.b.getClass();
        return kotlinx.coroutines.flow.e.F(jqrVar, uyj.a);
    }

    public final tpr d() {
        tpr t = kotlinx.coroutines.flow.e.t(new m0(c(), this.c.a(), new StyleScreenRepositoryImpl$screenStyleFlow$1(this, null)));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(t, mdh.b);
    }
}
