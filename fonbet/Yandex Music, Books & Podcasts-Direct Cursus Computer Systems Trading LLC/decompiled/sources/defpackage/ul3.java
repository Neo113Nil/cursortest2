package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ul3 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ul3(Object obj, boolean z, long j, yci yciVar, int i) {
        this.e = obj;
        this.b = z;
        this.c = j;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                saf.r(this.b, (Function0) this.e, this.d, this.c, (hq5) obj, R);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                lg3.k(this.e, this.b, this.c, this.d, (hq5) obj, R2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ul3(boolean z, Function0 function0, yci yciVar, long j, int i) {
        this.b = z;
        this.e = function0;
        this.d = yciVar;
        this.c = j;
    }
}
