package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class two implements mxo {
    public static final apo i;
    public final u6k a;
    public float e;
    public final u6k b = new u6k(0);
    public final uoi c = new uoi();
    public final u6k d = new u6k(Integer.MAX_VALUE);
    public final hq7 f = new hq7(new ybg(29, this));
    public final zx7 g = szf.U(new swo(this, 1));
    public final zx7 h = szf.U(new swo(this, 0));

    static {
        epo epoVar = epo.w;
        dpo dpoVar = dpo.E;
        apo apoVar = bpo.a;
        i = new apo(0, epoVar, dpoVar);
    }

    public two(int i2) {
        this.a = new u6k(i2);
    }

    @Override // defpackage.mxo
    public final Object a(hqi hqiVar, Function2 function2, Continuation continuation) {
        Object a = this.f.a(hqiVar, function2, continuation);
        return a == nm6.a ? a : Unit.a;
    }

    @Override // defpackage.mxo
    public final boolean b() {
        return this.f.b();
    }

    @Override // defpackage.mxo
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final boolean d() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final float e(float f) {
        return this.f.e(f);
    }
}
