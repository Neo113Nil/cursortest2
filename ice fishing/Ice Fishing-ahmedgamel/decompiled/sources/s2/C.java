package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* loaded from: classes.dex */
public abstract class C extends AbstractBinderC3359i8 implements D {
    public C() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            c1 c1Var = (c1) AbstractC3411j8.b(parcel, c1.CREATOR);
            AbstractC3411j8.f(parcel);
            j3(c1Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String e9 = e();
            parcel2.writeNoException();
            parcel2.writeString(e9);
            return true;
        }
        if (i == 3) {
            boolean h3 = h();
            parcel2.writeNoException();
            ClassLoader classLoader = AbstractC3411j8.f31986a;
            parcel2.writeInt(h3 ? 1 : 0);
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
        c1 c1Var2 = (c1) AbstractC3411j8.b(parcel, c1.CREATOR);
        int readInt = parcel.readInt();
        AbstractC3411j8.f(parcel);
        A3(c1Var2, readInt);
        parcel2.writeNoException();
        return true;
    }
}
