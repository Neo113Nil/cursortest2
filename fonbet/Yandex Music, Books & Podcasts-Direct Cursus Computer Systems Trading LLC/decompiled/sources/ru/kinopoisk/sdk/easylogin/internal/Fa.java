package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ezc;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class Fa extends ezc implements Function1<H3, Unit> {
    public Fa(C1223sb c1223sb) {
        super(1, 0, C1223sb.class, c1223sb, "onConnectClick", "onConnectClick(Lru/kinopoisk/tvauth/FoundTv;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        H3 h3 = (H3) obj;
        h3.getClass();
        ((C1223sb) this.receiver).a(h3);
        return Unit.a;
    }
}
