package com.google.android.gms.maps;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.android.volley.Response;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zat;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzbq;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzjy;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzcv;
import com.google.android.gms.internal.mlkit_vision_face.zzt;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.zzo;
import com.google.android.gms.maps.internal.zzl;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzll;
import com.google.android.gms.measurement.internal.zzlr;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.api.model.zzcs;
import com.google.android.libraries.places.internal.zzbor;
import com.google.android.libraries.places.internal.zzbov;
import com.google.android.libraries.places.internal.zzboz;
import com.google.android.libraries.places.internal.zzbpy;
import com.google.android.libraries.places.internal.zzbsd;
import com.google.android.libraries.places.internal.zzbsn;
import com.google.android.libraries.places.internal.zzbsq;
import com.google.android.libraries.places.internal.zzbtu;
import com.google.android.libraries.places.internal.zzbtx;
import com.google.android.libraries.places.internal.zzbvl;
import com.google.android.libraries.places.internal.zzbvn;
import com.google.android.libraries.places.internal.zzbvo;
import com.google.android.libraries.places.internal.zzbvq;
import com.google.android.libraries.places.internal.zzbvs;
import com.google.android.libraries.places.internal.zzbvt;
import com.google.android.libraries.places.internal.zzclf;
import com.google.android.libraries.places.internal.zzfp;
import com.google.android.libraries.places.internal.zzfv;
import com.google.android.libraries.places.internal.zzgc;
import com.google.android.libraries.places.internal.zzli;
import com.google.android.libraries.places.internal.zzmu;
import com.google.android.libraries.places.internal.zzmv;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate;
import com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate;
import com.google.android.play.core.appupdate.internal.zzaf;
import com.google.android.play.core.appupdate.zzg;
import com.google.android.play.core.appupdate.zzi;
import com.google.android.play.core.appupdate.zzr;
import com.google.common.base.Ascii;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Hashing;
import com.google.common.hash.Murmur3_128HashFunction;
import com.google.common.io.BaseEncoding$Base64Encoding;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1;
import com.plaid.internal.EnumC0170g;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.http1.HeadersReader;

/* loaded from: classes4.dex */
public class zzah implements RemoteCall, EncoderConfig, zzll, zzgw, zzbvt, FutureCallback, ExtendedFloatingActionButton.Size, zzaf {
    public static zzah zza;
    public final /* synthetic */ int $r8$classId;

    /* renamed from: zza, reason: collision with other field name */
    public Object f68zza;
    public Object zzb;
    public Object zzc;

