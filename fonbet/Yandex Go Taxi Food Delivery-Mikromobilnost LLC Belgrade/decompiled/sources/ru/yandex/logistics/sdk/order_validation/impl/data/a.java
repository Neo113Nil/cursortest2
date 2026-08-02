package ru.yandex.logistics.sdk.order_validation.impl.data;

import defpackage.h3y;
import defpackage.qz21;
import defpackage.rz21;
import defpackage.y2s;
import defpackage.yz21;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes9.dex */
public final class a extends c {
    public final h3y i;
    public final rz21 j;

    public a(h3y h3yVar, yz21 yz21Var, rz21 rz21Var) {
        super(new y2s(2, yz21Var), 0L, 14);
        this.i = h3yVar;
        this.j = rz21Var;
    }

    public final Object b(qz21 qz21Var, Continuation continuation) {
        return a(new ValidationDataSource$validate$2(this, qz21Var, null), continuation);
    }
}
