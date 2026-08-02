package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class dp9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ uo9 s;
    public final /* synthetic */ xzb t;
    public final /* synthetic */ b2s u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp9(uo9 uo9Var, xzb xzbVar, b2s b2sVar, int i) {
        super(1);
        this.r = i;
        this.s = uo9Var;
        this.t = xzbVar;
        this.u = b2sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                uo9 uo9Var = this.s;
                szb szbVar = uo9Var.c;
                if (szbVar == null) {
                    szbVar = uo9Var.m;
                }
                szb szbVar2 = uo9Var.d;
                Integer num = null;
                xzb xzbVar = this.t;
                Long l = szbVar2 != null ? (Long) szbVar2.a(xzbVar) : null;
                ny9 z = zsd.z((e09) szbVar.a(xzbVar));
                b2s b2sVar = this.u;
                b2sVar.setActiveTypefaceType(z);
                if (l != null) {
                    long longValue = l.longValue();
                    long j = longValue >> 31;
                    num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                }
                b2sVar.setActiveTypefaceWeight(num);
                break;
            default:
                uo9 uo9Var2 = this.s;
                szb szbVar3 = uo9Var2.p;
                if (szbVar3 == null) {
                    szbVar3 = uo9Var2.m;
                }
                szb szbVar4 = uo9Var2.q;
                Integer num2 = null;
                xzb xzbVar2 = this.t;
                Long l2 = szbVar4 != null ? (Long) szbVar4.a(xzbVar2) : null;
                ny9 z2 = zsd.z((e09) szbVar3.a(xzbVar2));
                b2s b2sVar2 = this.u;
                b2sVar2.setInactiveTypefaceType(z2);
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    long j2 = longValue2 >> 31;
                    num2 = Integer.valueOf((j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                }
                b2sVar2.setInactiveTypefaceWeight(num2);
                break;
        }
        return Unit.a;
    }
}
