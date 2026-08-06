package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import m0.ServiceConnectionC0984a;
import m0.g;
import m0.h;
import p0.AbstractC1021r;
import s0.C1045a;
import w0.AbstractC1058a;
import w0.C1059b;
import w0.c;
import w0.d;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class AdvertisingIdClient {

    @GuardedBy("this")
    ServiceConnectionC0984a zza;

    @GuardedBy("this")
    d zzb;

    @GuardedBy("this")
    boolean zzc;
    final Object zzd;

    @GuardedBy("mAutoDisconnectTaskLock")
    b zze;
    final long zzf;

    @GuardedBy("this")
    private final Context zzg;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z2) {
            this.zza = str;
            this.zzb = z2;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z2 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z2);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return zzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean z2;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            AbstractC1021r.b("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            b bVar = advertisingIdClient.zze;
                            if (bVar == null || !bVar.f2662d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e2) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                        }
                    }
                    AbstractC1021r.c(advertisingIdClient.zza);
                    AbstractC1021r.c(advertisingIdClient.zzb);
                    try {
                        C1059b c1059b = (C1059b) advertisingIdClient.zzb;
                        c1059b.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel a2 = c1059b.a(obtain, 6);
                        int i2 = AbstractC1058a.f8513a;
                        z2 = a2.readInt() != 0;
                        a2.recycle();
                    } catch (RemoteException e3) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            return z2;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z2) {
    }

    private final Info zzd(int i2) {
        Info info;
        AbstractC1021r.b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        b bVar = this.zze;
                        if (bVar == null || !bVar.f2662d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                AbstractC1021r.c(this.zza);
                AbstractC1021r.c(this.zzb);
                try {
                    C1059b c1059b = (C1059b) this.zzb;
                    c1059b.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel a2 = c1059b.a(obtain, 1);
                    String readString = a2.readString();
                    a2.recycle();
                    C1059b c1059b2 = (C1059b) this.zzb;
                    c1059b2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i3 = AbstractC1058a.f8513a;
                    obtain2.writeInt(1);
                    Parcel a3 = c1059b2.a(obtain2, 2);
                    boolean z2 = a3.readInt() != 0;
                    a3.recycle();
                    info = new Info(readString, z2);
                } catch (RemoteException e3) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            b bVar = this.zze;
            if (bVar != null) {
                bVar.f2661c.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j2 = this.zzf;
            if (j2 > 0) {
                this.zze = new b(this, j2);
            }
        }
    }

    public final void finalize() {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return zzd(-1);
    }

    public void start() {
        zzb(true);
    }

    public final void zza() {
        AbstractC1021r.b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        C1045a.a().b(this.zzg, this.zza);
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

    @VisibleForTesting
    public final void zzb(boolean z2) {
        AbstractC1021r.b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b2 = g.f8175b.b(context, 12451000);
                    if (b2 != 0 && b2 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC0984a serviceConnectionC0984a = new ServiceConnectionC0984a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C1045a.a().c(context, context.getClass().getName(), intent, serviceConnectionC0984a, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = serviceConnectionC0984a;
                        try {
                            IBinder a2 = serviceConnectionC0984a.a(TimeUnit.MILLISECONDS);
                            int i2 = c.f8515a;
                            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.zzb = queryLocalInterface instanceof d ? (d) queryLocalInterface : new C1059b(a2);
                            this.zzc = true;
                            if (z2) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final boolean zzc(Info info, boolean z2, float f2, long j2, String str, Throwable th) {
        if (Math.random() > ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (info != null) {
            hashMap.put(CommonUrlParts.LIMIT_AD_TRACKING, true != info.isLimitAdTrackingEnabled() ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            String id = info.getId();
            if (id != null) {
                hashMap.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j2));
        new a(hashMap).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(Context context, long j2, boolean z2, boolean z3) {
        Context applicationContext;
        this.zzd = new Object();
        AbstractC1021r.c(context);
        if (z2 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j2;
    }
}
