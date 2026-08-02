package coil3.request;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import androidx.credentials.CredentialProviderFactory;
import app.cash.zipline.CallResult;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.toolbox.HurlStack;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.util.GlideSuppliers$GlideSupplier;
import com.bumptech.glide.util.Util;
import com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.trace.relocate.api.RatelimitedLogger;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.zzab;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.zzd;
import com.google.android.gms.common.zzj;
import com.google.android.gms.common.zzk;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzy;
import com.google.android.gms.common.zzz;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzaj;
import com.google.android.gms.internal.common.zzc;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import radiography.Radiography$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class ViewTargetDisposable implements Disposable, GlideSuppliers$GlideSupplier, ConsentProvider {
    public static ViewTargetDisposable zza;
    public volatile Object job;
    public final Object view;

    public ViewTargetDisposable() {
        TrackingConsent trackingConsent = TrackingConsent.PENDING;
        this.view = new LinkedList();
        this.job = trackingConsent;
    }

    public static ViewTargetDisposable getInstance(Context context) {
        zzae.checkNotNull(context);
        synchronized (ViewTargetDisposable.class) {
            if (zza == null) {
                zzd zzdVar = zzo.zze;
                synchronized (zzo.class) {
                    if (zzo.zzj == null) {
                        zzo.zzj = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                zza = new ViewTargetDisposable(context);
            }
        }
        return zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[Catch: IllegalArgumentException -> 0x00cf, TryCatch #0 {IllegalArgumentException -> 0x00cf, blocks: (B:17:0x002b, B:18:0x0030, B:20:0x0034, B:22:0x003a, B:25:0x0041, B:27:0x004f, B:34:0x0078, B:35:0x0074, B:37:0x0061, B:39:0x0067, B:43:0x007e, B:44:0x0085, B:48:0x0088, B:49:0x0095, B:51:0x009b, B:53:0x00a6, B:54:0x00b0, B:56:0x00b8, B:65:0x00c7, B:66:0x00ce, B:67:0x008b, B:68:0x0091, B:69:0x002e), top: B:15:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7 A[Catch: IllegalArgumentException -> 0x00cf, TryCatch #0 {IllegalArgumentException -> 0x00cf, blocks: (B:17:0x002b, B:18:0x0030, B:20:0x0034, B:22:0x003a, B:25:0x0041, B:27:0x004f, B:34:0x0078, B:35:0x0074, B:37:0x0061, B:39:0x0067, B:43:0x007e, B:44:0x0085, B:48:0x0088, B:49:0x0095, B:51:0x009b, B:53:0x00a6, B:54:0x00b0, B:56:0x00b8, B:65:0x00c7, B:66:0x00ce, B:67:0x008b, B:68:0x0091, B:69:0x002e), top: B:15:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zza(PackageInfo packageInfo, boolean z) {
        zzaj zzajVar;
        SigningInfo signingInfo;
        zzaj zzajVar2;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 0) ? false : true;
            }
            try {
                zzajVar = z ? zzn.zzc : zzn.zzb;
                signingInfo = packageInfo.signingInfo;
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? zzc(packageInfo, zzn.zza) : zzc(packageInfo, zzn.zza[0])) != null) {
                }
            }
            if (signingInfo != null && !signingInfo.hasMultipleSigners() && signingInfo.getSigningCertificateHistory() != null) {
                com.google.android.gms.internal.common.zzae zzaeVar = zzah.zza;
                Object[] objArr = new Object[4];
                Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                int length = signingCertificateHistory.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    byte[] byteArray = signingCertificateHistory[i2].toByteArray();
                    byteArray.getClass();
                    int length2 = objArr.length;
                    int i4 = i3 + 1;
                    if (i4 < 0) {
                        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                    }
                    if (i4 <= length2) {
                        i = length2;
                    } else {
                        i = (length2 >> 1) + length2 + 1;
                        if (i < i4) {
                            int highestOneBit = Integer.highestOneBit(i3);
                            i = highestOneBit + highestOneBit;
                        }
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                    if (i > length2) {
                        objArr = Arrays.copyOf(objArr, i);
                    }
                    objArr[i3] = byteArray;
                    i2++;
                    i3 = i4;
                }
                zzajVar2 = i3 == 0 ? zzaj.zza : new zzaj(i3, objArr);
                if (!zzajVar2.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                zzah zzh = zzajVar2.zzh();
                int size = zzh.size();
                int i5 = 0;
                while (i5 < size) {
                    byte[] bArr = (byte[]) zzh.get(i5);
                    com.google.android.gms.internal.common.zzae listIterator = zzajVar.listIterator(0);
                    do {
                        int i6 = i5 + 1;
                        if (listIterator.hasNext()) {
                        }
                    } while (!Arrays.equals(bArr, (byte[]) listIterator.next()));
                    return true;
                }
            }
            com.google.android.gms.internal.common.zzae zzaeVar2 = zzah.zza;
            zzajVar2 = zzaj.zza;
            if (!zzajVar2.isEmpty()) {
            }
        }
        return false;
    }

    public static zzj zzc(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzjVarArr.length; i++) {
                if (zzjVarArr[i].equals(zzkVar)) {
                    return zzjVarArr[i];
                }
            }
        }
        return null;
    }

    @Override // coil3.request.Disposable
    public void dispose() {
        boolean z;
        ViewTargetRequestManager requestManager = ViewTargetRequestManagerKt.getRequestManager((View) this.view);
        synchronized (requestManager) {
            z = this != requestManager.currentDisposable;
        }
        if (z) {
            return;
        }
        ViewTargetRequestManagerKt.getRequestManager((View) this.view).dispose();
    }

    @Override // com.bumptech.glide.util.GlideSuppliers$GlideSupplier
    public Object get() {
        if (this.job == null) {
            synchronized (this) {
                try {
                    if (this.job == null) {
                        Object obj = ((GlideSuppliers$GlideSupplier) this.view).get();
                        Util.checkNotNull(obj, "Argument must not be null");
                        this.job = obj;
                    }
                } finally {
                }
            }
        }
        return this.job;
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public TrackingConsent getConsent() {
        return (TrackingConsent) this.job;
    }

    public DiskCache getDiskCache() {
        if (((DiskCache) this.job) == null) {
            synchronized (this) {
                try {
                    if (((DiskCache) this.job) == null) {
                        File cacheDir = ((CredentialProviderFactory) ((OneShotDisposable) this.view).job).context.getCacheDir();
                        RatelimitedLogger ratelimitedLogger = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            ratelimitedLogger = new RatelimitedLogger();
                            ratelimitedLogger.timeSource = new CallResult(24);
                            ratelimitedLogger.noLogMessage = file;
                            ratelimitedLogger.delayNanos = 262144000L;
                            ratelimitedLogger.log = new AndroidSvg(20);
                        }
                        this.job = ratelimitedLogger;
                    }
                    if (((DiskCache) this.job) == null) {
                        this.job = new HurlStack(19);
                    }
                } finally {
                }
            }
        }
        return (DiskCache) this.job;
    }

    @Override // coil3.request.Disposable
    public Deferred getJob() {
        return (DeferredCoroutine) this.job;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01e0 A[LOOP:0: B:6:0x001a->B:13:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01f3 A[EDGE_INSN: B:14:0x01f3->B:15:0x01f3 BREAK  A[LOOP:0: B:6:0x001a->B:13:0x01e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isUidGoogleSigned(int i) {
        zzy zzc;
        int length;
        PackageInfo packageInfo;
        boolean honorsDebugCertificates;
        ApplicationInfo applicationInfo;
        boolean zzg;
        String[] packagesForUid = ((Context) this.view).getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            zzc = zzy.zzc("no pkgs");
        } else {
            zzc = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    zzae.checkNotNull(zzc);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    zzc = zzy.zzc("null pkg");
                } else if (str.equals((String) this.job)) {
                    zzc = zzy.zze;
                } else {
                    zzd zzdVar = zzo.zze;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        zzo.zzb();
                        zzg = ((zzab) zzo.zzg).zzg();
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (RemoteException | DynamiteModule.LoadingException e) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    } finally {
                    }
                    if (zzg) {
                        boolean honorsDebugCertificates2 = GooglePlayServicesUtilLight.honorsDebugCertificates((Context) this.view);
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            zzae.checkNotNull(zzo.zzj);
                            try {
                                zzo.zzb();
                                zzae.checkNotNull(zzo.zzj);
                                Context context = (Context) ObjectWrapper.unwrap(ObjectWrapper.asInterface(new ObjectWrapper(zzo.zzj)));
                                try {
                                    zzab zzabVar = (zzab) zzo.zzg;
                                    Parcel zza2 = zzabVar.zza();
                                    int i3 = zzc.$r8$clinit;
                                    zza2.writeInt(1);
                                    int zzb = MooncakeHeaderViewKt.zzb(zza2, 20293);
                                    MooncakeHeaderViewKt.writeString(zza2, 1, str);
                                    MooncakeHeaderViewKt.zza(zza2, 2, 4);
                                    zza2.writeInt(honorsDebugCertificates2 ? 1 : 0);
                                    MooncakeHeaderViewKt.zza(zza2, 3, 4);
                                    zza2.writeInt(0);
                                    MooncakeHeaderViewKt.writeIBinder(zza2, 4, new ObjectWrapper(context));
                                    MooncakeHeaderViewKt.zza(zza2, 5, 4);
                                    zza2.writeInt(0);
                                    MooncakeHeaderViewKt.zza(zza2, 6, 4);
                                    zza2.writeInt(1);
                                    MooncakeHeaderViewKt.zza(zza2, 8, 4);
                                    zza2.writeInt(0);
                                    MooncakeHeaderViewKt.zzc(zza2, zzb);
                                    Parcel zzB = zzabVar.zzB(zza2, 6);
                                    zzr zzrVar = (zzr) zzc.zzb(zzB, zzr.CREATOR);
                                    zzB.recycle();
                                    if (zzrVar.zza) {
                                        com.google.android.gms.common.zzc.zza(zzrVar.zzd);
                                        zzc = new zzy(true, null, null);
                                    } else {
                                        String str2 = zzrVar.zzb;
                                        PackageManager.NameNotFoundException nameNotFoundException = zzz.zza(zzrVar.zzc) == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        com.google.android.gms.common.zzc.zza(zzrVar.zzd);
                                        zzz.zza(zzrVar.zzc);
                                        zzc = new zzy(false, str2, nameNotFoundException);
                                    }
                                } catch (RemoteException e2) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                    zzc = zzy.zzd(e2, "module call");
                                }
                            } catch (DynamiteModule.LoadingException e3) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                                zzc = zzy.zzd(e3, "module init: ".concat(String.valueOf(e3.getMessage())));
                            }
                            if (zzc.zza) {
                                this.job = str;
                            }
                            if (!zzc.zza) {
                                break;
                            }
                            i2++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        try {
                            packageInfo = ((Context) this.view).getPackageManager().getPackageInfo(str, 134217792);
                            honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates((Context) this.view);
                        } catch (PackageManager.NameNotFoundException e4) {
                            zzc = zzy.zzd(e4, "no pkg ".concat(str));
                        }
                        if (packageInfo == null) {
                            zzc = zzy.zzc("null pkg");
                            if (zzc.zza) {
                            }
                            if (!zzc.zza) {
                            }
                        } else {
                            Signature[] signatureArr = packageInfo.signatures;
                            if (signatureArr == null || signatureArr.length != 1) {
                                zzc = zzy.zzc("single cert required");
                            } else {
                                zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                                String str3 = packageInfo.packageName;
                                StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                try {
                                    zzy zzf = zzo.zzf(str3, zzkVar, honorsDebugCertificates, false);
                                    StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                    if (zzf.zza && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                        StrictMode.ThreadPolicy allowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                        try {
                                            zzy zzf2 = zzo.zzf(str3, zzkVar, false, true);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                            if (zzf2.zza) {
                                                zzc = zzy.zzc("debuggable release cert app rejected");
                                            }
                                        } finally {
                                        }
                                    }
                                    zzc = zzf;
                                } finally {
                                }
                            }
                            if (zzc.zza) {
                            }
                            if (!zzc.zza) {
                            }
                        }
                    }
                }
                if (!zzc.zza) {
                }
            }
        }
        if (!zzc.zza && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th2 = zzc.zzc;
            if (th2 != null) {
                Log.d("GoogleCertificatesRslt", zzc.zza(), th2);
            } else {
                Log.d("GoogleCertificatesRslt", zzc.zza());
            }
        }
        return zzc.zza;
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public synchronized void registerCallback(ConsentAwareFileOrchestrator consentAwareFileOrchestrator) {
        ((LinkedList) this.view).add(consentAwareFileOrchestrator);
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public synchronized void setConsent() {
        TrackingConsent trackingConsent = TrackingConsent.GRANTED;
        synchronized (this) {
            if (trackingConsent == ((TrackingConsent) this.job)) {
                return;
            }
            TrackingConsent trackingConsent2 = (TrackingConsent) this.job;
            this.job = trackingConsent;
            for (ConsentAwareFileOrchestrator consentAwareFileOrchestrator : (LinkedList) this.view) {
                consentAwareFileOrchestrator.getClass();
                TrackingConsent trackingConsent3 = TrackingConsent.GRANTED;
                trackingConsent2.getClass();
                zzho.executeSafe(consentAwareFileOrchestrator.executorService, "Data migration", consentAwareFileOrchestrator.internalLogger, new Radiography$$ExternalSyntheticLambda0(consentAwareFileOrchestrator, trackingConsent2, consentAwareFileOrchestrator.resolveDelegateOrchestrator(trackingConsent2), trackingConsent3, consentAwareFileOrchestrator.resolveDelegateOrchestrator(trackingConsent3), 3));
            }
        }
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public synchronized void unregisterAllCallbacks() {
        ((LinkedList) this.view).clear();
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public synchronized void unregisterCallback(ConsentAwareFileOrchestrator consentAwareFileOrchestrator) {
        ((LinkedList) this.view).remove(consentAwareFileOrchestrator);
    }

    public ViewTargetDisposable(Context context) {
        this.view = context.getApplicationContext();
    }

    public /* synthetic */ ViewTargetDisposable(Object obj) {
        this.view = obj;
    }

    public ViewTargetDisposable(View view, DeferredCoroutine deferredCoroutine) {
        this.view = view;
        this.job = deferredCoroutine;
    }
}
