package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ezc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.r9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C1207r9 extends ezc implements Function0<Unit> {
    public C1207r9(C1027ea c1027ea) {
        super(0, 0, C1027ea.class, c1027ea, "onDeclineClick", "onDeclineClick()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1027ea c1027ea = (C1027ea) this.receiver;
        c1027ea.c.trackDeclineClick();
        c1027ea.b.onDecline();
        Z7.a(c1027ea.a.a);
        return Unit.a;
    }
}
