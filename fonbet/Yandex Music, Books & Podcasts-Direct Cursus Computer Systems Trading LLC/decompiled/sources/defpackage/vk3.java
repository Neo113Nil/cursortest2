package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* loaded from: classes.dex */
public final class vk3 extends Binder {
    public static final int h;
    public final yde a;

    static {
        h = dvt.a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : SQLiteDatabase.OPEN_FULLMUTEX;
    }

    public vk3(List list) {
        this.a = yde.v(list);
    }

    public static yde a(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof vk3) {
            return ((vk3) iBinder).a;
        }
        tde u = yde.u();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            u.a(readBundle);
                            i++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i2 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return u.f();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        yde ydeVar = this.a;
        int size = ydeVar.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < h) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) ydeVar.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }
}
