package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class xzk extends aur implements Function1 {
    public final /* synthetic */ int j = 0;
    public int k;
    public final /* synthetic */ yzk l;
    public final /* synthetic */ azk m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzk(azk azkVar, yzk yzkVar, String str, Continuation continuation) {
        super(1, continuation);
        this.m = azkVar;
        this.l = yzkVar;
        this.n = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new xzk(this.m, this.l, this.n, continuation);
            default:
                return new xzk(this.l, this.m, this.n, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((xzk) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                azk azkVar = this.m;
                u51 u51Var = azkVar.a;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    Function1 function1 = azkVar.c;
                    this.k = 1;
                    obj = function1.invoke(this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list = (List) obj;
                if (list == null) {
                    kac.f("track list is null!");
                    return null;
                }
                yzk yzkVar = this.l;
                yzkVar.f(u51Var, list);
                return yzkVar.b(u51Var, list, this.n);
            default:
                u51 u51Var2 = this.m.a;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                yzk yzkVar2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    String str = u51Var2.a;
                    this.k = 1;
                    obj = yzk.a(yzkVar2, str, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                i21 i21Var = (i21) obj;
                if (i21Var == null) {
                    kac.f("artistBriefInfo is null!");
                    return null;
                }
                List list2 = i21Var.g;
                yzkVar2.f(u51Var2, list2);
                return yzkVar2.b(u51Var2, list2, this.n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzk(yzk yzkVar, azk azkVar, String str, Continuation continuation) {
        super(1, continuation);
        this.l = yzkVar;
        this.m = azkVar;
        this.n = str;
    }
}
