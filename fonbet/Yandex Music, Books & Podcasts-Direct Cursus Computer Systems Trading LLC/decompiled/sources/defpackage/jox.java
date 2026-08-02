package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class jox extends a {
    public static final msg I = new msg("CastClientImplCxless", null);
    public final CastDevice E;
    public final long F;
    public final Bundle G;
    public final String H;

    public jox(Context context, Looper looper, rn5 rn5Var, CastDevice castDevice, long j, Bundle bundle, String str, rmd rmdVar, smd smdVar) {
        super(context, looper, 10, rn5Var, rmdVar, smdVar, 0);
        this.E = castDevice;
        this.F = j;
        this.G = bundle;
        this.H = str;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final void disconnect() {
        try {
            try {
                ((y0x) s()).S0();
            } finally {
                super.disconnect();
            }
        } catch (RemoteException | IllegalStateException e) {
            I.a(e, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 19390000;
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
    public final i6c[] p() {
        return vwb.o;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle r() {
        Bundle bundle = new Bundle();
        I.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.E;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.F);
        bundle.putString("connectionless_client_record_id", this.H);
        Bundle bundle2 = this.G;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
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
    public final boolean y() {
        return true;
    }
}
