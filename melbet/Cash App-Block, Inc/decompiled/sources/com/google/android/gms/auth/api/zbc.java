package com.google.android.gms.auth.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.trace.api.span.DatadogSpan;
import com.datadog.android.trace.api.span.DatadogSpanBuilder;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.android.trace.api.trace.DatadogTraceId;
import com.datadog.android.trace.internal.DatadogSpanAdapter;
import com.datadog.android.trace.internal.DatadogSpanContextAdapter;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.time.SystemTimeSource;
import com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;
import com.datadog.trace.common.sampling.DeterministicSampler$TraceSampler;
import com.datadog.trace.core.CoreTracer;
import com.datadog.trace.core.DDSpan;
import com.datadog.trace.core.DDSpanContext;
import com.datadog.trace.core.PendingTrace;
import com.datadog.trace.core.PendingTraceBuffer;
import com.datadog.trace.core.propagation.ExtractedContext;
import com.datadog.trace.core.propagation.ptags.PTagsFactory$PTags;
import com.datadog.trace.core.scopemanager.ScopeStack;
import com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda2;
import com.datadog.trace.logger.Logger;
import com.fillr.e0;
import com.fillr.featuretoggle.repository.ToggleCollection;
import com.fillr.m1;
import com.fillr.service.FeatureFlagsService;
import com.google.android.datatransport.AutoValue_Event;
import com.google.android.datatransport.AutoValue_ProductData;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.TransportImpl;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.filament.Box;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzx;
import com.google.android.gms.cloudmessaging.zzy;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zaf;
import com.google.android.gms.common.moduleinstall.internal.zaj;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.common.moduleinstall.internal.zaz;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.fido.zzfz;
import com.google.android.gms.internal.location.zzbq;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.internal.location.zzdd;
import com.google.android.gms.internal.location.zzde;
import com.google.android.gms.internal.location.zzdh;
import com.google.android.gms.internal.location.zzdj;
import com.google.android.gms.internal.location.zzdv;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.location.zzeg;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.internal.location.zzu;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzcw;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzmw;
import com.google.android.gms.internal.time.zzah;
import com.google.android.gms.internal.time.zzax;
import com.google.android.gms.internal.time.zzbb;
import com.google.android.gms.internal.time.zzbi;
import com.google.android.gms.internal.time.zzbj;
import com.google.android.gms.internal.time.zzcb;
import com.google.android.gms.internal.time.zzhk;
import com.google.android.gms.internal.time.zzs;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.auth.zzd;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.libraries.places.api.net.zze;
import com.google.android.libraries.places.api.net.zzf;
import com.google.android.libraries.places.api.net.zzk;
import com.google.android.libraries.places.api.net.zzl;
import com.google.android.libraries.places.api.net.zzt;
import com.google.android.libraries.places.api.net.zzv;
import com.google.android.libraries.places.internal.zzabi;
import com.google.android.libraries.places.internal.zzabk;
import com.google.android.libraries.places.internal.zzaqd;
import com.google.android.libraries.places.internal.zzaqe;
import com.google.android.libraries.places.internal.zzaqi;
import com.google.android.libraries.places.internal.zzaqj;
import com.google.android.libraries.places.internal.zzaqq;
import com.google.android.libraries.places.internal.zzaqv;
import com.google.android.libraries.places.internal.zzari;
import com.google.android.libraries.places.internal.zzarj;
import com.google.android.libraries.places.internal.zzasz;
import com.google.android.libraries.places.internal.zzata;
import com.google.android.libraries.places.internal.zzatp;
import com.google.android.libraries.places.internal.zzatw;
import com.google.android.libraries.places.internal.zzaub;
import com.google.android.libraries.places.internal.zzauc;
import com.google.android.libraries.places.internal.zzavb;
import com.google.android.libraries.places.internal.zzavc;
import com.google.android.libraries.places.internal.zzavg;
import com.google.android.libraries.places.internal.zzavi;
import com.google.android.libraries.places.internal.zzavp;
import com.google.android.libraries.places.internal.zzavt;
import com.google.android.libraries.places.internal.zzboq;
import com.google.android.libraries.places.internal.zzbor;
import com.google.android.libraries.places.internal.zzbpq;
import com.google.android.libraries.places.internal.zzbpr;
import com.google.android.libraries.places.internal.zzbrl;
import com.google.android.libraries.places.internal.zzbrm;
import com.google.android.libraries.places.internal.zzbro;
import com.google.android.libraries.places.internal.zzbrs;
import com.google.android.libraries.places.internal.zzbrt;
import com.google.android.libraries.places.internal.zzbru;
import com.google.android.libraries.places.internal.zzbtx;
import com.google.android.libraries.places.internal.zzcdh;
import com.google.android.libraries.places.internal.zzcdj;
import com.google.android.libraries.places.internal.zzcdn;
import com.google.android.libraries.places.internal.zzcdo;
import com.google.android.libraries.places.internal.zzchy;
import com.google.android.libraries.places.internal.zzcia;
import com.google.android.libraries.places.internal.zzcje;
import com.google.android.libraries.places.internal.zzcjt;
import com.google.android.libraries.places.internal.zzclo;
import com.google.android.libraries.places.internal.zzcls;
import com.google.android.libraries.places.internal.zzey;
import com.google.android.libraries.places.internal.zzfl;
import com.google.android.libraries.places.internal.zzfp;
import com.google.android.libraries.places.internal.zzfv;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzgc;
import com.google.android.libraries.places.internal.zzjn;
import com.google.android.libraries.places.internal.zzjp;
import com.google.android.libraries.places.internal.zzlh;
import com.google.android.libraries.places.internal.zzli;
import com.google.android.libraries.places.internal.zzmv;
import com.google.android.libraries.places.internal.zznk;
import com.google.android.libraries.places.internal.zznq;
import com.google.android.libraries.places.internal.zzns;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.gson.GsonBuilder;
import com.google.mlkit.vision.text.zza;
import com.google.zxing.Result;
import com.squareup.cash.db.contacts.RecipientUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import net.oneformapp.PopEncryptorV2_;

/* loaded from: classes4.dex */
public class zbc implements DatadogSpanContext, DatadogSpanBuilder, Logger, Continuation, RemoteCall, OnTokenCanceledListener, zzbru, OnCompleteListener, ExtendedFloatingActionButton.Size {
    public final /* synthetic */ int $r8$classId;
    public Object zba;
    public Object zbb;

