package ru.yandex.taxi.maas.impl.ride.metropick;

import defpackage.m000;
import defpackage.pv0;
import defpackage.qu;
import defpackage.sy60;

/* loaded from: classes5.dex */
public final class c implements sy60 {
    public final /* synthetic */ d a;
    public final /* synthetic */ m000 b;

    public c(d dVar, m000 m000Var) {
        this.a = dVar;
        this.b = m000Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        d dVar = this.a;
        m000 m000Var = dVar.H;
        if (m000Var != null) {
            com.yandex.go.coroutines.b.g(dVar.o(), null, null, new MaasToMetroFragmentRouter$launchMetroPicker$1(dVar, m000Var, null), 3);
        }
    }

    public final void n1(pv0 pv0Var) {
        d dVar = this.a;
        if (pv0Var == null) {
            dVar.r(new qu(9));
        } else {
            com.yandex.go.coroutines.b.g(dVar.o(), null, null, new MaasToMetroFragmentRouter$launchExitsPicker$listener$1$onDoneClick$1(dVar, pv0Var, this.b, null), 3);
        }
    }
}
