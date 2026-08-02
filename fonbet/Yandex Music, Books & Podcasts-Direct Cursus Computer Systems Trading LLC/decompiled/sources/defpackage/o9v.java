package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class o9v implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o9v(float f, float f2, yci yciVar, wn5 wn5Var, int i) {
        this.b = f;
        this.c = f2;
        this.d = yciVar;
        this.f = wn5Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(3457);
                ocg.i((b7v) this.f, this.d, this.b, this.c, (hq5) obj, R, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                wjv.f(this.b, this.c, this.d, (wn5) this.f, (hq5) obj, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o9v(b7v b7vVar, yci yciVar, float f, float f2, int i, int i2) {
        this.f = b7vVar;
        this.d = yciVar;
        this.b = f;
        this.c = f2;
        this.e = i2;
    }
}
