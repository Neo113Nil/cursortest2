package ru.yandex.taxi.masstransit.geopayment.modal;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.pey;
import defpackage.tje;
import defpackage.tse;
import defpackage.uk30;

/* loaded from: classes6.dex */
public final class b implements DefaultLifecycleObserver {
    public final /* synthetic */ tse a;
    public final /* synthetic */ uk30 b;

    public b(tse tseVar, uk30 uk30Var) {
        this.a = tseVar;
        this.b = uk30Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        tje.N(this.a, null, null, new MtGeoPaymentLifecycleListener$registerUnregisterBleReceiver$1$onPause$1(this.b, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        tje.N(this.a, null, null, new MtGeoPaymentLifecycleListener$registerUnregisterBleReceiver$1$onResume$1(this.b, null), 3);
    }
}
