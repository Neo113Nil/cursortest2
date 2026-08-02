package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class da3 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jic m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da3(jic jicVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = jicVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                da3 da3Var = new da3(this.m, continuation, 0);
                da3Var.l = obj;
                return da3Var;
            case 1:
                da3 da3Var2 = new da3(this.m, continuation, 1);
                da3Var2.l = obj;
                return da3Var2;
            case 2:
                da3 da3Var3 = new da3(this.m, continuation, 2);
                da3Var3.l = obj;
                return da3Var3;
            default:
                da3 da3Var4 = new da3(this.m, continuation, 3);
                da3Var4.l = obj;
                return da3Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rwo rwoVar = (rwo) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((da3) create(rwoVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                rwo rwoVar = (rwo) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (this.m.a(rwoVar, 0.0f, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                rwo rwoVar2 = (rwo) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (this.m.a(rwoVar2, 0.0f, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                rwo rwoVar3 = (rwo) this.l;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (this.m.a(rwoVar3, 0.0f, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                rwo rwoVar4 = (rwo) this.l;
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (this.m.a(rwoVar4, 0.0f, this) == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
