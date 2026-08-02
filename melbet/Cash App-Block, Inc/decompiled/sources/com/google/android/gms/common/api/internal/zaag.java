package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.zzae;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zaag implements zaba {
    public final zabd zaa;

    public zaag(zabd zabdVar) {
        this.zaa = zabdVar;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zaa() {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final zbi zac(zbi zbiVar) {
        zabd zabdVar = this.zaa;
        try {
            zaaz zaazVar = zabdVar.zag;
            zaz zazVar = zaazVar.zai;
            ((Set) zazVar.f62zaa).add(zbiVar);
            zbiVar.zai.set((zact) zazVar.zab);
            Api.ClientKey clientKey = zbiVar.clientKey;
            GmsClient gmsClient = (GmsClient) zaazVar.zac.get(clientKey);
            zzae.checkNotNull(gmsClient, "Appropriate Api was not requested.");
            if (!gmsClient.isConnected() && zabdVar.zab.containsKey(clientKey)) {
                zbiVar.setFailedResult(new Status(17, null, null, null));
                return zbiVar;
            }
            try {
                zbiVar.doExecute(gmsClient);
            } catch (DeadObjectException e) {
                zbiVar.setFailedResult(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                zbiVar.setFailedResult(new Status(8, e2.getLocalizedMessage(), null, null));
            }
            return zbiVar;
        } catch (DeadObjectException unused) {
            zaae zaaeVar = new zaae(this, this);
            zaax zaaxVar = zabdVar.zam;
            zaaxVar.sendMessage(zaaxVar.obtainMessage(1, zaaeVar));
            return zbiVar;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final boolean zad() {
        zabd zabdVar = this.zaa;
        zabdVar.zag.getClass();
        zabdVar.zaq();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zae() {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zaf(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zag(ConnectionResult connectionResult, Api api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zah(int i) {
        zabd zabdVar = this.zaa;
        zabdVar.zaq();
        zabdVar.zah.zac(i);
    }
}
