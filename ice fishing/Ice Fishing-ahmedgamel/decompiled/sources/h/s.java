package h;

import O.X;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.internal.ads.LP;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s extends Z2.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f37942f;

    public /* synthetic */ s(int i, Object obj) {
        this.f37941e = i;
        this.f37942f = obj;
    }

    @Override // Z2.d, O.f0
    public void b() {
        Object obj = this.f37942f;
        switch (this.f37941e) {
            case 0:
                ((q) obj).f37939u.f37801O.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) obj;
                layoutInflaterFactory2C4537A.f37801O.setVisibility(0);
                if (layoutInflaterFactory2C4537A.f37801O.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C4537A.f37801O.getParent();
                    WeakHashMap weakHashMap = X.f2142a;
                    O.J.c(view);
                    break;
                }
                break;
        }
    }

    @Override // O.f0
    public final void c() {
        Object obj = this.f37942f;
        switch (this.f37941e) {
            case 0:
                LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = ((q) obj).f37939u;
                layoutInflaterFactory2C4537A.f37801O.setAlpha(1.0f);
                layoutInflaterFactory2C4537A.f37804R.d(null);
                layoutInflaterFactory2C4537A.f37804R = null;
                break;
            case 1:
                LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A2 = (LayoutInflaterFactory2C4537A) obj;
                layoutInflaterFactory2C4537A2.f37801O.setAlpha(1.0f);
                layoutInflaterFactory2C4537A2.f37804R.d(null);
                layoutInflaterFactory2C4537A2.f37804R = null;
                break;
            default:
                LP lp = (LP) obj;
                ((LayoutInflaterFactory2C4537A) lp.f26917v).f37801O.setVisibility(8);
                LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A3 = (LayoutInflaterFactory2C4537A) lp.f26917v;
                PopupWindow popupWindow = layoutInflaterFactory2C4537A3.f37802P;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C4537A3.f37801O.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C4537A3.f37801O.getParent();
                    WeakHashMap weakHashMap = X.f2142a;
                    O.J.c(view);
                }
                layoutInflaterFactory2C4537A3.f37801O.e();
                layoutInflaterFactory2C4537A3.f37804R.d(null);
                layoutInflaterFactory2C4537A3.f37804R = null;
                ViewGroup viewGroup = layoutInflaterFactory2C4537A3.f37806T;
                WeakHashMap weakHashMap2 = X.f2142a;
                O.J.c(viewGroup);
                break;
        }
    }
}
