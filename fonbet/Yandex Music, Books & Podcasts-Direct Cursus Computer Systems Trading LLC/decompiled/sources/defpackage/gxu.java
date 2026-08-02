package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class gxu extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ hxu l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gxu(hxu hxuVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = hxuVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new gxu(this.l, continuation, 0);
            case 1:
                return new gxu(this.l, continuation, 1);
            default:
                return new gxu(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((gxu) create(continuation)).invokeSuspend(Unit.a);
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
                hxu hxuVar = this.l;
                u4q u4qVar = (u4q) hxuVar.b;
                this.k = 1;
                Object g = hxu.g(hxuVar, u4qVar, this);
                return g == nm6Var ? nm6Var : g;
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
                hxu hxuVar2 = this.l;
                s4q s4qVar = (s4q) hxuVar2.b;
                this.k = 1;
                Object d = hxu.d(hxuVar2, s4qVar, this);
                return d == nm6Var2 ? nm6Var2 : d;
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
                hxu hxuVar3 = this.l;
                eu7 eu7Var = hxuVar3.a;
                v4v h = hxu.h(hxuVar3, (a5q) hxuVar3.b);
                this.k = 1;
                Object f = hxu.f(hxuVar3, eu7Var, h, this);
                return f == nm6Var3 ? nm6Var3 : f;
        }
    }
}
