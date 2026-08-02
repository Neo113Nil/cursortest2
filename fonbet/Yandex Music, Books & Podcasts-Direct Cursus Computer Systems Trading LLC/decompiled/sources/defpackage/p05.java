package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class p05 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ueo l;
    public final /* synthetic */ String m;
    public final /* synthetic */ um4 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p05(ueo ueoVar, Continuation continuation, String str, um4 um4Var, int i) {
        super(1, continuation);
        this.j = i;
        this.l = ueoVar;
        this.m = str;
        this.n = um4Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new p05(this.l, continuation, this.m, this.n, 0);
            case 1:
                return new p05(this.l, continuation, this.m, this.n, 1);
            default:
                return new p05(this.l, continuation, this.m, this.n, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((p05) create(continuation)).invokeSuspend(Unit.a);
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
                uxs Q = ((MainDatabase) this.l).Q();
                atn atnVar = new atn(this.m, this.n.j());
                this.k = 1;
                Object b = Q.b(atnVar, this);
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
                uxs Q2 = ((MainDatabase) this.l).Q();
                atn atnVar2 = new atn(this.m, this.n.j());
                this.k = 1;
                Object b2 = Q2.b(atnVar2, this);
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
                uxs Q3 = ((MainDatabase) this.l).Q();
                atn atnVar3 = new atn(this.m, this.n.j());
                this.k = 1;
                Object b3 = Q3.b(atnVar3, this);
                return b3 == nm6Var3 ? nm6Var3 : b3;
        }
    }
}
