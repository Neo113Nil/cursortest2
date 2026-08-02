package org.altbeacon.beacon.service.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import defpackage.aye0;
import defpackage.llm0;
import defpackage.lz;
import defpackage.s9j;
import defpackage.uz;
import defpackage.vz;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class b extends a {
    public long A;
    public long B;
    public boolean C;
    public final org.altbeacon.beacon.b D;
    public final PowerManager E;
    public boolean F;
    public final BroadcastReceiver G;
    public BluetoothLeScanner y;
    public ScanCallback z;

    public b(Context context, boolean z, aye0 aye0Var) {
        super(context, z, aye0Var);
        this.A = 0L;
        this.B = 0L;
        this.C = false;
        this.F = false;
        this.G = new BroadcastReceiver() { // from class: org.altbeacon.beacon.service.scanner.CycledLeScannerForLollipop$5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                b bVar = b.this;
                if (bVar.C) {
                    bVar.m();
                    b.this.l();
                }
            }
        };
        this.D = org.altbeacon.beacon.b.j(this.l);
        this.E = (PowerManager) context.getSystemService("power");
    }

    @Override // org.altbeacon.beacon.service.scanner.a
    public final boolean c() {
        long elapsedRealtime = this.d - SystemClock.elapsedRealtime();
        boolean z = elapsedRealtime > 0;
        boolean z2 = this.C;
        this.C = !z;
        if (!z) {
            if (this.A > 0) {
                m();
                this.A = 0L;
            }
            return z;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        s9j s9jVar = s9j.b;
        long j = elapsedRealtime2 - s9jVar.a;
        if (z2 && j > 10000) {
            this.A = SystemClock.elapsedRealtime();
            this.B = 0L;
            if (this.p > 6000) {
                l();
            }
        }
        long j2 = this.A;
        if (j2 > 0) {
            long j3 = s9jVar.a;
            if (j3 > j2) {
                if (this.B == 0) {
                    this.B = j3;
                }
                if (SystemClock.elapsedRealtime() - this.B >= 10000) {
                    m();
                    this.A = 0L;
                } else {
                    ((aye0) this.t).h();
                }
            }
        }
        if (z2 && this.u) {
            k();
        }
        uz uzVar = new uz(22, this);
        if (elapsedRealtime > 1000) {
            elapsedRealtime = 1000;
        }
        this.q.postDelayed(uzVar, elapsedRealtime);
        return z;
    }

    @Override // org.altbeacon.beacon.service.scanner.a
    public final void l() {
        ScanSettings build;
        ArrayList a;
        try {
            BluetoothAdapter f = f();
            if (f != null) {
                f.getState();
            }
        } catch (SecurityException unused) {
        }
        new ArrayList();
        boolean z = this.C;
        org.altbeacon.beacon.b bVar = this.D;
        if (z) {
            build = new ScanSettings.Builder().setScanMode(2).build();
            String str = Build.MANUFACTURER;
            if ((str.equalsIgnoreCase(Constants.REFERRER_API_SAMSUNG) || Build.VERSION.SDK_INT >= 34) && !this.E.isInteractive()) {
                new llm0();
                a = llm0.a(bVar.i);
            } else {
                if (str.equalsIgnoreCase(Constants.REFERRER_API_SAMSUNG) || Build.VERSION.SDK_INT >= 34) {
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    Context applicationContext = this.l.getApplicationContext();
                    BroadcastReceiver broadcastReceiver = this.G;
                    applicationContext.registerReceiver(broadcastReceiver, intentFilter);
                    Objects.toString(broadcastReceiver);
                }
                new llm0();
                a = new ArrayList();
                a.add(new ScanFilter.Builder().build());
            }
        } else {
            build = new ScanSettings.Builder().setScanMode(0).build();
            new llm0();
            a = llm0.a(bVar.i);
        }
        ScanSettings scanSettings = build;
        ArrayList arrayList = a;
        if (scanSettings != null) {
            try {
                if (this.y == null && f() != null) {
                    this.y = f().getBluetoothLeScanner();
                }
            } catch (SecurityException unused2) {
            }
            BluetoothLeScanner bluetoothLeScanner = this.y;
            if (bluetoothLeScanner == null) {
                return;
            }
            if (this.z == null) {
                this.z = new CycledLeScannerForLollipop$4(this);
            }
            ScanCallback scanCallback = this.z;
            Handler handler = this.r;
            handler.removeCallbacksAndMessages(null);
            handler.post(new vz(2, this, bluetoothLeScanner, scanCallback, arrayList, scanSettings, false));
        }
    }

    @Override // org.altbeacon.beacon.service.scanner.a
    public final void m() {
        try {
            BluetoothAdapter f = f();
            if (f != null) {
                f.getState();
            }
        } catch (SecurityException unused) {
        }
        try {
            if (this.y == null && f() != null) {
                this.y = f().getBluetoothLeScanner();
            }
        } catch (SecurityException unused2) {
        }
        BluetoothLeScanner bluetoothLeScanner = this.y;
        if (bluetoothLeScanner == null) {
            return;
        }
        if (this.z == null) {
            this.z = new CycledLeScannerForLollipop$4(this);
        }
        ScanCallback scanCallback = this.z;
        Handler handler = this.r;
        handler.removeCallbacksAndMessages(null);
        handler.post(new lz((Object) this, (Object) bluetoothLeScanner, (Object) scanCallback, false, 11));
    }

    public final void n() {
        this.k = false;
        if (this.j) {
            h(Boolean.FALSE);
            if (this.n) {
                this.n = false;
                try {
                    m();
                    this.i = true;
                } catch (Exception unused) {
                }
            }
        }
        try {
            this.l.getApplicationContext().unregisterReceiver(this.G);
        } catch (IllegalArgumentException unused2) {
        }
    }
}
