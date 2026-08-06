package defpackage;

/* loaded from: classes.dex */
public final class lk0 extends android.os.Binder implements defpackage.q40 {
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService r1MBDhnF;

    public lk0(androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.r1MBDhnF = multiInstanceInvalidationService;
        attachInterface(this, defpackage.q40.oh6vYeIP);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        defpackage.mk0 mk0Var;
        java.lang.String str = defpackage.q40.oh6vYeIP;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        defpackage.p40 p40Var = null;
        defpackage.p40 p40Var2 = null;
        if (i == 1) {
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(defpackage.p40.IHQe1A4L2xu);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof defpackage.p40)) {
                    defpackage.o40 o40Var = new defpackage.o40();
                    o40Var.r1MBDhnF = readStrongBinder;
                    p40Var = o40Var;
                } else {
                    p40Var = (defpackage.p40) queryLocalInterface;
                }
            }
            java.lang.String readString = parcel.readString();
            p40Var.getClass();
            if (readString != null) {
                androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = this.r1MBDhnF;
                synchronized (multiInstanceInvalidationService.AARZUJiTa) {
                    try {
                        int i4 = multiInstanceInvalidationService.adDC3e2L + 1;
                        multiInstanceInvalidationService.adDC3e2L = i4;
                        if (multiInstanceInvalidationService.AARZUJiTa.register(p40Var, java.lang.Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.xiZrDbcSW0.put(java.lang.Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.adDC3e2L--;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(defpackage.p40.IHQe1A4L2xu);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof defpackage.p40)) {
                    defpackage.o40 o40Var2 = new defpackage.o40();
                    o40Var2.r1MBDhnF = readStrongBinder2;
                    p40Var2 = o40Var2;
                } else {
                    p40Var2 = (defpackage.p40) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            p40Var2.getClass();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.r1MBDhnF;
            synchronized (multiInstanceInvalidationService2.AARZUJiTa) {
                multiInstanceInvalidationService2.AARZUJiTa.unregister(p40Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int readInt2 = parcel.readInt();
        java.lang.String[] createStringArray = parcel.createStringArray();
        createStringArray.getClass();
        androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.r1MBDhnF;
        synchronized (multiInstanceInvalidationService3.AARZUJiTa) {
            java.lang.String str2 = (java.lang.String) multiInstanceInvalidationService3.xiZrDbcSW0.get(java.lang.Integer.valueOf(readInt2));
            if (str2 == null) {
                android.util.Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = multiInstanceInvalidationService3.AARZUJiTa.beginBroadcast();
                while (true) {
                    mk0Var = multiInstanceInvalidationService3.AARZUJiTa;
                    if (i3 >= beginBroadcast) {
                        break;
                    }
                    try {
                        java.lang.Object broadcastCookie = mk0Var.getBroadcastCookie(i3);
                        broadcastCookie.getClass();
                        java.lang.Integer num = (java.lang.Integer) broadcastCookie;
                        int intValue = num.intValue();
                        java.lang.String str3 = (java.lang.String) multiInstanceInvalidationService3.xiZrDbcSW0.get(num);
                        if (readInt2 != intValue && str2.equals(str3)) {
                            try {
                                ((defpackage.p40) multiInstanceInvalidationService3.AARZUJiTa.getBroadcastItem(i3)).IHQe1A4L2xu(createStringArray);
                            } catch (android.os.RemoteException e) {
                                android.util.Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i3++;
                    } catch (java.lang.Throwable th2) {
                        multiInstanceInvalidationService3.AARZUJiTa.finishBroadcast();
                        throw th2;
                    }
                }
                mk0Var.finishBroadcast();
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }
}