    public zbc(Activity activity, PopEncryptorV2_ popEncryptorV2_, SVG svg) {
        this.$r8$classId = 5;
        this.zba = svg;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(activity.getCacheDir(), "unleash_features.json");
            bufferedReader = file.exists() ? new BufferedReader(new InputStreamReader(new FileInputStream(file))) : new BufferedReader(new InputStreamReader(activity.getAssets().open("unleash_features.json")));
            this.zbb = RecipientUtil.fromJson(bufferedReader);
        } catch (Exception unused) {
            if (bufferedReader == null) {
                return;
            }
        } catch (Throwable th) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
        try {
            bufferedReader.close();
        } catch (IOException unused3) {
        }
    }

    public static String bundleMessageWithTitle(String str, String str2) {
        Locale locale = Locale.US;
        return Recorder$$ExternalSyntheticOutline2.m(str, ": ", str2);
    }

    public static String generateLogMessage(String str, String str2, Object... objArr) {
        String replace = str2.replace("{}", "%s");
        return String.format(Locale.US, str + ": " + replace, objArr);
    }

    public static final int zzp(Task task) {
        if (task.isSuccessful()) {
            return 2;
        }
        Exception exception = task.getException();
        exception.getClass();
        int i = (exception instanceof ApiException ? (ApiException) exception : new ApiException(new Status(13, exception.getMessage(), null, null))).mStatus.zza;
        if (i != 7) {
            return i != 15 ? 1 : 3;
        }
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        if (r10.getVersion() < 1) goto L63;
     */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        Feature feature;
        Feature feature2;
        Feature feature3;
        Object obj3 = null;
        boolean z = true;
        switch (this.$r8$classId) {
            case 8:
                zaj zajVar = new zaj((zay) this.zba, (TaskCompletionSource) obj2, 1);
                zaf zafVar = (zaf) ((zaz) obj).getService();
                ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) this.zbb;
                Parcel zaa = zafVar.zaa();
                zac.zac(zaa, zajVar);
                zac.zab(zaa, apiFeatureRequest);
                zaa.writeStrongBinder(null);
                zafVar.zac(zaa, 2);
                return;
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzdz zzdzVar = (zzdz) obj;
                CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) this.zba;
                zzb zzbVar = (zzb) this.zbb;
                Feature[] availableFeatures = zzdzVar.getAvailableFeatures();
                boolean z2 = false;
                if (availableFeatures != null) {
                    int i = 0;
                    while (true) {
                        if (i < availableFeatures.length) {
                            feature3 = availableFeatures[i];
                            if (!"location_updates_with_callback".equals(feature3.zza)) {
                                i++;
                            }
                        } else {
                            feature3 = null;
                        }
                    }
                    if (feature3 != null && feature3.getVersion() >= 1) {
                        zzu zzuVar = (zzu) zzdzVar.getService();
                        zzee zzd = zzee.zzd(new zzde(1, taskCompletionSource));
                        Parcel zza = zzuVar.zza();
                        zzc.zzb(zza, currentLocationRequest);
                        zzc.zzb(zza, zzd);
                        Parcel zzb = zzuVar.zzb(zza, 92);
                        IBinder readStrongBinder = zzb.readStrongBinder();
                        int i2 = ICancelToken.Stub.$r8$clinit;
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                            obj3 = queryLocalInterface instanceof ICancelToken ? (ICancelToken) queryLocalInterface : new com.google.android.gms.common.internal.zzu(readStrongBinder, "com.google.android.gms.common.internal.ICancelToken", 2);
                        }
                        zzb.recycle();
                        if (zzbVar != null) {
                            zzbVar.onCanceledRequested(new zzb(obj3, 19));
                            return;
                        }
                        return;
                    }
                }
                Feature[] availableFeatures2 = zzdzVar.getAvailableFeatures();
                if (availableFeatures2 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < availableFeatures2.length) {
                            feature2 = availableFeatures2[i3];
                            if (!"get_current_location".equals(feature2.zza)) {
                                i3++;
                            }
                        } else {
                            feature2 = null;
                        }
                    }
                    if (feature2 != null && feature2.getVersion() >= 2) {
                        zzu zzuVar2 = (zzu) zzdzVar.getService();
                        zzde zzdeVar = new zzde(1, taskCompletionSource);
                        Parcel zza2 = zzuVar2.zza();
                        zzc.zzb(zza2, currentLocationRequest);
                        zza2.writeStrongBinder(zzdeVar);
                        Parcel zzb2 = zzuVar2.zzb(zza2, 87);
                        IBinder readStrongBinder2 = zzb2.readStrongBinder();
                        int i4 = ICancelToken.Stub.$r8$clinit;
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                            obj3 = queryLocalInterface2 instanceof ICancelToken ? (ICancelToken) queryLocalInterface2 : new com.google.android.gms.common.internal.zzu(readStrongBinder2, "com.google.android.gms.common.internal.ICancelToken", 2);
                        }
                        zzb2.recycle();
                        if (zzbVar != null) {
                            zzbVar.onCanceledRequested(new m1(obj3, 23));
                            return;
                        }
                        return;
                    }
                }
                ListenerHolder listenerHolder = new ListenerHolder(new zzdh(zzdzVar, taskCompletionSource));
                ListenerHolder.ListenerKey listenerKey = listenerHolder.zab;
                Objects.requireNonNull(listenerKey);
                Box box = new Box(15, listenerHolder, taskCompletionSource);
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                LocationRequest.Builder builder = new LocationRequest.Builder(currentLocationRequest.zzc, 0L);
                builder.setMinUpdateIntervalMillis(0L);
                builder.setDurationMillis(currentLocationRequest.zzd);
                builder.setGranularity(currentLocationRequest.zzb);
                builder.setMaxUpdateAgeMillis(currentLocationRequest.zza);
                builder.zzl = currentLocationRequest.zze;
                builder.zza(currentLocationRequest.zzf);
                builder.zzh = true;
                builder.zzm = currentLocationRequest.zzg;
                LocationRequest build = builder.build();
                ListenerHolder.ListenerKey listenerKey2 = listenerHolder.zab;
                Objects.requireNonNull(listenerKey2);
                Feature[] availableFeatures3 = zzdzVar.getAvailableFeatures();
                if (availableFeatures3 != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < availableFeatures3.length) {
                            feature = availableFeatures3[i5];
                            if (!"location_updates_with_callback".equals(feature.zza)) {
                                i5++;
                            }
                        } else {
                            feature = null;
                        }
                    }
                    if (feature != null) {
                        break;
                    }
                }
                z = false;
                synchronized (zzdzVar.zzg) {
                    try {
                        zzdv zzdvVar = (zzdv) zzdzVar.zzg.get(listenerKey2);
                        if (zzdvVar != null && !z) {
                            zzdvVar.zza.getClass();
                            throw new IllegalStateException();
                        }
                        zzdv zzdvVar2 = new zzdv(box);
                        zzdzVar.zzg.put(listenerKey2, zzdvVar2);
                        if (z) {
                            zzu zzuVar3 = (zzu) zzdzVar.getService();
                            zzee zzb3 = zzee.zzb(zzdvVar, zzdvVar2, listenerKey2.toIdString());
                            zzdj zzdjVar = new zzdj(null, taskCompletionSource2);
                            Parcel zza3 = zzuVar3.zza();
                            zzc.zzb(zza3, zzb3);
                            zzc.zzb(zza3, build);
                            zza3.writeStrongBinder(zzdjVar);
                            zzuVar3.zzc(zza3, 88);
                        } else {
                            ((zzu) zzdzVar.getService()).zzv(new zzei(1, new zzeg(build, null, false, false, false, false, Long.MAX_VALUE), null, zzdvVar2, null, new zzdd(taskCompletionSource2, zzdvVar2), listenerKey2.toIdString()));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                taskCompletionSource2.zza.addOnCompleteListener(new zzbq(taskCompletionSource));
                if (zzbVar != null) {
                    zzbVar.onCanceledRequested(new zbc(zzdzVar, listenerKey, z2, 11));
                    return;
                }
                return;
        }
    }

    public void debug(String str, Object obj) {
        InternalLogger internalLogger = (InternalLogger) this.zba;
        ((zzlj) internalLogger).log(2, InternalLogger.Target.MAINTAINER, (Function0) new DatadogCoreTracerLogger$$ExternalSyntheticLambda2(this, str, obj, 0), (Throwable) null, false, (Map) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory get(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.zbb) == null) {
            Context context = (Context) this.zba;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.zbb = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.zbb = map;
        }
        String str4 = (String) ((Map) this.zbb).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((zzb) this.zba).zza;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.zbb;
        int i = extendedFloatingActionButton2.originalHeight;
        if (i != -1) {
            return (i == 0 || i == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public ViewGroup.LayoutParams getLayoutParams() {
        int i = ((ExtendedFloatingActionButton) this.zbb).originalHeight;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.zbb).extendedPaddingEnd;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.zbb).extendedPaddingStart;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public int getSamplingPriority() {
        return 0;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public long getSpanId() {
        return 0L;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public Map getTags() {
        return (EmptyMap) this.zbb;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public DatadogTraceId getTraceId() {
        return (com.google.mlkit.vision.text.zzb) this.zba;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getWidth() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        zzb zzbVar = (zzb) this.zba;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.zbb;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return zzbVar.getWidth();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return zzbVar.getWidth();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder ignoreActiveSpan() {
        ((PausedCompositionImpl) this.zba).reusable = true;
        return this;
    }

    public void interceptEvent(String str, String str2, Bundle bundle, long j) {
        try {
            zzcw zzcwVar = (zzcw) ((zzcy) this.zba);
            Parcel zza = zzcwVar.zza();
            zza.writeString(str);
            zza.writeString(str2);
            zzbn.zzc(zza, bundle);
            zza.writeLong(j);
            zzcwVar.zzc(zza, 1);
        } catch (RemoteException e) {
            zzic zzicVar = ((AppMeasurementDynamiteService) this.zbb).zza;
            if (zzicVar != null) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzg.zzb(e, "Event interceptor threw exception");
            }
        }
    }

    @Override // com.datadog.trace.logger.Logger
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public /* synthetic */ void onCanceled() {
        try {
            ((zzdz) this.zba).zzw((ListenerHolder.ListenerKey) this.zbb, true, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        zzmv zzmvVar = (zzmv) this.zba;
        HandlerThread handlerThread = (HandlerThread) zzmvVar.zza.remove((TaskCompletionSource) this.zbb);
        if (handlerThread == null) {
            return;
        }
        handlerThread.quit();
    }

    public void saveTogglesToLocalCopy(FeatureFlagsService featureFlagsService) {
        if (((ToggleCollection) this.zbb) == null) {
            return;
        }
        File cacheDir = featureFlagsService.getCacheDir();
        if (cacheDir.getFreeSpace() < 1048576) {
            return;
        }
        File file = new File(cacheDir, "unleash_features.json");
        try {
            String json = new GsonBuilder().create().toJson((ToggleCollection) this.zbb);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.append((CharSequence) json);
            outputStreamWriter.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public void setMetric(double d) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public boolean setSamplingPriority(int i) {
        return false;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpan start() {
        String str;
        long j;
        PTagsFactory$PTags createValid;
        DDTraceId dDTraceId;
        long j2;
        long j3;
        int i;
        CharSequence charSequence;
        Map map;
        Map map2;
        CoreTracer.ConfigSnapshot configSnapshot;
        AgentSpan$Context agentSpan$Context;
        int i2;
        CharSequence charSequence2;
        long j4;
        PendingTrace pendingTrace;
        Map map3;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        Map map4;
        DDTraceId dDTraceId2;
        PausedCompositionImpl pausedCompositionImpl = (PausedCompositionImpl) this.zba;
        AgentSpan$Context agentSpan$Context2 = (AgentSpan$Context) pausedCompositionImpl.applier;
        if (agentSpan$Context2 instanceof TagContext) {
            List list = ((TagContext) agentSpan$Context2).terminatedContextLinks;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            if (!list.isEmpty()) {
                if (((ArrayList) pausedCompositionImpl.invalidScopes) == null) {
                    pausedCompositionImpl.invalidScopes = new ArrayList();
                }
                ((ArrayList) pausedCompositionImpl.invalidScopes).addAll(list);
            }
        }
        String str3 = (String) pausedCompositionImpl.composition;
        long j5 = pausedCompositionImpl.owningThread;
        long nonZeroPositiveLong = ((CoreTracer) pausedCompositionImpl.pausableApplier).idGenerationStrategy.getNonZeroPositiveLong();
        AgentSpan$Context agentSpan$Context3 = (AgentSpan$Context) pausedCompositionImpl.applier;
        if (agentSpan$Context3 == null && !pausedCompositionImpl.reusable) {
            ((ScopeStack) ((CoreTracer) pausedCompositionImpl.pausableApplier).scopeManager.tlsScopeStack.get()).getClass();
        }
        if (agentSpan$Context3 instanceof DDSpanContext) {
            DDSpanContext dDSpanContext = (DDSpanContext) agentSpan$Context3;
            DDTraceId dDTraceId3 = dDSpanContext.traceId;
            long j6 = dDSpanContext.spanId;
            Map map5 = dDSpanContext.baggageItems;
            pendingTrace = dDSpanContext.trace;
            String str4 = dDSpanContext.serviceName;
            str = str3;
            if (((String) pausedCompositionImpl.lock) == null) {
                pausedCompositionImpl.lock = str4;
            }
            Object obj4 = dDSpanContext.requestContextDataAppSec;
            Object obj5 = dDSpanContext.requestContextDataIast;
            Object obj6 = dDSpanContext.ciVisibilityContextData;
            createValid = ((CoreTracer) pausedCompositionImpl.pausableApplier).propagationTagsFactory.createValid(null, null, null);
            str2 = str4;
            dDTraceId2 = dDTraceId3;
            j4 = j6;
            agentSpan$Context = agentSpan$Context3;
            obj = obj4;
            obj3 = obj6;
            obj2 = obj5;
            map3 = null;
            map = null;
            i2 = -128;
            charSequence2 = null;
            map4 = map5;
        } else {
            str = str3;
            if (agentSpan$Context3 instanceof ExtractedContext) {
                ExtractedContext extractedContext = (ExtractedContext) agentSpan$Context3;
                DDTraceId dDTraceId4 = extractedContext.traceId;
                long j7 = extractedContext.spanId;
                int i3 = extractedContext.samplingPriority;
                j = 0;
                long j8 = extractedContext.endToEndStartTime;
                createValid = extractedContext.propagationTags;
                dDTraceId = dDTraceId4;
                j3 = j8;
                i = i3;
                j2 = j7;
            } else {
                j = 0;
                if (agentSpan$Context3 != null) {
                    dDTraceId = agentSpan$Context3.getTraceId() == DDTraceId.ZERO ? ((CoreTracer) pausedCompositionImpl.pausableApplier).idGenerationStrategy.generateTraceId() : agentSpan$Context3.getTraceId();
                    j2 = agentSpan$Context3.getSpanId();
                    j3 = 0;
                    i = agentSpan$Context3.getTraceSamplingPriority();
                    createValid = ((CoreTracer) pausedCompositionImpl.pausableApplier).propagationTagsFactory.createValid(null, null, null);
                } else {
                    DDTraceId generateTraceId = ((CoreTracer) pausedCompositionImpl.pausableApplier).idGenerationStrategy.generateTraceId();
                    createValid = ((CoreTracer) pausedCompositionImpl.pausableApplier).propagationTagsFactory.createValid(null, null, null);
                    dDTraceId = generateTraceId;
                    j2 = 0;
                    j3 = 0;
                    i = -128;
                }
            }
            if (agentSpan$Context3 instanceof TagContext) {
                TagContext tagContext = (TagContext) agentSpan$Context3;
                CoreTracer.ConfigSnapshot configSnapshot2 = tagContext.traceConfig;
                Map map6 = tagContext.tags;
                charSequence = tagContext.origin;
                configSnapshot = configSnapshot2;
                map2 = tagContext.baggage;
                map = map6;
            } else {
                charSequence = (String) pausedCompositionImpl.rememberManager;
                map = null;
                map2 = null;
                configSnapshot = null;
            }
            CoreTracer coreTracer = (CoreTracer) pausedCompositionImpl.pausableApplier;
            agentSpan$Context = agentSpan$Context3;
            Map map7 = coreTracer.localRootSpanTags;
            Response response = coreTracer.pendingTraceFactory;
            response.getClass();
            PendingTrace pendingTrace2 = new PendingTrace((CoreTracer) response.result, dDTraceId, (PendingTraceBuffer) response.cacheEntry, (SystemTimeSource) response.error, configSnapshot, response.intermediate);
            if (j3 > j) {
                PendingTrace.END_TO_END_START_TIME.compareAndSet(pendingTrace2, 0L, j3);
            }
            i2 = i;
            charSequence2 = charSequence;
            j4 = j2;
            pendingTrace = pendingTrace2;
            map3 = map7;
            str2 = null;
            obj = null;
            obj2 = null;
            obj3 = null;
            map4 = map2;
            dDTraceId2 = dDTraceId;
        }
        PTagsFactory$PTags pTagsFactory$PTags = createValid;
        if (agentSpan$Context != null && agentSpan$Context.getPathwayContext() != null) {
            agentSpan$Context.getPathwayContext().getClass();
        }
        if (!((CoreTracer) pausedCompositionImpl.pausableApplier).allowInferredServices) {
            DDSpan dDSpan = pendingTrace.rootSpan;
            pausedCompositionImpl.lock = dDSpan != null ? dDSpan.context.serviceName : null;
        }
        if (((String) pausedCompositionImpl.lock) == null) {
            pausedCompositionImpl.lock = ((CoreTracer) pausedCompositionImpl.pausableApplier).serviceName;
        }
        String str5 = (String) pausedCompositionImpl.context;
        LinkedHashMap linkedHashMap = (LinkedHashMap) pausedCompositionImpl.content;
        int size = ((CoreTracer) pausedCompositionImpl.pausableApplier).defaultSpanTags.size() + (linkedHashMap == null ? 0 : linkedHashMap.size()) + (map == null ? 0 : map.size()) + (map3 == null ? 0 : map3.size());
        PendingTrace pendingTrace3 = pendingTrace;
        String str6 = (String) pausedCompositionImpl.lock;
        String str7 = (String) pausedCompositionImpl.state;
        CoreTracer coreTracer2 = (CoreTracer) pausedCompositionImpl.pausableApplier;
        DDSpanContext dDSpanContext2 = new DDSpanContext(dDTraceId2, nonZeroPositiveLong, j4, str2, str6, str5, str7, i2, charSequence2, map4, size, pendingTrace3, obj, obj2, obj3, coreTracer2.disableSamplingMechanismValidation, pTagsFactory$PTags, coreTracer2.profilingContextIntegration);
        dDSpanContext2.setAllTags(((CoreTracer) pausedCompositionImpl.pausableApplier).defaultSpanTags);
        dDSpanContext2.setAllTags((LinkedHashMap) pausedCompositionImpl.content);
        dDSpanContext2.setAllTags(map);
        dDSpanContext2.setAllTags(map3);
        DDSpan dDSpan2 = new DDSpan(str, j5, dDSpanContext2, (ArrayList) pausedCompositionImpl.invalidScopes, ((CoreTracer) pausedCompositionImpl.composer).internalLogger);
        pendingTrace3.registerSpan(dDSpan2);
        if (pendingTrace3.rootSpan.equals(dDSpan2)) {
            ((CoreTracer) pausedCompositionImpl.composer).onRootSpanStarted(dDSpan2);
            if (pendingTrace3.rootSpan == null) {
                zbc zbcVar = dDSpan2.log;
                ((zzlj) ((InternalLogger) zbcVar.zba)).log(4, InternalLogger.Target.USER, (Function0) new DatadogCoreTracerLogger$$ExternalSyntheticLambda2(zbcVar, "Span {} has no associated local root span", dDSpan2, 1), (Throwable) null, false, (Map) null);
            }
        }
        return new DatadogSpanAdapter(dDSpan2, (zza) this.zbb);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Bundle bundle;
        int i = 1;
        zzgc zzgcVar = null;
        switch (this.$r8$classId) {
            case 7:
                Rpc rpc = (Rpc) this.zba;
                Bundle bundle2 = (Bundle) this.zbb;
                rpc.getClass();
                return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? rpc.zze(bundle2).onSuccessTask(zzy.zza, zzx.zza) : task;
            case 14:
                zzbj zzbjVar = (zzbj) this.zba;
                zzah zzahVar = (zzah) this.zbb;
                if (task.isSuccessful()) {
                    return Room.forResult(new zzbi(zzbjVar, (zzax) task.getResult(), new zzs(zzhk.zza, new zzcb("ShareableTimeSignalSupplierAdapter"), i)));
                }
                zzahVar.zzb();
                synchronized (zzbjVar.zzc) {
                    zzbjVar.zzd = null;
                    zzbjVar.zze = 0;
                }
                return com.google.android.gms.internal.time.zzcw.zza(task);
            case 24:
                ((zbc) ((e0) this.zba).i).zzo((zze) this.zbb, 2);
                "IsOpenFetchPlace".concat("Duration");
                "IsOpenFetchPlace".concat("Battery");
                return (zzf) task.getResult();
            default:
                e0 e0Var = (e0) this.zba;
                zzt zztVar = (zzt) this.zbb;
                zzns zznsVar = zzns.zzc;
                zbc zbcVar = (zbc) e0Var.i;
                zzavp zza$1 = zzavt.zza$1();
                zza$1.zzy();
                ((zzavt) zza$1.zza).zzd(false);
                zzavb zza = zzavc.zza();
                ArrayList zza2 = zzjp.zza(zztVar.zzh);
                zza.zzy();
                ((zzavc) zza.zza).zzc(zza2);
                zzavc zzavcVar = (zzavc) zza.zzD();
                zza$1.zzy();
                ((zzavt) zza$1.zza).zzi(zzavcVar);
                zza$1.zzy();
                ((zzavt) zza$1.zza).zzp$1(1);
                zza$1.zzy();
                ((zzavt) zza$1.zza).zzh(false);
                zza$1.zzy();
                ((zzavt) zza$1.zza).zzl(false);
                zza$1.zzy();
                ((zzavt) zza$1.zza).zzn();
                zza$1.zzy();
                ((zzavt) zza$1.zza).zzm(false);
                ArrayList arrayList = new ArrayList();
                for (Integer num : zztVar.zzi) {
                    if (num != null) {
                        arrayList.add(num);
                    }
                }
                zza$1.zzy();
                ((zzavt) zza$1.zza).zzg(arrayList);
                zzavg zzq = zbcVar.zzq();
                zzq.zzy();
                ((zzavi) zzq.zza).zzk(2);
                zzavt zzavtVar = (zzavt) zza$1.zzD();
                zzq.zzy();
                ((zzavi) zzq.zza).zzg(zzavtVar);
                zzavi zzaviVar = (zzavi) zzq.zzD();
                zzatp zzb = zzey.zzb((zznq) zbcVar.zbb, 3, zznsVar, zzd.zza);
                zzb.zzp$2(1);
                zzb.zzy();
                ((zzatw) zzb.zza).zzd(zzaviVar);
                zzb.zzj(Places.zza.zze());
                ((zbc) zbcVar.zba).zzb(zzb);
                "SearchByText".concat("Duration");
                "SearchByText".concat("Battery");
                String str = ((zzv) task.getResult()).zzd;
                List list = ((zzv) task.getResult()).zza;
                com.google.android.libraries.places.api.net.zzu zzuVar = new com.google.android.libraries.places.api.net.zzu();
                if (list == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Null places");
                    return null;
                }
                zzuVar.zza = list;
                zzuVar.zze = 1;
                zzuVar.zzg = (byte) 1;
                if (str != null) {
                    int i2 = ((zzv) task.getResult()).zze;
                    zzgcVar = new zzgc(13);
                }
                zzuVar.zzc = zzgcVar;
                zzuVar.zzd = str;
                zzuVar.zzb = ((zzv) task.getResult()).zzb;
                zzuVar.zzf = ((zzv) task.getResult()).zzf;
                return zzuVar.build();
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 18:
                return (String) this.zbb;
            default:
                return super.toString();
        }
    }

    @Override // com.datadog.trace.logger.Logger
    public void warn(String str, Object... objArr) {
        InternalLogger internalLogger = (InternalLogger) this.zba;
        ((zzlj) internalLogger).log(4, InternalLogger.Target.USER, (Function0) new n$$ExternalSyntheticLambda1(27, this, str, objArr), (Throwable) null, false, (Map) null);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder withOrigin(String str) {
        ((PausedCompositionImpl) this.zba).rememberManager = str;
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder withParentContext(DatadogSpanContext datadogSpanContext) {
        if (datadogSpanContext instanceof DatadogSpanContextAdapter) {
            ((PausedCompositionImpl) this.zba).applier = ((DatadogSpanContextAdapter) datadogSpanContext).delegate;
        }
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder withResourceName(String str) {
        ((PausedCompositionImpl) this.zba).state = str;
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder withStartTimestamp(long j) {
        ((PausedCompositionImpl) this.zba).owningThread = j;
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder withTag(Object obj, String str) {
        str.getClass();
        PausedCompositionImpl pausedCompositionImpl = (PausedCompositionImpl) this.zba;
        LinkedHashMap linkedHashMap = (LinkedHashMap) pausedCompositionImpl.content;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            pausedCompositionImpl.content = linkedHashMap;
        }
        if (obj == null) {
            linkedHashMap.remove(str);
            return this;
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbru
    public void zza(zzbpr zzbprVar) {
        zzbrt zzbrlVar;
        switch (this.$r8$classId) {
            case 20:
                zzcdj zzcdjVar = (zzcdj) this.zbb;
                boolean z = zzcdjVar.zzr;
                zzfz zzfzVar = zzcdjVar.zzl;
                if (!z) {
                    zzcdj.zzh.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{zzbprVar, ((zzcdh) this.zba).zza});
                    ((zzcdh) this.zba).zzd = zzbprVar;
                    if (zzfzVar.zza() && ((zzcdh) this.zba) == zzcdjVar.zzk.get(zzfzVar.zzd())) {
                        zzcdjVar.zzr((zzcdh) this.zba);
                        break;
                    }
                } else {
                    zzcdj.zzh.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{zzbprVar, ((zzcdh) this.zba).zza});
                    break;
                }
                break;
            default:
                zzcdo zzcdoVar = (zzcdo) this.zbb;
                zzbrs zzbrsVar = (zzbrs) this.zba;
                zzcdoVar.getClass();
                zzbrm zzbrmVar = zzcdoVar.zzf;
                zzbpq zzbpqVar = zzbprVar.zza;
                if (zzbpqVar != zzbpq.zze) {
                    zzbpq zzbpqVar2 = zzbpq.zzd;
                    zzbpq zzbpqVar3 = zzbpq.zzc;
                    if (zzbpqVar == zzbpqVar3 || zzbpqVar == zzbpqVar2) {
                        zzbrmVar.zzc();
                    }
                    if (zzcdoVar.zzh == zzbpqVar3) {
                        if (zzbpqVar != zzbpq.zza) {
                            if (zzbpqVar == zzbpqVar2) {
                                zzcdoVar.zzd();
                                break;
                            }
                        }
                    }
                    int ordinal = zzbpqVar.ordinal();
                    if (ordinal == 0) {
                        zzbrlVar = new zzbrl(zzbro.zza);
                    } else if (ordinal == 1) {
                        Trace.checkNotNull(zzbrsVar, "subchannel");
                        zzbrlVar = new zzbrl(new zzbro(zzbrsVar, zzbtx.zza, false));
                    } else if (ordinal == 2) {
                        zzbrlVar = new zzbrl(zzbro.zzb(zzbprVar.zzb));
                    } else if (ordinal != 3) {
                        a$$ExternalSyntheticBUOutline0.m$3("Unsupported state:".concat(String.valueOf(zzbpqVar)));
                        break;
                    } else {
                        zzbrlVar = new zzcdn(zzcdoVar);
                    }
                    zzcdoVar.zzh = zzbpqVar;
                    zzbrmVar.zzb(zzbpqVar, zzbrlVar);
                    break;
                }
                break;
        }
    }

    public void zzb(zzatp zzatpVar) {
        zzfp zzfpVar = (zzfp) this.zbb;
        boolean z = false;
        AbstractTransformFuture.TransformFuture transform = Futures.transform(zzfpVar.zzc, new zzfl(0), zzfpVar.zzb);
        transform.addListener(new com.google.mlkit.common.sdkinternal.zzb(transform, new Result(this, zzatpVar, z, 3), z, 15), DirectExecutor.INSTANCE);
    }

    public void zzc(int i, int i2, zzcje zzcjeVar) {
        if (zzl()) {
            java.util.logging.Logger logger = (java.util.logging.Logger) this.zba;
            Level level = (Level) this.zbb;
            String zza = zzjn.zza(i);
            String valueOf = String.valueOf(zzcjeVar);
            StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(zza.length() + 22, 11, String.valueOf(i2)) + valueOf.length());
            Boxes$$ExternalSyntheticOutline1.m(sb, zza, " RST_STREAM: streamId=", i2, " errorCode=");
            sb.append(valueOf);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", sb.toString());
        }
    }

    public IdentityHashMap zzd(int i) {
        if (((IdentityHashMap) this.zbb) == null) {
            IdentityHashMap identityHashMap = new IdentityHashMap(((zzbor) this.zba).zzb.size() + i);
            this.zbb = identityHashMap;
            identityHashMap.putAll(((zzbor) this.zba).zzb);
            this.zba = null;
        }
        return (IdentityHashMap) this.zbb;
    }

    public void zze(int i, zzcjt zzcjtVar) {
        if (zzl()) {
            java.util.logging.Logger logger = (java.util.logging.Logger) this.zba;
            Level level = (Level) this.zbb;
            String zza = zzjn.zza(i);
            EnumMap enumMap = new EnumMap(zzcia.class);
            for (zzcia zzciaVar : zzcia.values()) {
                int i2 = zzciaVar.zzg;
                if ((zzcjtVar.zza & (1 << i2)) != 0) {
                    enumMap.put((EnumMap) zzciaVar, (zzcia) Integer.valueOf(zzcjtVar.zzb[i2]));
                }
            }
            String obj = enumMap.toString();
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(zza.length() + 30 + String.valueOf(obj).length()), zza, " SETTINGS: ack=false settings=", obj));
        }
    }

    public void zzi(int i, int i2, zzcje zzcjeVar, zzcls zzclsVar) {
        if (zzl()) {
            java.util.logging.Logger logger = (java.util.logging.Logger) this.zba;
            Level level = (Level) this.zbb;
            String zza = zzjn.zza(i);
            String valueOf = String.valueOf(zzcjeVar);
            int zzj = zzclsVar.zzj();
            zzclo zzcloVar = new zzclo();
            zzclsVar.zzm(zzcloVar, zzclsVar.zzj());
            String zzk = zzk(zzcloVar);
            StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(zza.length() + 23, 11, String.valueOf(i2)) + valueOf.length() + 8 + String.valueOf(zzj).length() + 7 + String.valueOf(zzk).length());
            Boxes$$ExternalSyntheticOutline1.m(sb, zza, " GO_AWAY: lastStreamId=", i2, " errorCode=");
            Boxes$$ExternalSyntheticOutline1.m(sb, valueOf, " length=", zzj, " bytes=");
            sb.append(zzk);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", sb.toString());
        }
    }

    public void zzj(int i, int i2, long j) {
        if (zzl()) {
            java.util.logging.Logger logger = (java.util.logging.Logger) this.zba;
            Level level = (Level) this.zbb;
            String zza = zzjn.zza(i);
            String valueOf = String.valueOf(i2);
            StringBuilder sb = new StringBuilder(zza.length() + 25 + valueOf.length() + 21 + String.valueOf(j).length());
            Boxes$$ExternalSyntheticOutline1.m(sb, zza, " WINDOW_UPDATE: streamId=", i2, " windowSizeIncrement=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", sb.toString());
        }
    }

    public void zzk(zzk zzkVar, int i, zzns zznsVar) {
        zzari zza$1 = zzarj.zza$1();
        List<String> list = zzkVar.zzg;
        if (!list.isEmpty()) {
            for (String str : list) {
                zza$1.zzy();
                ((zzarj) zza$1.zza).zzc(str);
            }
        }
        zzarj zzarjVar = (zzarj) zza$1.zzD();
        zzasz zza$12 = zzata.zza$1();
        zza$12.zzy();
        ((zzata) zza$12.zza).zzc(zzarjVar);
        zzata zzataVar = (zzata) zza$12.zzD();
        zzavg zzq = zzq();
        zzq.zzy();
        ((zzavi) zzq.zza).zzk(6);
        zzq.zzy();
        ((zzavi) zzq.zza).zzf(zzataVar);
        zzavi zzaviVar = (zzavi) zzq.zzD();
        zzatp zzb = zzey.zzb((zznq) this.zbb, i, zznsVar, zzd.zza);
        zzb.zzp$2(1);
        zzb.zzy();
        ((zzatw) zzb.zza).zzd(zzaviVar);
        zzb.zzj(Places.zza.zze());
        zzdi zzdiVar = zzkVar.zzf;
        if (zzdiVar != null) {
            String zzdiVar2 = zzdiVar.toString();
            zzb.zzy();
            ((zzatw) zzb.zza).zzj$1(zzdiVar2);
        }
        ((zbc) this.zba).zzb(zzb);
    }

    public void zzl(Task task, long j, long j2, int i, zzns zznsVar, zzd zzdVar) {
        int size = task.isSuccessful() ? ((zzl) task.getResult()).zza.size() : 0;
        zzaqd zza$1 = zzaqe.zza$1();
        zza$1.zzy();
        ((zzaqe) zza$1.zza).zzc(size);
        zzaqe zzaqeVar = (zzaqe) zza$1.zzD();
        zzaqq zza = zzaqv.zza();
        zza.zzf(6);
        zza.zzy();
        ((zzaqv) zza.zza).zzf(zzaqeVar);
        zza.zzg(zzp(task));
        zza.zza((int) (j2 - j));
        zzt((zzaqv) zza.zzD(), i, zznsVar, zzdVar);
    }

    public void zzm(zze zzeVar, int i, zzns zznsVar) {
        zzaub zza = zzauc.zza();
        zza.zzy();
        ((zzauc) zza.zza).zzc(1);
        zzavb zza2 = zzavc.zza();
        ArrayList zza3 = zzjp.zza(zzeVar.zzb);
        zza2.zzy();
        ((zzavc) zza2.zza).zzc(zza3);
        zzavc zzavcVar = (zzavc) zza2.zzD();
        zza.zzy();
        ((zzauc) zza.zza).zzd(zzavcVar);
        zzauc zzaucVar = (zzauc) zza.zzD();
        zzavg zzq = zzq();
        zzq.zzy();
        ((zzavi) zzq.zza).zzk(5);
        zzq.zzy();
        ((zzavi) zzq.zza).zze(zzaucVar);
        zzavi zzaviVar = (zzavi) zzq.zzD();
        zzatp zzb = zzey.zzb((zznq) this.zbb, i, zznsVar, zzd.zza);
        zzb.zzp$2(1);
        zzb.zzy();
        ((zzatw) zzb.zza).zzd(zzaviVar);
        zzb.zzj(Places.zza.zze());
        zzdi zzdiVar = zzeVar.zzc;
        if (zzdiVar != null) {
            String zzdiVar2 = zzdiVar.toString();
            zzb.zzy();
            ((zzatw) zzb.zza).zzj$1(zzdiVar2);
        }
        ((zbc) this.zba).zzb(zzb);
    }

    public void zzn(Task task, long j, long j2, int i, zzns zznsVar, zzd zzdVar) {
        boolean isSuccessful = task.isSuccessful();
        zzaqi zza$1 = zzaqj.zza$1();
        zza$1.zzy();
        ((zzaqj) zza$1.zza).zzc(1);
        zza$1.zzy();
        ((zzaqj) zza$1.zza).zzd(isSuccessful ? 1 : 0);
        zzaqj zzaqjVar = (zzaqj) zza$1.zzD();
        zzaqq zza = zzaqv.zza();
        zza.zzf(8);
        zza.zzy();
        ((zzaqv) zza.zza).zzd(zzaqjVar);
        zza.zzg(zzp(task));
        zza.zza((int) (j2 - j));
        zzt((zzaqv) zza.zzD(), i, zznsVar, zzdVar);
    }

    public void zzo(zze zzeVar, int i) {
        zzaub zza = zzauc.zza();
        zza.zzy();
        ((zzauc) zza.zza).zzc(1);
        zzavb zza2 = zzavc.zza();
        ArrayList zza3 = zzjp.zza(zzeVar.zzb);
        zza2.zzy();
        ((zzavc) zza2.zza).zzc(zza3);
        zzavc zzavcVar = (zzavc) zza2.zzD();
        zza.zzy();
        ((zzauc) zza.zza).zzd(zzavcVar);
        zzauc zzaucVar = (zzauc) zza.zzD();
        zzavg zzq = zzq();
        zzq.zzy();
        ((zzavi) zzq.zza).zzk(5);
        zzq.zzy();
        ((zzavi) zzq.zza).zzi(zzaucVar);
        zzavi zzaviVar = (zzavi) zzq.zzD();
        zzatp zzb = zzey.zzb((zznq) this.zbb, i, zzns.zzc, zzd.zza);
        zzb.zzp$2(1);
        zzb.zzy();
        ((zzatw) zzb.zza).zzd(zzaviVar);
        zzb.zzj(Places.zza.zze());
        ((zbc) this.zba).zzb(zzb);
    }

    public zzavg zzq() {
        Locale zzf = Places.zza.zzf();
        Locale locale = Locale.getDefault();
        zzavg zza$1 = zzavi.zza$1();
        String languageTag = zzf.toLanguageTag();
        zza$1.zzy();
        ((zzavi) zza$1.zza).zzc(languageTag);
        if (!zzf.equals(locale)) {
            String languageTag2 = locale.toLanguageTag();
            zza$1.zzy();
            ((zzavi) zza$1.zza).zzd(languageTag2);
        }
        return zza$1;
    }

    public void zzt(zzaqv zzaqvVar, int i, zzns zznsVar, zzd zzdVar) {
        zzatp zzb = zzey.zzb((zznq) this.zbb, i, zznsVar, zzdVar);
        zzb.zzp$2(16);
        zzb.zzy();
        ((zzatw) zzb.zza).zzh(zzaqvVar);
        zzb.zzj(Places.zza.zze());
        ((zbc) this.zba).zzb(zzb);
    }

    public zzbor zzc() {
        if (((IdentityHashMap) this.zbb) != null) {
            this.zba = new zzbor((IdentityHashMap) this.zbb, 0);
            this.zbb = null;
        }
        return (zzbor) this.zba;
    }

    public void zzc(zzatp zzatpVar) {
        zzatw zzatwVar = (zzatw) zzatpVar.zzD();
        zzabi zza$1 = zzabk.zza$1();
        zza$1.zzy();
        ((zzabk) zza$1.zza).zze(1);
        zza$1.zzy();
        ((zzabk) zza$1.zza).zzc(zzatwVar);
        ((TransportImpl) this.zba).send(AutoValue_Event.ofData((zzabk) zza$1.zzD(), new AutoValue_ProductData(79508299)));
    }

    public boolean zzl() {
        return ((java.util.logging.Logger) this.zba).isLoggable((Level) this.zbb);
    }

    public /* synthetic */ zbc(int i, boolean z) {
        this.$r8$classId = i;
    }

    public /* synthetic */ zbc(e0 e0Var, zznk zznkVar, zzgb zzgbVar, int i) {
        this.$r8$classId = i;
        this.zba = e0Var;
        this.zbb = zznkVar;
    }

    public /* synthetic */ zbc(zzbor zzborVar) {
        this.$r8$classId = 17;
        this.zba = zzborVar;
    }

    public /* synthetic */ zbc(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.zba = obj;
        this.zbb = obj2;
    }

    public zbc(com.google.android.gms.maps.zzah zzahVar) {
        this.$r8$classId = 13;
        this.zbb = new RequestQueue();
        this.zba = zzahVar;
        zzmw.zza();
    }

    public /* synthetic */ zbc(zzcdj zzcdjVar) {
        this.$r8$classId = 20;
        this.zbb = zzcdjVar;
    }

    public zbc(PausedCompositionImpl pausedCompositionImpl, zza zzaVar) {
        this.$r8$classId = 2;
        zzaVar.getClass();
        this.zba = pausedCompositionImpl;
        this.zbb = zzaVar;
    }

    public zbc(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 22:
                Level level = Level.FINE;
                java.util.logging.Logger logger = java.util.logging.Logger.getLogger(zzchy.class.getName());
                Trace.checkNotNull(level, "level");
                this.zbb = level;
                Trace.checkNotNull(logger, "logger");
                this.zba = logger;
                break;
            default:
                this.zba = new com.google.mlkit.vision.text.zzb(2);
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                this.zbb = emptyMap;
                break;
        }
    }

    public /* synthetic */ zbc(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.zba = obj2;
        this.zbb = obj;
    }

    public zbc(Context context) {
        this.$r8$classId = 6;
        this.zbb = null;
        this.zba = context;
    }

    public zbc(double d) {
        this.$r8$classId = 3;
        this.zbb = new HashMap(0);
        this.zba = new DeterministicSampler$TraceSampler((d < 0.0d || d > 1.0d) ? 1.0d : d);
    }

    public static String zzk(zzclo zzcloVar) {
        long j = zzcloVar.zzb;
        if (j <= 64) {
            return zzcloVar.zzF().zzg();
        }
        return String.valueOf(zzcloVar.zzG((int) Math.min(j, 64L)).zzg()).concat("...");
    }

    public void zza(int i, int i2, zzclo zzcloVar, int i3, boolean z) {
        if (zzl()) {
            java.util.logging.Logger logger = (java.util.logging.Logger) this.zba;
            Level level = (Level) this.zbb;
            String zza = zzjn.zza(i);
            String zzk = zzk(zzcloVar);
            String valueOf = String.valueOf(i2);
            StringBuilder sb = new StringBuilder(zza.length() + 16 + valueOf.length() + 11 + String.valueOf(z).length() + 8 + String.valueOf(i3).length() + 7 + String.valueOf(zzk).length());
            Boxes$$ExternalSyntheticOutline1.m(sb, zza, " DATA: streamId=", i2, " endStream=");
            sb.append(z);
            sb.append(" length=");
            sb.append(i3);
            sb.append(" bytes=");
            sb.append(zzk);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logData", sb.toString());
        }
    }

    public void zza(zzboq zzboqVar, Object obj) {
        zzd(1).put(zzboqVar, obj);
    }

    public zzw zza(zzbb zzbbVar, Class cls) {
        TaskCompletionSource taskCompletionSource;
        String zzf = zzbbVar.zzf();
        HashMap zze = zzbbVar.zze();
        zzb cancellationToken = ((zznk) zzbbVar.zza).getCancellationToken();
        if (cancellationToken != null) {
            taskCompletionSource = new TaskCompletionSource(cancellationToken);
        } else {
            taskCompletionSource = new TaskCompletionSource();
        }
        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
        zzlh zzlhVar = new zzlh(this, zzf, new com.google.android.gms.maps.zzah(26, this, cls, taskCompletionSource2), new zzli(0, taskCompletionSource2), zze);
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new zzfv(zzlhVar, 13));
        }
        ((RequestQueue) this.zba).add(zzlhVar);
        return taskCompletionSource2.zza;
    }
}
