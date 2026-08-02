package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.media3.decoder.SimpleDecoder;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.io.IOException;
import java.util.HashMap;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes.dex */
public class AdvertisingIdClient {
    public static final Object zzg = new Object();
    public static volatile AdvertisingIdClient zzh;
    public BlockingServiceConnection zza;
    public zzf zzb;
    public boolean zzc;
    public final Object zzd = new Object();
    public zzb zze;
    public final long zzf;
    public final Context zzi;

    public AdvertisingIdClient(Context context) {
        zzae.checkNotNull(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = 30000L;
    }

    public static MarkdownElementType getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = zzh;
        if (advertisingIdClient == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient = zzh;
                    if (advertisingIdClient == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        advertisingIdClient = new AdvertisingIdClient(context);
                        zzh = advertisingIdClient;
                    }
                } finally {
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        if (zzd.zza == null) {
            synchronized (zzd.zzc) {
                try {
                    if (zzd.zza == null) {
                        zzd.zza = new zzd(context);
                    }
                } finally {
                }
            }
        }
        zzd zzdVar = zzd.zza;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            MarkdownElementType zzf = advertisingIdClient.zzf();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            advertisingIdClient.zzd(zzf, elapsedRealtime2, null);
            zzdVar.zzb(elapsedRealtime, SystemClock.elapsedRealtime(), 0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 25);
            sb.append("GetInfoInternal elapse ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            Log.i("AdvertisingIdClient", sb.toString());
            return zzf;
        } catch (Throwable th) {
            advertisingIdClient.zzd(null, -1L, th);
            zzdVar.zzb(elapsedRealtime, SystemClock.elapsedRealtime(), !(th instanceof IOException) ? !(th instanceof GooglePlayServicesNotAvailableException) ? !(th instanceof GooglePlayServicesRepairableException) ? th instanceof IllegalStateException ? 8 : -1 : 16 : 9 : 1, (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            throw th;
        }
    }

    public final void finalize() {
        zzc();
        super.finalize();
    }

    public final void zza() {
        zzae.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                Context context = this.zzi;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.zza.isGooglePlayServicesAvailable(context, 12451000);
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
                            this.zzb = zze.zza(blockingServiceConnection.getServiceWithTimeout());
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc() {
        zzae.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                Context context = this.zzi;
                if (context == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        ConnectionTracker.getInstance().unbindService(context, this.zza);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzd(MarkdownElementType markdownElementType, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (markdownElementType != null) {
                hashMap.put("limit_ad_tracking", true != markdownElementType.isLimitAdTrackingEnabled() ? "0" : "1");
                String id = markdownElementType.getId();
                if (id != null) {
                    hashMap.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (th != null) {
                hashMap.put(BreadcrumbHelper.Category.ERROR, th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new SimpleDecoder.AnonymousClass1(this, hashMap).start();
        }
    }

    public final synchronized void zze() {
        try {
            if (!this.zzc) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    zza();
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } finally {
        }
    }

    public final MarkdownElementType zzf() {
        MarkdownElementType markdownElementType;
        zzae.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zze();
            zzae.checkNotNull(this.zza);
            zzae.checkNotNull(this.zzb);
            try {
                markdownElementType = new MarkdownElementType(((com.google.android.gms.internal.ads_identifier.zzd) this.zzb).zzc(), ((com.google.android.gms.internal.ads_identifier.zzd) this.zzb).zzd(), 2);
            } catch (RemoteException e) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                throw new IOException("Remote exception", e);
            }
        }
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
        return markdownElementType;
    }
}
