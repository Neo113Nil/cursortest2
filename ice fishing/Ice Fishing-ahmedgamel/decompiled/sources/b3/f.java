package b3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;
import l3.h;
import u0.C5055d;

/* loaded from: classes2.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5560n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5561u;

    public f(h hVar) {
        this.f5561u = hVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f5560n;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0157, code lost:
    
        if (super.onTransact(r8, r9, r10, r11) != false) goto L92;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) {
        C5055d callback = null;
        C5055d callback2 = null;
        int i6 = 0;
        switch (this.f5560n) {
            case 0:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i9 = a.f5552a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                K2.c createFromParcel2 = parcel.readInt() == 0 ? null : K2.c.CREATOR.createFromParcel(parcel);
                K2.b bVar = createFromParcel2 != null ? new K2.b(createFromParcel2.f1682n, createFromParcel2.f1683u) : null;
                int i10 = createFromParcel.f24395n;
                h hVar = (h) this.f5561u;
                if (i10 <= 0) {
                    hVar.b(bVar);
                } else {
                    hVar.a(new P2.f(createFromParcel));
                }
                return true;
            default:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                }
                if (i == 1598968902) {
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C5055d)) {
                            callback2 = new C5055d();
                            callback2.f40962n = readStrongBinder;
                        } else {
                            callback2 = (C5055d) queryLocalInterface;
                        }
                    }
                    String readString = parcel.readString();
                    kotlin.jvm.internal.h.e(callback2, "callback");
                    if (readString != null) {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f5561u;
                        synchronized (multiInstanceInvalidationService.f5265v) {
                            try {
                                int i11 = multiInstanceInvalidationService.f5263n + 1;
                                multiInstanceInvalidationService.f5263n = i11;
                                if (multiInstanceInvalidationService.f5265v.register(callback2, Integer.valueOf(i11))) {
                                    multiInstanceInvalidationService.f5264u.put(Integer.valueOf(i11), readString);
                                    i6 = i11;
                                } else {
                                    multiInstanceInvalidationService.f5263n--;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i6);
                    return true;
                }
                if (i == 2) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C5055d)) {
                            callback = new C5055d();
                            callback.f40962n = readStrongBinder2;
                        } else {
                            callback = (C5055d) queryLocalInterface2;
                        }
                    }
                    int readInt = parcel.readInt();
                    kotlin.jvm.internal.h.e(callback, "callback");
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = (MultiInstanceInvalidationService) this.f5561u;
                    synchronized (multiInstanceInvalidationService2.f5265v) {
                        multiInstanceInvalidationService2.f5265v.unregister(callback);
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i4);
                }
                int readInt2 = parcel.readInt();
                String[] tables = parcel.createStringArray();
                kotlin.jvm.internal.h.e(tables, "tables");
                MultiInstanceInvalidationService multiInstanceInvalidationService3 = (MultiInstanceInvalidationService) this.f5561u;
                synchronized (multiInstanceInvalidationService3.f5265v) {
                    String str = (String) multiInstanceInvalidationService3.f5264u.get(Integer.valueOf(readInt2));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return true;
                    }
                    int beginBroadcast = multiInstanceInvalidationService3.f5265v.beginBroadcast();
                    while (i6 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f5265v.getBroadcastCookie(i6);
                            kotlin.jvm.internal.h.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService3.f5264u.get(num);
                            if (readInt2 != intValue && str.equals(str2)) {
                                try {
                                    ((C5055d) multiInstanceInvalidationService3.f5265v.getBroadcastItem(i6)).S(tables);
                                } catch (RemoteException e9) {
                                    Log.w("ROOM", "Error invoking a remote callback", e9);
                                }
                            }
                            i6++;
                        } finally {
                            multiInstanceInvalidationService3.f5265v.finishBroadcast();
                        }
                    }
                    return true;
                }
        }
    }

    public f(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f5561u = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
