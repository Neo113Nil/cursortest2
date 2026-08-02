package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;

/* renamed from: s2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4951q extends AbstractBinderC3359i8 implements InterfaceC4958u {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4919a f40505n;

    public BinderC4951q(InterfaceC4919a interfaceC4919a) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f40505n = interfaceC4919a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        t();
        parcel2.writeNoException();
        return true;
    }

    @Override // s2.InterfaceC4958u
    public final void t() {
        this.f40505n.onAdClicked();
    }
}
