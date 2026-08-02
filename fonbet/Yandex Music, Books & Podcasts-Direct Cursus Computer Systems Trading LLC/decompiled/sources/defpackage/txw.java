package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class txw extends h8s {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public txw(q5i q5iVar, i6c[] i6cVarArr, boolean z, int i) {
        this.d = 0;
        this.e = q5iVar;
        this.c = i6cVarArr;
        boolean z2 = false;
        if (i6cVarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.a = i;
    }

    @Override // defpackage.h8s
    public final void b(fo0 fo0Var, i8s i8sVar) {
        Parcel obtain;
        int i = this.d;
        Status status = Status.g;
        int i2 = 1;
        Object obj = this.e;
        int i3 = 0;
        switch (i) {
            case 0:
                ((pun) ((q5i) obj).c).accept(fo0Var, i8sVar);
                return;
            case 1:
                bnx bnxVar = (bnx) fo0Var;
                sye syeVar = (sye) obj;
                bnxVar.getClass();
                vnx vnxVar = new vnx(i3, i8sVar);
                try {
                    okx okxVar = (okx) bnxVar.s();
                    Bundle B = bnxVar.B();
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i4 = b7x.a;
                    obtain.writeInt(1);
                    syeVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(vnxVar);
                    try {
                        okxVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } finally {
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                    Bundle bundle = Bundle.EMPTY;
                    uwf.B(status, Boolean.FALSE, vnxVar.i);
                    return;
                }
            default:
                bnx bnxVar2 = (bnx) fo0Var;
                lek lekVar = (lek) obj;
                Bundle B2 = bnxVar2.B();
                B2.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                vnx vnxVar2 = new vnx(i2, i8sVar);
                try {
                    okx okxVar2 = (okx) bnxVar2.s();
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i5 = b7x.a;
                    obtain.writeInt(1);
                    lekVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B2.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(vnxVar2);
                    try {
                        okxVar2.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } finally {
                    }
                } catch (RemoteException e2) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e2);
                    Bundle bundle2 = Bundle.EMPTY;
                    vnxVar2.O0(status, null);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ txw(l9 l9Var, int i) {
        super(0);
        this.d = i;
        this.e = l9Var;
    }
}
