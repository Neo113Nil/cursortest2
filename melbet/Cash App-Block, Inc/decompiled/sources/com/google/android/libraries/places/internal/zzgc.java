package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.text.TextUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.places.api.net.zzi;
import com.google.common.collect.ImmutableList;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.moshi.LinkedHashTreeMap;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes4.dex */
public final class zzgc implements zzbkx, zzbrn, Continuation, SuccessContinuation {
    public final /* synthetic */ int $r8$classId;
    public static final zzgc zza = new zzgc(3);
    public static final /* synthetic */ zzgc zza$1 = new zzgc(14);
    public static final /* synthetic */ zzgc zza$2 = new zzgc(15);
    public static final /* synthetic */ zzgc zza$3 = new zzgc(16);
    public static final /* synthetic */ zzgc zza$4 = new zzgc(17);
    public static final /* synthetic */ zzgc zza$5 = new zzgc(18);
    public static final /* synthetic */ zzgc zza$6 = new zzgc(19);
    public static final /* synthetic */ zzgc zza$7 = new zzgc(20);
    public static final /* synthetic */ zzgc zza$8 = new zzgc(21);
    public static final /* synthetic */ zzgc zza$9 = new zzgc(22);
    public static final /* synthetic */ zzgc zza$10 = new zzgc(23);
    public static final /* synthetic */ zzgc zza$11 = new zzgc(25);

