package ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo;

import defpackage.h3q0;
import defpackage.hwy0;
import defpackage.p6s;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class b {
    public final p6s a;
    public final hwy0 b;
    public final a c;

    public b(p6s p6sVar, hwy0 hwy0Var, a aVar) {
        this.a = p6sVar;
        this.b = hwy0Var;
        this.c = aVar;
    }

    public final m0 a(h3q0 h3q0Var) {
        return new m0(this.b.b, this.a.e(), new SectionPromoStateHolder$getSectionPromo$1(this, h3q0Var, null));
    }
}
