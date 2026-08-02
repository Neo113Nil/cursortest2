package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class dl3 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ uoi l;
    public final /* synthetic */ s2r m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl3(uoi uoiVar, s2r s2rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = uoiVar;
        this.m = s2rVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new dl3(this.l, this.m, continuation, 0);
            case 1:
                return new dl3(this.l, this.m, continuation, 1);
            case 2:
                return new dl3(this.l, this.m, continuation, 2);
            case 3:
                return new dl3(this.l, this.m, continuation, 3);
            default:
                return new dl3(this.l, this.m, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((dl3) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar = this.l.a;
                cl3 cl3Var = new cl3(this.m, 0);
                this.k = 1;
                x0qVar.collect(cl3Var, this);
                return nm6Var;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar2 = this.l.a;
                cl3 cl3Var2 = new cl3(this.m, 1);
                this.k = 1;
                x0qVar2.collect(cl3Var2, this);
                return nm6Var2;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar3 = this.l.a;
                cl3 cl3Var3 = new cl3(this.m, 2);
                this.k = 1;
                x0qVar3.collect(cl3Var3, this);
                return nm6Var3;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar4 = this.l.a;
                cl3 cl3Var4 = new cl3(this.m, 3);
                this.k = 1;
                x0qVar4.collect(cl3Var4, this);
                return nm6Var4;
            default:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar5 = this.l.a;
                cl3 cl3Var5 = new cl3(this.m, 4);
                this.k = 1;
                x0qVar5.collect(cl3Var5, this);
                return nm6Var5;
        }
    }
}
