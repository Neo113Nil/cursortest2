package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* renamed from: q2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4875C extends AbstractBinderC3186f8 implements InterfaceC4876D {
    public AbstractBinderC4875C() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            d1 d1Var = (d1) AbstractC3241g8.b(parcel, d1.CREATOR);
            AbstractC3241g8.f(parcel);
            f0(d1Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String f6 = f();
            parcel2.writeNoException();
            parcel2.writeString(f6);
            return true;
        }
        if (i == 3) {
            boolean e6 = e();
            parcel2.writeNoException();
            ClassLoader classLoader = AbstractC3241g8.f30958a;
            parcel2.writeInt(e6 ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String g9 = g();
            parcel2.writeNoException();
            parcel2.writeString(g9);
            return true;
        }
        if (i != 5) {
            return false;
        }
        d1 d1Var2 = (d1) AbstractC3241g8.b(parcel, d1.CREATOR);
        int readInt = parcel.readInt();
        AbstractC3241g8.f(parcel);
        b1(d1Var2, readInt);
        parcel2.writeNoException();
        return true;
    }
}
