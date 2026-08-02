package ru.yandex.taxi.plaque.widgets;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.core.view.b;
import defpackage.cvu0;
import defpackage.d0k;
import defpackage.g0k;
import defpackage.jl40;
import defpackage.lzw0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.o151;
import defpackage.sqg0;
import defpackage.tje;
import defpackage.wf20;
import defpackage.xf20;
import kotlin.Metadata;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.plaque.utils.MicroWidgetsUtils$applyBackground$$inlined$doOnNextLayout$1;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004*\u0001\u001a\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/plaque/widgets/SwitchMicroWidgetView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "createTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/design/SwitchComponent;", "createSwitchView", "()Lru/yandex/taxi/design/SwitchComponent;", "", "widgetGravity", "Lzy11;", "applyGravity", "(I)V", "Lxf20;", "model", "updateModel", "(Lxf20;)V", "Lxf20;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "switchView", "Lru/yandex/taxi/design/SwitchComponent;", "lzw0", "switchAccessibilityDelegate", "Llzw0;", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwitchMicroWidgetView extends LinearLayout {
    private xf20 model;
    private final lzw0 switchAccessibilityDelegate;
    private final SwitchComponent switchView;
    private final RobotoTextView textView;

    public SwitchMicroWidgetView(Context context) {
        super(context);
        RobotoTextView createTextView = createTextView();
        this.textView = createTextView;
        SwitchComponent createSwitchView = createSwitchView();
        this.switchView = createSwitchView;
        lzw0 lzw0Var = new lzw0();
        lzw0Var.b = "";
        this.switchAccessibilityDelegate = lzw0Var;
        setOrientation(0);
        addView(createTextView);
        addView(createSwitchView);
        setTransitionName("plaque_switch_widget_group_transition_name");
        setImportantForAccessibility(1);
        b.p(this, lzw0Var);
        setClipChildren(false);
        setClipToPadding(false);
    }

    private final void applyGravity(int widgetGravity) {
        setGravity(widgetGravity);
        this.textView.setGravity(widgetGravity);
    }

    private final SwitchComponent createSwitchView() {
        SwitchComponent switchComponent = new SwitchComponent(getContext(), null, 0, 6, null);
        switchComponent.setTransitionName("plaque_switch_widget_toggle_transition_name");
        switchComponent.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(tje.r(mrg0.component_safe_switch_start_margin, switchComponent.getContext()));
        switchComponent.setLayoutParams(layoutParams);
        switchComponent.setTrackColor(sqg0.plaque_switch_micro_widget_checked);
        switchComponent.setUncheckedTrackColor(sqg0.plaque_switch_micro_widget_unchecked);
        return switchComponent;
    }

    private final RobotoTextView createTextView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setTransitionName("plaque_switch_widget_text_transition_name");
        robotoTextView.setImportantForAccessibility(2);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        robotoTextView.setMinWidth((int) tje.x(robotoTextView.getContext(), 76.0f));
        robotoTextView.setTextColor(robotoTextView.getContext().getColor(mqg0.component_white));
        return robotoTextView;
    }

    public final void updateModel(xf20 model) {
        if (jl40.l(this.model, model)) {
            return;
        }
        RobotoTextView robotoTextView = this.textView;
        wf20 wf20Var = model.e;
        o151 o151Var = model.d;
        boolean z = wf20Var.b;
        robotoTextView.setText(wf20Var.a.a);
        this.switchAccessibilityDelegate.b = cvu0.v(wf20Var.a.a.toString(), "\n", " ", false);
        this.switchView.setChecked(z);
        this.switchAccessibilityDelegate.a = z;
        applyGravity(o151Var.c);
        g0k g0kVar = o151Var.a;
        d0k d0kVar = g0kVar.a;
        setPaddingRelative((int) d0kVar.a, (int) d0kVar.b, (int) d0kVar.c, (int) d0kVar.d);
        addOnLayoutChangeListener(new MicroWidgetsUtils$applyBackground$$inlined$doOnNextLayout$1(this, g0kVar.b));
        this.model = model;
    }
}
