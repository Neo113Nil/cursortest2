package x0;

import D0.m;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import j0.C0966a;
import n0.j;

/* loaded from: classes.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D0.d f8532a;

    public f(D0.d dVar) {
        this.f8532a = dVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i4 = AbstractC1064a.f8524a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        j0.b createFromParcel2 = parcel.readInt() == 0 ? null : j0.b.CREATOR.createFromParcel(parcel);
        C0966a c0966a = createFromParcel2 != null ? new C0966a(createFromParcel2.f8030a, createFromParcel2.f8031b) : null;
        int i5 = createFromParcel.f2680a;
        m mVar = this.f8532a.f210a;
        if (i5 <= 0) {
            mVar.f(c0966a);
            return true;
        }
        mVar.e(createFromParcel.f2682c != null ? new j(createFromParcel) : new n0.d(createFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
