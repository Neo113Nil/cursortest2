package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.chargers.multiorder.ui.components.ChargersMultiOrderTakeMoreButton;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class w5a implements zo31 {
    public final GoLinearLayout a;
    public final ChargersMultiOrderTakeMoreButton b;
    public final RobotoTextView c;
    public final RecyclerView d;
    public final RobotoTextView e;

    public w5a(GoLinearLayout goLinearLayout, ChargersMultiOrderTakeMoreButton chargersMultiOrderTakeMoreButton, RobotoTextView robotoTextView, RecyclerView recyclerView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = chargersMultiOrderTakeMoreButton;
        this.c = robotoTextView;
        this.d = recyclerView;
        this.e = robotoTextView2;
    }

    public static w5a o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(rsh0.chargers_multi_order_view, viewGroup, false);
        int i = rhh0.header_button;
        ChargersMultiOrderTakeMoreButton chargersMultiOrderTakeMoreButton = (ChargersMultiOrderTakeMoreButton) cma1.O(i, inflate);
        if (chargersMultiOrderTakeMoreButton != null) {
            i = rhh0.header_label;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = rhh0.orders;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = rhh0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new w5a((GoLinearLayout) inflate, chargersMultiOrderTakeMoreButton, robotoTextView, recyclerView, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
