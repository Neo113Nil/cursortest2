package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.os.Looper;
import app.cash.molecule.PlatformKt;
import com.android.volley.Response;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.api.internal.zacd;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.api.internal.zaf;
import com.google.android.gms.common.api.internal.zaz;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.AbstractCatchingFuture;
import com.google.common.util.concurrent.DirectExecutor;
import net.oneformapp.PopEncryptorV2_;

/* loaded from: classes4.dex */
public final class zzmn {
    public final zzkk zza;

    public zzmn(zzkk zzkkVar) {
        this.zza = zzkkVar;
    }

    public static AbstractCatchingFuture.AsyncCatchingFuture zzf(Task task) {
        zzkz zzkzVar = new zzkz();
        zzkzVar.zza = task;
        zzj zzjVar = new zzj(zzkzVar, 9);
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        task.addOnCompleteListener(directExecutor, zzjVar);
        return AbstractCatchingFuture.createAsync(zzkzVar, ApiException.class, zzml.zza, directExecutor);
    }

    public final AbstractCatchingFuture.AsyncCatchingFuture zza(String str) {
        str.getClass();
        zacn builder = zacn.builder();
        builder.zaa = new zzpp(str, 1);
        return zzf(this.zza.zae(0, builder.build()).continueWith(DirectExecutor.INSTANCE, new zztw(10)));
    }

    public final AbstractCatchingFuture.AsyncCatchingFuture zzb(String str) {
        str.getClass();
        return zzf(this.zza.zzc(str));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final AbstractCatchingFuture.AsyncCatchingFuture zzc(zzme zzmeVar) {
        zacn builder = zacn.builder();
        builder.zaa = new zzj(zzmeVar, 6);
        builder.zaa$1 = new Feature[]{zzh.zza};
        builder.zab = false;
        zacn build = builder.build();
        zzkk zzkkVar = this.zza;
        return zzf(zzkkVar.zae(0, build).continueWithTask(DirectExecutor.INSTANCE, new zzz(2, zzkkVar, zzmeVar)));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final AbstractCatchingFuture.AsyncCatchingFuture zzd() {
        zacn builder = zacn.builder();
        zzkk zzkkVar = this.zza;
        builder.zaa = new zzj(zzkkVar, 7);
        builder.zaa$1 = new Feature[]{zzh.zzi};
        builder.zab = false;
        return zzf(zzkkVar.zae(0, builder.build()));
    }

    public final AbstractCatchingFuture.AsyncCatchingFuture zze(zzqd zzqdVar) {
        String sb;
        zzkk zzkkVar = this.zza;
        Looper looper = zzkkVar.zah;
        com.google.android.gms.common.internal.zzae.checkNotNull(looper, "Looper must not be null");
        ListenerHolder listenerHolder = new ListenerHolder(looper, zzqdVar);
        if (PlatformKt.zza == null) {
            PlatformKt.zza = Application.getProcessName();
        }
        String str = PlatformKt.zza;
        if (str == null) {
            sb = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = str.length() + 1;
            int identityHashCode = System.identityHashCode(zzku.class);
            StringBuilder sb2 = new StringBuilder(length + String.valueOf(identityHashCode).length());
            sb2.append(str);
            sb2.append("|");
            sb2.append(identityHashCode);
            sb = sb2.toString();
        }
        com.google.android.gms.maps.zzah zzahVar = new com.google.android.gms.maps.zzah(4, zzkkVar, sb, listenerHolder);
        zztw zztwVar = zztw.zza$3;
        PopEncryptorV2_ popEncryptorV2_ = new PopEncryptorV2_();
        popEncryptorV2_.cryptor = listenerHolder;
        popEncryptorV2_.encryptionKey = zzahVar;
        popEncryptorV2_.hmacKey = zztwVar;
        popEncryptorV2_.authStore = new Feature[]{zzh.zzd};
        popEncryptorV2_.isInit = false;
        com.google.android.gms.common.internal.zzae.checkArgument("Must set unregister function", ((zztw) popEncryptorV2_.hmacKey) != null);
        com.google.android.gms.common.internal.zzae.checkArgument("Must set holder", ((ListenerHolder) popEncryptorV2_.cryptor) != null);
        ListenerHolder.ListenerKey listenerKey = ((ListenerHolder) popEncryptorV2_.cryptor).zab;
        com.google.android.gms.common.internal.zzae.checkNotNull(listenerKey, "Key must not be null");
        Response response = new Response(popEncryptorV2_, (ListenerHolder) popEncryptorV2_.cryptor, (Feature[]) popEncryptorV2_.authStore, popEncryptorV2_.isInit);
        zaz zazVar = new zaz(popEncryptorV2_, listenerKey);
        com.google.android.gms.common.internal.zzae.checkNotNull(((ListenerHolder) response.result).zab, "Listener has already been released.");
        com.google.android.gms.common.internal.zzae.checkNotNull((ListenerHolder.ListenerKey) zazVar.f62zaa, "Listener has already been released.");
        GoogleApiManager googleApiManager = zzkkVar.zaa;
        googleApiManager.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        googleApiManager.zaI(taskCompletionSource, 0, zzkkVar);
        zacc zaccVar = new zacc(new zaf(new zacd(response, zazVar), taskCompletionSource), googleApiManager.zan.get(), zzkkVar);
        zao zaoVar = googleApiManager.zas;
        zaoVar.sendMessage(zaoVar.obtainMessage(8, zaccVar));
        return zzf(taskCompletionSource.zza);
    }
}
