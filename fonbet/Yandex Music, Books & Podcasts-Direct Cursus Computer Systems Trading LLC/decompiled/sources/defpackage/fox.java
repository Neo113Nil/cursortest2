package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.a;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class fox extends a {
    public static final msg D0 = new msg("CastClientImpl", null);
    public static final Object E0 = new Object();
    public static final Object F0 = new Object();
    public String A0;
    public Bundle B0;
    public final HashMap C0;
    public jw0 E;
    public final CastDevice F;
    public final kox G;
    public final HashMap H;
    public final long I;
    public final Bundle J;
    public rnx K;
    public String L;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public double v0;
    public a2x w0;
    public int x0;
    public int y0;
    public String z0;

    public fox(Context context, Looper looper, rn5 rn5Var, CastDevice castDevice, long j, kox koxVar, Bundle bundle, rmd rmdVar, smd smdVar) {
        super(context, looper, 10, rn5Var, rmdVar, smdVar, 0);
        this.F = castDevice;
        this.G = koxVar;
        this.I = j;
        this.J = bundle;
        this.H = new HashMap();
        new AtomicLong(0L);
        this.C0 = new HashMap();
        this.x0 = -1;
        this.y0 = -1;
        this.E = null;
        this.L = null;
        this.v0 = 0.0d;
        D();
        this.X = false;
        this.w0 = null;
        D();
    }

    public static void B(fox foxVar, long j, int i) {
        gr2 gr2Var;
        synchronized (foxVar.C0) {
            gr2Var = (gr2) foxVar.C0.remove(Long.valueOf(j));
        }
        if (gr2Var != null) {
            gr2Var.f(new Status(i, null, null, null));
        }
    }

    public final void C() {
        D0.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.H) {
            this.H.clear();
        }
    }

    public final void D() {
        CastDevice castDevice = this.F;
        y1g.H(castDevice, "device should not be null");
        jsg jsgVar = castDevice.i;
        if (jsgVar.p(2048) || !jsgVar.p(4) || jsgVar.p(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final void disconnect() {
        Object[] objArr = {this.K, Boolean.valueOf(isConnected())};
        msg msgVar = D0;
        msgVar.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        rnx rnxVar = this.K;
        fox foxVar = null;
        this.K = null;
        if (rnxVar != null) {
            fox foxVar2 = (fox) rnxVar.i.getAndSet(null);
            if (foxVar2 != null) {
                foxVar2.x0 = -1;
                foxVar2.y0 = -1;
                foxVar2.E = null;
                foxVar2.L = null;
                foxVar2.v0 = 0.0d;
                foxVar2.D();
                foxVar2.X = false;
                foxVar2.w0 = null;
                foxVar = foxVar2;
            }
            if (foxVar != null) {
                C();
                try {
                    try {
                        ((y0x) s()).S0();
                    } finally {
                        super.disconnect();
                    }
                } catch (RemoteException | IllegalStateException e) {
                    msgVar.a(e, "Error while disconnecting the controller interface", new Object[0]);
                }
                return;
            }
        }
        msgVar.b("already disposed, so short-circuiting", new Object[0]);
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof y0x ? (y0x) queryLocalInterface : new y0x(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle q() {
        Bundle bundle = this.B0;
        if (bundle == null) {
            return null;
        }
        this.B0 = null;
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle r() {
        Bundle bundle = new Bundle();
        D0.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.z0, this.A0);
        CastDevice castDevice = this.F;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.I);
        Bundle bundle2 = this.J;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        rnx rnxVar = new rnx(this);
        this.K = rnxVar;
        bundle.putParcelable("listener", new BinderWrapper(rnxVar));
        String str = this.z0;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.A0;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.a
    public final void w(h66 h66Var) {
        super.w(h66Var);
        C();
    }

    @Override // com.google.android.gms.common.internal.a
    public final void x(int i, IBinder iBinder, Bundle bundle, int i2) {
        D0.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.Y = true;
            this.Z = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.B0 = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.x(i, iBinder, bundle, i2);
    }
}
