package l3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import s.k;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4662b {

    /* renamed from: a, reason: collision with root package name */
    public final k f38907a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f38908b = new k();

    public static C4662b a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e9) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e9);
            return null;
        }
    }

    public static C4662b b(ArrayList arrayList) {
        C4662b c4662b = new C4662b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c4662b.f38908b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC4661a.f38904b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC4661a.f38905c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC4661a.f38906d;
            }
            C4663c c4663c = new C4663c();
            c4663c.f38912d = 0;
            c4663c.f38913e = 1;
            c4663c.f38909a = startDelay;
            c4663c.f38910b = duration;
            c4663c.f38911c = interpolator;
            c4663c.f38912d = objectAnimator.getRepeatCount();
            c4663c.f38913e = objectAnimator.getRepeatMode();
            c4662b.f38907a.put(propertyName, c4663c);
        }
        return c4662b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4662b) {
            return this.f38907a.equals(((C4662b) obj).f38907a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38907a.hashCode();
    }

    public final String toString() {
        return "\n" + C4662b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f38907a + "}\n";
    }
}
