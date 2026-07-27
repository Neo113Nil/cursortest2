package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;

/* renamed from: q2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4902q extends AbstractBinderC3336i8 implements InterfaceC4909u {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4870a f40203n;

    public BinderC4902q(InterfaceC4870a interfaceC4870a) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f40203n = interfaceC4870a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        t();
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.InterfaceC4909u
    public final void t() {
        this.f40203n.onAdClicked();
    }
}
