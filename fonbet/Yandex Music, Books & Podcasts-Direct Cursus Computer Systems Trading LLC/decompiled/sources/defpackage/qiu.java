package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class qiu extends xci implements amd {
    public Object o;
    public pyc p;
    public final float q;
    public final Function0 r;
    public final long s;
    public final ynn t;
    public boolean u;
    public boolean v;
    public String w;
    public rar x;
    public rar y;

    public qiu(float f, long j, pyc pycVar, ynn ynnVar, Object obj, Function0 function0) {
        pycVar.getClass();
        this.o = obj;
        this.p = pycVar;
        this.q = f;
        this.r = function0;
        this.s = j;
        this.t = ynnVar;
        this.w = "";
    }

    @Override // defpackage.amd
    public final void G(f8j f8jVar) {
        if (this.v) {
            return;
        }
        rar rarVar = this.x;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.x = x97.y(G0(), null, null, new npt(f8jVar, this, continuation, 8), 3);
    }

    @Override // defpackage.xci
    public final void K0() {
        this.u = false;
        this.v = false;
    }

    @Override // defpackage.xci
    public final void L0() {
        rar rarVar = this.x;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.x = null;
        rar rarVar2 = this.y;
        if (rarVar2 != null) {
            rarVar2.g(null);
        }
        this.y = null;
        if (this.v) {
            this.p.invoke(Boolean.FALSE, this.w, this.o);
        }
    }
}
