package com.google.android.gms.identitycredentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* loaded from: classes4.dex */
public interface IIdentityCredentialService extends IInterface {

    public abstract class Stub extends zzb implements IIdentityCredentialService {
        public static final /* synthetic */ int $r8$clinit = 0;

        public final class Proxy implements IIdentityCredentialService, IInterface {
            public final IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.mRemote;
            }

            public final void transactAndReadExceptionReturnVoid(Parcel parcel, int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    this.mRemote.transact(i, parcel, obtain, 0);
                    obtain.readException();
                } finally {
                    parcel.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
