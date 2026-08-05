package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gt {
    public final p70 qoPGr6Ce = new p70(0);
    public final p70 NCTxEWno = new p70(0);

    public static gt NCTxEWno(ArrayList arrayList) {
        gt gtVar = new gt();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                m1.lDXGDhIF(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            gtVar.NCTxEWno.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            ht htVar = new ht();
            htVar.wxUZMvaN = 0;
            htVar.VgvYg0wo = 1;
            htVar.qoPGr6Ce = startDelay;
            htVar.NCTxEWno = duration;
            htVar.MdtA4re8 = interpolator;
            htVar.wxUZMvaN = objectAnimator.getRepeatCount();
            htVar.VgvYg0wo = objectAnimator.getRepeatMode();
            gtVar.qoPGr6Ce.put(propertyName, htVar);
        }
        return gtVar;
    }

    public static gt qoPGr6Ce(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return NCTxEWno(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return NCTxEWno(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gt) {
            return this.qoPGr6Ce.equals(((gt) obj).qoPGr6Ce);
        }
        return false;
    }

    public final int hashCode() {
        return this.qoPGr6Ce.hashCode();
    }

    public final String toString() {
        return "\n" + gt.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.qoPGr6Ce + "}\n";
    }
}
