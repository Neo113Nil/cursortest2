package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class bd extends uif implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Integer C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Integer F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ long t;
    public final /* synthetic */ yci u;
    public final /* synthetic */ yci v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ List x;
    public final /* synthetic */ List y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bd(List list, long j, yci yciVar, yci yciVar2, boolean z, List list2, List list3, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, boolean z6, Integer num2, Function1 function1, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = list;
        this.t = j;
        this.u = yciVar;
        this.v = yciVar2;
        this.w = z;
        this.x = list2;
        this.y = list3;
        this.z = z2;
        this.A = z3;
        this.B = z4;
        this.C = num;
        this.D = z5;
        this.E = z6;
        this.F = num2;
        this.G = function1;
        this.H = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                ed.a(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, hq5Var, rvf.R(this.H | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                ed.a(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, hq5Var, rvf.R(this.H | 1));
                break;
            default:
                ((Number) obj2).intValue();
                ed.a(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, hq5Var, rvf.R(this.H | 1));
                break;
        }
        return Unit.a;
    }
}
