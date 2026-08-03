package p6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends a7.a {

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f5647d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5648e;

    public w(com.google.android.gms.common.internal.a aVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f5647d = aVar;
        this.f5648e = i10;
    }

    @Override // a7.a
    public final boolean b(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) a7.b.a(parcel, Bundle.CREATOR);
            a7.b.b(parcel);
            u.h(this.f5647d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f5647d;
            int i11 = this.f5648e;
            aVar.getClass();
            y yVar = new y(aVar, readInt, readStrongBinder, bundle);
            v vVar = aVar.f1434j;
            vVar.sendMessage(vVar.obtainMessage(1, i11, -1, yVar));
            this.f5647d = null;
        } else if (i10 == 2) {
            parcel.readInt();
            a7.b.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            a0 a0Var = (a0) a7.b.a(parcel, a0.CREATOR);
            a7.b.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f5647d;
            u.h(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            u.g(a0Var);
            aVar2.f1450z = a0Var;
            Bundle bundle2 = a0Var.f5539g;
            u.h(this.f5647d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f5647d;
            int i12 = this.f5648e;
            aVar3.getClass();
            y yVar2 = new y(aVar3, readInt2, readStrongBinder2, bundle2);
            v vVar2 = aVar3.f1434j;
            vVar2.sendMessage(vVar2.obtainMessage(1, i12, -1, yVar2));
            this.f5647d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
