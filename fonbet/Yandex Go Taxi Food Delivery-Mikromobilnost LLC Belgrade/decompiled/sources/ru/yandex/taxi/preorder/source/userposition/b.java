package ru.yandex.taxi.preorder.source.userposition;

import defpackage.acz;
import defpackage.dqe0;
import defpackage.h3y;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b {
    public final acz a;
    public final h3y b;
    public final h3y c;
    public final dqe0 d;
    public final tt2 e;

    public b(acz aczVar, h3y h3yVar, h3y h3yVar2, dqe0 dqe0Var, tt2 tt2Var) {
        this.a = aczVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = dqe0Var;
        this.e = tt2Var;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new GeoInfoRepository$currentGeoInfo$2(this, null), continuationImpl);
    }
}
