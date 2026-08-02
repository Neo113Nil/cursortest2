package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ig0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ syc s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ig0(nf6 nf6Var, Function0 function0, Function1 function1, int i) {
        super(2);
        this.r = 4;
        this.v = nf6Var;
        this.u = function0;
        this.s = (uif) function1;
        this.t = i;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                xv7.h((Function0) this.u, (z18) this.v, (wn5) this.s, (hq5) obj, rvf.R(this.t | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                qld.o((onj) this.u, (g40) this.v, (wn5) this.s, (hq5) obj, rvf.R(this.t | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                ksw.k((yci) this.u, (String) this.v, (Function1) this.s, (hq5) obj, rvf.R(this.t | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                wn5 wn5Var = (wn5) this.s;
                int R = rvf.R(this.t) | 1;
                wn5Var.g(this.u, this.v, (hq5) obj, R);
                break;
            case 4:
                ((Number) obj2).intValue();
                nf6 nf6Var = (nf6) this.v;
                Function0 function0 = (Function0) this.u;
                ?? r3 = (uif) this.s;
                wdp.N(nf6Var, function0, vci.a, r3, (hq5) obj, rvf.R(this.t | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                pf6.b((String) this.u, (df6) this.v, (uif) this.s, (hq5) obj, rvf.R(this.t | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                pf6.d((ohm) this.v, (Function0) this.u, (uif) this.s, (hq5) obj, rvf.R(this.t | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                u2x.q((cnr) this.u, (yci) this.v, (Function2) this.s, (hq5) obj, rvf.R(this.t | 1));
                break;
            default:
                ((Number) obj2).intValue();
                gds gdsVar = (gds) this.u;
                Object[] objArr = (Object[]) this.v;
                gdsVar.b(Arrays.copyOf(objArr, objArr.length), (Function1) this.s, (hq5) obj, rvf.R(this.t | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(wn5 wn5Var, Object obj, Object obj2, int i) {
        super(2);
        this.r = 3;
        this.s = wn5Var;
        this.u = obj;
        this.v = obj2;
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ig0(ohm ohmVar, Function0 function0, Function1 function1, int i) {
        super(2);
        this.r = 6;
        this.v = ohmVar;
        this.u = function0;
        this.s = (uif) function1;
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig0(Object obj, Object obj2, syc sycVar, int i, int i2) {
        super(2);
        this.r = i2;
        this.u = obj;
        this.v = obj2;
        this.s = sycVar;
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ig0(String str, df6 df6Var, Function0 function0, int i) {
        super(2);
        this.r = 5;
        this.u = str;
        this.v = df6Var;
        this.s = (uif) function0;
        this.t = i;
    }
}
