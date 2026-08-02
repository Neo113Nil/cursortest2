package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public final class zaby implements OnCompleteListener {
    public final GoogleApiManager zaa;
    public final int zab;
    public final ApiKey zac;
    public final long zad;
    public final long zae;

    public zaby(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    public static zaby zaa(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        if (!googleApiManager.zam()) {
            return null;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.getInstance().zzc;
        boolean z = true;
        if (rootTelemetryConfiguration != null) {
            if (!rootTelemetryConfiguration.zzb) {
                return null;
            }
            boolean z2 = rootTelemetryConfiguration.zzc;
            zabk zabkVar = (zabk) googleApiManager.zao.get(apiKey);
            if (zabkVar != null) {
                GmsClient gmsClient = zabkVar.zac;
                if (!(gmsClient instanceof BaseGmsClient)) {
                    return null;
                }
                GmsClient gmsClient2 = gmsClient;
                if (gmsClient2.zzE != null && !gmsClient2.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zabkVar, gmsClient2, i);
                    if (zab == null) {
                        return null;
                    }
                    zabkVar.zam++;
                    z = zab.zzc;
                }
            }
            z = z2;
        }
        return new zaby(googleApiManager, i, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ConnectionTelemetryConfiguration zab(zabk zabkVar, BaseGmsClient baseGmsClient, int i) {
        zzj zzjVar = baseGmsClient.zzE;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar == null ? null : zzjVar.zzd;
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.zzb) {
            int[] iArr = connectionTelemetryConfiguration.zzd;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = connectionTelemetryConfiguration.zzf;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] == i) {
                            break;
                        }
                        i2++;
                    }
                }
                if (zabkVar.zam >= connectionTelemetryConfiguration.zze) {
                    return connectionTelemetryConfiguration;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (zabkVar.zam >= connectionTelemetryConfiguration.zze) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        GoogleApiManager googleApiManager = this.zaa;
        if (googleApiManager.zam()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.getInstance().zzc;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.zzb) {
                zabk zabkVar = (zabk) googleApiManager.zao.get(this.zac);
                if (zabkVar != null) {
                    GmsClient gmsClient = zabkVar.zac;
                    if (gmsClient instanceof BaseGmsClient) {
                        GmsClient gmsClient2 = gmsClient;
                        long j3 = this.zad;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        int i7 = gmsClient2.zzy;
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.zzc;
                            i = rootTelemetryConfiguration.zzd;
                            i3 = rootTelemetryConfiguration.zze;
                            i2 = rootTelemetryConfiguration.zza;
                            if (gmsClient2.zzE != null && !gmsClient2.isConnecting()) {
                                ConnectionTelemetryConfiguration zab = zab(zabkVar, gmsClient2, this.zab);
                                if (zab == null) {
                                    return;
                                }
                                boolean z2 = zab.zzc && j3 > 0;
                                i3 = zab.zze;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i8 = i;
                        int i9 = -1;
                        if (task.isSuccessful()) {
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status status = ((ApiException) exception).mStatus;
                                i4 = status.zza;
                                ConnectionResult connectionResult = status.zzd;
                                if (connectionResult != null) {
                                    i5 = i4;
                                    i6 = connectionResult.zzb;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.zae;
                            long currentTimeMillis = System.currentTimeMillis();
                            i9 = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = currentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        zabz zabzVar = new zabz(new MethodInvocation(this.zab, i5, i6, j, j2, null, null, i7, i9), i2, i8, i3);
                        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.zas;
                        zaoVar.sendMessage(zaoVar.obtainMessage(18, zabzVar));
                    }
                }
            }
        }
    }
}
