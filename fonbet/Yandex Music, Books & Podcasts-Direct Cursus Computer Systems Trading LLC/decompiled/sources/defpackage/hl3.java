package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hl3 extends uif implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ syc B;
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ o0k w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl3(Function0 function0, yci yciVar, boolean z, lk7 lk7Var, dup dupVar, kk7 kk7Var, o0k o0kVar, pyc pycVar, int i, int i2) {
        super(2);
        this.r = 1;
        this.s = function0;
        this.t = yciVar;
        this.u = z;
        this.z = lk7Var;
        this.v = dupVar;
        this.A = kk7Var;
        this.w = o0kVar;
        this.B = pycVar;
        this.x = i;
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) this.s;
                dup dupVar = (dup) this.v;
                zk3 zk3Var = (zk3) this.z;
                fl3 fl3Var = (fl3) this.A;
                wn5 wn5Var = (wn5) this.B;
                qld.d(function0, this.t, this.u, dupVar, zk3Var, fl3Var, this.w, wn5Var, (hq5) obj, rvf.R(this.x | 1), this.y);
                break;
            case 1:
                ((Number) obj2).intValue();
                Function0 function02 = (Function0) this.s;
                lk7 lk7Var = (lk7) this.z;
                dup dupVar2 = (dup) this.v;
                kk7 kk7Var = (kk7) this.A;
                pyc pycVar = (pyc) this.B;
                xee.d(function02, this.t, this.u, lk7Var, dupVar2, kk7Var, this.w, pycVar, (hq5) obj, rvf.R(this.x | 1), this.y);
                break;
            case 2:
                ((Number) obj2).intValue();
                fvf fvfVar = (fvf) this.s;
                ox0 ox0Var = (ox0) this.v;
                gz2 gz2Var = (gz2) this.z;
                jic jicVar = (jic) this.A;
                Function1 function1 = (Function1) this.B;
                weo.g(this.t, fvfVar, this.w, ox0Var, gz2Var, jicVar, this.u, function1, (hq5) obj, rvf.R(this.x | 1), this.y);
                break;
            default:
                ((Number) obj2).intValue();
                fvf fvfVar2 = (fvf) this.s;
                mx0 mx0Var = (mx0) this.v;
                hz2 hz2Var = (hz2) this.z;
                jic jicVar2 = (jic) this.A;
                Function1 function12 = (Function1) this.B;
                weo.h(this.t, fvfVar2, this.w, mx0Var, hz2Var, jicVar2, this.u, function12, (hq5) obj, rvf.R(this.x | 1), this.y);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl3(yci yciVar, fvf fvfVar, o0k o0kVar, Object obj, Object obj2, jic jicVar, boolean z, Function1 function1, int i, int i2, int i3) {
        super(2);
        this.r = i3;
        this.t = yciVar;
        this.s = fvfVar;
        this.w = o0kVar;
        this.v = obj;
        this.z = obj2;
        this.A = jicVar;
        this.u = z;
        this.B = function1;
        this.x = i;
        this.y = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl3(Function0 function0, yci yciVar, boolean z, dup dupVar, zk3 zk3Var, fl3 fl3Var, o0k o0kVar, wn5 wn5Var, int i, int i2) {
        super(2);
        this.r = 0;
        this.s = function0;
        this.t = yciVar;
        this.u = z;
        this.v = dupVar;
        this.z = zk3Var;
        this.A = fl3Var;
        this.w = o0kVar;
        this.B = wn5Var;
        this.x = i;
        this.y = i2;
    }
}
