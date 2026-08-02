package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class fgo implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ syc i;

    public /* synthetic */ fgo(wn5 wn5Var, String str, yci yciVar, Function0 function0, long j, int i, int i2, int i3) {
        this.h = wn5Var;
        this.b = str;
        this.c = yciVar;
        this.i = function0;
        this.e = j;
        this.d = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                g0g.m((wn5) this.h, this.b, this.c, (Function0) this.i, this.e, this.d, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int R = rvf.R(12610561);
                q5g.n(this.b, this.c, (ges) this.h, (Function1) this.i, this.d, this.e, this.f, this.g, (hq5) obj, R);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fgo(String str, yci yciVar, ges gesVar, Function1 function1, int i, long j, int i2, int i3, int i4) {
        this.b = str;
        this.c = yciVar;
        this.h = gesVar;
        this.i = function1;
        this.d = i;
        this.e = j;
        this.f = i2;
        this.g = i3;
    }
}
