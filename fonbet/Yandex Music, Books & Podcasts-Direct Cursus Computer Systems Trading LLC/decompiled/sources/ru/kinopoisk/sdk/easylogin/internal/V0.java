package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.r0n;
import defpackage.snl;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.C1121l6;

/* loaded from: classes5.dex */
public final class V0 extends uif implements Function1<Throwable, Unit> {
    public final /* synthetic */ T0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(T0 t0) {
        super(1);
        this.a = t0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        F0 f0 = this.a.c;
        f0.getClass();
        f0.a(C1121l6.a.C0039a.b, "CombinedCastPlayer", "Error during applying action on player", th, new Object[0]);
        r0n r0nVar = this.a.f;
        th.getClass();
        r0nVar.onNext(new snl(th));
        return Unit.a;
    }
}
