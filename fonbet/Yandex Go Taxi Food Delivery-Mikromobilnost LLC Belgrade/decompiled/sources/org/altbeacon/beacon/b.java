package org.altbeacon.beacon;

import android.app.Notification;
import android.app.ServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.go.scooters.ignition.data.g;
import defpackage.g6r0;
import defpackage.i630;
import defpackage.kzo;
import defpackage.me0;
import defpackage.ny61;
import defpackage.oi5;
import defpackage.sr4;
import defpackage.unr0;
import defpackage.uz;
import defpackage.xgz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.altbeacon.beacon.powersave.BackgroundPowerSaverInternal;
import org.altbeacon.beacon.service.BeaconService;
import org.altbeacon.beacon.service.Callback;
import org.altbeacon.beacon.service.RegionMonitoringState;
import org.altbeacon.beacon.service.SettingsData;
import org.altbeacon.beacon.service.StartRMData;
import org.altbeacon.beacon.utils.ChangeAwareCopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class b {
    public static volatile b B = null;
    public static boolean C = false;
    public static final Object D = new Object();
    public static long E = 10000;
    public BackgroundPowerSaverInternal A;
    public final Context a;
    public final ChangeAwareCopyOnWriteArrayList i;
    public final boolean m;
    public boolean o;
    public oi5 z;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public Messenger c = null;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    public final HashSet g = new HashSet();
    public final HashSet h = new HashSet();
    public boolean j = true;
    public boolean k = false;
    public boolean l = true;
    public Boolean n = null;
    public boolean p = false;
    public Notification q = null;
    public int r = -1;
    public final Handler s = new Handler(Looper.getMainLooper());
    public boolean t = false;
    public long u = 1100;
    public long v = 0;
    public long w = 10000;
    public long x = MapiClientImpl.RETRIES_TIME_MILLIS;
    public final HashMap y = new HashMap();

    public b(Context context) {
        this.m = false;
        this.o = false;
        g6r0.a.getClass();
        this.z = null;
        this.A = null;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        me0 me0Var = new me0();
        me0Var.a = applicationContext;
        me0Var.e();
        applicationContext.getApplicationContext().getPackageName();
        Process.myPid();
        this.m = applicationContext.getApplicationContext().getPackageName().equals(me0Var.e());
        List<ResolveInfo> queryIntentServices = applicationContext.getPackageManager().queryIntentServices(new Intent(applicationContext, (Class<?>) BeaconService.class), 65536);
        if (queryIntentServices != null && queryIntentServices.isEmpty()) {
            throw new RuntimeException() { // from class: org.altbeacon.beacon.BeaconManager$ServiceNotDeclaredException
                {
                    super("The BeaconService is not properly declared in AndroidManifest.xml.  If using Eclipse, please verify that your project.properties has manifestmerger.enabled=true");
                }
            };
        }
        ChangeAwareCopyOnWriteArrayList changeAwareCopyOnWriteArrayList = new ChangeAwareCopyOnWriteArrayList();
        changeAwareCopyOnWriteArrayList.a(new sr4(6, this));
        this.i = changeAwareCopyOnWriteArrayList;
        changeAwareCopyOnWriteArrayList.add(new AltBeaconParser());
        this.o = true;
    }

    public static b j(Context context) {
        b bVar;
        b bVar2 = B;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (D) {
            try {
                bVar = B;
                if (bVar == null) {
                    bVar = new b(context);
                    B = bVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static void v() {
        int i = xgz.a;
    }

    public final void A(Region region) {
        Objects.toString(region);
        BeaconParser beaconParser = region.mBeaconParser;
        if (beaconParser != null && beaconParser.mIdentifier != null) {
            Iterator<E> it = this.i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.i.add(region.mBeaconParser);
                    break;
                } else {
                    if (region.mBeaconParser.mIdentifier.equals(((BeaconParser) it.next()).mIdentifier)) {
                        break;
                    }
                }
            }
        }
        if (this.A == null) {
            BackgroundPowerSaverInternal backgroundPowerSaverInternal = new BackgroundPowerSaverInternal(this.a);
            this.A = backgroundPowerSaverInternal;
            backgroundPowerSaverInternal.enableDefaultBackgroundStateInference();
        }
        if (n()) {
            try {
                B(region);
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        synchronized (this.g) {
            this.g.remove(region);
            this.g.add(region);
        }
        synchronized (this) {
            try {
                if (this.z == null) {
                    this.z = new oi5(this);
                }
                d(this.z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(Region region) {
        Objects.toString(region);
        if (o() && !e()) {
            CopyOnWriteArraySet copyOnWriteArraySet = this.f;
            copyOnWriteArraySet.remove(region);
            copyOnWriteArraySet.add(region);
            b(2, region);
        }
    }

    public final void C(Region region) {
        oi5 oi5Var;
        Objects.toString(region);
        if (this.A == null) {
            BackgroundPowerSaverInternal backgroundPowerSaverInternal = new BackgroundPowerSaverInternal(this.a);
            this.A = backgroundPowerSaverInternal;
            backgroundPowerSaverInternal.enableDefaultBackgroundStateInference();
        }
        if (n()) {
            try {
                Objects.toString(region);
                if (o() && !e()) {
                    this.f.remove(region);
                    b(3, region);
                }
            } catch (RemoteException unused) {
            }
        } else {
            synchronized (this.h) {
                this.g.remove(region);
            }
        }
        if (k().size() == 0 && Collections.unmodifiableSet(this.f).size() == 0 && (oi5Var = this.z) != null) {
            E(oi5Var);
            this.z = null;
            this.g.clear();
            this.h.clear();
        }
    }

    public final synchronized void D() {
        if (!this.o && !this.p) {
            if (n()) {
                if (!this.t) {
                    this.t = true;
                    this.s.postDelayed(new uz(5, this), 100L);
                }
                return;
            }
            return;
        }
        kzo.s().i(this.a, this);
    }

    public final void E(oi5 oi5Var) {
        if (o()) {
            synchronized (this.b) {
                try {
                    if (this.b.containsKey(oi5Var)) {
                        if (!this.o && !this.p) {
                            oi5Var.a.a.unbindService(((a) this.b.get(oi5Var)).b);
                        }
                        this.b.size();
                        this.b.remove(oi5Var);
                        this.b.size();
                        if (this.b.size() == 0) {
                            this.c = null;
                            if (this.o || this.p) {
                                kzo.s().n(this.a);
                            }
                        }
                    } else {
                        Iterator it = this.b.entrySet().iterator();
                        while (it.hasNext()) {
                            ((Map.Entry) it.next()).getValue();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void F() {
        if (o() && !e() && n()) {
            b(6, null);
        }
    }

    public final void a(g gVar) {
        Objects.toString(gVar);
        this.d.add(gVar);
    }

    public final void b(int i, Region region) {
        if (n()) {
            boolean z = this.o;
            Context context = this.a;
            if (z || this.p) {
                kzo.s().i(context, this);
                return;
            }
            Message obtain = Message.obtain(null, i, 0, 0);
            if (i == 6) {
                boolean z2 = this.k;
                obtain.setData(new StartRMData(z2 ? this.w : this.u, z2 ? this.x : this.v, z2).toBundle());
            } else if (i == 7) {
                SettingsData settingsData = new SettingsData();
                settingsData.a(context);
                Bundle bundle = new Bundle();
                bundle.putSerializable("SettingsData", settingsData);
                obtain.setData(bundle);
            } else {
                String packageName = context.getPackageName();
                boolean z3 = this.k;
                obtain.setData(new StartRMData(region, packageName, z3 ? this.w : this.u, z3 ? this.x : this.v, z3).toBundle());
            }
            this.c.send(obtain);
        }
    }

    public final void c() {
        if (!e() && n()) {
            D();
        }
    }

    public final void d(oi5 oi5Var) {
        if (o()) {
            synchronized (this.b) {
                try {
                    a aVar = new a();
                    aVar.a = false;
                    BeaconManager$BeaconServiceConnection beaconManager$BeaconServiceConnection = new BeaconManager$BeaconServiceConnection(this, 0);
                    aVar.b = beaconManager$BeaconServiceConnection;
                    a aVar2 = (a) this.b.putIfAbsent(oi5Var, aVar);
                    boolean z = this.p;
                    if (z || aVar2 == null) {
                        if (z) {
                            this.p = false;
                        }
                        if (this.o) {
                            oi5Var.a();
                        } else {
                            Intent intent = new Intent(oi5Var.a.a, (Class<?>) BeaconService.class);
                            if (this.q != null && (!n() || this.p)) {
                                int i = Build.VERSION.SDK_INT;
                                Context context = this.a;
                                int i2 = context.getApplicationInfo().targetSdkVersion;
                                if (i >= 34 && context.getApplicationInfo().targetSdkVersion >= 34 && context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                                    throw new SecurityException("Foreground service may not be enabled until after user grants Manifest.permission.ACCESS_FINE_LOCATION when target SdkVersion is set to SDK 34 or above.  See: https://altbeacon.github.io/android-beacon-library/foreground-service.html");
                                }
                                try {
                                    this.a.startForegroundService(intent);
                                    if (this.p) {
                                        this.p = false;
                                        kzo.s().n(this.a);
                                    }
                                } catch (ServiceStartNotAllowedException unused) {
                                    this.p = true;
                                    D();
                                    return;
                                }
                            }
                            oi5Var.a.a.bindService(intent, beaconManager$BeaconServiceConnection, 1);
                        }
                        this.b.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean e() {
        return p() && !this.m;
    }

    public final void f() {
        if (n()) {
            ny61.r("May not be called after consumers are already bound");
        } else {
            this.q = null;
            this.o = true;
        }
    }

    public final void g(Notification notification) {
        Objects.toString(notification);
        if (n()) {
            ny61.r("May not be called after consumers are already bound.");
            return;
        }
        if (notification == null) {
            ny61.t("Notification cannot be null");
            return;
        }
        if (n()) {
            ny61.r("Method must be called before starting ranging or monitoring");
            return;
        }
        this.o = false;
        if (!this.p) {
            kzo.s().n(this.a);
        }
        this.q = notification;
        this.r = 525252;
    }

    public final ChangeAwareCopyOnWriteArrayList h() {
        return this.i;
    }

    public final int i() {
        return this.r;
    }

    public final HashSet k() {
        HashSet hashSet;
        i630 b = i630.b(this.a);
        synchronized (b) {
            hashSet = new HashSet();
            for (Region region : b.c().keySet()) {
                if (((RegionMonitoringState) b.c().get(region)).a) {
                    hashSet.add(region);
                }
            }
        }
        return hashSet;
    }

    public final Set l() {
        return Collections.unmodifiableSet(this.f);
    }

    public final Set m() {
        return Collections.unmodifiableSet(this.d);
    }

    public final boolean n() {
        boolean z;
        synchronized (this.b) {
            try {
                z = !this.b.isEmpty() && (this.o || this.p || this.c != null);
            } finally {
            }
        }
        return z;
    }

    public final boolean o() {
        return this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public final boolean p() {
        Boolean bool = this.n;
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    public final void q() {
        this.d.clear();
    }

    public final void r() {
        boolean z = this.p;
        if (z && z) {
            if (!n()) {
                this.p = false;
                return;
            }
            ArrayList arrayList = new ArrayList(this.b.keySet());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                E((oi5) it.next());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                d((oi5) it2.next());
            }
        }
    }

    public final void s(long j) {
        this.x = j;
    }

    public final void t(boolean z) {
        if (o()) {
            this.l = false;
            if (z != this.k) {
                this.k = z;
                try {
                    F();
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public final void u(long j) {
        this.w = j;
    }

    public final void w(long j) {
        this.v = j;
    }

    public final void x(long j) {
        this.u = j;
    }

    public final void y() {
        this.j = false;
        if (!p()) {
            i630.b(this.a).k();
        }
        c();
    }

    public final void z(Region region) {
        Context context = this.a;
        Objects.toString(region);
        if (o() && !e()) {
            if (!p()) {
                i630 b = i630.b(context);
                context.getPackageName();
                Callback callback = new Callback();
                synchronized (b) {
                    b.a(region, callback);
                    b.g();
                }
            }
            b(4, region);
            if (p()) {
                i630.b(context).a(region, new Callback());
            }
            if (e()) {
                return;
            }
            RegionMonitoringState j = i630.b(context).j(region);
            if (j != null) {
                j.b();
            }
            Iterator it = this.e.iterator();
            if (it.hasNext()) {
                throw unr0.i(it);
            }
        }
    }
}
