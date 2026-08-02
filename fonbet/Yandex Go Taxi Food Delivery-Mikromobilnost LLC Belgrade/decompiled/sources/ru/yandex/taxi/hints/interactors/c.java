package ru.yandex.taxi.hints.interactors;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.hv0;
import defpackage.jv0;
import defpackage.mbi;
import defpackage.pex0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes5.dex */
public final class c {
    public final wiq0 a;
    public final mbi b;
    public final tt2 c;
    public final jv0 d;
    public final jv0 e;

    public c(wiq0 wiq0Var, mbi mbiVar, tt2 tt2Var, jv0 jv0Var, jv0 jv0Var2) {
        this.a = wiq0Var;
        this.b = mbiVar;
        this.c = tt2Var;
        this.d = jv0Var;
        this.e = jv0Var2;
    }

    public final tpr a() {
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(new b(((k) this.a).g()), this.e.a(), this.d.a(), new AddressHintsInteractor$addressHintsFlow$2(this, null)));
        this.c.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }

    public final hv0 b(pex0 pex0Var) {
        return (hv0) tje.Y(EmptyCoroutineContext.a, new AddressHintsInteractor$getAddressHints$1(this, pex0Var, null));
    }
}
