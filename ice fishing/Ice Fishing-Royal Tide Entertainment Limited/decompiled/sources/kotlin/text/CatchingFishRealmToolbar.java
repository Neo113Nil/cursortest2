package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishRealmToolbar {
    public final CatchingFishGraphQLRealmFAB CatchingFishParcelableFAB = new CatchingFishGraphQLRealmFAB(0);
    public final CatchingFishGraphQLRealmFAB CatchingFishSnackbar = new CatchingFishGraphQLRealmFAB(0);

    public static CatchingFishRealmToolbar CatchingFishParcelableFAB(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return CatchingFishSnackbar(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return CatchingFishSnackbar(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    public static CatchingFishRealmToolbar CatchingFishSnackbar(ArrayList arrayList) {
        CatchingFishRealmToolbar catchingFishRealmToolbar = new CatchingFishRealmToolbar();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            catchingFishRealmToolbar.CatchingFishSnackbar.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            CatchingFishMVVMMVI catchingFishMVVMMVI = new CatchingFishMVVMMVI();
            catchingFishMVVMMVI.CatchingFishReduxKtor = 0;
            catchingFishMVVMMVI.CatchingFishDaggerWebsocket = 1;
            catchingFishMVVMMVI.CatchingFishParcelableFAB = startDelay;
            catchingFishMVVMMVI.CatchingFishSnackbar = duration;
            catchingFishMVVMMVI.CatchingFishCoroutine = interpolator;
            catchingFishMVVMMVI.CatchingFishReduxKtor = objectAnimator.getRepeatCount();
            catchingFishMVVMMVI.CatchingFishDaggerWebsocket = objectAnimator.getRepeatMode();
            catchingFishRealmToolbar.CatchingFishParcelableFAB.put(propertyName, catchingFishMVVMMVI);
        }
        return catchingFishRealmToolbar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatchingFishRealmToolbar) {
            return this.CatchingFishParcelableFAB.equals(((CatchingFishRealmToolbar) obj).CatchingFishParcelableFAB);
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode();
    }

    public final String toString() {
        return "\n" + CatchingFishRealmToolbar.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.CatchingFishParcelableFAB + "}\n";
    }
}
