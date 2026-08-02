package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClient;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zae extends zai {
    public final zbi zaa;

    public zae(zbi zbiVar) {
        super(1);
        this.zaa = zbiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.zaa.setFailedResult(new Status(10, Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zaaa zaaaVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = zaaaVar.zaa;
        zbi zbiVar = this.zaa;
        map.put(zbiVar, valueOf);
        zbiVar.addStatusListener(new zay(zaaaVar, zbiVar));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(zabk zabkVar) {
        try {
            zbi zbiVar = this.zaa;
            GmsClient gmsClient = zabkVar.zac;
            zbiVar.getClass();
            try {
                zbiVar.doExecute(gmsClient);
            } catch (DeadObjectException e) {
                zbiVar.setFailedResult(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                zbiVar.setFailedResult(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            zae(e3);
        }
    }
}
