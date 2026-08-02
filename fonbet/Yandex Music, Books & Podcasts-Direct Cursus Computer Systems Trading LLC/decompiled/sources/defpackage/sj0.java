package defpackage;

import androidx.compose.ui.viewinterop.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sj0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ syc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj0(yci yciVar, mx0 mx0Var, ox0 ox0Var, int i, pnc pncVar, wn5 wn5Var, int i2) {
        super(2);
        this.r = 3;
        this.s = yciVar;
        this.v = mx0Var;
        this.w = ox0Var;
        this.t = i;
        this.x = pncVar;
        this.y = wn5Var;
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                Function1 function1 = (Function1) this.v;
                Function1 function12 = (Function1) this.w;
                Function1 function13 = (Function1) this.x;
                Function1 function14 = (Function1) this.y;
                a.b(function1, this.s, function12, function13, function14, (hq5) obj, rvf.R(this.t | 1), this.u);
                break;
            case 1:
                ((Number) obj2).intValue();
                wdc wdcVar = (wdc) this.w;
                String str = (String) this.x;
                wn5 wn5Var = (wn5) this.y;
                tt0.g(this.v, this.s, wdcVar, str, wn5Var, (hq5) obj, rvf.R(this.t | 1), this.u);
                break;
            case 2:
                ((Number) obj2).intValue();
                d8t d8tVar = (d8t) this.w;
                wdc wdcVar2 = (wdc) this.x;
                Function1 function15 = (Function1) this.v;
                wn5 wn5Var2 = (wn5) this.y;
                tt0.f(d8tVar, this.s, wdcVar2, function15, wn5Var2, (hq5) obj, rvf.R(this.t | 1), this.u);
                break;
            case 3:
                ((Number) obj2).intValue();
                mx0 mx0Var = (mx0) this.v;
                ox0 ox0Var = (ox0) this.w;
                pnc pncVar = (pnc) this.x;
                wn5 wn5Var3 = (wn5) this.y;
                vq2.j(this.s, mx0Var, ox0Var, this.t, pncVar, wn5Var3, (hq5) obj, rvf.R(this.u | 1));
                break;
            default:
                ((Number) obj2).intValue();
                mx0 mx0Var2 = (mx0) this.v;
                ox0 ox0Var2 = (ox0) this.w;
                hz2 hz2Var = (hz2) this.x;
                wn5 wn5Var4 = (wn5) this.y;
                vq2.k(this.s, mx0Var2, ox0Var2, hz2Var, this.t, this.u, wn5Var4, (hq5) obj, rvf.R(1572865));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj0(yci yciVar, mx0 mx0Var, ox0 ox0Var, hz2 hz2Var, int i, int i2, wn5 wn5Var, int i3) {
        super(2);
        this.r = 4;
        this.s = yciVar;
        this.v = mx0Var;
        this.w = ox0Var;
        this.x = hz2Var;
        this.t = i;
        this.u = i2;
        this.y = wn5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj0(d8t d8tVar, yci yciVar, wdc wdcVar, Function1 function1, wn5 wn5Var, int i, int i2) {
        super(2);
        this.r = 2;
        this.w = d8tVar;
        this.s = yciVar;
        this.x = wdcVar;
        this.v = function1;
        this.y = wn5Var;
        this.t = i;
        this.u = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sj0(Object obj, yci yciVar, Object obj2, Object obj3, syc sycVar, int i, int i2, int i3) {
        super(2);
        this.r = i3;
        this.v = obj;
        this.s = yciVar;
        this.w = obj2;
        this.x = obj3;
        this.y = sycVar;
        this.t = i;
        this.u = i2;
    }
}