    public zzah(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 6:
                this.f68zza = new HashMap();
                this.zzb = new HashMap();
                this.zzc = com.google.android.gms.internal.mlkit_vision_common.zzaj.zza$1;
                break;
            case 7:
            default:
                this.f68zza = new zzaa("", 0L, null);
                this.zzb = new zzaa("", 0L, null);
                this.zzc = new ArrayList();
                break;
            case 8:
                this.f68zza = new HashMap();
                this.zzb = new HashMap();
                this.zzc = zzcv.zza$1;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (1 != (r3.getModifiers() & 1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Method zze(Class cls, String str, Class[] clsArr) {
        Method method;
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return zze(cls.getSuperclass(), str, clsArr);
                }
                method = cls.getMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
        return null;
        return method;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        zzkt zzktVar = (zzkt) ((zzku) obj).getService();
        zzjy zzjyVar = new zzjy((zzkk) this.f68zza, (ListenerHolder) this.zzc);
        String str = (String) this.zzb;
        Parcel zza2 = zzktVar.zza();
        zza2.writeString(str);
        zzbn.zzd(zza2, zzjyVar);
        zzktVar.zzc(zza2, 28);
    }

    public zzcs build() {
        zzcs zzc = zzc();
        Trace.checkArgument("Name must not be empty.", !zzc.zza.isEmpty());
        List list = zzc.zzc;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Trace.checkArgument("Types must not contain null or empty values.", !TextUtils.isEmpty((String) it.next()));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        if (copyOf != null) {
            this.zzc = copyOf;
            return zzc();
        }
        a$$ExternalSyntheticBUOutline0.m$2("Null types");
        return null;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.$r8$classId) {
            case 2:
                zzah zzahVar = new zzah(((zzaa) this.f68zza).clone());
                Iterator it = ((ArrayList) this.zzc).iterator();
                while (it.hasNext()) {
                    ((ArrayList) zzahVar.zzc).add(((zzaa) it.next()).clone());
                }
                return zzahVar;
            default:
                return super.clone();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getHeight() {
        int i = ((ExtendedFloatingActionButton) this.zzc).originalHeight;
        return i == -1 ? ((zbc) this.f68zza).getHeight() : (i == 0 || i == -2) ? ((ExtendedFloatingActionButton) ((zzb) this.zzb).zza).getMeasuredHeight() : i;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public ViewGroup.LayoutParams getLayoutParams() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.zzc;
        int i = extendedFloatingActionButton.originalWidth;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.originalHeight;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    public void getMapAsync(GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1 googleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1) {
        try {
            zzl zzlVar = (zzl) this.zzb;
            zza zzaVar = new zza(this, googleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1);
            Parcel zza2 = zzlVar.zza();
            zzc.zzg(zza2, zzaVar);
            zzlVar.zzc(zza2, 9);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.zzc).extendedPaddingEnd;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.zzc).extendedPaddingStart;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getWidth() {
        int i = ((ExtendedFloatingActionButton) this.zzc).originalWidth;
        return i == -1 ? ((zbc) this.f68zza).getWidth() : (i == 0 || i == -2) ? ((zzb) this.zzb).getWidth() : i;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onFailure(Throwable th) {
        if (((AbstractTransformFuture.AsyncTransformFuture) this.zzb).valueField instanceof AbstractFuture.Cancellation) {
            ((OneShotDisposable) this.zzc).cancel();
            return;
        }
        boolean z = th instanceof Exception;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f68zza;
        if (z) {
            taskCompletionSource.setException((Exception) th);
        } else {
            taskCompletionSource.setException(new ExecutionException(th));
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onSuccess(Object obj) {
        ((TaskCompletionSource) this.f68zza).setResult(obj);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public /* bridge */ /* synthetic */ EncoderConfig registerEncoder(Class cls, ObjectEncoder objectEncoder) {
        switch (this.$r8$classId) {
            case 6:
                ((HashMap) this.f68zza).put(cls, objectEncoder);
                ((HashMap) this.zzb).remove(cls);
                break;
            default:
                ((HashMap) this.f68zza).put(cls, objectEncoder);
                ((HashMap) this.zzb).remove(cls);
                break;
        }
        return this;
    }

    public String toString() {
        String str = "";
        switch (this.$r8$classId) {
            case 1:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f68zza);
                sb.append('{');
                SVG svg = (SVG) ((SVG) this.zzb).idToElementMap;
                while (svg != null) {
                    Object obj = svg.cssRules;
                    sb.append(str);
                    String str2 = (String) svg.rootElement;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    svg = (SVG) svg.idToElementMap;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 11:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f68zza);
                sb2.append('{');
                zzah zzahVar = (zzah) ((zzah) this.zzb).zzc;
                while (zzahVar != null) {
                    Object obj2 = zzahVar.zzb;
                    sb2.append(str);
                    String str3 = (String) zzahVar.f68zza;
                    if (str3 != null) {
                        sb2.append(str3);
                        sb2.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    zzahVar = (zzah) zzahVar.zzc;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 19:
                Response stringHelper = Ascii.toStringHelper(this);
                stringHelper.add((List) this.f68zza, "addrs");
                stringHelper.add((zzbor) this.zzb, "attrs");
                stringHelper.add(Arrays.deepToString((Object[][]) this.zzc), "customOptions");
                return stringHelper.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.String] */
    @Override // com.google.android.gms.measurement.internal.zzll, com.google.android.gms.measurement.internal.zzgw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        int i2;
        zzlr zzlrVar;
        AtomicReference atomicReference;
        switch (this.$r8$classId) {
            case 14:
                zzlj zzljVar = (zzlj) this.f68zza;
                zzljVar.zzg();
                zzom zzomVar = (zzom) this.zzc;
                if (i == 200 || i == 204) {
                    i2 = i;
                } else {
                    i2 = EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE;
                    if (i != 304) {
                        i2 = i;
                        zzgu zzguVar = ((zzic) zzljVar.$$delegate_0).zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzg.zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.zza), Integer.valueOf(i2), th);
                        zzlrVar = !Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i2)) ? zzlr.BACKOFF : zzlr.FAILURE;
                        atomicReference = (AtomicReference) this.zzb;
                        zznl zzt = ((zzic) zzljVar.$$delegate_0).zzt();
                        long j = zzomVar.zza;
                        com.google.android.gms.measurement.internal.zzaf zzafVar = new com.google.android.gms.measurement.internal.zzaf(zzlrVar.zze, j, zzomVar.zzf);
                        zzt.zzg();
                        zzt.zzb$1();
                        zzt.zzaf(new Fillr.AnonymousClass2(17, zzt, zzt.zzah(true), zzafVar));
                        zzgu zzguVar2 = ((zzic) zzljVar.$$delegate_0).zzi;
                        zzic.zzP(zzguVar2);
                        zzguVar2.zzl.zzc("[sgtm] Updated status for row_id", Long.valueOf(j), zzlrVar);
                        synchronized (atomicReference) {
                            atomicReference.set(zzlrVar);
                            atomicReference.notifyAll();
                        }
                        return;
                    }
                }
                if (th == null) {
                    zzgu zzguVar3 = ((zzic) zzljVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar3);
                    zzguVar3.zzl.zzb(Long.valueOf(zzomVar.zza), "[sgtm] Upload succeeded for row_id");
                    zzlrVar = zzlr.SUCCESS;
                    atomicReference = (AtomicReference) this.zzb;
                    zznl zzt2 = ((zzic) zzljVar.$$delegate_0).zzt();
                    long j2 = zzomVar.zza;
                    com.google.android.gms.measurement.internal.zzaf zzafVar2 = new com.google.android.gms.measurement.internal.zzaf(zzlrVar.zze, j2, zzomVar.zzf);
                    zzt2.zzg();
                    zzt2.zzb$1();
                    zzt2.zzaf(new Fillr.AnonymousClass2(17, zzt2, zzt2.zzah(true), zzafVar2));
                    zzgu zzguVar22 = ((zzic) zzljVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar22);
                    zzguVar22.zzl.zzc("[sgtm] Updated status for row_id", Long.valueOf(j2), zzlrVar);
                    synchronized (atomicReference) {
                    }
                }
                zzgu zzguVar4 = ((zzic) zzljVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar4);
                zzguVar4.zzg.zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.zza), Integer.valueOf(i2), th);
                if (!Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i2))) {
                }
                atomicReference = (AtomicReference) this.zzb;
                zznl zzt22 = ((zzic) zzljVar.$$delegate_0).zzt();
                long j22 = zzomVar.zza;
                com.google.android.gms.measurement.internal.zzaf zzafVar22 = new com.google.android.gms.measurement.internal.zzaf(zzlrVar.zze, j22, zzomVar.zzf);
                zzt22.zzg();
                zzt22.zzb$1();
                zzt22.zzaf(new Fillr.AnonymousClass2(17, zzt22, zzt22.zzah(true), zzafVar22));
                zzgu zzguVar222 = ((zzic) zzljVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar222);
                zzguVar222.zzl.zzc("[sgtm] Updated status for row_id", Long.valueOf(j22), zzlrVar);
                synchronized (atomicReference) {
                }
            case 15:
                ((zzpg) this.zzc).zzW(true, i, th, bArr, (String) this.f68zza, (ArrayList) this.zzb, map);
                return;
            default:
                long j3 = ((zzpj) this.zzb).zza;
                zzpg zzpgVar = (zzpg) this.zzc;
                String str2 = (String) this.f68zza;
                zzpgVar.zzaX().zzg();
                zzpgVar.zzu$3();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } catch (Throwable th2) {
                        zzpgVar.zzv = false;
                        zzpgVar.zzaN();
                        throw th2;
                    }
                }
                if (i != 200) {
                    if (i == 204) {
                        i = 204;
                    }
                    String str3 = new String(bArr, StandardCharsets.UTF_8);
                    ?? substring = str3.substring(0, Math.min(32, str3.length()));
                    zzgs zzgsVar = zzpgVar.zzaW().zzi;
                    Integer valueOf = Integer.valueOf(i);
                    if (th == null) {
                        th = substring;
                    }
                    zzgsVar.zzd("Network upload failed. Will retry later. appId, status, error", str2, valueOf, th);
                    zzaw zzawVar = zzpgVar.zze;
                    zzpg.zzaT(zzawVar);
                    zzawVar.zzK(Long.valueOf(j3));
                    zzpgVar.zzaM();
                    zzpgVar.zzv = false;
                    zzpgVar.zzaN();
                    return;
                }
                if (th == null) {
                    zzaw zzawVar2 = zzpgVar.zze;
                    zzpg.zzaT(zzawVar2);
                    zzawVar2.zzE(Long.valueOf(j3));
                    zzpgVar.zzaW().zzl.zzc("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i));
                    zzgz zzgzVar = zzpgVar.zzd;
                    zzpg.zzaT(zzgzVar);
                    if (zzgzVar.zzb()) {
                        zzaw zzawVar3 = zzpgVar.zze;
                        zzpg.zzaT(zzawVar3);
                        if (zzawVar3.zzD(str2)) {
                            zzpgVar.zzP(str2);
                            zzpgVar.zzv = false;
                            zzpgVar.zzaN();
                            return;
                        }
                    }
                    zzpgVar.zzaM();
                    zzpgVar.zzv = false;
                    zzpgVar.zzaN();
                    return;
                }
                String str32 = new String(bArr, StandardCharsets.UTF_8);
                ?? substring2 = str32.substring(0, Math.min(32, str32.length()));
                zzgs zzgsVar2 = zzpgVar.zzaW().zzi;
                Integer valueOf2 = Integer.valueOf(i);
                if (th == null) {
                }
                zzgsVar2.zzd("Network upload failed. Will retry later. appId, status, error", str2, valueOf2, th);
                zzaw zzawVar4 = zzpgVar.zze;
                zzpg.zzaT(zzawVar4);
                zzawVar4.zzK(Long.valueOf(j3));
                zzpgVar.zzaM();
                zzpgVar.zzv = false;
                zzpgVar.zzaN();
                return;
        }
    }

