package defpackage;

import androidx.compose.ui.viewinterop.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rj0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(ttf ttfVar, Object obj, int i, Object obj2, int i2) {
        super(2);
        this.r = 2;
        this.u = ttfVar;
        this.v = obj;
        this.s = i;
        this.w = obj2;
        this.t = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                Function1 function1 = (Function1) this.u;
                a.a(rvf.R(this.s | 1), this.t, (hq5) obj, (yci) this.w, function1, (Function1) this.v);
                break;
            case 1:
                ((Number) obj2).intValue();
                vq2.c((ukd) this.u, (f40) this.v, (wn5) this.w, (hq5) obj, this.s | 1, this.t);
                break;
            case 2:
                ((Number) obj2).intValue();
                ttf ttfVar = (ttf) this.u;
                leu.y(ttfVar, this.v, this.s, this.w, (hq5) obj, rvf.R(this.t | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                buf bufVar = (buf) this.v;
                wn5 wn5Var = (wn5) this.w;
                ksw.x(this.u, this.s, bufVar, wn5Var, (hq5) obj, rvf.R(this.t | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                tyf.i((i1r) this.u, (yci) this.w, (pyc) this.v, (hq5) obj, rvf.R(this.s | 1), this.t);
                break;
            default:
                ((Number) obj2).intValue();
                String str = (String) this.u;
                ukd ukdVar = (ukd) this.v;
                fes fesVar = (fes) this.w;
                y1g.o(str, ukdVar, fesVar, this.s, (hq5) obj, this.t | 1);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(Object obj, int i, buf bufVar, wn5 wn5Var, int i2) {
        super(2);
        this.r = 3;
        this.u = obj;
        this.s = i;
        this.v = bufVar;
        this.w = wn5Var;
        this.t = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj0(Object obj, yci yciVar, syc sycVar, int i, int i2, int i3) {
        super(2);
        this.r = i3;
        this.u = obj;
        this.w = yciVar;
        this.v = sycVar;
        this.s = i;
        this.t = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj0(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        super(2);
        this.r = i3;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
        this.s = i;
        this.t = i2;
    }
}
