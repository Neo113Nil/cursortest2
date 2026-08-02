package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hq7 implements mxo {
    public final Function1 a;
    public final gq7 b = new gq7(this);
    public final mqi c = new mqi();
    public final x6k d;
    public final x6k e;
    public final x6k f;

    public hq7(Function1 function1) {
        this.a = function1;
        Boolean bool = Boolean.FALSE;
        this.d = szf.g0(bool);
        this.e = szf.g0(bool);
        this.f = szf.g0(bool);
    }

    @Override // defpackage.mxo
    public final Object a(hqi hqiVar, Function2 function2, Continuation continuation) {
        Object Q = gld.Q(new j57(this, hqiVar, function2, (Continuation) null, 7), continuation);
        return Q == nm6.a ? Q : Unit.a;
    }

    @Override // defpackage.mxo
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
