package defpackage;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.button.OrderButtonComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.preorder.tollroad.TollRoadModalView;
import ru.yandex.taxi.preorder.tollroad.TollRoadsListItem;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class rqz0 implements sqz0 {
    public final /* synthetic */ TollRoadModalView a;

    public rqz0(TollRoadModalView tollRoadModalView) {
        this.a = tollRoadModalView;
    }

    @Override // defpackage.sqz0
    public final void Ed(frz0 frz0Var) {
        ListItemComponent listItemComponent;
        RobotoTextView robotoTextView;
        otk0 otk0Var;
        ConstraintLayout constraintLayout;
        RobotoTextView robotoTextView2;
        ViewGroup viewGroup;
        RobotoTextView robotoTextView3;
        ViewGroup viewGroup2;
        ConstraintLayout constraintLayout2;
        TollRoadModalView tollRoadModalView = this.a;
        listItemComponent = tollRoadModalView.titleView;
        listItemComponent.setTitle(frz0Var.a);
        if (frz0Var.d) {
            robotoTextView3 = tollRoadModalView.descriptionView;
            robotoTextView3.setVisibility(8);
            viewGroup2 = tollRoadModalView.paidOptionsGroup;
            viewGroup2.setVisibility(8);
            constraintLayout2 = tollRoadModalView.shimmering;
            constraintLayout2.setVisibility(0);
            return;
        }
        robotoTextView = tollRoadModalView.descriptionView;
        robotoTextView.setText(frz0Var.b);
        otk0Var = tollRoadModalView.roadOptionsAdapter;
        List<ntk0> list = frz0Var.c;
        ArrayList arrayList = otk0Var.c;
        if (arrayList.size() == list.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                otk0Var.a((TollRoadsListItem) arrayList.get(i), (ntk0) list.get(i));
            }
        } else {
            ViewGroup viewGroup3 = otk0Var.a;
            viewGroup3.removeAllViews();
            arrayList.clear();
            for (ntk0 ntk0Var : list) {
                TollRoadsListItem tollRoadsListItem = new TollRoadsListItem(viewGroup3.getContext(), null, 2, null);
                tollRoadsListItem.applyStyle();
                otk0Var.a(tollRoadsListItem, ntk0Var);
                viewGroup3.addView(tollRoadsListItem);
                arrayList.add(tollRoadsListItem);
            }
            if (arrayList.size() == 2) {
                ((TollRoadsListItem) arrayList.get(1)).setDividers(DividerPosition.TOP, DividerType.ICON);
            }
        }
        constraintLayout = tollRoadModalView.shimmering;
        constraintLayout.setVisibility(8);
        robotoTextView2 = tollRoadModalView.descriptionView;
        robotoTextView2.setVisibility(0);
        viewGroup = tollRoadModalView.paidOptionsGroup;
        viewGroup.setVisibility(0);
    }

    @Override // defpackage.sqz0
    public final void c4(wi70 wi70Var) {
        OrderButtonComponent orderButtonComponent;
        OrderButtonComponent orderButtonComponent2;
        TollRoadModalView tollRoadModalView = this.a;
        orderButtonComponent = tollRoadModalView.orderButtonView;
        orderButtonComponent.render(wi70Var);
        orderButtonComponent2 = tollRoadModalView.orderButtonView;
        orderButtonComponent2.setVisibility(0);
    }
}
