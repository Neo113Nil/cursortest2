package com.gamericefishpro.space.h9;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.sa.j;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends Binder implements IInterface {
    public final /* synthetic */ int d = 1;

    public /* synthetic */ h() {
    }

    public boolean E(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.d;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 1;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return E(i, parcel, parcel2);
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                com.gamericefishpro.space.qa.f fVar = (com.gamericefishpro.space.qa.f) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i4 = j.a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(com.gamericefishpro.space.m5.a.g(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                com.gamericefishpro.space.sa.d dVar = fVar.g.d;
                com.gamericefishpro.space.r9.h hVar = fVar.f;
                synchronized (dVar.f) {
                    dVar.e.remove(hVar);
                    break;
                }
                dVar.a().post(new com.gamericefishpro.space.sa.b(i3, dVar));
                fVar.e.a("onRequestIntegrityToken", new Object[0]);
                fVar.g.c.getClass();
                int i5 = bundle.getInt("error");
                com.gamericefishpro.space.qa.a aVar = i5 == 0 ? null : new com.gamericefishpro.space.qa.a(i5, null);
                if (aVar != null) {
                    fVar.f.b(aVar);
                    return true;
                }
                String string = bundle.getString("token");
                if (string == null) {
                    fVar.f.b(new com.gamericefishpro.space.qa.a(-100, null));
                    return true;
                }
                bundle.getLong("request.token.sid");
                String str = fVar.g.b;
                ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("IntegrityDialogWrapper");
                fVar.f.c(new com.gamericefishpro.space.qa.j(string));
                return true;
        }
    }

    public h(String str) {
        attachInterface(this, str);
    }
}
