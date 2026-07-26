package android.content.Context;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBroadcastPrimePixel6628 {
    public static final ArrayList FrostHunterServiceEliteCelestialThunder1757 = new ArrayList();
    public WeakHashMap FrostHunterAlphaAnimationNeoCosmos5761;
    public WeakReference FrostHunterBundlePulseFusionHero2475;
    public SparseArray FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public final View FrostHunterAlphaAnimationNeoCosmos5761(View view) {
        int size;
        WeakHashMap weakHashMap = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(viewGroup.getChildAt(childCount));
                    if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
                        return FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
            }
        }
        return null;
    }
}
