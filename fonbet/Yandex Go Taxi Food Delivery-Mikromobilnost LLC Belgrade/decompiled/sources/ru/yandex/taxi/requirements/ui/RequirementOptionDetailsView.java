package ru.yandex.taxi.requirements.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.dqe0;
import defpackage.g8e;
import defpackage.gjj0;
import defpackage.hjj0;
import defpackage.jfh0;
import defpackage.jmw0;
import defpackage.jrh0;
import defpackage.lmw0;
import defpackage.lx4;
import defpackage.oxe0;
import defpackage.p370;
import defpackage.phj0;
import defpackage.rhj0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.xcv0;
import defpackage.xmf0;
import defpackage.yvf0;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.requirements.modal.RequirementInfoModalView;
import ru.yandex.taxi.requirements.ui.selector.RequirementOptionsSelectView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u001c\u0010!\u001a\n  *\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/yandex/taxi/requirements/ui/RequirementOptionDetailsView;", "Landroid/widget/LinearLayout;", "Lgjj0;", "Landroid/content/Context;", "context", "Lyvf0;", "Lru/yandex/taxi/requirements/ui/selector/RequirementOptionsSelectView;", "itemViewFactory", "Lhjj0;", "presenter", "<init>", "(Landroid/content/Context;Lyvf0;Lhjj0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljmw0;", "requirement", "updateRequirement", "(Ljmw0;)V", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "showDescription", "(Ljava/lang/String;)V", "subtitle", "showTopSubtitle", "buttonText", "", "show", "showInfoButton", "(Ljava/lang/String;Z)V", "Lhjj0;", "kotlin.jvm.PlatformType", "selectorView", "Lru/yandex/taxi/requirements/ui/selector/RequirementOptionsSelectView;", "Lru/yandex/taxi/widget/RobotoTextView;", "subtitleView", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/widget/TextView;", "optionDescription", "Landroid/widget/TextView;", "Lru/yandex/taxi/design/ListItemComponent;", "infoIconView", "Lru/yandex/taxi/design/ListItemComponent;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementOptionDetailsView extends LinearLayout implements gjj0 {
    private final ListItemComponent infoIconView;
    private final TextView optionDescription;
    private final hjj0 presenter;
    private final RequirementOptionsSelectView selectorView;
    private final RobotoTextView subtitleView;

    public RequirementOptionDetailsView(Context context, yvf0 yvf0Var, hjj0 hjj0Var) {
        super(context);
        this.presenter = hjj0Var;
        RequirementOptionsSelectView requirementOptionsSelectView = (RequirementOptionsSelectView) yvf0Var.get();
        this.selectorView = requirementOptionsSelectView;
        c.q(this, jrh0.requirement_options_detail_view, true);
        int i = jfh0.options_selector_placeholder;
        WeakHashMap weakHashMap = b.a;
        c.w((View) rp31.d(this, i), requirementOptionsSelectView);
        setOrientation(1);
        this.subtitleView = (RobotoTextView) ((View) rp31.d(this, jfh0.options_subtitle));
        this.optionDescription = (TextView) ((View) rp31.d(this, jfh0.options_description));
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, jfh0.options_info_button));
        listItemComponent.setDebounceClickListener(new oxe0(29, hjj0Var));
        this.infoIconView = listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void infoIconView$lambda$0$infoButtonClicked(hjj0 hjj0Var) {
        String name;
        lmw0 lmw0Var = (lmw0) hjj0Var.A.getValue();
        if (lmw0Var == null || (name = lmw0Var.getName()) == null) {
            return;
        }
        p370 p370Var = hjj0Var.y;
        i d = ((j) ((lx4) p370Var.b)).d("Summary.Requirement.Details.InformationButtonTapped");
        String str = ((dqe0) p370Var.w).a.V;
        String str2 = ((dqe0) p370Var.w).a.O.a;
        d.a.put("vertical_id", str);
        d.a.put("requirement", name);
        d.a.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        d.m();
        p370 p370Var2 = hjj0Var.y;
        xcv0 xcv0Var = (xcv0) p370Var2.c;
        String str3 = ((dqe0) p370Var2.w).a.V;
        String str4 = ((dqe0) p370Var2.w).a.O.a;
        HashMap u = g8e.u("vertical_id", str3, "requirement", name);
        if (str4 != null) {
            u.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str4);
        }
        xcv0Var.a.a("Summary.Requirement.Details.Information.CardShown", u, 1, new HashMap());
        rhj0 rhj0Var = hjj0Var.B;
        if (rhj0Var != null) {
            phj0 phj0Var = hjj0Var.z;
            xmf0 xmf0Var = new xmf0(16, hjj0Var, name);
            phj0Var.getClass();
            RequirementInfoModalView requirementInfoModalView = new RequirementInfoModalView(phj0Var.a, rhj0Var);
            requirementInfoModalView.setOnDismissListener(new oxe0(28, xmf0Var));
            phj0Var.b.a().d(requirementInfoModalView);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        hjj0 hjj0Var = this.presenter;
        hjj0Var.Bg(this);
        tje.N(hjj0Var.Jg(), null, null, new RequirementOptionDetailsPresenter$attachView$1(hjj0Var, this, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.gjj0
    public void showDescription(String description) {
        this.optionDescription.setVisibility(description == null || description.length() == 0 ? 8 : 0);
        this.optionDescription.setText(description);
    }

    @Override // defpackage.gjj0
    public void showInfoButton(String buttonText, boolean show) {
        this.infoIconView.setVisibility(show ? 0 : 8);
        this.infoIconView.setTitle(buttonText);
    }

    @Override // defpackage.gjj0
    public void showTopSubtitle(String subtitle) {
        this.subtitleView.setText(subtitle);
        this.subtitleView.setVisibility(subtitle == null || subtitle.length() == 0 ? 8 : 0);
    }

    public final void updateRequirement(jmw0 requirement) {
        this.selectorView.updateRequirement(requirement);
        this.presenter.A.l(requirement);
    }
}
