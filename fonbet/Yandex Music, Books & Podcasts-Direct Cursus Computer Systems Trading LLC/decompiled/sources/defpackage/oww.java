package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class oww implements rmd {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ vgr h;
    public final /* synthetic */ uww i;

    public oww(uww uwwVar, AtomicReference atomicReference, vgr vgrVar) {
        this.i = uwwVar;
        this.a = atomicReference;
        this.h = vgrVar;
    }

    @Override // defpackage.rmd
    public final void R(Bundle bundle) {
        tmd tmdVar = (tmd) this.a.get();
        y1g.G(tmdVar);
        uww uwwVar = this.i;
        uwwVar.getClass();
        wb5.c.getClass();
        tmdVar.b(new jxw(wb5.b, tmdVar)).h(new rww(uwwVar, this.h, true, tmdVar));
    }

    @Override // defpackage.rmd
    public final void p0(int i) {
    }
}
