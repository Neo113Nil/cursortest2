package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class obt implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qbt b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ obt(qbt qbtVar, yci yciVar, boolean z, int i, int i2) {
        this.a = i2;
        this.b = qbtVar;
        this.c = yciVar;
        this.d = z;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                this.b.h(rvf.R(this.e | 1), hq5Var, this.c, this.d);
                break;
            default:
                this.b.s(rvf.R(this.e | 1), hq5Var, this.c, this.d);
                break;
        }
        return Unit.a;
    }
}
