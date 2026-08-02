package ru.yandex.taxi.preorder.tollroad;

import defpackage.bvf0;
import defpackage.mtj0;
import defpackage.ntj0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class a {
    public final r0 a;
    public final r0 b;

    public a() {
        mtj0 mtj0Var = ntj0.a;
        this.a = bvf0.c(mtj0Var);
        this.b = bvf0.c(mtj0Var);
    }

    public final m0 a() {
        return new m0(this.a, this.b, new RoadsTariffsInfoRepositoryImpl$getRoadsTariffsInfoFlow$1());
    }
}
