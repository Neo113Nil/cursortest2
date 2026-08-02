package ru.yandex.taxi.logistics.order;

import defpackage.h3y;
import defpackage.mth;
import defpackage.rol0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class g {
    public final h3y a;
    public final AtomicReference b = new AtomicReference(null);
    public final f c = new f(new b(new mth(kotlinx.coroutines.flow.e.t(new d(new rol0(new LogisticsActiveOrdersRepositoryImpl$activeOrderFinishedFlow$1(this, null)))), 4)));

    public g(h3y h3yVar) {
        this.a = h3yVar;
    }
}
