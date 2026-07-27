package h;

import O.C0330e0;
import O.X;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37912n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4533A f37913u;

    public /* synthetic */ q(LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A, int i) {
        this.f37912n = i;
        this.f37913u = layoutInflaterFactory2C4533A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f37912n) {
            case 0:
                LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = this.f37913u;
                if ((layoutInflaterFactory2C4533A.f37765F0 & 1) != 0) {
                    layoutInflaterFactory2C4533A.w(0);
                }
                if ((layoutInflaterFactory2C4533A.f37765F0 & 4096) != 0) {
                    layoutInflaterFactory2C4533A.w(108);
                }
                layoutInflaterFactory2C4533A.f37763E0 = false;
                layoutInflaterFactory2C4533A.f37765F0 = 0;
                break;
            default:
                LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A2 = this.f37913u;
                layoutInflaterFactory2C4533A2.f37781P.showAtLocation(layoutInflaterFactory2C4533A2.f37780O, 55, 0, 0);
                C0330e0 c0330e0 = layoutInflaterFactory2C4533A2.f37783R;
                if (c0330e0 != null) {
                    c0330e0.b();
                }
                if (!(layoutInflaterFactory2C4533A2.f37784S && (viewGroup = layoutInflaterFactory2C4533A2.f37785T) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C4533A2.f37780O.setAlpha(1.0f);
                    layoutInflaterFactory2C4533A2.f37780O.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C4533A2.f37780O.setAlpha(0.0f);
                    C0330e0 a9 = X.a(layoutInflaterFactory2C4533A2.f37780O);
                    a9.a(1.0f);
                    layoutInflaterFactory2C4533A2.f37783R = a9;
                    a9.d(new s(0, this));
                    break;
                }
        }
    }
}
