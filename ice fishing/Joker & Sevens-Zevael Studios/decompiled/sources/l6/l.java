package l6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import bc.a0;
import d8.o;
import f1.d0;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static l f4197e;

    /* renamed from: a, reason: collision with root package name */
    public int f4198a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4199b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4200c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4201d;

    public l(Context context) {
        this.f4198a = 0;
        this.f4199b = context.getApplicationContext();
    }

    public static synchronized l m(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (f4197e == null) {
                    f4197e = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new u6.a("MessengerIpcClient"))));
                }
                lVar = f4197e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    public o a() {
        if (this.f4198a != 2 || ((h6.c) this.f4200c) == null || ((q5.a) this.f4201d) == null) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", ((Context) this.f4199b).getPackageName());
        try {
            return new o(((h6.a) ((h6.c) this.f4200c)).b(bundle), 1);
        } catch (RemoteException e10) {
            a0.A("RemoteException getting install referrer information");
            this.f4198a = 0;
            throw e10;
        }
    }

    public int b() {
        Paint.Cap strokeCap = ((Paint) this.f4199b).getStrokeCap();
        int i10 = strokeCap == null ? -1 : f1.h.f2253a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int c() {
        Paint.Join strokeJoin = ((Paint) this.f4199b).getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : f1.h.f2254b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void d(float f10) {
        ((Paint) this.f4199b).setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public void e(int i10) {
        if (this.f4198a == i10) {
            return;
        }
        this.f4198a = i10;
        Paint paint = (Paint) this.f4199b;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(d0.q(i10));
        } else {
            paint.setXfermode(new PorterDuffXfermode(d0.v(i10)));
        }
    }

    public void f(long j3) {
        ((Paint) this.f4199b).setColor(d0.s(j3));
    }

    public void g(f1.l lVar) {
        this.f4201d = lVar;
        ((Paint) this.f4199b).setColorFilter(lVar != null ? lVar.f2269a : null);
    }

    public void h(Shader shader) {
        this.f4200c = shader;
        ((Paint) this.f4199b).setShader(shader);
    }

    public void i(int i10) {
        ((Paint) this.f4199b).setStrokeCap(i10 == 2 ? Paint.Cap.SQUARE : i10 == 1 ? Paint.Cap.ROUND : i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void j(int i10) {
        ((Paint) this.f4199b).setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 2 ? Paint.Join.BEVEL : i10 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void k(int i10) {
        ((Paint) this.f4199b).setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public void l(x4.l lVar) {
        ServiceInfo serviceInfo;
        Context context = (Context) this.f4199b;
        int i10 = this.f4198a;
        if (i10 == 2 && ((h6.c) this.f4200c) != null && ((q5.a) this.f4201d) != null) {
            a0.z("Service connection is valid. No need to re-initialize.");
            lVar.i(0);
            return;
        }
        if (i10 == 1) {
            a0.A("Client is already in the process of connecting to the service.");
            lVar.i(3);
            return;
        }
        if (i10 == 3) {
            a0.A("Client was already closed and can't be reused. Please create another instance.");
            lVar.i(3);
            return;
        }
        a0.z("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.f4198a = 0;
            a0.z("Install Referrer service unavailable on device.");
            lVar.i(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    q5.a aVar = new q5.a(this, lVar);
                    this.f4201d = aVar;
                    try {
                        if (context.bindService(intent2, aVar, 1)) {
                            a0.z("Service was bonded successfully.");
                            return;
                        }
                        a0.A("Connection to service is blocked.");
                        this.f4198a = 0;
                        lVar.i(1);
                        return;
                    } catch (SecurityException unused) {
                        a0.A("No permission to connect to service.");
                        this.f4198a = 0;
                        lVar.i(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        a0.A("Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.f4198a = 0;
        lVar.i(2);
    }

    public synchronized g7.o n(k kVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(kVar.toString()));
            }
            if (!((j) this.f4201d).d(kVar)) {
                j jVar = new j(this);
                this.f4201d = jVar;
                jVar.d(kVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return kVar.f4193b.f2537a;
    }

    public l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f4201d = new j(this);
        this.f4198a = 1;
        this.f4200c = scheduledExecutorService;
        this.f4199b = context.getApplicationContext();
    }

    public l(Paint paint) {
        this.f4199b = paint;
        this.f4198a = 3;
    }
}
