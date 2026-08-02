package ru.yandex.taxi.logistics.sdk.promotions.impl.ui;

import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ike;
import defpackage.lr4;
import defpackage.or4;
import defpackage.st2;
import defpackage.wsr0;
import defpackage.xbp0;
import defpackage.xsr0;
import defpackage.zrf0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class b {
    public final st2 a;
    public final ru.yandex.taxi.logistics.sdk.promotions.impl.a b;
    public final ru.yandex.taxi.logistics.sdk.promotions.impl.domain.a c;
    public final lr4 d;
    public final or4 e;
    public xbp0 f;
    public final ike g;
    public final r0 h;
    public final gci0 i;

    public b(st2 st2Var, ru.yandex.taxi.logistics.sdk.promotions.impl.a aVar, ru.yandex.taxi.logistics.sdk.promotions.impl.domain.a aVar2, lr4 lr4Var, or4 or4Var) {
        this.a = st2Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = lr4Var;
        this.e = or4Var;
        ike a = bvf0.a(st2Var.b);
        this.g = a;
        zrf0 zrf0Var = zrf0.c;
        r0 c = bvf0.c(zrf0Var);
        this.h = c;
        this.i = e.R(new k(new n(new m0(c, or4Var.a.c, new BannersProviderImpl$filteredBanners$1(3, null)), new BannersProviderImpl$bannersFlow$1(this, null)), new BannersProviderImpl$bannersFlow$2(this, null)), a, wsr0.a(xsr0.a, 3), zrf0Var);
    }
}
