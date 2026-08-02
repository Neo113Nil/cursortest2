package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.b2x;
import defpackage.d1x;
import defpackage.i0x;
import defpackage.jmp;
import defpackage.l9e;
import defpackage.msg;
import defpackage.o64;
import defpackage.odi;
import defpackage.r2x;
import defpackage.t1x;
import defpackage.v1x;
import defpackage.w0x;
import defpackage.y1g;
import defpackage.y4x;
import defpackage.zhj;

/* loaded from: classes.dex */
public class ReconnectionService extends Service {
    public static final msg b = new msg("ReconnectionService", null);
    public b2x a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        b2x b2xVar = this.a;
        if (b2xVar != null) {
            try {
                v1x v1xVar = (v1x) b2xVar;
                Parcel M0 = v1xVar.M0();
                y4x.c(M0, intent);
                Parcel N0 = v1xVar.N0(M0, 3);
                IBinder readStrongBinder = N0.readStrongBinder();
                N0.recycle();
                return readStrongBinder;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onBind", b2x.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        l9e l9eVar;
        l9e l9eVar2;
        o64 a = o64.a(this);
        a.getClass();
        y1g.B("Must be called from the main thread.");
        jmp jmpVar = a.b;
        jmpVar.getClass();
        b2x b2xVar = null;
        try {
            r2x r2xVar = jmpVar.a;
            Parcel N0 = r2xVar.N0(r2xVar.M0(), 7);
            l9eVar = zhj.S0(N0.readStrongBinder());
            N0.recycle();
        } catch (RemoteException e) {
            jmp.c.a(e, "Unable to call %s on %s.", "getWrappedThis", r2x.class.getSimpleName());
            l9eVar = null;
        }
        y1g.B("Must be called from the main thread.");
        i0x i0xVar = a.c;
        i0xVar.getClass();
        try {
            t1x t1xVar = i0xVar.a;
            Parcel N02 = t1xVar.N0(t1xVar.M0(), 5);
            l9eVar2 = zhj.S0(N02.readStrongBinder());
            N02.recycle();
        } catch (RemoteException e2) {
            i0x.b.a(e2, "Unable to call %s on %s.", "getWrappedThis", t1x.class.getSimpleName());
            l9eVar2 = null;
        }
        msg msgVar = w0x.a;
        if (l9eVar != null && l9eVar2 != null) {
            try {
                b2xVar = w0x.b(getApplicationContext()).T0(new zhj(this), l9eVar, l9eVar2);
            } catch (RemoteException | odi e3) {
                w0x.a.a(e3, "Unable to call %s on %s.", "newReconnectionServiceImpl", d1x.class.getSimpleName());
            }
        }
        this.a = b2xVar;
        if (b2xVar != null) {
            try {
                v1x v1xVar = (v1x) b2xVar;
                v1xVar.O0(v1xVar.M0(), 1);
            } catch (RemoteException e4) {
                b.a(e4, "Unable to call %s on %s.", "onCreate", b2x.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b2x b2xVar = this.a;
        if (b2xVar != null) {
            try {
                v1x v1xVar = (v1x) b2xVar;
                v1xVar.O0(v1xVar.M0(), 4);
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onDestroy", b2x.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        b2x b2xVar = this.a;
        if (b2xVar != null) {
            try {
                v1x v1xVar = (v1x) b2xVar;
                Parcel M0 = v1xVar.M0();
                y4x.c(M0, intent);
                M0.writeInt(i);
                M0.writeInt(i2);
                Parcel N0 = v1xVar.N0(M0, 2);
                int readInt = N0.readInt();
                N0.recycle();
                return readInt;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onStartCommand", b2x.class.getSimpleName());
            }
        }
        return 2;
    }
}
