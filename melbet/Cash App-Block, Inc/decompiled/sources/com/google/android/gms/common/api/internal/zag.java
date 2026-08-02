package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes.dex */
public final class zag extends zac {
    public final zacn zaa;
    public final TaskCompletionSource zab;
    public final Trifle zad;

    public zag(int i, zacn zacnVar, TaskCompletionSource taskCompletionSource, Trifle trifle) {
        super(i);
        this.zab = taskCompletionSource;
        this.zaa = zacnVar;
        this.zad = trifle;
        if (i == 2 && zacnVar.zab) {
            a$$ExternalSyntheticBUOutline0.m$3("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] zaa(zabk zabkVar) {
        return (Feature[]) this.zaa.zaa$1;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zab(zabk zabkVar) {
        return this.zaa.zab;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final int zac(zabk zabkVar) {
        return this.zaa.zac;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(Status status) {
        this.zad.getClass();
        this.zab.trySetException(zzae.fromStatus(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(Exception exc) {
        this.zab.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zaaa zaaaVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = zaaaVar.zab;
        TaskCompletionSource taskCompletionSource = this.zab;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.zza.addOnCompleteListener(new zaz(zaaaVar, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(zabk zabkVar) {
        TaskCompletionSource taskCompletionSource = this.zab;
        try {
            zacn zacnVar = this.zaa;
            ((RemoteCall) ((zacn) zacnVar.zaa).zaa).accept(zabkVar.zac, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            zad(zai.zai(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }
}
