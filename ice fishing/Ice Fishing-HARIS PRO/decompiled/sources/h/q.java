package h;

import O.N;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0159B f3231b;

    public /* synthetic */ q(LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B, int i) {
        this.f3230a = i;
        this.f3231b = layoutInflaterFactory2C0159B;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f3230a) {
            case 0:
                LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = this.f3231b;
                if ((layoutInflaterFactory2C0159B.f3105Z & 1) != 0) {
                    layoutInflaterFactory2C0159B.u(0);
                }
                if ((layoutInflaterFactory2C0159B.f3105Z & 4096) != 0) {
                    layoutInflaterFactory2C0159B.u(108);
                }
                layoutInflaterFactory2C0159B.f3104Y = false;
                layoutInflaterFactory2C0159B.f3105Z = 0;
                break;
            default:
                LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B2 = this.f3231b;
                layoutInflaterFactory2C0159B2.f3125w.showAtLocation(layoutInflaterFactory2C0159B2.f3124v, 55, 0, 0);
                N n2 = layoutInflaterFactory2C0159B2.f3127y;
                if (n2 != null) {
                    n2.b();
                }
                if (!(layoutInflaterFactory2C0159B2.f3128z && (viewGroup = layoutInflaterFactory2C0159B2.f3081A) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0159B2.f3124v.setAlpha(1.0f);
                    layoutInflaterFactory2C0159B2.f3124v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0159B2.f3124v.setAlpha(RecyclerView.f2111C0);
                    N a2 = O.K.a(layoutInflaterFactory2C0159B2.f3124v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0159B2.f3127y = a2;
                    a2.d(new s(0, this));
                    break;
                }
        }
    }
}
