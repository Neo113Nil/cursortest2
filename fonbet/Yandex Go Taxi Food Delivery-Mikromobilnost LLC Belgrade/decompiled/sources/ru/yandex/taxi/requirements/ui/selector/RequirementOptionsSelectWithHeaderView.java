package ru.yandex.taxi.requirements.ui.selector;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.jmw0;
import defpackage.lhc;
import defpackage.m810;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListGroupHeaderComponent;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/yandex/taxi/requirements/ui/selector/RequirementOptionsSelectWithHeaderView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Lru/yandex/taxi/requirements/ui/selector/RequirementOptionsSelectView;", "optionSelectorView", "Lpwy0;", "themeSwitcherProvider", "", "isRequirementsRedesign", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/requirements/ui/selector/RequirementOptionsSelectView;Lpwy0;Z)V", "Lzy11;", "setRedesignBackground", "()V", "Ljmw0;", "requirement", "update", "(Ljmw0;)V", "", "drawableRes", "setHeaderBackground", "(I)V", "headerVisible", "()Z", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "checkContent", "Lru/yandex/taxi/requirements/ui/selector/RequirementOptionsSelectView;", "getOptionSelectorView", "()Lru/yandex/taxi/requirements/ui/selector/RequirementOptionsSelectView;", "Lpwy0;", "Z", "", "redesignBackgroundCornerRadius", "F", "Lru/yandex/taxi/design/ListGroupHeaderComponent;", "header", "Lru/yandex/taxi/design/ListGroupHeaderComponent;", "sjj0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementOptionsSelectWithHeaderView extends LinearLayout {
    private final ListGroupHeaderComponent header;
    private final boolean isRequirementsRedesign;
    private final RequirementOptionsSelectView optionSelectorView;
    private final float redesignBackgroundCornerRadius;
    private final pwy0 themeSwitcherProvider;

    public RequirementOptionsSelectWithHeaderView(Context context, RequirementOptionsSelectView requirementOptionsSelectView, pwy0 pwy0Var, boolean z) {
        super(context);
        this.optionSelectorView = requirementOptionsSelectView;
        this.themeSwitcherProvider = pwy0Var;
        this.isRequirementsRedesign = z;
        this.redesignBackgroundCornerRadius = tje.w(16, getContext());
        ListGroupHeaderComponent listGroupHeaderComponent = new ListGroupHeaderComponent(context, null, 0, 6, null);
        this.header = listGroupHeaderComponent;
        setOrientation(1);
        addView(listGroupHeaderComponent, new LinearLayout.LayoutParams(-1, -2));
        if (!z) {
            addView(requirementOptionsSelectView, new LinearLayout.LayoutParams(-1, -2));
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int u = tje.u(16, getContext());
        int u2 = tje.u(8, getContext());
        marginLayoutParams.setMargins(u, u2, u, u2);
        addView(requirementOptionsSelectView, marginLayoutParams);
    }

    private final void setRedesignBackground() {
        int argb;
        float f = this.redesignBackgroundCornerRadius;
        int t = qje.t(xng0.bgMinor, getContext());
        RequirementOptionsSelectView requirementOptionsSelectView = this.optionSelectorView;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(t);
        if (lhc.c(t) < 0.25d) {
            argb = lhc.b(0.050000012f, t, -1);
        } else {
            int alpha = Color.alpha(t);
            int b = m810.b(Color.red(t) * 0.95f);
            if (b > 255) {
                b = 255;
            }
            int b2 = m810.b(Color.green(t) * 0.95f);
            if (b2 > 255) {
                b2 = 255;
            }
            int b3 = m810.b(Color.blue(t) * 0.95f);
            argb = Color.argb(alpha, b, b2, b3 <= 255 ? b3 : 255);
        }
        requirementOptionsSelectView.setBackground(new RippleDrawable(ColorStateList.valueOf(argb), shapeDrawable, null));
    }

    public boolean checkContent() {
        return false;
    }

    public View contentView() {
        return this.optionSelectorView;
    }

    public final RequirementOptionsSelectView getOptionSelectorView() {
        return this.optionSelectorView;
    }

    public boolean headerVisible() {
        return this.header.getVisibility() == 0;
    }

    public final void setHeaderBackground(int drawableRes) {
        this.header.setBackgroundResource(drawableRes);
    }

    public final void update(jmw0 requirement) {
        String str = requirement.s().a;
        boolean z = str.length() > 0;
        this.header.setVisibility(z ? 0 : 8);
        if (z) {
            this.header.setTitle(str);
            this.header.applyTheme(this.themeSwitcherProvider.getThemeType());
        }
        this.optionSelectorView.updateRequirement(requirement);
        if (this.isRequirementsRedesign) {
            setRedesignBackground();
        }
    }
}
