package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class zaao extends com.google.android.gms.signin.internal.zac {
    public final WeakReference zaa;

    public zaao(zaar zaarVar) {
        this.zaa = new WeakReference(zaarVar);
    }

    @Override // com.google.android.gms.signin.internal.zac
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        zaar zaarVar = (zaar) this.zaa.get();
        if (zaarVar == null) {
            return;
        }
        zaaj zaajVar = new zaaj(this, zaarVar, zaarVar, zakVar);
        zaax zaaxVar = zaarVar.zaa.zam;
        zaaxVar.sendMessage(zaaxVar.obtainMessage(1, zaajVar));
    }
}
