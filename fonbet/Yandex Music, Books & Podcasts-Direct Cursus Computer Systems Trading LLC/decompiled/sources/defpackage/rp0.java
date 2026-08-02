package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rp0 extends uif implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ yci s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ float v;
    public final /* synthetic */ Function2 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp0(wn5 wn5Var, yci yciVar, Function2 function2, pyc pycVar, long j, long j2, float f, int i, int i2) {
        super(2);
        this.z = wn5Var;
        this.s = yciVar;
        this.w = function2;
        this.A = pycVar;
        this.t = j;
        this.u = j2;
        this.v = f;
        this.x = i;
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                wn5 wn5Var = (wn5) this.z;
                pyc pycVar = (pyc) this.A;
                sp0.c(wn5Var, this.s, this.w, pycVar, this.t, this.u, this.v, (hq5) obj, rvf.R(this.x | 1), this.y);
                break;
            default:
                ((Number) obj2).intValue();
                dup dupVar = (dup) this.z;
                dd3 dd3Var = (dd3) this.A;
                q5g.k(this.s, dupVar, this.t, this.u, dd3Var, this.v, this.w, (hq5) obj, rvf.R(this.x | 1), this.y);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp0(yci yciVar, dup dupVar, long j, long j2, dd3 dd3Var, float f, Function2 function2, int i, int i2) {
        super(2);
        this.s = yciVar;
        this.z = dupVar;
        this.t = j;
        this.u = j2;
        this.A = dd3Var;
        this.v = f;
        this.w = function2;
        this.x = i;
        this.y = i2;
    }
}
