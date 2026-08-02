package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ezc;
import defpackage.xdr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class Da extends ezc implements Function0<Unit> {
    public Da(C1223sb c1223sb) {
        super(0, 0, C1223sb.class, c1223sb, "onSearchStart", "onSearchStart()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1223sb c1223sb = (C1223sb) this.receiver;
        c1223sb.f.trackFindClick((Za) ((xdr) c1223sb.h).getValue());
        c1223sb.a();
        return Unit.a;
    }
}
