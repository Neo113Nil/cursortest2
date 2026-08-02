package ru.yandex.taxi.plaque.widgets;

import android.content.Context;
import android.widget.LinearLayout;
import defpackage.bg20;
import defpackage.evu0;
import defpackage.hf20;
import defpackage.jl40;
import defpackage.lhc;
import defpackage.mqg0;
import defpackage.o151;
import defpackage.wfz;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/plaque/widgets/BalanceMicroWidgetView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "createTitleView", "()Lru/yandex/taxi/widget/RobotoTextView;", "createBalanceView", "createSubtitleView", "", "widgetGravity", "Lzy11;", "applyGravity", "(I)V", "view", "Lbg20;", "textModel", "applyText", "(Lru/yandex/taxi/widget/RobotoTextView;Lbg20;)V", "Lhf20;", "model", "updateModel", "(Lhf20;)V", "Lhf20;", "titleView", "Lru/yandex/taxi/widget/RobotoTextView;", "balanceView", "subtitleView", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalanceMicroWidgetView extends LinearLayout {
    private final RobotoTextView balanceView;
    private hf20 model;
    private final RobotoTextView subtitleView;
    private final RobotoTextView titleView;

    public BalanceMicroWidgetView(Context context) {
        super(context);
        RobotoTextView createTitleView = createTitleView();
        this.titleView = createTitleView;
        RobotoTextView createBalanceView = createBalanceView();
        this.balanceView = createBalanceView;
        RobotoTextView createSubtitleView = createSubtitleView();
        this.subtitleView = createSubtitleView;
        setTransitionName("plaque_balance_widget_group_transition_name");
        setImportantForAccessibility(1);
        setOrientation(1);
        addView(createTitleView);
        addView(createBalanceView);
        addView(createSubtitleView);
        setClipChildren(false);
        setClipToPadding(false);
    }

    private final void applyGravity(int widgetGravity) {
        setGravity(widgetGravity);
        this.titleView.setGravity(widgetGravity);
        this.balanceView.setGravity(widgetGravity);
        this.subtitleView.setGravity(widgetGravity);
    }

    private final void applyText(RobotoTextView view, bg20 textModel) {
        if (textModel != null) {
            CharSequence charSequence = textModel.a;
            if (!evu0.J(charSequence)) {
                view.setVisibility(0);
                view.setText(charSequence);
                return;
            }
        }
        view.setVisibility(8);
    }

    private final RobotoTextView createBalanceView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setTransitionName("plaque_balance_widget_balance_transition_name");
        robotoTextView.setImportantForAccessibility(2);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        robotoTextView.setTextColor(robotoTextView.getContext().getColor(mqg0.component_white));
        return robotoTextView;
    }

    private final RobotoTextView createSubtitleView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setTransitionName("plaque_balance_widget_subtitle_transition_name");
        robotoTextView.setImportantForAccessibility(2);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        robotoTextView.setVisibility(8);
        robotoTextView.setTextColor(lhc.f(robotoTextView.getContext().getColor(mqg0.component_white), Math.abs((int) (255.0f * 0.6f)) & 255));
        return robotoTextView;
    }

    private final RobotoTextView createTitleView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setTransitionName("plaque_balance_widget_title_transition_name");
        robotoTextView.setImportantForAccessibility(2);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        robotoTextView.setVisibility(8);
        robotoTextView.setTextColor(robotoTextView.getContext().getColor(mqg0.component_white));
        return robotoTextView;
    }

    public final void updateModel(hf20 model) {
        if (jl40.l(this.model, model)) {
            return;
        }
        RobotoTextView robotoTextView = this.titleView;
        bg20 bg20Var = model.g;
        o151 o151Var = model.e;
        applyText(robotoTextView, bg20Var);
        applyText(this.balanceView, model.f);
        applyText(this.subtitleView, model.h);
        applyGravity(o151Var.c);
        wfz.b(this, o151Var.a);
        wfz.a(this, model.d, "android.widget.Button");
        this.model = model;
    }
}
