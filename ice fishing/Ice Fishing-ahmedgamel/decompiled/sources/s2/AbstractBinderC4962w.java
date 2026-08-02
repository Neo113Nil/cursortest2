package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* renamed from: s2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4962w extends AbstractBinderC3359i8 implements InterfaceC4964x {
    public AbstractBinderC4962w() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                t();
                break;
            case 2:
                int readInt = parcel.readInt();
                AbstractC3411j8.f(parcel);
                x(readInt);
                break;
            case 3:
                break;
            case 4:
                d();
                break;
            case 5:
                e();
                break;
            case 6:
                h();
                break;
            case 7:
                n();
                break;
            case 8:
                C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
                AbstractC3411j8.f(parcel);
                M(c4969z0);
                break;
            case 9:
                g();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
