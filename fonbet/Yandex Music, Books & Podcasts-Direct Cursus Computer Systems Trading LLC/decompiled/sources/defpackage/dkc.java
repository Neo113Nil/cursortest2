package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class dkc extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ float k;
    public int l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkc(int i, Continuation continuation) {
        super(3, continuation);
        this.j = 0;
        this.l = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                float floatValue = ((Number) obj2).floatValue();
                dkc dkcVar = new dkc(this.l, (Continuation) obj3);
                dkcVar.m = (List) obj;
                dkcVar.k = floatValue;
                return dkcVar.invokeSuspend(Unit.a);
            case 1:
                float floatValue2 = ((Number) obj).floatValue();
                int intValue = ((Number) obj2).intValue();
                dkc dkcVar2 = new dkc((lx7) this.m, (Continuation) obj3, 1);
                dkcVar2.k = floatValue2;
                dkcVar2.l = intValue;
                return dkcVar2.invokeSuspend(Unit.a);
            default:
                float floatValue3 = ((Number) obj2).floatValue();
                dkc dkcVar3 = new dkc((mct) this.m, (Continuation) obj3, 2);
                dkcVar3.k = floatValue3;
                return dkcVar3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                List list = (List) this.m;
                float f = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                int size = list.size();
                int i = this.l;
                return size < i ? CollectionsKt.h0(list, new Float(f)) : CollectionsKt.h0(CollectionsKt.r0(list, i - 1), new Float(f));
            case 1:
                lx7 lx7Var = (lx7) this.m;
                float f2 = this.k;
                int i2 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                float f3 = f2 + 1;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                return new Integer(eeh.b(lx7Var.getDensity() * zs4.b(lx7Var) * f3) + i2);
            default:
                float f4 = this.k;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    mct mctVar = (mct) this.m;
                    mctVar.getClass();
                    b9r b9rVar = mctVar.b;
                    this.k = f4;
                    this.l = 1;
                    if (kct.d(mctVar, f4, b9rVar, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dkc(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = obj;
    }
}
