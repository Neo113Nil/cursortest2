package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.fragment.app.e;
import androidx.fragment.app.z;

/* loaded from: classes.dex */
public final class skh extends e {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skh(iot0 iot0Var, boolean z, boolean z2) {
        super(iot0Var);
        Fragment fragment = iot0Var.c;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State = iot0Var.a;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
        this.b = specialEffectsController$Operation$State == specialEffectsController$Operation$State2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.c = iot0Var.a == specialEffectsController$Operation$State2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.d = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final ges b() {
        Object obj = this.b;
        ges c = c(obj);
        Object obj2 = this.d;
        ges c2 = c(obj2);
        if (c == null || c2 == null || c == c2) {
            return c == null ? c2 : c;
        }
        vg10.l("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", this.a.c, " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
        return null;
    }

    public final ges c(Object obj) {
        if (obj == null) {
            return null;
        }
        z zVar = ees.a;
        if (zVar != null && zVar.g(obj)) {
            return zVar;
        }
        ges gesVar = ees.b;
        if (gesVar != null && gesVar.g(obj)) {
            return gesVar;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        yci0.q(sb, " for fragment ", this.a.c, " is not a valid framework Transition or AndroidX Transition");
        return null;
    }
}
