package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ai3;
import defpackage.jpa;
import defpackage.nmq;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class Z extends uif implements Function1<jpa, Unit> {
    public final /* synthetic */ Xb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Xb xb) {
        super(1);
        this.a = xb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jpa jpaVar = (jpa) obj;
        jpaVar.getClass();
        jpa.A0(jpaVar, (ai3) this.a.invoke(new nmq(jpaVar.e())), 0L, 0L, 0.0f, null, null, 0, 126);
        return Unit.a;
    }
}
