package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class cyq extends aur implements uyc {
    public /* synthetic */ boolean j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public /* synthetic */ boolean m;
    public /* synthetic */ int n;

    public cyq(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        boolean booleanValue4 = ((Boolean) obj4).booleanValue();
        int intValue = ((Number) obj5).intValue();
        cyq cyqVar = new cyq((Continuation) obj6);
        cyqVar.j = booleanValue;
        cyqVar.k = booleanValue2;
        cyqVar.l = booleanValue3;
        cyqVar.m = booleanValue4;
        cyqVar.n = intValue;
        return cyqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z = this.j;
        boolean z2 = this.k;
        boolean z3 = this.l;
        boolean z4 = this.m;
        int i = this.n;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        ssg.a(3, "SmartCacheRestrictionsInformerController", "autoCache=" + z2 + " bgLimits=" + z3 + " timeToShow=" + z4 + " noLaunch=" + i, null);
        return Boolean.valueOf(z || (z2 && z3 && z4 && i > 4));
    }
}