    public synchronized void zzb(long j, long j2, int i, int i2) {
        ((zzic) this.f68zza).zzn.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.zzc;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((zat) this.zzb).log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2)))).addOnFailureListener(new HeadersReader(this, elapsedRealtime, 11));
    }

    public Object zzc(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method zzd = zzd(sSLSocket.getClass());
            if (zzd != null) {
                try {
                    return zzd.invoke(sSLSocket, objArr);
                } catch (IllegalAccessException e) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(zzd.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            String str = (String) this.zzb;
            String valueOf = String.valueOf(sSLSocket);
            StringBuilder sb = new StringBuilder(str.length() + 33 + valueOf.length());
            sb.append("Method ");
            sb.append(str);
            sb.append(" not supported for object ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public Method zzd(Class cls) {
        Class cls2;
        Method zze = zze(cls, (String) this.zzb, (Class[]) this.zzc);
        if (zze == null || (cls2 = (Class) this.f68zza) == null || cls2.isAssignableFrom(zze.getReturnType())) {
            return zze;
        }
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public void zzd() {
        zzbvq zzbvqVar = (zzbvq) this.zzc;
        zzbsq zzbsqVar = (zzbsq) zzbvqVar.zzc.mappedElements;
        if (zzbsqVar == zzbsq.zza || zzbsqVar == zzbsq.zzc) {
            return;
        }
        int i = zzclf.$r8$clinit;
        zzbvqVar.zzd.execute(new zzbvo(this));
    }

    public /* synthetic */ zzah(int i, boolean z) {
        this.$r8$classId = i;
    }

    public zzah(zzbov zzbovVar, zzbsn zzbsnVar, String str) {
        this.$r8$classId = 18;
        this.zzb = zzbovVar;
        this.f68zza = zzbsnVar;
        this.zzc = str;
    }

    public zzah(zzbsd zzbsdVar, zzfp zzfpVar, MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator) {
        this.$r8$classId = 24;
        zzbsdVar.getClass();
        zzfpVar.getClass();
        this.f68zza = zzbsdVar;
        this.zzc = zzfpVar;
        this.zzb = moreExecutors$ScheduledListeningDecorator;
    }

    public /* synthetic */ zzah(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f68zza = obj2;
        this.zzb = obj3;
        this.zzc = obj;
    }

    public /* synthetic */ zzah(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f68zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public zzah(Context context, zzic zzicVar) {
        this.$r8$classId = 13;
        this.zzc = new AtomicLong(-1L);
        this.zzb = zzae.getClient(context, new TelemetryLoggingOptions("measurement:api"));
        this.f68zza = zzicVar;
    }

    public zzah(final zzacr zzacrVar, final String str) {
        this.$r8$classId = 5;
        this.f68zza = BaseEncoding$StandardBaseEncoding.BASE64_URL;
        final int i = 1;
        this.zzb = Strings.memoize(new Supplier(this) { // from class: com.google.android.gms.internal.measurement.zzmx
            public final /* synthetic */ com.google.android.gms.maps.zzah zza;

            {
                this.zza = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.google.common.base.Supplier
            public final Object get() {
                long j;
                char c;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long unsignedInt;
                int i2 = i;
                Serializable serializable = zzacrVar;
                com.google.android.gms.maps.zzah zzahVar = this.zza;
                switch (i2) {
                    case 0:
                        int i3 = Hashing.$r8$clinit;
                        int i4 = Murmur3_128HashFunction.$r8$clinit;
                        Murmur3_128HashFunction.Murmur3_128Hasher putBytes = new Murmur3_128HashFunction.Murmur3_128Hasher().putBytes(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = putBytes.buffer;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            putBytes.munch();
                        }
                        Murmur3_128HashFunction.Murmur3_128Hasher putBytes2 = putBytes.putBytes("".getBytes());
                        putBytes2.munch();
                        ByteBuffer byteBuffer2 = putBytes2.buffer;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            putBytes2.length = byteBuffer2.remaining() + putBytes2.length;
                            long j7 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
                                    j2 = j3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    c = '\b';
                                    j5 = 0;
                                    j4 = j5 ^ (Byte.toUnsignedInt(byteBuffer2.get(4)) << 32);
                                    j3 = j4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
                                    j2 = j3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j6 = 0;
                                    c = '\b';
                                    j5 = (Byte.toUnsignedInt(byteBuffer2.get(5)) << 40) ^ j6;
                                    j4 = j5 ^ (Byte.toUnsignedInt(byteBuffer2.get(4)) << 32);
                                    j3 = j4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
                                    j2 = j3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j6 = Byte.toUnsignedInt(byteBuffer2.get(6)) << 48;
                                    c = '\b';
                                    j5 = (Byte.toUnsignedInt(byteBuffer2.get(5)) << 40) ^ j6;
                                    j4 = j5 ^ (Byte.toUnsignedInt(byteBuffer2.get(4)) << 32);
                                    j3 = j4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
                                    j2 = j3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(12)) << 32;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(13)) << 40;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(12)) << 32;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j7 = Byte.toUnsignedInt(byteBuffer2.get(14)) << 48;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(13)) << 40;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(12)) << 32;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    a$$ExternalSyntheticBUOutline0.m$1((Object) "Should never get here.");
                                    return null;
                            }
                        }
                        long j8 = putBytes2.h1;
                        long j9 = putBytes2.length;
                        long j10 = j8 ^ j9;
                        long j11 = j9 ^ putBytes2.h2;
                        long j12 = j10 + j11;
                        long j13 = j11 + j12;
                        long j14 = (j12 ^ (j12 >>> 33)) * (-49064778989728563L);
                        long j15 = (j14 ^ (j14 >>> 33)) * (-4265267296055464877L);
                        long j16 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j17 = (j16 ^ (j16 >>> 33)) * (-4265267296055464877L);
                        long j18 = j17 ^ (j17 >>> 33);
                        long j19 = (j15 ^ (j15 >>> 33)) + j18;
                        putBytes2.h1 = j19;
                        putBytes2.h2 = j18 + j19;
                        byte[] array2 = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(putBytes2.h1).putLong(putBytes2.h2).array();
                        array2.getClass();
                        return ((BaseEncoding$Base64Encoding) zzahVar.f68zza).encode((byte[]) array2.clone());
                    default:
                        return ((BaseEncoding$Base64Encoding) zzahVar.f68zza).encode(((zzacr) serializable).zzm());
                }
            }
        });
        final int i2 = 0;
        this.zzc = Strings.memoize(new Supplier(this) { // from class: com.google.android.gms.internal.measurement.zzmx
            public final /* synthetic */ com.google.android.gms.maps.zzah zza;

            {
                this.zza = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.google.common.base.Supplier
            public final Object get() {
                long j;
                char c;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long unsignedInt;
                int i22 = i2;
                Serializable serializable = str;
                com.google.android.gms.maps.zzah zzahVar = this.zza;
                switch (i22) {
                    case 0:
                        int i3 = Hashing.$r8$clinit;
                        int i4 = Murmur3_128HashFunction.$r8$clinit;
                        Murmur3_128HashFunction.Murmur3_128Hasher putBytes = new Murmur3_128HashFunction.Murmur3_128Hasher().putBytes(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = putBytes.buffer;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            putBytes.munch();
                        }
                        Murmur3_128HashFunction.Murmur3_128Hasher putBytes2 = putBytes.putBytes("".getBytes());
                        putBytes2.munch();
                        ByteBuffer byteBuffer2 = putBytes2.buffer;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            putBytes2.length = byteBuffer2.remaining() + putBytes2.length;
                            long j7 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
                                    j2 = j3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    c = '\b';
                                    j5 = 0;
                                    j4 = j5 ^ (Byte.toUnsignedInt(byteBuffer2.get(4)) << 32);
                                    j3 = j4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
                                    j2 = j3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j6 = 0;
                                    c = '\b';
                                    j5 = (Byte.toUnsignedInt(byteBuffer2.get(5)) << 40) ^ j6;
                                    j4 = j5 ^ (Byte.toUnsignedInt(byteBuffer2.get(4)) << 32);
                                    j3 = j4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
                                    j2 = j3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j6 = Byte.toUnsignedInt(byteBuffer2.get(6)) << 48;
                                    c = '\b';
                                    j5 = (Byte.toUnsignedInt(byteBuffer2.get(5)) << 40) ^ j6;
                                    j4 = j5 ^ (Byte.toUnsignedInt(byteBuffer2.get(4)) << 32);
                                    j3 = j4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
                                    j2 = j3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
                                    j = j2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
                                    unsignedInt = j ^ Byte.toUnsignedInt(byteBuffer2.get(0));
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(12)) << 32;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(13)) << 40;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(12)) << 32;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j7 = Byte.toUnsignedInt(byteBuffer2.get(14)) << 48;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(13)) << 40;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(12)) << 32;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
                                    j7 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
                                    unsignedInt = byteBuffer2.getLong();
                                    putBytes2.h1 = (Long.rotateLeft(unsignedInt * (-8663945395140668459L), 31) * 5545529020109919103L) ^ putBytes2.h1;
                                    putBytes2.h2 ^= Long.rotateLeft(j7 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    a$$ExternalSyntheticBUOutline0.m$1((Object) "Should never get here.");
                                    return null;
                            }
                        }
                        long j8 = putBytes2.h1;
                        long j9 = putBytes2.length;
                        long j10 = j8 ^ j9;
                        long j11 = j9 ^ putBytes2.h2;
                        long j12 = j10 + j11;
                        long j13 = j11 + j12;
                        long j14 = (j12 ^ (j12 >>> 33)) * (-49064778989728563L);
                        long j15 = (j14 ^ (j14 >>> 33)) * (-4265267296055464877L);
                        long j16 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j17 = (j16 ^ (j16 >>> 33)) * (-4265267296055464877L);
                        long j18 = j17 ^ (j17 >>> 33);
                        long j19 = (j15 ^ (j15 >>> 33)) + j18;
                        putBytes2.h1 = j19;
                        putBytes2.h2 = j18 + j19;
                        byte[] array2 = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(putBytes2.h1).putLong(putBytes2.h2).array();
                        array2.getClass();
                        return ((BaseEncoding$Base64Encoding) zzahVar.f68zza).encode((byte[]) array2.clone());
                    default:
                        return ((BaseEncoding$Base64Encoding) zzahVar.f68zza).encode(((zzacr) serializable).zzm());
                }
            }
        });
    }

    public zzah(MapView mapView, zzl zzlVar) {
        this.$r8$classId = 0;
        this.zzb = zzlVar;
        zzae.checkNotNull(mapView);
        this.f68zza = mapView;
    }

    public zzah(zzbvq zzbvqVar, zzboz zzbozVar) {
        this.$r8$classId = 20;
        this.zzc = zzbvqVar;
        Trace.checkNotNull(zzbozVar, "observer");
        this.f68zza = zzbozVar;
    }

    public zzah(String str, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 11:
                zzah zzahVar = new zzah(10, false);
                this.zzb = zzahVar;
                this.zzc = zzahVar;
                this.f68zza = str;
                break;
            default:
                SVG svg = new SVG(29);
                this.zzb = svg;
                this.zzc = svg;
                this.f68zza = str;
                break;
        }
    }

    public /* synthetic */ zzah(List list, zzbor zzborVar, Object[][] objArr) {
        this.$r8$classId = 19;
        Trace.checkNotNull(list, "addresses are not set");
        this.f68zza = list;
        Trace.checkNotNull(zzborVar, "attrs");
        this.zzb = zzborVar;
        Trace.checkNotNull(objArr, "customOptions");
        this.zzc = objArr;
    }

    public void zzb(int i, String str) {
        String valueOf = String.valueOf(i);
        zzt zztVar = new zzt(10, false);
        ((zzah) this.zzc).zzc = zztVar;
        this.zzc = zztVar;
        zztVar.zzb = valueOf;
        zztVar.f68zza = str;
    }

    public zzah(zzaa zzaaVar) {
        this.$r8$classId = 2;
        this.f68zza = zzaaVar;
        this.zzb = zzaaVar.clone();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public void zzb(zzfv zzfvVar) {
        int i = zzclf.$r8$clinit;
        ((zzbvq) this.zzc).zzd.execute(new zzbvl(this, zzfvVar));
    }

    public zzah(MaterialBackHandler materialBackHandler, View view) {
        Object materialBackOrchestrator$Api33BackCallbackDelegate;
        this.$r8$classId = 28;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            materialBackOrchestrator$Api33BackCallbackDelegate = new MaterialBackOrchestrator$Api34BackCallbackDelegate();
        } else {
            materialBackOrchestrator$Api33BackCallbackDelegate = i >= 33 ? new MaterialBackOrchestrator$Api33BackCallbackDelegate() : null;
        }
        this.f68zza = materialBackOrchestrator$Api33BackCallbackDelegate;
        this.zzb = materialBackHandler;
        this.zzc = view;
    }

    public zzcs zzc() {
        List list;
        String str = (String) this.f68zza;
        if (str != null && (list = (List) this.zzc) != null) {
            return new zzcs(str, (String) this.zzb, list);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.f68zza) == null) {
            sb.append(" name");
        }
        if (((List) this.zzc) == null) {
            sb.append(" types");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public void zzb(Object obj, String str) {
        SVG svg = new SVG(29);
        ((SVG) this.zzc).idToElementMap = svg;
        this.zzc = svg;
        svg.cssRules = obj;
        svg.rootElement = str;
    }

    public void zzb(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method zzd = zzd(sSLSocket.getClass());
            if (zzd == null) {
                return;
            }
            try {
                zzd.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public void zzc(zzbtx zzbtxVar, zzbvs zzbvsVar, zzbsn zzbsnVar) {
        int i = zzclf.$r8$clinit;
        zzbvq zzbvqVar = (zzbvq) this.zzc;
        zzbpy zzbpyVar = zzbvqVar.zzj.zzb;
        if (zzbpyVar == null) {
            zzbpyVar = null;
        }
        if (zzbtxVar.zzn == zzbtu.CANCELLED && zzbpyVar != null) {
            if (!zzbpyVar.zzh) {
                if (zzbpyVar.zzg - System.nanoTime() <= 0) {
                    zzbpyVar.zzh = true;
                }
            }
            zzbtxVar = zzbvqVar.zzh.zzc();
            zzbsnVar = new zzbsn();
        }
        zzbvqVar.zzd.execute(new zzbvn(this, zzbtxVar, zzbsnVar));
    }

    public void zzc(Object obj, String str) {
        zzah zzahVar = new zzah(10, false);
        ((zzah) this.zzc).zzc = zzahVar;
        this.zzc = zzahVar;
        zzahVar.zzb = obj;
        zzahVar.f68zza = str;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public File zza() {
        String str = (String) ((Supplier) this.zzb).get();
        String str2 = (String) ((Supplier) this.zzc).get();
        return new File(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public Object zza() {
        Object zza2 = ((zzaf) this.f68zza).zza();
        return new zzg((zzr) zza2, ((zzi) ((com.google.mlkit.vision.text.internal.zzr) this.zzc).zza).zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public void zza(zzbsn zzbsnVar) {
        int i = zzclf.$r8$clinit;
        ((zzbvq) this.zzc).zzd.execute(new zzbvl(this, zzbsnVar));
    }

    public void zza(String str, float f) {
        String valueOf = String.valueOf(f);
        zzt zztVar = new zzt(10, false);
        ((zzah) this.zzc).zzc = zztVar;
        this.zzc = zztVar;
        zztVar.zzb = valueOf;
        zztVar.f68zza = str;
    }

    public static zzah zza(zzic zzicVar) {
        if (zza == null) {
            zza = new zzah(zzicVar.zzd, zzicVar);
        }
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzw zza(zzb zzbVar) {
        int i;
        TaskCompletionSource taskCompletionSource;
        if (Strings.checkSelfPermission((Context) this.zzc, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            i = 100;
            zzo.zza(100);
        } else {
            i = 102;
            zzo.zza(102);
        }
        int i2 = i;
        zzmv zzmvVar = (zzmv) this.zzb;
        zzbi zzbiVar = (zzbi) this.f68zza;
        CurrentLocationRequest currentLocationRequest = new CurrentLocationRequest(10000L, 0, i2, 30000L, false, 0, new WorkSource(null), null);
        if (zzbVar != null) {
            zzae.checkArgument("cancellationToken may not be already canceled", !((zzw) zzbVar.zza).isComplete());
        }
        zacn builder = zacn.builder();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        builder.zaa = new zbc((Object) currentLocationRequest, (Object) zzbVar, false, 10);
        builder.zac = 2415;
        zzw zae = zzbiVar.zae(0, builder.build());
        if (zzbVar != null) {
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource(zzbVar);
            zzbq zzbqVar = new zzbq(taskCompletionSource2);
            zae.getClass();
            zae.continueWith(TaskExecutors.MAIN_THREAD, zzbqVar);
            zae = taskCompletionSource2.zza;
        }
        if (zzbVar == null) {
            taskCompletionSource = new TaskCompletionSource();
        } else {
            taskCompletionSource = new TaskCompletionSource(zzbVar);
        }
        HashMap hashMap = zzmvVar.zza;
        if (!hashMap.containsKey(taskCompletionSource)) {
            HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
            handlerThread.start();
            hashMap.put(taskCompletionSource, handlerThread);
            new Handler(handlerThread.getLooper()).postDelayed(new zzmu((Object) taskCompletionSource, (int) (objArr3 == true ? 1 : 0)), 30000L);
        }
        zae.continueWithTask(new zzli(2, taskCompletionSource));
        zbc zbcVar = new zbc((Object) zzmvVar, (Object) taskCompletionSource, (boolean) (objArr2 == true ? 1 : 0), 27);
        zzw zzwVar = taskCompletionSource.zza;
        zzwVar.addOnCompleteListener(zbcVar);
        return (zzw) zzwVar.continueWithTask(TaskExecutors.MAIN_THREAD, new zzgc((int) (objArr == true ? 1 : 0)));
    }
}
