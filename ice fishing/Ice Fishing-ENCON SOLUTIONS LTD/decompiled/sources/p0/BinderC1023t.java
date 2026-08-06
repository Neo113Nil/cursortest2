package p0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import x0.C1065b;
import z0.AbstractC1102a;

/* renamed from: p0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1023t extends C0.c {

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f8410b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8411c;

    public BinderC1023t(com.google.android.gms.common.internal.a aVar, int i2) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f8410b = aVar;
        this.f8411c = i2;
    }

    @Override // C0.c
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC1102a.a(parcel, Bundle.CREATOR);
            AbstractC1102a.b(parcel);
            AbstractC1021r.d(this.f8410b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f8410b;
            aVar.getClass();
            C1025v c1025v = new C1025v(aVar, readInt, readStrongBinder, bundle);
            HandlerC1022s handlerC1022s = aVar.f2689e;
            handlerC1022s.sendMessage(handlerC1022s.obtainMessage(1, this.f8411c, -1, c1025v));
            this.f8410b = null;
        } else if (i2 == 2) {
            parcel.readInt();
            AbstractC1102a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i2 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C1027x c1027x = (C1027x) AbstractC1102a.a(parcel, C1027x.CREATOR);
            AbstractC1102a.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f8410b;
            AbstractC1021r.d(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC1021r.c(c1027x);
            aVar2.f2704u = c1027x;
            if (aVar2 instanceof C1065b) {
                C1006c c1006c = c1027x.f8420d;
                C1010g b2 = C1010g.b();
                C1011h c1011h = c1006c == null ? null : c1006c.f8343a;
                synchronized (b2) {
                    if (c1011h == null) {
                        c1011h = C1010g.f8375c;
                    } else {
                        C1011h c1011h2 = (C1011h) b2.f8376a;
                        if (c1011h2 != null) {
                            if (c1011h2.f8377a < c1011h.f8377a) {
                            }
                        }
                    }
                    b2.f8376a = c1011h;
                }
            }
            Bundle bundle2 = c1027x.f8417a;
            AbstractC1021r.d(this.f8410b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f8410b;
            aVar3.getClass();
            C1025v c1025v2 = new C1025v(aVar3, readInt2, readStrongBinder2, bundle2);
            HandlerC1022s handlerC1022s2 = aVar3.f2689e;
            handlerC1022s2.sendMessage(handlerC1022s2.obtainMessage(1, this.f8411c, -1, c1025v2));
            this.f8410b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
