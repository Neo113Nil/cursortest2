package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r6o extends aur implements uyc {
    public final /* synthetic */ int j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public /* synthetic */ boolean m;
    public /* synthetic */ boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6o(Object obj, Continuation continuation, int i) {
        super(6, continuation);
        this.j = i;
        this.p = obj;
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = this.j;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                boolean booleanValue4 = ((Boolean) obj4).booleanValue();
                r6o r6oVar = new r6o((s6o) this.p, (Continuation) obj6, 0);
                r6oVar.k = booleanValue;
                r6oVar.l = booleanValue2;
                r6oVar.m = booleanValue3;
                r6oVar.n = booleanValue4;
                r6oVar.o = (e6l) obj5;
                return r6oVar.invokeSuspend(Unit.a);
            default:
                boolean booleanValue5 = ((Boolean) obj3).booleanValue();
                boolean booleanValue6 = ((Boolean) obj4).booleanValue();
                boolean booleanValue7 = ((Boolean) obj5).booleanValue();
                r6o r6oVar2 = new r6o((pqp) this.p, (Continuation) obj6, 1);
                r6oVar2.k = booleanValue;
                r6oVar2.o = (i7q) obj2;
                r6oVar2.l = booleanValue5;
                r6oVar2.m = booleanValue6;
                r6oVar2.n = booleanValue7;
                return r6oVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                boolean z = this.k;
                boolean z2 = this.l;
                boolean z3 = this.m;
                boolean z4 = this.n;
                e6l e6lVar = (e6l) this.o;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                e6lVar.getClass();
                return Boolean.valueOf(z && z2 && z3 && !z4 && Intrinsics.d(e6lVar, b6l.a));
            default:
                boolean z5 = this.k;
                i7q i7qVar = (i7q) this.o;
                boolean z6 = this.l;
                boolean z7 = this.m;
                boolean z8 = this.n;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                pqp pqpVar = (pqp) this.p;
                return new q53(z5, i7qVar, ((Boolean) pqpVar.E.getValue()).booleanValue(), z6, pqpVar.G().e, z7, ((Boolean) pqpVar.F.getValue()).booleanValue(), z8, ((Boolean) pqpVar.G.getValue()).booleanValue());
        }
    }
}
