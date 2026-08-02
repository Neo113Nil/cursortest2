package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class byd implements ayd {
    public final wfm a;
    public final arf b;
    public final xdr c;

    public byd(wfm wfmVar, arf arfVar) {
        wfmVar.getClass();
        arfVar.getClass();
        this.a = wfmVar;
        this.b = arfVar;
        this.c = ydr.a(Boolean.FALSE);
    }

    public final Object a(boolean z, Continuation continuation) {
        Object a;
        Boolean valueOf = Boolean.valueOf(z);
        if (z == ((Boolean) this.c.getValue()).booleanValue()) {
            valueOf = null;
        }
        return (valueOf == null || (a = ((l63) this.b.getValue()).a(this.a, z, continuation)) != nm6.a) ? Unit.a : a;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        ssg.a(3, "HideableBlockState", vz1.p("setHidden[", this.a.a().a, "] = ", z), null);
        v3w.n(z, this.c, null);
    }
}
