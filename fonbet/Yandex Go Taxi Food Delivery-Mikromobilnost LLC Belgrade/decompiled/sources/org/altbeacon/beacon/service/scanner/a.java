package org.altbeacon.beacon.service.scanner;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import defpackage.aye0;
import defpackage.vof;
import defpackage.wof;
import java.util.Date;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes4.dex */
public abstract class a {
    public BluetoothAdapter a;
    public boolean h;
    public boolean i;
    public final Context l;
    public final Handler r;
    public final HandlerThread s;
    public final vof t;
    public boolean u;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public long f = 0;
    public boolean g = false;
    public boolean j = false;
    public boolean k = false;
    public boolean n = false;
    public BroadcastReceiver o = null;
    public final Handler q = new Handler(Looper.getMainLooper());
    public boolean v = false;
    public volatile boolean w = false;
    public PendingIntent x = null;
    public long m = 1100;
    public long p = 0;

    public a(Context context, boolean z, vof vofVar) {
        this.u = false;
        this.l = context;
        this.t = vofVar;
        this.u = z;
        HandlerThread handlerThread = new HandlerThread("CycledLeScannerThread");
        this.s = handlerThread;
        handlerThread.start();
        this.r = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        ((AlarmManager) this.l.getSystemService("alarm")).set(2, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, g());
        SystemClock.elapsedRealtime();
        g();
    }

    public final boolean b(String str) {
        return this.l.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public abstract boolean c();

    public final void d() {
        this.q.removeCallbacksAndMessages(null);
        this.r.post(new wof(this, 0));
        BroadcastReceiver broadcastReceiver = this.o;
        if (broadcastReceiver != null) {
            try {
                this.l.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.o = null;
        }
    }

    public final void e() {
        long elapsedRealtime;
        try {
            ((aye0) this.t).h();
            if (this.h) {
                if (f() != null) {
                    f().isEnabled();
                    if (this.w && this.p == 0) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() + this.p + this.m;
                        long j = this.f;
                        if (j <= 0 || elapsedRealtime2 - j <= 600000 || !this.g) {
                            this.n = true;
                            this.c = SystemClock.elapsedRealtime();
                        }
                    }
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (this.p + this.m >= 6000 || elapsedRealtime3 - this.b >= 6000) {
                        try {
                            b bVar = (b) this;
                            bVar.m();
                            bVar.i = true;
                            this.n = false;
                        } catch (Exception unused) {
                        }
                    } else {
                        this.n = true;
                    }
                    this.c = SystemClock.elapsedRealtime();
                }
                long j2 = this.p;
                if (j2 == 0) {
                    elapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    elapsedRealtime = SystemClock.elapsedRealtime() + (j2 - (SystemClock.elapsedRealtime() % (this.m + j2)));
                }
                this.d = elapsedRealtime;
                if (this.k) {
                    h(Boolean.TRUE);
                }
            }
            if (this.k) {
                return;
            }
            this.j = false;
            a();
        } catch (SecurityException unused2) {
        }
    }

    public final BluetoothAdapter f() {
        try {
            if (this.a == null) {
                this.a = ((BluetoothManager) this.l.getApplicationContext().getSystemService("bluetooth")).getAdapter();
            }
        } catch (SecurityException unused) {
        }
        return this.a;
    }

    public final PendingIntent g() {
        if (this.x == null) {
            Context context = this.l;
            Intent intent = new Intent(context, (Class<?>) StartupBroadcastReceiver.class);
            intent.putExtra("wakeup", true);
            this.x = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        }
        return this.x;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:12|(3:19|20|21)|22|23|24|(3:26|(8:28|(1:30)|31|32|(2:34|(2:36|37))|39|(1:41)|37)|44)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0062, code lost:
    
        if (b("android.permission.ACCESS_FINE_LOCATION") != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Boolean bool) {
        try {
            this.j = true;
            f();
            if (!this.k || !bool.booleanValue()) {
                this.h = false;
                this.j = false;
                m();
                this.f = 0L;
                this.c = SystemClock.elapsedRealtime();
                this.q.removeCallbacksAndMessages(null);
                e();
                return;
            }
            if (c()) {
                return;
            }
            if (this.h && !this.i && !this.v) {
                SystemClock.elapsedRealtime();
                this.e = SystemClock.elapsedRealtime() + this.m;
                i();
            }
            this.h = true;
            this.i = false;
            if (f() != null) {
                f().isEnabled();
                if (this.k) {
                    if (this.v) {
                        this.v = false;
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            if (b("android.permission.BLUETOOTH_SCAN")) {
                                this.f = SystemClock.elapsedRealtime();
                                l();
                            }
                        }
                        if (!b("android.permission.ACCESS_COARSE_LOCATION")) {
                        }
                        this.f = SystemClock.elapsedRealtime();
                        l();
                    } catch (Exception unused) {
                    }
                }
                this.b = SystemClock.elapsedRealtime();
            }
            this.e = SystemClock.elapsedRealtime() + this.m;
            i();
        } catch (SecurityException unused2) {
        }
    }

    public final void i() {
        long elapsedRealtime = this.e - SystemClock.elapsedRealtime();
        if (!this.k || elapsedRealtime <= 0) {
            e();
            return;
        }
        if (this.u) {
            k();
        }
        wof wofVar = new wof(this, 1);
        if (elapsedRealtime > 1000) {
            elapsedRealtime = 1000;
        }
        this.q.postDelayed(wofVar, elapsedRealtime);
    }

    public final void j(long j, long j2, boolean z) {
        if (this.u != z) {
            this.v = true;
        }
        this.u = z;
        this.m = j;
        this.p = j2;
        if (z) {
            k();
        } else {
            a();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.d;
        if (j3 > elapsedRealtime) {
            long j4 = this.c + j2;
            if (j4 < j3) {
                this.d = j4;
                new Date(System.currentTimeMillis() + (this.d - SystemClock.elapsedRealtime()));
            }
        }
        long j5 = this.e;
        if (j5 > elapsedRealtime) {
            long j6 = this.b + j;
            if (j6 < j5) {
                this.e = j6;
            }
        }
    }

    public final void k() {
        long j = this.p;
        if (MapiClientImpl.RETRIES_TIME_MILLIS >= j) {
            j = 300000;
        }
        long j2 = this.m;
        if (j < j2) {
            j = j2;
        }
        Context context = this.l;
        ((AlarmManager) context.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + j, g());
        g();
        if (this.o == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_BACKGROUND");
            intentFilter.addAction("android.intent.action.USER_FOREGROUND");
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: org.altbeacon.beacon.service.scanner.CycledLeScanner$3
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    a.this.a();
                }
            };
            this.o = broadcastReceiver;
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public abstract void l();

    public abstract void m();
}
