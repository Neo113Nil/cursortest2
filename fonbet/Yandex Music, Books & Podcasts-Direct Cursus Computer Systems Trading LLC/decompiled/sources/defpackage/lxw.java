package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class lxw extends pww implements IInterface {
    public lxw() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
    }

    @Override // defpackage.pww
    public final boolean L0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                kxw.b(parcel);
                break;
            case 4:
                kxw.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                kxw.b(parcel);
                break;
            case 7:
                kxw.b(parcel);
                break;
            case 8:
                myw mywVar = (myw) kxw.a(parcel, myw.CREATOR);
                kxw.b(parcel);
                S0(mywVar);
                break;
            case 9:
                kxw.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract void S0(myw mywVar);
}
