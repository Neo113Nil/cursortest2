package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* renamed from: q2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4926z extends AbstractBinderC3186f8 implements InterfaceC4873A {
    public AbstractBinderC4926z() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            z();
        } else {
            if (i != 2) {
                return false;
            }
            C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
            AbstractC3241g8.f(parcel);
            U(c4927z0);
        }
        parcel2.writeNoException();
        return true;
    }
}
