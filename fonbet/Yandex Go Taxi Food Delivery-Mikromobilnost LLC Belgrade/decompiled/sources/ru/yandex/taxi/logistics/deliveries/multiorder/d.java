package ru.yandex.taxi.logistics.deliveries.multiorder;

import defpackage.aiz;
import defpackage.bvf0;
import defpackage.h3y;
import defpackage.tt2;
import defpackage.y7u;
import java.util.ArrayList;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.management.f;

/* loaded from: classes9.dex */
public final class d {
    public final tt2 a;
    public final h3y b;
    public final aiz c;
    public final y7u d;
    public final ArrayList e = new ArrayList();
    public final r0 f = bvf0.c(EmptySet.a);

    public d(tt2 tt2Var, h3y h3yVar, aiz aizVar, y7u y7uVar) {
        this.a = tt2Var;
        this.b = h3yVar;
        this.c = aizVar;
        this.d = y7uVar;
    }

    public final m0 a() {
        return new m0(((f) this.b.get()).e(), this.f, new LogisticsOrdersInteractor$ordersOnMultiorderFlow$1(this, null));
    }
}
