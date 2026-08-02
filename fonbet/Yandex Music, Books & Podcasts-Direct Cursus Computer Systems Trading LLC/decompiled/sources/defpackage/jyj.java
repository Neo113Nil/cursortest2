package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jyj extends uif implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ yci s;
    public final /* synthetic */ int t;
    public final /* synthetic */ float u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ wn5 w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyj(yci yciVar, Function2 function2, pyc pycVar, Function2 function22, Function2 function23, Function2 function24, boolean z, float f, Function1 function1, wn5 wn5Var, o0k o0kVar, int i) {
        super(2);
        this.s = yciVar;
        this.x = function2;
        this.B = pycVar;
        this.y = function22;
        this.z = function23;
        this.A = function24;
        this.v = z;
        this.u = f;
        this.C = function1;
        this.w = wn5Var;
        this.D = o0kVar;
        this.t = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                Function2 function2 = (Function2) this.x;
                pyc pycVar = (pyc) this.B;
                Function2 function22 = (Function2) this.y;
                Function2 function23 = (Function2) this.z;
                Function2 function24 = (Function2) this.A;
                Function1 function1 = (Function1) this.C;
                o0k o0kVar = (o0k) this.D;
                int R = rvf.R(this.t | 1);
                lyj.b(this.s, function2, pycVar, function22, function23, function24, this.v, this.u, function1, this.w, o0kVar, (hq5) obj, R);
                break;
            default:
                ((Number) obj2).intValue();
                o3k o3kVar = (o3k) this.x;
                q0k q0kVar = (q0k) this.y;
                d2k d2kVar = (d2k) this.z;
                gz2 gz2Var = (gz2) this.A;
                s1r s1rVar = (s1r) this.B;
                wxi wxiVar = (wxi) this.C;
                z1r z1rVar = (z1r) this.D;
                int R2 = rvf.R(221569);
                rvf.q(o3kVar, this.s, q0kVar, d2kVar, this.t, this.u, gz2Var, s1rVar, this.v, wxiVar, z1rVar, this.w, (hq5) obj, R2);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyj(o3k o3kVar, yci yciVar, q0k q0kVar, d2k d2kVar, int i, float f, gz2 gz2Var, s1r s1rVar, boolean z, wxi wxiVar, z1r z1rVar, wn5 wn5Var, int i2) {
        super(2);
        this.x = o3kVar;
        this.s = yciVar;
        this.y = q0kVar;
        this.z = d2kVar;
        this.t = i;
        this.u = f;
        this.A = gz2Var;
        this.B = s1rVar;
        this.v = z;
        this.C = wxiVar;
        this.D = z1rVar;
        this.w = wn5Var;
    }
}
