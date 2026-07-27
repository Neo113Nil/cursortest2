package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* renamed from: q2.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4904n0 extends AbstractBinderC3186f8 implements InterfaceC4906o0 {
    public AbstractBinderC4904n0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
        AbstractC3241g8.f(parcel);
        c0(c4927z0);
        parcel2.writeNoException();
        return true;
    }
}
