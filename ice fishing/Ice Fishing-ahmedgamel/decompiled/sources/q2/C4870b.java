package q2;

import O2.f;
import O2.g;
import R2.w;
import a3.AbstractBinderC0435c;
import a3.AbstractC0433a;
import a3.C0434b;
import a3.InterfaceC0436d;
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

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4870b {

    /* renamed from: a, reason: collision with root package name */
    public O2.a f40041a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0436d f40042b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40043c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f40044d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public C4872d f40045e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f40046f;

    /* renamed from: g, reason: collision with root package name */
    public final long f40047g;

    public C4870b(Context context, long j6, boolean z6) {
        Context applicationContext;
        w.h(context);
        if (z6 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f40046f = context;
        this.f40043c = false;
        this.f40047g = j6;
    }

    public static C4869a a(Context context) {
        C4870b c4870b = new C4870b(context, -1L, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c4870b.d(false);
            C4869a f2 = c4870b.f();
            e(f2, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return f2;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean z6;
        C4870b c4870b = new C4870b(context, -1L, false);
        try {
            c4870b.d(false);
            w.g("Calling this from your main thread can lead to deadlock");
            synchronized (c4870b) {
                try {
                    if (!c4870b.f40043c) {
                        synchronized (c4870b.f40044d) {
                            C4872d c4872d = c4870b.f40045e;
                            if (c4872d == null || !c4872d.f40053w) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            c4870b.d(false);
                            if (!c4870b.f40043c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e9) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e9);
                        }
                    }
                    w.h(c4870b.f40041a);
                    w.h(c4870b.f40042b);
                    try {
                        C0434b c0434b = (C0434b) c4870b.f40042b;
                        c0434b.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel S8 = c0434b.S(obtain, 6);
                        int i = AbstractC0433a.f4298a;
                        z6 = S8.readInt() != 0;
                        S8.recycle();
                    } catch (RemoteException e10) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c4870b.g();
            return z6;
        } finally {
            c4870b.c();
        }
    }

    public static void e(C4869a c4869a, long j6, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (c4869a != null) {
                hashMap.put("limit_ad_tracking", true != c4869a.f40040b ? "0" : "1");
                String str = c4869a.f40039a;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j6));
            new C4871c(0, hashMap).start();
        }
    }

    public final void c() {
        w.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f40046f == null || this.f40041a == null) {
                    return;
                }
                try {
                    if (this.f40043c) {
                        U2.a.a().b(this.f40046f, this.f40041a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f40043c = false;
                this.f40042b = null;
                this.f40041a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z6) {
        w.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f40043c) {
                    c();
                }
                Context context = this.f40046f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int c9 = f.f2270b.c(context, 12451000);
                    if (c9 != 0 && c9 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    O2.a aVar = new O2.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!U2.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f40041a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder a9 = aVar.a();
                            int i = AbstractBinderC0435c.f4300n;
                            IInterface queryLocalInterface = a9.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f40042b = queryLocalInterface instanceof InterfaceC0436d ? (InterfaceC0436d) queryLocalInterface : new C0434b(a9);
                            this.f40043c = true;
                            if (z6) {
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

    public final C4869a f() {
        C4869a c4869a;
        w.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f40043c) {
                    synchronized (this.f40044d) {
                        C4872d c4872d = this.f40045e;
                        if (c4872d == null || !c4872d.f40053w) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f40043c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e9) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e9);
                    }
                }
                w.h(this.f40041a);
                w.h(this.f40042b);
                try {
                    C0434b c0434b = (C0434b) this.f40042b;
                    c0434b.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel S8 = c0434b.S(obtain, 1);
                    String readString = S8.readString();
                    S8.recycle();
                    C0434b c0434b2 = (C0434b) this.f40042b;
                    c0434b2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = AbstractC0433a.f4298a;
                    obtain2.writeInt(1);
                    Parcel S9 = c0434b2.S(obtain2, 2);
                    boolean z6 = S9.readInt() != 0;
                    S9.recycle();
                    c4869a = new C4869a(readString, z6);
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c4869a;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f40044d) {
            C4872d c4872d = this.f40045e;
            if (c4872d != null) {
                c4872d.f40052v.countDown();
                try {
                    this.f40045e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j6 = this.f40047g;
            if (j6 > 0) {
                this.f40045e = new C4872d(this, j6);
            }
        }
    }
}
