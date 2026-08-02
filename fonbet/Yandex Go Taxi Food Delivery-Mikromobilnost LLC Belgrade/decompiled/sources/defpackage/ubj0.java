package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class ubj0 extends y {
    public final sls a;
    public final zls b;

    public ubj0(sls slsVar, zls zlsVar) {
        super(new obj0());
        this.a = slsVar;
        this.b = zlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        wu0 wu0Var = (wu0) getItem(i);
        if (wu0Var instanceof b9u) {
            return 0;
        }
        if (wu0Var instanceof j2c) {
            return 1;
        }
        if (wu0Var instanceof qql) {
            return 2;
        }
        if (wu0Var instanceof s41) {
            return 3;
        }
        if (wu0Var instanceof yxv) {
            return 4;
        }
        ny61.g(oyr.p("View type for class ", qoi0.a(wu0Var.getClass()).d(), " not supported"));
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        wu0 wu0Var = (wu0) getItem(i);
        if ((x0Var instanceof sbj0) && (wu0Var instanceof b9u)) {
            ((RobotoTextView) ((sbj0) x0Var).N.b).setText(((b9u) wu0Var).a);
            return;
        }
        if ((x0Var instanceof qbj0) && (wu0Var instanceof j2c)) {
            j2c j2cVar = (j2c) wu0Var;
            a1x a1xVar = ((qbj0) x0Var).N;
            a1xVar.c.setText(j2cVar.b);
            a1xVar.d.setText(j2cVar.a);
            return;
        }
        if ((x0Var instanceof rbj0) && (wu0Var instanceof qql)) {
            ((RobotoTextView) ((rbj0) x0Var).N.c).setText(((qql) wu0Var).a);
            return;
        }
        if (!(x0Var instanceof pbj0) || !(wu0Var instanceof s41)) {
            if ((x0Var instanceof tbj0) && (wu0Var instanceof yxv)) {
                yxv yxvVar = (yxv) wu0Var;
                AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) ((tbj0) x0Var).N.c;
                animatedListItemInputComponent.setInputTitle(yxvVar.a);
                animatedListItemInputComponent.setValue(yxvVar.b);
                return;
            }
            return;
        }
        pbj0 pbj0Var = (pbj0) x0Var;
        s41 s41Var = (s41) wu0Var;
        boolean z = s41Var.a;
        xu0 xu0Var = s41Var.b;
        int i2 = z ? yyg0.ic_order_card_source : f1h0.ic_order_card_destination;
        rm rmVar = pbj0Var.N;
        ListItemComponent listItemComponent = (ListItemComponent) rmVar.f;
        AnimatedListItemInputComponent animatedListItemInputComponent2 = (AnimatedListItemInputComponent) rmVar.e;
        AnimatedListItemInputComponent animatedListItemInputComponent3 = (AnimatedListItemInputComponent) rmVar.c;
        AnimatedListItemInputComponent animatedListItemInputComponent4 = (AnimatedListItemInputComponent) rmVar.d;
        AnimatedListItemInputComponent animatedListItemInputComponent5 = (AnimatedListItemInputComponent) rmVar.g;
        listItemComponent.setTitle(xu0Var.a);
        animatedListItemInputComponent5.setValue(xu0Var.b);
        animatedListItemInputComponent5.setInputTitle(s41Var.c);
        animatedListItemInputComponent4.setInputTitle(s41Var.f);
        animatedListItemInputComponent4.setValue(xu0Var.e);
        animatedListItemInputComponent3.setValue(xu0Var.c);
        animatedListItemInputComponent3.setInputTitle(s41Var.e);
        animatedListItemInputComponent2.setInputTitle(s41Var.d);
        animatedListItemInputComponent2.setValue(xu0Var.d);
        ((ListItemComponent) rmVar.f).setLeadImage(((ConstraintLayout) rmVar.b).getContext().getDrawable(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(irh0.item_address_form_header, viewGroup, false);
            if (inflate != null) {
                return new sbj0(new y2j((RobotoTextView) inflate, 3));
            }
            ny61.t("rootView");
            return null;
        }
        if (i == 1) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(irh0.item_address_form_client, viewGroup, false);
            int i2 = hfh0.client_name_text_view;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate2);
            if (robotoTextView != null) {
                i2 = hfh0.client_title_text_view;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate2);
                if (robotoTextView2 != null) {
                    return new qbj0(this, new a1x((LinearLayout) inflate2, robotoTextView, robotoTextView2, 0));
                }
            }
            ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
            return null;
        }
        if (i == 2) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(irh0.item_address_form_divider, viewGroup, false);
            if (inflate3 != null) {
                RobotoTextView robotoTextView3 = (RobotoTextView) inflate3;
                return new rbj0(new nzm(robotoTextView3, 2, robotoTextView3));
            }
            ny61.t("rootView");
            return null;
        }
        if (i != 3) {
            if (i != 4) {
                ny61.g(oyr.j(i, "View type ", " is not supported"));
                return null;
            }
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(irh0.item_address_form_input, viewGroup, false);
            if (inflate4 != null) {
                AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) inflate4;
                return new tbj0(this, new nzm(animatedListItemInputComponent, 3, animatedListItemInputComponent));
            }
            ny61.t("rootView");
            return null;
        }
        View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(irh0.item_address_form_delivery_point, viewGroup, false);
        int i3 = hfh0.address_column_1;
        if (((Guideline) cma1.O(i3, inflate5)) != null) {
            i3 = hfh0.address_column_2;
            if (((Guideline) cma1.O(i3, inflate5)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate5;
                i3 = hfh0.requirement_address_apartment_input;
                AnimatedListItemInputComponent animatedListItemInputComponent2 = (AnimatedListItemInputComponent) cma1.O(i3, inflate5);
                if (animatedListItemInputComponent2 != null) {
                    i3 = hfh0.requirement_address_door_phone_input;
                    AnimatedListItemInputComponent animatedListItemInputComponent3 = (AnimatedListItemInputComponent) cma1.O(i3, inflate5);
                    if (animatedListItemInputComponent3 != null) {
                        i3 = hfh0.requirement_address_floor_input;
                        AnimatedListItemInputComponent animatedListItemInputComponent4 = (AnimatedListItemInputComponent) cma1.O(i3, inflate5);
                        if (animatedListItemInputComponent4 != null) {
                            i3 = hfh0.requirement_address_point;
                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i3, inflate5);
                            if (listItemComponent != null) {
                                i3 = hfh0.requirement_address_porch_input;
                                AnimatedListItemInputComponent animatedListItemInputComponent5 = (AnimatedListItemInputComponent) cma1.O(i3, inflate5);
                                if (animatedListItemInputComponent5 != null) {
                                    return new pbj0(this, new rm(constraintLayout, animatedListItemInputComponent2, animatedListItemInputComponent3, animatedListItemInputComponent4, listItemComponent, animatedListItemInputComponent5, 3));
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i3)));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        if (list.isEmpty()) {
            onBindViewHolder(x0Var, i);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(it.next(), 0) && (x0Var instanceof qbj0)) {
                Object item = getItem(i);
                j2c j2cVar = item instanceof j2c ? (j2c) item : null;
                if (j2cVar != null) {
                    a1x a1xVar = ((qbj0) x0Var).N;
                    a1xVar.c.setText(j2cVar.b);
                    a1xVar.d.setText(j2cVar.a);
                }
            } else {
                super.onBindViewHolder(x0Var, i, list);
            }
        }
    }
}
