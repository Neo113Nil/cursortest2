package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vcs extends uif implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ ges E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ CharSequence I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ yci s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ tqc v;
    public final /* synthetic */ long w;
    public final /* synthetic */ o9s x;
    public final /* synthetic */ long y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcs(mn0 mn0Var, yci yciVar, long j, long j2, tqc tqcVar, long j3, o9s o9sVar, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, ges gesVar, int i4, int i5, int i6) {
        super(2);
        this.I = mn0Var;
        this.s = yciVar;
        this.t = j;
        this.u = j2;
        this.v = tqcVar;
        this.w = j3;
        this.x = o9sVar;
        this.y = j4;
        this.z = i;
        this.A = z;
        this.B = i2;
        this.C = i3;
        this.J = map;
        this.D = function1;
        this.E = gesVar;
        this.F = i4;
        this.G = i5;
        this.H = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                xcs.b((String) this.I, this.s, this.t, this.u, this.v, this.w, (aas) this.J, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, hq5Var, rvf.R(this.F | 1), rvf.R(this.G), this.H);
                break;
            default:
                ((Number) obj2).intValue();
                xcs.c((mn0) this.I, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (Map) this.J, this.D, this.E, hq5Var, rvf.R(this.F | 1), rvf.R(this.G), this.H);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcs(String str, yci yciVar, long j, long j2, tqc tqcVar, long j3, aas aasVar, o9s o9sVar, long j4, int i, boolean z, int i2, int i3, Function1 function1, ges gesVar, int i4, int i5, int i6) {
        super(2);
        this.I = str;
        this.s = yciVar;
        this.t = j;
        this.u = j2;
        this.v = tqcVar;
        this.w = j3;
        this.J = aasVar;
        this.x = o9sVar;
        this.y = j4;
        this.z = i;
        this.A = z;
        this.B = i2;
        this.C = i3;
        this.D = function1;
        this.E = gesVar;
        this.F = i4;
        this.G = i5;
        this.H = i6;
    }
}
