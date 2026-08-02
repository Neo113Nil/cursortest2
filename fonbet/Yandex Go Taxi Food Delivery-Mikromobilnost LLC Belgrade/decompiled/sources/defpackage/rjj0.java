package defpackage;

import android.widget.FrameLayout;
import ru.yandex.taxi.requirements.ui.selector.RequirementOptionsSelectView;
import ru.yandex.taxi.requirements.ui.selector.compound.CompoundOptionSelectorView;
import ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorView;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class rjj0 implements pjj0 {
    public final /* synthetic */ RequirementOptionsSelectView a;

    public rjj0(RequirementOptionsSelectView requirementOptionsSelectView) {
        this.a = requirementOptionsSelectView;
    }

    @Override // defpackage.pjj0
    public final void Pc(plq0 plq0Var) {
        plq0 plq0Var2;
        CompoundOptionSelectorView compoundOptionSelectorView;
        CompoundOptionSelectorView compoundOptionSelectorView2;
        bf70 bf70Var;
        CompoundOptionSelectorView compoundOptionSelectorView3;
        UsualOptionSelectorView usualOptionSelectorView;
        UsualOptionSelectorView usualOptionSelectorView2;
        bf70 bf70Var2;
        UsualOptionSelectorView usualOptionSelectorView3;
        Class<?> cls = plq0Var.getClass();
        RequirementOptionsSelectView requirementOptionsSelectView = this.a;
        plq0Var2 = requirementOptionsSelectView.lastMode;
        if (!cls.equals(plq0Var2 != null ? plq0Var2.getClass() : null) && requirementOptionsSelectView.getChildCount() > 0) {
            requirementOptionsSelectView.lastMode = plq0Var;
            requirementOptionsSelectView.usualSelector = null;
            requirementOptionsSelectView.compoundSelector = null;
            requirementOptionsSelectView.removeAllViews();
        }
        if (plq0Var instanceof uv21) {
            usualOptionSelectorView = requirementOptionsSelectView.usualSelector;
            if (usualOptionSelectorView == null) {
                bf70Var2 = requirementOptionsSelectView.factory;
                requirementOptionsSelectView.usualSelector = (UsualOptionSelectorView) bf70Var2.a.get();
                usualOptionSelectorView3 = requirementOptionsSelectView.usualSelector;
                requirementOptionsSelectView.addView(usualOptionSelectorView3, new FrameLayout.LayoutParams(-1, -2));
                requirementOptionsSelectView.updateListenerInViews();
            }
            usualOptionSelectorView2 = requirementOptionsSelectView.usualSelector;
            if (usualOptionSelectorView2 != null) {
                usualOptionSelectorView2.updateRequirement(((uv21) plq0Var).a);
                return;
            }
            return;
        }
        if (!(plq0Var instanceof xvd)) {
            w511.b();
            return;
        }
        compoundOptionSelectorView = requirementOptionsSelectView.compoundSelector;
        if (compoundOptionSelectorView == null) {
            bf70Var = requirementOptionsSelectView.factory;
            requirementOptionsSelectView.compoundSelector = (CompoundOptionSelectorView) bf70Var.b.get();
            compoundOptionSelectorView3 = requirementOptionsSelectView.compoundSelector;
            requirementOptionsSelectView.addView(compoundOptionSelectorView3, new FrameLayout.LayoutParams(-1, -2));
        }
        compoundOptionSelectorView2 = requirementOptionsSelectView.compoundSelector;
        if (compoundOptionSelectorView2 != null) {
            compoundOptionSelectorView2.updateRequirement(((xvd) plq0Var).a);
        }
    }

    @Override // defpackage.pjj0
    public final void applyTheme(ThemeType themeType) {
        CompoundOptionSelectorView compoundOptionSelectorView;
        UsualOptionSelectorView usualOptionSelectorView;
        RequirementOptionsSelectView requirementOptionsSelectView = this.a;
        compoundOptionSelectorView = requirementOptionsSelectView.compoundSelector;
        if (compoundOptionSelectorView != null) {
            compoundOptionSelectorView.applyTheme(themeType);
        }
        usualOptionSelectorView = requirementOptionsSelectView.usualSelector;
        if (usualOptionSelectorView != null) {
            usualOptionSelectorView.applyTheme(themeType);
        }
    }
}
