package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public class AdvertisingIdClient {
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;
    BlockingServiceConnection zza;
    zzf zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzi;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@18.2.0 */
    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        int i;
        int i2;
        AdvertisingIdClient advertisingIdClient = zzh;
        if (advertisingIdClient == null) {
            synchronized (zzg) {
                advertisingIdClient = zzh;
                if (advertisingIdClient == null) {
                    Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                    advertisingIdClient = new AdvertisingIdClient(context);
                    zzh = advertisingIdClient;
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        zzd zza = zzd.zza(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Info zzf = advertisingIdClient.zzf(-1);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            advertisingIdClient.zze(zzf, true, 0.0f, elapsedRealtime2, "", null);
            zza.zzc(35401, 0, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + elapsedRealtime2 + "ms");
            return zzf;
        } catch (Throwable th) {
            advertisingIdClient.zze(null, true, 0.0f, -1L, "", th);
            if (th instanceof IOException) {
                i = 1;
            } else if (th instanceof GooglePlayServicesNotAvailableException) {
                i = 9;
            } else if (th instanceof GooglePlayServicesRepairableException) {
                i = 16;
            } else {
                if (!(th instanceof IllegalStateException)) {
                    i2 = -1;
                    zza.zzc(35401, i2, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
                    throw th;
                }
                i = 8;
            }
            i2 = i;
            zza.zzc(35401, i2, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                Preconditions.checkNotNull(advertisingIdClient.zza);
                Preconditions.checkNotNull(advertisingIdClient.zzb);
                try {
                    zzd = advertisingIdClient.zzb.zzd();
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception", e);
                }
            }
            advertisingIdClient.zzb();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final Info zzf(int i) throws IOException {
        Info info;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            Preconditions.checkNotNull(this.zza);
            Preconditions.checkNotNull(this.zzb);
            try {
                info = new Info(this.zzb.zzc(), this.zzb.zze(true));
            } catch (RemoteException e) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                throw new IOException("Remote exception", e);
            }
        }
        zzb();
        return info;
    }

    protected final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzc(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzi == null || this.zza == null) {
                return;
            }
            try {
                if (this.zzc) {
                    ConnectionTracker.getInstance().unbindService(this.zzi, this.zza);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.zzc = false;
            this.zzb = null;
            this.zza = null;
        }
    }

    final void zzb() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new zzb(this, j);
            }
        }
    }

    protected final void zzc(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        if (z) {
            zzb();
        }
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            Context context = this.zzi;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                    throw new IOException("Google Play services not available");
                }
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.zza = blockingServiceConnection;
                    try {
                        this.zzb = com.google.android.gms.internal.ads_identifier.zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                        this.zzc = true;
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    final synchronized void zzd() throws IOException {
        if (!this.zzc) {
            try {
                Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                zzc(false);
                Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                if (!this.zzc) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.");
                }
            } catch (Exception e) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", e);
            }
        }
    }

    final boolean zze(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        hashMap.put("app_context", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        if (info != null) {
            if (true != info.isLimitAdTrackingEnabled()) {
                str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
            hashMap.put("limit_ad_tracking", str2);
            String id = info.getId();
            if (id != null) {
                hashMap.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new zza(this, hashMap).start();
        return true;
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        this.zzd = new Object();
        Preconditions.checkNotNull(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j;
    }
}
