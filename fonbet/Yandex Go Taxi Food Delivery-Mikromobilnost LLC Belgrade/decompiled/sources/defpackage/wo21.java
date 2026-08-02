package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class wo21 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo21 b;

    public /* synthetic */ wo21(xo21 xo21Var, int i) {
        this.a = i;
        this.b = xo21Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        xo21 xo21Var = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                mo21 mo21Var = (mo21) pair.getFirst();
                xo21Var.C = ((Boolean) pair.getSecond()).booleanValue();
                if (mo21Var != null) {
                    ((to21) xo21Var.Dg()).updateUserLocation(mo21Var);
                }
                if (!xo21Var.C) {
                    ((to21) xo21Var.Dg()).n0();
                    break;
                } else {
                    ((to21) xo21Var.Dg()).t0();
                    break;
                }
            default:
                ((to21) xo21Var.Dg()).updateAzimuth(((Number) obj).floatValue());
                break;
        }
        return zy11Var;
    }
}
