package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class l32 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l32(int i, yci yciVar, boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                leu.b(this.b, (Function1) this.d, this.c, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(385);
                up6.e((rx2) this.d, this.b, this.c, (hq5) obj, R2);
                break;
            default:
                yci yciVar = (yci) this.d;
                ((Integer) obj2).getClass();
                bzf.g(rvf.R(1), (hq5) obj, yciVar, this.b, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l32(rx2 rx2Var, boolean z, boolean z2, int i) {
        this.d = rx2Var;
        this.b = z;
        this.c = z2;
    }

    public /* synthetic */ l32(boolean z, Function1 function1, boolean z2, int i) {
        this.b = z;
        this.d = function1;
        this.c = z2;
    }
}
