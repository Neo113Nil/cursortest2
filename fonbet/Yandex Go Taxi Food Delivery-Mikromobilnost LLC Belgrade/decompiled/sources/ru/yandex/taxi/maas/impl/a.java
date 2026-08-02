package ru.yandex.taxi.maas.impl;

import com.yandex.go.coroutines.b;
import defpackage.au50;
import defpackage.bvf0;
import defpackage.csz;
import defpackage.d200;
import defpackage.i000;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.mth;
import defpackage.o400;
import defpackage.on2;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w100;
import defpackage.zf2;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.launch.c;

/* loaded from: classes9.dex */
public final class a implements d200 {
    public final c a;
    public final on2 b;
    public final tt2 c;
    public final ru.yandex.taxi.maas.impl.ride.c d;
    public final au50 e;
    public final w100 f;
    public final i3y g;
    public final i3y h = kotlin.a.a(new csz(1, this));
    public final r0 i = bvf0.c(i000.c);
    public final r0 j = bvf0.c(Boolean.FALSE);

    public a(c cVar, rqo rqoVar, on2 on2Var, tt2 tt2Var, ru.yandex.taxi.maas.impl.ride.c cVar2, au50 au50Var, w100 w100Var) {
        this.a = cVar;
        this.b = on2Var;
        this.c = tt2Var;
        this.d = cVar2;
        this.e = au50Var;
        this.f = w100Var;
        this.g = kotlin.a.a(new zf2(rqoVar, 6));
    }

    public final tpr a() {
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.j;
        r0Var.getClass();
        r0Var.m(null, bool);
        jqr jqrVar = new jqr(new o(e.I(e.t(e.n(new mth(this.a.a(), 6), b.d(this.f.a, new MaasProviderImpl$maasObserving$$inlined$start$1(zy11.a, null)), e.t(((qqo) this.g.getValue()).a()), new MaasProviderImpl$maasObserving$1(4, null))), new MaasProviderImpl$maasObserving$2(this, null)), new MaasProviderImpl$maasObserving$3(3, null)), new MaasProviderImpl$maasObserving$4(this, null), 3);
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return e.F(new jqr(e.F(jqrVar, mdh.b), new MaasProviderImpl$maasObserving$5(this, null), 3), o400.a);
    }

    public final tpr b() {
        boolean booleanValue = ((Boolean) this.j.getValue()).booleanValue();
        r0 r0Var = this.i;
        return (booleanValue || !jl40.l(r0Var.getValue(), i000.c)) ? r0Var : a();
    }
}
