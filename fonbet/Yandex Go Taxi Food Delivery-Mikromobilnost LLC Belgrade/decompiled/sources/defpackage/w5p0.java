package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class w5p0 implements zo31 {
    public final View a;
    public final RobotoTextView b;
    public final RobotoTextView c;
    public final RobotoTextView d;

    public w5p0(ViewGroup viewGroup, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.a = viewGroup;
        this.b = robotoTextView;
        this.c = robotoTextView2;
        this.d = robotoTextView3;
    }

    public static w5p0 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            ny61.t("parent");
            return null;
        }
        layoutInflater.inflate(srh0.scooters_tariff_view, viewGroup);
        int i = qfh0.price_text_view;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, viewGroup);
        if (robotoTextView != null) {
            i = qfh0.subtitle_text_view;
            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, viewGroup);
            if (robotoTextView2 != null) {
                i = qfh0.title_text_view;
                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, viewGroup);
                if (robotoTextView3 != null) {
                    return new w5p0(viewGroup, robotoTextView, robotoTextView2, robotoTextView3);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
