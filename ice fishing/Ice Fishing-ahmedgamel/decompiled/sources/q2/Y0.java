package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* loaded from: classes.dex */
public final class Y0 extends AbstractBinderC3336i8 implements C0 {

    /* renamed from: n, reason: collision with root package name */
    public final k2.u f40085n;

    public Y0(k2.u uVar) {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
        this.f40085n = uVar;
    }

    @Override // q2.C0
    public final void C2(boolean z3) {
        this.f40085n.onVideoMute(z3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
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
            boolean a9 = AbstractC3388j8.a(parcel);
            AbstractC3388j8.f(parcel);
            C2(a9);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.C0
    public final void d() {
        this.f40085n.onVideoStart();
    }

    @Override // q2.C0
    public final void e() {
        this.f40085n.onVideoPlay();
    }

    @Override // q2.C0
    public final void g() {
        this.f40085n.onVideoEnd();
    }

    @Override // q2.C0
    public final void h() {
        this.f40085n.onVideoPause();
    }
}
