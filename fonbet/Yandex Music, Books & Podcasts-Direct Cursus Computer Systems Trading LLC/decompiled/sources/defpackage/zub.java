package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class zub extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ bvb l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zub(bvb bvbVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bvbVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new zub(this.l, continuation, 0);
            case 1:
                return new zub(this.l, continuation, 1);
            default:
                return new zub(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((zub) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vub vubVar = (vub) this.l.h.getValue();
                this.k = 1;
                Object b = vubVar.b(this);
                return b == nm6Var ? nm6Var : b;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vub vubVar2 = (vub) this.l.f.getValue();
                this.k = 1;
                Object b2 = vubVar2.b(this);
                return b2 == nm6Var2 ? nm6Var2 : b2;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vub vubVar3 = (vub) this.l.g.getValue();
                this.k = 1;
                Object b3 = vubVar3.b(this);
                return b3 == nm6Var3 ? nm6Var3 : b3;
        }
    }
}
