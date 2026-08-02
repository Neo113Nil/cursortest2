package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

/* loaded from: classes.dex */
public final class un5 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public un5(nf6 nf6Var, Function0 function0, yci yciVar, Function1 function1, int i) {
        super(2);
        this.r = 1;
        this.t = nf6Var;
        this.u = function0;
        this.v = yciVar;
        this.w = (uif) function1;
        this.s = i;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                wn5 wn5Var = (wn5) this.t;
                wn5Var.h(this.u, this.v, this.w, (hq5) obj, rvf.R(this.s) | 1);
                break;
            case 1:
                ((Number) obj2).intValue();
                wdp.N((nf6) this.t, (Function0) this.u, (yci) this.v, (uif) this.w, (hq5) obj, rvf.R(this.s | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                pf6.c((ohm) this.t, (Function0) this.u, (df6) this.v, (uif) this.w, (hq5) obj, rvf.R(this.s | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                n7w.t((Function0) this.t, (yci) this.u, (euf) this.v, (Function2) this.w, (hq5) obj, rvf.R(1), this.s);
                break;
            case 4:
                ((Number) obj2).intValue();
                ywf.a((ma5) this.u, (udt) this.v, (ivp) this.w, (wn5) this.t, (hq5) obj, rvf.R(this.s | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                ixf.b((Function0) this.u, (tbi) this.v, (fk0) this.w, (wn5) this.t, (hq5) obj, rvf.R(this.s | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                cb0.j((String) this.t, (yg0) this.u, (SessionColor) this.v, (yci) this.w, (hq5) obj, rvf.R(this.s | 1));
                break;
            default:
                ((Number) obj2).intValue();
                pcg.j((yci) this.u, (ydp) this.v, (Function1) this.w, (wn5) this.t, (hq5) obj, rvf.R(this.s | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un5(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2);
        this.r = i2;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
        this.s = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public un5(ohm ohmVar, Function0 function0, df6 df6Var, Function1 function1, int i) {
        super(2);
        this.r = 2;
        this.t = ohmVar;
        this.u = function0;
        this.v = df6Var;
        this.w = (uif) function1;
        this.s = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un5(Object obj, Object obj2, Object obj3, wn5 wn5Var, int i, int i2) {
        super(2);
        this.r = i2;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
        this.t = wn5Var;
        this.s = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un5(Function0 function0, yci yciVar, euf eufVar, Function2 function2, int i, int i2) {
        super(2);
        this.r = 3;
        this.t = function0;
        this.u = yciVar;
        this.v = eufVar;
        this.w = function2;
        this.s = i2;
    }
}
