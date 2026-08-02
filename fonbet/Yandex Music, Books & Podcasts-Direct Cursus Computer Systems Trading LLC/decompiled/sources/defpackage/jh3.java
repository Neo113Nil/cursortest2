package defpackage;

import android.view.ViewGroup;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class jh3 extends xci implements ih3 {
    public ViewGroup o;

    @Override // defpackage.ih3
    public final Object z(f8j f8jVar, ha0 ha0Var, cg6 cg6Var) {
        long S = f8jVar.S(0L);
        ynn ynnVar = (ynn) ha0Var.invoke();
        ynn l = ynnVar != null ? ynnVar.l(S) : null;
        if (l != null) {
            this.o.requestRectangleOnScreen(uwf.D(l), false);
        }
        return Unit.a;
    }
}
