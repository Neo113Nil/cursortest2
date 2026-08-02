package com.google.android.libraries.places.internal;

import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.squareup.workflow1.internal.SubtreeManager;
import java.time.Instant;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final class zzfv implements zzcli, zzbkx, zzccj, FutureCallback, SuccessContinuation, OnTokenCanceledListener {
    public static final zzgc zzb = new zzgc(7);
    public final /* synthetic */ int $r8$classId;
    public Object zza;

    public zzfv(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 7:
                break;
            default:
                int i2 = zzbid.$r8$clinit;
                this.zza = new zzfv(new zzbkx[]{zzgc.zza, zzb}, 4);
                break;
        }
    }

    private final void zzb$com$google$android$libraries$places$internal$zzbyo(Object obj) {
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public void onCanceled() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 13:
                zzlh zzlhVar = (zzlh) obj;
                synchronized (((Request) zzlhVar).mLock) {
                    zzlhVar.mCanceled = true;
                    zzlhVar.mErrorListener = null;
                }
                synchronized (zzlhVar.mLock) {
                    zzlhVar.mListener = null;
                }
                return;
            default:
                zzln zzlnVar = (zzln) obj;
                synchronized (((Request) zzlnVar).mLock) {
                    zzlnVar.mCanceled = true;
                    zzlnVar.mErrorListener = null;
                }
                synchronized (((ImageRequest) zzlnVar).mLock) {
                    zzlnVar.mListener = null;
                }
                return;
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onFailure(Throwable th) {
        switch (this.$r8$classId) {
            case 0:
                th.getClass();
                Log.w("ZBCC", "Failed to get session", th);
                break;
            default:
                zzjt zzjtVar = (zzjt) this.zza;
                zzjtVar.zzd = null;
                zzjtVar.zze = null;
                zzjtVar.zzf = null;
                break;
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onSuccess(Object obj) {
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                zzbnj zzbnjVar = (zzbnj) obj;
                zzbnjVar.getClass();
                String zzc = zzbnjVar.zzc();
                zzc.getClass();
                if (zzc.length() > 0) {
                    zzfp zzfpVar = (zzfp) ((com.google.android.gms.maps.zzah) this.zza).zzc;
                    String zzc2 = zzbnjVar.zzc();
                    zzc2.getClass();
                    zzfpVar.getClass();
                    Futures.transform(zzfpVar.zzc, new zzfn(new zzfm(zzc2, i), i), zzfpVar.zzb);
                    break;
                }
                break;
            default:
                long zzc3 = r13.zzc() & BodyPartID.bodyIdMax;
                zzjt zzjtVar = (zzjt) this.zza;
                zzjtVar.zzd = Long.valueOf(zzc3);
                zzjtVar.zze = ((zzbnd) obj).zze();
                Long l = zzjtVar.zzd;
                if (l != null) {
                    long longValue = l.longValue();
                    String packageName = zzjtVar.zzg.getPackageName();
                    int length = packageName.length() + 1;
                    long[] jArr = new long[length];
                    jArr[0] = longValue;
                    int i2 = 0;
                    while (i2 < packageName.length()) {
                        int i3 = i2 + 1;
                        jArr[i3] = packageName.codePointAt(i2) & BodyPartID.bodyIdMax;
                        i2 = i3;
                    }
                    long j = 0;
                    while (i < length) {
                        j = ((j * 1729) + jArr[i]) % 131071;
                        i++;
                    }
                    zzjtVar.zzf = String.valueOf(j);
                }
                if (zzjtVar.zze != null) {
                    long zzc4 = (r13.zzc() - 3600) - Instant.now().getEpochSecond();
                    if (zzc4 > 0) {
                        zzjtVar.zzb.schedule(new zzfo(zzjtVar, 1), zzc4, TimeUnit.SECONDS);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        SubtreeManager subtreeManager = (SubtreeManager) this.zza;
        subtreeManager.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(new com.google.android.libraries.places.api.net.zzf(((zzjm) subtreeManager.interceptor).zza((zzbgj) obj)));
        return taskCompletionSource.zza;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 16:
                return ((zzuh) this.zza).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zza(zzbsb zzbsbVar, RegularImmutableList regularImmutableList, RegularImmutableList regularImmutableList2) {
        boolean z;
        Iterator it;
        if (regularImmutableList != null) {
            if (regularImmutableList.size == zzbsbVar.zzc.size()) {
                z = true;
                ImmutableList immutableList = zzbsbVar.zzc;
                ImmutableList immutableList2 = zzbsbVar.zzd;
                Trace.checkArgument("Incorrect number of required labels provided. Expected: %s", immutableList.size(), z);
                Trace.checkArgument("Incorrect number of optional labels provided. Expected: %s", immutableList2.size(), regularImmutableList2 == null && regularImmutableList2.size == immutableList2.size());
                it = ((List) this.zza).iterator();
                if (!it.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it);
                }
                return;
            }
        }
        z = false;
        ImmutableList immutableList3 = zzbsbVar.zzc;
        ImmutableList immutableList22 = zzbsbVar.zzd;
        Trace.checkArgument("Incorrect number of required labels provided. Expected: %s", immutableList3.size(), z);
        Trace.checkArgument("Incorrect number of optional labels provided. Expected: %s", immutableList22.size(), regularImmutableList2 == null && regularImmutableList2.size == immutableList22.size());
        it = ((List) this.zza).iterator();
        if (!it.hasNext()) {
        }
    }

    public void zzb(Object obj) {
        switch (this.$r8$classId) {
            case 5:
                return;
            default:
                zzcgd zzcgdVar = (zzcgd) this.zza;
                zzcge zzcgeVar = zzcge.zza;
                synchronized (zzcgeVar) {
                    try {
                        zzcgc zzcgcVar = (zzcgc) zzcgeVar.zzb.get(zzcgdVar);
                        if (zzcgcVar == null) {
                            throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(zzcgdVar)));
                        }
                        Trace.checkArgument("Releasing the wrong instance", obj == zzcgcVar.zza);
                        Trace.checkState("Refcount has already reached zero", zzcgcVar.zzb > 0);
                        int i = zzcgcVar.zzb - 1;
                        zzcgcVar.zzb = i;
                        if (i == 0) {
                            Trace.checkState("Destroy task already scheduled", zzcgcVar.zzc == null);
                            if (zzcgeVar.zzc == null) {
                                zzcgeVar.zzc = Executors.newSingleThreadScheduledExecutor(zzbzg.zzd("grpc-shared-destroyer-%d"));
                            }
                            zzcgcVar.zzc = zzcgeVar.zzc.schedule(new zzcam(new zzbuo(zzcgeVar, zzcgcVar, zzcgdVar, obj)), 1L, TimeUnit.SECONDS);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkx
    public zzbll zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzbkx zzbkxVar = ((zzbkx[]) this.zza)[i];
            if (zzbkxVar.zzb(cls)) {
                return zzbkxVar.zzc(cls);
            }
        }
        a$$ExternalSyntheticBUOutline0.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzccj
    public void zzd(zzbtx zzbtxVar, zzbxz zzbxzVar) {
        Trace.checkState("Channel must have been shut down", ((zzcby) this.zza).zzM.get());
    }

    @Override // com.google.android.libraries.places.internal.zzccj
    public void zze() {
        zzcby zzcbyVar = (zzcby) this.zza;
        Trace.checkState("Channel must have been shut down", zzcbyVar.zzM.get());
        zzcbyVar.zzO = true;
        zzcbyVar.zzao(false);
        zzcbyVar.zzq();
    }

    public void zzr(int i, Object obj, zzbln zzblnVar) {
        zzbiv zzbivVar = (zzbiv) this.zza;
        zzbhz zzbhzVar = (zzbhz) obj;
        zzbivVar.zzc(i, 2);
        zzbivVar.zzs(zzbhzVar.zzbt(zzblnVar));
        zzblnVar.zzf(zzbhzVar, this);
    }

    public void zzs(int i, Object obj, zzbln zzblnVar) {
        zzbiv zzbivVar = (zzbiv) this.zza;
        zzbivVar.zzc(i, 3);
        zzblnVar.zzf((zzbhz) obj, this);
        zzbivVar.zzc(i, 4);
    }

    public zzfv(ArrayList arrayList, zzbsu zzbsuVar) {
        this.$r8$classId = 8;
        this.zza = arrayList;
    }

    public /* synthetic */ zzfv(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    public zzfv(zzbiv zzbivVar) {
        this.$r8$classId = 3;
        this.zza = zzbivVar;
        zzbivVar.zza = this;
    }

    public zzfv(Object obj) {
        this.$r8$classId = 5;
        Trace.checkNotNull(obj, "object");
        this.zza = obj;
    }

    @Override // com.google.android.libraries.places.internal.zzccj
    public void zzc(boolean z) {
        zzcby zzcbyVar = (zzcby) this.zza;
        zzcbyVar.zzf.zza(zzcbyVar.zzK, z);
        if (z) {
            zzcbyVar.zze();
        }
    }

    public Object zza() {
        Object obj;
        switch (this.$r8$classId) {
            case 5:
                return this.zza;
            default:
                zzcgd zzcgdVar = (zzcgd) this.zza;
                zzcge zzcgeVar = zzcge.zza;
                synchronized (zzcgeVar) {
                    try {
                        IdentityHashMap identityHashMap = zzcgeVar.zzb;
                        zzcgc zzcgcVar = (zzcgc) identityHashMap.get(zzcgdVar);
                        if (zzcgcVar == null) {
                            zzcgcVar = new zzcgc(zzcgdVar.zzb());
                            identityHashMap.put(zzcgdVar, zzcgcVar);
                        }
                        ScheduledFuture scheduledFuture = zzcgcVar.zzc;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            zzcgcVar.zzc = null;
                        }
                        zzcgcVar.zzb++;
                        obj = zzcgcVar.zza;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzb(zzbsb zzbsbVar, RegularImmutableList regularImmutableList, RegularImmutableList regularImmutableList2) {
        boolean z;
        Iterator it;
        if (regularImmutableList != null) {
            if (regularImmutableList.size == zzbsbVar.zzc.size()) {
                z = true;
                ImmutableList immutableList = zzbsbVar.zzc;
                ImmutableList immutableList2 = zzbsbVar.zzd;
                Trace.checkArgument("Incorrect number of required labels provided. Expected: %s", immutableList.size(), z);
                Trace.checkArgument("Incorrect number of optional labels provided. Expected: %s", immutableList2.size(), regularImmutableList2 == null && regularImmutableList2.size == immutableList2.size());
                it = ((List) this.zza).iterator();
                if (!it.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it);
                }
                return;
            }
        }
        z = false;
        ImmutableList immutableList3 = zzbsbVar.zzc;
        ImmutableList immutableList22 = zzbsbVar.zzd;
        Trace.checkArgument("Incorrect number of required labels provided. Expected: %s", immutableList3.size(), z);
        Trace.checkArgument("Incorrect number of optional labels provided. Expected: %s", immutableList22.size(), regularImmutableList2 == null && regularImmutableList2.size == immutableList22.size());
        it = ((List) this.zza).iterator();
        if (!it.hasNext()) {
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcli
    public /* synthetic */ Object zzb() {
        return ImmutableList.of((Object) ((zzfx) ((zzcli) this.zza)).zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzbkx
    public boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((zzbkx[]) this.zza)[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
