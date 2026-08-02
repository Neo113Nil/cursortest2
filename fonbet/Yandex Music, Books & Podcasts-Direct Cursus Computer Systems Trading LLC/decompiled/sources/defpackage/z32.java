package defpackage;

import android.graphics.Rect;
import android.transition.Fade;
import android.transition.TransitionSet;

/* loaded from: classes4.dex */
public final class z32 extends TransitionSet {
    public z32(Rect rect, boolean z) {
        setOrdering(1);
        addTransition(new Fade(2)).addTransition(new sb4(rect, z)).addTransition(new Fade(1));
    }
}
