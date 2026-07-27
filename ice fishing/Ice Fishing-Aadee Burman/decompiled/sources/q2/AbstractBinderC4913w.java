package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* renamed from: q2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4913w extends AbstractBinderC3336i8 implements InterfaceC4915x {
    public AbstractBinderC4913w() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                t();
                break;
            case 2:
                int readInt = parcel.readInt();
                AbstractC3388j8.f(parcel);
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
                C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
                AbstractC3388j8.f(parcel);
                G(c4920z0);
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
