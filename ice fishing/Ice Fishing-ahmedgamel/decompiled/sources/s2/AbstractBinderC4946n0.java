package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* renamed from: s2.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4946n0 extends AbstractBinderC3359i8 implements InterfaceC4948o0 {
    public AbstractBinderC4946n0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
        AbstractC3411j8.f(parcel);
        a3(c4969z0);
        parcel2.writeNoException();
        return true;
    }
}
