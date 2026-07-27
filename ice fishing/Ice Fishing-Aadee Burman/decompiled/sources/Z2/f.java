package Z2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;
import j3.h;
import u0.C5054d;

/* loaded from: classes2.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4173n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4174u;

    public f(h hVar) {
        this.f4174u = hVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f4173n;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0157, code lost:
    
        if (super.onTransact(r8, r9, r10, r11) != false) goto L92;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i6) {
        C5054d callback = null;
        C5054d callback2 = null;
        int i9 = 0;
        switch (this.f4173n) {
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
                int i10 = a.f4165a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                I2.c createFromParcel2 = parcel.readInt() == 0 ? null : I2.c.CREATOR.createFromParcel(parcel);
                I2.b bVar = createFromParcel2 != null ? new I2.b(createFromParcel2.f1289n, createFromParcel2.f1290u) : null;
                int i11 = createFromParcel.f23615n;
                h hVar = (h) this.f4174u;
                if (i11 <= 0) {
                    hVar.b(bVar);
                } else {
                    hVar.a(new N2.f(createFromParcel));
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
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C5054d)) {
                            callback2 = new C5054d();
                            callback2.f40997n = readStrongBinder;
                        } else {
                            callback2 = (C5054d) queryLocalInterface;
                        }
                    }
                    String readString = parcel.readString();
                    kotlin.jvm.internal.h.e(callback2, "callback");
                    if (readString != null) {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f4174u;
                        synchronized (multiInstanceInvalidationService.f5299v) {
                            try {
                                int i12 = multiInstanceInvalidationService.f5297n + 1;
                                multiInstanceInvalidationService.f5297n = i12;
                                if (multiInstanceInvalidationService.f5299v.register(callback2, Integer.valueOf(i12))) {
                                    multiInstanceInvalidationService.f5298u.put(Integer.valueOf(i12), readString);
                                    i9 = i12;
                                } else {
                                    multiInstanceInvalidationService.f5297n--;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i9);
                    return true;
                }
                if (i == 2) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C5054d)) {
                            callback = new C5054d();
                            callback.f40997n = readStrongBinder2;
                        } else {
                            callback = (C5054d) queryLocalInterface2;
                        }
                    }
                    int readInt = parcel.readInt();
                    kotlin.jvm.internal.h.e(callback, "callback");
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = (MultiInstanceInvalidationService) this.f4174u;
                    synchronized (multiInstanceInvalidationService2.f5299v) {
                        multiInstanceInvalidationService2.f5299v.unregister(callback);
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i6);
                }
                int readInt2 = parcel.readInt();
                String[] tables = parcel.createStringArray();
                kotlin.jvm.internal.h.e(tables, "tables");
                MultiInstanceInvalidationService multiInstanceInvalidationService3 = (MultiInstanceInvalidationService) this.f4174u;
                synchronized (multiInstanceInvalidationService3.f5299v) {
                    String str = (String) multiInstanceInvalidationService3.f5298u.get(Integer.valueOf(readInt2));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return true;
                    }
                    int beginBroadcast = multiInstanceInvalidationService3.f5299v.beginBroadcast();
                    while (i9 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f5299v.getBroadcastCookie(i9);
                            kotlin.jvm.internal.h.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService3.f5298u.get(num);
                            if (readInt2 != intValue && str.equals(str2)) {
                                try {
                                    ((C5054d) multiInstanceInvalidationService3.f5299v.getBroadcastItem(i9)).S(tables);
                                } catch (RemoteException e9) {
                                    Log.w("ROOM", "Error invoking a remote callback", e9);
                                }
                            }
                            i9++;
                        } finally {
                            multiInstanceInvalidationService3.f5299v.finishBroadcast();
                        }
                    }
                    return true;
                }
        }
    }

    public f(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f4174u = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
