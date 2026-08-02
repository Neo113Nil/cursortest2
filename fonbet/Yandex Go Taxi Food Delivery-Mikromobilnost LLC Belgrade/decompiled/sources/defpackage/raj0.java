package defpackage;

import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceOptionSelectorView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceSelectorWithHeaderView;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class raj0 implements qaj0 {
    public final /* synthetic */ RequiredAltChoiceSelectorWithHeaderView a;

    public raj0(RequiredAltChoiceSelectorWithHeaderView requiredAltChoiceSelectorWithHeaderView) {
        this.a = requiredAltChoiceSelectorWithHeaderView;
    }

    @Override // defpackage.qaj0
    public final void Kd(saj0 saj0Var) {
        ListGroupHeaderComponent listGroupHeaderComponent;
        RequiredAltChoiceOptionSelectorView requiredAltChoiceOptionSelectorView;
        ListGroupHeaderComponent listGroupHeaderComponent2;
        RequiredAltChoiceOptionSelectorView requiredAltChoiceOptionSelectorView2;
        RequiredAltChoiceSelectorWithHeaderView requiredAltChoiceSelectorWithHeaderView = this.a;
        if (saj0Var == null) {
            listGroupHeaderComponent2 = requiredAltChoiceSelectorWithHeaderView.header;
            listGroupHeaderComponent2.setVisibility(8);
            requiredAltChoiceOptionSelectorView2 = requiredAltChoiceSelectorWithHeaderView.selectorView;
            requiredAltChoiceOptionSelectorView2.setVisibility(8);
            return;
        }
        String str = saj0Var.a;
        listGroupHeaderComponent = requiredAltChoiceSelectorWithHeaderView.header;
        listGroupHeaderComponent.setVisibility(str != null ? 0 : 8);
        listGroupHeaderComponent.setTitle(str);
        requiredAltChoiceOptionSelectorView = requiredAltChoiceSelectorWithHeaderView.selectorView;
        requiredAltChoiceOptionSelectorView.setVisibility(0);
        requiredAltChoiceOptionSelectorView.updateRequirement(saj0Var);
    }

    @Override // defpackage.qaj0
    public final void applyTheme(ThemeType themeType) {
        this.a.applyTheme(themeType);
    }
}
