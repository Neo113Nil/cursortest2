package defpackage;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class pww extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public pww(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    public abstract boolean L0(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean M0(int i, Parcel parcel, Parcel parcel2);

    public boolean Q0(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean R0(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x017b, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0222, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L78;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        switch (this.a) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return L0(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return M0(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return R0(i, parcel, parcel2);
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return Q0(i, parcel, parcel2);
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return Q0(i, parcel, parcel2);
            case 5:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                cix cixVar = (cix) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i3 = f5x.a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail > 0) {
                        throw new BadParcelableException(k5r.i(dataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    cixVar.T0(bundle);
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i4 = f5x.a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                    int dataAvail2 = parcel.dataAvail();
                    if (dataAvail2 > 0) {
                        throw new BadParcelableException(k5r.i(dataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    cixVar.S0(bundle2);
                }
                return true;
            case 6:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                ubx ubxVar = (ubx) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                int i5 = g5x.a;
                Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                int dataAvail3 = parcel.dataAvail();
                if (dataAvail3 > 0) {
                    throw new BadParcelableException(k5r.i(dataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                zlx zlxVar = ubxVar.j.a;
                if (zlxVar != null) {
                    i8s i8sVar = ubxVar.i;
                    synchronized (zlxVar.f) {
                        zlxVar.e.remove(i8sVar);
                    }
                    synchronized (zlxVar.f) {
                        try {
                            if (zlxVar.k.get() <= 0 || zlxVar.k.decrementAndGet() <= 0) {
                                zlxVar.a().post(new chx(r3 ? 1 : 0, zlxVar));
                            } else {
                                zlxVar.b.f("Leaving the connection open for other ongoing calls.", new Object[0]);
                            }
                        } finally {
                        }
                    }
                }
                ubxVar.h.f("onGetLaunchReviewFlowInfo", new Object[0]);
                ubxVar.i.d(new yzw((PendingIntent) bundle3.get("confirmation_intent"), bundle3.getBoolean("is_review_no_op")));
                return true;
            default:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (!z) {
                    switch (i) {
                        case 1:
                            parcel.readInt();
                            break;
                        case 2:
                            parcel.readInt();
                            break;
                        case 3:
                            int readInt = parcel.readInt();
                            int i6 = b7x.a;
                            r3 = parcel.readInt() != 0;
                            N0(readInt, r3);
                            break;
                        case 4:
                            parcel.readInt();
                            break;
                        case 5:
                        default:
                            return false;
                        case 6:
                            parcel.readInt();
                            int i7 = b7x.a;
                            parcel.readInt();
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            Status status = (Status) b7x.a(parcel, Status.CREATOR);
                            boolean z2 = parcel.readInt() != 0;
                            P0(status, z2);
                            break;
                        case 10:
                            break;
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        case 14:
                            Status status2 = (Status) b7x.a(parcel, Status.CREATOR);
                            kek kekVar = (kek) b7x.a(parcel, kek.CREATOR);
                            O0(status2, kekVar);
                            break;
                        case 15:
                            break;
                        case 16:
                            break;
                    }
                }
                return true;
        }
    }

    public pww() {
        this.a = 7;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public /* synthetic */ pww(int i) {
        this.a = i;
    }

    public void N0(int i, boolean z) {
    }

    public void O0(Status status, kek kekVar) {
    }

    public void P0(Status status, boolean z) {
    }
}
