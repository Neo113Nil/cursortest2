package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ezc;
import defpackage.xbt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class W9 extends ezc implements Function0<Unit> {
    public W9(C1027ea c1027ea) {
        super(0, 0, C1027ea.class, c1027ea, "onAcceptClick", "onAcceptClick()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1027ea c1027ea = (C1027ea) this.receiver;
        c1027ea.c.trackAcceptClick();
        c1027ea.b.onAccept();
        Z7.a(c1027ea.a.a);
        D9 d9 = c1027ea.a;
        Z7.a(d9.a, new xbt(false, d9.b.a.b()));
        return Unit.a;
    }
}
