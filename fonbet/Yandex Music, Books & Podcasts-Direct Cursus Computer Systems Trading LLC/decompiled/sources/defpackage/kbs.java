package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kbs implements mxo {
    public final /* synthetic */ mxo a;
    public final zx7 b;
    public final zx7 c;

    public kbs(mxo mxoVar, lbs lbsVar) {
        this.a = mxoVar;
        this.b = szf.U(new jbs(lbsVar, 1));
        this.c = szf.U(new jbs(lbsVar, 0));
    }

    @Override // defpackage.mxo
    public final Object a(hqi hqiVar, Function2 function2, Continuation continuation) {
        return this.a.a(hqiVar, function2, continuation);
    }

    @Override // defpackage.mxo
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.mxo
    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final float e(float f) {
        return this.a.e(f);
    }
}
