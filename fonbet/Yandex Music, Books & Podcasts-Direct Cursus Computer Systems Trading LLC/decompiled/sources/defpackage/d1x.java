package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d1x extends aww {
    public final m1x S0(k74 k74Var, l9e l9eVar, p3x p3xVar) {
        m1x h1xVar;
        Parcel M0 = M0();
        y4x.c(M0, k74Var);
        y4x.d(M0, l9eVar);
        y4x.d(M0, p3xVar);
        Parcel N0 = N0(M0, 3);
        IBinder readStrongBinder = N0.readStrongBinder();
        int i = i1x.h;
        if (readStrongBinder == null) {
            h1xVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            h1xVar = queryLocalInterface instanceof m1x ? (m1x) queryLocalInterface : new h1x(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 2);
        }
        N0.recycle();
        return h1xVar;
    }

    public final b2x T0(zhj zhjVar, l9e l9eVar, l9e l9eVar2) {
        b2x v1xVar;
        Parcel M0 = M0();
        y4x.d(M0, zhjVar);
        y4x.d(M0, l9eVar);
        y4x.d(M0, l9eVar2);
        Parcel N0 = N0(M0, 5);
        IBinder readStrongBinder = N0.readStrongBinder();
        int i = y1x.h;
        if (readStrongBinder == null) {
            v1xVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            v1xVar = queryLocalInterface instanceof b2x ? (b2x) queryLocalInterface : new v1x(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 2);
        }
        N0.recycle();
        return v1xVar;
    }

    public final n2x U0(String str, String str2, p3x p3xVar) {
        n2x f2xVar;
        Parcel M0 = M0();
        M0.writeString(str);
        M0.writeString(str2);
        y4x.d(M0, p3xVar);
        Parcel N0 = N0(M0, 2);
        IBinder readStrongBinder = N0.readStrongBinder();
        int i = i2x.h;
        if (readStrongBinder == null) {
            f2xVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            f2xVar = queryLocalInterface instanceof n2x ? (n2x) queryLocalInterface : new f2x(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 2);
        }
        N0.recycle();
        return f2xVar;
    }

    public final vbx V0(zhj zhjVar, p3x p3xVar, int i, int i2) {
        vbx p9xVar;
        Parcel M0 = M0();
        y4x.d(M0, zhjVar);
        y4x.d(M0, p3xVar);
        M0.writeInt(i);
        M0.writeInt(i2);
        M0.writeInt(0);
        M0.writeLong(2097152L);
        M0.writeInt(5);
        M0.writeInt(333);
        M0.writeInt(10000);
        Parcel N0 = N0(M0, 6);
        IBinder readStrongBinder = N0.readStrongBinder();
        int i3 = vax.h;
        if (readStrongBinder == null) {
            p9xVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            p9xVar = queryLocalInterface instanceof vbx ? (vbx) queryLocalInterface : new p9x(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        N0.recycle();
        return p9xVar;
    }

    public final vbx W0(zhj zhjVar, zhj zhjVar2, p3x p3xVar, int i, int i2) {
        vbx p9xVar;
        Parcel M0 = M0();
        y4x.d(M0, zhjVar);
        y4x.d(M0, zhjVar2);
        y4x.d(M0, p3xVar);
        M0.writeInt(i);
        M0.writeInt(i2);
        M0.writeInt(0);
        M0.writeLong(2097152L);
        M0.writeInt(5);
        M0.writeInt(333);
        M0.writeInt(10000);
        Parcel N0 = N0(M0, 7);
        IBinder readStrongBinder = N0.readStrongBinder();
        int i3 = vax.h;
        if (readStrongBinder == null) {
            p9xVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            p9xVar = queryLocalInterface instanceof vbx ? (vbx) queryLocalInterface : new p9x(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        N0.recycle();
        return p9xVar;
    }
}
