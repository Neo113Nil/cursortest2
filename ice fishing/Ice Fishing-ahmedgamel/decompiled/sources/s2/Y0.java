package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* loaded from: classes.dex */
public final class Y0 extends AbstractBinderC3359i8 implements C0 {

    /* renamed from: n, reason: collision with root package name */
    public final m2.u f40384n;

    public Y0(m2.u uVar) {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
        this.f40384n = uVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            d();
        } else if (i == 2) {
            e();
        } else if (i == 3) {
            h();
        } else if (i == 4) {
            g();
        } else {
            if (i != 5) {
                return false;
            }
            boolean a9 = AbstractC3411j8.a(parcel);
            AbstractC3411j8.f(parcel);
            y2(a9);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // s2.C0
    public final void d() {
        this.f40384n.onVideoStart();
    }

    @Override // s2.C0
    public final void e() {
        this.f40384n.onVideoPlay();
    }

    @Override // s2.C0
    public final void g() {
        this.f40384n.onVideoEnd();
    }

    @Override // s2.C0
    public final void h() {
        this.f40384n.onVideoPause();
    }

    @Override // s2.C0
    public final void y2(boolean z6) {
        this.f40384n.onVideoMute(z6);
    }
}
