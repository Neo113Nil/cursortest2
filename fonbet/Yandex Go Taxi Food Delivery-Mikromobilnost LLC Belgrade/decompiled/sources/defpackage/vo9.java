package defpackage;

import android.view.View;
import androidx.transition.Transition;
import com.yandex.go.chargers.design.components.ChargersButtonsView;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class vo9 implements Transition.TransitionListener {
    public final List a;
    public final /* synthetic */ ChargersButtonsView b;

    public vo9(ChargersButtonsView chargersButtonsView, List list) {
        this.b = chargersButtonsView;
        this.a = list;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.b.updateButtonsTexts(this.a);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        h8 h8Var = new h8(3, this.b);
        while (h8Var.hasNext()) {
            View view = (View) h8Var.next();
            ButtonComponent buttonComponent = view instanceof ButtonComponent ? (ButtonComponent) view : null;
            if (buttonComponent != null) {
                buttonComponent.setText((CharSequence) null);
            }
        }
    }
}