    public zzgc(SSLSession sSLSession) {
        this.$r8$classId = 10;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e) {
            Logger logger = zzbqr.zzb;
            zzbqr.zzb.logp(Level.FINE, "io.grpc.InternalChannelz$Tls", "<init>", Recorder$$ExternalSyntheticOutline2.m("Peer cert not available for peerHost=", sSLSession.getPeerHost()), (Throwable) e);
        }
    }

    public static final zzbkb zza(Object obj, long j) {
        zzbkb zzbkbVar = (zzbkb) zzbmg.zzm(obj, j);
        if (((zzbic) zzbkbVar).zza) {
            return zzbkbVar;
        }
        int size = zzbkbVar.size();
        zzbkb zzg = zzbkbVar.zzg(size == 0 ? 10 : size + size);
        zzbmg.zzn(obj, j, zzg);
        return zzg;
    }

    public static zzbma zzh(Object obj) {
        zzbjr zzbjrVar = (zzbjr) obj;
        zzbma zzbmaVar = zzbjrVar.zzc;
        if (zzbmaVar != zzbma.zza) {
            return zzbmaVar;
        }
        zzbma zzbmaVar2 = new zzbma(0, new int[8], new Object[8], true);
        zzbjrVar.zzc = zzbmaVar2;
        return zzbmaVar2;
    }

    public static boolean zzk(int i, LinkedHashTreeMap.AvlBuilder avlBuilder, Object obj) {
        zzbiq zzbiqVar = (zzbiq) avlBuilder.stack;
        int i2 = avlBuilder.leavesToSkip;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            avlBuilder.zzS(0);
            ((zzbma) obj).zzk(i3 << 3, Long.valueOf(zzbiqVar.zzg()));
            return true;
        }
        if (i4 == 1) {
            avlBuilder.zzS(1);
            ((zzbma) obj).zzk((i3 << 3) | 1, Long.valueOf(zzbiqVar.zzi()));
            return true;
        }
        if (i4 == 2) {
            ((zzbma) obj).zzk((i3 << 3) | 2, avlBuilder.zzs());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                TransportImpl$$ExternalSyntheticLambda0.m$1();
                return false;
            }
            avlBuilder.zzS(5);
            ((zzbma) obj).zzk(5 | (i3 << 3), Integer.valueOf(zzbiqVar.zzj()));
            return true;
        }
        zzbma zzbmaVar = new zzbma(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (avlBuilder.zzb() != Integer.MAX_VALUE && zzk(i6, avlBuilder, zzbmaVar)) {
        }
        if ((i5 | 4) != avlBuilder.leavesToSkip) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (zzbmaVar.zzf) {
            zzbmaVar.zzf = false;
        }
        ((zzbma) obj).zzk(i5 | 3, zzbmaVar);
        return true;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.$r8$classId) {
            case 25:
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.setResult(new zzi(Uri.parse(((zzbep) obj).zza())));
                return taskCompletionSource.zza;
            default:
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                ArrayList arrayList = new ArrayList();
                for (zzbcu zzbcuVar : ((zzbcv) obj).zza()) {
                    zzbcn zzc = zzbcuVar.zzc();
                    if (!zzbcuVar.zza()) {
                        a$$ExternalSyntheticBUOutline0.m$3("Suggestion does not contain a PlacePrediction.");
                        return null;
                    }
                    String zza2 = zzc.zza();
                    com.google.android.gms.maps.zzai zzaiVar = new com.google.android.gms.maps.zzai();
                    zzaiVar.zzc = new ArrayList();
                    if (zza2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null placeId");
                        return null;
                    }
                    zzaiVar.zaa = zza2;
                    zzaiVar.zzd = new ArrayList();
                    zzaiVar.zze = new ArrayList();
                    zzaiVar.zac = new ArrayList();
                    zzaiVar.zad = "";
                    zzaiVar.zza = "";
                    zzaiVar.zzb = "";
                    zzaiVar.zab = zzc.zzf() == 0 ? null : Integer.valueOf(zzc.zzf());
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) zzc.zze());
                    if (copyOf == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null types");
                        return null;
                    }
                    zzaiVar.zac = copyOf;
                    String zza3 = zzc.zzc().zza();
                    if (zza3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null fullText");
                        return null;
                    }
                    zzaiVar.zad = zza3;
                    zzaiVar.zzc = zzkl.zza(zzc.zzc().zzc());
                    String zza4 = zzc.zzd().zza().zza();
                    if (zza4 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null primaryText");
                        return null;
                    }
                    zzaiVar.zza = zza4;
                    zzaiVar.zzd = zzkl.zza(zzc.zzd().zza().zzc());
                    String zza5 = zzc.zzd().zzc().zza();
                    if (zza5 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null secondaryText");
                        return null;
                    }
                    zzaiVar.zzb = zza5;
                    zzaiVar.zze = zzkl.zza(zzc.zzd().zzc().zzc());
                    com.google.android.libraries.places.api.model.zzde zze = zzaiVar.zze();
                    ImmutableList copyOf2 = ImmutableList.copyOf((Collection) zze.zzc);
                    if (copyOf2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null types");
                        return null;
                    }
                    zzaiVar.zac = copyOf2;
                    ImmutableList copyOf3 = ImmutableList.copyOf((Collection) zze.zzg);
                    if (copyOf3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null fullTextMatchedSubstrings");
                        return null;
                    }
                    zzaiVar.zzc = copyOf3;
                    ImmutableList copyOf4 = ImmutableList.copyOf((Collection) zze.zzh);
                    if (copyOf4 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null primaryTextMatchedSubstrings");
                        return null;
                    }
                    zzaiVar.zzd = copyOf4;
                    ImmutableList copyOf5 = ImmutableList.copyOf((Collection) zze.zzi);
                    if (copyOf5 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null secondaryTextMatchedSubstrings");
                        return null;
                    }
                    zzaiVar.zze = copyOf5;
                    arrayList.add(zzaiVar.zze());
                }
                taskCompletionSource2.setResult(new com.google.android.libraries.places.api.net.zzl(ImmutableList.copyOf((Collection) arrayList)));
                return taskCompletionSource2.zza;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkx
    public boolean zzb(Class cls) {
        switch (this.$r8$classId) {
            case 3:
                return zzbjr.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkx
    public zzbll zzc(Class cls) {
        switch (this.$r8$classId) {
            case 3:
                if (!zzbjr.class.isAssignableFrom(cls)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (zzbll) zzbjr.zzbE(cls.asSubclass(zzbjr.class)).zzb(3, null);
                } catch (Exception e) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("Unable to get message info for ".concat(cls.getName()), (Throwable) e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    public static zzbjh zza(Object obj) {
        zzbjo zzbjoVar = (zzbjo) obj;
        zzbjh zzbjhVar = zzbjoVar.zzb;
        if (zzbjhVar.zzb) {
            zzbjoVar.zzb = zzbjhVar.clone();
        }
        return zzbjoVar.zzb;
    }

    public static final zzbkt zza(Object obj, Object obj2) {
        zzbkt zzbktVar = (zzbkt) obj;
        zzbkt zzbktVar2 = (zzbkt) obj2;
        if (!zzbktVar2.isEmpty()) {
            if (!zzbktVar.zza) {
                zzbktVar = zzbktVar.zzc();
            }
            zzbktVar.zzg();
            if (!zzbktVar2.isEmpty()) {
                zzbktVar.putAll(zzbktVar2);
            }
        }
        return zzbktVar;
    }

    public /* synthetic */ zzgc(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.$r8$classId) {
            case 0:
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (task.isCanceled()) {
                    taskCompletionSource.trySetException(new ApiException(new Status(16, "Location request was cancelled. Please try again.", null, null)));
                } else if (task.getException() == null && task.getResult() == null) {
                    taskCompletionSource.trySetException(new ApiException(new Status(8, "Location unavailable.", null, null)));
                }
                com.google.android.gms.tasks.zzw zzwVar = taskCompletionSource.zza;
                return zzwVar.getException() != null ? zzwVar : task;
            case 14:
                return e0.zzK(task);
            case 15:
                return e0.zzK(task);
            case 16:
                return e0.zzK(task);
            case 17:
                return e0.zzK(task);
            case 18:
                return e0.zzK(task);
            case 19:
                return e0.zzK(task);
            case 20:
                return e0.zzK(task);
            case 21:
                return e0.zzK(task);
            case 22:
                return e0.zzK(task);
            case 23:
                return e0.zzK(task);
            case 27:
                return new com.google.android.libraries.places.api.net.zzc(((zzks) task.getResult()).zza);
            case 28:
                ((zzkw) task.getResult()).getClass();
                TextUtils.isEmpty(null);
                throw new ApiException(new Status(13, null, null, null));
            default:
                ((zzle) task.getResult()).getClass();
                TextUtils.isEmpty(null);
                throw new ApiException(new Status(13, null, null, null));
        }
    }
}
