package h;

import O.AbstractC0049z;
import a.AbstractC0078a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s extends AbstractC0078a {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3234f;

    public /* synthetic */ s(int i, Object obj) {
        this.e = i;
        this.f3234f = obj;
    }

    @Override // O.O
    public final void a() {
        Object obj = this.f3234f;
        switch (this.e) {
            case 0:
                q qVar = (q) obj;
                qVar.f3231b.f3124v.setAlpha(1.0f);
                LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = qVar.f3231b;
                layoutInflaterFactory2C0159B.f3127y.d(null);
                layoutInflaterFactory2C0159B.f3127y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B2 = (LayoutInflaterFactory2C0159B) obj;
                layoutInflaterFactory2C0159B2.f3124v.setAlpha(1.0f);
                layoutInflaterFactory2C0159B2.f3127y.d(null);
                layoutInflaterFactory2C0159B2.f3127y = null;
                break;
            default:
                F.i iVar = (F.i) obj;
                ((LayoutInflaterFactory2C0159B) iVar.f209c).f3124v.setVisibility(8);
                LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B3 = (LayoutInflaterFactory2C0159B) iVar.f209c;
                PopupWindow popupWindow = layoutInflaterFactory2C0159B3.f3125w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0159B3.f3124v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0159B3.f3124v.getParent();
                    WeakHashMap weakHashMap = O.K.f747a;
                    AbstractC0049z.c(view);
                }
                layoutInflaterFactory2C0159B3.f3124v.e();
                layoutInflaterFactory2C0159B3.f3127y.d(null);
                layoutInflaterFactory2C0159B3.f3127y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0159B3.f3081A;
                WeakHashMap weakHashMap2 = O.K.f747a;
                AbstractC0049z.c(viewGroup);
                break;
        }
    }

    @Override // a.AbstractC0078a, O.O
    public void c() {
        Object obj = this.f3234f;
        switch (this.e) {
            case 0:
                ((q) obj).f3231b.f3124v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) obj;
                layoutInflaterFactory2C0159B.f3124v.setVisibility(0);
                if (layoutInflaterFactory2C0159B.f3124v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0159B.f3124v.getParent();
                    WeakHashMap weakHashMap = O.K.f747a;
                    AbstractC0049z.c(view);
                    break;
                }
                break;
        }
    }
}
