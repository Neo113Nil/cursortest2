package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.media3.session.MediaSessionService;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class muh extends Binder implements g9e {
    public final WeakReference a;
    public final Handler h;
    public final zth i;
    public final Set j;

    public muh(MediaSessionService mediaSessionService) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.a = new WeakReference(mediaSessionService);
        Context applicationContext = mediaSessionService.getApplicationContext();
        this.h = new Handler(applicationContext.getMainLooper());
        this.i = zth.a(applicationContext);
        this.j = Collections.synchronizedSet(new HashSet());
    }

    public static g9e R(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof g9e)) {
            return (g9e) queryLocalInterface;
        }
        f9e f9eVar = new f9e();
        f9eVar.a = iBinder;
        return f9eVar;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        w0(gmh.R(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // defpackage.g9e
    public final void w0(final u8e u8eVar, Bundle bundle) {
        if (u8eVar == null || bundle == null) {
            return;
        }
        try {
            final g66 a = g66.a(bundle);
            if (this.a.get() == null) {
                try {
                    u8eVar.d();
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long clearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = a.d;
            }
            final xth xthVar = new xth(a.c, callingPid, callingUid);
            final boolean b = this.i.b(xthVar);
            this.j.add(u8eVar);
            try {
                this.h.post(new Runnable() { // from class: luh
                    @Override // java.lang.Runnable
                    public final void run() {
                        xth xthVar2 = xthVar;
                        g66 g66Var = a;
                        boolean z = b;
                        muh muhVar = muh.this;
                        Set set = muhVar.j;
                        u8e u8eVar2 = u8eVar;
                        set.remove(u8eVar2);
                        boolean z2 = true;
                        try {
                            MediaSessionService mediaSessionService = (MediaSessionService) muhVar.a.get();
                            try {
                                if (mediaSessionService == null) {
                                    u8eVar2.d();
                                    return;
                                }
                                int i = g66Var.a;
                                int i2 = g66Var.b;
                                wrh wrhVar = new wrh(xthVar2, i, i2, z, new cvh(u8eVar2, i2), g66Var.e);
                                try {
                                    mzb f = mediaSessionService.f(wrhVar);
                                    mediaSessionService.a(f);
                                    z2 = false;
                                    f.a.g.R(u8eVar2, wrhVar);
                                } catch (Exception e) {
                                    vq1.o0("MSessionService", "Failed to add a session to session service", e);
                                }
                                if (z2) {
                                    u8eVar2.d();
                                }
                            } catch (RemoteException unused2) {
                            }
                        } catch (Throwable th) {
                            if (z2) {
                                try {
                                    u8eVar2.d();
                                } catch (RemoteException unused3) {
                                }
                            }
                            throw th;
                        }
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e) {
            vq1.o0("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
