package ru.yandex.taxi.address.interactor;

import com.yandex.go.address.models.Address;
import defpackage.m8t0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.address.repository.f;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes5.dex */
public final class b {
    public final e a;
    public final f b;
    public final tse c;
    public pzt0 d;

    public b(e eVar, f fVar, tse tseVar) {
        this.a = eVar;
        this.b = fVar;
        this.c = tseVar;
    }

    public final void a(m8t0 m8t0Var, Address address) {
        String str;
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (!this.b.d || address == null || (str = address.getAddress().n) == null) {
            return;
        }
        this.d = tje.N(this.c, null, null, new SuggestIconInteractor$loadSourceIconForSuggest$1(this, str, m8t0Var, null), 3);
    }
}
