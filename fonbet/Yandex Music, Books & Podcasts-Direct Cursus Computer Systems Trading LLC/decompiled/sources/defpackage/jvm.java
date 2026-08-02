package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jvm extends uif implements Function1 {
    public final /* synthetic */ float r;
    public final /* synthetic */ gq4 s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvm(float f, gq4 gq4Var, int i) {
        super(1);
        this.r = f;
        this.s = gq4Var;
        this.t = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Float valueOf = Float.valueOf(this.r);
        gq4 gq4Var = this.s;
        oum oumVar = new oum(((Number) yhn.h(valueOf, gq4Var)).floatValue(), gq4Var, this.t);
        s9f[] s9fVarArr = wfp.a;
        xfp xfpVar = ufp.c;
        s9f s9fVar = wfp.a[1];
        xfpVar.getClass();
        ((jfp) obj).o(xfpVar, oumVar);
        return Unit.a;
    }
}
