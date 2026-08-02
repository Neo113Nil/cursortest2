package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ezc;
import defpackage.i0i;
import defpackage.xdr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.fb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C1042fb extends ezc implements Function0<Unit> {
    public C1042fb(C1223sb c1223sb) {
        super(0, 0, C1223sb.class, c1223sb, "onNeedHelpClick", "onNeedHelpClick()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1223sb c1223sb = (C1223sb) this.receiver;
        c1223sb.f.trackNeedHelpClick((Za) ((xdr) c1223sb.h).getValue());
        Z7.a(c1223sb.a.a, new i0i());
        return Unit.a;
    }
}
