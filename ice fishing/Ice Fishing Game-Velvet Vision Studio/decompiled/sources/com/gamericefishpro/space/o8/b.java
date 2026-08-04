package com.gamericefishpro.space.o8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.gamericefishpro.space.s8.f;
import com.gamericefishpro.space.s8.g;
import com.gamericefishpro.space.v8.c0;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final Object h = new Object();
    public static volatile b i;
    public com.gamericefishpro.space.s8.a a;
    public com.gamericefishpro.space.e9.d b;
    public boolean c;
    public final Object d = new Object();
    public d e;
    public final Context f;
    public final long g;

    public b(Context context) {
        c0.g(context);
        this.f = context.getApplicationContext();
        this.c = false;
        this.g = 30000L;
    }

    public static a a(Context context) {
        int i2;
        b bVar = i;
        if (bVar == null) {
            synchronized (h) {
                try {
                    bVar = i;
                    if (bVar == null) {
                        bVar = new b(context);
                        i = bVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b bVar2 = bVar;
        if (e.c == null) {
            synchronized (e.d) {
                try {
                    if (e.c == null) {
                        e.c = new e(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        e eVar = e.c;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            a aVarF = bVar2.f();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            bVar2.d(aVarF, jElapsedRealtime2, null);
            eVar.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jElapsedRealtime, SystemClock.elapsedRealtime());
            new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 25);
            return aVarF;
        } catch (Throwable th3) {
            bVar2.d(null, -1L, th3);
            if (th3 instanceof IOException) {
                i2 = 1;
            } else if (th3 instanceof g) {
                i2 = 9;
            } else {
                i2 = th3 instanceof IllegalStateException ? 8 : -1;
            }
            eVar.a(i2, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jElapsedRealtime, SystemClock.elapsedRealtime());
            throw th3;
        }
    }

    public final void b() {
        c0.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = f.b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    com.gamericefishpro.space.s8.a aVar = new com.gamericefishpro.space.s8.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!com.gamericefishpro.space.y8.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderA = aVar.a();
                            int i2 = com.gamericefishpro.space.e9.c.d;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = iInterfaceQueryLocalInterface instanceof com.gamericefishpro.space.e9.d ? (com.gamericefishpro.space.e9.d) iInterfaceQueryLocalInterface : new com.gamericefishpro.space.e9.b(iBinderA);
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        c0.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                Context context = this.f;
                if (context == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        com.gamericefishpro.space.y8.a.b().c(context, this.a);
                    }
                } catch (Throwable unused) {
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(a aVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (aVar != null) {
                map.put("limit_ad_tracking", true != aVar.b ? "0" : "1");
                String str = aVar.c;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new c(this, map).start();
        }
    }

    public final synchronized void e() {
        try {
            if (!this.c) {
                try {
                    b();
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final a f() {
        a aVar;
        c0.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            e();
            c0.g(this.a);
            c0.g(this.b);
            try {
                com.gamericefishpro.space.e9.b bVar = (com.gamericefishpro.space.e9.b) this.b;
                bVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                Parcel parcelE = bVar.E(parcelObtain, 1);
                String string = parcelE.readString();
                parcelE.recycle();
                com.gamericefishpro.space.e9.b bVar2 = (com.gamericefishpro.space.e9.b) this.b;
                bVar2.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i2 = com.gamericefishpro.space.e9.a.a;
                parcelObtain2.writeInt(1);
                Parcel parcelE2 = bVar2.E(parcelObtain2, 2);
                if (parcelE2.readInt() == 0) {
                    z = false;
                }
                parcelE2.recycle();
                aVar = new a(string, z, 0);
            } catch (RemoteException e) {
                throw new IOException("Remote exception", e);
            }
        }
        synchronized (this.d) {
            d dVar = this.e;
            if (dVar != null) {
                dVar.i.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new d(this, j);
            }
        }
        return aVar;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }
}
