package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class qtb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ qtb(int i, int i2, Function0 function0, yci yciVar, int i3) {
        this.a = 4;
        this.d = i;
        this.e = i2;
        this.b = function0;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(this.d | 1);
                tt0.d(this.b, this.c, (hq5) obj, R, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(this.d | 1);
                doi.a(this.b, this.c, (hq5) obj, R2, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(this.d | 1);
                y5g.M(this.b, this.c, (hq5) obj, R3, this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int R4 = rvf.R(this.d | 1);
                t7g.k(this.b, this.c, (hq5) obj, R4, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int R5 = rvf.R(1);
                ldg.h(this.d, this.e, this.b, this.c, (hq5) obj, R5);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qtb(Function0 function0, yci yciVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = function0;
        this.c = yciVar;
        this.d = i;
        this.e = i2;
    }
}
