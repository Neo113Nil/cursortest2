package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.r0n;
import defpackage.snl;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.C0;
import ru.kinopoisk.sdk.easylogin.internal.T0;

/* loaded from: classes5.dex */
public final class U0 extends uif implements Function1<T0.b, Unit> {
    public final /* synthetic */ T0 a;
    public final /* synthetic */ T0.c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(T0 t0, T0.c cVar) {
        super(1);
        this.a = t0;
        this.b = cVar;
    }

    public final void a(T0.b bVar) {
        r0n r0nVar;
        this.a.c.a("CombinedCastPlayer", "applying action to player", "remotePlayer = " + bVar);
        if (bVar instanceof T0.b.a) {
            this.b.invoke(((T0.b.a) bVar).a());
        } else if (bVar instanceof T0.b.C0037b) {
            r0nVar = this.a.f;
            r0nVar.onNext(new snl(new C0.c(new Exception("Waiting connected player"))));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((T0.b) obj);
        return Unit.a;
    }
}
