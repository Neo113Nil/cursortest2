package defpackage;

import androidx.fragment.app.o;
import androidx.fragment.app.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vf2 extends quj {
    public final /* synthetic */ wf2 h;

    public vf2(wf2 wf2Var) {
        this.h = wf2Var;
    }

    @Override // defpackage.quj
    public final void e0(y yVar, o oVar) {
        oVar.getClass();
        if (Intrinsics.d(oVar.getTag(), "DynamicOverlayFragment") || oVar.getClass().getSimpleName().equals("DynamicOverlayFragment")) {
            v3w.l("DynamicOverlayFragment detached: ", oVar.getTag(), 3, "AutoplayScreenObserver", null);
            wf2.a(this.h, m73.b);
        }
    }
}
