package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.preorder.summary.selector.verticals.bold.a;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final /* synthetic */ class sb31 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ sb31(g2a g2aVar, q0v q0vVar, hf31 hf31Var, b bVar) {
        this.a = 1;
        this.b = g2aVar;
        this.c = q0vVar;
        this.w = hf31Var;
        this.x = bVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                tb31.a((je31) obj6, (kz6) obj5, (z0a0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                g2a g2aVar = (g2a) obj6;
                q0v q0vVar = (q0v) obj5;
                hf31 hf31Var = (hf31) obj4;
                b bVar = (b) obj3;
                View inflate = ((LayoutInflater) obj).inflate(vrh0.bold_vertical_view_holder, (ViewGroup) obj2, false);
                int i2 = vfh0.badge;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                if (robotoTextView != null) {
                    i2 = vfh0.vertical;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate);
                    if (robotoTextView2 != null) {
                        return new a(new h86((GoLinearLayout) inflate, robotoTextView, robotoTextView2), g2aVar, q0vVar, hf31Var, bVar);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            default:
                ((Integer) obj2).getClass();
                py91.e((el51) obj6, (zm51) obj5, (YandexShapes) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(49));
                return zy11Var;
        }
    }

    public /* synthetic */ sb31(Object obj, Object obj2, Object obj3, cms cmsVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = cmsVar;
    }
}
