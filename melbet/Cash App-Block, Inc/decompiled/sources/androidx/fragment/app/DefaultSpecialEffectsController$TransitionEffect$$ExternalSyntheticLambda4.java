package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup) {
        this.f$1 = transitionEffect;
        this.f$2 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        switch (i) {
            case 0:
                FragmentTransitionImpl.getBoundsOnScreen((Rect) obj, (View) obj2);
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                viewGroup.getClass();
                Iterator it = ((DefaultSpecialEffectsController.TransitionEffect) obj2).transitionInfos.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).f866operation;
                    View view = specialEffectsController$FragmentStateManagerOperation.fragment.getView();
                    if (view != null) {
                        Fragment$5$$ExternalSyntheticOutline0._applyState(specialEffectsController$FragmentStateManagerOperation.finalState, view, viewGroup);
                    }
                }
                break;
        }
    }

    public /* synthetic */ DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4(FragmentTransitionImpl fragmentTransitionImpl, View view, Rect rect) {
        this.f$1 = view;
        this.f$2 = rect;
    }
}
