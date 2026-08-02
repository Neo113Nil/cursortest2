package ru.yandex.taxi.cashback;

import defpackage.l9;
import defpackage.pzt0;
import defpackage.qeb1;
import defpackage.tje;
import defpackage.tse;
import defpackage.zi;
import java.util.function.Consumer;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes5.dex */
public final class g {
    public final tse a;
    public final ru.yandex.taxi.am.g b;
    public final ru.yandex.taxi.yaplus.b c;
    public final ru.yandex.taxi.zalogin.d d;
    public pzt0 e;

    public g(tse tseVar, ru.yandex.taxi.am.g gVar, ru.yandex.taxi.yaplus.b bVar, ru.yandex.taxi.zalogin.d dVar) {
        this.a = tseVar;
        this.b = gVar;
        this.c = bVar;
        this.d = dVar;
    }

    public final void a(String str, Consumer consumer, Consumer consumer2) {
        pzt0 pzt0Var = this.e;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.e = tje.N(this.a, null, null, new PlusAuthorizedUrlProvider$getAuthorizedUrl$1(this, str, consumer, consumer2, null), 3);
        }
    }

    public final void b(String str, Consumer consumer, Consumer consumer2) {
        if (!this.b.a.Mg()) {
            a(str, consumer, consumer2);
            return;
        }
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = Events$Zalogin$LinkageContext.INSTANT_LINK;
        l9 l9Var = new l9(this, str, consumer, consumer2, 26);
        ru.yandex.taxi.zalogin.d dVar = this.d;
        dVar.b(events$Zalogin$LinkageContext, qeb1.b(dVar.e), l9Var, new zi(21));
    }
}
