package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.DefaultSpecialEffectsController;

/* loaded from: classes3.dex */
public final /* synthetic */ class DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SpecialEffectsController$FragmentStateManagerOperation f$0;
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect f$1;

    public /* synthetic */ DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda1(SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation, DefaultSpecialEffectsController.TransitionEffect transitionEffect, int i) {
        this.$r8$classId = i;
        this.f$0 = specialEffectsController$FragmentStateManagerOperation;
        this.f$1 = transitionEffect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.f$1;
        SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = this.f$0;
        switch (i) {
            case 0:
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Transition for operation " + specialEffectsController$FragmentStateManagerOperation + " has completed");
                }
                specialEffectsController$FragmentStateManagerOperation.completeEffect(transitionEffect);
                break;
            default:
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Transition for operation " + specialEffectsController$FragmentStateManagerOperation + " has completed");
                }
                specialEffectsController$FragmentStateManagerOperation.completeEffect(transitionEffect);
                break;
        }
    }
}
