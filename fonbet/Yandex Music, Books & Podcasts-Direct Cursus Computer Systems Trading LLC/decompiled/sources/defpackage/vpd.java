package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class vpd implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vpd(y7p y7pVar, g6p g6pVar, int i, yci yciVar, int i2, int i3) {
        this.f = y7pVar;
        this.g = g6pVar;
        this.b = i;
        this.c = yciVar;
        this.d = i2;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                j66.r((String) this.f, (yci) this.c, (jzb) this.g, this.b, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                y5g.k((y7p) this.f, (g6p) this.g, this.b, (yci) this.c, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                zwf.p((w1w) this.f, this.b, (Function2) this.c, (pyc) this.g, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vpd(w1w w1wVar, int i, Function2 function2, pyc pycVar, int i2, int i3) {
        this.f = w1wVar;
        this.b = i;
        this.c = function2;
        this.g = pycVar;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ vpd(String str, yci yciVar, jzb jzbVar, int i, int i2, int i3) {
        this.f = str;
        this.c = yciVar;
        this.g = jzbVar;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }
}
