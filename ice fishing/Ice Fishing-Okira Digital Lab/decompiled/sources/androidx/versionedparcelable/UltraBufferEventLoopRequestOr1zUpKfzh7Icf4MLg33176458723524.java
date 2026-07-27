package androidx.versionedparcelable;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class UltraBufferEventLoopRequestOr1zUpKfzh7Icf4MLg33176458723524 implements HeliosRuntimeClosureIteratorJWr00QBPRS866EpEHR37082290750388, IInterface {
    public final IBinder ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public UltraBufferEventLoopRequestOr1zUpKfzh7Icf4MLg33176458723524(IBinder iBinder) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = iBinder;
    }

    public final Account ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) MysticCacheNormalizationMonitorQdma9C7L7IpxYEKbeS75325100924362.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(obtain, Account.CREATOR);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    }
}
