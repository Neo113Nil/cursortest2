package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ft4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab0 b;
    public final /* synthetic */ iil c;
    public final /* synthetic */ sdr d;
    public final /* synthetic */ p9 e;
    public final /* synthetic */ st4 f;
    public final /* synthetic */ yci g;
    public final /* synthetic */ int h;

    public /* synthetic */ ft4(ab0 ab0Var, iil iilVar, sdr sdrVar, p9 p9Var, st4 st4Var, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = ab0Var;
        this.c = iilVar;
        this.d = sdrVar;
        this.e = p9Var;
        this.f = st4Var;
        this.g = yciVar;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                qt4.d(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                qt4.e(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
                break;
        }
        return Unit.a;
    }
}
