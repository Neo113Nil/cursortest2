package h;

import O.C0335e0;
import O.X;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37938n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4537A f37939u;

    public /* synthetic */ q(LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A, int i) {
        this.f37938n = i;
        this.f37939u = layoutInflaterFactory2C4537A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f37938n) {
            case 0:
                LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = this.f37939u;
                if ((layoutInflaterFactory2C4537A.f37783A0 & 1) != 0) {
                    layoutInflaterFactory2C4537A.w(0);
                }
                if ((layoutInflaterFactory2C4537A.f37783A0 & 4096) != 0) {
                    layoutInflaterFactory2C4537A.w(108);
                }
                layoutInflaterFactory2C4537A.f37828z0 = false;
                layoutInflaterFactory2C4537A.f37783A0 = 0;
                break;
            default:
                LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A2 = this.f37939u;
                layoutInflaterFactory2C4537A2.f37802P.showAtLocation(layoutInflaterFactory2C4537A2.f37801O, 55, 0, 0);
                C0335e0 c0335e0 = layoutInflaterFactory2C4537A2.f37804R;
                if (c0335e0 != null) {
                    c0335e0.b();
                }
                if (!(layoutInflaterFactory2C4537A2.f37805S && (viewGroup = layoutInflaterFactory2C4537A2.f37806T) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C4537A2.f37801O.setAlpha(1.0f);
                    layoutInflaterFactory2C4537A2.f37801O.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C4537A2.f37801O.setAlpha(0.0f);
                    C0335e0 a9 = X.a(layoutInflaterFactory2C4537A2.f37801O);
                    a9.a(1.0f);
                    layoutInflaterFactory2C4537A2.f37804R = a9;
                    a9.d(new s(0, this));
                    break;
                }
        }
    }
}
