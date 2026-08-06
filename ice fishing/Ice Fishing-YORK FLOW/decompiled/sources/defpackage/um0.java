package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class um0 extends android.os.Binder implements defpackage.d60 {
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService fWTAfUmVKrZq;

    public um0(androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.fWTAfUmVKrZq = multiInstanceInvalidationService;
        attachInterface(this, defpackage.d60.giKS3J6vZuNy);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        defpackage.vm0 vm0Var;
        java.lang.String str = defpackage.d60.giKS3J6vZuNy;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        defpackage.c60 c60Var = null;
        defpackage.c60 c60Var2 = null;
        if (i == 1) {
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(defpackage.c60.ZpBGe2uQfcn8);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof defpackage.c60)) {
                    defpackage.b60 b60Var = new defpackage.b60();
                    b60Var.fWTAfUmVKrZq = readStrongBinder;
                    c60Var = b60Var;
                } else {
                    c60Var = (defpackage.c60) queryLocalInterface;
                }
            }
            java.lang.String readString = parcel.readString();
            c60Var.getClass();
            if (readString != null) {
                androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = this.fWTAfUmVKrZq;
                synchronized (multiInstanceInvalidationService.QiMR8OkAhezm) {
                    try {
                        int i4 = multiInstanceInvalidationService.WDYagTQQm9ns + 1;
                        multiInstanceInvalidationService.WDYagTQQm9ns = i4;
                        if (multiInstanceInvalidationService.QiMR8OkAhezm.register(c60Var, java.lang.Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.oh71FJcDz6S2.put(java.lang.Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.WDYagTQQm9ns--;
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
                android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(defpackage.c60.ZpBGe2uQfcn8);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof defpackage.c60)) {
                    defpackage.b60 b60Var2 = new defpackage.b60();
                    b60Var2.fWTAfUmVKrZq = readStrongBinder2;
                    c60Var2 = b60Var2;
                } else {
                    c60Var2 = (defpackage.c60) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            c60Var2.getClass();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.fWTAfUmVKrZq;
            synchronized (multiInstanceInvalidationService2.QiMR8OkAhezm) {
                multiInstanceInvalidationService2.QiMR8OkAhezm.unregister(c60Var2);
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
        androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.fWTAfUmVKrZq;
        synchronized (multiInstanceInvalidationService3.QiMR8OkAhezm) {
            java.lang.String str2 = (java.lang.String) multiInstanceInvalidationService3.oh71FJcDz6S2.get(java.lang.Integer.valueOf(readInt2));
            if (str2 == null) {
                android.util.Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = multiInstanceInvalidationService3.QiMR8OkAhezm.beginBroadcast();
                while (true) {
                    vm0Var = multiInstanceInvalidationService3.QiMR8OkAhezm;
                    if (i3 >= beginBroadcast) {
                        break;
                    }
                    try {
                        java.lang.Object broadcastCookie = vm0Var.getBroadcastCookie(i3);
                        broadcastCookie.getClass();
                        java.lang.Integer num = (java.lang.Integer) broadcastCookie;
                        int intValue = num.intValue();
                        java.lang.String str3 = (java.lang.String) multiInstanceInvalidationService3.oh71FJcDz6S2.get(num);
                        if (readInt2 != intValue && str2.equals(str3)) {
                            try {
                                ((defpackage.c60) multiInstanceInvalidationService3.QiMR8OkAhezm.getBroadcastItem(i3)).ZpBGe2uQfcn8(createStringArray);
                            } catch (android.os.RemoteException e) {
                                android.util.Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i3++;
                    } catch (java.lang.Throwable th2) {
                        multiInstanceInvalidationService3.QiMR8OkAhezm.finishBroadcast();
                        throw th2;
                    }
                }
                vm0Var.finishBroadcast();
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }
}
