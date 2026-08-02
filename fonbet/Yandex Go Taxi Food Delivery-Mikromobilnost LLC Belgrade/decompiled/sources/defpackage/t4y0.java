package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.e;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.DividerWithColorView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.order.modals.impl.presentation.TaxiOrderPopupView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class t4y0 implements h4y0 {
    public final /* synthetic */ TaxiOrderPopupView a;

    public t4y0(TaxiOrderPopupView taxiOrderPopupView) {
        this.a = taxiOrderPopupView;
    }

    @Override // defpackage.h4y0
    public final void Ee(s4y0 s4y0Var) {
        i4y0 i4y0Var;
        p2y binding;
        p2y binding2;
        p2y binding3;
        p2y binding4;
        p2y binding5;
        p2y binding6;
        p2y binding7;
        boolean z = s4y0Var instanceof m4y0;
        TaxiOrderPopupView taxiOrderPopupView = this.a;
        if (z) {
            binding6 = taxiOrderPopupView.getBinding();
            binding6.e.setVisibility(0);
            binding7 = taxiOrderPopupView.getBinding();
            binding7.b.setVisibility(8);
            return;
        }
        if (!(s4y0Var instanceof l4y0)) {
            if (!(s4y0Var instanceof k4y0)) {
                w511.b();
                return;
            }
            i4y0Var = taxiOrderPopupView.presenter;
            i4y0Var.y.e();
            taxiOrderPopupView.dismiss();
            return;
        }
        l4y0 l4y0Var = (l4y0) s4y0Var;
        Drawable drawable = l4y0Var.c;
        binding = taxiOrderPopupView.getBinding();
        Group group = binding.e;
        RobotoTextView robotoTextView = binding.f;
        ConstraintLayout constraintLayout = binding.a;
        group.setVisibility(8);
        binding.b.setVisibility(0);
        ImageView imageView = binding.d;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(drawable == null ? 8 : 0);
        if (l4y0Var.d) {
            e eVar = new e();
            eVar.g(constraintLayout);
            int r = tje.r(stg0.popup_hotspot_icon_margin, taxiOrderPopupView.getContext());
            eVar.w(imageView.getId(), 3, r);
            eVar.w(imageView.getId(), 6, r);
            eVar.w(robotoTextView.getId(), 3, tje.r(stg0.popup_title_under_icon_margin, taxiOrderPopupView.getContext()));
            eVar.b(constraintLayout);
        }
        robotoTextView.setText(l4y0Var.a);
        binding.c.setText(l4y0Var.b);
        List<r4y0> list = l4y0Var.e;
        binding2 = taxiOrderPopupView.getBinding();
        binding2.g.removeAllViews();
        for (r4y0 r4y0Var : list) {
            if (r4y0Var instanceof o4y0) {
                o4y0 o4y0Var = (o4y0) r4y0Var;
                ListItemComponent listItemComponent = new ListItemComponent(taxiOrderPopupView.getContext(), null, 0, 6, null);
                listItemComponent.setTrailMode(2);
                listItemComponent.setBackground(vng.t(dzg0.bg_transparent_ripple, listItemComponent.getContext()));
                listItemComponent.setTitleTextColor(o4y0Var.b);
                listItemComponent.setTitleTypeface(o4y0Var.c);
                listItemComponent.setTitleAlignment(1);
                listItemComponent.setTitle(o4y0Var.a);
                listItemComponent.setOnClickListener(new vmu0(9, o4y0Var));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = tje.r(stg0.popup_widget_top_margin, taxiOrderPopupView.getContext());
                binding3 = taxiOrderPopupView.getBinding();
                binding3.g.addView(listItemComponent, layoutParams);
            } else if (r4y0Var instanceof p4y0) {
                p4y0 p4y0Var = (p4y0) r4y0Var;
                kdc kdcVar = p4y0Var.b;
                int m = kdcVar != null ? s8o.m(kdcVar, taxiOrderPopupView.getContext()) : qje.t(xng0.controlMain, taxiOrderPopupView.getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = tje.r(stg0.popup_widget_top_margin, taxiOrderPopupView.getContext());
                ButtonComponent buttonComponent = new ButtonComponent(taxiOrderPopupView.getContext(), null, 0, 6, null);
                buttonComponent.setButtonBackground(m);
                buttonComponent.setButtonTitleColor(p4y0Var.c);
                buttonComponent.setTextTypeface(p4y0Var.d);
                buttonComponent.setText(p4y0Var.a);
                buttonComponent.setOnClickListener(new vmu0(8, p4y0Var));
                binding4 = taxiOrderPopupView.getBinding();
                binding4.g.addView(buttonComponent, layoutParams2);
            } else {
                if (!(r4y0Var instanceof q4y0)) {
                    w511.b();
                    return;
                }
                bdc bdcVar = new bdc(xng0.line);
                DividerWithColorView dividerWithColorView = new DividerWithColorView(taxiOrderPopupView.getContext(), null, 0, 6, null);
                dividerWithColorView.updateColor(bdcVar);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.topMargin = tje.r(stg0.popup_widget_top_margin, taxiOrderPopupView.getContext());
                layoutParams3.height = (int) tje.x(taxiOrderPopupView.getContext(), ((q4y0) r4y0Var).a);
                binding5 = taxiOrderPopupView.getBinding();
                binding5.g.addView(dividerWithColorView, layoutParams3);
            }
        }
    }
}
