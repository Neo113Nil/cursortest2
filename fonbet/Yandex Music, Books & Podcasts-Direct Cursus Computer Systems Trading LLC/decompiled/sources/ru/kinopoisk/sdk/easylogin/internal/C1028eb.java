package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ezc;
import defpackage.xdr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.sdk.easylogin.internal.Za;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.eb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C1028eb extends ezc implements Function0<Unit> {
    public C1028eb(C1223sb c1223sb) {
        super(0, 0, C1223sb.class, c1223sb, "onTryAgainClick", "onTryAgainClick()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1223sb c1223sb = (C1223sb) this.receiver;
        c1223sb.f.trackTryAgainClick((Za) ((xdr) c1223sb.h).getValue());
        ((xdr) c1223sb.h).l(Za.e.a);
        c1223sb.a();
        return Unit.a;
    }
}
