package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* loaded from: classes.dex */
public abstract class C extends AbstractBinderC3336i8 implements D {
    public C() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            c1 c1Var = (c1) AbstractC3388j8.b(parcel, c1.CREATOR);
            AbstractC3388j8.f(parcel);
            y2(c1Var);
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
            boolean h9 = h();
            parcel2.writeNoException();
            ClassLoader classLoader = AbstractC3388j8.f31199a;
            parcel2.writeInt(h9 ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String g4 = g();
            parcel2.writeNoException();
            parcel2.writeString(g4);
            return true;
        }
        if (i != 5) {
            return false;
        }
        c1 c1Var2 = (c1) AbstractC3388j8.b(parcel, c1.CREATOR);
        int readInt = parcel.readInt();
        AbstractC3388j8.f(parcel);
        c1(c1Var2, readInt);
        parcel2.writeNoException();
        return true;
    }
}
