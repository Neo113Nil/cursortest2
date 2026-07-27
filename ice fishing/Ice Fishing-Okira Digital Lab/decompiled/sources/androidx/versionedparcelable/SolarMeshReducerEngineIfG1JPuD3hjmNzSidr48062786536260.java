package androidx.versionedparcelable;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class SolarMeshReducerEngineIfG1JPuD3hjmNzSidr48062786536260 implements IInterface {
    public final IBinder ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public SolarMeshReducerEngineIfG1JPuD3hjmNzSidr48062786536260(IBinder iBinder) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = iBinder;
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(XenoGridStorageAbstractionQDA8xr16Q9woa1GZBk33246372108186 xenoGridStorageAbstractionQDA8xr16Q9woa1GZBk33246372108186, BlazePulseSerializationMacroD0tb0Je7UB7a1w5j0U62092825741563 blazePulseSerializationMacroD0tb0Je7UB7a1w5j0U62092825741563) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(xenoGridStorageAbstractionQDA8xr16Q9woa1GZBk33246372108186);
            obtain.writeInt(1);
            EmeraldStackCoordinatorFrameworkMcmhq9zBRhabvCqI6L54429333500827.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(blazePulseSerializationMacroD0tb0Je7UB7a1w5j0U62092825741563, obtain, 0);
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    }
}
