package n3;

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

/* renamed from: n3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4771b {

    /* renamed from: a, reason: collision with root package name */
    public final k f39645a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f39646b = new k();

    public static C4771b a(Context context, int i) {
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

    public static C4771b b(ArrayList arrayList) {
        C4771b c4771b = new C4771b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c4771b.f39646b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC4770a.f39642b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC4770a.f39643c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC4770a.f39644d;
            }
            C4772c c4772c = new C4772c();
            c4772c.f39650d = 0;
            c4772c.f39651e = 1;
            c4772c.f39647a = startDelay;
            c4772c.f39648b = duration;
            c4772c.f39649c = interpolator;
            c4772c.f39650d = objectAnimator.getRepeatCount();
            c4772c.f39651e = objectAnimator.getRepeatMode();
            c4771b.f39645a.put(propertyName, c4772c);
        }
        return c4771b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4771b) {
            return this.f39645a.equals(((C4771b) obj).f39645a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39645a.hashCode();
    }

    public final String toString() {
        return "\n" + C4771b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f39645a + "}\n";
    }
}
