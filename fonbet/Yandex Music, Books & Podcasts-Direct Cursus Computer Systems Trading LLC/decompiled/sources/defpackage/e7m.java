package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e7m implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wn5 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e7m(float f, ukd ukdVar, plv plvVar, boolean z, wn5 wn5Var, int i, int i2) {
        this.b = f;
        this.g = ukdVar;
        this.h = plvVar;
        this.c = z;
        this.d = wn5Var;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                y7g.d((Function0) this.g, (yci) this.h, this.c, this.b, this.d, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                p1g.k(this.b, (ukd) this.g, (plv) this.h, this.c, this.d, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ e7m(Function0 function0, yci yciVar, boolean z, float f, wn5 wn5Var, int i, int i2) {
        this.g = function0;
        this.h = yciVar;
        this.c = z;
        this.b = f;
        this.d = wn5Var;
        this.e = i;
        this.f = i2;
    }
}
