package android.content.Context;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterLayerDrawableTurboEpicUltra7919 {
    public static final boolean FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(Build.DEVICE, "layoutlib");

    public static final FrostHunterOnAttachStateChangeListenerHyperionTitanSpark3229 FrostHunterAlphaAnimationNeoCosmos5761(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof FrostHunterOnAttachStateChangeListenerHyperionTitanSpark3229) {
                return (FrostHunterOnAttachStateChangeListenerHyperionTitanSpark3229) childAt;
            }
        }
        FrostHunterOnAttachStateChangeListenerHyperionTitanSpark3229 frostHunterOnAttachStateChangeListenerHyperionTitanSpark3229 = new FrostHunterOnAttachStateChangeListenerHyperionTitanSpark3229(viewGroup.getContext());
        viewGroup.addView(frostHunterOnAttachStateChangeListenerHyperionTitanSpark3229);
        return frostHunterOnAttachStateChangeListenerHyperionTitanSpark3229;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup FrostHunterConstraintSetCloneMasterUltraRogue2633(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterLightSensorForceFusion4241("Couldn't find a valid parent for ", view, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                return null;
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
