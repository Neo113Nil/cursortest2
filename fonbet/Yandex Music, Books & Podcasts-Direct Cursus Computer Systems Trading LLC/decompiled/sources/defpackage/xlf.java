package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xlf extends aur implements uyc {
    public /* synthetic */ lwu j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public /* synthetic */ boolean m;
    public /* synthetic */ boolean n;
    public final /* synthetic */ ylf o;
    public final /* synthetic */ v5v p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlf(ylf ylfVar, v5v v5vVar, Continuation continuation) {
        super(6, continuation);
        this.o = ylfVar;
        this.p = v5vVar;
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        boolean booleanValue3 = ((Boolean) obj4).booleanValue();
        boolean booleanValue4 = ((Boolean) obj5).booleanValue();
        xlf xlfVar = new xlf(this.o, this.p, (Continuation) obj6);
        xlfVar.j = (lwu) obj;
        xlfVar.k = booleanValue;
        xlfVar.l = booleanValue2;
        xlfVar.m = booleanValue3;
        xlfVar.n = booleanValue4;
        return xlfVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lwu lwuVar = this.j;
        boolean z = this.k;
        boolean z2 = this.l;
        boolean z3 = this.m;
        boolean z4 = this.n;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        ylf ylfVar = this.o;
        o6c o6cVar = ylfVar.l;
        boolean z5 = this.p.a;
        zjf zjfVar = ylfVar.k;
        o6cVar.getClass();
        return o6c.L(lwuVar, z, z2, z3, z4, z5, zjfVar);
    }
}
