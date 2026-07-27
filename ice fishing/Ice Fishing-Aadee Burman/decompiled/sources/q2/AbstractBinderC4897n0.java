package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* renamed from: q2.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4897n0 extends AbstractBinderC3336i8 implements InterfaceC4899o0 {
    public AbstractBinderC4897n0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
        AbstractC3388j8.f(parcel);
        o2(c4920z0);
        parcel2.writeNoException();
        return true;
    }
}
