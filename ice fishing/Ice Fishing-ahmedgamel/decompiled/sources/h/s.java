package h;

import O.X;
import a.AbstractC0422a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s extends AbstractC0422a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37916d;

    public /* synthetic */ s(int i, Object obj) {
        this.f37915c = i;
        this.f37916d = obj;
    }

    @Override // a.AbstractC0422a, O.f0
    public void b() {
        Object obj = this.f37916d;
        switch (this.f37915c) {
            case 0:
                ((q) obj).f37913u.f37780O.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = (LayoutInflaterFactory2C4533A) obj;
                layoutInflaterFactory2C4533A.f37780O.setVisibility(0);
                if (layoutInflaterFactory2C4533A.f37780O.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C4533A.f37780O.getParent();
                    WeakHashMap weakHashMap = X.f2054a;
                    O.J.c(view);
                    break;
                }
                break;
        }
    }

    @Override // O.f0
    public final void c() {
        Object obj = this.f37916d;
        switch (this.f37915c) {
            case 0:
                LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = ((q) obj).f37913u;
                layoutInflaterFactory2C4533A.f37780O.setAlpha(1.0f);
                layoutInflaterFactory2C4533A.f37783R.d(null);
                layoutInflaterFactory2C4533A.f37783R = null;
                break;
            case 1:
                LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A2 = (LayoutInflaterFactory2C4533A) obj;
                layoutInflaterFactory2C4533A2.f37780O.setAlpha(1.0f);
                layoutInflaterFactory2C4533A2.f37783R.d(null);
                layoutInflaterFactory2C4533A2.f37783R = null;
                break;
            default:
                S0.e eVar = (S0.e) obj;
                ((LayoutInflaterFactory2C4533A) eVar.f2782v).f37780O.setVisibility(8);
                LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A3 = (LayoutInflaterFactory2C4533A) eVar.f2782v;
                PopupWindow popupWindow = layoutInflaterFactory2C4533A3.f37781P;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C4533A3.f37780O.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C4533A3.f37780O.getParent();
                    WeakHashMap weakHashMap = X.f2054a;
                    O.J.c(view);
                }
                layoutInflaterFactory2C4533A3.f37780O.e();
                layoutInflaterFactory2C4533A3.f37783R.d(null);
                layoutInflaterFactory2C4533A3.f37783R = null;
                ViewGroup viewGroup = layoutInflaterFactory2C4533A3.f37785T;
                WeakHashMap weakHashMap2 = X.f2054a;
                O.J.c(viewGroup);
                break;
        }
    }
}
