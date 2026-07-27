package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* loaded from: classes.dex */
public final class Z0 extends AbstractBinderC3186f8 implements C0 {

    /* renamed from: n, reason: collision with root package name */
    public final k2.u f39994n;

    public Z0(k2.u uVar) {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
        this.f39994n = uVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            c();
        } else if (i == 2) {
            f();
        } else if (i == 3) {
            e();
        } else if (i == 4) {
            g();
        } else {
            if (i != 5) {
                return false;
            }
            boolean a9 = AbstractC3241g8.a(parcel);
            AbstractC3241g8.f(parcel);
            y2(a9);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.C0
    public final void c() {
        this.f39994n.onVideoStart();
    }

    @Override // q2.C0
    public final void e() {
        this.f39994n.onVideoPause();
    }

    @Override // q2.C0
    public final void f() {
        this.f39994n.onVideoPlay();
    }

    @Override // q2.C0
    public final void g() {
        this.f39994n.onVideoEnd();
    }

    @Override // q2.C0
    public final void y2(boolean z8) {
        this.f39994n.onVideoMute(z8);
    }
}
