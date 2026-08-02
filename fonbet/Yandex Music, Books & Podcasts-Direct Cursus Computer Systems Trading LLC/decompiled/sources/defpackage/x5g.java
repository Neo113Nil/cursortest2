package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class x5g extends uif implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Integer B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Integer E;
    public final /* synthetic */ uif F;
    public final /* synthetic */ int G;
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;
    public final /* synthetic */ yci u;
    public final /* synthetic */ yci v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Integer y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x5g(ArrayList arrayList, long j, long j2, yci yciVar, yci yciVar2, boolean z, boolean z2, Integer num, boolean z3, boolean z4, Integer num2, boolean z5, boolean z6, Integer num3, Function1 function1, int i) {
        super(2);
        this.r = arrayList;
        this.s = j;
        this.t = j2;
        this.u = yciVar;
        this.v = yciVar2;
        this.w = z;
        this.x = z2;
        this.y = num;
        this.z = z3;
        this.A = z4;
        this.B = num2;
        this.C = z5;
        this.D = z6;
        this.E = num3;
        this.F = (uif) function1;
        this.G = i;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.G | 1);
        y5g.a(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (hq5) obj, R);
        return Unit.a;
    }
}
