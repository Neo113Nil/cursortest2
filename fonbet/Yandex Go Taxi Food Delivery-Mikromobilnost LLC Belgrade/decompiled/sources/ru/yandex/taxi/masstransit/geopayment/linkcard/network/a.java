package ru.yandex.taxi.masstransit.geopayment.linkcard.network;

import defpackage.i3y;
import defpackage.mdh;
import defpackage.on2;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zn1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes6.dex */
public final class a {
    public final i3y a;

    public a(on2 on2Var, tt2 tt2Var) {
        this.a = kotlin.a.a(new zn1(on2Var, 22));
    }

    public final tpr a(String str) {
        rol0 rol0Var = new rol0(new LinkCardRepositoryImpl$linkCardStatusFlow$1(this, str, null));
        sjh sjhVar = uyj.a;
        return e.F(rol0Var, mdh.b);
    }
}
