package o2;

import M2.f;
import M2.g;
import P2.w;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4784b {

    /* renamed from: a, reason: collision with root package name */
    public M2.a f39558a;

    /* renamed from: b, reason: collision with root package name */
    public Y2.d f39559b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39560c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f39561d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public C4786d f39562e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f39563f;

    /* renamed from: g, reason: collision with root package name */
    public final long f39564g;

    public C4784b(Context context, long j6, boolean z3) {
        Context applicationContext;
        w.h(context);
        if (z3 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f39563f = context;
        this.f39560c = false;
        this.f39564g = j6;
    }

    public static C4783a a(Context context) {
        C4784b c4784b = new C4784b(context, -1L, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c4784b.d(false);
            C4783a f3 = c4784b.f();
            e(f3, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return f3;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean z3;
        C4784b c4784b = new C4784b(context, -1L, false);
        try {
            c4784b.d(false);
            w.g("Calling this from your main thread can lead to deadlock");
            synchronized (c4784b) {
                try {
                    if (!c4784b.f39560c) {
                        synchronized (c4784b.f39561d) {
                            C4786d c4786d = c4784b.f39562e;
                            if (c4786d == null || !c4786d.f39570w) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            c4784b.d(false);
                            if (!c4784b.f39560c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e9) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e9);
                        }
                    }
                    w.h(c4784b.f39558a);
                    w.h(c4784b.f39559b);
                    try {
                        Y2.b bVar = (Y2.b) c4784b.f39559b;
                        bVar.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel S8 = bVar.S(obtain, 6);
                        int i = Y2.a.f3945a;
                        z3 = S8.readInt() != 0;
                        S8.recycle();
                    } catch (RemoteException e10) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c4784b.g();
            return z3;
        } finally {
            c4784b.c();
        }
    }

    public static void e(C4783a c4783a, long j6, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (c4783a != null) {
                hashMap.put("limit_ad_tracking", true != c4783a.f39557b ? "0" : "1");
                String str = c4783a.f39556a;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j6));
            new C4785c(0, hashMap).start();
        }
    }

    public final void c() {
        w.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f39563f == null || this.f39558a == null) {
                    return;
                }
                try {
                    if (this.f39560c) {
                        S2.a.a().b(this.f39563f, this.f39558a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f39560c = false;
                this.f39559b = null;
                this.f39558a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z3) {
        w.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f39560c) {
                    c();
                }
                Context context = this.f39563f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int c9 = f.f1844b.c(context, 12451000);
                    if (c9 != 0 && c9 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    M2.a aVar = new M2.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!S2.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f39558a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder a9 = aVar.a();
                            int i = Y2.c.f3947n;
                            IInterface queryLocalInterface = a9.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f39559b = queryLocalInterface instanceof Y2.d ? (Y2.d) queryLocalInterface : new Y2.b(a9);
                            this.f39560c = true;
                            if (z3) {
                                g();
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
                    throw new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C4783a f() {
        C4783a c4783a;
        w.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f39560c) {
                    synchronized (this.f39561d) {
                        C4786d c4786d = this.f39562e;
                        if (c4786d == null || !c4786d.f39570w) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f39560c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e9) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e9);
                    }
                }
                w.h(this.f39558a);
                w.h(this.f39559b);
                try {
                    Y2.b bVar = (Y2.b) this.f39559b;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel S8 = bVar.S(obtain, 1);
                    String readString = S8.readString();
                    S8.recycle();
                    Y2.b bVar2 = (Y2.b) this.f39559b;
                    bVar2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = Y2.a.f3945a;
                    obtain2.writeInt(1);
                    Parcel S9 = bVar2.S(obtain2, 2);
                    boolean z3 = S9.readInt() != 0;
                    S9.recycle();
                    c4783a = new C4783a(readString, z3);
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c4783a;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f39561d) {
            C4786d c4786d = this.f39562e;
            if (c4786d != null) {
                c4786d.f39569v.countDown();
                try {
                    this.f39562e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j6 = this.f39564g;
            if (j6 > 0) {
                this.f39562e = new C4786d(this, j6);
            }
        }
    }
}
