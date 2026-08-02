package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class kco extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ mco l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kco(mco mcoVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = mcoVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new kco(this.l, continuation, 0);
            case 1:
                return new kco(this.l, continuation, 1);
            default:
                return new kco(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((kco) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                vdr c = this.l.d.c();
                z0i z0iVar = new z0i(2, 19, null);
                this.k = 1;
                Object h0 = zsd.h0(c, z0iVar, this);
                return h0 == nm6Var ? nm6Var : h0;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = this.l.e;
                    z0i z0iVar2 = new z0i(2, 20, null);
                    this.k = 1;
                    if (zsd.h0(pjcVar, z0iVar2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
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
                vdr c2 = this.l.d.c();
                z0i z0iVar3 = new z0i(2, 21, null);
                this.k = 1;
                Object h02 = zsd.h0(c2, z0iVar3, this);
                return h02 == nm6Var3 ? nm6Var3 : h02;
        }
    }
}
