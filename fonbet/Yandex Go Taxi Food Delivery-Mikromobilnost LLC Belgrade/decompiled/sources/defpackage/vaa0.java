package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes8.dex */
public final class vaa0 extends wys {
    public static final /* synthetic */ int U = 0;
    public final ListItemComponent R;
    public final int S;
    public q2u T;

    public vaa0(ListItemComponent listItemComponent) {
        super(listItemComponent);
        this.R = listItemComponent;
        this.S = (int) c.j(16, listItemComponent);
        listItemComponent.setUseAutoAccessibilityDelegate(false);
        b.p(listItemComponent, null);
        listItemComponent.setImportantForAccessibility(2);
        listItemComponent.setMinHeight((int) c.j(48, listItemComponent));
        listItemComponent.getLayoutParams().height = -2;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        q2u q2uVar = this.T;
        if (q2uVar != null) {
            c0(q2uVar);
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        q2u q2uVar = (q2u) obj;
        c0(q2uVar);
        this.T = q2uVar;
    }

    public final void c0(q2u q2uVar) {
        r8 r8Var = q2uVar.d;
        String str = q2uVar.b;
        saa0 saa0Var = q2uVar.c;
        View view = this.a;
        ListItemComponent listItemComponent = this.R;
        if (r8Var == null) {
            listItemComponent.setTrailView(null);
        } else if (r8Var instanceof uaa0) {
            uaa0 uaa0Var = (uaa0) r8Var;
            RobotoTextView robotoTextView = (RobotoTextView) listItemComponent.getTrailViewAs(RobotoTextView.class);
            if (robotoTextView == null) {
                RobotoTextView robotoTextView2 = new RobotoTextView(listItemComponent.getContext(), null, 0, 6, null);
                robotoTextView2.setPadding(0, c.h(4, view), tje.r(mrg0.go_design_m_space, view.getContext()), tje.u(4, view.getContext()));
                robotoTextView2.setTextColor(new bdc(xng0.textMain));
                listItemComponent.setTrailView(robotoTextView2);
                robotoTextView2.setGravity(16);
                robotoTextView2.setImportantForAccessibility(1);
                robotoTextView = robotoTextView2;
            }
            robotoTextView.setText(uaa0Var.Jg());
            robotoTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            c.B(robotoTextView, uaa0Var.Hg());
            Drawable drawable = listItemComponent.getContext().getDrawable(dzg0.chevron_next_text_size_caption);
            if (drawable != null) {
                robotoTextView.setCompoundDrawablePadding(c.h(4, view));
                robotoTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
            robotoTextView.setContentDescription(uaa0Var.Ig().length() != 0 ? uaa0Var.Ig() : uaa0Var.Jg());
        } else {
            if (!(r8Var instanceof taa0)) {
                w511.b();
                return;
            }
            taa0 taa0Var = (taa0) r8Var;
            ButtonComponent buttonComponent = (ButtonComponent) listItemComponent.getTrailViewAs(ButtonComponent.class);
            if (buttonComponent == null) {
                ButtonComponent buttonComponent2 = new ButtonComponent(listItemComponent.getContext(), null, 0, 6, null);
                buttonComponent2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                listItemComponent.setTrailView(buttonComponent2);
                xw31.F(buttonComponent2, null, null, Integer.valueOf(c.d(mrg0.go_design_m_space, view)), null);
                buttonComponent2.setButtonBackground(new bdc(xng0.controlMinor));
                buttonComponent2.setTextSize(0, tje.r(mrg0.component_text_size_caption, view.getContext()));
                buttonComponent2.setButtonTitleColor(new bdc(xng0.textMain));
                buttonComponent2.setButtonSize(0);
                buttonComponent2.setRoundedCornersRadius(tje.r(mrg0.button_component_extra_rounded_corners_radius, view.getContext()));
                buttonComponent2.setImportantForAccessibility(1);
                buttonComponent = buttonComponent2;
            }
            buttonComponent.setText(taa0Var.c);
            buttonComponent.setDebounceClickListener(taa0Var.x);
            buttonComponent.setContentDescription(taa0Var.Hg().length() != 0 ? taa0Var.Hg() : taa0Var.c);
        }
        if (saa0Var == null) {
            if (str == null || str.length() == 0) {
                return;
            }
            listItemComponent.getLeadImageView().setVisibility(8);
            listItemComponent.setTitle(str);
            b.q(listItemComponent.title(), true);
            listItemComponent.setTitleTextSizePx((int) c.i(20.0f, view));
            listItemComponent.setTitleTypeface(5);
            listItemComponent.title().setImportantForAccessibility(1);
            return;
        }
        listItemComponent.setTitle("");
        listItemComponent.getLeadImageView().setVisibility(0);
        listItemComponent.setLeadImageSize(c.d(utg0.yb_logo_image_width, view), tje.r(utg0.yb_logo_image_height, view.getContext()));
        ClickableImageView leadImageView = listItemComponent.getLeadImageView();
        Drawable l = c.l(y2h0.ic_yb_logo, listItemComponent);
        l.setBounds(0, 0, l.getIntrinsicWidth(), l.getIntrinsicHeight());
        leadImageView.setImageDrawable(l);
        ClickableImageView leadImageView2 = listItemComponent.getLeadImageView();
        int i = this.S;
        leadImageView2.setPaddingRelative(i, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams = listItemComponent.getLeadImageView().getLayoutParams();
        Drawable l2 = c.l(y2h0.ic_yb_logo, listItemComponent);
        l2.setBounds(0, 0, l2.getIntrinsicWidth(), l2.getIntrinsicHeight());
        layoutParams.width = l2.getBounds().width() + i;
        listItemComponent.title().setImportantForAccessibility(2);
        listItemComponent.setLeadContentDescription(saa0Var.a);
        listItemComponent.leadFrame.setImportantForAccessibility(1);
        listItemComponent.leadFrame.setAccessibilityHeading(true);
    }
}
