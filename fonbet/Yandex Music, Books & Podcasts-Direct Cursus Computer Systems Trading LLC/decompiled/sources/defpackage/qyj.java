package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class qyj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ o0k d;
    public final /* synthetic */ wn5 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ qyj(Function0 function0, yci yciVar, o0k o0kVar, wn5 wn5Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = function0;
        this.c = yciVar;
        this.d = o0kVar;
        this.e = wn5Var;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                hdg.u(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                hdg.r(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
        }
        return Unit.a;
    }
}
