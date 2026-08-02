package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class qdd extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ jac l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdd(jac jacVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = jacVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new qdd(this.l, continuation, 0);
            default:
                return new qdd(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((qdd) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ced cedVar = (ced) this.l.e;
                    if (cedVar != null) {
                        this.k = 1;
                        mdg mdgVar = cedVar.a;
                        mdk stopPayload = cedVar.b().getPayloadFactory().getStopPayload();
                        stopPayload.getClass();
                        obj = cedVar.H(mdgVar, "pause", stopPayload, this);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                wdd wddVar = (wdd) obj;
                if (wddVar != null) {
                    z = wddVar.a;
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ced cedVar2 = (ced) this.l.e;
                    if (cedVar2 != null) {
                        this.k = 1;
                        obj = cedVar2.z(this);
                        if (obj == nm6Var2) {
                            return nm6Var2;
                        }
                    }
                    z2 = false;
                    return Boolean.valueOf(z2);
                }
                if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                wdd wddVar2 = (wdd) obj;
                if (wddVar2 != null) {
                    z2 = wddVar2.a;
                    return Boolean.valueOf(z2);
                }
                z2 = false;
                return Boolean.valueOf(z2);
        }
    }
}
