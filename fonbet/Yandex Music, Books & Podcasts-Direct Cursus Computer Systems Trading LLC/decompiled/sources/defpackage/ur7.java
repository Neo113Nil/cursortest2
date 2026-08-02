package defpackage;

import android.transition.Transition;
import androidx.fragment.app.f;
import androidx.fragment.app.f0;
import androidx.fragment.app.o;

/* loaded from: classes.dex */
public final class ur7 extends f {
    public final Object b;
    public final boolean c;
    public final Object d;

    public ur7(f0 f0Var, boolean z, boolean z2) {
        super(f0Var);
        o oVar = f0Var.c;
        this.b = f0Var.a == 2 ? z ? oVar.getReenterTransition() : oVar.getEnterTransition() : z ? oVar.getReturnTransition() : oVar.getExitTransition();
        this.c = f0Var.a == 2 ? z ? oVar.getAllowReturnTransitionOverlap() : oVar.getAllowEnterTransitionOverlap() : true;
        this.d = z2 ? z ? oVar.getSharedElementReturnTransition() : oVar.getSharedElementEnterTransition() : null;
    }

    public final bvc b() {
        Object obj = this.b;
        bvc c = c(obj);
        Object obj2 = this.d;
        bvc c2 = c(obj2);
        if (c == null || c2 == null || c == c2) {
            return c == null ? c2 : c;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final bvc c(Object obj) {
        if (obj == null) {
            return null;
        }
        avc avcVar = vuc.a;
        if (obj instanceof Transition) {
            return avcVar;
        }
        bvc bvcVar = vuc.b;
        if (bvcVar != null && bvcVar.g(obj)) {
            return bvcVar;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        o oVar = this.a.c;
        sb.append(" for fragment ");
        sb.append(oVar);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }
}
