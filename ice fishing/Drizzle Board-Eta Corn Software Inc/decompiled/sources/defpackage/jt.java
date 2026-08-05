package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jt extends Binder implements om {
    public final /* synthetic */ MultiInstanceInvalidationService MdtA4re8;

    public jt(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.MdtA4re8 = multiInstanceInvalidationService;
        attachInterface(this, om.NCTxEWno);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        kt ktVar;
        String str = om.NCTxEWno;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        nm nmVar = null;
        nm nmVar2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(nm.qoPGr6Ce);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof nm)) {
                    mm mmVar = new mm();
                    mmVar.MdtA4re8 = readStrongBinder;
                    nmVar = mmVar;
                } else {
                    nmVar = (nm) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            nmVar.getClass();
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.MdtA4re8;
                synchronized (multiInstanceInvalidationService.wxUZMvaN) {
                    try {
                        int i4 = multiInstanceInvalidationService.NCTxEWno + 1;
                        multiInstanceInvalidationService.NCTxEWno = i4;
                        if (multiInstanceInvalidationService.wxUZMvaN.register(nmVar, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.MdtA4re8.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.NCTxEWno--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(nm.qoPGr6Ce);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof nm)) {
                    mm mmVar2 = new mm();
                    mmVar2.MdtA4re8 = readStrongBinder2;
                    nmVar2 = mmVar2;
                } else {
                    nmVar2 = (nm) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            nmVar2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.MdtA4re8;
            synchronized (multiInstanceInvalidationService2.wxUZMvaN) {
                multiInstanceInvalidationService2.wxUZMvaN.unregister(nmVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int readInt2 = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        createStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.MdtA4re8;
        synchronized (multiInstanceInvalidationService3.wxUZMvaN) {
            String str2 = (String) multiInstanceInvalidationService3.MdtA4re8.get(Integer.valueOf(readInt2));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = multiInstanceInvalidationService3.wxUZMvaN.beginBroadcast();
                while (true) {
                    ktVar = multiInstanceInvalidationService3.wxUZMvaN;
                    if (i3 >= beginBroadcast) {
                        break;
                    }
                    try {
                        Object broadcastCookie = ktVar.getBroadcastCookie(i3);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.MdtA4re8.get(num);
                        if (readInt2 != intValue && str2.equals(str3)) {
                            try {
                                ((nm) multiInstanceInvalidationService3.wxUZMvaN.getBroadcastItem(i3)).qoPGr6Ce(createStringArray);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i3++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService3.wxUZMvaN.finishBroadcast();
                        throw th2;
                    }
                }
                ktVar.finishBroadcast();
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
