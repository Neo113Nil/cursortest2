package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zabn implements BaseGmsClient.ConnectionProgressReportCallbacks {
    public final /* synthetic */ GoogleApiManager zaa;
    public final GmsClient zab;
    public final ApiKey zac;
    public IAccountAccessor zad;
    public Set zae;
    public boolean zaf;

    public zabn(GoogleApiManager googleApiManager, GmsClient gmsClient, ApiKey apiKey) {
        Objects.requireNonNull(googleApiManager);
        this.zaa = googleApiManager;
        this.zad = null;
        this.zae = null;
        this.zaf = false;
        this.zab = gmsClient;
        this.zac = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        this.zaa.zas.post(new zao(1, this, connectionResult));
    }

    public final void zaa(ConnectionResult connectionResult) {
        zabk zabkVar = (zabk) this.zaa.zao.get(this.zac);
        if (zabkVar != null) {
            zabkVar.zab(connectionResult);
        }
    }

    public final void zab(int i) {
        zabk zabkVar = (zabk) this.zaa.zao.get(this.zac);
        if (zabkVar != null) {
            if (zabkVar.zaj) {
                zabkVar.zab(new ConnectionResult(17, null, null));
            } else {
                zabkVar.onConnectionSuspended(i);
            }
        }
    }
}
