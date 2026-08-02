package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Position;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class rvh extends lys {
    public static final /* synthetic */ int W = 0;
    public final s0i S;
    public final gbi T;
    public final mai U;
    public final qnh V;

    public rvh(c1x c1xVar, s0i s0iVar, gbi gbiVar, mai maiVar, qnh qnhVar) {
        super(c1xVar);
        this.S = s0iVar;
        this.T = gbiVar;
        this.U = maiVar;
        this.V = qnhVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        fwh fwhVar = (fwh) obj;
        i630 i630Var = fwhVar.b;
        String str = (String) i630Var.d;
        String str2 = (String) i630Var.e;
        boolean z = i630Var.b;
        hki hkiVar = fwhVar.d;
        DeliveryFormStepType a = hkiVar.a();
        zo31 zo31Var = (zo31) this.R;
        if (z) {
            c1x c1xVar = (c1x) zo31Var;
            RobotoTextView robotoTextView = c1xVar.e;
            RobotoTextView robotoTextView2 = c1xVar.d;
            robotoTextView.setText("");
            c1xVar.e.setVisibility(8);
            int i = qvh.a[a.ordinal()];
            if (i == 1) {
                robotoTextView2.setText(kyh0.delivery_form_source_empty_contact_place_holder);
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                robotoTextView2.setText(kyh0.delivery_form_destination_empty_contact_place_holder);
            }
        } else {
            c1x c1xVar2 = (c1x) zo31Var;
            RobotoTextView robotoTextView3 = c1xVar2.d;
            RobotoTextView robotoTextView4 = c1xVar2.e;
            robotoTextView3.setText(str2);
            robotoTextView4.setText(str);
            robotoTextView4.setVisibility(0);
        }
        c1x c1xVar3 = (c1x) zo31Var;
        FrameLayout frameLayout = c1xVar3.b;
        BubbleTextComponent bubbleTextComponent = c1xVar3.c;
        RobotoTextView robotoTextView5 = c1xVar3.e;
        ListItemComponent listItemComponent = c1xVar3.f;
        CharSequence text = robotoTextView5.getText();
        CharSequence text2 = c1xVar3.d.getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append((Object) text2);
        frameLayout.setContentDescription(sb.toString());
        c.z(new bmh(4, this, hkiVar), c1xVar3.b);
        listItemComponent.setDebounceClickListener(new zvg(16, this, hkiVar));
        bubbleTextComponent.showCloseIcon(false);
        bubbleTextComponent.setOnClickListener(new k5(29, this, hkiVar));
        gbi gbiVar = this.T;
        if (gbiVar.a.t) {
            ViewGroup.LayoutParams layoutParams = bubbleTextComponent.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToBottom = robotoTextView5.getId();
            layoutParams2.bottomToBottom = -1;
            bubbleTextComponent.setLayoutParams(layoutParams2);
            bubbleTextComponent.setPadding(0, (int) uh6.o(6.0f), 0, 0);
        } else {
            ViewGroup.LayoutParams layoutParams3 = bubbleTextComponent.getLayoutParams();
            if (layoutParams3 == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomToBottom = robotoTextView5.getId();
            layoutParams4.topToBottom = -1;
            bubbleTextComponent.setLayoutParams(layoutParams4);
            bubbleTextComponent.setPadding(0, 0, 0, 0);
        }
        rju rjuVar = new rju(this.a.getContext());
        rjuVar.b(new bdc(xng0.textMain));
        if (gbiVar.a.t) {
            rjuVar.g(HintBubbleDecorator$Position.TOP_LEFT);
        } else {
            rjuVar.g(HintBubbleDecorator$Position.OFFSET_START);
        }
        bubbleTextComponent.setDecorator(rjuVar);
        String str3 = fwhVar.a;
        RobotoTextView robotoTextView6 = c1xVar3.h;
        robotoTextView6.setText(str3);
        robotoTextView6.setVisibility(evu0.J(str3) ? 8 : 0);
        b.q(robotoTextView6, true);
        this.V.e(c1xVar3.g, F(), false);
        if (fwhVar.b.c) {
            this.S.c();
            bubbleTextComponent.show(true);
        }
        String str4 = fwhVar.c;
        boolean z2 = hkiVar.a() == DeliveryFormStepType.SOURCE;
        listItemComponent.setTitle(str4);
        listItemComponent.setLeadImage(z2 ? mzg0.ic_order_card_source : f1h0.ic_summary_destination_point);
    }
}
