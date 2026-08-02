package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class df1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ df1(Function0 function0, a8g a8gVar, yci yciVar, long j, int i) {
        this.a = 2;
        this.b = function0;
        this.e = a8gVar;
        this.c = yciVar;
        this.d = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(3073);
                vq2.b((nnk) this.e, this.b, this.c, this.d, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                lxe.i((cwk) this.e, this.b, this.c, this.d, (hq5) obj, R2);
                break;
            default:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(7);
                u7g.b(this.b, (a8g) this.e, this.c, this.d, (hq5) obj, R3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ df1(Object obj, Function0 function0, yci yciVar, long j, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = function0;
        this.c = yciVar;
        this.d = j;
    }
}
