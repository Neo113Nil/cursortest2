package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class op0 extends uif implements Function2 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ yci s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ float v;
    public final /* synthetic */ wn5 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(long j, long j2, float f, o0k o0kVar, opv opvVar, yci yciVar, wn5 wn5Var, int i) {
        super(2);
        this.t = j;
        this.u = j2;
        this.v = f;
        this.y = o0kVar;
        this.z = opvVar;
        this.s = yciVar;
        this.w = wn5Var;
        this.x = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                o0k o0kVar = (o0k) this.y;
                opv opvVar = (opv) this.z;
                sp0.a(this.t, this.u, this.v, o0kVar, opvVar, this.s, this.w, (hq5) obj, rvf.R(this.x | 1));
                break;
            default:
                ((Number) obj2).intValue();
                Function2 function2 = (Function2) this.y;
                dup dupVar = (dup) this.z;
                l1r.a(this.s, function2, dupVar, this.t, this.u, this.v, this.w, (hq5) obj, rvf.R(this.x | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(yci yciVar, Function2 function2, dup dupVar, long j, long j2, float f, wn5 wn5Var, int i) {
        super(2);
        this.s = yciVar;
        this.y = function2;
        this.z = dupVar;
        this.t = j;
        this.u = j2;
        this.v = f;
        this.w = wn5Var;
        this.x = i;
    }
}
