package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class eh3 extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ int s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ yci u;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh3(jg7 jg7Var, jg7 jg7Var2, int i, boolean z, yci yciVar, int i2) {
        super(2);
        this.w = jg7Var;
        this.x = jg7Var2;
        this.s = i;
        this.t = z;
        this.u = yciVar;
        this.v = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                g40 g40Var = (g40) this.w;
                wn5 wn5Var = (wn5) this.x;
                bg3.a(this.u, g40Var, this.t, wn5Var, (hq5) obj, rvf.R(this.s | 1), this.v);
                break;
            case 1:
                ((Number) obj2).intValue();
                jg7 jg7Var = (jg7) this.w;
                jg7 jg7Var2 = (jg7) this.x;
                lf7.f(jg7Var, jg7Var2, this.s, this.t, this.u, (hq5) obj, rvf.R(this.v | 1));
                break;
            default:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) this.w;
                Function2 function2 = (Function2) this.x;
                aae.a(function0, this.u, this.t, function2, (hq5) obj, rvf.R(this.s | 1), this.v);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh3(yci yciVar, g40 g40Var, boolean z, wn5 wn5Var, int i, int i2) {
        super(2);
        this.u = yciVar;
        this.w = g40Var;
        this.t = z;
        this.x = wn5Var;
        this.s = i;
        this.v = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh3(Function0 function0, yci yciVar, boolean z, Function2 function2, int i, int i2) {
        super(2);
        this.w = function0;
        this.u = yciVar;
        this.t = z;
        this.x = function2;
        this.s = i;
        this.v = i2;
    }
}
