package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ri0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri0(onj onjVar, boolean z, boolean z2) {
        super(1);
        this.r = 0;
        this.u = onjVar;
        this.s = z;
        this.t = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                jfp jfpVar = (jfp) obj;
                long a = ((onj) this.u).a();
                jfpVar.o(pep.c, new oep(this.s ? xrd.b : xrd.c, a, this.t ? nep.a : nep.c, (9223372034707292159L & a) != 9205357640488583168L));
                break;
            case 1:
                mg7 mg7Var = (mg7) obj;
                mg7Var.getClass();
                mg7Var.f = Boolean.valueOf(this.s);
                mg7Var.g = Boolean.valueOf(this.t);
                mg7Var.i = mg7Var.i;
                mg7Var.h = Integer.valueOf(((ug7) this.u).m);
                mg7Var.j = mg7Var.j;
                break;
            default:
                mg7 mg7Var2 = (mg7) obj;
                mg7Var2.getClass();
                mg7Var2.f = Boolean.valueOf(this.s);
                mg7Var2.g = Boolean.valueOf(this.t);
                xg7 xg7Var = (xg7) this.u;
                mg7Var2.i = xg7Var.i;
                mg7Var2.h = Integer.valueOf(xg7Var.n);
                mg7Var2.j = xg7Var.j;
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri0(int i, Object obj, boolean z, boolean z2) {
        super(1);
        this.r = i;
        this.s = z;
        this.t = z2;
        this.u = obj;
    }
}
