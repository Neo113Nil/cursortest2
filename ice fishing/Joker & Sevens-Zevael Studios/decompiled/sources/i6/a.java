package i6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b4.m;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m6.f;
import m6.g;
import p6.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f3197h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static volatile a f3198i;

    /* renamed from: a, reason: collision with root package name */
    public m6.a f3199a;

    /* renamed from: b, reason: collision with root package name */
    public x6.d f3200b;

    /* renamed from: e, reason: collision with root package name */
    public b f3203e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f3204f;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3202d = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3201c = false;

    /* renamed from: g, reason: collision with root package name */
    public final long f3205g = 30000;

    public a(Context context) {
        this.f3204f = context.getApplicationContext();
    }

    public static m a(Context context) {
        a aVar = f3198i;
        if (aVar == null) {
            synchronized (f3197h) {
                try {
                    aVar = f3198i;
                    if (aVar == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        aVar = new a(context);
                        f3198i = aVar;
                    }
                } finally {
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        if (d.f3211c == null) {
            synchronized (d.f3212d) {
                try {
                    if (d.f3211c == null) {
                        d.f3211c = new d(context);
                    }
                } finally {
                }
            }
        }
        d dVar = d.f3211c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            m f10 = aVar.f();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            e(f10, elapsedRealtime2, null);
            dVar.a(0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, System.currentTimeMillis());
            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + elapsedRealtime2 + "ms");
            return f10;
        } catch (Throwable th) {
            e(null, -1L, th);
            dVar.a(!(th instanceof IOException) ? !(th instanceof g) ? th instanceof IllegalStateException ? 8 : -1 : 9 : 1, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, System.currentTimeMillis());
            throw th;
        }
    }

    public static void e(m mVar, long j3, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (mVar != null) {
                hashMap.put("limit_ad_tracking", true != mVar.f1000c ? "0" : "1");
                String str = (String) mVar.f999b;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j3));
            new ec.a(hashMap).start();
        }
    }

    public final void b() {
        u.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3204f == null || this.f3199a == null) {
                    return;
                }
                try {
                    if (this.f3201c) {
                        s6.a.a().b(this.f3204f, this.f3199a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f3201c = false;
                this.f3200b = null;
                this.f3199a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        u.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3201c) {
                    return;
                }
                Context context = this.f3204f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b2 = f.f4915b.b(context, 12451000);
                    if (b2 != 0 && b2 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    m6.a aVar = new m6.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!s6.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f3199a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder a6 = aVar.a();
                            int i10 = x6.c.f8371d;
                            IInterface queryLocalInterface = a6.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f3200b = queryLocalInterface instanceof x6.d ? (x6.d) queryLocalInterface : new x6.b(a6);
                            this.f3201c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void d() {
        try {
            if (!this.f3201c) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    c();
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.f3201c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
        } finally {
        }
    }

    public final m f() {
        m mVar;
        u.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            d();
            u.g(this.f3199a);
            u.g(this.f3200b);
            try {
                x6.b bVar = (x6.b) this.f3200b;
                bVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i10 = 1;
                Parcel b2 = bVar.b(obtain, 1);
                String readString = b2.readString();
                b2.recycle();
                x6.b bVar2 = (x6.b) this.f3200b;
                bVar2.getClass();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i11 = x6.a.f8369a;
                obtain2.writeInt(1);
                Parcel b10 = bVar2.b(obtain2, 2);
                boolean z10 = b10.readInt() != 0;
                b10.recycle();
                mVar = new m(i10, readString, z10);
            } catch (RemoteException e10) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                throw new IOException("Remote exception", e10);
            }
        }
        synchronized (this.f3202d) {
            b bVar3 = this.f3203e;
            if (bVar3 != null) {
                bVar3.f3208i.countDown();
                try {
                    this.f3203e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j3 = this.f3205g;
            if (j3 > 0) {
                this.f3203e = new b(this, j3);
            }
        }
        return mVar;
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
