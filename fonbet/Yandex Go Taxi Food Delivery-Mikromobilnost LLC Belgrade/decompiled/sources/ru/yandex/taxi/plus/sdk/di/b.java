package ru.yandex.taxi.plus.sdk.di;

import androidx.lifecycle.Lifecycle;
import defpackage.a2f0;
import defpackage.c2d0;
import defpackage.f29;
import defpackage.mdh;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.un3;
import defpackage.uyj;
import defpackage.v0r0;
import defpackage.weu;
import defpackage.yvf0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.plus.repository.e;
import ru.yandex.taxi.plus.sdk.cache.c;

/* loaded from: classes9.dex */
public final class b implements a2f0 {
    public final v0r0 a;
    public final c b;
    public final c2d0 c;
    public final ru.yandex.taxi.plus.repository.c d;
    public final ru.yandex.taxi.plus.sdk.prefetch.a e;
    public final un3 f;
    public final e g;
    public final f29 h;
    public final yvf0 i;
    public pzt0 j;
    public final weu k = new weu(28, this);

    public b(v0r0 v0r0Var, c cVar, c2d0 c2d0Var, ru.yandex.taxi.plus.repository.c cVar2, ru.yandex.taxi.plus.sdk.prefetch.a aVar, un3 un3Var, e eVar, f29 f29Var, yvf0 yvf0Var) {
        this.a = v0r0Var;
        this.b = cVar;
        this.c = c2d0Var;
        this.d = cVar2;
        this.e = aVar;
        this.f = un3Var;
        this.g = eVar;
        this.h = f29Var;
        this.i = yvf0Var;
    }

    @Override // defpackage.a2f0
    public final void c() {
        r0 r0Var = this.a.a;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        c cVar = this.b;
        f29 f29Var = this.h;
        if (cVar.d.add(f29Var) && cVar.a != null) {
            f29Var.a();
        }
        Lifecycle lifecycle = this.c.p;
        lifecycle.a(new a(this, lifecycle));
        c2d0 c2d0Var = this.c;
        tse tseVar = c2d0Var.b;
        c2d0Var.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(tseVar, mdh.b, null, new PlusSdkLifecycleInitializer$observeUpdatePlusSdk$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PlusSdkLifecycleInitializer";
    }
}
