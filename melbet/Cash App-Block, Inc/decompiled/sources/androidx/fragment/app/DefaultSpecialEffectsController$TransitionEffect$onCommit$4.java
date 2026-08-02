package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.DefaultSpecialEffectsController;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class DefaultSpecialEffectsController$TransitionEffect$onCommit$4 extends Lambda implements Function0 {
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ Object $mergedTransition;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$TransitionEffect$onCommit$4(DefaultSpecialEffectsController.TransitionEffect transitionEffect, Object obj, ViewGroup viewGroup) {
        super(0);
        this.this$0 = transitionEffect;
        this.$mergedTransition = obj;
        this.$container = viewGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ViewGroup viewGroup = this.$container;
        Object obj = this.$mergedTransition;
        DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
        switch (i) {
            case 0:
                transitionEffect.transitionImpl.beginDelayedTransition(viewGroup, obj);
                break;
            default:
                ArrayList arrayList = transitionEffect.transitionInfos;
                FragmentTransitionImpl fragmentTransitionImpl = transitionEffect.transitionImpl;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((DefaultSpecialEffectsController.TransitionInfo) it.next()).f866operation.isSeeking) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            CancellationSignal cancellationSignal = new CancellationSignal();
                            fragmentTransitionImpl.setListenerForTransitionEnd(((DefaultSpecialEffectsController.TransitionInfo) arrayList.get(0)).f866operation.fragment, obj, cancellationSignal, new Fragment$$ExternalSyntheticLambda1(transitionEffect, 3));
                            cancellationSignal.cancel();
                            break;
                        }
                    }
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                Object obj2 = transitionEffect.controller;
                obj2.getClass();
                fragmentTransitionImpl.animateToStart(obj2, new DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4(transitionEffect, viewGroup));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$TransitionEffect$onCommit$4(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup, Object obj) {
        super(0);
        this.this$0 = transitionEffect;
        this.$container = viewGroup;
        this.$mergedTransition = obj;
    }
}
