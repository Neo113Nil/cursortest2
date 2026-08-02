package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class xt4 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ long d;

    public /* synthetic */ xt4(Function0 function0, long j, yci yciVar, int i) {
        this.b = function0;
        this.d = j;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                cxb.d(rvf.R(1), this.d, (hq5) obj, this.c, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                u1g.o(rvf.R(1), this.d, (hq5) obj, this.c, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xt4(Function0 function0, yci yciVar, long j, int i) {
        this.b = function0;
        this.c = yciVar;
        this.d = j;
    }
}
