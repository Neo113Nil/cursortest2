package v0;

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
import r.C0342j;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361b {

    /* renamed from: a, reason: collision with root package name */
    public final C0342j f4484a = new C0342j(0);

    /* renamed from: b, reason: collision with root package name */
    public final C0342j f4485b = new C0342j(0);

    public static C0361b a(Context context, int i) {
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
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static C0361b b(ArrayList arrayList) {
        C0361b c0361b = new C0361b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0361b.f4485b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0360a.f4481b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0360a.f4482c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0360a.f4483d;
            }
            C0362c c0362c = new C0362c();
            c0362c.f4489d = 0;
            c0362c.e = 1;
            c0362c.f4486a = startDelay;
            c0362c.f4487b = duration;
            c0362c.f4488c = interpolator;
            c0362c.f4489d = objectAnimator.getRepeatCount();
            c0362c.e = objectAnimator.getRepeatMode();
            c0361b.f4484a.put(propertyName, c0362c);
        }
        return c0361b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0361b) {
            return this.f4484a.equals(((C0361b) obj).f4484a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4484a.hashCode();
    }

    public final String toString() {
        return "\n" + C0361b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4484a + "}\n";
    }
}
