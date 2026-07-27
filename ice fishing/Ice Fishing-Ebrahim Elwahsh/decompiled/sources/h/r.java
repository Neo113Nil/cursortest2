package h;

import O.C0343e0;
import O.X;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38127n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4535B f38128u;

    public /* synthetic */ r(LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B, int i) {
        this.f38127n = i;
        this.f38128u = layoutInflaterFactory2C4535B;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f38127n) {
            case 0:
                LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = this.f38128u;
                if ((layoutInflaterFactory2C4535B.f37978F0 & 1) != 0) {
                    layoutInflaterFactory2C4535B.w(0);
                }
                if ((layoutInflaterFactory2C4535B.f37978F0 & 4096) != 0) {
                    layoutInflaterFactory2C4535B.w(108);
                }
                layoutInflaterFactory2C4535B.f37976E0 = false;
                layoutInflaterFactory2C4535B.f37978F0 = 0;
                break;
            default:
                LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B2 = this.f38128u;
                layoutInflaterFactory2C4535B2.f37994P.showAtLocation(layoutInflaterFactory2C4535B2.f37993O, 55, 0, 0);
                C0343e0 c0343e0 = layoutInflaterFactory2C4535B2.f37996R;
                if (c0343e0 != null) {
                    c0343e0.b();
                }
                if (!(layoutInflaterFactory2C4535B2.f37997S && (viewGroup = layoutInflaterFactory2C4535B2.f37998T) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C4535B2.f37993O.setAlpha(1.0f);
                    layoutInflaterFactory2C4535B2.f37993O.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C4535B2.f37993O.setAlpha(0.0f);
                    C0343e0 a9 = X.a(layoutInflaterFactory2C4535B2.f37993O);
                    a9.a(1.0f);
                    layoutInflaterFactory2C4535B2.f37996R = a9;
                    a9.d(new t(0, this));
                    break;
                }
        }
    }
}
