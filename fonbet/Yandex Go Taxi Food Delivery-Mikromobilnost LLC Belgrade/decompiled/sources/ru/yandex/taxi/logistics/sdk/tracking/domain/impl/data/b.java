package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.bvf0;
import defpackage.h3y;
import defpackage.st2;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class b {
    public final h3y a;
    public final r0 b = bvf0.c(null);

    public b(h3y h3yVar, st2 st2Var) {
        this.a = h3yVar;
        tje.N(bvf0.a(st2Var.b), null, null, new FeedbackRemoteDataSource$1(this, st2Var, null), 3);
    }
}
