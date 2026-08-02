package com.google.android.gms.internal.appset;

import android.content.Context;
import androidx.room.Room;
import com.fillr.e;
import com.fillr.m1;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;

/* loaded from: classes4.dex */
public final class zzr {
    public final zzp zza;
    public final zzl zzb;

    public zzr(Context context) {
        zzl zzlVar;
        this.zza = new zzp(context, GoogleApiAvailabilityLight.zza);
        synchronized (zzl.class) {
            try {
                if (zzl.zza == null) {
                    zzl.zza = new zzl(context.getApplicationContext());
                }
                zzlVar = zzl.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zzb = zzlVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final Task getAppSetIdInfo() {
        zzw forException;
        zzp zzpVar = this.zza;
        if (zzpVar.zze.isGooglePlayServicesAvailable(zzpVar.zzd, 212800000) == 0) {
            zacn builder = zacn.builder();
            builder.zaa$1 = new Feature[]{zze.zza};
            builder.zaa = new e();
            builder.zab = false;
            builder.zac = 27601;
            forException = zzpVar.zae(0, builder.build());
        } else {
            forException = Room.forException(new ApiException(new Status(17, null, null, null)));
        }
        m1 m1Var = new m1(this, 21);
        forException.getClass();
        return forException.continueWithTask(TaskExecutors.MAIN_THREAD, m1Var);
    }
}
