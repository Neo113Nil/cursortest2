package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* renamed from: q2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4919z extends AbstractBinderC3336i8 implements InterfaceC4868A {
    public AbstractBinderC4919z() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            t();
        } else {
            if (i != 2) {
                return false;
            }
            C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
            AbstractC3388j8.f(parcel);
            P1(c4920z0);
        }
        parcel2.writeNoException();
        return true;
    }
}
