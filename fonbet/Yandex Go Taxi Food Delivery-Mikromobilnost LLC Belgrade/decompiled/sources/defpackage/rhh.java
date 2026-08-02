package defpackage;

import android.view.ViewGroup;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import ru.yandex.taxi.plaque.animation.transitions.BackgroundTransition;
import ru.yandex.taxi.plaque.animation.transitions.ScaleTransition;

/* loaded from: classes9.dex */
public class rhh implements lic0 {
    public static an50 b(ViewGroup viewGroup, int i) {
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        an50 an50Var = new an50(i, iArr);
        an50Var.b("plaque_icon_widget_transition_name");
        an50Var.b("plaque_text_widget_transition_name");
        an50Var.b("plaque_button_widget_transition_name");
        an50Var.b("plaque_balance_widget_balance_transition_name");
        an50Var.b("plaque_balance_widget_title_transition_name");
        an50Var.b("plaque_balance_widget_subtitle_transition_name");
        an50Var.b("plaque_switch_widget_toggle_transition_name");
        an50Var.b("plaque_switch_widget_text_transition_name");
        an50Var.b("plaque_group_widget_transition_name");
        an50Var.b("plaque_level_transition_name");
        an50Var.b("plaque_notification_count_transition_name");
        an50Var.b("plaque_notification_icon_transition_name");
        an50Var.b("plaque_notification_container_transition_name");
        return an50Var;
    }

    public final void a(ViewGroup viewGroup, long j, Transition.TransitionListener transitionListener) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.Z(b(viewGroup, 2));
        TransitionSet transitionSet2 = new TransitionSet();
        transitionSet2.d0(0);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.t();
        transitionSet2.Z(changeBounds);
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.b("plaque_icon_widget_transition_name");
        scaleTransition.b("plaque_text_widget_transition_name");
        scaleTransition.b("plaque_button_widget_transition_name");
        scaleTransition.b("plaque_balance_widget_balance_transition_name");
        scaleTransition.b("plaque_balance_widget_title_transition_name");
        scaleTransition.b("plaque_balance_widget_subtitle_transition_name");
        scaleTransition.b("plaque_switch_widget_toggle_transition_name");
        scaleTransition.b("plaque_switch_widget_text_transition_name");
        transitionSet2.Z(scaleTransition);
        BackgroundTransition backgroundTransition = new BackgroundTransition();
        backgroundTransition.b("plaque_container_transition_name");
        transitionSet2.Z(backgroundTransition);
        transitionSet.Z(transitionSet2);
        transitionSet.Z(b(viewGroup, 1));
        transitionSet.d0(1);
        transitionSet.P(j);
        if (transitionListener != null) {
            transitionSet.X(transitionListener);
        }
        TransitionManager.a(transitionSet, viewGroup);
    }
}
